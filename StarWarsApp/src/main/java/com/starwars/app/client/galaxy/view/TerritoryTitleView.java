package com.starwars.app.client.galaxy.view;

import com.google.gwt.dom.client.Style.Unit;
import com.starwars.app.client.galaxy.presenter.TerritoryTitle;
import com.starwars.app.client.paper.view.AComponentView;

public class TerritoryTitleView extends AComponentView implements TerritoryTitle.Display {
	
	public TerritoryTitleView() {
		initRoot();
	}

	@Override
	public void setTitle(String iName, int iX, int iY) {
		mRoot.getElement().getStyle().setLeft(iX, Unit.PX);
		mRoot.getElement().getStyle().setTop(iY, Unit.PX);
		mRoot.setText(iName);
	}
	
	@Override
	public void setBlueTitle() {
		mRoot.addStyleName(STYLE_GALAXY.blueShadowText());
	}

	@Override
	public void setRedTitle() {
		mRoot.addStyleName(STYLE_GALAXY.redShadowText());
	}

	@Override
	public void setYellowTitle() {
		mRoot.addStyleName(STYLE_GALAXY.yellowShadowText());
	}

	@Override
	public void setOrangeTitle() {
		mRoot.addStyleName(STYLE_GALAXY.orangeShadowText());
	}

	@Override
	public void setPurpleTitle() {
		mRoot.addStyleName(STYLE_GALAXY.purpleShadowText());
	}

	@Override
	public void setGreenTitle() {
		mRoot.addStyleName(STYLE_GALAXY.greenShadowText());
	}
	
	private void initRoot() {
		mRoot.addStyleName(STYLE_GALAXY.territoryTitle());
	}
}
