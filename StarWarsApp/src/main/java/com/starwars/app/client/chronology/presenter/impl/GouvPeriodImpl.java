package com.starwars.app.client.chronology.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.chronology.presenter.GouvPeriod;
import com.starwars.app.shared.ElementInfo.ElementColor;


public class GouvPeriodImpl extends APeriodImpl<GouvPeriod.Display> implements
GouvPeriod {

	private boolean mIsMajorGouv;
	
	@Inject
	public GouvPeriodImpl(final EventBus eventBus,
			final GouvPeriod.Display display) {
		super(eventBus, display);
		mIsMajorGouv = true;
	}

	@Override
	public void bind() {
		super.bind();
	}
	
	@Override
	public void setMajorGouv(boolean iIsMajorGouv) {
		mIsMajorGouv = iIsMajorGouv;
	}
	
	@Override
	public void draw() {
		super.draw();
		
		if (mIsMajorGouv) {
			display.setBlueStyle();
			mComponentElement.setColor(ElementColor.blue);
		} else {
			display.setPurpletStyle();
			mComponentElement.setColor(ElementColor.purple);
		}
	}

	@Override
	public void setColor() {
		// TODO Auto-generated method stub
		
	}
}
