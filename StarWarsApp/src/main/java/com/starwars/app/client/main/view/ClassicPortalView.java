package com.starwars.app.client.main.view;

import com.google.gwt.user.client.ui.Image;
import com.starwars.app.client.abs.view.ASpanView;
import com.starwars.app.client.main.presenter.ClassicPortal;
import com.starwars.app.client.resources.StarWarsImageResources;

public class ClassicPortalView extends ASpanView implements ClassicPortal.Display {

	private final Image mImage;
	
	public ClassicPortalView() {
		initRoot();
		
		mImage = new Image();
		mRoot.add(mImage);
		initImage();
	}
	
	private void initRoot() {
		mRoot.addStyleName(STYLE.portal());
		mRoot.addStyleName(STYLE.classicPortal());
	}
	
	private void initImage() {
		mImage.setResource(StarWarsImageResources.INSTANCE.classic());
		mImage.addStyleName(STYLE.classicPortalImage());
//		mImage.addStyleName(STYLE.reflect());
	}
}
