package com.starwars.app.client.main.presenter;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.starwars.app.client.abs.presenter.Presenter;


public interface Footer extends Presenter<Footer.Display> {

	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {

		HasClickHandlers addLanguage(String iLanguage);
		HasClickHandlers addSepLanguage();
		HasClickHandlers addItem(String iName, boolean iLast);
		HasClickHandlers addEndSepLanguage();

	}
	
}
