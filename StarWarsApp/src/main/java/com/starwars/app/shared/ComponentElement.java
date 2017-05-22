package com.starwars.app.shared;

import com.starwars.app.shared.ElementInfo.ElementColor;


public class ComponentElement {

	private ElementInfo mInfo;
	private ElementColor mColor;
	private String mTitle;
	
	public ComponentElement(ElementInfo iInfo, ElementColor iColor, String iTitle) {
		mInfo = iInfo;
		mColor = iColor;
		mTitle = iTitle;
	}
	
	public ComponentElement(ElementInfo iInfo, ElementColor iColor) {
		mInfo = iInfo;
		mColor = iColor;
		mTitle = iInfo.getTitle();
	}
	
	public ComponentElement(ElementInfo iInfo, String iTitle) {
		mInfo = iInfo;
		mColor = iInfo.getColor();
		mTitle = iTitle;
	}

	public ComponentElement(ElementInfo iInfo) {
		mInfo = iInfo;
		mColor = iInfo.getColor();
		mTitle = iInfo.getTitle();
	}
	
	public String getTitle() {
		return mTitle;
	}
	
	public ElementColor getColor() {
		return mColor;
	}
	
	public ElementInfo getInfo() {
		return mInfo;
	}

	public void setColor(ElementColor iColor) {
		mColor = iColor;
	}
}