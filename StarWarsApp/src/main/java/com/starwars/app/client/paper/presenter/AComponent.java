package com.starwars.app.client.paper.presenter;

import com.starwars.app.client.abs.presenter.ADisplay;
import com.starwars.app.client.abs.presenter.Presenter;
import com.starwars.app.shared.ComponentElement;
import com.starwars.app.shared.ElementInfo;
import com.starwars.app.shared.ElementInfo.ElementColor;

public interface AComponent<D extends ADisplay> extends Presenter<D> {

	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
	}
	
	void init(ComponentElement iComponentElement);
	void init(ElementInfo iInfo);
	void init(ElementInfo iInfo, String iTitle);
	void init(ElementInfo iInfo, String iTitle, ElementColor iColor);
	void init(ElementInfo iInfo, ElementColor iColor);
	ComponentElement getComponentElement();
}
