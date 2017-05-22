package com.starwars.app.client.galaxy.presenter;

import com.starwars.app.client.abs.presenter.Presenter;

public interface GalaxyText extends Presenter<GalaxyText.Display> {

	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void setDate(String iDate);
		void setTitle(String iTitle);
		void setText(String iText);
	}
	void draw(GalaxyPeriod iGalaxyPeriod, int iDate);
}
