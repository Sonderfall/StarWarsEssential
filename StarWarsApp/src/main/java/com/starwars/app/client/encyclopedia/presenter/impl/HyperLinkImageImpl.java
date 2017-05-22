package com.starwars.app.client.encyclopedia.presenter.impl;

import com.google.gwt.resources.client.ImageResource;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.encyclopedia.presenter.HyperLinkImage;


public class HyperLinkImageImpl extends BasePresenter<HyperLinkImage.Display> implements
HyperLinkImage {

	@Inject
	public HyperLinkImageImpl(final EventBus eventBus,
			final HyperLinkImage.Display display) {
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
