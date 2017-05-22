package com.starwars.app.client.main.presenter.impl;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.backportal.event.BackPortalEvent;
import com.starwars.app.client.backportal.event.BackPortalHandler;
import com.starwars.app.client.main.event.PortalClickEvent;
import com.starwars.app.client.main.event.PortalClickEvent.TypePortal;
import com.starwars.app.client.main.event.PortalClickHandler;
import com.starwars.app.client.main.presenter.Footer;
import com.starwars.app.client.main.presenter.Header;
import com.starwars.app.client.main.presenter.Main;
import com.starwars.app.client.main.presenter.MainPortal;
import com.starwars.app.client.main.presenter.TopPanel;
import com.starwars.app.client.pager.event.PaperEvent;
import com.starwars.app.client.pager.event.PaperEvent.PaperType;
import com.starwars.app.client.pager.presenter.NodePath;
import com.starwars.app.client.pager.presenter.Pager;


public class MainImpl extends BasePresenter<Main.Display> implements
Main {

	private final Header mHeader;
	private final TopPanel mTopPanel;
	private final Pager mPager;
	private final Footer mFooter;
	private final MainPortal mMainPortal;

	private boolean mIsClosedTopPanel;
	private boolean mIsPagerInit;
	
	private Mode mMode;

	@Inject
	public MainImpl(final EventBus eventBus,
			final Main.Display display,
			Provider<Header> iHeader,
			Provider<NodePath> iNodePath,
			Provider<TopPanel> iTopPanel,
			Provider<Pager> iPager,
			Provider<Footer> iFooter,
			Provider<MainPortal> iMainPortal) {
		super(eventBus, display);
		mHeader = iHeader.get();
		mTopPanel = iTopPanel.get();
		mPager = iPager.get();
		mFooter = iFooter.get();
		mMainPortal = iMainPortal.get();

		mMode = null;
		mIsPagerInit = false;
		display.setHeader(mHeader.getDisplay().asWidget());
		
		if (History.getToken().equals("!/") || History.getToken().equals("!") || History.getToken().equals("")) {
			setMode(Mode.portal, null);
		} else {
			setMode(Mode.hyperlink, null);
		}
		
		History.addValueChangeHandler(new ValueChangeHandler<String>() {
			
			@Override
			public void onValueChange(ValueChangeEvent<String> event) {
				if (mMode == Mode.portal && !History.getToken().equals("!/") && !History.getToken().equals("!") && !History.getToken().equals("")) {
					setMode(Mode.hyperlink, null);
				}
			}
		});
	}

	@Override
	public void bind() {
		super.bind();
		
		registerHandler(display.getButtonTopPanel().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				mIsClosedTopPanel = !mIsClosedTopPanel;
				if (mIsClosedTopPanel) {
					display.setCloseStateButtonTopPanel();
					mTopPanel.setCloseState();
				} else {
					display.setOpenStateButtonTopPanel();
					mTopPanel.setOpenState();
				}
				refresh();
			}
		}));

		registerHandler(Window.addResizeHandler(new ResizeHandler() {

			@Override
			public void onResize(ResizeEvent event) {
				refresh();
			}
		}));

		registerHandler(eventBus.addHandler(PortalClickEvent.getType(), new PortalClickHandler() {

			@Override
			public void onPortalClick(final PortalClickEvent event) {
				if (event.isFadeOutPortal() && mMode == Mode.portal) {
					setMode(Mode.pager, event.getTypePortalClick());
				}
			}
		}));
		
		registerHandler(eventBus.addHandler(BackPortalEvent.getType(), new BackPortalHandler() {

			@Override
			public void onBackPortal(BackPortalEvent event) {
				History.newItem("!", false);
				setMode(Mode.portal, null);
			}
		}));
	}

	@Override
	public void setMode(Mode iMode, TypePortal iPortal) {
		if (iMode != mMode) {
			unbindAll();
			mMode = iMode;
			display.clearMiddle();
			switch (iMode) {
			case none:
				hideAll();
				mMainPortal.getDisplay().hide();
				display.hideButtonTopPanel();
				break;
			case hyperlink:
				if (!mIsPagerInit) {
					mIsPagerInit = true;
					mPager.init(History.getToken());
				}

				display.setMiddle(mPager.getDisplay().asWidget());
				display.light();
				showAll();
				display.showButtonTopPanel();
				display.remove(mMainPortal.getDisplay().asWidget());
				mIsClosedTopPanel = true;
				display.setCloseStateButtonTopPanel();
				bindAll();
				break;
			case pager:
				if (!mIsPagerInit && iPortal != null) {
					mIsPagerInit = true;
					mPager.init(iPortal);
					mPager.setHome(true);
				}

				display.setMiddle(mPager.getDisplay().asWidget());
				display.light();
				showAll();
				display.showButtonTopPanel();
				display.remove(mMainPortal.getDisplay().asWidget());
				mIsClosedTopPanel = true;
				display.setCloseStateButtonTopPanel();
				mMainPortal.unbind();
				bindAll();
				break;
			case portal:
				hideAll();
//				History.newItem("!", false);
				mPager.getDisplay().hide();
				
				if (mIsPagerInit) {
					mIsPagerInit = false;
					mPager.setHome(false);
				}
				
				mMainPortal.reset();
				display.add(mMainPortal.getDisplay().asWidget());
				mMainPortal.getDisplay().show();
				mMainPortal.getDisplay().portalMode();
				mMainPortal.bind();

				break;
			case load:
				hideAll();
				mMainPortal.reset();
				display.add(mMainPortal.getDisplay().asWidget());
				mMainPortal.getDisplay().show();
				mMainPortal.getDisplay().loadMode();
				
				mPager.bind();
				break;
			}
		}
	}

	private void showAll() {
		mHeader.getDisplay().show();
		mTopPanel.getDisplay().show();
		mFooter.getDisplay().show();
		mPager.getDisplay().show();
	}
	
	private void hideAll() {
		mHeader.getDisplay().hide();
		mTopPanel.getDisplay().hide();
		mFooter.getDisplay().hide();
	}

	private void unbindAll() {
		mHeader.unbind();
		mTopPanel.unbind();
		mPager.unbind();
		mFooter.unbind();
		mMainPortal.unbind();
	}
	
	private void bindAll() {
		mHeader.bind();
		mTopPanel.bind();
		mFooter.bind();
		mPager.bind();
	}
	
	private void refresh() {
		PaperEvent lPaperEvent = new PaperEvent(PaperType.resize);
		int lTop = display.getHeaderHeight();
		lPaperEvent.setTop(lTop);
		eventBus.fireEvent(lPaperEvent);
	}
}