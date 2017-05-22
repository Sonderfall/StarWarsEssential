package com.starwars.app.client.galaxy.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.galaxy.presenter.GalaxyChronologyCursor;


public class GalaxyChronologyCursorImpl extends BasePresenter<GalaxyChronologyCursor.Display> implements GalaxyChronologyCursor {
	
	@Inject
	public GalaxyChronologyCursorImpl(final EventBus eventBus,
			final GalaxyChronologyCursor.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}
}