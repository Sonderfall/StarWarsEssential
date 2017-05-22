package com.starwars.app.client.galaxy.view;

import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.galaxy.presenter.ShowPlanetesButton;

public class ShowPlanetesButtonView extends ADivView implements ShowPlanetesButton.Display {
	
	public ShowPlanetesButtonView() {
		initRoot();
		zoom();
	}
	
	private void initRoot() {
		mRoot.addStyleName(STYLE_GALAXY.showButton());
		mRoot.addStyleName(STYLE.fixed());
	}
}