package com.starwars.app.client.encyclopedia.view;

import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.encyclopedia.presenter.ZoomDiapositive;
import com.starwars.app.client.tools.DivPanel;

public class ZoomDiapositiveView extends ADivView implements ZoomDiapositive.Display {
	
	private final DivPanel mMainWrapper;
	
	public ZoomDiapositiveView() {
		initRoot();
		
		mMainWrapper = new DivPanel();
		mRoot.add(mMainWrapper);
		initMainWrapper();
	}
	
	private void initRoot() {
		mRoot.addStyleName(STYLE.descriptionMask());
	}
	
	private void initMainWrapper() {
	}
}