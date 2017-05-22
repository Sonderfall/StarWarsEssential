package com.starwars.app.client.main.presenter;

import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.presenter.Presenter;


public interface Header extends Presenter<Header.Display> {

	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void setNodePath(Widget iWidget);
		void setSearch(Widget iWidget);
		void setAbout(Widget iWidget);
	}
}
