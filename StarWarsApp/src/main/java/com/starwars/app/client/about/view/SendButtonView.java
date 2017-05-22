package com.starwars.app.client.about.view;

import com.starwars.app.client.about.presenter.SendButton;
import com.starwars.app.client.abs.view.ADivView;

public class SendButtonView extends ADivView implements SendButton.Display {
	
	public SendButtonView() {
		initRoot();
	}
	
	private void initRoot() {
		mRoot.addStyleName(STYLE_GALAXY.showButton());
		mRoot.addStyleName(STYLE.right());
		mRoot.setText("Envoyer");
	}	
}