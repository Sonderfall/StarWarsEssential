package com.starwars.app.client.galaxy.presenter;

import java.util.List;
import java.util.Map;

import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.paper.presenter.AModule;

public interface GalaxyModule extends AModule<GalaxyModule.Display> {
	
	interface Display extends AModule.Display {
		void addPlanete(Widget iWidget, int iX, int iY);
		void addTerritory(Widget iWidget, int iX, int iY, int iZoom);
		void addRoad(Widget iWidget);
		void addLegends(Widget iWidget, int iBottom);
		void addChronology(Widget iWidget);
		void addText(Widget iWidget);
		void setGalaxyWrapper();
		void clearTerritories();
	}
	List<Planete> getPlanetes();
	List<Road> getRoads();
	Map<Integer, GalaxyPeriod> getGalaxyPeriodInfos();
}
