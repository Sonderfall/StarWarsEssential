package com.starwars.app.client.galaxy.presenter;

import java.util.ArrayList;
import java.util.List;

public class GalaxyPeriod {

	private final List<Territory> mTerritorys;
	private String mTitle;
	private String mText;
	
	public GalaxyPeriod(String iTitle) {
		mTerritorys = new ArrayList<Territory>();
		mTitle = iTitle;
	}
		
	public List<Territory> getTerritorys() {
		return mTerritorys;
	}
	
	public String getTitle() {
		return mTitle;
	}
	
	public String getText() {
		return mText;
	}
	
	public void setText(String iText) {
		mText = iText;
	}
}
