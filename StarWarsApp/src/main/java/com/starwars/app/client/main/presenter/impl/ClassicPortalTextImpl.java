package com.starwars.app.client.main.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.main.presenter.ClassicPortalText;


public class ClassicPortalTextImpl extends BasePresenter<ClassicPortalText.Display> implements
ClassicPortalText {

	@Inject
	public ClassicPortalTextImpl(final EventBus eventBus,
			final ClassicPortalText.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}
}
