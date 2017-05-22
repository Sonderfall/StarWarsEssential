package com.starwars.app.client.genealogy.view;

import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.genealogy.presenter.GeneaLine;

public class GeneaLineView extends ADivView implements GeneaLine.Display {
	
	public GeneaLineView() {
	}
	
	public void setVerticale() {
		mRoot.addStyleName(STYLE_GENEALOGY.verticaleLine());
	}
	
	public void setHorizontale() {
		mRoot.addStyleName(STYLE_GENEALOGY.horizontaleLine());
	}
	
	public void setVerticaleDashed() {
		mRoot.addStyleName(STYLE_GENEALOGY.verticaleLineDashed());
	}
	
	public void setHorizontaleDashed() {
		mRoot.addStyleName(STYLE_GENEALOGY.horizontaleLineDashed());
	}
}