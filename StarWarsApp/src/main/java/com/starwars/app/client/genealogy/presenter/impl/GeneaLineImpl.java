package com.starwars.app.client.genealogy.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.genealogy.presenter.GeneaLine;


public class GeneaLineImpl extends BasePresenter<GeneaLine.Display> implements
GeneaLine {

	@Inject
	public GeneaLineImpl(final EventBus eventBus,
			final GeneaLine.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}
}
