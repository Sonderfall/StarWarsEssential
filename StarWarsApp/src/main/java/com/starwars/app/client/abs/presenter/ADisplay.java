package com.starwars.app.client.abs.presenter;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.HasMouseOutHandlers;
import com.google.gwt.event.dom.client.HasMouseOverHandlers;
import com.google.gwt.user.client.ui.Widget;


public interface ADisplay {

	void add(Widget iWidget);
	void remove(Widget iWidget);
	void clear();
	
	Widget asWidget();
	void show();
	void hide();
	HasClickHandlers getHasClickHandlers();
	HasMouseOutHandlers getHasMouseOutHandlers();
	HasMouseOverHandlers getHasMouseOverHandlers();

	void setLeft(int iLeft);
	void setTop(int iTop);
	
	int getHeight();
	void setHeight(int iHeight);
	
	int getWidth();
	void setWidth(int iWidth);
	
	void setZIndex(int iZIndex);
	
	int getOffsetTop();
	int getOffsetHeight();
	
	void setText(String iText);
	
	Element getElement();
	
}
