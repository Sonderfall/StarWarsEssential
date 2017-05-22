package com.starwars.app.client.encyclopedia.view;

import com.google.gwt.dom.client.Style.FontStyle;
import com.google.gwt.dom.client.Style.Unit;
import com.starwars.app.client.encyclopedia.presenter.EncyclopediaModule;
import com.starwars.app.client.paper.view.AModuleView;
import com.starwars.app.client.tools.DivPanel;

public class EncyclopediaModuleView extends AModuleView implements
EncyclopediaModule.Display {

	private final DivPanel mFinalLine;
	private final DivPanel mSources;
	
	public EncyclopediaModuleView() {
		mFinalLine = new DivPanel();
		mSources = new DivPanel();
	}
	
	public void setSources() {
		mFinalLine.addStyleName(STYLE.line());
		mFinalLine.addStyleName(STYLE.bg999999());
		mFinalLine.getElement().getStyle().setWidth(350, Unit.PX);
		mFinalLine.getElement().getStyle().setMarginTop(27, Unit.PX);
		
		mSources.addStyleName(STYLE.f16());
//		mSources.addStyleName(STYLE.docText());
		mSources.addStyleName(STYLE.c777c7e());
		mSources.addStyleName(STYLE.lh130per());
		mSources.addStyleName(STYLE.fadein05());
		mSources.getElement().getStyle().setMarginTop(20, Unit.PX);
		mSources.getElement().getStyle().setFontStyle(FontStyle.ITALIC);
		
		mSources.setText("Sources : Base encyclopédique Star Wars Universe et Star Wars Holonet.");
		
		mRoot.add(mFinalLine);
		mRoot.add(mSources);
	}
}