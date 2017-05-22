package com.starwars.app.client.tools;


import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class ToolsImpl implements ITools {

	protected final EventBus eventBus;

	@Inject
	public ToolsImpl(final EventBus eventBus) {
		this.eventBus = eventBus;
	}

	public void sendText(String iString) {
		Logger.getLogger("").log(Level.INFO, iString);
	}
}
