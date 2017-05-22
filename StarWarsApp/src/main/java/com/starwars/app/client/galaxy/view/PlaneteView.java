package com.starwars.app.client.galaxy.view;

import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.dom.client.Style.Unit;
import com.starwars.app.client.galaxy.presenter.Planete;
import com.starwars.app.client.paper.view.AComponentView;
import com.starwars.app.client.tools.DivPanel;

public class PlaneteView extends AComponentView implements Planete.Display {
	
	private final DivPanel mName;
	
	public PlaneteView() {
		initRoot();
		
		mName = new DivPanel();
		mRoot.add(mName);
		initName();
	}
	
	private void initRoot() {
		mRoot.addStyleName(STYLE_GALAXY.planete());
	}

	@Override
	public void setBig() {
		mRoot.addStyleName(STYLE_GALAXY.big());
	}
	
	@Override
	public void notBig() {
		mRoot.removeStyleName(STYLE_GALAXY.big());
	}

	@Override
	public void setTitle(String iTitle) {
		mName.setText(iTitle);
	}
	
	@Override
	public void setYellowSpot() {
		mRoot.addStyleName(STYLE_GALAXY.yellowSpot());
	}

	@Override
	public void setOrangeSpot() {
		mRoot.addStyleName(STYLE_GALAXY.orangeSpot());
	}
	
	public void hide() {
		mName.removeStyleName(STYLE.fadein1());
		mName.getElement().getStyle().setDisplay(Display.NONE);
	}
	
	public void show() {
		mName.addStyleName(STYLE.fadein1());
		mName.getElement().getStyle().clearDisplay();
	}
	
	public void setDescriptionBottom(int iBottom) {
		mName.getElement().getStyle().setBottom(iBottom, Unit.PX);
		mName.getElement().getStyle().setPosition(Position.RELATIVE);
	}
	
	private void initName() {
		mName.addStyleName(STYLE_GALAXY.planeteDescription());
		mName.addStyleName(STYLE_GALAXY.titlePlaneteDescription());
	}
}