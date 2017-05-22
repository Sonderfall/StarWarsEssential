package com.starwars.app.client.galaxy.presenter;

import com.starwars.app.client.abs.presenter.Presenter;

public interface GalaxyChronologyPeriodDate extends Presenter<GalaxyChronologyPeriodDate.Display> {
	
	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void addDate(String iDate, int iLeft);
	}
	void init(int iDate, int iLeft);
}
