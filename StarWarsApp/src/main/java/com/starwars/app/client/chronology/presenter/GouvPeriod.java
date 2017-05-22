package com.starwars.app.client.chronology.presenter;

public interface GouvPeriod extends APeriod<GouvPeriod.Display> {
	
	interface Display extends APeriod.Display {
		void setBlueStyle();
		void setPurpletStyle();
	}
	void setMajorGouv(boolean iIsMajorGouv);
}
