package com.starwars.app.client.chronology.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.chronology.presenter.EraPeriod;
import com.starwars.app.shared.ElementInfo.ElementColor;


public class EraPeriodImpl extends APeriodImpl<EraPeriod.Display> implements
EraPeriod  {

	@Inject
	public EraPeriodImpl(final EventBus eventBus,
			final EraPeriod.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}
	
	public void setColor() {
		mComponentElement.setColor(ElementColor.yellow);
	}
}
