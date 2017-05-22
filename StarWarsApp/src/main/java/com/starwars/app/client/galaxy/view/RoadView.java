package com.starwars.app.client.galaxy.view;

import com.google.gwt.dom.client.Style.Unit;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.galaxy.presenter.Road;
import com.starwars.app.client.tools.DivPanel;

public class RoadView extends ADivView implements Road.Display {
	
	public RoadView() {
		initRoot();
	}
	
	private void initRoot() {
		mRoot.addStyleName(STYLE_GALAXY.road());
	}

	@Override
	public void addRoadFragment(int iXCoordonate, int iYCoordonate, int iLength, int iAngle, boolean iIsMajor) {
		DivPanel lRoadFragment = new DivPanel();
		if(iIsMajor) {
			lRoadFragment.addStyleName(STYLE_GALAXY.roadFragment());
		} else {
			lRoadFragment.addStyleName(STYLE_GALAXY.roadFragmentDashed());
		}
		lRoadFragment.getElement().getStyle().setLeft(iXCoordonate, Unit.PX);
		lRoadFragment.getElement().getStyle().setTop(iYCoordonate, Unit.PX);
		lRoadFragment.getElement().getStyle().setWidth(iLength, Unit.PX);
		mRoot.add(lRoadFragment);

		lRoadFragment.getElement().getStyle().setProperty("OTransform", "rotate(" + iAngle + "deg) scale(1)");
		lRoadFragment.getElement().getStyle().setProperty("msTransform", "rotate(" + iAngle + "deg) scale(1)");
		lRoadFragment.getElement().getStyle().setProperty("transform", "rotate(" + iAngle + "deg) scale(1)");
	}
}