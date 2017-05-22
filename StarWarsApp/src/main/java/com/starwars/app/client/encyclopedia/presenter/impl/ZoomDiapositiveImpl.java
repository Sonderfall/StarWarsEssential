package com.starwars.app.client.encyclopedia.presenter.impl;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.encyclopedia.presenter.ZoomDiapositive;


public class ZoomDiapositiveImpl extends BasePresenter<ZoomDiapositive.Display> implements
ZoomDiapositive {

	@Inject
	public ZoomDiapositiveImpl(final EventBus eventBus,
			final ZoomDiapositive.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
		
		registerHandler(display.getHasClickHandlers().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				display.hide();
			}
		}));
	}

/*	public void draw(Image iImage) {
		display.setImage(iImage);
	}*/
}
