package com.starwars.app.client.encyclopedia.event;

import com.starwars.app.client.abs.presenter.AEvent;
import com.starwars.app.client.encyclopedia.presenter.HyperLink;
import com.starwars.app.shared.ElementInfo;


public class HyperLinkTextEvent extends AEvent<HyperLinkTextHandler> {

	private static Type<HyperLinkTextHandler> TYPE;

	private ElementInfo mElementInfo;
	private HyperLink.Display mDisplay;
	
	public static Type<HyperLinkTextHandler> getType() {
		return TYPE != null ? TYPE : (TYPE = new Type<HyperLinkTextHandler>());
	}

	public HyperLinkTextEvent(HyperLink.Display iDisplay, ElementInfo iElementInfo) {
		mDisplay = iDisplay;
		mElementInfo = iElementInfo;
	}

	@Override
	public final Type<HyperLinkTextHandler> getAssociatedType() {
		return getType();
	}

	@Override
	protected void dispatch(HyperLinkTextHandler handler) {
		handler.onHyperTextDescription(this);
	}
	
	public HyperLink.Display getDisplay() {
		return mDisplay;
	}
	
	public ElementInfo getElementInfo() {
		return mElementInfo;
	}
}
