package com.starwars.app.client.chronology.presenter;

import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.paper.presenter.AModule;


public interface ChronologyModule extends AModule<ChronologyModule.Display> {
	
	interface Display extends AModule.Display {
		void addTopPeriod(Widget iWidget, int iWidth, int iLeft, int iTop);
		void addBottomPeriod(Widget iWidget, int iWidth, int iLeft, int iTop);
		void addFirstInterval();
		
		void addDate(Widget iWidget, int iWidth);
		void addEvent(Widget iWidget, int iLeft, int iBottom);
		void addLastDate(int iDate);
		void addSpire();
		
		void setRightDates();
		int getWidthInterval(int iIndex);
		int getWidthDate(int iIndex);
		void setTopChronology(int iTop);
	}
	void addPeriod(APeriod<?> iPeriod);
	void addBigFigure(int iDate, String iText);
	void addEvent(int iDate, String iText);
}
