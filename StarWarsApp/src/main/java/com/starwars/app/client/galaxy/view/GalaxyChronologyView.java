package com.starwars.app.client.galaxy.view;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.galaxy.presenter.GalaxyChronology;
import com.starwars.app.client.tools.DivPanel;

public class GalaxyChronologyView extends ADivView implements GalaxyChronology.Display {
	
	private final DivPanel mPeriodDateWrapper;
	private final DivPanel mChronoMiddle;
	private final DivPanel mChronoRight;
	private final DivPanel mChronoLeft;
	private final DivPanel mLine;
	
	public GalaxyChronologyView() {
		initRoot();

		mChronoLeft = new DivPanel();
		mRoot.add(mChronoLeft);
		initChronoLeft();
		
		mChronoMiddle = new DivPanel();
		mRoot.add(mChronoMiddle);
		initChronoMiddle();
		
		mChronoRight = new DivPanel();
		mRoot.add(mChronoRight);
		initChronoRight();
		
		mPeriodDateWrapper = new DivPanel();
		mRoot.add(mPeriodDateWrapper);
		initPeriodDateWrapper();
		
		mLine = new DivPanel();
		mRoot.add(mLine);
		initLine();
		
		zoom();
	}

	@Override
	public void addPeriodDate(Widget iWidget) {
		mPeriodDateWrapper.add(iWidget);
	}
	
	private void initRoot() {
		mRoot.addStyleName(STYLE_GALAXY.galaxyChronoMain());
		mRoot.getElement().getStyle().setRight((Window.getClientWidth() / 3) * 2 + 45, Unit.PX);
	}
	
	private void initPeriodDateWrapper() {
	}
	
	private void initChronoLeft() {
		mChronoLeft.addStyleName(STYLE_GALAXY.galaxyChronoLeft());
	}

	private void initChronoRight() {
		mChronoRight.addStyleName(STYLE_GALAXY.galaxyChronoRight());
	}

	private void initChronoMiddle() {
		mChronoMiddle.addStyleName(STYLE_GALAXY.galaxyChronoMiddle());
	}
	
	private void initLine() {
		mLine.addStyleName(STYLE_GALAXY.galaxyChronoLine());
	}
}