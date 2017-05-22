package com.starwars.app.client.chronology.view;

import com.google.gwt.dom.client.Style.Unit;
import com.starwars.app.client.chronology.presenter.APeriod;
import com.starwars.app.client.paper.view.AComponentView;
import com.starwars.app.client.tools.DivPanel;

public abstract class APeriodView extends AComponentView implements APeriod.Display {
	
	protected final DivPanel mHeader;
	
	public APeriodView() {
		mHeader = new DivPanel();
		mRoot.add(mHeader);
		mRoot.addStyleName(STYLE_CHRONOLOGY.period());
	}
	
	public void setName(String iName) {
		mHeader.setText(iName);
	}
	
	public void resizeWidthHeader() {
		mHeader.getElement().getStyle().setWidth(95, Unit.PCT);
	}
}