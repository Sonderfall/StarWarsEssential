package com.starwars.app.client.chronology.view;

import com.starwars.app.client.abs.view.ASpanView;
import com.starwars.app.client.chronology.presenter.ChronoDate;


public class ChronoDateView extends ASpanView implements ChronoDate.Display {

	public ChronoDateView() {
		initRoot();
	}

	private void initRoot() {
		mRoot.addStyleName(STYLE_CHRONOLOGY.date());	
	}
	
	public void setDate(String iDate) {
		mRoot.setText(iDate);
	}
}