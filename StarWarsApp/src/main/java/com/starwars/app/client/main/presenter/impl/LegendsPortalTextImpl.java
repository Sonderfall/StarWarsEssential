package com.starwars.app.client.main.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.main.presenter.LegendsPortalText;


public class LegendsPortalTextImpl extends BasePresenter<LegendsPortalText.Display> implements
LegendsPortalText {

	@Inject
	public LegendsPortalTextImpl(final EventBus eventBus,
			final LegendsPortalText.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}
}
