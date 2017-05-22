package com.starwars.app.client.encyclopedia.view;

import com.google.gwt.dom.client.Style.Unit;
import com.starwars.app.client.abs.view.ASpanView;
import com.starwars.app.client.encyclopedia.presenter.HyperLink;

public class HyperLinkView extends ASpanView implements HyperLink.Display {

	public HyperLinkView() {}
	
	public void activate() {
		mRoot.addStyleName(STYLE.hyperlink());
		mRoot.addStyleName(STYLE.transAll());
	}
	
	public void inactivate() {
		mRoot.addStyleName(STYLE.f16());
		mRoot.addStyleName(STYLE.docText());
	}
	
	public void inDescription() {
		mRoot.addStyleName(STYLE.transAll());
		mRoot.addStyleName(STYLE.about());
		mRoot.addStyleName(STYLE.right());
		mRoot.getElement().getStyle().setFontSize(13, Unit.PX);
		mRoot.getElement().getStyle().setMarginTop(0, Unit.PX);
	}
}