package com.starwars.app.client.main.event;

import com.starwars.app.client.abs.presenter.AEvent;


public class PortalOverEvent extends AEvent<PortalOverHandler> {

	public static enum TypePortalOver {
		showLegends,
		showClassic,
		hideLegends,
		hideClassic;
	}

	private static Type<PortalOverHandler> TYPE;
	private TypePortalOver mTypePortalOver;


	public static Type<PortalOverHandler> getType() {
		return TYPE != null ? TYPE : (TYPE = new Type<PortalOverHandler>());
	}


	public PortalOverEvent(TypePortalOver iTypePortalOver) {
		mTypePortalOver = iTypePortalOver;
	}

	@Override
	public final Type<PortalOverHandler> getAssociatedType() {
		return getType();
	}

	public TypePortalOver getTypePortalOver() {
		return mTypePortalOver;
	}
	
	@Override
	protected void dispatch(PortalOverHandler handler) {
		handler.onPortalOver(this);
	}
}
