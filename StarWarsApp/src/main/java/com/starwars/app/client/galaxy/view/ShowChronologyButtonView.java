package com.starwars.app.client.galaxy.view;

import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.galaxy.presenter.ShowChronologyButton;

public class ShowChronologyButtonView extends ADivView implements ShowChronologyButton.Display {
	
	public ShowChronologyButtonView() {
		initRoot();
		zoom();
	}
	
	private void initRoot() {
		mRoot.addStyleName(STYLE_GALAXY.showButton());
		mRoot.addStyleName(STYLE.fixed());
	}
}