package com.starwars.app.client.galaxy.presenter.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.galaxy.event.GalaxyChronologyEvent;
import com.starwars.app.client.galaxy.event.GalaxyChronologyHandler;
import com.starwars.app.client.galaxy.event.GalaxyDescriptionEvent;
import com.starwars.app.client.galaxy.event.GalaxyDescriptionHandler;
import com.starwars.app.client.galaxy.event.ShowNameEvent;
import com.starwars.app.client.galaxy.event.ShowNameHandler;
import com.starwars.app.client.galaxy.presenter.GalaxyChronology;
import com.starwars.app.client.galaxy.presenter.GalaxyModule;
import com.starwars.app.client.galaxy.presenter.GalaxyPeriod;
import com.starwars.app.client.galaxy.presenter.GalaxyText;
import com.starwars.app.client.galaxy.presenter.Planete;
import com.starwars.app.client.galaxy.presenter.Road;
import com.starwars.app.client.galaxy.presenter.ShowChronologyButton;
import com.starwars.app.client.galaxy.presenter.ShowPlanetesButton;
import com.starwars.app.client.galaxy.presenter.ShowTerritoriesButton;
import com.starwars.app.client.galaxy.presenter.Territory;
import com.starwars.app.client.paper.presenter.impl.AModuleImpl;


public class GalaxyModuleImpl extends AModuleImpl<GalaxyModule.Display> implements
GalaxyModule {

	private final List<Planete> mPlanetes;
	private final List<Road> mRoads;
	private final Map<Integer, GalaxyPeriod> mGalaxyPeriodInfos;
	private final GalaxyChronology mGalaxyChronology;
	private final GalaxyText mGalaxyText;
	private final ShowPlanetesButton mShowPlanetesButton;
	private final ShowTerritoriesButton mShowTerritoriesButton;
	private final ShowChronologyButton mShowChronologyButton;
	private int mCurrentPeriod;

	@Inject
	public GalaxyModuleImpl(final EventBus eventBus,
			final GalaxyModule.Display display,
			Provider<GalaxyChronology> iGalaxyChronology,
			Provider<GalaxyText> iGalaxyText,
			Provider<ShowPlanetesButton> iShowPlanetesButton,
			Provider<ShowTerritoriesButton> iShowTerritoriesButton,
			Provider<ShowChronologyButton> iShowChronologyButton) {
		super(eventBus, display);
		mCurrentPeriod = -22;
		mPlanetes = new ArrayList<Planete>();
		mRoads = new ArrayList<Road>();
		mGalaxyPeriodInfos = new HashMap<Integer, GalaxyPeriod>();

		mGalaxyText = iGalaxyText.get();
		display.addText(mGalaxyText.getDisplay().asWidget());
		
		mShowChronologyButton = iShowChronologyButton.get();
		display.addLegends(mShowChronologyButton.getDisplay().asWidget(), 40);
		
		mShowTerritoriesButton = iShowTerritoriesButton.get();
		display.addLegends(mShowTerritoriesButton.getDisplay().asWidget(), 70);
		
		mShowPlanetesButton = iShowPlanetesButton.get();
		display.addLegends(mShowPlanetesButton.getDisplay().asWidget(), 100);
		
		display.add(mDescription.getDisplay().asWidget());
		mDescription.getDisplay().hide();
		
		mGalaxyChronology = iGalaxyChronology.get();
		display.addChronology(mGalaxyChronology.getDisplay().asWidget());
	}

	@Override
	public void bind() {
		super.bind();
		mShowChronologyButton.bind();
		mShowTerritoriesButton.bind();
		mShowPlanetesButton.bind();
		mGalaxyChronology.bind();
		
		for (Planete lPlanete : mPlanetes) {
			lPlanete.bind();
		}
		
		for (Road lRoad : mRoads) {
			lRoad.bind();
		}
		
		for (Entry<Integer, GalaxyPeriod> lEntry : mGalaxyPeriodInfos.entrySet()) {
			for (Territory lTerritory : lEntry.getValue().getTerritorys()) {
				lTerritory.bind();
			}
		}
		
		registerHandler(eventBus.addHandler(ShowNameEvent.getType(), new ShowNameHandler() {

			@Override
			public void onShowName(ShowNameEvent event) {
				show(event);
			}
		}));

		registerHandler(eventBus.addHandler(GalaxyDescriptionEvent.getType(), new GalaxyDescriptionHandler() {

			@Override
			public void onGalaxyDescription(GalaxyDescriptionEvent event) {
				mDescription.init(event.getInfo());
				mDescription.draw();
				mDescription.getDisplay().show();
			}
		}));
		
		registerHandler(eventBus.addHandler(GalaxyChronologyEvent.getType(), new GalaxyChronologyHandler() {

			@Override
			public void onGalaxyChronology(GalaxyChronologyEvent event) {
				int lDate = event.getDate();
				if (lDate != mCurrentPeriod) {
					mShowTerritoriesButton.reset();
					changePeriod(lDate);
				}
			}
		}));
	}
	
	@Override
	public void unbind() {
		super.unbind();
		mShowChronologyButton.unbind();
		mShowTerritoriesButton.unbind();
		mShowPlanetesButton.unbind();
		mGalaxyChronology.unbind();
		
		for (Planete lPlanete : mPlanetes) {
			lPlanete.unbind();
		}
		
		for (Road lRoad : mRoads) {
			lRoad.unbind();
		}
		
		for (Entry<Integer, GalaxyPeriod> lEntry : mGalaxyPeriodInfos.entrySet()) {
			for (Territory lTerritory : lEntry.getValue().getTerritorys()) {
				lTerritory.unbind();
			}
		}
	}
	
	@Override
	public void process() {
		for (Planete lPlanete : mPlanetes) {
			display.addPlanete(lPlanete.getDisplay().asWidget(), lPlanete.getXCoordonate(), lPlanete.getYCoordonate());
		}
		
		for (Road lRoad : mRoads) {
			display.addRoad(lRoad.getDisplay().asWidget());
			lRoad.process();
		}
		
		for (int lDate : mGalaxyPeriodInfos.keySet()) {
			mGalaxyChronology.getDates().add(lDate);
		}
		
		mGalaxyChronology.process(mCurrentPeriod);
		changePeriod(mCurrentPeriod);
	}
	
	@Override
	public void reset() {
		mDescription.getDisplay().hide();
	}

	@Override
	public void loadDatas() {
		for (Territory lTerritory : mGalaxyPeriodInfos.get(mCurrentPeriod).getTerritorys()) {
			lTerritory.loadDatas();
		}
		
		for (Planete lPlanete : mPlanetes) {
			lPlanete.getComponentElement().getInfo().loadDatas();
		}

		for (GalaxyPeriod lPeriod : mGalaxyPeriodInfos.values()) {
			for (Territory lTerritory : lPeriod.getTerritorys()) {
				lTerritory.loadDatas();
			}
		}
	}
	
	public List<Planete> getPlanetes() {
		return mPlanetes;
	}
	
	public List<Road> getRoads() {
		return mRoads;
	}
	
	public Map<Integer, GalaxyPeriod> getGalaxyPeriodInfos() {
		return mGalaxyPeriodInfos;
	}

	private void show(ShowNameEvent iEvent) {
		switch (iEvent.getShowName() ) {
		case chronology:
			showChronology(iEvent.isIsShow());
			break;
		case territory:
			showTerritories(iEvent.isIsShow());
			break;
		case planete:
			showPlanete();
			break;
		}
	}
	
	private void showPlanete() {
		for (Planete lPlanete : mPlanetes) {
			lPlanete.setActivedButton(!lPlanete.isActivedButton());
			lPlanete.showName();
		}
	}
	
	private void showTerritories(boolean iIsShow) {
		GalaxyPeriod lGalaxyPeriodInfo = mGalaxyPeriodInfos.get(mCurrentPeriod);
		for (Territory lTerritory : lGalaxyPeriodInfo.getTerritorys()) {
			if (iIsShow) {
				mGalaxyText.getDisplay().hide();
				lTerritory.getDisplay().hide();
			} else {
				mGalaxyText.getDisplay().show();
				lTerritory.getDisplay().show();
			}
		}
	}
	
	private void showChronology(boolean iIsShow) {
		if (iIsShow)
			mGalaxyChronology.getDisplay().hide();
		else
			mGalaxyChronology.getDisplay().show(); 
	}
	
	private void changePeriod(int iPeriod) {
		display.clearTerritories();
		mCurrentPeriod = iPeriod;
		GalaxyPeriod lGalaxyPeriodInfo = mGalaxyPeriodInfos.get(mCurrentPeriod);
		mGalaxyText.draw(lGalaxyPeriodInfo, iPeriod);
		mGalaxyText.getDisplay().show();
		for (Territory lTerritory : lGalaxyPeriodInfo.getTerritorys()) {
			lTerritory.getDisplay().show();
			display.addTerritory(lTerritory.getDisplay().asWidget(), lTerritory.getXCoordonate(), lTerritory.getYCoordonate(), lTerritory.getZoom());
		}
	}
}
