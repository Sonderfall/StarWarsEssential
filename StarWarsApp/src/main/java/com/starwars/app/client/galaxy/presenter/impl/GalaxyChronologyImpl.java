package com.starwars.app.client.galaxy.presenter.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gwt.dom.client.Style.Unit;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.StarWarsApp;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.galaxy.event.GalaxyChronologyEvent;
import com.starwars.app.client.galaxy.event.GalaxyChronologyHandler;
import com.starwars.app.client.galaxy.presenter.GalaxyChronology;
import com.starwars.app.client.galaxy.presenter.GalaxyChronologyCursor;
import com.starwars.app.client.galaxy.presenter.GalaxyChronologyPeriodDate;


public class GalaxyChronologyImpl extends BasePresenter<GalaxyChronology.Display> implements
GalaxyChronology {

	private final List<Integer> mDates;
	private final GalaxyChronologyCursor mCursor;
//	private static final double COEFFICIENT_LOG = 7.52;
	
	@Inject
	public GalaxyChronologyImpl(final EventBus eventBus,
			final GalaxyChronology.Display display) {
		super(eventBus, display);
		mDates = new ArrayList<Integer>();
		
		mCursor = StarWarsApp.ginjector.getGalaxyChronologyCursor();
		display.add(mCursor.getDisplay().asWidget());
	}

	@Override
	public void bind() {
		super.bind();
		mCursor.bind();
		
		registerHandler(eventBus.addHandler(GalaxyChronologyEvent.getType(), new GalaxyChronologyHandler() {

			@Override
			public void onGalaxyChronology(GalaxyChronologyEvent event) {
				mCursor.getDisplay().getElement().getStyle().setLeft(event.getLeft() - 2, Unit.PX);
			}
		}));
	}
	
	@Override
	public void process(int iInitDate) {
		Collections.sort(mDates);
		float lCoeff = (float) (105.0 / mDates.size() - 0.2);
//		int lStep = 35;
		int lStep = 490 / mDates.size();
		
		GalaxyChronologyPeriodDate lFirstPeriodDate = StarWarsApp.ginjector.getGalaxyChronologyPeriodDate();
		lFirstPeriodDate.bind();
		lFirstPeriodDate.init(mDates.get(0), lStep);
		display.add(lFirstPeriodDate.getDisplay().asWidget());
		
		for (int i = 1; i < mDates.size(); ++i) {
			GalaxyChronologyPeriodDate lPeriodDate = StarWarsApp.ginjector.getGalaxyChronologyPeriodDate();
			lPeriodDate.bind();
			
				int lLowerDate = mDates.get(i - 1);
				int lHigherDate = mDates.get(i);
				int lInterval = Math.abs(lHigherDate - lLowerDate);
				
				if (lInterval <= 5) {
					lInterval = 10; 
				}
					
				int lLogInterval = (int) (Math.log(lInterval) * lCoeff);
				lStep += lLogInterval;
			
			lPeriodDate.init(lHigherDate, lStep);
			display.addPeriodDate(lPeriodDate.getDisplay().asWidget());
			
			if (iInitDate == lLowerDate) {
				mCursor.getDisplay().getElement().getStyle().setLeft(lStep - lLogInterval - 2, Unit.PX);
			}
		}
	}
	
	public List<Integer> getDates() {
		return mDates;
	}
}
