package com.starwars.app.client.chronology.view;

import com.starwars.app.client.chronology.presenter.ReligionPeriod;

public class ReligionPeriodView extends APeriodView implements ReligionPeriod.Display {
	
	public ReligionPeriodView() {
		mRoot.addStyleName(STYLE_CHRONOLOGY.greenPeriod());
		initHeader();
	}
	
	private void initHeader() {
		mHeader.addStyleName(STYLE_CHRONOLOGY.greenPeriodHeader());
	}
}