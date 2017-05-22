package com.starwars.app.client.chronology.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.chronology.presenter.ChronoDate;

public class ChronoDateImpl extends BasePresenter<ChronoDate.Display> implements
ChronoDate {

	private int mDate;
	private String mApprox;
	
	@Inject
	public ChronoDateImpl(final EventBus eventBus,
			final ChronoDate.Display display) {
		super(eventBus, display);
		mDate = 0;
		mApprox = "";
	}

	@Override
	public void bind() {
		super.bind();
	}
	
	public void init(int iDate, String iApprox) {
		mDate = iDate;
		mApprox = iApprox;
	}
	
	public void init(int iDate) {
		mDate = iDate;
	}
	
	public void draw() {
		display.setDate(mApprox.length() > 0 ? mApprox : String.valueOf(mDate));
	}
	
	public int getDate() {
		return mDate;
	}
}