package com.starwars.app.client.paper.presenter;

import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.presenter.Presenter;
import com.starwars.app.client.pager.presenter.Pager;
import com.starwars.app.shared.ElementInfo;


public interface Paper extends Presenter<Paper.Display> {

	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void setTextTitle(String iTitle);
		void setDescription(String iDescription);
		void addDoc(Widget iWidget);
		void setAdvancedComponent(Widget iWidget);
		void clearAdvancedComponent();
		void setImageTitle(Image iImage);
	}
	
	void init(ElementInfo iElementInfo);
	void setPager(Pager iPager);
	void draw();
}
