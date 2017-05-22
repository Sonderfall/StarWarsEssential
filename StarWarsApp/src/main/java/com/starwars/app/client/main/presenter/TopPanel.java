package com.starwars.app.client.main.presenter;

import com.starwars.app.client.abs.presenter.Presenter;


public interface TopPanel extends Presenter<TopPanel.Display> {

	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void setOpenState();
		void setCloseState();
	}
	void setOpenState();
	void setCloseState();
}
