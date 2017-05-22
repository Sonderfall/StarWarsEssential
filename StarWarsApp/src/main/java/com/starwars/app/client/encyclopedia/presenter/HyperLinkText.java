package com.starwars.app.client.encyclopedia.presenter;

import com.google.gwt.user.client.ui.Image;
import com.starwars.app.client.abs.presenter.Presenter;
import com.starwars.app.shared.ElementInfo;


public interface HyperLinkText extends Presenter<HyperLinkText.Display> {

	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void setText(String iText);
		void setImage(Image iImage);
		void show();
		void hide();
	}

	void draw(ElementInfo iElementInfo);
}
