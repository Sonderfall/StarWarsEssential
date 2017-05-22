package com.starwars.app.client.chronology.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.chronology.presenter.WarPeriod;
import com.starwars.app.shared.ElementInfo.ElementColor;


public class WarPeriodImpl extends APeriodImpl<WarPeriod.Display> implements
WarPeriod  {

	@Inject
	public WarPeriodImpl(final EventBus eventBus,
			final WarPeriod.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}
	
	public void setColor() {
		mComponentElement.setColor(ElementColor.orange);
	} 
}
