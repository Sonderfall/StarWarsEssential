package com.starwars.app.client.encyclopedia.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.encyclopedia.presenter.HyperLinkText;
import com.starwars.app.shared.ElementInfo;


public class HyperLinkTextImpl extends BasePresenter<HyperLinkText.Display> implements
HyperLinkText {

	@Inject
	public HyperLinkTextImpl(final EventBus eventBus,
			final HyperLinkText.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}
	
	public void draw(ElementInfo iElementInfo) {
		if (iElementInfo == null) {
			display.hide();
		} else if (iElementInfo.getDescription() != null && iElementInfo.getImageResource() != null) {
			display.show();
			display.setText(iElementInfo.getDescription());
			display.setImage(iElementInfo.getHyperTextImage().getDisplay().getImage());
		}
	}
}