package com.starwars.app.client.main.event;

import com.starwars.app.client.abs.presenter.AEvent;


public class APResizeEvent extends AEvent<APResizeHandler> {

	private static Type<APResizeHandler> TYPE;


	public static Type<APResizeHandler> getType() {
		return TYPE != null ? TYPE : (TYPE = new Type<APResizeHandler>());
	}

	public APResizeEvent() {
	}

	@Override
	public final Type<APResizeHandler> getAssociatedType() {
		return getType();
	}

	@Override
	protected void dispatch(APResizeHandler handler) {
		handler.onAPResize(this);
	}	
}
