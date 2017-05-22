package com.starwars.app.client.backportal.presenter;

import com.starwars.app.client.abs.presenter.Presenter;


public interface BackPortal extends Presenter<BackPortal.Display> {

	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
	}
}
