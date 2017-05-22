package com.starwars.app.client.backportal.presenter.impl;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.backportal.event.BackPortalEvent;
import com.starwars.app.client.backportal.presenter.BackPortal;


public class BackPortalImpl extends BasePresenter<BackPortal.Display> implements
BackPortal {
	
	@Inject
	public BackPortalImpl(final EventBus eventBus,
			final BackPortal.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	
		registerHandler(display.getHasClickHandlers().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				BackPortalEvent lEvent = new BackPortalEvent();
				eventBus.fireEvent(lEvent);
			}
		}));	
	}
}