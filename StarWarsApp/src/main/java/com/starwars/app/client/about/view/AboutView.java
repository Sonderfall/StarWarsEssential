package com.starwars.app.client.about.view;

import com.starwars.app.client.about.presenter.About;
import com.starwars.app.client.abs.view.ADivView;

public class AboutView extends ADivView implements About.Display {
	
	public AboutView() {
		initRoot();
	}
	
	private void initRoot() {
		mRoot.addStyleName(STYLE.itemNav());
		mRoot.addStyleName(STYLE.about());
		mRoot.addStyleName(STYLE.droidsans());
		mRoot.addStyleName(STYLE.f11());
		mRoot.addStyleName(STYLE.transColor());
		mRoot.addStyleName(STYLE.rad3());
		mRoot.addStyleName(STYLE.right());
		mRoot.setText("À propos");
	}	
}