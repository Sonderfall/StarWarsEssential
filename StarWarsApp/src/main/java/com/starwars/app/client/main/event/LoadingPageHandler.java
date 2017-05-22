package com.starwars.app.client.main.event;

import com.google.gwt.event.shared.EventHandler;


public interface LoadingPageHandler extends EventHandler {

	void onLoadingPage(LoadingPageEvent event);

}
