package com.starwars.app.client.pager.presenter.impl;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.backportal.event.BackPortalEvent;
import com.starwars.app.client.main.event.ChangeScreenEvent;
import com.starwars.app.client.main.event.ChangeScreenEvent.FromChangeScreen;
import com.starwars.app.client.main.event.ChangeScreenEvent.TypeChangeScreen;
import com.starwars.app.client.main.event.PortalClickEvent.TypePortal;
import com.starwars.app.client.pager.presenter.NodePathItem;
import com.starwars.app.shared.Info;


public class NodePathItemImpl extends BasePresenter<NodePathItem.Display> implements
NodePathItem {
	
	private Info mInfo;
	private TypeChangeScreen mTypeChangeScreen;
	
	@Inject
	public NodePathItemImpl(final EventBus eventBus,
			final NodePathItem.Display display) {
		super(eventBus, display);
		
		registerHandler(display.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				if (mTypeChangeScreen == TypeChangeScreen.portal) {
					BackPortalEvent lEvent = new BackPortalEvent();
					eventBus.fireEvent(lEvent);
				} else {
					ChangeScreenEvent lChangeScreenEvent = new ChangeScreenEvent();
					lChangeScreenEvent.setTypeChangeScreen(mTypeChangeScreen);
					lChangeScreenEvent.setFromChangeScreen(FromChangeScreen.nodepath);
					lChangeScreenEvent.setRealChange(false);
					lChangeScreenEvent.setInfo(mInfo);
					eventBus.fireEvent(lChangeScreenEvent);
				}
			}
		}));
	}

	@Override
	public void initPortal() {
		mTypeChangeScreen = TypeChangeScreen.portal;
		display.setLabel("Accueil");
		display.setIcon("i");
	}
	
	@Override
	public void initHome(TypePortal iPortal) {
		mTypeChangeScreen = TypeChangeScreen.home;
		display.setLabel((iPortal == TypePortal.classic ? "Classic" : "Legends"));
		display.setIcon("P");
	}
	
	@Override
	public void init(Info iInfo) {
		mInfo = iInfo;
		mTypeChangeScreen = TypeChangeScreen.navigation;
		display.setLabel(iInfo.getTitle());
		display.setIcon(iInfo.getIcon());
	}
	
	public void activate(boolean iActivate) {
		if (iActivate) {
			display.setActivate();
		} else {
			display.setInactivate();
		}
	}

	@Override
	public Info getInfo() {
		return mInfo;
	}
}