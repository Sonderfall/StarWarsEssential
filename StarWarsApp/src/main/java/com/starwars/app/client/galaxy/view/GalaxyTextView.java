package com.starwars.app.client.galaxy.view;

import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.galaxy.presenter.GalaxyText;
import com.starwars.app.client.tools.DivPanel;

public class GalaxyTextView extends ADivView implements GalaxyText.Display {

	private final DivPanel mDate;
	private final DivPanel mTitle;
	private final DivPanel mText;
	
	public GalaxyTextView() {
		initRoot();
		
		mDate = new DivPanel();
		mRoot.add(mDate);
		initDate();
		
		mTitle = new DivPanel();
		mRoot.add(mTitle);
		initTitle();
		
		mText = new DivPanel();
		mRoot.add(mText);
		initText();
		
		zoom();
	}

	public void setDate(String iDate) {
		mDate.setText(iDate);
	}
	
	public void setTitle(String iTitle) {
		mTitle.setText(iTitle);
	}
	
	public void setText(String iText) {
		mText.setText(iText);
	}

	private void initRoot() {
		mRoot.addStyleName(STYLE_GALAXY.galaxyTextWrapper());
	}
	
	private void initDate() {
		mDate.addStyleName(STYLE_GALAXY.galaxyTextDate());
		mDate.setText("5000 Av. BY");
	}

	private void initTitle() {
		mTitle.addStyleName(STYLE_GALAXY.galaxyTextTitle());
		mTitle.setText("Une période particulière");
	}

	private void initText() {
		mText.addStyleName(STYLE_GALAXY.galaxyTextText());
		mText.setText("lwerkwr ebqwmne qeqwioe qowe wiqe qoe qwoe qehiqeqwiul nqourbqlutbqpb tq8uoebowquie vpqwebpqi "
				+ "geqwiurghqwiort yqoirwq ehqiog qwiue qlje quhe ghqwlie hlqwioeh  eh qwis eghjhek erhwui rhelre re"
				+ "e rer erw rer qwebwqke wqkeqwjeq  elqwieqi eowqepwqbeibgqwe qwbeqle qiwhep;qwoe qbwd f,ewe we we ");
	}
}