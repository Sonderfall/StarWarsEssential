package com.starwars.app.client.encyclopedia.presenter;

import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.presenter.Presenter;


public interface DocItem extends Presenter<DocItem.Display> {

	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void setTitle(String iTitle);
		void addSubTitle(String iSubTitle);
		void addText(String iText);
		void addAssociatedImage(int iIndex, Widget iWidget);
		void addHyperText(Widget iWidget);
	}

	void draw();
	void setTitle(String iTitle, boolean  iAddImage);
	void addSubTitle(String iContent);
	void addText(String iContent);
	void addHyperText(String iText);
	void addAssociatedImage(DiapositiveItem iDiapositiveItem);
	void addAssociatedImage(int iTextIndex, DiapositiveItem iDiapositiveItem);
	String getTitle();
}
