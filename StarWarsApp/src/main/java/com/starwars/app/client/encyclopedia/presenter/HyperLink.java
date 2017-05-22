package com.starwars.app.client.encyclopedia.presenter;

import com.starwars.app.client.abs.presenter.Presenter;
import com.starwars.app.shared.ElementInfo;


public interface HyperLink extends Presenter<HyperLink.Display> {

	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void activate();
		void inactivate();
		void inDescription();
	}
	
	void setLink(String iName);
	void setLink(ElementInfo iInfo);
}
