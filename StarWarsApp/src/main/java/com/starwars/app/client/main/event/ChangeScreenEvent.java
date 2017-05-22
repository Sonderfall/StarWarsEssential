package com.starwars.app.client.main.event;

import com.starwars.app.client.abs.presenter.AEvent;
import com.starwars.app.shared.Info;


public class ChangeScreenEvent extends AEvent<ChangeScreenHandler> {
	
	public static enum TypeChangeScreen {
		home,
		navigation,
		portal
	}
	
	public static enum FromChangeScreen {
		nodepath,
		item
	}
	
	private static Type<ChangeScreenHandler> TYPE;
	private TypeChangeScreen mTypeChangeScreen;
	private FromChangeScreen mFromChangeScreen;
	private Info mInfo;
	private boolean mRealChange;

	public static Type<ChangeScreenHandler> getType() {
		return TYPE != null ? TYPE : (TYPE = new Type<ChangeScreenHandler>());
	}

	public ChangeScreenEvent() {
	}

	@Override
	public final Type<ChangeScreenHandler> getAssociatedType() {
		return getType();
	}

	@Override
	protected void dispatch(ChangeScreenHandler handler) {
		handler.onChangeScreen(this);
	}

	public void setInfo(Info iInfo) {
		mInfo = iInfo;
	}
	
	public Info getInfo() {
		return mInfo;
	}
	
	public TypeChangeScreen getTypeChangeScreen() {
		return mTypeChangeScreen;
	}

	public void setTypeChangeScreen(TypeChangeScreen iTypeChangeScreen) {
		this.mTypeChangeScreen = iTypeChangeScreen;
	}

	public FromChangeScreen getFromChangeScreen() {
		return mFromChangeScreen;
	}

	public void setFromChangeScreen(FromChangeScreen iFromChangeScreen) {
		this.mFromChangeScreen = iFromChangeScreen;
	}

	public boolean isRealChange() {
		return mRealChange;
	}
	
	public boolean setRealChange(boolean iRealChange) {
		return mRealChange;
	}
	
}
