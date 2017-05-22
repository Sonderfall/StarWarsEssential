package com.starwars.app.client.encyclopedia.event;

import com.google.gwt.event.shared.EventHandler;


public interface HyperLinkClickHandler extends EventHandler {

	void onHyperTextLink(HyperLinkClickEvent event);

}
