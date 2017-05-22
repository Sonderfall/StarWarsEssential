package com.starwars.app.client.galaxy.view;

import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.galaxy.presenter.GalaxyChronologyCursor;
import com.starwars.app.client.tools.DivPanel;

public class GalaxyChronologyCursorView extends ADivView implements GalaxyChronologyCursor.Display {
	
	private final DivPanel mSpireTop;
	private final DivPanel mSpireBottom;
	private final DivPanel mBase;
	
	public GalaxyChronologyCursorView() {
		initRoot();
		
		mBase = new DivPanel();
		mRoot.add(mBase);
		initBase();
		
		mSpireTop = new DivPanel();
		mRoot.add(mSpireTop);
		initSpireTop();
		
		mSpireBottom = new DivPanel();
		mRoot.add(mSpireBottom);
		initSpireBottom();
	}

	private void initRoot() {
		mRoot.addStyleName(STYLE_GALAXY.cursor());
	}
	
	private void initBase() {
		mBase.addStyleName(STYLE_GALAXY.cursorBase());
	}
	
	private void initSpireTop() {
		mSpireTop.addStyleName(STYLE_GALAXY.cursorSpireTop());
	}
	
	private void initSpireBottom() {
		mSpireBottom.addStyleName(STYLE_GALAXY.cursorSpireBottom());
	}
}