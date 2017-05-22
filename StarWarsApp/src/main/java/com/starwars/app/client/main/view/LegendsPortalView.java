
package com.starwars.app.client.main.view;

import com.google.gwt.user.client.ui.Image;
import com.starwars.app.client.abs.view.ASpanView;
import com.starwars.app.client.main.presenter.LegendsPortal;
import com.starwars.app.client.resources.StarWarsImageResources;

public class LegendsPortalView extends ASpanView implements LegendsPortal.Display {

	private final Image mImage;
	
	public LegendsPortalView() {
		initRoot();
		
		mImage = new Image();
		mRoot.add(mImage);
		initImage();
	}
	
	private void initRoot() {
		mRoot.addStyleName(STYLE.portal());
		mRoot.addStyleName(STYLE.legendsPortal());
	}
	
	private void initImage() {
		mImage.setResource(StarWarsImageResources.INSTANCE.legends());
		mImage.addStyleName(STYLE.legendsPortalImage());
//		mImage.addStyleName(STYLE.reflect());
	}
}
