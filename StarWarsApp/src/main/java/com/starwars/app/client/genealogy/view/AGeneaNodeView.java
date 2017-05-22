package com.starwars.app.client.genealogy.view;

import com.google.gwt.dom.client.Style.Unit;
import com.starwars.app.client.genealogy.presenter.AGeneaNode;
import com.starwars.app.client.paper.view.AComponentView;
import com.starwars.app.client.tools.DivPanel;

public abstract class AGeneaNodeView extends AComponentView implements AGeneaNode.Display {
	
	private final DivPanel mHeader;
	
	 public AGeneaNodeView() {
		 initRoot(); 
		 
		 mHeader = new DivPanel();
		 mRoot.add(mHeader);
		 initHeader();
	}
	 
	 @Override
	 public void setName(String iName) {
		 mHeader.setText(iName);
	 }
	 
	 @Override
	 public void setTop(int iBottom) {
		 mRoot.getElement().getStyle().setTop(iBottom, Unit.PX);
	 }
	 
	 @Override
	 public void setLeft(int iLeft) {
		 mRoot.getElement().getStyle().setLeft(iLeft, Unit.PX);
	 }
	 
	 @Override
	 public void setRight(int iRight) {
		 mRoot.getElement().getStyle().setRight(iRight, Unit.PX);
	 }
	 
	 @Override
	 public int getWidth() {
		 return mRoot.getOffsetWidth();
	 }
	 
	 @Override
	 public int getLeft() {
		 return Integer.valueOf(mRoot.getElement().getStyle().getLeft().replaceAll("px", ""));
	 }

	 public void setPinkNode() {
		 mRoot.addStyleName(STYLE_GENEALOGY.pinkNode());
		 mHeader.addStyleName(STYLE_GENEALOGY.pinkNodeHeader());
	 }
	 
	 public void setFleshNode() {
		 mRoot.addStyleName(STYLE_GENEALOGY.fleshNode());
		 mHeader.addStyleName(STYLE_GENEALOGY.fleshNodeHeader());
	 }
	 
	 public void setBlueNode() {
		 mRoot.addStyleName(STYLE_GENEALOGY.blueNode());
		 mHeader.addStyleName(STYLE_GENEALOGY.blueNodeHeader());
	 }
	 
	 public void setGreenNode() {
		 mRoot.addStyleName(STYLE_GENEALOGY.greenNode());
		 mHeader.addStyleName(STYLE_GENEALOGY.greenNodeHeader());
	 }
	 
	 public void setPurpleNode() {
		 mRoot.addStyleName(STYLE_GENEALOGY.purpleNode());
		 mHeader.addStyleName(STYLE_GENEALOGY.purpleNodeHeader());
	 }

	 public void setOrangeNode() {
		mRoot.addStyleName(STYLE_GENEALOGY.orangeNode());
		mHeader.addStyleName(STYLE_GENEALOGY.orangeNodeHeader());
	 }
	 
	 
	 public void setYellowNode() {
		 mRoot.addStyleName(STYLE_GENEALOGY.yellowNode());
		 mHeader.addStyleName(STYLE_GENEALOGY.yellowNodeHeader());
	 }
	 
	 public void setRedNode() {
		 mRoot.addStyleName(STYLE_GENEALOGY.redNode());
		 mHeader.addStyleName(STYLE_GENEALOGY.redNodeHeader());
	 }
	 
	 public void setDarkYellowNode() {
		 mRoot.addStyleName(STYLE_GENEALOGY.darkyellowNode());
		 mHeader.addStyleName(STYLE_GENEALOGY.darkyellowNodeHeader());
	 }
	 
	 public void setMediumOrangeNode() {
		 mRoot.addStyleName(STYLE_GENEALOGY.mediumorangeNode());
		 mHeader.addStyleName(STYLE_GENEALOGY.mediumorangeNodeHeader());
	 }
	 
	 public void setMediumGreenNode() {
		 mRoot.addStyleName(STYLE_GENEALOGY.mediumgreenNode());
		 mHeader.addStyleName(STYLE_GENEALOGY.mediumgreenNodeHeader());
	 }
	 
	 public void setMediumGreen2Node() {
		 mRoot.addStyleName(STYLE_GENEALOGY.mediumgreen2Node());
		 mHeader.addStyleName(STYLE_GENEALOGY.mediumgreen2NodeHeader());
	 }
	 
	 public void setDarkBlueNode() {
		 mRoot.addStyleName(STYLE_GENEALOGY.darkblueNode());
		 mHeader.addStyleName(STYLE_GENEALOGY.darkblueNodeHeader());
	 }
	 
	 public void setMediumPurpleNode() {
		 mRoot.addStyleName(STYLE_GENEALOGY.mediumpurpleNode());
		 mHeader.addStyleName(STYLE_GENEALOGY.mediumpurpleNodeHeader());
	 }
	 
	 public void setKakiNode() {
		 mRoot.addStyleName(STYLE_GENEALOGY.kakiNode());
		 mHeader.addStyleName(STYLE_GENEALOGY.kakiNodeHeader());
	 }
	 
	 private void initRoot() {
		mRoot.getElement().getStyle().setWidth(200, Unit.PX);
		mRoot.addStyleName(STYLE_GENEALOGY.node());
	 }
	 
	 private void initHeader() {
		mHeader.addStyleName(STYLE_GENEALOGY.nodeHeader()); 
	 }
}