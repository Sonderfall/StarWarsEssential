package com.starwars.app.client.main.view;

import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.main.presenter.Header;
import com.starwars.app.client.tools.DivPanel;

public class HeaderView extends ADivView implements Header.Display {

	private final DivPanel mPathWrapper;
	private final DivPanel mSearchWrapper;
	private final DivPanel mAboutWrapper;
	
	public HeaderView() {
		mRoot.getElement().setAttribute("id", "header");
		mRoot.setStyleName(STYLE.gradDark());
		mRoot.addStyleName(STYLE.fadein1());
		
		mPathWrapper = new DivPanel();
		mRoot.add(mPathWrapper);
		
		mAboutWrapper = new DivPanel();
		mRoot.add(mAboutWrapper);
		
		mSearchWrapper = new DivPanel();
		mRoot.add(mSearchWrapper);
	}
	
	@Override
	public void setNodePath(Widget iWidget) {
		mPathWrapper.add(iWidget);
	}
	
	public void setSearch(Widget iWidget) {
		mSearchWrapper.add(iWidget);
	}
	
	public void setAbout(Widget iWidget) {
		mAboutWrapper.add(iWidget);
	}
}
