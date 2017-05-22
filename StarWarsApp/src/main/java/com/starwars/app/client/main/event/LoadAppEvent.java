package com.starwars.app.client.main.event;

import com.starwars.app.client.abs.presenter.AEvent;


public class LoadAppEvent extends AEvent<LoadAppHandler> {

	public static enum TypeLoad {
		loadLegends,
		loadClassic;
	}

	private static Type<LoadAppHandler> TYPE;

	private TypeLoad mTypeLoad;
	
	public static Type<LoadAppHandler> getType() {
		return TYPE != null ? TYPE : (TYPE = new Type<LoadAppHandler>());
	}

	public LoadAppEvent(TypeLoad iType) {
		mTypeLoad = iType;
	}

	@Override
	public final Type<LoadAppHandler> getAssociatedType() {
		return getType();
	}

	@Override
	protected void dispatch(LoadAppHandler handler) {
		handler.onLoadApp(this);
	}
	
	public TypeLoad getTypeLoad() {
		return mTypeLoad;
	}
}
