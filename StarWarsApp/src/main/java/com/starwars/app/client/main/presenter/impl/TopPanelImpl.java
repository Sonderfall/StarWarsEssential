package com.starwars.app.client.main.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.main.presenter.TopPanel;


public class TopPanelImpl extends BasePresenter<TopPanel.Display> implements
TopPanel {
	
	@Inject
	public TopPanelImpl(final EventBus eventBus,
			final TopPanel.Display display) {
		super(eventBus, display);
			
	}

	@Override
	public void bind() {
		super.bind();
	}

	@Override
	public void setOpenState() {
		display.setOpenState();
	}

	@Override
	public void setCloseState() {
		display.setCloseState();
	}

}
