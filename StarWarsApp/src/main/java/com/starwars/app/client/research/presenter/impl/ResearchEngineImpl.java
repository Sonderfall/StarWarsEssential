package com.starwars.app.client.research.presenter.impl;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.ui.TextArea;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.research.event.DisplayResearchEvent;
import com.starwars.app.client.research.presenter.ResearchEngine;
import com.starwars.app.shared.DataBase;


public class ResearchEngineImpl extends BasePresenter<ResearchEngine.Display> implements
ResearchEngine {

	private final TextArea mTextArea;
	
	@Inject
	public ResearchEngineImpl(final EventBus eventBus,
			final ResearchEngine.Display display) {
		super(eventBus, display);
		mTextArea = new TextArea();
		display.addTextBox(mTextArea.asWidget());
		clear();
	}

	@Override
	public void bind() {
		super.bind();

		registerHandler(mTextArea.addKeyUpHandler(new KeyUpHandler() {
			
			@Override
			public void onKeyUp(KeyUpEvent event) {
				displayResearch();
				mTextArea.setFocus(true);
			}
		}));
		
		registerHandler(mTextArea.addFocusHandler(new FocusHandler() {
			
			@Override
			public void onFocus(FocusEvent event) {
				mTextArea.setText("");
			}
		}));
		
		registerHandler(mTextArea.addBlurHandler(new BlurHandler() {
			
			@Override
			public void onBlur(BlurEvent event) {
				clear();
			}
		}));
			
	}

	public void clear() {
		mTextArea.setText("Rechercher...");
	}
	
	@Override
	public void clearFinder() {
		DisplayResearchEvent lEvent = new DisplayResearchEvent();
		lEvent.setFinder(null);
		eventBus.fireEvent(lEvent);
	}
	
	private void displayResearch() {
		DataBase lDataBase = DataBase.getInstance();
		DisplayResearchEvent lEvent = new DisplayResearchEvent();
		lEvent.setFinder(lDataBase.fillFinder(mTextArea.getText()));
		eventBus.fireEvent(lEvent);
	}
}
