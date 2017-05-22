package com.starwars.app.client.pager.presenter;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.starwars.app.client.abs.presenter.Presenter;
import com.starwars.app.client.main.event.PortalClickEvent.TypePortal;
import com.starwars.app.shared.Info;


public interface NodePathItem extends Presenter<NodePathItem.Display> {

	interface Display extends com.starwars.app.client.abs.presenter.ADisplay, HasClickHandlers {
		void setLabel(String iText);
		void setIcon(String iIcon);
		void setActivate();
		void setInactivate();
	}

	void initPortal();
	void initHome(TypePortal iPortal);
	void init(Info iInfo);
	void activate(boolean iActivate);
	Info getInfo();
}
