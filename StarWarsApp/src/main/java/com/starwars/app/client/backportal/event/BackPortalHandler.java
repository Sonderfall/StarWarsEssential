package com.starwars.app.client.backportal.event;

import com.google.gwt.event.shared.EventHandler;


public interface BackPortalHandler extends EventHandler {

	void onBackPortal(BackPortalEvent event);
}
