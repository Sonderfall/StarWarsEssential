package com.starwars.app.client.chronology.view;

import com.google.gwt.dom.client.Style.Unit;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.chronology.presenter.ChronoBigFigure;
import com.starwars.app.client.tools.DivPanel;

public class ChronoBigFigureView extends ADivView implements ChronoBigFigure.Display {

	private final DivPanel mText;
	private final DivPanel mLine;
	
	public ChronoBigFigureView() {
		initRoot();
		
		mText = new DivPanel();
		mRoot.add(mText);
		initText();
		
		mLine = new DivPanel();
		mRoot.add(mLine);
		initLine();
	}
	
	public void setRightText() {
		mText.getElement().getStyle().setRight(mText.getElement().getOffsetWidth() / 2, Unit.PX);
	}
	
	public void setTextEvent(String iText) {
		mText.setText(iText);
	}
	
	private void initRoot() {
		mRoot.addStyleName(STYLE_CHRONOLOGY.eventWrapper());
	}
	
	private void initLine() {
		mLine.addStyleName(STYLE_CHRONOLOGY.eventLine());
	}
	
	private void initText() {
		mText.addStyleName(STYLE_CHRONOLOGY.eventText());
	}
}