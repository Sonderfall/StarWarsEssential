package com.starwars.app.client.chronology.view;

import com.starwars.app.client.chronology.presenter.GouvPeriod;

public class GouvPeriodView extends APeriodView implements GouvPeriod.Display {
	
	public GouvPeriodView() {
	}
	
	@Override
	public void setBlueStyle() {
		mRoot.addStyleName(STYLE_CHRONOLOGY.bluePeriod());
		mHeader.addStyleName(STYLE_CHRONOLOGY.bluePeriodHeader());
	}

	@Override
	public void setPurpletStyle() {
		mRoot.addStyleName(STYLE_CHRONOLOGY.purplePeriod());
		mHeader.addStyleName(STYLE_CHRONOLOGY.purplePeriodHeader());
	}
}