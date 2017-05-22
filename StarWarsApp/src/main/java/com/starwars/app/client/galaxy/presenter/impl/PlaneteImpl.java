package com.starwars.app.client.galaxy.presenter.impl;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.galaxy.event.GalaxyDescriptionEvent;
import com.starwars.app.client.galaxy.presenter.Planete;
import com.starwars.app.client.paper.presenter.impl.AComponentImpl;
import com.starwars.app.shared.ComponentElement;
import com.starwars.app.shared.ElementInfo;


public class PlaneteImpl extends AComponentImpl<Planete.Display> implements
Planete {

	private int mXCoordonate;
	private int mYCoordonate;
	private boolean mActivedButton;
	private boolean mMouseOver;
	private boolean mRoadOver;
	
	@Inject
	public PlaneteImpl(final EventBus eventBus,
			final Planete.Display display) {
		super(eventBus, display);
		mMouseOver = false;
		mActivedButton = false;
		mRoadOver = false;
	}

	@Override
	public void bind() {
		super.bind();
		
		registerHandler(display.getHasClickHandlers().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				GalaxyDescriptionEvent lDescriptionEvent = new GalaxyDescriptionEvent();
				lDescriptionEvent.setInfo(mComponentElement);
				eventBus.fireEvent(lDescriptionEvent);
			}
		}));
		
		registerHandler(display.getHasMouseOverHandlers().addMouseOverHandler(new MouseOverHandler() {
			
			@Override
			public void onMouseOver(MouseOverEvent event) {
				mMouseOver = true;
				showName();
			}
		}));
		
		registerHandler(display.getHasMouseOutHandlers().addMouseOutHandler(new MouseOutHandler() {
			
			@Override
			public void onMouseOut(MouseOutEvent event) {
				mMouseOver = false;
				showName();
			}
		}));
	}
	
	@Override
	public void init(ComponentElement iElement, int iX, int iY, boolean iIsDown, boolean iInBase) {
		mComponentElement = iElement;
		mXCoordonate = iX;
		mYCoordonate = iY;
		display.setDescriptionBottom(iIsDown ? -8 : 12);
		if (!iInBase) {
			display.setYellowSpot();
		} else {
			display.setOrangeSpot();
		}
	}

	@Override
	public void init(ElementInfo iElement, int iX, int iY, boolean iIsDown, boolean iInBase) {
		mComponentElement = new ComponentElement(iElement);
		mXCoordonate = iX;
		mYCoordonate = iY;
		display.setDescriptionBottom(iIsDown ? -8 : 12);
		if (!iInBase) {
			display.setYellowSpot();
		} else {
			display.setOrangeSpot();
		}
	}
	
	public void showName() {
		if (!mMouseOver && !mActivedButton) {
			display.hide();
		} else {
			display.setTitle(mComponentElement.getTitle());
			display.show();
		}
		
		if (mRoadOver) {
			display.setTitle(mComponentElement.getTitle());
			display.show();
			display.setBig();
		} else {
			display.notBig();
		}
	}
	
	public boolean isActivedButton() {
		return mActivedButton;
	}

	public void setActivedButton(boolean iActivedButton) {
		this.mActivedButton = iActivedButton;
	}

	public boolean isRoadOver() {
		return mRoadOver;
	}

	public void setRoadOver(boolean iRoadOver) {
		this.mRoadOver = iRoadOver;
	}
	
	public int getXCoordonate() {
		return mXCoordonate;
	}

	public int getYCoordonate() {
		return mYCoordonate;
	}
}
