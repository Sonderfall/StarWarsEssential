package com.starwars.app.client.encyclopedia.event;

import com.starwars.app.client.abs.presenter.AEvent;
import com.starwars.app.shared.ElementInfo;


public class HyperLinkClickEvent extends AEvent<HyperLinkClickHandler> {

	private static Type<HyperLinkClickHandler> TYPE;

	private ElementInfo mElementInfo;
	
	public static Type<HyperLinkClickHandler> getType() {
		return TYPE != null ? TYPE : (TYPE = new Type<HyperLinkClickHandler>());
	}

	public HyperLinkClickEvent(ElementInfo iElementInfo) {
		mElementInfo = iElementInfo;
	}

	@Override
	public final Type<HyperLinkClickHandler> getAssociatedType() {
		return getType();
	}

	@Override
	protected void dispatch(HyperLinkClickHandler handler) {
		handler.onHyperTextLink(this);
	}
	
	public ElementInfo getElementInfo() {
		return mElementInfo;
	}
}
