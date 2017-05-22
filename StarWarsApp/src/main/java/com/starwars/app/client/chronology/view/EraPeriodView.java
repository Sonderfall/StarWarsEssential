package com.starwars.app.client.chronology.view;

import com.starwars.app.client.chronology.presenter.EraPeriod;


public class EraPeriodView extends APeriodView implements EraPeriod.Display {
	
	public EraPeriodView() {
		mRoot.addStyleName(STYLE_CHRONOLOGY.yellowPeriod());
		initHeader();
	}
	
	private void initHeader() {
		mHeader.addStyleName(STYLE_CHRONOLOGY.yellowPeriodHeader());
	}
}