package com.starwars.app.client.encyclopedia.presenter;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.Image;
import com.starwars.app.client.abs.presenter.Presenter;


public interface HyperLinkImage extends Presenter<HyperLinkImage.Display> {
	
	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void setImage(ImageResource iImage);
		Image getImage();
	}
	void init(ImageResource iImage);
}
