package com.starwars.app.client.main.presenter;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.presenter.Presenter;
import com.starwars.app.client.main.event.PortalClickEvent.TypePortal;


public interface Main extends Presenter<Main.Display> {

	public static enum Mode {
		none,
		pager,
		load,
		portal,
		hyperlink;
	}
	
	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		HasClickHandlers getButtonTopPanel();
		void setHeader(Widget iWidget);
		void setMiddle(Widget iWidget);
		void clearMiddle();
		void setOpenStateButtonTopPanel();
		void setCloseStateButtonTopPanel(); 
		
		void shadow();
		void light();
		int getHeaderHeight();
		void hideButtonTopPanel();
		void showButtonTopPanel();
		
	}

	void setMode(Mode iMode, TypePortal iPortal);
}
