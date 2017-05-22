package com.starwars.app.client.backportal.view;

import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.backportal.presenter.BackPortal;

public class BackPortalView extends ADivView implements BackPortal.Display {
	
	public BackPortalView() {
		initRoot();
	}
	
	private void initRoot() {
		mRoot.addStyleName(STYLE.itemNav());
		mRoot.addStyleName(STYLE.about());
		mRoot.addStyleName(STYLE.droidsans());
		mRoot.addStyleName(STYLE.f11());
		mRoot.addStyleName(STYLE.transColor());
		mRoot.addStyleName(STYLE.left());
		mRoot.addStyleName(STYLE.rad3());
		mRoot.setText("Accueil");
	}
}
