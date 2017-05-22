package com.starwars.app.client.main.event;

import com.starwars.app.client.abs.presenter.AEvent;


public class ProgressBarEvent extends AEvent<ProgressBarHandler> {

	public static enum TypeProgressBar {
		show,
		hide,
		update,
		reset
	}

	private static Type<ProgressBarHandler> TYPE;
	private final TypeProgressBar mTypeEngine;
	private int mProgress;


	public static Type<ProgressBarHandler> getType() {
		return TYPE != null ? TYPE : (TYPE = new Type<ProgressBarHandler>());
	}

	public ProgressBarEvent(TypeProgressBar iTypeProgressBar) {
		mTypeEngine = iTypeProgressBar;
	}

	@Override
	public final Type<ProgressBarHandler> getAssociatedType() {
		return getType();
	}

	@Override
	protected void dispatch(ProgressBarHandler handler) {
		handler.onProgressBar(this);
	}

	public TypeProgressBar getTypeEngine() {
		return mTypeEngine;
	}

	public int getProgress() {
		return mProgress;
	}

	public void setProgress(int iProgress) {
		this.mProgress = iProgress;
	}
	
}
