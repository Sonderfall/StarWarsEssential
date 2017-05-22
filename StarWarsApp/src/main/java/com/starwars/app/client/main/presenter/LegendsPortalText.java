package com.starwars.app.client.main.presenter;

import com.starwars.app.client.abs.presenter.Presenter;


public interface LegendsPortalText extends Presenter<LegendsPortalText.Display> {

	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void hide();
		void show();
	}
}
