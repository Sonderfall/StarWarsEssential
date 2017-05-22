package com.starwars.app.client.about.event;

import com.starwars.app.client.abs.presenter.AEvent;


public class AboutDescriptionEvent extends AEvent<AboutDescriptionHandler> {

	private static Type<AboutDescriptionHandler> TYPE;

	public static Type<AboutDescriptionHandler> getType() {
		return TYPE != null ? TYPE : (TYPE = new Type<AboutDescriptionHandler>());
	}

	public AboutDescriptionEvent() {
	}

	@Override
	public final Type<AboutDescriptionHandler> getAssociatedType() {
		return getType();
	}

	@Override
	protected void dispatch(AboutDescriptionHandler handler) {
		handler.onAboutDescription(this);
	}
}
