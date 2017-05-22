package com.starwars.app.client.galaxy.event;

import com.google.gwt.event.shared.EventHandler;


public interface GalaxyChronologyHandler extends EventHandler {

	void onGalaxyChronology(GalaxyChronologyEvent event);
}
