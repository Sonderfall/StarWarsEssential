package com.starwars.app.client.paper.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.paper.presenter.DescriptionItem;


public class DescriptionItemImpl extends BasePresenter<DescriptionItem.Display> implements
DescriptionItem {
	
	private String mTitle;
	private String mIcon;
	private String mValue;
	private String mRef;
	
	@Inject
	public DescriptionItemImpl(final EventBus eventBus,
			final DescriptionItem.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}
	
	@Override
	public void init(String iTitle, String iIcon, String iValue, String iRef) {
		mTitle = iTitle;
		mIcon = iIcon;
		mValue = iValue;
		mRef = iRef;
	}
	
	public String getValue() {
		return mValue;
	}
	
	@Override
	public void draw() {
		display.setTitle(mTitle);
		display.setIcon(mIcon);
		display.setValue(mValue);
		display.setUnit(mRef);
	}
}
