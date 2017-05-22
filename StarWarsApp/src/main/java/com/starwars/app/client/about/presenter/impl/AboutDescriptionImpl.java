package com.starwars.app.client.about.presenter.impl;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.TextArea;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.StarWarsApp;
import com.starwars.app.client.about.presenter.AboutDescription;
import com.starwars.app.client.about.presenter.SendButton;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.msg.SendMessageService;
import com.starwars.app.client.msg.SendMessageServiceAsync;


public class AboutDescriptionImpl extends BasePresenter<AboutDescription.Display> implements
AboutDescription {

	private static final SendMessageServiceAsync sendMessage = GWT.create(SendMessageService.class);
	
	private final TextArea mNameArea;
	private final TextArea mEmailArea;
	private final TextArea mMessageArea;
	private final SendButton mSendButton;
	
	@Inject
	public AboutDescriptionImpl(final EventBus eventBus,
			final AboutDescription.Display display) {
		super(eventBus, display);
		mNameArea = new TextArea();
		mEmailArea = new TextArea();
		mMessageArea = new TextArea();
		mSendButton = StarWarsApp.ginjector.getSendButton();
		display.addNameArea(mNameArea);
		display.addEmailArea(mEmailArea);
		display.addMessageArea(mMessageArea);
		display.addButton(mSendButton.getDisplay().asWidget());
	}

	@Override
	public void bind() {
		super.bind();
		
		registerHandler(mSendButton.getDisplay().getHasClickHandlers().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				if (mNameArea.getText().length() > 2 && mEmailArea.getText().length() > 8 && mMessageArea.getText().length() > 10) {
					AsyncCallback<Void> lASyncCallback = new AsyncCallback<Void>() {
						public void onFailure(Throwable caught) {
							StarWarsApp.ginjector.getTools().sendText("CLIENT : Error during sending message");
					    }
	
					    public void onSuccess(Void iObj) {
					    	StarWarsApp.ginjector.getTools().sendText("CLIENT : Message well send");
					    	mSendButton.getDisplay().setText("Message envoyé !");
					    	clearSend();
					    }
					};
				    sendMessage.sendMessage(mNameArea.getText(), mEmailArea.getText(), mMessageArea.getText(), lASyncCallback);
				}
			}
		}));
		
		registerHandler(display.getHasClickHandlers().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				display.hide();
				clearSend();
				mSendButton.getDisplay().setText("Envoyer");
			}
		}));
		
		registerHandler(mNameArea.addBlurHandler(new BlurHandler() {
			
			@Override
			public void onBlur(BlurEvent event) {
				if (mNameArea.getText().equals(""))
					display.desactiveName();
			}
		}));
		
		registerHandler(mEmailArea.addBlurHandler(new BlurHandler() {
			
			@Override
			public void onBlur(BlurEvent event) {
				if (mEmailArea.getText().equals(""))
					display.desactiveEmail();
			}
		}));

		registerHandler(mMessageArea.addBlurHandler(new BlurHandler() {
			
			@Override
			public void onBlur(BlurEvent event) {
				if (mMessageArea.getText().equals(""))
					display.desactiveMessage();
			}
		}));
		
		registerHandler(mNameArea.addFocusHandler(new FocusHandler() {
			
			@Override
			public void onFocus(FocusEvent event) {
				display.activeName();
				
				if (mEmailArea.getText().equals(""))
					display.desactiveEmail();
				
				if (mMessageArea.getText().equals(""))
					display.desactiveMessage();
			}
		}));
		
		registerHandler(mEmailArea.addFocusHandler(new FocusHandler() {
			
			@Override
			public void onFocus(FocusEvent event) {
				display.activeEmail();
				
				if (mMessageArea.getText().equals(""))
					display.desactiveMessage();
				
				if (mNameArea.getText().equals(""))
					display.desactiveName();
			}
		}));

		registerHandler(mMessageArea.addFocusHandler(new FocusHandler() {
			
			@Override
			public void onFocus(FocusEvent event) {
				display.activeMessage();
				
				if (mEmailArea.getText().equals(""))
					display.desactiveEmail();
				
				if (mNameArea.getText().equals(""))
					display.desactiveName();
			}
		}));
	}
	
	@Override
	public void unbind() {
		super.unbind();
	}
	
	private void clearSend() {
		mNameArea.setText("");
		mEmailArea.setText("");
		mMessageArea.setText("");
		display.clearSend();
	}
}
