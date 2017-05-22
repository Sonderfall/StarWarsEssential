package com.starwars.app.client.genealogy.view;

import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.genealogy.presenter.GenealogyModule;
import com.starwars.app.client.paper.view.AModuleView;
import com.starwars.app.client.tools.DivPanel;

public class GenealogyModuleView extends AModuleView implements GenealogyModule.Display {

	private final DivPanel mNodes;
	private final DivPanel mBounds;
	
	public GenealogyModuleView() {
		mNodes = new DivPanel();
		mRoot.add(mNodes);
		initNodes();
		
		mBounds = new DivPanel();
		mRoot.add(mBounds);
		initBounds();

		mRoot.add(mLegend);
		
		zoom();
	}
	
	public void addNode(Widget iWidget) {
		mNodes.add(iWidget);
	}
	
	public void addBound(Widget iWidget) {
		mBounds.add(iWidget);
	}
	
	public void addUnknownGeneration(Widget iWidget, int iLeft, int iTop) {
		mBounds.add(iWidget);
		iWidget.getElement().getStyle().setLeft(iLeft, Unit.PX);
		iWidget.getElement().getStyle().setTop(iTop, Unit.PX);
	}
	
	public void setLeftNodesAndBounds(int iLeft) {
		mNodes.getElement().getStyle().setLeft(iLeft, Unit.PX);
		mBounds.getElement().getStyle().setLeft(iLeft, Unit.PX);
	}
	
	private void initNodes() {
		mNodes.getElement().getStyle().setPosition(Position.RELATIVE);
		mNodes.getElement().getStyle().setZIndex(1);
	}
	
	private void initBounds() {
		mBounds.getElement().getStyle().setPosition(Position.RELATIVE);
		mBounds.getElement().getStyle().setZIndex(0);
	}
	
	@Override
	public void zoom() {
		if (Window.getClientWidth() >= 800 && Window.getClientWidth() < 1200) {
			mNodes.addStyleName(STYLE.zoom70());
			mBounds.addStyleName(STYLE.zoom70());
		} else if (Window.getClientWidth() >= 1200 && Window.getClientWidth() < 1800) {
			mNodes.addStyleName(STYLE.zoom88());
			mBounds.addStyleName(STYLE.zoom88());
		}
	}
}