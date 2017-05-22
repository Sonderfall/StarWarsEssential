package com.starwars.app.client.pager.presenter;

import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.presenter.Presenter;
import com.starwars.app.shared.SectionInfo;


public interface ColumnDetail extends Presenter<ColumnDetail.Display> {

	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void setTextTitle(String iTitle);
		void setIcon(String iIcon);
		void setDescription(String iDescription);
		void setImage(Image iImage);
		void setHoloprojector(Widget iWidget);
	}
	
	void init(SectionInfo iSectionInfo);
}
