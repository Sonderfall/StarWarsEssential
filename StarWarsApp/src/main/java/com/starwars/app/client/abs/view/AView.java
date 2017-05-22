package com.starwars.app.client.abs.view;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.HasMouseOutHandlers;
import com.google.gwt.event.dom.client.HasMouseOverHandlers;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.resources.ChronologyCssResource;
import com.starwars.app.client.resources.GalaxyCssResource;
import com.starwars.app.client.resources.GenealogyCssResource;
import com.starwars.app.client.resources.PagerCssResource;
import com.starwars.app.client.resources.PaperCssResource;
import com.starwars.app.client.resources.StarWarsResources;
import com.starwars.app.client.resources.StyleSheetCssResource;
import com.starwars.app.client.tools.APanel;

public abstract class AView<T extends APanel> extends Composite implements com.starwars.app.client.abs.presenter.ADisplay {

	protected static final StyleSheetCssResource STYLE = StarWarsResources.INSTANCE.stylesheetCss();
	protected static final PaperCssResource STYLE_PAPER = StarWarsResources.INSTANCE.paperCss();
	protected static final ChronologyCssResource STYLE_CHRONOLOGY = StarWarsResources.INSTANCE.chronologyCss();
	protected static final GenealogyCssResource STYLE_GENEALOGY = StarWarsResources.INSTANCE.genealogyCss();
	protected static final GalaxyCssResource STYLE_GALAXY = StarWarsResources.INSTANCE.galaxyCss();
	protected static final PagerCssResource STYLE_PAGER = StarWarsResources.INSTANCE.pagerCss();
	
	protected T mRoot;
	
	public AView() {
	}
	
	public void show() {
		mRoot.getElement().getStyle().clearDisplay();
	}
	
	public void hide() {
		mRoot.getElement().getStyle().setDisplay(com.google.gwt.dom.client.Style.Display.NONE);
	}

	public void add(Widget iWidget) {
		mRoot.add(iWidget);
	}

	public void remove(Widget iWidget) {
		mRoot.remove(iWidget);
	}

	public void clear() {
		mRoot.clear();
	}
	
	public HasClickHandlers getHasClickHandlers() {
		return mRoot;
	}

	public HasMouseOutHandlers getHasMouseOutHandlers() {
		return mRoot;
	}

	public HasMouseOverHandlers getHasMouseOverHandlers() {
		return mRoot;
	}

	public int getHeight() {
		return mRoot.getElement().getClientHeight();
	}
	
	public void setHeight(int iHeight) {
		mRoot.getElement().getStyle().setHeight(iHeight, Unit.PX);
	}

	public int getWidth() {
		return mRoot.getElement().getClientWidth();
	}
	
	public void setWidth(int iWidth) {
		mRoot.getElement().getStyle().setWidth(iWidth, Unit.PX);
	}
	
	public void setLeft(int iLeft) {
		mRoot.getElement().getStyle().setLeft(iLeft, Unit.PX);
	}
	
	public void setTop(int iTop) {
		mRoot.getElement().getStyle().setTop(iTop, Unit.PX);
	}

	public void setZIndex(int iZIndex) {
		mRoot.getElement().getStyle().setZIndex(iZIndex);
	}
	
	public void setText(String iText) {
		mRoot.setText(iText);
	}
	
	public int getOffsetTop() {
		return mRoot.getElement().getOffsetTop();
	}
	
	public void zoom() {
		if (Window.getClientWidth() < 1200) {
			mRoot.addStyleName(STYLE.zoom70());
		} else if (Window.getClientWidth() >= 1200 && Window.getClientWidth() < 1800) {
			mRoot.addStyleName(STYLE.zoom88());
		}
	}
	
	public float resizeImageFromWidth(ImageResource iImage, float iWidth) {
		float lOriginalWidth = iImage.getWidth();
		float lOriginalHeight = iImage.getHeight();
		float lOriginalRatio = (lOriginalHeight / lOriginalWidth);
		
		float lHeight = iImage.getHeight();
		float lCurrentRatio = (lHeight / iWidth);
		
		while (lCurrentRatio >= lOriginalRatio) {
			lHeight -= 0.25f;
			lCurrentRatio = (lHeight / iWidth);
		}
		return lHeight;
	}
	
	public float resizeImageFromHeight(ImageResource iImage, float iHeight) {
		float lOriginalWidth = iImage.getWidth();
		float lOriginalHeight = iImage.getHeight();
		float lOriginalRatio = (lOriginalHeight / lOriginalWidth);
		
		float lWidth = iImage.getWidth();
		float lCurrentRatio = (iHeight / lWidth);
		
		while (lCurrentRatio >= lOriginalRatio) {
			lWidth -= 0.25f;
			lCurrentRatio = (iHeight / lWidth);
		}
		return lWidth;
	}
}
