package com.starwars.app.client.encyclopedia.presenter.impl;

import com.google.gwt.resources.client.ImageResource;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.encyclopedia.presenter.DiapositiveItem;
import com.starwars.app.client.resources.StarWarsImageResources;


public class DiapositiveItemImpl extends BasePresenter<DiapositiveItem.Display> implements
DiapositiveItem {
	
	private ImageResource mImage;
	
	@Inject
	public DiapositiveItemImpl(final EventBus eventBus,
			final DiapositiveItem.Display display) {
		super(eventBus, display);
		//mImage = StarWarsImageResources.INSTANCE.logounknown();
		mImage = StarWarsImageResources.INSTANCE.empty();
	}

	@Override
	public void bind() {
		super.bind();
	}
	
	public void init(ImageResource iImage) {
		mImage = iImage;
	}
	
	public void draw() {
		display.setImage(mImage);
	}
	
	public ImageResource getImage() {
		return mImage;
	}
}