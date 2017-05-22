package com.starwars.app.client.galaxy.event;

import com.starwars.app.client.abs.presenter.AEvent;
import com.starwars.app.shared.ComponentElement;


public class GalaxyDescriptionEvent extends AEvent<GalaxyDescriptionHandler> {

	private static Type<GalaxyDescriptionHandler> TYPE;

	public static Type<GalaxyDescriptionHandler> getType() {
		return TYPE != null ? TYPE : (TYPE = new Type<GalaxyDescriptionHandler>());
	}

	private ComponentElement mAAdvancedComponentInfo;
	
	public GalaxyDescriptionEvent() {}

	public ComponentElement getInfo() {
		return mAAdvancedComponentInfo;
	}

	public void setInfo(ComponentElement iAAdvancedComponentInfo) {
		mAAdvancedComponentInfo = iAAdvancedComponentInfo;
	}
	
	@Override
	public final Type<GalaxyDescriptionHandler> getAssociatedType() {
		return getType();
	}

	@Override
	protected void dispatch(GalaxyDescriptionHandler handler) {
		handler.onGalaxyDescription(this);
	}
}
