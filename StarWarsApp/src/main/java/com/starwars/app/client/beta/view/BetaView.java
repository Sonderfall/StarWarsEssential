package com.starwars.app.client.beta.view;

import com.google.gwt.dom.client.Style.Cursor;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.beta.presenter.Beta;

public class BetaView extends ADivView implements Beta.Display {
	
	public BetaView() {
		initRoot();
	}
	
	private void initRoot() {
		mRoot.addStyleName(STYLE.itemNav());
		mRoot.addStyleName(STYLE.about());
		mRoot.addStyleName(STYLE.droidsans());
		mRoot.addStyleName(STYLE.f11());
		mRoot.addStyleName(STYLE.transAll());
		mRoot.addStyleName(STYLE.rad3());
		mRoot.addStyleName(STYLE.beta());
		mRoot.getElement().getStyle().setCursor(Cursor.DEFAULT);
		mRoot.setText("-BETA- Optimisée Chrome / Firefox");
	}
}
