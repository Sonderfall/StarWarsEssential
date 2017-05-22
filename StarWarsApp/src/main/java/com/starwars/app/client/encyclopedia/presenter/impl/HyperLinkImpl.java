package com.starwars.app.client.encyclopedia.presenter.impl;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.encyclopedia.event.HyperLinkClickEvent;
import com.starwars.app.client.encyclopedia.event.HyperLinkTextEvent;
import com.starwars.app.client.encyclopedia.presenter.HyperLink;
import com.starwars.app.shared.DataBase;
import com.starwars.app.shared.ElementInfo;


public class HyperLinkImpl extends BasePresenter<HyperLink.Display> implements
HyperLink {

	private ElementInfo mElementInfo;
	private boolean mHandleOver;

	@Inject
	public HyperLinkImpl(final EventBus eventBus,
			final HyperLink.Display display) {
		super(eventBus, display);
		mHandleOver = true;
	}

	@Override
	public void bind() {
		super.bind();

		registerHandler(display.getHasMouseOverHandlers().addMouseOverHandler(new MouseOverHandler() {

			@Override
			public void onMouseOver(MouseOverEvent event) {
				if (mElementInfo != null) {
					if (mHandleOver) {
						mElementInfo.loadDatas();
						HyperLinkTextEvent lEvent = new HyperLinkTextEvent(display, mElementInfo);
						eventBus.fireEvent(lEvent);
					}
				}
			}
		}));

		registerHandler(display.getHasMouseOutHandlers().addMouseOutHandler(new MouseOutHandler() {
			
			@Override
			public void onMouseOut(MouseOutEvent event) {
				if (mHandleOver) {
					HyperLinkTextEvent lEvent = new HyperLinkTextEvent(display, null);
					eventBus.fireEvent(lEvent);
				}
			}
		}));

		registerHandler(display.getHasClickHandlers().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				if (mElementInfo != null) {
					HyperLinkClickEvent lEvent = new HyperLinkClickEvent(mElementInfo);
					eventBus.fireEvent(lEvent);
				}
			}
		}));
	}

	public void setLink(String iName) {
		mElementInfo = DataBase.getInstance().getElementFromDataBase(iName);
		display.setText(iName);
		if (mElementInfo != null) {
			display.activate();
		} else {
			display.inactivate();
		}
	}
	
	public void setLink(ElementInfo iInfo) {
		mElementInfo = iInfo;
		mHandleOver = false;
		display.setText("Aller à la page...");
		display.inDescription();
	}
}
