package com.starwars.app.client.research.view;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.research.presenter.ResearchEngine;

public class ResearchEngineView extends ADivView implements ResearchEngine.Display {

	public ResearchEngineView() {
		initRoot();
	}

	@Override
	public void addTextBox(Widget iWidget) {
		iWidget.addStyleName(STYLE.searchArea());
		iWidget.addStyleName(STYLE.relative());
		iWidget.getElement().getStyle().setBottom(1, Unit.PX);
		iWidget.getElement().getStyle().setFontSize(11, Unit.PX);
		iWidget.getElement().getStyle().setWidth(85, Unit.PX);
		iWidget.addStyleName(STYLE.droidsans());
		
		mRoot.add(iWidget);
	}
	
	private void initRoot() {
		mRoot.addStyleName(STYLE.itemNav());
		mRoot.addStyleName(STYLE.about());
		mRoot.addStyleName(STYLE.droidsans());
		mRoot.addStyleName(STYLE.f11());
		mRoot.addStyleName(STYLE.transColor());
		mRoot.addStyleName(STYLE.rad3());
		mRoot.addStyleName(STYLE.right());
	}
}