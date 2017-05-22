package com.starwars.app.client.chronology.event;

import com.starwars.app.client.abs.presenter.AEvent;
import com.starwars.app.shared.ComponentElement;


public class ChronoDescriptionEvent extends AEvent<ChronoDescriptionHandler> {

	private static Type<ChronoDescriptionHandler> TYPE;

	public static Type<ChronoDescriptionHandler> getType() {
		return TYPE != null ? TYPE : (TYPE = new Type<ChronoDescriptionHandler>());
	}

	private ComponentElement mComponentElement;
	
	public ChronoDescriptionEvent() {
	}

	public ComponentElement getComponentElement() {
		return mComponentElement;
	}

	public void setComponentElement(ComponentElement iComponentElement) {
		mComponentElement = iComponentElement;
	}
	
	@Override
	public final Type<ChronoDescriptionHandler> getAssociatedType() {
		return getType();
	}

	@Override
	protected void dispatch(ChronoDescriptionHandler handler) {
		handler.onChronoDescription(this);
	}
}
