package com.starwars.app.client.galaxy.view;

import com.google.gwt.dom.client.Style.Unit;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.galaxy.presenter.GalaxyChronologyPeriodDate;
import com.starwars.app.client.tools.DivPanel;

public class GalaxyChronologyPeriodDateView extends ADivView implements GalaxyChronologyPeriodDate.Display {
	
	private final DivPanel mDate;
	private final DivPanel mStick;
	private final DivPanel mTriangleTop;
	private final DivPanel mTriangleBottom;
	
	public GalaxyChronologyPeriodDateView() {
		initRoot();
		
		mDate = new DivPanel();
		mRoot.add(mDate);
		initDate();
		
		mStick = new DivPanel();
		mRoot.add(mStick);
		initStick();
		
		mTriangleTop = new DivPanel();
		mRoot.add(mTriangleTop);
		initTriangleTop();
		
		mTriangleBottom = new DivPanel();
		mRoot.add(mTriangleBottom);
		initTriangleBottom();
	}

	public void addDate(String iDate, int iLeft) {
		mDate.setText(iDate);
		mDate.getElement().getStyle().setRight(iDate.length() >= 2 ? iDate.length() * 4 : 2, Unit.PX);
		mRoot.getElement().getStyle().setLeft(iLeft, Unit.PX);
	}
	
	private void initDate() {
		mDate.addStyleName(STYLE_GALAXY.periodDateText());
	}
	
	private void initStick() {
		mStick.addStyleName(STYLE_GALAXY.periodDateStick());
	}
	
	private void initTriangleTop() {
		mTriangleTop.addStyleName(STYLE_GALAXY.periodDateTriangleTop());
	}
	
	private void initTriangleBottom() {
		mTriangleBottom.addStyleName(STYLE_GALAXY.periodDateTriangleBottom());
	}
	
	private void initRoot() {
		mRoot.addStyleName(STYLE_GALAXY.periodDate());
	}
}