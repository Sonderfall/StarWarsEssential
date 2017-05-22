package com.starwars.app.client.genealogy.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.genealogy.presenter.UnknownGeneration;


public class UnknownGenerationImpl extends BasePresenter<UnknownGeneration.Display> implements
UnknownGeneration {

	@Inject
	public UnknownGenerationImpl(final EventBus eventBus,
			final UnknownGeneration.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}
}
