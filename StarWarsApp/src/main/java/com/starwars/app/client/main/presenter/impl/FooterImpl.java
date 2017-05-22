package com.starwars.app.client.main.presenter.impl;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.Window;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.main.presenter.Footer;
import com.starwars.app.client.tools.Pair;


public class FooterImpl extends BasePresenter<Footer.Display> implements
Footer {
	
	private final List<Pair<HasClickHandlers, String>> mLanguages;
	private final HasClickHandlers mHasClickHandlersAbout;
	private final HasClickHandlers mHasClickHandlersTermsPrivacy;
	private final HasClickHandlers mHasClickHandlersContacts;
	
	
	@Inject
	public FooterImpl(final EventBus eventBus,
			final Footer.Display display) {
		super(eventBus, display);
		mLanguages = new ArrayList<Pair<HasClickHandlers,String>>();
		mHasClickHandlersAbout = display.addItem("About", false);
		mHasClickHandlersTermsPrivacy = display.addItem("Terms & Privacy", false);
		mHasClickHandlersContacts = display.addItem("Contacts", true);
		addLanguage("English", "en");
		addLanguage("French", "fr");
		display.addEndSepLanguage();
	}

	private void addLanguage(String iLanguage, String iLocale) {
		HasClickHandlers lHasClickHandlers = display.addLanguage(iLanguage);
		if (mLanguages.isEmpty()) {
			display.addSepLanguage();
		}
		mLanguages.add(new Pair<HasClickHandlers, String>(lHasClickHandlers, iLocale));
	}

	@Override
	public void bind() {
		super.bind();

		registerHandler(mHasClickHandlersAbout.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				Window.alert("About !");
			}
		}));
		
		registerHandler(mHasClickHandlersTermsPrivacy.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				Window.alert("Terms & Privacy !");
			}
		}));
		
		registerHandler(mHasClickHandlersContacts.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				Window.alert("Contacts !");
			}
		}));
		
		for (Pair<HasClickHandlers, String> lPair : mLanguages) {
			HasClickHandlers lHasClickHandlers = lPair.getFirst();
			final String lLocale = lPair.getSecond();
			
			registerHandler(lHasClickHandlers.addClickHandler(new ClickHandler() {
				
				@Override
				public void onClick(ClickEvent event) {
					Window.alert("Change into : " + lLocale);
				}
			}));
		}
	}

}
