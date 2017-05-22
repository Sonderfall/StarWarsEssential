package com.starwars.app.client.galaxy.presenter;

import java.util.List;

import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.presenter.Presenter;

public interface GalaxyChronology extends Presenter<GalaxyChronology.Display> {
	
	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void addPeriodDate(Widget iWidget);
	}
	
	void process(int iInitDate);
	List<Integer> getDates();
}
