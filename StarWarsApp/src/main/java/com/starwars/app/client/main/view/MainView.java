package com.starwars.app.client.main.view;

import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.main.presenter.Main;
import com.starwars.app.client.tools.DivPanel;

public class MainView extends ADivView implements Main.Display {

	private final DivPanel mShadow;
	private final DivPanel mHeader;
	private final DivPanel mBackground;
	private final DivPanel mButtonTopPanel;
	private final DivPanel mWebFontButtonPanelTop;
	private final DivPanel mMiddle;
	
	public MainView() {
		mHeader = new DivPanel();
		mRoot.add(mHeader);
		
		mBackground = new DivPanel();
		mRoot.add(mBackground);
		mBackground.addStyleName(STYLE.backgroundTraits());
		
		mButtonTopPanel = new DivPanel();
		
		mWebFontButtonPanelTop = new DivPanel();
		initButtonTopPanel();
			
		mMiddle = new DivPanel();
		mRoot.add(mMiddle);
		
		mShadow = new DivPanel();
		mShadow.addStyleName(STYLE.lbMask());
	}
	
	private void initButtonTopPanel() {
		mButtonTopPanel.getElement().setAttribute("data-panel", "top");
		mButtonTopPanel.addStyleName(STYLE.closePanelTop());
		mButtonTopPanel.addStyleName(STYLE.icon());
		mButtonTopPanel.addStyleName(STYLE.panel());
		mButtonTopPanel.addStyleName(STYLE.bg00ACE7Op50());
		mButtonTopPanel.addStyleName(STYLE.icon16px());
		mButtonTopPanel.addStyleName(STYLE.fixed());
		mButtonTopPanel.addStyleName(STYLE.transAll());
		mButtonTopPanel.addStyleName(STYLE.pointer());
		
		mWebFontButtonPanelTop.getElement().setAttribute("aria-hidden", "true");
		mWebFontButtonPanelTop.addStyleName(STYLE.cFFFFFF());
		mWebFontButtonPanelTop.addStyleName(STYLE.webfontIcon());
	}
	
	public void setCloseStateButtonTopPanel() {
		mButtonTopPanel.removeStyleName(STYLE.top());
		mButtonTopPanel.addStyleName(STYLE.bottom());
		
		mButtonTopPanel.getElement().getStyle().setMarginTop(0d, Unit.PX);
		mButtonTopPanel.getElement().getStyle().setTop(32d, Unit.PX);
		
		mWebFontButtonPanelTop.getElement().setAttribute("data-icon", "S");
		
		mMiddle.getElement().getStyle().setMarginTop(32d, Unit.PX);
	}

	public void setOpenStateButtonTopPanel() {
		mButtonTopPanel.removeStyleName(STYLE.bottom());
		mButtonTopPanel.addStyleName(STYLE.top());
		
		mButtonTopPanel.getElement().getStyle().setMarginTop(-17d, Unit.PX);
		mButtonTopPanel.getElement().getStyle().setTop(199d, Unit.PX);
		
		mWebFontButtonPanelTop.getElement().setAttribute("data-icon", "I");
		
		mMiddle.getElement().getStyle().setMarginTop(199d, Unit.PX);
	}
	
	@Override
	public void setHeader(Widget iWidget) {
		mHeader.add(iWidget);
	}

	@Override
	public void clearMiddle() {
		mMiddle.clear();
	}
	
	@Override
	public void setMiddle(Widget iWidget) {
		mMiddle.add(iWidget);
	}

	public HasClickHandlers getButtonTopPanel() {
		return mButtonTopPanel;
	}
	
	@Override
	public void shadow() {
		mRoot.add(mShadow);
	}

	@Override
	public void light() {
		mRoot.remove(mShadow);
	}

	@Override
	public int getHeaderHeight() {
		return mHeader.getElement().getOffsetHeight();
	}

	
	public void showButtonTopPanel() {
		mButtonTopPanel.getElement().getStyle().clearDisplay();
	}
	
	public void hideButtonTopPanel() {
		mButtonTopPanel.getElement().getStyle().setDisplay(Display.NONE);
	}

}
