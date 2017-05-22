package com.starwars.app.client.paper.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.paper.presenter.AComponent;
import com.starwars.app.shared.ComponentElement;
import com.starwars.app.shared.ElementInfo;
import com.starwars.app.shared.ElementInfo.ElementColor;


public abstract class AComponentImpl<D extends AComponent.Display> extends BasePresenter<D> implements
AComponent<D> {

	protected ComponentElement mComponentElement;
	
	@Inject
	public AComponentImpl(final EventBus eventBus,
			final D display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}
	
	@Override
	public void unbind() {
		super.unbind();
	}
	
	public void init(ComponentElement iComponentElement) {
		mComponentElement = iComponentElement;
	}

	public void init(ElementInfo iInfo) {
		mComponentElement = new ComponentElement(iInfo);
	}
	
	public void init(ElementInfo iInfo, String iTitle) {
		mComponentElement = new ComponentElement(iInfo, iTitle);
	}
	
	public void init(ElementInfo iInfo, String iTitle, ElementColor iColor) {
		mComponentElement = new ComponentElement(iInfo, iColor, iTitle);
	}
	
	public void init(ElementInfo iInfo, ElementColor iColor) {
		mComponentElement = new ComponentElement(iInfo, iColor);
	}
	
	public ComponentElement getComponentElement() {
		return mComponentElement;
	}
}
