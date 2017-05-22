package com.starwars.app.client.pager.presenter;

import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.presenter.Presenter;


public interface NodePath extends Presenter<NodePath.Display> {

	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		
		void clear();
		void addSeparator();
		void addItem(Widget iWidget);
		void addShadow();
		void removeShadow();
	}
		
}
