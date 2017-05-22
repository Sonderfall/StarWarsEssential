package com.starwars.app.client.galaxy.presenter;

import com.starwars.app.client.paper.presenter.AComponent;
import com.starwars.app.shared.ComponentElement;
import com.starwars.app.shared.ElementInfo;

public interface TerritoryTitle extends AComponent<TerritoryTitle.Display> {
	
	interface Display extends AComponent.Display {
		void setTitle(String iName, int iX, int iY);
		void setBlueTitle();
		void setRedTitle();
		void setYellowTitle();
		void setOrangeTitle();
		void setPurpleTitle();
		void setGreenTitle();
	}
	
	void init(ElementInfo iInfo, int iX, int iY);
	void init(ComponentElement iElement, int iX, int iY);
	void loadDatas();
}
