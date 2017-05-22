package com.starwars.app.client.research.event;

import java.util.List;

import com.starwars.app.client.abs.presenter.AEvent;
import com.starwars.app.shared.ElementInfo;


public class DisplayResearchEvent extends AEvent<DisplayResearchHandler> {

	private static Type<DisplayResearchHandler> TYPE;

	
	public static Type<DisplayResearchHandler> getType() {
		return TYPE != null ? TYPE : (TYPE = new Type<DisplayResearchHandler>());
	}

	public DisplayResearchEvent() {
	}

	private List<ElementInfo> mElementFind;
	
	@Override
	public final Type<DisplayResearchHandler> getAssociatedType() {
		return getType();
	}

	@Override
	protected void dispatch(DisplayResearchHandler handler) {
		handler.onDisplayResearch(this);
	}

	public void setFinder(List<ElementInfo> elementFind) {
		mElementFind = elementFind;
	}
	
	public List<ElementInfo> getFinder() {
		return mElementFind;
	}
}
