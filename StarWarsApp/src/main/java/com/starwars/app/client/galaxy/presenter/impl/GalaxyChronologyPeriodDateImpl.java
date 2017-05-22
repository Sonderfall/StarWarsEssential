package com.starwars.app.client.galaxy.presenter.impl;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.galaxy.event.GalaxyChronologyEvent;
import com.starwars.app.client.galaxy.presenter.GalaxyChronologyPeriodDate;


public class GalaxyChronologyPeriodDateImpl extends BasePresenter<GalaxyChronologyPeriodDate.Display> implements GalaxyChronologyPeriodDate {
	
	private int mDate; 
	private int mLeft; 
	
	@Inject
	public GalaxyChronologyPeriodDateImpl(final EventBus eventBus,
			final GalaxyChronologyPeriodDate.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
		
		registerHandler(display.getHasClickHandlers().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				GalaxyChronologyEvent lEvent = new GalaxyChronologyEvent();
				lEvent.setLeft(mLeft);
				lEvent.setDate(mDate);
				eventBus.fireEvent(lEvent);
			}
		}));
		
	}

	@Override
	public void init(int iDate, int iLeft) {
		mDate = iDate;
		mLeft = iLeft;
		display.addDate(String.valueOf(iDate), iLeft);
	}
}
