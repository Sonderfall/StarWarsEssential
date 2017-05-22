package com.starwars.app.client.galaxy.presenter.impl;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.galaxy.presenter.Planete;
import com.starwars.app.client.galaxy.presenter.Road;


public class RoadImpl extends BasePresenter<Road.Display> implements
Road {

	private final List<Planete> mPlanetes;
	private boolean mIsMajor;
	
	@Inject
	public RoadImpl(final EventBus eventBus,
			final Road.Display display) {
		super(eventBus, display);
		mPlanetes = new ArrayList<Planete>();
		mIsMajor = false;
	}

	@Override
	public void bind() {
		super.bind();
		
		registerHandler(display.getHasMouseOverHandlers().addMouseOverHandler(new MouseOverHandler() {
			
			@Override
			public void onMouseOver(MouseOverEvent event) {
				showName();
			}
		}));
		
		registerHandler(display.getHasMouseOutHandlers().addMouseOutHandler(new MouseOutHandler() {
			
			@Override
			public void onMouseOut(MouseOutEvent event) {
				showName();
			}
		}));
	}

	@Override
	public void process() {
		for (int i = 0; i < mPlanetes.size() - 1; ++i) {
			
			Planete lFirstPlanete = mPlanetes.get(i);
			Planete lSecondPlanete = mPlanetes.get(i + 1);
			
			int lFirstPlaneteX = lFirstPlanete.getXCoordonate(); 
			int lFirstPlaneteY = lFirstPlanete.getYCoordonate(); 
			int lSecondPlaneteX = lSecondPlanete.getXCoordonate(); 
			int lSecondPlaneteY = lSecondPlanete.getYCoordonate(); 
			
			double lLengthDouble = Math.sqrt(Math.pow(lSecondPlaneteX - lFirstPlaneteX, 2) + Math.pow(lSecondPlaneteY - lFirstPlaneteY, 2));
			int lLength = (int) lLengthDouble;
			
			double lAngleDouble = Math.atan2((lSecondPlaneteY - lFirstPlaneteY), (lSecondPlaneteX - lFirstPlaneteX)) * (180 / Math.PI);
			int lAngle = (int) lAngleDouble;
			
			int lX = Math.min(lFirstPlaneteX, lSecondPlaneteX) + Math.abs(lFirstPlaneteX - lSecondPlaneteX) / 2 - lLength / 2 + 7;
			int lY = Math.min(lFirstPlaneteY, lSecondPlaneteY) + Math.abs(lFirstPlaneteY - lSecondPlaneteY) / 2 + 3;
					
			if (mIsMajor) {
				display.addRoadFragment(lX, lY, lLength, lAngle, true);
			} else {
				display.addRoadFragment(lX, lY, lLength, lAngle, false);
			}
		}
	}

	public void setIsMajorRoad(boolean iIsMajorRoad) {
		mIsMajor = iIsMajorRoad;
	}

	public List<Planete> getPlanetes() {
		return mPlanetes;
	}
	
	private void showName() {
		for (Planete lPlanete : mPlanetes) {
			lPlanete.setRoadOver(!lPlanete.isRoadOver());
			lPlanete.showName();
		}
	}
}
