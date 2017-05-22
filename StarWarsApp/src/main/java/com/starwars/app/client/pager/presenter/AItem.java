package com.starwars.app.client.pager.presenter;

import com.starwars.app.client.abs.presenter.ADisplay;
import com.starwars.app.client.abs.presenter.Presenter;
import com.starwars.app.client.pager.presenter.ColumnContainer.ColumnMode;
import com.starwars.app.shared.Info;


public interface AItem<I extends Info, D extends ADisplay> extends Presenter<D> {

	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void setLockedMode();
		void setUnlockedMode();
		void setActiveState();
		void setInactiveState();
		void setOver();
		void setOut();

		void setTextTitle(String iTitle);
		void setIcon(String iIcon);
	}
	
	void init(I iInfo);
	I getInfo();
	void reset();
	void activate();
	void changeColumnMode(ColumnMode iColumnMode);
}
