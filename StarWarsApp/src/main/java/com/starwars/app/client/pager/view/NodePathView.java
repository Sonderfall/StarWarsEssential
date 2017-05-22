package com.starwars.app.client.pager.view;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.pager.presenter.NodePath;
import com.starwars.app.client.tools.DivPanel;

public class NodePathView extends ADivView implements NodePath.Display {

	private final DivPanel mNav;
	
	public NodePathView() {
		mNav = new DivPanel();
		mNav.getElement().setAttribute("id", "top-nav");
		mNav.getElement().getStyle().setLeft(0, Unit.PX);
		mNav.getElement().getStyle().setTop(0, Unit.PX);
		mNav.getElement().getStyle().setHeight(39, Unit.PX);
		mRoot.add(mNav);
	}
	
	public void clear() {
		mNav.clear();
	}
	
	public void addItem(Widget iWidget) {
		mNav.add(iWidget);
	}

	public void addSeparator() {
		DivPanel lDivPanel = new DivPanel();
		lDivPanel.addStyleName(STYLE.separator());
		
		DivPanel lSeparator = new DivPanel();
		lSeparator.addStyleName(STYLE.cFFFFFF());
		lSeparator.addStyleName(STYLE.f12());
		lSeparator.addStyleName(STYLE.left());
		lSeparator.addStyleName(STYLE.webfontIcon());
		lSeparator.getElement().setAttribute("aria-hidden", "true");
		lSeparator.getElement().setAttribute("data-icon", "j");
		lDivPanel.add(lSeparator);
		mNav.add(lDivPanel);		
	}

	public void removeShadow() {
		mNav.getElement().getStyle().setProperty("boxShadow", "none");
	}
	
	public void addShadow() {
		mNav.getElement().getStyle().clearProperty("boxShadow");
	}

}
