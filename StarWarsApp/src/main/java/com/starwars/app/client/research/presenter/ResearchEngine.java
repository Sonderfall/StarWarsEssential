package com.starwars.app.client.research.presenter;

import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.presenter.Presenter;


public interface ResearchEngine extends Presenter<ResearchEngine.Display> {

	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void addTextBox(Widget iWidget);
	}

	void clearFinder();
	void clear();
}
