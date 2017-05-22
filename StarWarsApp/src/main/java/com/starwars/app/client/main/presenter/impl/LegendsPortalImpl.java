package com.starwars.app.client.main.presenter.impl;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.main.event.PortalClickEvent;
import com.starwars.app.client.main.event.PortalClickEvent.TypePortal;
import com.starwars.app.client.main.event.PortalOverEvent;
import com.starwars.app.client.main.event.PortalOverEvent.TypePortalOver;
import com.starwars.app.client.main.presenter.LegendsPortal;


public class LegendsPortalImpl extends BasePresenter<LegendsPortal.Display> implements
LegendsPortal {

	@Inject
	public LegendsPortalImpl(final EventBus eventBus,
			final LegendsPortal.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
		
		registerHandler(display.getHasMouseOverHandlers().addMouseOverHandler(new MouseOverHandler() {
			
			@Override
			public void onMouseOver(MouseOverEvent event) {
				PortalOverEvent lEvent = new PortalOverEvent(TypePortalOver.showLegends);
				eventBus.fireEvent(lEvent);
			}
		}));
		
		registerHandler(display.getHasMouseOutHandlers().addMouseOutHandler(new MouseOutHandler() {
			
			@Override
			public void onMouseOut(MouseOutEvent event) {
				PortalOverEvent lEvent = new PortalOverEvent(TypePortalOver.hideLegends);
				eventBus.fireEvent(lEvent);
			}
		}));
		
		registerHandler(display.getHasClickHandlers().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				PortalClickEvent lEvent = new PortalClickEvent(TypePortal.legends);
				eventBus.fireEvent(lEvent);
			}
		}));
	}
}
