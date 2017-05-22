package com.starwars.app.client.main.event;

import com.google.gwt.event.shared.EventHandler;


public interface LoadAppHandler extends EventHandler {
	void onLoadApp(LoadAppEvent event);
}
