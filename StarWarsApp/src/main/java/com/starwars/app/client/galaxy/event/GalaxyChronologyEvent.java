package com.starwars.app.client.galaxy.event;

import com.starwars.app.client.abs.presenter.AEvent;


public class GalaxyChronologyEvent extends AEvent<GalaxyChronologyHandler> {

	private static Type<GalaxyChronologyHandler> TYPE;

	public static Type<GalaxyChronologyHandler> getType() {
		return TYPE != null ? TYPE : (TYPE = new Type<GalaxyChronologyHandler>());
	}

	private int mDate;
	private int mLeft;
	
	public GalaxyChronologyEvent() {
	}

	public int getDate() {
		return mDate;
	}

	public void setDate(int iDate) {
		mDate = iDate;
	}
	
	public int getLeft() {
		return mLeft;
	}
	
	public void setLeft(int iLeft) {
		mLeft = iLeft;
	}
	
	@Override
	public final Type<GalaxyChronologyHandler> getAssociatedType() {
		return getType();
	}

	@Override
	protected void dispatch(GalaxyChronologyHandler handler) {
		handler.onGalaxyChronology(this);
	}
}
