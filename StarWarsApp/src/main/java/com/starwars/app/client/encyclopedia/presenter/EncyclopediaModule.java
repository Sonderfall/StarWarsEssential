package com.starwars.app.client.encyclopedia.presenter;

import com.starwars.app.client.paper.presenter.AModule;

public interface EncyclopediaModule extends AModule<EncyclopediaModule.Display> {
	
	interface Display extends AModule.Display {
		void setSources();
	}
	void init(String iTextMethod, String... iImageMethods);
}
