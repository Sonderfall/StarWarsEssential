package com.starwars.app.client.pager.presenter.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Timer;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.backportal.event.BackPortalEvent;
import com.starwars.app.client.encyclopedia.event.HyperLinkClickEvent;
import com.starwars.app.client.encyclopedia.event.HyperLinkClickHandler;
import com.starwars.app.client.main.event.APResizeEvent;
import com.starwars.app.client.main.event.ChangeScreenEvent;
import com.starwars.app.client.main.event.ChangeScreenEvent.TypeChangeScreen;
import com.starwars.app.client.main.event.ChangeScreenHandler;
import com.starwars.app.client.main.event.PortalClickEvent.TypePortal;
import com.starwars.app.client.mct.ASyncCall;
import com.starwars.app.client.pager.event.NodePathEvent;
import com.starwars.app.client.pager.event.NodePathEvent.NodePathType;
import com.starwars.app.client.pager.event.PaperEvent;
import com.starwars.app.client.pager.event.PaperHandler;
import com.starwars.app.client.pager.presenter.AItem;
import com.starwars.app.client.pager.presenter.ColumnContainer;
import com.starwars.app.client.pager.presenter.ColumnContainer.ColumnMode;
import com.starwars.app.client.pager.presenter.ColumnDetail;
import com.starwars.app.client.pager.presenter.Pager;
import com.starwars.app.client.paper.presenter.ColumnImage;
import com.starwars.app.client.paper.presenter.Paper;
import com.starwars.app.client.research.event.DisplayResearchEvent;
import com.starwars.app.client.research.event.DisplayResearchHandler;
import com.starwars.app.shared.AppFactory;
import com.starwars.app.shared.AppInfo;
import com.starwars.app.shared.DataBase;
import com.starwars.app.shared.ElementInfo;
import com.starwars.app.shared.Info;
import com.starwars.app.shared.SectionInfo;
import com.starwars.app.shared.content.StarWarsContentDataBase;

public class PagerImpl extends BasePresenter<Pager.Display> implements
Pager {
	
	private final Provider<ColumnContainer> mProviderColumnContainer;
	private final Provider<ColumnDetail> mProviderColumnDetail;
	private final Provider<Paper> mProviderPaper;
	private final Provider<ColumnImage> mProviderColumnComment;

	private AppInfo mAppInfoClassic;
	private AppInfo mAppInfoLegends;
	private AppInfo mAppInfo;
	
	private boolean mMiddlePanelFullscreen;
	private ColumnContainer mColumnRoot;
	private ColumnContainer mLastColumn;
	private ColumnContainer mLastRight;

	private final Map<Info, ColumnContainer> mMapContainers;
	private final Map<Info, ColumnDetail> mMapDetails;
	private final Map<Info, ColumnContainer> mMapNextContainers;
	private final Map<ElementInfo, Paper> mMapPaper;
	private final Map<ElementInfo, ColumnImage> mMapImage;
	private final Map<String, Info> mMapTokenInfo;
	private ColumnImage mCColumnImage;
	
	private Paper mCPaper;
	private PagerMode mPagerMode;
	private boolean mResearchMode;
	private boolean mInitLegends;
	private boolean mInitClassic;

	private int mTop;
	
	private Info mCurrentInfo;
	private TypePortal mTypePortal;

	@Inject
	public PagerImpl(final EventBus eventBus,
			final Pager.Display display,
			Provider<ColumnDetail> iProviderColumnDetail,
			Provider<ColumnContainer> iProviderColumnContainer,
			Provider<Paper> iProviderPaper,
			Provider<ColumnImage> iProviderColumnComment) {
		super(eventBus, display);
		mProviderColumnDetail = iProviderColumnDetail;
		mProviderColumnContainer = iProviderColumnContainer;
		mProviderPaper = iProviderPaper;
		mProviderColumnComment = iProviderColumnComment;

		mMapContainers = new HashMap<Info, ColumnContainer>();
		mMapDetails = new HashMap<Info, ColumnDetail>();
		mMapNextContainers = new HashMap<Info, ColumnContainer>();
		mMapPaper = new HashMap<ElementInfo, Paper>();
		mMapImage = new HashMap<ElementInfo, ColumnImage>();
		mMapTokenInfo = new HashMap<String, Info>();
		
		mMiddlePanelFullscreen = false;
		display.setMiddlePanelReduce(false, null);

		mColumnRoot = mProviderColumnContainer.get();
		mLastColumn = null;
		mLastRight = null;
		mCurrentInfo = null;
		
		mResearchMode = false;
		mInitLegends = false;
		mInitClassic = false;
		
		History.addValueChangeHandler(new ValueChangeHandler<String>() {
			
			@Override
			public void onValueChange(ValueChangeEvent<String> event) {
				if (mPagerMode != PagerMode.portal) {
					clickFromHistory();
				}
			}
		});
				
		History.fireCurrentHistoryState();
	}

	@Override
	public void bind() {
		super.bind();

		registerHandler(display.getButtonMiddlePanel().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				ASyncCall<Void> lASyncCall = new ASyncCall<Void>() {
					
					@Override
					public void onSuccess(Void iObj) {
						APResizeEvent lAPResizeEvent = new APResizeEvent();
						eventBus.fireEvent(lAPResizeEvent);
						refresh();
					}
				};
				mMiddlePanelFullscreen = !mMiddlePanelFullscreen;
				if (mMiddlePanelFullscreen) {
					display.setMiddlePanelFullscreen(lASyncCall);
				} else {
					display.setMiddlePanelReduce(true, lASyncCall);
				}
				refresh();
			}
		}));

		registerHandler(eventBus.addHandler(ChangeScreenEvent.getType(), new ChangeScreenHandler() {

			@Override
			public void onChangeScreen(ChangeScreenEvent event) {
				changeScreen(event);
			}

		}));

		registerHandler(eventBus.addHandler(PaperEvent.getType(), new PaperHandler() {

			@Override
			public void onPaper(PaperEvent event) {
				switch (event.getPaperType()) {
				case resize:
					int lTop = event.getTop();
					if (lTop != -1) {
						mTop = lTop;
					}
					refresh();
					break;
				default:
					break;
				}
			}
		}));
		
		registerHandler(eventBus.addHandler(PaperEvent.getType(), new PaperHandler() {
			
			@Override
			public void onPaper(PaperEvent event) {
				display.refresh0();
			}
		}));
		
		registerHandler(eventBus.addHandler(HyperLinkClickEvent.getType(), new HyperLinkClickHandler() {
			
			@Override
			public void onHyperTextLink(HyperLinkClickEvent event) {
				goToInfo(event.getElementInfo());
			}
		}));
		
		registerHandler(eventBus.addHandler(DisplayResearchEvent.getType(), new DisplayResearchHandler() {

			@Override
			public void onDisplayResearch(DisplayResearchEvent event) {
				if (mCurrentInfo != mAppInfo.getSectionInfos().get(4)) {
					goToInfo(mAppInfo.getSectionInfos().get(4));
				}
				
				if (event.getFinder() != null && event.getFinder().size() != 0) {
					if (mLastRight != null) 
						mLastRight.getDisplay().show();
					displayResearch(event.getFinder());
				} else if (event.getFinder() == null) {
					if (mLastRight != null)
						mLastRight.getDisplay().hide();
					clearResearch();
				} else if (event.getFinder().size() == 0) {
					if (mLastRight != null)
						mLastRight.getDisplay().hide();
					clearResearch();
				}
			}
		}));
	}

	@Override
	public void unbind() {
		super.unbind();
		mPagerMode = PagerMode.portal;
	}
	
	@Override
	public void init(String iToken) {
		if (iToken.contains("Classic")) {
			init(TypePortal.classic);
		} else if (iToken.contains("Legends")) {
			init(TypePortal.legends);
		}
		setHome(false);
		Info lInfo = mMapTokenInfo.get(iToken);
		goToInfo(lInfo);
	}
	
	@Override
	public void init(TypePortal iPortal) {
		if (iPortal != mTypePortal) {
			mTypePortal = iPortal;
	
			if (mAppInfo != null) {
				mMapTokenInfo.clear();
				mColumnRoot.clear();
				mColumnRoot = mProviderColumnContainer.get();
			}
			
			StarWarsContentDataBase.initCommon();
			
			switch (mTypePortal) {
				case classic:
					if (!mInitClassic) {
						mInitClassic = true;
						StarWarsContentDataBase.initClassic();
					}
					
					if (mAppInfoClassic == null && mInitClassic) {
						mAppInfoClassic = AppFactory.createAppInfoClassic();
					}
					
					mAppInfo = mAppInfoClassic;
					mAppInfoLegends = null;
					break;
				case legends:
					if (!mInitLegends) {
						mInitLegends = true;
						StarWarsContentDataBase.initLegends();
					}
					
					if (mAppInfoLegends == null && mInitLegends) {
						mAppInfoLegends = AppFactory.createAppInfoLegends();
					}
					
					mAppInfo = mAppInfoLegends;
					mAppInfoClassic = null;
					break;
			}
			
			for (SectionInfo lSectionInfo : mAppInfo.getSectionInfos()) {
				mColumnRoot.addRootSection(lSectionInfo);
				mMapContainers.put(lSectionInfo, mColumnRoot);
			}
			
			DataBase lDataBase = DataBase.getInstance();
			lDataBase.reset();
			lDataBase.fillDataBase(mAppInfo, mMapTokenInfo, mTypePortal);
		}
//		setHome(true);
	}
	
	private void changeScreen(ChangeScreenEvent event) {
		Info lInfo = event.getInfo();
		if (mCurrentInfo != lInfo) {
			if (mCurrentInfo instanceof ElementInfo) {
				if (((ElementInfo) mCurrentInfo).getAModule() != null) {
					((ElementInfo) mCurrentInfo).getAModule().unbind();
				}
			}

			mCurrentInfo = lInfo;

			if (mCurrentInfo != null) {
				History.newItem(mCurrentInfo.getTag(), false);
			}

			int lTopLeft = display.getLeftColumnScrollTop();
			int lTopRight = display.getRightColumnScrollTop();
			final int lTop = Math.max(lTopLeft, lTopRight);
			
			if (mCurrentInfo == null || event.getTypeChangeScreen() == TypeChangeScreen.home) {
				setHome(true);
			} else if (mCurrentInfo instanceof SectionInfo) {
				if (((SectionInfo) mCurrentInfo).isResearch()) {
					mMapNextContainers.clear();
				}
				mCurrentInfo.loadDatas();
				setNavigation((SectionInfo) mCurrentInfo, false);
			} else if (mCurrentInfo instanceof ElementInfo) {
				display.refresh();
				setPaper((ElementInfo) mCurrentInfo);
			}
			Timer lTimer = new Timer() {
				@Override
				public void run() {
					updateItems();
				}
			};
			lTimer.schedule(300);
			display.scrollLeftColumnAbsoluteTop(lTop);
		}
	}

	public void setHome(boolean iAddToken) {
		if (iAddToken) {
			if (mTypePortal == TypePortal.legends) {
				History.newItem("!/Legends", false);
			} else {
				History.newItem("!/Classic", false);
			}
		}
		mCurrentInfo = null;
		display.absolutePaper();
		display.setHomeMode(true);

		ASyncCall<Void> lASyncCall = new ASyncCall<Void>() {
			
			@Override
			public void onSuccess(Void iObj) {
				mColumnRoot.init(ColumnMode.home);
				mColumnRoot.reset();
				display.setColumMiddle(mColumnRoot.getDisplay().asWidget());
				display.setModeHome(mTypePortal);

				mLastColumn = null;
				mLastRight = null;
				NodePathEvent lNodePathEvent = new NodePathEvent(NodePathType.home);
				if (mTypePortal != null) {
					lNodePathEvent.setTypePortal(mTypePortal);
				}
				eventBus.fireEvent(lNodePathEvent);
				mPagerMode = PagerMode.home;
				refresh();
			}
		};
		
		PagerAnimation lPagerAnimation = PagerAnimation.clear_bck;
		if (mLastColumn == null) {
			lPagerAnimation = PagerAnimation.first;
		} else if (mLastColumn == mColumnRoot) {
			lPagerAnimation = PagerAnimation.nav_home;
		}
		
		display.updatePanel(lPagerAnimation, lASyncCall);
	}

	private void setNavigation(final SectionInfo iSectionInfo, final boolean isResearch) {
		mResearchMode = isResearch;
		display.absolutePaper();
		display.setHomeMode(false);
		
		final ColumnContainer lColumnContainer = mMapContainers.get(iSectionInfo);
		
		lColumnContainer.init(ColumnMode.left);
		PagerAnimation lPagerAnimation = PagerAnimation.clear_bck;
		
		if (!mResearchMode) {
			clearResearch();
		}
		
		if (lColumnContainer == mLastColumn) {
			if (!mResearchMode) {
				lColumnContainer.reset();
			}
			lPagerAnimation = PagerAnimation.nav_nav_static;
		} else if (lColumnContainer == mLastRight) {
			if (mPagerMode == PagerMode.navigation) {
				lPagerAnimation = PagerAnimation.nav_nav_fwd;
			}
		} else if (lColumnContainer == mColumnRoot &&
				mLastColumn == null) {
			lPagerAnimation = PagerAnimation.home_nav;
		}		
		ColumnDetail lColumnDetail = mMapDetails.get(iSectionInfo);
		if (lColumnDetail == null) {
			lColumnDetail = mProviderColumnDetail.get();
			lColumnDetail.init(iSectionInfo);
			lColumnDetail.bind();
			mMapDetails.put(iSectionInfo, lColumnDetail);
		}
		ColumnContainer lColumnNextContainer = mMapNextContainers.get(iSectionInfo);
		if (lColumnNextContainer == null) {
			lColumnNextContainer = mProviderColumnContainer.get();
			if (!iSectionInfo.isFinal()) {
				for (SectionInfo lNextSectionInfo : iSectionInfo.getSectionInfos()) {
					lColumnNextContainer.addSection(lNextSectionInfo);
					mMapContainers.put(lNextSectionInfo, lColumnNextContainer);
				}
			} else {
				for (ElementInfo lNextElementInfo : iSectionInfo.getElementInfos()) {
					lColumnNextContainer.addElement(lNextElementInfo);
					mMapContainers.put(lNextElementInfo, lColumnNextContainer);
				}
			}
			lColumnNextContainer.bind();
			mMapNextContainers.put(iSectionInfo, lColumnNextContainer);
		}
		lColumnNextContainer.init(ColumnMode.right);
		lColumnNextContainer.reset();
		if (lColumnNextContainer == mLastColumn) {
			if (mPagerMode == PagerMode.navigation) {
				lPagerAnimation = PagerAnimation.nav_nav_bck;
			} else if (mPagerMode == PagerMode.paper) {
				lPagerAnimation = PagerAnimation.paper_nav;
			}
		}
		
		final ColumnDetail lFinalColumnDetail = lColumnDetail;
		final ColumnContainer lFinalColumnNextContainer = lColumnNextContainer;
		ASyncCall<Void> lASyncCall = new ASyncCall<Void>() {
			
			@Override
			public void onSuccess(Void iObj) {
				display.setColumnLeft(lColumnContainer.getDisplay().asWidget());
				display.setColumMiddle(lFinalColumnDetail.getDisplay().asWidget());
				display.setColumnRight(lFinalColumnNextContainer.getDisplay().asWidget());
				display.setModeNavigation();
				NodePathEvent lNodePathEvent = new NodePathEvent(NodePathType.replace);
				lNodePathEvent.setInfo(iSectionInfo);
				lNodePathEvent.setRealChange(mLastColumn != lColumnContainer);
				eventBus.fireEvent(lNodePathEvent);
				mLastColumn = lColumnContainer;
				mLastRight = lFinalColumnNextContainer;
				mPagerMode = PagerMode.navigation;
				refresh();
			}
		};
		display.updatePanel(lPagerAnimation, lASyncCall);
	}

	private void setPaper(final ElementInfo iElementInfo) {
		display.setHomeMode(false);
		final ColumnContainer lColumnContainer = mMapContainers.get(iElementInfo);
		lColumnContainer.reset();
		lColumnContainer.init(ColumnMode.left);
		
		mCColumnImage = mMapImage.get(iElementInfo);
		if (mCColumnImage == null) {
			mCColumnImage = mProviderColumnComment.get();
			mCColumnImage.bind();
			mMapImage.put(iElementInfo, mCColumnImage);
		}

		mCPaper = mMapPaper.get(iElementInfo);

		if (mCPaper == null) {
			mCPaper = mProviderPaper.get();
			mCPaper.bind();
			mCPaper.setPager(this);
			mCPaper.init(iElementInfo);
			mMapPaper.put(iElementInfo, mCPaper);
		}
		mCColumnImage.setPaper(mCPaper);

		PagerAnimation lPagerAnimation = PagerAnimation.nav_paper;
		if (mLastColumn == lColumnContainer) {
			lPagerAnimation = PagerAnimation.first;
		}

		ASyncCall<Void> lASyncCall = new ASyncCall<Void>() {

			@Override
			public void onSuccess(Void iObj) {
				display.setColumnLeft(lColumnContainer.getDisplay().asWidget());
				display.setPaper(mCPaper.getDisplay().asWidget());
				display.setColumnComment(mCColumnImage.getDisplay().asWidget());
				display.setModePaper();

				NodePathEvent lNodePathEvent = new NodePathEvent(NodePathType.replace);
				lNodePathEvent.setInfo(iElementInfo);
				lNodePathEvent.setRealChange(mLastColumn != lColumnContainer);
				eventBus.fireEvent(lNodePathEvent);
				mLastColumn = lColumnContainer;
				mLastRight = null;
				mPagerMode = PagerMode.paper;
				
				mCPaper.init(iElementInfo);
				mCPaper.draw();
				forceMiddlePanelReduce();
				refresh();
			}
		};

		display.updatePanel(lPagerAnimation, lASyncCall);
	}

	private void forceMiddlePanelReduce() {
		if (mMiddlePanelFullscreen) {
			mMiddlePanelFullscreen = false;
			display.setMiddlePanelReduce(false, null);
		}	
	}

	public void refresh() {
		display.refresh(mTop);
		display.refresh0();
	}

	public void displayResearch(List<ElementInfo> iElements) {
		clearResearch();
		SectionInfo lResearchSection = mAppInfo.getSectionInfos().get(mAppInfo.getSectionInfos().size() - 1);
		for (ElementInfo lElementInfo : iElements) {
			lResearchSection.getElementInfos().add(lElementInfo);
		}
		mMapNextContainers.put(lResearchSection, null);
		setNavigation(lResearchSection, true);
	}

	public void clearResearch() {
		SectionInfo lResearchSection = mAppInfo.getSectionInfos().get(mAppInfo.getSectionInfos().size() - 1);
		lResearchSection.getElementInfos().clear();
	}

	private void clickFromHistory() {
		String lToken = History.getToken();
		if (lToken.equals("!/") || lToken.equals("!")) {
			BackPortalEvent lEvent = new BackPortalEvent();
			eventBus.fireEvent(lEvent);
		} else {
			Info lInfo = mMapTokenInfo.get(lToken);
			goToInfo(lInfo);
		}
	}
	
	private void goToInfo(final Info iAimedInfo) {
		if (mCurrentInfo != iAimedInfo) {
			int lDistance = Info.getDistance(mCurrentInfo, iAimedInfo);
			if ((iAimedInfo != null && lDistance > 1) || (mResearchMode)) {
				display.hide();
				display.setTimerSameSection(true);
				setHome(false);
				for (SectionInfo lSection : mAppInfo.getSectionInfos()) {
					if (iAimedInfo.getTag().contains(lSection.getTag())) {
						setNavigation(lSection, false);
						recGoToInfo(lSection, iAimedInfo);
						break;
					}
				}

				if (mCurrentInfo instanceof ElementInfo) {
					if (((ElementInfo) mCurrentInfo).getAModule() != null) {
						((ElementInfo) mCurrentInfo).getAModule().unbind();
					}
				}

				Timer lTimer = new Timer() {
					@Override
					public void run() {
						if (iAimedInfo instanceof ElementInfo) { 
							setPaper((ElementInfo) iAimedInfo);
						} else {
							iAimedInfo.loadDatas();
							setNavigation((SectionInfo) iAimedInfo, false);
						}
						updateItems();
						display.show();
						display.setTimerSameSection(false);
					}
				};
				lTimer.schedule(310);
			
				mCurrentInfo = iAimedInfo;
				History.newItem(mCurrentInfo.getTag(), false);
			} else {
				ChangeScreenEvent lEvent = new ChangeScreenEvent();
				lEvent.setInfo(iAimedInfo);
				changeScreen(lEvent);
			}
		}
	}
	
	private void recGoToInfo(SectionInfo iCurrentSectionInfo, final Info iAimedInfo) {
		if (iCurrentSectionInfo != iAimedInfo) {
			if (!iCurrentSectionInfo.isFinal()) {
				for (SectionInfo lSection : iCurrentSectionInfo.getSectionInfos()) {
					if (iAimedInfo.getTag().contains(lSection.getTag())) {
						setNavigation(lSection, false);
						recGoToInfo(lSection, iAimedInfo);
						break;
					}
				}
			}
		}
	}
		
	private void updateItems() {
		boolean lFind = false;
		if (mCurrentInfo != null) {
			if (mLastRight != null) {
				for (AItem<?, ?> lItem : mLastRight.getItems()) {
					if (mCurrentInfo == lItem.getInfo()) {
						lItem.activate();
						lFind = true;
						break;
					}
				}
			}
			if (!lFind && mColumnRoot != null) {
				for (AItem<?, ?> lItem : mColumnRoot.getItems()) {
					if (mCurrentInfo == lItem.getInfo()) {
						lItem.activate();
						lFind = true;
						break;
					}
				}
			}
				
			if (!lFind && mLastColumn != null) {
				for (AItem<?, ?> lItem : mLastColumn.getItems()) {
					if (mCurrentInfo == lItem.getInfo()) {
						lItem.activate();
						break;
					}
				}
			}
		}
	}
}
