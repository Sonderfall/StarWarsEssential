package com.starwars.app.client.main.event;

import com.google.gwt.event.shared.EventHandler;


public interface ChangeScreenHandler extends EventHandler {

	void onChangeScreen(ChangeScreenEvent event);

}
