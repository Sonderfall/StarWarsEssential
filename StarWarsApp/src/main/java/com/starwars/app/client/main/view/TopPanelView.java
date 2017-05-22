package com.starwars.app.client.main.view;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.dom.client.Style.Visibility;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.main.presenter.TopPanel;
import com.starwars.app.client.tools.DivPanel;

public class TopPanelView extends ADivView implements TopPanel.Display {

	public TopPanelView() {
		mRoot.getElement().setAttribute("id", "panel-top");
		mRoot.addStyleName(STYLE.relative());
		mRoot.addStyleName(STYLE.ovHidden());
		setCloseState();
		
		DivPanel lWrapper = new DivPanel();
		mRoot.add(lWrapper);
		lWrapper.addStyleName(STYLE.wrapper());
		
		DivPanel lW0 = new DivPanel();
		lWrapper.add(lW0);
		lW0.addStyleName(STYLE.cFFFFFF());
		lW0.addStyleName(STYLE.f35());
		lW0.addStyleName(STYLE.left());
		lW0.addStyleName(STYLE.panelTopTitle());

		DivPanel lW00 = new DivPanel();
		lW0.add(lW00);
		lW00.addStyleName(STYLE.geometricslabserifMediumItalic());
		lW00.setText("Choose");
		
		DivPanel lW01 = new DivPanel();
		lW0.add(lW01);
		lW01.addStyleName(STYLE.c00ACE7());
		lW01.addStyleName(STYLE.geometricslabserifMediumItalic());
		

		DivPanel lW1 = new DivPanel();
		lWrapper.add(lW1);
		lW1.addStyleName(STYLE.droidsans());
		lW1.addStyleName(STYLE.f14());
		lW1.addStyleName(STYLE.cCCCCCC());
		lW1.addStyleName(STYLE.left());
		lW1.addStyleName(STYLE.panelTopParagraph());
		lW1.setText("Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse.");
		
		DivPanel lW2 = new DivPanel();
//		lWrapper.add(lW2);
		lW2.addStyleName(STYLE.cFFFFFF());
		lW2.addStyleName(STYLE.right());
		lW2.addStyleName(STYLE.droidsansBold());
		lW2.addStyleName(STYLE.f14());
		lW2.addStyleName(STYLE.fRight());
		lW2.addStyleName(STYLE.bg00ACE7());
		lW2.addStyleName(STYLE.rad3());
		lW2.addStyleName(STYLE.pX10());
		lW2.addStyleName(STYLE.pY5());
		lW2.addStyleName(STYLE.transBg());
		lW2.addStyleName(STYLE.panelBack());
		lW2.addStyleName(STYLE.pointer());
		lW2.setText("Back");
		
		DivPanel lW3 = new DivPanel();
		lWrapper.add(lW3);
		lW3.addStyleName(STYLE.clear());
		
		DivPanel lLine = new DivPanel();
		mRoot.add(lLine);
		lLine.addStyleName(STYLE.line());
		lLine.addStyleName(STYLE.bg4D4D4D());
	}
	
	public void setOpenState() {
		mRoot.getElement().getStyle().setTop(72, Unit.PX);
		mRoot.getElement().getStyle().setVisibility(Visibility.VISIBLE);
	}

	public void setCloseState() {
		mRoot.getElement().getStyle().setTop(-53, Unit.PX);
		mRoot.getElement().getStyle().setVisibility(Visibility.HIDDEN);
	}
}
