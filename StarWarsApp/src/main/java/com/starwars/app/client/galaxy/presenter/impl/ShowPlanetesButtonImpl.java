package com.starwars.app.client.galaxy.presenter.impl;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.galaxy.event.ShowNameEvent;
import com.starwars.app.client.galaxy.event.ShowNameEvent.ShowName;
import com.starwars.app.client.galaxy.presenter.ShowPlanetesButton;


public class ShowPlanetesButtonImpl extends BasePresenter<ShowPlanetesButton.Display> implements
ShowPlanetesButton {

	private boolean mIsShow;
	
	@Inject
	public ShowPlanetesButtonImpl(final EventBus eventBus,
			final ShowPlanetesButton.Display display) {
		super(eventBus, display);
		mIsShow = false;
		display.setText("Afficher les planètes");
	}

	@Override
	public void bind() {
		super.bind();
		
		registerHandler(display.getHasClickHandlers().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				ShowNameEvent lEvent = new ShowNameEvent();
				lEvent.setShowName(ShowName.planete);
				if (!mIsShow)  {
					display.setText("Cacher les planètes");
				} else {
					display.setText("Afficher les planètes");
				}
				mIsShow = !mIsShow;
				lEvent.setIsShow(mIsShow);
				eventBus.fireEvent(lEvent);
			}
		}));
	}
}
