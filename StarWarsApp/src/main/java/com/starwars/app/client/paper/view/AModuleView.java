package com.starwars.app.client.paper.view;

import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.paper.presenter.AModule;
import com.starwars.app.client.tools.DivPanel;

public abstract class AModuleView extends ADivView implements AModule.Display {

	protected final DivPanel mLegend;
	
	public AModuleView() {
		mLegend = new DivPanel();
		initLegend();
	}

	@Override
	public void setYellowLegend(String iText) {
		DivPanel lYellowLegend = new DivPanel();
		mLegend.add(lYellowLegend);
		lYellowLegend.addStyleName(STYLE.yellowLegend());
		lYellowLegend.addStyleName(STYLE.legendText());
		lYellowLegend.setText(iText);
	}
	
	@Override
	public void setGreenLegend(String iText) {
		DivPanel lGreenLegend = new DivPanel();
		mLegend.add(lGreenLegend);
		lGreenLegend.addStyleName(STYLE.greenLegend());
		lGreenLegend.addStyleName(STYLE.legendText());
		lGreenLegend.setText(iText);
	}
	
	@Override
	public void setBlueLegend(String iText) {
		DivPanel lBlueLegend = new DivPanel();
		mLegend.add(lBlueLegend);
		lBlueLegend.addStyleName(STYLE.blueLegend());
		lBlueLegend.addStyleName(STYLE.legendText());
		lBlueLegend.setText(iText);
	}
	
	@Override
	public void setPurpleLegend(String iText) {
		DivPanel lPurpleLegend = new DivPanel();
		mLegend.add(lPurpleLegend);
		lPurpleLegend.addStyleName(STYLE.purpleLegend());
		lPurpleLegend.addStyleName(STYLE.legendText());
		lPurpleLegend.setText(iText);
	}
	
	@Override
	public void setOrangeLegend(String iText) {
		DivPanel lOrangeLegend = new DivPanel();
		mLegend.add(lOrangeLegend);
		lOrangeLegend.addStyleName(STYLE.orangeLegend());
		lOrangeLegend.addStyleName(STYLE.legendText());
		lOrangeLegend.setText(iText);
	}
	

	@Override
	public void setMediumOrangeLegend(String iText) {
		DivPanel lLegend = new DivPanel();
		mLegend.add(lLegend);
		lLegend.addStyleName(STYLE.mediumorangeLegend());
		lLegend.addStyleName(STYLE.legendText());
		lLegend.setText(iText);
	}

	@Override
	public void setMediumGreenLegend(String iText) {
		DivPanel lLegend = new DivPanel();
		mLegend.add(lLegend);
		lLegend.addStyleName(STYLE.mediumgreenLegend());
		lLegend.addStyleName(STYLE.legendText());
		lLegend.setText(iText);
	}

	@Override
	public void setMediumGreen2Legend(String iText) {
		DivPanel lLegend = new DivPanel();
		mLegend.add(lLegend);
		lLegend.addStyleName(STYLE.mediumgreen2Legend());
		lLegend.addStyleName(STYLE.legendText());
		lLegend.setText(iText);
	}

	@Override
	public void setMediumPurpleLegend(String iText) {
		DivPanel lLegend = new DivPanel();
		mLegend.add(lLegend);
		lLegend.addStyleName(STYLE.mediumpurpleLegend());
		lLegend.addStyleName(STYLE.legendText());
		lLegend.setText(iText);
	}

	@Override
	public void setRedLegend(String iText) {
		DivPanel lLegend = new DivPanel();
		mLegend.add(lLegend);
		lLegend.addStyleName(STYLE.redLegend());
		lLegend.addStyleName(STYLE.legendText());
		lLegend.setText(iText);
	}

	@Override
	public void setFleshLegend(String iText) {
		DivPanel lLegend = new DivPanel();
		mLegend.add(lLegend);
		lLegend.addStyleName(STYLE.fleshLegend());
		lLegend.addStyleName(STYLE.legendText());
		lLegend.setText(iText);
	}
	
	@Override
	public void setDarkBlueLegend(String iText) {
		DivPanel lLegend = new DivPanel();
		mLegend.add(lLegend);
		lLegend.addStyleName(STYLE.darkblueLegend());
		lLegend.addStyleName(STYLE.legendText());
		lLegend.setText(iText);
	}

	@Override
	public void setDarkYellowLegend(String iText) {
		DivPanel lLegend = new DivPanel();
		mLegend.add(lLegend);
		lLegend.addStyleName(STYLE.darkyellowLegend());
		lLegend.addStyleName(STYLE.legendText());
		lLegend.setText(iText);
	}

	@Override
	public void setPinkLegend(String iText) {
		DivPanel lLegend = new DivPanel();
		mLegend.add(lLegend);
		lLegend.addStyleName(STYLE.pinkLegend());
		lLegend.addStyleName(STYLE.legendText());
		lLegend.setText(iText);
	}

	@Override
	public void setKakiLegend(String iText) {
		DivPanel lLegend = new DivPanel();
		mLegend.add(lLegend);
		lLegend.addStyleName(STYLE.kakiLegend());
		lLegend.addStyleName(STYLE.legendText());
		lLegend.setText(iText);
	}
	
	private void initLegend() {
		mLegend.addStyleName(STYLE.legendWrapper());
	}
}