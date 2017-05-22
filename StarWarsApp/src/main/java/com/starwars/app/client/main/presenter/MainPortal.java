package com.starwars.app.client.main.presenter;

import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.presenter.Presenter;


public interface MainPortal extends Presenter<MainPortal.Display> {

	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void addClassicPortal(Widget iWidget);
		void addLegendsPortal(Widget iWidget);
		void addClassicPortalText(Widget iWidget);
		void addLegendsPortalText(Widget iWidget);
		void addCircle(Widget iWidget);
		void loadMode();
		void portalMode();
		void fadeOutPortals();
		void fadeInPortals();
	}

	void reset();
}
