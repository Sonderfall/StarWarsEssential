package com.starwars.app.client.about.presenter.impl;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.about.event.AboutDescriptionEvent;
import com.starwars.app.client.about.presenter.About;
import com.starwars.app.client.abs.presenter.BasePresenter;


public class AboutImpl extends BasePresenter<About.Display> implements
About {
	
	@Inject
	public AboutImpl(final EventBus eventBus,
			final About.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	
		registerHandler(display.getHasClickHandlers().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				AboutDescriptionEvent lAboutDescriptionEvent = new AboutDescriptionEvent();
				eventBus.fireEvent(lAboutDescriptionEvent);
			}
		}));
		
	}
}