package com.starwars.app.client.paper.presenter.impl;

import com.google.gwt.resources.client.ImageResource;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.paper.presenter.MainImage;


public class MainImageImpl extends BasePresenter<MainImage.Display> implements
MainImage {
	
	@Inject
	public MainImageImpl(final EventBus eventBus,
			final MainImage.Display display) {
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