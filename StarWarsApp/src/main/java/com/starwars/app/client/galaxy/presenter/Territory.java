package com.starwars.app.client.galaxy.presenter;

import com.google.gwt.resources.client.ImageResource;
import com.starwars.app.client.abs.presenter.Presenter;
import com.starwars.app.shared.ComponentElement;
import com.starwars.app.shared.ElementInfo;
import com.starwars.app.shared.ElementInfo.ElementColor;


public interface Territory extends Presenter<Territory.Display> {
	
	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void setImage(ImageResource iImage);
	}
	void init(ComponentElement iInfo, int iXTerritory, int iYTerritory, int iZoom, String iImage, int iXTitle, int iYTitle);
	void init(ElementInfo iInfo, int iXTerritory, int iYTerritory, int iZoom, String iImage, String iName, int iXTitle, int iYTitle, ElementColor iColor);
	void loadDatas();
	int getXCoordonate();
	int getYCoordonate();
	int getZoom();
}
