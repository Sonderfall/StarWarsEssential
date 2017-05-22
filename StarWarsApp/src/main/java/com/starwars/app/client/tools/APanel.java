package com.starwars.app.client.tools;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.DragEndEvent;
import com.google.gwt.event.dom.client.DragEndHandler;
import com.google.gwt.event.dom.client.DragEnterEvent;
import com.google.gwt.event.dom.client.DragEnterHandler;
import com.google.gwt.event.dom.client.DragEvent;
import com.google.gwt.event.dom.client.DragHandler;
import com.google.gwt.event.dom.client.DragLeaveEvent;
import com.google.gwt.event.dom.client.DragLeaveHandler;
import com.google.gwt.event.dom.client.DragOverEvent;
import com.google.gwt.event.dom.client.DragOverHandler;
import com.google.gwt.event.dom.client.DragStartEvent;
import com.google.gwt.event.dom.client.DragStartHandler;
import com.google.gwt.event.dom.client.DropEvent;
import com.google.gwt.event.dom.client.DropHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.HasDragEndHandlers;
import com.google.gwt.event.dom.client.HasDragEnterHandlers;
import com.google.gwt.event.dom.client.HasDragHandlers;
import com.google.gwt.event.dom.client.HasDragLeaveHandlers;
import com.google.gwt.event.dom.client.HasDragOverHandlers;
import com.google.gwt.event.dom.client.HasDragStartHandlers;
import com.google.gwt.event.dom.client.HasDropHandlers;
import com.google.gwt.event.dom.client.HasMouseDownHandlers;
import com.google.gwt.event.dom.client.HasMouseMoveHandlers;
import com.google.gwt.event.dom.client.HasMouseOutHandlers;
import com.google.gwt.event.dom.client.HasMouseOverHandlers;
import com.google.gwt.event.dom.client.HasMouseUpHandlers;
import com.google.gwt.event.dom.client.HasScrollHandlers;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.event.dom.client.ScrollEvent;
import com.google.gwt.event.dom.client.ScrollHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HTMLPanel;

public abstract class APanel extends HTMLPanel implements HasClickHandlers, HasDragStartHandlers,
HasMouseOutHandlers, HasMouseOverHandlers,HasMouseUpHandlers, HasMouseDownHandlers, HasMouseMoveHandlers, HasDragHandlers, HasDropHandlers,
HasDragOverHandlers, HasDragLeaveHandlers, HasDragEndHandlers, HasDragEnterHandlers, HasScrollHandlers {
	
	public APanel(String tag, String html) {
		super(tag, html);
	}

	@Override
	public HandlerRegistration addClickHandler(ClickHandler iHandler) {
		return addDomHandler(iHandler, ClickEvent.getType());
	}

	public HandlerRegistration addMouseOverHandler(MouseOverHandler iHandler) {
		return addDomHandler(iHandler, MouseOverEvent.getType());
	}
	
	public HandlerRegistration addMouseOutHandler(MouseOutHandler iHandler) {
		return addDomHandler(iHandler, MouseOutEvent.getType());
	}

	@Override
	public HandlerRegistration addDragStartHandler(DragStartHandler iHandler) {
		return addDomHandler(iHandler, DragStartEvent.getType());
	}

	@Override
	public HandlerRegistration addMouseDownHandler(MouseDownHandler iHandler) {
		return addDomHandler(iHandler, MouseDownEvent.getType());
	}

	@Override
	public HandlerRegistration addMouseUpHandler(MouseUpHandler iHandler) {
		return addDomHandler(iHandler, MouseUpEvent.getType());
	}

	@Override
	public HandlerRegistration addMouseMoveHandler(MouseMoveHandler iHandler) {
		return addDomHandler(iHandler, MouseMoveEvent.getType());
	}

	@Override
	public HandlerRegistration addDropHandler(DropHandler iHandler) {
		return addDomHandler(iHandler, DropEvent.getType());
	}
	
	@Override
	public HandlerRegistration addDragHandler(DragHandler iHandler) {
		return addDomHandler(iHandler, DragEvent.getType());
	}
	
	@Override
	public HandlerRegistration addDragEndHandler(DragEndHandler iHandler) {
		return addDomHandler(iHandler, DragEndEvent.getType());
	}

	@Override
	public HandlerRegistration addDragEnterHandler(DragEnterHandler iHandler) {
		return addDomHandler(iHandler, DragEnterEvent.getType());
	}
	
	@Override
	public HandlerRegistration addDragLeaveHandler(DragLeaveHandler iHandler) {
		return addDomHandler(iHandler, DragLeaveEvent.getType());
	}

	@Override
	public HandlerRegistration addDragOverHandler(DragOverHandler iHandler) {
		return addDomHandler(iHandler, DragOverEvent.getType());
	}

	@Override
	public HandlerRegistration addScrollHandler(ScrollHandler iHandler) {
		return addDomHandler(iHandler, ScrollEvent.getType());
	}
	
	public String getText() {
		return getElement().getInnerText();
	}
	
	public void setText(String iText) {
		getElement().setInnerText(iText);
	}
	
	public void show() {
		getElement().getStyle().clearDisplay();
	}
	
	public void hide() {
		getElement().getStyle().setDisplay(com.google.gwt.dom.client.Style.Display.NONE);
	}
}
