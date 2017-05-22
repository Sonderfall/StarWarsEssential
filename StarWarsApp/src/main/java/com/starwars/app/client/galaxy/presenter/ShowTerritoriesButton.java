package com.starwars.app.client.galaxy.presenter;

import com.starwars.app.client.abs.presenter.Presenter;


public interface ShowTerritoriesButton extends Presenter<ShowTerritoriesButton.Display> {
	
	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
	}

	void reset();
}
