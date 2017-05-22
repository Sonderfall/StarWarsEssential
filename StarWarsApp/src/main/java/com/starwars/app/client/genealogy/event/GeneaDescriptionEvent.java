package com.starwars.app.client.genealogy.event;

import com.starwars.app.client.abs.presenter.AEvent;
import com.starwars.app.shared.ComponentElement;


public class GeneaDescriptionEvent extends AEvent<GeneaDescriptionHandler> {

	private static Type<GeneaDescriptionHandler> TYPE;

	private ComponentElement mGeneaInfo;
	
	public static Type<GeneaDescriptionHandler> getType() {
		return TYPE != null ? TYPE : (TYPE = new Type<GeneaDescriptionHandler>());
	}

	public GeneaDescriptionEvent() {
	}

	public ComponentElement getGeneaInfo() {
		return mGeneaInfo;
	}

	public void setGeneaInfo(ComponentElement iGeneaInfo) {
		mGeneaInfo = iGeneaInfo;
	}
	
	@Override
	public final Type<GeneaDescriptionHandler> getAssociatedType() {
		return getType();
	}

	@Override
	protected void dispatch(GeneaDescriptionHandler handler) {
		handler.onGeneaDescription(this);
	}
}
