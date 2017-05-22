package com.starwars.app.client.galaxy.presenter.impl;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.galaxy.event.GalaxyDescriptionEvent;
import com.starwars.app.client.galaxy.presenter.TerritoryTitle;
import com.starwars.app.client.paper.presenter.impl.AComponentImpl;
import com.starwars.app.shared.ComponentElement;
import com.starwars.app.shared.ElementInfo;


public class TerritoryTitleImpl extends AComponentImpl<TerritoryTitle.Display> implements
TerritoryTitle {

	@Inject
	public TerritoryTitleImpl(final EventBus eventBus,
			final TerritoryTitle.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
		
		registerHandler(display.getHasClickHandlers().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				GalaxyDescriptionEvent lDescriptionEvent = new GalaxyDescriptionEvent();
				lDescriptionEvent.setInfo(mComponentElement);
				eventBus.fireEvent(lDescriptionEvent);
			}
		}));
	}
	
	public void init() {}
	
	@Override
	public void init(ElementInfo iInfo, int iX, int iY) {
		mComponentElement = new ComponentElement(iInfo);
		init(mComponentElement, iX, iY);
	}
	
	@Override
	public void init(ComponentElement iElement, int iX, int iY) {
		init(iElement);
		mComponentElement = iElement;
		display.setTitle(iElement.getTitle(), iX, iY);
		switch (iElement.getColor()) {
		case blue:
			display.setBlueTitle();
			break;
		case orange:
			display.setOrangeTitle();
			break;
		case yellow:
			display.setYellowTitle();
			break;
		case red:
			display.setRedTitle();
			break;
		case green:
			display.setGreenTitle();
			break;
		case purple:
			display.setPurpleTitle();
			break;
		default:
			display.setBlueTitle();
			break;
		}
	}
	
	public void loadDatas() {
		mComponentElement.getInfo().loadDatas();
	}
}