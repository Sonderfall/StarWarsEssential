package com.starwars.app.client.chronology.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.chronology.presenter.ReligionPeriod;
import com.starwars.app.shared.ElementInfo.ElementColor;


public class ReligionPeriodImpl extends APeriodImpl<ReligionPeriod.Display> implements
ReligionPeriod  {


	@Inject
	public ReligionPeriodImpl(final EventBus eventBus,
			final ReligionPeriod.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}
	
	public void setColor() {
		mComponentElement.setColor(ElementColor.green);
	}
}
