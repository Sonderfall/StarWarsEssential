package com.starwars.app.client.pager.view;

import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.Image;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.pager.presenter.SectionImage;

public class SectionImageView extends ADivView implements SectionImage.Display {

	private final Image mImage;
	
	public SectionImageView() {
		mImage = new Image();
	}
	
	public void setImage(ImageResource iImage) {
		mImage.setResource(iImage);
		
		mImage.addStyleName(STYLE.transAppear35());
		mImage.getElement().getStyle().setOpacity(0.85);
		mImage.getElement().getStyle().setPosition(Position.ABSOLUTE);
		mImage.getElement().getStyle().setLeft(50, Unit.PCT);
		mImage.getElement().getStyle().setMarginLeft(-iImage.getWidth() / 2, Unit.PX);
	}
	
	public Image getImage() {
		return mImage;
	}
}