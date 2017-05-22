package com.starwars.app.client.galaxy.presenter.impl;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.galaxy.event.ShowNameEvent;
import com.starwars.app.client.galaxy.event.ShowNameEvent.ShowName;
import com.starwars.app.client.galaxy.presenter.ShowTerritoriesButton;


public class ShowTerritoriesButtonImpl extends BasePresenter<ShowTerritoriesButton.Display> implements
ShowTerritoriesButton {

	private boolean mIsShow;
	
	@Inject
	public ShowTerritoriesButtonImpl(final EventBus eventBus,
			final ShowTerritoriesButton.Display display) {
		super(eventBus, display);
		reset();
	}

	@Override
	public void bind() {
		super.bind();
		
		registerHandler(display.getHasClickHandlers().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				ShowNameEvent lEvent = new ShowNameEvent();
				lEvent.setShowName(ShowName.territory);
				if (!mIsShow)  {
					display.setText("Cacher infos sup.");
				} else {
					display.setText("Afficher infos sup.");
				}
				lEvent.setIsShow(mIsShow);
				mIsShow = !mIsShow;
				eventBus.fireEvent(lEvent);
			}
		}));
	}

	@Override
	public void reset() {
		mIsShow = true;
		display.setText("Cacher infos sup.");
	}
}
