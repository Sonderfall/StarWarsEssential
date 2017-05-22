package com.starwars.app.client.galaxy.presenter.impl;

import com.google.gwt.resources.client.ImageResource;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.galaxy.presenter.Territory;
import com.starwars.app.client.galaxy.presenter.TerritoryTitle;
import com.starwars.app.client.mct.ASyncCall;
import com.starwars.app.client.resources.StarWarsMethodResources;
import com.starwars.app.shared.ComponentElement;
import com.starwars.app.shared.ElementInfo;
import com.starwars.app.shared.ElementInfo.ElementColor;


public class TerritoryImpl extends BasePresenter<Territory.Display> implements
Territory {

	private int mXCoordonate;
	private int mYCoordonate;
	private int mZoom;
	private final TerritoryTitle mTerritoryTitle;
	private String mImageName;
	
	@Inject
	public TerritoryImpl(final EventBus eventBus,
			final Territory.Display display,
			Provider<TerritoryTitle> iProviderTerritoryTitle) {
		super(eventBus, display);
		mTerritoryTitle = iProviderTerritoryTitle.get();
		display.add(mTerritoryTitle.getDisplay().asWidget());
	}

	@Override
	public void bind() {
		super.bind();
		mTerritoryTitle.bind();
	}
	
	@Override
	public void unbind() {
		super.unbind();
		mTerritoryTitle.unbind();
	}
	
	@Override
	public void init(ComponentElement iInfo, int iXTerritory, int iYTerritory,
			int iZoom, String iImage, int iXTitle, int iYTitle) {
		mXCoordonate = iXTerritory;
		mYCoordonate = iYTerritory;
		mZoom = iZoom;
		mImageName = iImage;
		mTerritoryTitle.init(iInfo, iXTitle, iYTitle);
	}

	@Override
	public void init(ElementInfo iInfo, int iXTerritory, int iYTerritory,
			int iZoom, String iImage, String iName, int iXTitle, int iYTitle, ElementColor iColor) {
		mXCoordonate = iXTerritory;
		mYCoordonate = iYTerritory;
		mZoom = iZoom;
		mImageName = iImage;
		mTerritoryTitle.init(new ComponentElement(iInfo, iColor, iName), iXTitle, iYTitle);
	}
	
	@Override
	public void loadDatas() {
    	ASyncCall<ImageResource> lASyncCall = new ASyncCall<ImageResource>() {
			
			@Override
			public void onSuccess(ImageResource iObj) {
				display.setImage(iObj);
			}
    	};
    	StarWarsMethodResources.callMethodImage(lASyncCall, mImageName);
    	mTerritoryTitle.loadDatas();
	}
	
	@Override
	public int getXCoordonate() {
		return mXCoordonate;
	}

	@Override
	public int getYCoordonate() {
		return mYCoordonate;
	}
	
	@Override
	public int getZoom() {
		return mZoom;
	}
}
