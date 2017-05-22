package com.starwars.app.client.chronology.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.chronology.presenter.ChronoBigFigure;


public class ChronoBigFigureImpl extends BasePresenter<ChronoBigFigure.Display> implements
ChronoBigFigure {

	private String mText;
	private int mDate;
	
	@Inject
	public ChronoBigFigureImpl(final EventBus eventBus,
			final ChronoBigFigure.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}
	
	public void init(String iText, int iDate) {
		mText = iText;
		mDate = iDate;
		display.setTextEvent(iText);
	}
	
	public void init(String iText, int iDate, int iFontSize) {
		mText = iText;
		mDate = iDate;
		display.setTextEvent(iText);
	}
	
	public int getDate() {
		return mDate;
	}
	
	public String getText() {
		return mText;
	}
}
