package com.starwars.app.client.galaxy.presenter;

import com.starwars.app.client.paper.presenter.AComponent;
import com.starwars.app.shared.ComponentElement;
import com.starwars.app.shared.ElementInfo;


public interface Planete extends AComponent<Planete.Display> {
	
	interface Display extends AComponent.Display {
		void setBig();
		void notBig();
		void setTitle(String iTitle);
		void hide();
		void show();
		void setDescriptionBottom(int iBottom);
		void setYellowSpot();
		void setOrangeSpot();
	}
	void init(ComponentElement iElement, int iX, int iY, boolean iIsDown, boolean iInBase);
	void init(ElementInfo iElement, int iX, int iY, boolean iIsDown, boolean iInBase);
	
	int getXCoordonate();
	int getYCoordonate();
	
	boolean isActivedButton();
	void setActivedButton(boolean iActivedButton);
	
	boolean isRoadOver();
	public void setRoadOver(boolean iRoadOver);
	
	void showName();
}
