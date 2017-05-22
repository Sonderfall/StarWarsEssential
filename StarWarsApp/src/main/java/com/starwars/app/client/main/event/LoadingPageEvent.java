package com.starwars.app.client.main.event;

import com.starwars.app.client.abs.presenter.AEvent;


public class LoadingPageEvent extends AEvent<LoadingPageHandler> {

	public static enum TypeLoadingPage {
		update,
		reset
	}

	private static Type<LoadingPageHandler> TYPE;
	private final TypeLoadingPage mTypeEngine;
	private int mProgress;


	public static Type<LoadingPageHandler> getType() {
		return TYPE != null ? TYPE : (TYPE = new Type<LoadingPageHandler>());
	}

	public LoadingPageEvent(TypeLoadingPage iTypeLoadingPage) {
		mTypeEngine = iTypeLoadingPage;
	}

	@Override
	public final Type<LoadingPageHandler> getAssociatedType() {
		return getType();
	}

	@Override
	protected void dispatch(LoadingPageHandler handler) {
		handler.onLoadingPage(this);
	}

	public TypeLoadingPage getTypeEngine() {
		return mTypeEngine;
	}

	public int getProgress() {
		return mProgress;
	}

	public void setProgress(int iProgress) {
		this.mProgress = iProgress;
	}
	
}
