package com.starwars.app.client.paper.presenter;

import com.starwars.app.client.abs.presenter.ADisplay;
import com.starwars.app.client.abs.presenter.Presenter;

public interface AModule<D extends ADisplay> extends Presenter<D> {

	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void setYellowLegend(String iText);
		void setGreenLegend(String iText);
		void setBlueLegend(String iText);
		void setPurpleLegend(String iText);
		void setOrangeLegend(String iText);
		void setMediumOrangeLegend(String iText);
		void setMediumGreenLegend(String iText);
		void setMediumGreen2Legend(String iText);
		void setMediumPurpleLegend(String iText);
		void setRedLegend(String iText);
		void setFleshLegend(String iText);
		void setDarkBlueLegend(String iText);
		void setDarkYellowLegend(String iText);
		void setPinkLegend(String iText);
		void setKakiLegend(String iText);
	}
	
	void process();
	void reset();
	void loadDatas();
}
