package com.starwars.app.client.pager.presenter;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.presenter.Presenter;
import com.starwars.app.client.main.event.PortalClickEvent.TypePortal;
import com.starwars.app.client.mct.ASyncCall;
import com.starwars.app.client.tools.DivPanel;


public interface Pager extends Presenter<Pager.Display> {

	public static enum PagerMode {
		home,
		navigation,
		portal,
		paper;
	}
	
	public static enum PagerAnimation {
		first,
		home_nav,
		nav_home,
		nav_nav_fwd,
		nav_nav_static,
		nav_nav_bck,
		nav_paper,
		paper_nav,
		paper_static,
		clear_bck
	}
	
	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void setModeHome(TypePortal iPortal);
		void setModeNavigation();
		void setModePaper();
		void setHomeMode(boolean iHomeMode);
		
		HasClickHandlers getButtonMiddlePanel();
		void setPaper(Widget iWidget);
		void setColumnComment(Widget iWidget);
		void setColumnLeft(Widget iWidget);
		void setColumMiddle(Widget iWidget);
		void setColumnRight(Widget iWidget);
		DivPanel getColumnLeft();
		DivPanel getColumnMiddle();
		DivPanel getColumnRight();
		
		void setMiddlePanelFullscreen(ASyncCall<Void> iASyncCall);
		void setMiddlePanelReduce(boolean iWithTimer, ASyncCall<Void> iASyncCall);
		
		void refresh();
		void refresh0();
		void updatePanel(PagerAnimation iPagerAnimation, ASyncCall<Void> iASyncCall);
		void refresh(int iTop);
		
		int getHeightComment();
		int getWidthComment();
		
		void scrollDeltaTop(int iDelta);
		void scrollAbsoluteTop(int iPos);
		void scrollLeftColumnDeltaTop(int iDelta);
		void scrollLeftColumnAbsoluteTop(int iPos);
		void scrollRightColumnAbsoluteTop(int iPos);
		int getLeftColumnScrollTop();
		int getRightColumnScrollTop();
		
		void addImageWidget(Widget iWidget);
		
		void hideImagePanel();
		void showImagePanel();
		
		void staticPaper();
		void absolutePaper();
		void setTimerSameSection(boolean iTimer);
	}
	
	void init(TypePortal iPortal);
	void init(String iToken);
	void setHome(boolean iAddToken);
}
