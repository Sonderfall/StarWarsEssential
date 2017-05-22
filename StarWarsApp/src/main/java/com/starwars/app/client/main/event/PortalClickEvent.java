package com.starwars.app.client.main.event;

import com.starwars.app.client.abs.presenter.AEvent;


public class PortalClickEvent extends AEvent<PortalClickHandler> {

	public static enum TypePortal {
		legends,
		classic;
	}

	private static Type<PortalClickHandler> TYPE;
	private TypePortal mTypePortalClick;
	private boolean mFadeOutPortal;


	public static Type<PortalClickHandler> getType() {
		return TYPE != null ? TYPE : (TYPE = new Type<PortalClickHandler>());
	}


	public PortalClickEvent(TypePortal iTypePortalClick) {
		mTypePortalClick = iTypePortalClick;
		mFadeOutPortal = false;
	}

	@Override
	public final Type<PortalClickHandler> getAssociatedType() {
		return getType();
	}

	public TypePortal getTypePortalClick() {
		return mTypePortalClick;
	}
	
	@Override
	protected void dispatch(PortalClickHandler handler) {
		handler.onPortalClick(this);
	}

	public boolean isFadeOutPortal() {
		return mFadeOutPortal;
	}


	public void setFadeOutPortal(boolean iFadeOutPortal) {
		this.mFadeOutPortal = iFadeOutPortal;
	}
}
