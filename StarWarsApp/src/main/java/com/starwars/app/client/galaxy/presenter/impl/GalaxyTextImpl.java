package com.starwars.app.client.galaxy.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.galaxy.presenter.GalaxyPeriod;
import com.starwars.app.client.galaxy.presenter.GalaxyText;


public class GalaxyTextImpl extends BasePresenter<GalaxyText.Display> implements
GalaxyText {

	@Inject
	public GalaxyTextImpl(final EventBus eventBus,
			final GalaxyText.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}
	
	public void draw(GalaxyPeriod iGalaxyPeriod, int iDate) {
		String lDate = iDate < 0 ? Math.abs(iDate) + " Av. BY" : iDate + " Ap. BY";
		display.setDate(lDate);
		display.setTitle(iGalaxyPeriod.getTitle());
		display.setText(iGalaxyPeriod.getText());
	}
}