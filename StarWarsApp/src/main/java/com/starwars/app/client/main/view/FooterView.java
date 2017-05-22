package com.starwars.app.client.main.view;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.main.presenter.Footer;
import com.starwars.app.client.tools.DivPanel;

public class FooterView extends ADivView implements Footer.Display {

	private final DivPanel mDivLanguages;
	private final DivPanel mMenu;


	public FooterView() {
		mRoot.addStyleName(STYLE.gradDark());
		mRoot.getElement().setAttribute("id", "footer");
		
		DivPanel lDP0 = new DivPanel();
		mRoot.add(lDP0);
		lDP0.setText("Star Wars Essential, web application, by Valtyr.");
		lDP0.addStyleName(STYLE.left());
		lDP0.addStyleName(STYLE.f11());
		lDP0.addStyleName(STYLE.c0D86C9());
		lDP0.addStyleName(STYLE.mT5());
		
		DivPanel lDP1 = new DivPanel();
		mRoot.add(lDP1);
		lDP1.addStyleName(STYLE.right());
		lDP1.getElement().getStyle().setPaddingTop(3d, Unit.PX);
		mMenu = new DivPanel();
		lDP1.add(mMenu);
		
		DivPanel lDP100 = new DivPanel();
		mMenu.add(lDP100);
		lDP100.addStyleName(STYLE.menuDropWrapper());
		lDP100.addStyleName(STYLE.left());
		lDP100.addStyleName(STYLE.mR15());

		DivPanel lDP1000 = new DivPanel();
		lDP100.add(lDP1000);
		lDP1000.setText("Change Language");
		lDP1000.setTitle("Change Language");
		lDP1000.addStyleName(STYLE.f12());
		lDP1000.addStyleName(STYLE.cE6E6E6());
		lDP1000.addStyleName(STYLE.pointer());
		
		mDivLanguages = new DivPanel();
		lDP100.add(mDivLanguages);
		mDivLanguages.addStyleName(STYLE.transOpacity());
		mDivLanguages.addStyleName(STYLE.menuDropContent());
	}

	@Override
	public HasClickHandlers addLanguage(String iLanguage) {
				
		DivPanel lDiv = new DivPanel();
		mDivLanguages.add(lDiv);
		
		DivPanel lLanguage = new DivPanel();
		lDiv.add(lLanguage);
		lLanguage.addStyleName(STYLE.f12());
		lLanguage.addStyleName(STYLE.cE6E6E6());
		lLanguage.addStyleName(STYLE.left());
		lLanguage.addStyleName(STYLE.w100per());
		lLanguage.addStyleName(STYLE.transColor());
		lLanguage.addStyleName(STYLE.itemNav());
		lLanguage.setTitle(iLanguage);
		lLanguage.setText(iLanguage);
		
		return lDiv;
	}
	
	@Override
	public HasClickHandlers addSepLanguage() {
		
		DivPanel lDivPanel = new DivPanel();
		lDivPanel.addStyleName(STYLE.line());
		lDivPanel.addStyleName(STYLE.bgCCCCCC());
		lDivPanel.addStyleName(STYLE.clear());
		mDivLanguages.add(lDivPanel);
		
		return lDivPanel;
	}

	public HasClickHandlers addItem(String iName, boolean iLast) {
		
		
		DivPanel lLabel = new DivPanel();
		lLabel.addStyleName(STYLE.left());
		if (!iLast) {
			lLabel.addStyleName(STYLE.mR15());
		}
		lLabel.addStyleName(STYLE.f12());
		lLabel.addStyleName(STYLE.cE6E6E6());
		lLabel.addStyleName(STYLE.transColor());
		lLabel.addStyleName(STYLE.itemNav());
		lLabel.setText(iName);
		lLabel.setTitle(iName);
		mMenu.add(lLabel);
		
		return lLabel;
	}
	
	@Override
	public HasClickHandlers addEndSepLanguage() {
		
		DivPanel lDivPanel = new DivPanel();
		lDivPanel.addStyleName(STYLE.sp5());
		lDivPanel.addStyleName(STYLE.clear());
		lDivPanel.addStyleName(STYLE.op0());
		mDivLanguages.add(lDivPanel);
		
		return lDivPanel;
	}

}
