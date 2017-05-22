package com.starwars.app.client.chronology.presenter;

import com.starwars.app.client.paper.presenter.AComponent;
import com.starwars.app.shared.ComponentElement;
import com.starwars.app.shared.ElementInfo;
import com.starwars.app.shared.ElementInfo.ElementColor;


public interface APeriod<D extends AComponent.Display> extends AComponent<D> {
	
	interface Display extends com.starwars.app.client.paper.presenter.AComponent.Display {
		void resizeWidthHeader();
		void setName(String iName);
	}

	void draw();
	void setColor();
	
	void init(ComponentElement iPeriodInfo, int iBeginDate, int iEndDate);
	void init(ElementInfo iInfo, int iBeginDate, int iEndDate);
	void init(ElementInfo iInfo, int iBeginDate, int iEndDate, ElementColor iColor);
	void init(ElementInfo iInfo, int iBeginDate, int iEndDate, String iTitle);
	
	int getBeginDate();
	int getEndDate();
	
	int getNbOverPeriod();
	void setNbOverPeriod(int iNbOverPeriod);
	
	boolean getSetPositionBottom();
	void setSetPositionBottom(boolean iSet);
	
	boolean getSetPositionTop();
	void setSetPositionTop(boolean iSet);
	
	void setIsBig(boolean iSet);
	boolean getIsBig();
	
	boolean isHardBottom();
	void setHardBottom(boolean iHardBottom);
	
	boolean isHardTop();
	void setHardTop(boolean iHardTop);
	
	void setApproxBeginDate(String iSet);
	void setApproxEndDate(String iSet);
	String getApproxBeginDate();
	String getApproxEndDate();
}
