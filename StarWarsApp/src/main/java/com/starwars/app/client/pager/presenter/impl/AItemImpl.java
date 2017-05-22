package com.starwars.app.client.pager.presenter.impl;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.main.event.ChangeScreenEvent;
import com.starwars.app.client.main.event.ChangeScreenEvent.FromChangeScreen;
import com.starwars.app.client.main.event.ChangeScreenEvent.TypeChangeScreen;
import com.starwars.app.client.pager.presenter.AItem;
import com.starwars.app.shared.Info;


public abstract class AItemImpl<I extends Info, D extends AItem.Display> extends BasePresenter<D> implements
AItem<I, D> {

	protected I mInfo;
	protected boolean mIsActivateState;


	public AItemImpl(final EventBus eventBus,
			final D display) {
		super(eventBus, display);
		mInfo = null;
		mIsActivateState = false;
		display.setUnlockedMode();
		display.setInactiveState();
	}

	@Override
	public void bind() {
		super.bind();
		
		registerHandler(display.getHasClickHandlers().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				if (!mIsActivateState) {
					activate();
				}
			}
		}));
		
		registerHandler(display.getHasMouseOverHandlers().addMouseOverHandler(new MouseOverHandler() {

			@Override
			public void onMouseOver(MouseOverEvent event) {
				if (!mIsActivateState) {
					display.setOver();
				}
			}
		}));
		
		registerHandler(display.getHasMouseOutHandlers().addMouseOutHandler(new MouseOutHandler() {

			@Override
			public void onMouseOut(MouseOutEvent event) {
				if (!mIsActivateState) {
					display.setOut();
				}
			}
		}));
	}
	
	@Override
	public void init(I iInfo) {
		mInfo = iInfo;
		display.setInactiveState();
	}
	
	@Override
	public void reset() {
		if (mIsActivateState) {
			display.setOut();
			display.setInactiveState();
			mIsActivateState = false;
		}
	}
	
	public void activate() {
		ChangeScreenEvent lChangeScreenEvent = new ChangeScreenEvent();
		lChangeScreenEvent.setTypeChangeScreen(TypeChangeScreen.navigation);
		lChangeScreenEvent.setFromChangeScreen(FromChangeScreen.item);
		lChangeScreenEvent.setInfo(mInfo);
		eventBus.fireEvent(lChangeScreenEvent);
		mIsActivateState = true;
		display.setActiveState();
	}
	
	public I getInfo() {
		return mInfo;
	}
}
