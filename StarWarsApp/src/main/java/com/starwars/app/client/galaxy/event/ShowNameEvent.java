package com.starwars.app.client.galaxy.event;

import com.starwars.app.client.abs.presenter.AEvent;


public class ShowNameEvent extends AEvent<ShowNameHandler> {

	public static enum ShowName {
		territory,
		planete,
		chronology;
	}
	
	private static Type<ShowNameHandler> TYPE;

	public static Type<ShowNameHandler> getType() {
		return TYPE != null ? TYPE : (TYPE = new Type<ShowNameHandler>());
	}

	public ShowNameEvent() {
	}

	private boolean mIsShow;
	private ShowName mShowName;

	public ShowName getShowName() {
		return mShowName;
	}

	public void setShowName(ShowName iShowName) {
		this.mShowName = iShowName;
	}

	public boolean isIsShow() {
		return mIsShow;
	}

	public void setIsShow(boolean iIsShow) {
		this.mIsShow = iIsShow;
	}

	@Override
	public final Type<ShowNameHandler> getAssociatedType() {
		return getType();
	}

	@Override
	protected void dispatch(ShowNameHandler handler) {
		handler.onShowName(this);
	}
}
