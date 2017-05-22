package com.starwars.app.client.encyclopedia.view;

import com.google.gwt.user.client.ui.Image;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.encyclopedia.presenter.HyperLinkText;
import com.starwars.app.client.tools.SpanPanel;

public class HyperLinkTextView extends ADivView implements HyperLinkText.Display {

	private final SpanPanel mImageWrapper;
	private final SpanPanel mText;
	
	public HyperLinkTextView() {
		initRoot();
		
		mImageWrapper = new SpanPanel();
		mRoot.add(mImageWrapper);
		initImageWrapper();
		
		mText = new SpanPanel();
		mRoot.add(mText);
		initText();
	}

	public void setImage(Image iImage) {
		mImageWrapper.clear();
		mImageWrapper.addStyleName(STYLE.hyperlinkDescriptionWrapperImage());
		mImageWrapper.add(iImage);
	}
	
	@Override
	public void setText(String iText) {
		mText.setText(iText);
	}
	
	@Override
	public void show() {
		mRoot.getElement().getStyle().clearDisplay();
		mRoot.addStyleName(STYLE.fadein1());
	}
	
	@Override
	public void hide() {
		mRoot.getElement().getStyle().setDisplay(com.google.gwt.dom.client.Style.Display.NONE);
		mRoot.removeStyleName(STYLE.fadein1());
	}
	
	private void initRoot() {
		mRoot.addStyleName(STYLE.hyperlinkDescription());
		mRoot.addStyleName(STYLE.transAll());
		mRoot.addStyleName(STYLE.borderRadiusOpposite10());
	}
	
	private void initImageWrapper() {
		mImageWrapper.addStyleName(STYLE.hyperlinkDescriptionWrapperImage());
	}
	
	private void initText() {
		mText.addStyleName(STYLE.hyperlinkDescriptionText());
		mText.addStyleName(STYLE.borderRadiusOpposite10());
	}
}