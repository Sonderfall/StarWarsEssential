package com.starwars.app.client.abs.presenter;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.starwars.app.client.mct.ASyncCall;

public abstract class AEvent<H extends EventHandler> extends GwtEvent<H> {
		
	private ASyncCall<String> mASyncCall;

	public ASyncCall<String> getASyncCall() {
		return mASyncCall;
	}

	public void setASyncCall(ASyncCall<String> mASyncFunction) {
		this.mASyncCall = mASyncFunction;
	}
}
