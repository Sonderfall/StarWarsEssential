package com.starwars.app.client.chronology.view;

import com.starwars.app.client.chronology.presenter.WarPeriod;

public class WarPeriodView extends APeriodView implements WarPeriod.Display {
	
	public WarPeriodView() {
		mRoot.addStyleName(STYLE_CHRONOLOGY.orangePeriod());
		initHeader();
	}
	
	private void initHeader() {
		mHeader.addStyleName(STYLE_CHRONOLOGY.orangePeriodHeader());
	}
}