package com.starwars.app.client.main.presenter;

import com.starwars.app.client.abs.presenter.Presenter;


public interface ClassicPortalText extends Presenter<ClassicPortalText.Display> {

	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void hide();
		void show();
	}
}

