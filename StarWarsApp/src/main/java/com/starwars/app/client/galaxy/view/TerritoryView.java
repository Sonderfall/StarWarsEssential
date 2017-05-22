package com.starwars.app.client.galaxy.view;

import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.Image;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.galaxy.presenter.Territory;

public class TerritoryView extends ADivView implements Territory.Display {
	
	private final Image mTerritory;
	
	public TerritoryView() {
		mTerritory = new Image();
		mRoot.add(mTerritory);
		
		mRoot.getElement().getStyle().setPosition(Position.ABSOLUTE);
	}
	
	public void setImage(ImageResource iImage) {
		mTerritory.setResource(iImage);
		mTerritory.addStyleName(STYLE_GALAXY.territory());
	}
}