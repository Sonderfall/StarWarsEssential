package com.starwars.app.client.genealogy.view;

import com.google.gwt.dom.client.Style.FontStyle;
import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.dom.client.Style.Unit;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.genealogy.presenter.UnknownGeneration;
import com.starwars.app.client.tools.DivPanel;

public class UnknownGenerationView extends ADivView implements UnknownGeneration.Display {
	
	private final DivPanel mText;
	private DivPanel mLineToFirstSon;
	private DivPanel mLineToSecondSon;
	private DivPanel mLineBetweenSons;
	private DivPanel mLineToParentUpper;
	private DivPanel mLineToParentLower;
	
	public UnknownGenerationView() {
		initRoot();
		
		mText = new DivPanel();
		mRoot.add(mText);
		initText();
	}
	
	public void setTwoPeople() {
		mLineToFirstSon = new DivPanel();
		mRoot.add(mLineToFirstSon);
		initLineToFirstSon();
		
		mLineToSecondSon= new DivPanel();
		mRoot.add(mLineToSecondSon);
		initLineToSecondSon();
		
		mLineBetweenSons = new DivPanel();
		mRoot.add(mLineBetweenSons);
		initLineBetweenSons();
		
		mLineToParentUpper = new DivPanel();
		mRoot.add(mLineToParentUpper);
		initLineToParentUpper();
		
		mLineToParentLower = new DivPanel();
		mRoot.add(mLineToParentLower);
		initLineToParentLower();
	}
	
	public void setOnePeople() {
		mLineToParentUpper = new DivPanel();
		mRoot.add(mLineToParentUpper);
		initLineToParentUpper();
		
		mLineToParentLower = new DivPanel();
		mRoot.add(mLineToParentLower);
		initLineToParentLower();
	}
	
	private void initRoot() {
		mRoot.getElement().getStyle().setPosition(Position.ABSOLUTE);
	}
	
	private void initText() { 
		mText.setText("Génération encore inconnue");
		mText.getElement().getStyle().setPosition(Position.RELATIVE);
		mText.getElement().getStyle().setTop(85, Unit.PX);
		mText.getElement().getStyle().setRight(1, Unit.PX);
		mText.getElement().getStyle().setFontSize(24, Unit.PX);
		mText.getElement().getStyle().setFontStyle(FontStyle.ITALIC);
		mText.getElement().getStyle().setWidth(320, Unit.PX);
	}
	
	private void initLineToFirstSon() { 
		mLineToFirstSon.addStyleName(STYLE_GENEALOGY.verticaleLine());
		mLineToFirstSon.getElement().getStyle().setHeight(20, Unit.PX);
		mLineToFirstSon.getElement().getStyle().setTop(140, Unit.PX);
	}

	private void initLineToSecondSon() { 
		mLineToSecondSon.addStyleName(STYLE_GENEALOGY.verticaleLine());
		mLineToSecondSon.getElement().getStyle().setHeight(20, Unit.PX);
		mLineToSecondSon.getElement().getStyle().setLeft(300, Unit.PX);
		mLineToSecondSon.getElement().getStyle().setTop(140, Unit.PX);
	}
	
	private void initLineBetweenSons() { 
		mLineBetweenSons.addStyleName(STYLE_GENEALOGY.horizontaleLine());
		mLineBetweenSons.getElement().getStyle().setWidth(300, Unit.PX);
		mLineBetweenSons.getElement().getStyle().setTop(140, Unit.PX);
	}
	
	private void initLineToParentUpper() { 
		mLineToParentUpper.addStyleName(STYLE_GENEALOGY.verticaleLineDashed());
		mLineToParentUpper.getElement().getStyle().setHeight(60, Unit.PX);
		mLineToParentUpper.getElement().getStyle().setLeft(150, Unit.PX);
	}
	
	private void initLineToParentLower() { 
		mLineToParentLower.addStyleName(STYLE_GENEALOGY.verticaleLineDashed());
		mLineToParentLower.getElement().getStyle().setHeight(25, Unit.PX);
		mLineToParentLower.getElement().getStyle().setLeft(150, Unit.PX);
		mLineToParentLower.getElement().getStyle().setTop(115, Unit.PX);
	}
}