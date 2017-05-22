package com.starwars.app.client.pager.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.pager.presenter.Circle;


public class CircleImpl extends BasePresenter<Circle.Display> implements
Circle {
	
	@Inject
	public CircleImpl(final EventBus eventBus,
			final Circle.Display display) {
		super(eventBus, display);
	}
}
