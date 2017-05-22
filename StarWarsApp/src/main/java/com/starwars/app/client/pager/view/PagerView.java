package com.starwars.app.client.pager.view;

import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.dom.client.Style.Overflow;
import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.dom.client.Style.VerticalAlign;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.main.event.PortalClickEvent.TypePortal;
import com.starwars.app.client.mct.ASyncCall;
import com.starwars.app.client.pager.presenter.Pager;
import com.starwars.app.client.pager.presenter.Pager.PagerAnimation;
import com.starwars.app.client.resources.StarWarsImageResources;
import com.starwars.app.client.tools.DivPanel;

public class PagerView extends ADivView implements Pager.Display {

	public static final int TOP_PAPER = 41;
	public static final int BOTTOM_PAPER = 300;
	
	private final DivPanel mColumnLeft;
	private final DivPanel mColumnMiddle;
	private final DivPanel mColumnRight;
	private final DivPanel mPaper;
	private final DivPanel mColumnComment;
	private final DivPanel mButtonMiddlePanel;
	private final DivPanel mWebFontButtonPanelMiddle;
	private final DivPanel mPanelPaper;
	private final DivPanel mBand;

	private boolean mMiddleFullScreen;
	private boolean mHomeMode;
	private boolean mActivateTimerSameSection;
	private final static double sRatioElement = 0.2995;
	private final static double sRatioPaper = 1 - sRatioElement;

	public PagerView() {
		mRoot.getElement().setAttribute("id", "pager");
		mRoot.getElement().getStyle().setOverflow(Overflow.HIDDEN);

		mButtonMiddlePanel = new DivPanel();
		mRoot.add(mButtonMiddlePanel);
		mWebFontButtonPanelMiddle = new DivPanel();
		mButtonMiddlePanel.add(mWebFontButtonPanelMiddle);
		initButtonMiddlePanel();

		mPanelPaper = new DivPanel();
		mRoot.add(mPanelPaper);
		initPanelPaper();

		mPaper = new DivPanel();
		mPanelPaper.add(mPaper);
		initPaper();

		mBand = new DivPanel();
		initBand();
		
		mColumnLeft = new DivPanel();
		initColumnLeft();

		mColumnComment = new DivPanel();
		mPanelPaper.add(mColumnComment);
		initColumnComment();

		mColumnMiddle = new DivPanel();
		initColumnMiddle();
		
		mColumnRight = new DivPanel();
		initColumnRight();

		DivPanel lFooterShadow = new DivPanel();
		mRoot.add(lFooterShadow);
		lFooterShadow.getElement().setAttribute("id", "footer-shadow");
		lFooterShadow.addStyleName(STYLE.line());
		lFooterShadow.addStyleName(STYLE.w100per());

		mMiddleFullScreen = false;
		mHomeMode = true;
		mActivateTimerSameSection = false;
	}

	public void setHomeMode(boolean iHomeMode) {
		mHomeMode = iHomeMode;
	}

	@Override
	public void setModeHome(TypePortal iPortal) {
		mRoot.add(mColumnLeft);
		mRoot.add(mColumnMiddle);
		mRoot.add(mColumnRight);
		mColumnLeft.removeStyleName(STYLE.bgg());
		removeHomeImage();
		switch (iPortal) {
		case classic:
			setHomeImageClassic();
			break;
		case legends:
			setHomeImageLegends();
			break;
		}
	}

	@Override
	public void setModeNavigation() {
		mRoot.add(mColumnLeft);
		mRoot.add(mColumnMiddle);
		mRoot.add(mColumnRight);
		mColumnLeft.removeStyleName(STYLE.bgg());
		removeHomeImage();
	}

	@Override
	public void setModePaper() {
		mRoot.add(mButtonMiddlePanel);
		mRoot.add(mColumnLeft);
		mRoot.add(mPanelPaper);
		mColumnLeft.addStyleName(STYLE.bgg());
		removeHomeImage();
	}

	public void updatePanel(PagerAnimation iPagerAnimation, final ASyncCall<Void> iASyncCall) {
		setMiddlePanelReduce(false, null);
		setHiddenOverflowColumn();
		switch (iPagerAnimation) {
		case nav_nav_fwd:
			navNavFwd(iASyncCall);
			break;
		case nav_nav_bck:
			navNavBck(iASyncCall);
			break;
		case nav_home:
			navHome(iASyncCall);
			break;
		case home_nav:
			homeNav(iASyncCall);
			break;
		case nav_paper:
			navPaper(iASyncCall);
			break;
		case paper_nav:
			paperNav(iASyncCall);
			break;
		case clear_bck:
			clear_bck(iASyncCall);
			break;

		default:
			mColumnLeft.removeStyleName(STYLE.transAll());
			mColumnRight.removeStyleName(STYLE.transAll());
			mColumnMiddle.removeStyleName(STYLE.transAll());
			mRoot.clear();
			mColumnLeft.clear();
			mColumnMiddle.clear();
			mColumnRight.clear();
			mColumnLeft.getElement().getStyle().clearLeft();
			mColumnLeft.getElement().getStyle().clearTop();
			mColumnRight.getElement().getStyle().clearLeft();
			mColumnRight.getElement().getStyle().clearTop();
			mColumnRight.removeStyleName(STYLE.mT27Neg());
			mColumnLeft.removeStyleName(STYLE.mT25Neg());
			if (mActivateTimerSameSection) {
				Timer lTimer = new Timer() {
					@Override
					public void run() {
						if (iASyncCall != null) {
							iASyncCall.onSuccess(null);
							setAutoOverflowColumn();
						}
					}
				};
				lTimer.schedule(300);
			} else {
				if (iASyncCall != null) {
					iASyncCall.onSuccess(null);
					setAutoOverflowColumn();
				}
			}
			mColumnLeft.addStyleName(STYLE.transAll());
			mColumnRight.addStyleName(STYLE.transAll());
			mColumnMiddle.addStyleName(STYLE.transAll());
			break;
		}
	}

	public void setMiddlePanelFullscreen(final ASyncCall<Void> iASyncCall) {
		mMiddleFullScreen = true;
		mWebFontButtonPanelMiddle.getElement().setAttribute("data-icon", "R");

		mColumnLeft.getElement().getStyle().setWidth(sRatioElement * Window.getClientWidth(), Unit.PX);
		mColumnLeft.getElement().getStyle().setLeft(-(mColumnLeft.getOffsetWidth() + 10), Unit.PX);

		mPanelPaper.getElement().getStyle().setWidth(Window.getClientWidth(), Unit.PX);

		mButtonMiddlePanel.getElement().getStyle().setLeft(0, Unit.PX);
		mButtonMiddlePanel.getElement().getStyle().setTop(46, Unit.PX);
		mPanelPaper.getElement().getStyle().setLeft(0, Unit.PX);
		Timer lTimer = new Timer() {

			@Override
			public void run() {
				if (iASyncCall != null) {
					iASyncCall.onSuccess(null);
				}
			}
		};
		lTimer.schedule(300);
	}

	public void setMiddlePanelReduce(boolean iWithTimer, final ASyncCall<Void> iASyncCall) {
		mMiddleFullScreen = false;
		mWebFontButtonPanelMiddle.getElement().setAttribute("data-icon", "Q");

		mColumnLeft.getElement().getStyle().setWidth(sRatioElement * Window.getClientWidth(), Unit.PX);
		mColumnLeft.getElement().getStyle().clearLeft();

		mButtonMiddlePanel.getElement().getStyle().setLeft(sRatioElement * Window.getClientWidth() - 1, Unit.PX);	
		mButtonMiddlePanel.getElement().getStyle().setTop(46, Unit.PX);
		if (iWithTimer) {
			Timer lTimer = new Timer() {

				@Override
				public void run() {
					setMiddlePanelReduceAux();
					if (iASyncCall != null) {
						iASyncCall.onSuccess(null);
					}
				}
			};
			lTimer.schedule(300);
		} else {
			setMiddlePanelReduceAux();
			if (iASyncCall != null) {
				iASyncCall.onSuccess(null);
			}
		}
	}
	
	private void navNavFwd(final ASyncCall<Void> iASyncCall) {
		mColumnLeft.removeStyleName(STYLE.transAll());
		mColumnMiddle.removeStyleName(STYLE.transAll());
		mColumnRight.addStyleName(STYLE.transAll());

		mColumnLeft.clear();
		mColumnMiddle.clear();
		mColumnRight.getElement().getStyle().setLeft(0, Unit.PX);
		mColumnRight.addStyleName(STYLE.leftZero());
		mColumnRight.getElement().getStyle().setZIndex(999);
		Timer lTimer = new Timer() {

			@Override
			public void run() {
				mRoot.clear();
				mColumnLeft.clear();
				mColumnMiddle.clear();
				mColumnRight.clear();
				mColumnRight.getElement().getStyle().clearLeft();
				mColumnRight.getElement().getStyle().clearTop();
				mColumnRight.getElement().getStyle().clearZIndex();
				mColumnRight.removeStyleName(STYLE.mT27Neg());
				mColumnLeft.removeStyleName(STYLE.mT25Neg());
				mColumnLeft.removeStyleName(STYLE.transAll());
				mColumnMiddle.removeStyleName(STYLE.transAll());
				mColumnRight.removeStyleName(STYLE.transAll());
				if (iASyncCall != null) {
					iASyncCall.onSuccess(null);
				}
				mColumnLeft.addStyleName(STYLE.transAll());
				mColumnMiddle.addStyleName(STYLE.transAll());
				mColumnRight.addStyleName(STYLE.transAll());
				setAutoOverflowColumn();
			}
		};
		lTimer.schedule(300);
	}

	private void navNavBck(final ASyncCall<Void> iASyncCall) {
		int lLeft = mColumnRight.getOffsetWidth() + mColumnMiddle.getOffsetWidth();

		mColumnRight.clear();
		mColumnMiddle.clear();
		mColumnLeft.addStyleName(STYLE.transAll());
		mColumnLeft.getElement().getStyle().setLeft(lLeft, Unit.PX);
		
		Timer lTimer = new Timer() {

			@Override
			public void run() {
				mRoot.clear();
				mColumnLeft.clear();
				mColumnMiddle.clear();
				mColumnRight.clear();
				mColumnLeft.getElement().getStyle().clearLeft();
				mColumnLeft.getElement().getStyle().clearTop();
				mColumnRight.removeStyleName(STYLE.mT27Neg());
				mColumnLeft.removeStyleName(STYLE.mT25Neg());
				if (iASyncCall != null) {
					iASyncCall.onSuccess(null);
				}
				setAutoOverflowColumn();
			}
		};
		lTimer.schedule(300);
	}

	private void navHome(final ASyncCall<Void> iASyncCall) {
		mColumnLeft.addStyleName(STYLE.transAll());
		mColumnMiddle.removeStyleName(STYLE.transAll());
		mColumnRight.removeStyleName(STYLE.transAll());
		int lLeft = Double.valueOf(Window.getClientWidth() * 0.4).intValue();

		mColumnMiddle.clear();
		mColumnRight.clear();
		mColumnLeft.getElement().getStyle().setLeft(lLeft - 75, Unit.PX);
		
		Timer lTimer = new Timer() {

			@Override
			public void run() {
				mRoot.clear();
				mColumnLeft.clear();
				mColumnMiddle.clear();
				mColumnRight.clear();
				mColumnLeft.getElement().getStyle().clearLeft();
				mColumnLeft.getElement().getStyle().clearTop();
				mColumnLeft.removeStyleName(STYLE.transAll());
				mColumnMiddle.removeStyleName(STYLE.transAll());
				mColumnRight.removeStyleName(STYLE.transAll());
				if (iASyncCall != null) {
					iASyncCall.onSuccess(null);
				}
				mColumnLeft.addStyleName(STYLE.transAll());
				mColumnMiddle.addStyleName(STYLE.transAll());
				mColumnRight.addStyleName(STYLE.transAll());
				setAutoOverflowColumn();
			}
		};
		lTimer.schedule(300);
	}

	private void homeNav(final ASyncCall<Void> iASyncCall) {
		mColumnLeft.removeStyleName(STYLE.transAll());
		mColumnMiddle.addStyleName(STYLE.transAll());
		mColumnRight.removeStyleName(STYLE.transAll());

		mColumnLeft.clear();
		mColumnRight.clear();
		mColumnMiddle.addStyleName(STYLE.leftZero());
		mColumnMiddle.getElement().getStyle().setLeft(-16, Unit.PX);

		Timer lTimer = new Timer() {

			@Override
			public void run() {
				mRoot.clear();
				mColumnLeft.clear();
				mColumnMiddle.clear();
				mColumnRight.clear();
				mColumnLeft.removeStyleName(STYLE.transAll());
				mColumnRight.removeStyleName(STYLE.transAll());
				mColumnMiddle.removeStyleName(STYLE.transAll());
				mColumnMiddle.getElement().getStyle().clearLeft();
				mColumnRight.removeStyleName(STYLE.mT27Neg());
				mColumnLeft.removeStyleName(STYLE.mT25Neg());

				if (iASyncCall != null) {
					iASyncCall.onSuccess(null);
				}
				mColumnLeft.addStyleName(STYLE.transAll());
				mColumnRight.addStyleName(STYLE.transAll());
				mColumnMiddle.addStyleName(STYLE.transAll());
				setAutoOverflowColumn();
			}
		};
		lTimer.schedule(300);
	}

	private void navPaper(final ASyncCall<Void> iASyncCall) {
		mColumnLeft.clear();
		mColumnMiddle.clear();
		mColumnRight.addStyleName(STYLE.leftZero());
		mColumnRight.getElement().getStyle().setLeft(0, Unit.PX);
		
		Timer lTimer = new Timer() {

			@Override
			public void run() {
				mRoot.clear();
				mColumnLeft.clear();
				mColumnMiddle.clear();
				mColumnRight.clear();
				mColumnRight.getElement().getStyle().clearLeft();
				mColumnRight.getElement().getStyle().clearTop();
				mColumnRight.removeStyleName(STYLE.mT27Neg());
				mColumnLeft.removeStyleName(STYLE.mT25Neg());
				if (iASyncCall != null) {
					iASyncCall.onSuccess(null);
				}
				setAutoOverflowColumn();
			}
		};
		lTimer.schedule(300);
	}

	private void paperNav(final ASyncCall<Void> iASyncCall) {
		int lLeft = Double.valueOf(Window.getClientWidth() * 0.7).intValue();
		
		mRoot.remove(mButtonMiddlePanel);
		mRoot.remove(mPanelPaper);
		mColumnRight.clear();
		mColumnMiddle.clear();
		
		mColumnLeft.getElement().getStyle().setLeft(lLeft, Unit.PX);
		Timer lTimer = new Timer() {

			@Override
			public void run() {
				mRoot.clear();
				mColumnLeft.clear();
				mColumnMiddle.clear();
				mColumnRight.clear();
				mColumnLeft.getElement().getStyle().clearLeft();
				mColumnLeft.getElement().getStyle().clearTop();
				mColumnRight.removeStyleName(STYLE.mT27Neg());
				mColumnLeft.removeStyleName(STYLE.mT25Neg());
				if (iASyncCall != null) {
					iASyncCall.onSuccess(null);
				}
				setAutoOverflowColumn();
			}
		};
		lTimer.schedule(300);
	}

	private void clear_bck(final ASyncCall<Void> iASyncCall) {
		int lLeft = Window.getClientWidth();
		
		mRoot.remove(mButtonMiddlePanel);
		mRoot.remove(mPanelPaper);
		
		mColumnRight.clear();
		mColumnMiddle.clear();
		
		mColumnLeft.getElement().getStyle().setLeft(lLeft, Unit.PX);
		mColumnMiddle.getElement().getStyle().setLeft(lLeft, Unit.PX);
		mColumnRight.getElement().getStyle().setLeft(lLeft, Unit.PX);
		mPanelPaper.getElement().getStyle().setLeft(lLeft, Unit.PX);
		
		Timer lTimer = new Timer() {

			@Override
			public void run() {
				mRoot.clear();
				mColumnLeft.clear();
				mColumnMiddle.clear();
				mColumnRight.clear();

				mColumnLeft.removeStyleName(STYLE.transAll());
				mColumnLeft.getElement().getStyle().clearLeft();
				mColumnLeft.addStyleName(STYLE.transAll());

				mColumnMiddle.removeStyleName(STYLE.transAll());
				mColumnMiddle.getElement().getStyle().clearLeft();
				mColumnMiddle.addStyleName(STYLE.transAll());

				mColumnRight.removeStyleName(STYLE.transAll());
				mColumnRight.getElement().getStyle().clearLeft();
				mColumnRight.addStyleName(STYLE.transAll());

				mPanelPaper.getElement().getStyle().clearLeft();

				mColumnRight.removeStyleName(STYLE.mT27Neg());
				mColumnLeft.removeStyleName(STYLE.mT25Neg());
				if (iASyncCall != null) {
					iASyncCall.onSuccess(null);
				}
				setAutoOverflowColumn();
			}
		};
		lTimer.schedule(300);
	}

	public void refresh(int iTop) {
		int lHeight = Window.getClientHeight() - iTop - 32;

		if (mPaper.getWidgetCount() > 0) {
			int lH2 = mPaper.getWidget(0).getOffsetHeight();
			if (lH2 < lHeight) {
				mColumnComment.getElement().getStyle().setHeight(lHeight + 30, Unit.PX);
				//mPaper.getWidget(0).getElement().getStyle().setHeight(lHeight - 60 + 30, Unit.PX);
			} else {
				mColumnComment.getElement().getStyle().setHeight(lH2 + 90 + 30, Unit.PX);
			}
		} else {
			mColumnComment.getElement().getStyle().setHeight(lHeight + 90 + 30, Unit.PX);
		}

		mColumnLeft.getElement().getStyle().setHeight(lHeight, Unit.PX);
		mColumnLeft.getElement().getStyle().setHeight(lHeight, Unit.PX);
		mColumnMiddle.getElement().getStyle().setHeight(lHeight, Unit.PX);
		mColumnRight.getElement().getStyle().setHeight(lHeight, Unit.PX);
		mPanelPaper.getElement().getStyle().setHeight(lHeight, Unit.PX);

		double l00 = 0.20 * Window.getClientWidth();
		double l0 = 0.30 * Window.getClientWidth();
		double l1 = 0.40 * Window.getClientWidth();
		double p0 = 0;
		double p1 = l0;
		if (mHomeMode) {
			p1 += 0.05 * Window.getClientWidth();
			l1 = 0.35 * Window.getClientWidth();
		}
		double p2 = p1;
		p2 += mHomeMode ? l00 : l1;
		double l000 = mHomeMode ? l00 : l0;

		mColumnLeft.getElement().getStyle().setPosition(Position.ABSOLUTE);
		mColumnMiddle.getElement().getStyle().setPosition(Position.ABSOLUTE);
		mColumnRight.getElement().getStyle().setPosition(Position.ABSOLUTE);
		// CHANGE => STATIC
		mPanelPaper.getElement().getStyle().setPosition(Position.ABSOLUTE);

		mColumnLeft.getElement().getStyle().setWidth(l0, Unit.PX);
		mColumnLeft.getElement().getStyle().setLeft(p0, Unit.PX);
		mColumnMiddle.getElement().getStyle().setWidth(l1, Unit.PX);
		mColumnMiddle.getElement().getStyle().setLeft(p1, Unit.PX);
		mColumnRight.getElement().getStyle().setWidth(l000, Unit.PX);
		mColumnRight.getElement().getStyle().setLeft(p2, Unit.PX);

		mColumnLeft.getElement().getStyle().setWidth(sRatioElement * Window.getClientWidth(), Unit.PX);
		if (mMiddleFullScreen) {
			setMiddlePanelFullscreen(null);
		} else {
			setMiddlePanelReduce(false, null);
		}
	}

	public int getHeightComment() {
		if (mPanelPaper == null) {
			return 0;
		}
		return mPanelPaper.getOffsetHeight();
	}

	public int getWidthComment() {
		if (mPanelPaper == null) {
			return 0;
		}
		return (int) (mPanelPaper.getOffsetWidth() * 0.35);
	}

	public void refresh0() {
		int lH2 = mPaper.getOffsetHeight();
		mColumnComment.getElement().getStyle().setHeight(lH2, Unit.PX);
	}


	public HasClickHandlers getButtonMiddlePanel() {
		return mButtonMiddlePanel;
	}

	@Override
	public void setPaper(Widget iWidget) {
		mPaper.clear();
		mPaper.add(iWidget);
		iWidget.getElement().getStyle().clearHeight();
//		mPaper.add(mBand);
	}

	@Override
	public void setColumnComment(Widget iWidget) {
		mColumnComment.clear();
		mColumnComment.add(iWidget);
	}

	@Override
	public void setColumnLeft(Widget iWidget) {
		mColumnLeft.clear();
		mColumnLeft.add(iWidget);
	}

	@Override
	public void setColumMiddle(Widget iWidget) {
		mColumnMiddle.clear();
		mColumnMiddle.add(iWidget);
	}

	@Override
	public void setColumnRight(Widget iWidget) {
		mColumnRight.add(iWidget);
	}

	@Override
	public DivPanel getColumnLeft() {
		return mColumnLeft;
	}

	@Override
	public DivPanel getColumnMiddle() {
		return mColumnMiddle;
	}

	@Override
	public DivPanel getColumnRight() {
		return mColumnRight;
	}

	@Override
	public void refresh() {
		mColumnComment.clear();
	}

	public void scrollDeltaTop(int iDelta) {
		int lPos = mPanelPaper.getElement().getScrollTop() + iDelta;
		scrollAbsoluteTop(lPos);
	}

	public void scrollAbsoluteTop(int iPos) {
		mPanelPaper.getElement().setScrollTop(iPos);
	}

	public void scrollLeftColumnDeltaTop(int iDelta) {
		int lPos = mColumnLeft.getElement().getScrollTop() + iDelta;
		scrollLeftColumnAbsoluteTop(lPos);
	}

	public int getLeftColumnScrollTop() {
		return mColumnLeft.getElement().getScrollTop();
	}
	
	public int getRightColumnScrollTop() {
		return mColumnRight.getElement().getScrollTop();
	}
	
	public void scrollLeftColumnAbsoluteTop(int iPos) {
		mColumnLeft.getElement().setScrollTop(iPos);
	}
	
	public void scrollRightColumnAbsoluteTop(int iPos) {
		mColumnRight.getElement().setScrollTop(iPos);
	}
	
	public void hideImagePanel() {
		mColumnComment.hide();
		mPaper.getElement().getStyle().clearWidth();
		mPaper.addStyleName(STYLE.widthAuto());
	}
	
	public void showImagePanel() {
		mColumnComment.getElement().getStyle().clearDisplay();
		mColumnComment.addStyleName(STYLE.table());
		mPaper.getElement().getStyle().setWidth(65, Unit.PCT);
		mPaper.removeStyleName(STYLE.widthAuto());
	}
	
	public void addImageWidget(Widget iWidget) {
		mColumnComment.add(iWidget);
	}
	
	public void staticPaper() {
		mPanelPaper.getElement().getStyle().clearPosition();
		mPanelPaper.getElement().getStyle().setPosition(Position.STATIC);
	}
	
	public void absolutePaper() {
		mPanelPaper.getElement().getStyle().clearPosition();
		mPanelPaper.getElement().getStyle().setPosition(Position.ABSOLUTE);
	}
	
	public void setHomeImageLegends() {
		clearImage();
		
		Image lLeftImage = new Image();
		lLeftImage.setResource(StarWarsImageResources.INSTANCE.homeimagesdi());
		lLeftImage.addStyleName(STYLE.transAppear4());
		lLeftImage.getElement().getStyle().setPosition(Position.RELATIVE);
		lLeftImage.getElement().getStyle().setTop(50, Unit.PX);
		mColumnLeft.add(lLeftImage);
		
		Image lRightImage = new Image();
		lRightImage.setResource(StarWarsImageResources.INSTANCE.homeimagetie());
		lRightImage.addStyleName(STYLE.transAppear4());
		lRightImage.getElement().getStyle().setPosition(Position.RELATIVE);
//		lRightImage.getElement().getStyle().setRight(100, Unit.PX);
		lRightImage.getElement().getStyle().setTop(130, Unit.PX);
		mColumnRight.add(lRightImage);
		
		zoomImage(lRightImage);
		zoomImage(lLeftImage);
	}
	
	public void setHomeImageClassic() {
		clearImage();
		
		Image lLeftImage = new Image();
		lLeftImage.setResource(StarWarsImageResources.INSTANCE.homeimagesdi());
		lLeftImage.addStyleName(STYLE.transAppear4());
		lLeftImage.addStyleName(STYLE.originTop());
		lLeftImage.getElement().getStyle().setPosition(Position.RELATIVE);
		lLeftImage.getElement().getStyle().setTop(50, Unit.PX);
		mColumnLeft.add(lLeftImage);
		
		Image lRightImage = new Image();
		lRightImage.setResource(StarWarsImageResources.INSTANCE.homeimagetantive());
		lRightImage.addStyleName(STYLE.transAppear4());
		lRightImage.addStyleName(STYLE.originTop());
		lRightImage.getElement().getStyle().setPosition(Position.RELATIVE);
		lRightImage.getElement().getStyle().setLeft(100, Unit.PX);
		lRightImage.getElement().getStyle().setTop(300, Unit.PX);
		mColumnRight.add(lRightImage);
		
		zoomImage(lRightImage);
		zoomImage(lLeftImage);
	}
	
	public void setTimerSameSection(boolean iTimer) {
		mActivateTimerSameSection = iTimer;
	}
	
	private void zoomImage(Image iImage) {
		if (Window.getClientWidth() < 1200) {
			iImage.addStyleName(STYLE.zoom50());
		} else if (Window.getClientWidth() >= 1200 && Window.getClientWidth() < 1800) {
			iImage.addStyleName(STYLE.zoom70());
		}
	}
	
	private void setMiddlePanelReduceAux() {
		mPanelPaper.getElement().getStyle().setWidth(sRatioPaper * Window.getClientWidth() + 1, Unit.PX);
		mPanelPaper.getElement().getStyle().setLeft(sRatioElement * Window.getClientWidth(), Unit.PX);
	}
	
	private void clearImage() {
		mColumnLeft.getElement().getStyle().clearDisplay();
		mColumnRight.getElement().getStyle().clearDisplay();
	
		mColumnLeft.addStyleName(STYLE.inlineTable());
		mColumnRight.addStyleName(STYLE.inlineTable());
		
		mColumnLeft.getElement().getStyle().clearOverflow();
		mColumnRight.getElement().getStyle().clearOverflow();
		
		mColumnLeft.getElement().getStyle().setOverflow(Overflow.AUTO);
		mColumnRight.getElement().getStyle().setOverflow(Overflow.AUTO);
	}
	
	private void removeHomeImage() {
		mColumnLeft.getElement().getStyle().clearDisplay();
		mColumnRight.getElement().getStyle().clearDisplay();
		mColumnLeft.getElement().getStyle().setDisplay(Display.INLINE_BLOCK);
		mColumnRight.getElement().getStyle().setDisplay(Display.INLINE_BLOCK);
	}
	
	private void setHiddenOverflowColumn() {
		mColumnLeft.getElement().getStyle().clearOverflow();
		mColumnMiddle.getElement().getStyle().clearOverflow();
		mColumnRight.getElement().getStyle().clearOverflow();
		
		mColumnLeft.getElement().getStyle().setOverflow(Overflow.HIDDEN);
		mColumnMiddle.getElement().getStyle().setOverflow(Overflow.HIDDEN);
		mColumnRight.getElement().getStyle().setOverflow(Overflow.HIDDEN);
	}

	private void setAutoOverflowColumn() {
		mColumnLeft.getElement().getStyle().clearOverflow();
		mColumnMiddle.getElement().getStyle().clearOverflow();
		mColumnRight.getElement().getStyle().clearOverflow();
		
//		mColumnLeft.getElement().getStyle().setOverflow(Overflow.AUTO);
//		mColumnRight.getElement().getStyle().setOverflow(Overflow.AUTO);
		mColumnMiddle.getElement().getStyle().setOverflow(Overflow.HIDDEN);
		
		mColumnRight.getElement().getStyle().setOverflowY(Overflow.AUTO);
		mColumnRight.getElement().getStyle().setOverflowX(Overflow.HIDDEN);
		
		mColumnLeft.getElement().getStyle().setOverflowY(Overflow.AUTO);
		mColumnLeft.getElement().getStyle().setOverflowX(Overflow.HIDDEN);
	}
	
	private void initPanelPaper() {
		mPanelPaper.addStyleName(STYLE.transAll());
		mPanelPaper.addStyleName(STYLE.flex());
		mPanelPaper.getElement().setAttribute("id", "panel-main");
		mPanelPaper.getElement().getStyle().setVerticalAlign(VerticalAlign.TOP);
		mPanelPaper.getElement().getStyle().setOverflow(Overflow.AUTO);
		mPanelPaper.getElement().getStyle().setPosition(Position.ABSOLUTE);
		mPanelPaper.addStyleName(STYLE.flex());
		mPanelPaper.addStyleName(STYLE.bgWhiteDegrad());
		mPanelPaper.addStyleName(STYLE.transAppear1());
	}
	
	private void initBand() {
		mBand.addStyleName(STYLE.band());
	}
	
	private void initPaper() {
		mPaper.getElement().setAttribute("id", "panel-paper");
		mPaper.addStyleName(STYLE.transAll());
		mPaper.addStyleName(STYLE.table());
		mPaper.getElement().getStyle().setVerticalAlign(VerticalAlign.TOP);
		mPaper.getElement().getStyle().setPaddingTop(40, Unit.PX);
		mPaper.getElement().getStyle().setPaddingRight(2, Unit.PCT);
		mPaper.getElement().getStyle().setPaddingBottom(40, Unit.PX);
		mPaper.getElement().getStyle().setPaddingLeft(2, Unit.PCT);
	}
	
	private void initColumnLeft() {
		mColumnLeft.getElement().getStyle().setDisplay(Display.INLINE_BLOCK);
		mColumnLeft.getElement().getStyle().setVerticalAlign(VerticalAlign.TOP);
		mColumnLeft.addStyleName(STYLE.transAll());
		mColumnLeft.getElement().setAttribute("id", "panel-doc");
		mColumnLeft.addStyleName(STYLE.col());
		mColumnLeft.addStyleName(STYLE.side());
		mColumnLeft.addStyleName(STYLE.leftScroll());
		mColumnLeft.getElement().getStyle().setOpacity(1d);
//		mColumnLeft.getElement().getStyle().setZIndex(900);
	}
	
	private void initColumnComment() {
		mColumnComment.getElement().setAttribute("id", "panel-right");
		mColumnComment.getElement().getStyle().setWidth(35d, Unit.PCT);
		mColumnComment.addStyleName(STYLE.table());
		mColumnComment.getElement().getStyle().setVerticalAlign(VerticalAlign.TOP);
	}
	
	private void initColumnMiddle() {
		mColumnMiddle.getElement().getStyle().setDisplay(Display.INLINE_BLOCK);
		mColumnMiddle.getElement().getStyle().setOverflowY(Overflow.HIDDEN);
		mColumnMiddle.getElement().getStyle().setVerticalAlign(VerticalAlign.TOP);
		mColumnMiddle.addStyleName(STYLE.transAll());
		mColumnMiddle.addStyleName(STYLE.col());
		mColumnMiddle.addStyleName(STYLE.middle());
		mColumnMiddle.getElement().getStyle().setPosition(Position.ABSOLUTE);
		mColumnMiddle.getElement().getStyle().setZIndex(900);
	}
	
	private void initColumnRight() {
		mColumnRight.addStyleName(STYLE.transAll());
		mColumnRight.getElement().setAttribute("id", "panel-right");
		mColumnRight.addStyleName(STYLE.col());
		mColumnRight.addStyleName(STYLE.side());
		mColumnRight.getElement().getStyle().setPosition(Position.ABSOLUTE);
		mColumnRight.getElement().getStyle().setDisplay(Display.INLINE_BLOCK);
		mColumnRight.getElement().getStyle().setVerticalAlign(VerticalAlign.TOP);
	}
	
	private void initButtonMiddlePanel() {
		mButtonMiddlePanel.getElement().setAttribute("data-panel", "side");
		mButtonMiddlePanel.addStyleName(STYLE.icon());
		mButtonMiddlePanel.addStyleName(STYLE.panel());
		mButtonMiddlePanel.addStyleName(STYLE.bg00ACE7Op50());
		mButtonMiddlePanel.addStyleName(STYLE.icon20px());
		mButtonMiddlePanel.addStyleName(STYLE.closePanelSide());
		mButtonMiddlePanel.addStyleName(STYLE.absolute());
		mButtonMiddlePanel.addStyleName(STYLE.transAll());
		mButtonMiddlePanel.addStyleName(STYLE.transAppear1());
		mButtonMiddlePanel.addStyleName(STYLE.pointer());
		mButtonMiddlePanel.getElement().getStyle().setFloat(com.google.gwt.dom.client.Style.Float.NONE);
		mButtonMiddlePanel.getElement().getStyle().setTop(46, Unit.PX);
		mButtonMiddlePanel.getElement().getStyle().setZIndex(90);

		mWebFontButtonPanelMiddle.getElement().setAttribute("aria-hidden", "true");
		mWebFontButtonPanelMiddle.addStyleName(STYLE.cFFFFFF());
		mWebFontButtonPanelMiddle.addStyleName(STYLE.webfontIcon());
	}
}
