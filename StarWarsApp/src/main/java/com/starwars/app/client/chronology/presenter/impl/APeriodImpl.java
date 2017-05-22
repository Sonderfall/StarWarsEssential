package com.starwars.app.client.chronology.presenter.impl;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.chronology.event.ChronoDescriptionEvent;
import com.starwars.app.client.chronology.presenter.APeriod;
import com.starwars.app.client.paper.presenter.impl.AComponentImpl;
import com.starwars.app.shared.ComponentElement;
import com.starwars.app.shared.ElementInfo;
import com.starwars.app.shared.ElementInfo.ElementColor;

public abstract class APeriodImpl<D extends APeriod.Display> extends AComponentImpl<D> implements
APeriod<D> {

	protected boolean mIsSetPositionBottom;
	protected boolean mIsSetPositionTop;
	protected boolean mIsBig;
	protected boolean mHardBottom;
	protected boolean mHardTop;
	
	protected String mApproxBeginDate;
	protected String mApproxEndDate;
	
	protected int mNbOverPeriod;
	
	protected int mBeginDate;
	protected int mEndDate;
	
	@Inject
	public APeriodImpl(final EventBus eventBus,
			final D display) {
		super(eventBus, display);
		mIsSetPositionBottom = false;
		mIsSetPositionTop = false;
		mHardBottom = false;
		mHardTop = false;
		mIsBig = false;
		mNbOverPeriod = 0;
		
		mApproxBeginDate = "";
		mApproxEndDate = "";
		
		mBeginDate = 0;
		mEndDate = 0;
	}

	@Override
	public void bind() {
		super.bind();

		registerHandler(display.getHasClickHandlers().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				ChronoDescriptionEvent lDescriptionEvent = new ChronoDescriptionEvent();
				lDescriptionEvent.setComponentElement(mComponentElement);
				eventBus.fireEvent(lDescriptionEvent);
			}
		}));
	}

	@Override
	public void init(ElementInfo iInfo) {
		init(iInfo, iInfo.getBeginDate(), iInfo.getEndDate());
	}
	
	@Override
	public void init(ElementInfo iInfo, String iTitle) {
		init(iInfo, iInfo.getBeginDate(), iInfo.getEndDate(), iTitle);
	}

	@Override
	public void init(ElementInfo iInfo, ElementColor iColor) {
		init(iInfo, iInfo.getBeginDate(), iInfo.getEndDate(), iColor);
	}
	
	@Override
	public void init(ElementInfo iInfo, int iBeginDate, int iEndDate) {
		super.init(iInfo);
		mBeginDate = iBeginDate;
		mEndDate = iEndDate;
		setColor();
	}
	
	@Override
	public void init(ComponentElement iComponentElement, int iBeginDate, int iEndDate) {
		super.init(iComponentElement);
		mBeginDate = iBeginDate;
		mEndDate = iEndDate;
		setColor();
	}
	
	@Override
	public void init(ElementInfo iInfo, int iBeginDate, int iEndDate, ElementColor iColor) {
		super.init(iInfo, iColor);
		mBeginDate = iBeginDate;
		mEndDate = iEndDate;
		setColor();
	} 
	
	@Override
	public void init(ElementInfo iInfo, int iBeginDate, int iEndDate, String iTitle) {
		super.init(iInfo, iTitle);
		mBeginDate = iBeginDate;
		mEndDate = iEndDate;
		setColor();
	}
	
	public void init() {
		setColor();
	}
	
	public boolean isHardBottom() {
		return mHardBottom;
	}

	public void setHardBottom(boolean iHardBottom) {
		this.mHardBottom = iHardBottom;
	}

	public boolean isHardTop() {
		return mHardTop;
	}

	public void setHardTop(boolean iHardTop) {
		this.mHardTop = iHardTop;
	}

	public int getNbOverPeriod() {
		return mNbOverPeriod;
	}

	public void setNbOverPeriod(int iNbOverPeriod) {
		this.mNbOverPeriod = iNbOverPeriod;
	}

	public ComponentElement getComponentElement() {
		return mComponentElement;
	}
	
	public boolean getSetPositionBottom() {
		return mIsSetPositionBottom;
	} 
	
	public void setIsBig(boolean iSet) {
		mIsBig = iSet;
	}
	
	public boolean getIsBig() {
		return mIsBig;
	} 
	
	public void setSetPositionBottom(boolean iSet) {
		mIsSetPositionBottom = iSet;
	}
	
	public boolean getSetPositionTop() {
		return mIsSetPositionTop;
	} 
	
	public void setSetPositionTop(boolean iSet) {
		mIsSetPositionTop = iSet;
	}

	public void setApproxEndDate(String iSet) {
		mApproxEndDate = iSet;
	}
	
	public void setApproxBeginDate(String iSet) {
		mApproxBeginDate = iSet;
	}
	
	public String getApproxEndDate() {
		return mApproxEndDate;
	}
	
	public String getApproxBeginDate() {
		return mApproxBeginDate;
	}
	
	public int getBeginDate() {
		return mBeginDate;
	}
	
	public int getEndDate() {
		return mEndDate;
	}
	
	@Override
	public void draw() {
		display.setName(mComponentElement.getTitle());
		display.resizeWidthHeader();
	}
}
