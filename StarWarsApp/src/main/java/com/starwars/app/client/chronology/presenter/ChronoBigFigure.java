package com.starwars.app.client.chronology.presenter;

import com.starwars.app.client.abs.presenter.Presenter;

public interface ChronoBigFigure extends Presenter<ChronoBigFigure.Display> {
	
	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void setTextEvent(String iText);
		void setRightText();
	}
	
	void init(String iText, int iDate);
	void init(String iText, int iDate, int iFontSize);
	int getDate();
	String getText();
}
