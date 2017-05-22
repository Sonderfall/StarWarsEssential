package com.starwars.app.client.pager.presenter;

import com.starwars.app.client.abs.presenter.Presenter;


public interface Holoprojector extends Presenter<Holoprojector.Display> {

	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
	}
}
