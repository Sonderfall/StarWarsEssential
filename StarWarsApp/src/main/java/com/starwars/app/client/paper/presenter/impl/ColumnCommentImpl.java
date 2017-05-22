package com.starwars.app.client.paper.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.paper.presenter.ColumnImage;
import com.starwars.app.client.paper.presenter.Paper;


public class ColumnCommentImpl extends BasePresenter<ColumnImage.Display> implements
ColumnImage {

	@Inject
	public ColumnCommentImpl(final EventBus eventBus,
			final ColumnImage.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}

	public void setPaper(Paper iPaper) {
	}
	
	public void clearImages() {
		display.clear();
	}
}
