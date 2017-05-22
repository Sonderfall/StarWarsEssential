package com.starwars.app.client.genealogy.presenter;

import com.starwars.app.client.abs.presenter.Presenter;


public interface GeneaLine extends Presenter<GeneaLine.Display> {
	
	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void setVerticale();
		void setHorizontale();
		void setVerticaleDashed();
		void setHorizontaleDashed();
	}
}
