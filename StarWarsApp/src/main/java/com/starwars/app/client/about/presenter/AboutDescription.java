package com.starwars.app.client.about.presenter;

import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.presenter.Presenter;


public interface AboutDescription extends Presenter<AboutDescription.Display> {
	
	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void addMessageArea(Widget iWidget);
		void addEmailArea(Widget iWidget);
		void addNameArea(Widget iWidget);
		void addButton(Widget iWidget);
		void activeName();
		void desactiveName();
		void activeEmail();
		void desactiveEmail();
		void activeMessage();
		void desactiveMessage();
		void clearSend();
	}
}