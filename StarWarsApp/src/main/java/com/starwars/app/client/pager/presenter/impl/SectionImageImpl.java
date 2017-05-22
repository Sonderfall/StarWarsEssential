package com.starwars.app.client.pager.presenter.impl;

import com.google.gwt.resources.client.ImageResource;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.pager.presenter.SectionImage;


public class SectionImageImpl extends BasePresenter<SectionImage.Display> implements
SectionImage {

	@Inject
	public SectionImageImpl(final EventBus eventBus,
			final SectionImage.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}

	public void init(ImageResource iImage) {
		display.setImage(iImage);
	}
}
