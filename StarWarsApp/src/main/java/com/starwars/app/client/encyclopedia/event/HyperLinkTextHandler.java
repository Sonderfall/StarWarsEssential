package com.starwars.app.client.encyclopedia.event;

import com.google.gwt.event.shared.EventHandler;


public interface HyperLinkTextHandler extends EventHandler {

	void onHyperTextDescription(HyperLinkTextEvent event);

}
