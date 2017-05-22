package com.starwars.app.client.encyclopedia.presenter;

import com.google.gwt.resources.client.ImageResource;
import com.starwars.app.client.abs.presenter.Presenter;


public interface DiapositiveItem extends Presenter<DiapositiveItem.Display> {

	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void setImage(ImageResource iImage);
		void setNormalPosition();
		void setZoomPosition();
	}
	void draw();
	void init(ImageResource iImage);
	ImageResource getImage();
}
