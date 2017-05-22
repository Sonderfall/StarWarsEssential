package com.starwars.app.client.galaxy.view;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.galaxy.presenter.GalaxyModule;
import com.starwars.app.client.paper.view.AModuleView;
import com.starwars.app.client.resources.StarWarsImageResources;
import com.starwars.app.client.tools.DivPanel;

public class GalaxyModuleView extends AModuleView implements GalaxyModule.Display {
	
	private final Image mGalaxy;
	private final DivPanel mPlanetes;
	private final DivPanel mRoads;
	private final DivPanel mTerritorys;
	private final DivPanel mText;
	private final DivPanel mLegends;
	private final DivPanel mChronology;
	
	public GalaxyModuleView() {
		initRoot();
		
		mGalaxy = new Image();
		mRoot.add(mGalaxy);
		initGalaxy();
		
		mTerritorys = new DivPanel();
		mRoot.add(mTerritorys);
		initTerritorys();

		mRoads = new DivPanel();
		mRoot.add(mRoads);
		initRoads();
		
		mPlanetes = new DivPanel();
		mRoot.add(mPlanetes);
		initPlanetes();
		
		mText = new DivPanel();
		mRoot.add(mText);
		initText();
		
		mLegends = new DivPanel();
		mRoot.add(mLegends);
		initLegend();
		
		mChronology = new DivPanel();
		mRoot.add(mChronology);
		initChronology();
		
		zoom();
	}
	
	private void initRoot() {
		mRoot.addStyleName(STYLE_GALAXY.galaxyWrapper());
	}
	
	private void initGalaxy() {
		mGalaxy.setResource(StarWarsImageResources.INSTANCE.galaxy());
		mGalaxy.addStyleName(STYLE_GALAXY.galaxy());
	}

	private void initPlanetes() {
		mPlanetes.getElement().setAttribute("id", "Planetes");
	}
	
	private void initRoads() {
		mRoads.getElement().setAttribute("id", "Roads");
	}
	
	private void initTerritorys() {
		mTerritorys.getElement().setAttribute("id", "Territories");
	}
	
	private void initLegend() {
		mLegends.getElement().setAttribute("id", "Legend");
	}
	
	private void initText() {
		mText.getElement().setAttribute("id", "Text");
	}
	
	private void initChronology() {
		mChronology.getElement().setAttribute("id", "Chronology");
	}
	
	@Override
	public void addPlanete(Widget iWidget, int iX, int iY) {
		mPlanetes.add(iWidget);
		iWidget.getElement().getStyle().setLeft(iX, Unit.PX);
		iWidget.getElement().getStyle().setTop(iY, Unit.PX);
	}

	@Override
	public void addTerritory(Widget iWidget, int iX, int iY, int iZoom) {
		mTerritorys.add(iWidget);
		float lScale = (float) iZoom / 100f;
		float lLeft = iX * lScale;
		float lTop = iY * lScale;
		iWidget.getElement().setAttribute("style",
				"position: absolute;"
				+ "left: " + lLeft + "px; "
				+ "top: " + lTop + "px; "
				+ "transform: scale(" +  lScale + ");");
	}
	
	@Override
	public void addLegends(Widget iWidget, int iBottom) {
		mLegends.add(iWidget);
		iWidget.getElement().getStyle().setBottom(iBottom, Unit.PX);
	}
	
	@Override
	public void addText(Widget iWidget) {
		mText.add(iWidget);
	}
	
	@Override
	public void addChronology(Widget iWidget) {
		mChronology.add(iWidget);
	}
	
	@Override
	public void addRoad(Widget iWidget) {
		mRoads.add(iWidget);
	}
	
	public void setGalaxyWrapper() {
		mRoot.getElement().getStyle().setHeight(mGalaxy.getHeight(), Unit.PX);
		mRoot.getElement().getStyle().setWidth(mGalaxy.getWidth(), Unit.PX);
	}

	@Override
	public void clearTerritories() {
		mTerritorys.clear();
	}
	
	@Override
	public void zoom() {
		if (Window.getClientWidth() < 1200) {
			mGalaxy.addStyleName(STYLE.zoom70());
			mTerritorys.addStyleName(STYLE.zoom70());
			mPlanetes.addStyleName(STYLE.zoom70());
			mRoads.addStyleName(STYLE.zoom70());
		} else if (Window.getClientWidth() >= 1200 && Window.getClientWidth() < 1800) {
			mGalaxy.addStyleName(STYLE.zoom88());
			mTerritorys.addStyleName(STYLE.zoom88());
			mPlanetes.addStyleName(STYLE.zoom88());
			mRoads.addStyleName(STYLE.zoom88());
		}
	}
}