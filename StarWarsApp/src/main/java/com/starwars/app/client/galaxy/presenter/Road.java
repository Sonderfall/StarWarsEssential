package com.starwars.app.client.galaxy.presenter;

import java.util.List;

import com.starwars.app.client.abs.presenter.Presenter;


public interface Road extends Presenter<Road.Display> {
	
	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void addRoadFragment(int iXCoordonate, int iYCoordonate, int iLength, int iAngle, boolean iIsMajor);
	}

	void process();
	void setIsMajorRoad(boolean iIsMajorRoad);
	List<Planete> getPlanetes();
}
