package com.starwars.app.client.beta.presenter.impl;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.beta.presenter.Beta;
import com.starwars.app.client.pager.presenter.NodePath;


public class BetaImpl extends BasePresenter<Beta.Display> implements
Beta {
	
	@Inject
	public BetaImpl(final EventBus eventBus,
			final Beta.Display display,
			Provider<NodePath> iProviderNodePath) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();		
	}
}