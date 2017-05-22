package com.starwars.app.client.galaxy.view;

import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.galaxy.presenter.ShowTerritoriesButton;

public class ShowTerritoriesButtonView extends ADivView implements ShowTerritoriesButton.Display {
	
	public ShowTerritoriesButtonView() {
		initRoot();
		zoom();
	}
	
	private void initRoot() {
		mRoot.addStyleName(STYLE_GALAXY.showButton());
		mRoot.addStyleName(STYLE.fixed());
	}
}