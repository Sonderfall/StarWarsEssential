package com.starwars.app.client.about.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.about.presenter.SendButton;
import com.starwars.app.client.abs.presenter.BasePresenter;


public class SendButtonImpl extends BasePresenter<SendButton.Display> implements
SendButton {
	
	@Inject
	public SendButtonImpl(final EventBus eventBus,
			final SendButton.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}
}