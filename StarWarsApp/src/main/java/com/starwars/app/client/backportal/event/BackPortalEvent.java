package com.starwars.app.client.backportal.event;

import com.starwars.app.client.abs.presenter.AEvent;


public class BackPortalEvent extends AEvent<BackPortalHandler> {

	private static Type<BackPortalHandler> TYPE;

	public static Type<BackPortalHandler> getType() {
		return TYPE != null ? TYPE : (TYPE = new Type<BackPortalHandler>());
	}

	public BackPortalEvent() {
	}

	@Override
	public final Type<BackPortalHandler> getAssociatedType() {
		return getType();
	}

	@Override
	protected void dispatch(BackPortalHandler handler) {
		handler.onBackPortal(this);
	}
}
