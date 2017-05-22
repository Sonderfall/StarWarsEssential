package com.starwars.app.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface EngineResource extends ClientBundle {

	public static final EngineResource INSTANCE =  GWT.create(EngineResource.class);
	
	@Source("engine/js/naclhandlers.js")
	TextResource Naclhandlers();
		
}
