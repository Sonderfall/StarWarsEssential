package com.starwars.app.client.genealogy.presenter;

import com.starwars.app.client.abs.presenter.Presenter;


public interface UnknownGeneration extends Presenter<UnknownGeneration.Display> {
	
	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void setTwoPeople();
		void setOnePeople();
	}
}
