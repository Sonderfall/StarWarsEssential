package com.starwars.app.client.chronology.presenter;

import com.starwars.app.client.abs.presenter.Presenter;

public interface ChronoDate extends Presenter<ChronoDate.Display> {
	
	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void setDate(String iText);
	}
	
	void init(int iDate);
	void init(int iDate, String iApprox);
	void draw();
	int getDate();
}
