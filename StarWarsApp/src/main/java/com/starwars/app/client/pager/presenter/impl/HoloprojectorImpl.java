package com.starwars.app.client.pager.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.pager.presenter.Holoprojector;


public class HoloprojectorImpl extends BasePresenter<Holoprojector.Display> implements
Holoprojector {
	
	@Inject
	public HoloprojectorImpl(final EventBus eventBus,
			final Holoprojector.Display display) {
		super(eventBus, display);
	}
}
