package com.starwars.app.client.galaxy.presenter.impl;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.galaxy.event.ShowNameEvent;
import com.starwars.app.client.galaxy.event.ShowNameEvent.ShowName;
import com.starwars.app.client.galaxy.presenter.ShowChronologyButton;


public class ShowChronologyButtonImpl extends BasePresenter<ShowChronologyButton.Display> implements
ShowChronologyButton {

	private boolean mIsShow;
	
	@Inject
	public ShowChronologyButtonImpl(final EventBus eventBus,
			final ShowChronologyButton.Display display) {
		super(eventBus, display);
		mIsShow = true;
		display.setText("Cacher la chronologie");
	}

	@Override
	public void bind() {
		super.bind();
		
		registerHandler(display.getHasClickHandlers().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				ShowNameEvent lEvent = new ShowNameEvent();
				lEvent.setShowName(ShowName.chronology);
				if (!mIsShow)  {
					display.setText("Cacher la chronologie");
				} else {
					display.setText("Afficher la chronologie");
				}
				lEvent.setIsShow(mIsShow);
				mIsShow = !mIsShow;
				eventBus.fireEvent(lEvent);
			}
		}));
	}
}
