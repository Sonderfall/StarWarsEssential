package com.starwars.app.client.paper.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.StarWarsApp;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.paper.presenter.AModule;
import com.starwars.app.client.paper.presenter.Description;


public abstract class AModuleImpl<D extends AModule.Display> extends BasePresenter<D> implements
AModule<D> {

	protected final Description mDescription;
	
	@Inject
	public AModuleImpl(final EventBus eventBus,
			final D display) {
		super(eventBus, display);
		mDescription = StarWarsApp.ginjector.getDescription();
	}

	@Override
	public void bind() {
		super.bind();
		mDescription.bind();
	}
	
	@Override
	public void unbind() {
		super.unbind();
		mDescription.unbind();
	}
}
