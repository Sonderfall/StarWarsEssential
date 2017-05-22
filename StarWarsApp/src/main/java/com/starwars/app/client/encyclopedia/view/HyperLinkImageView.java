package com.starwars.app.client.encyclopedia.view;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.Image;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.encyclopedia.presenter.HyperLinkImage;

public class HyperLinkImageView extends ADivView implements HyperLinkImage.Display {

	private final Image mImage;
	
	public HyperLinkImageView() {
		mImage = new Image();
	}
	
	public void setImage(ImageResource iImage) {
		mImage.setResource(iImage);
		
		float lWidth = 55;
		float lHeight = resizeImageFromWidth(iImage, lWidth);
		
		mImage.getElement().getStyle().setWidth(lWidth, Unit.PX);
		mImage.getElement().getStyle().setHeight(lHeight, Unit.PX);
		
		mImage.addStyleName(STYLE.borderRadiusOpposite10());
		mImage.addStyleName(STYLE.hyperlinkDescriptionImage());
		
		mImage.getElement().getStyle().setTop(-Math.log(lHeight) * 9, Unit.PX);
		mImage.getElement().getStyle().setProperty("backgroundSize", "contain");
		mImage.getElement().getStyle().setProperty("backgroundColor", "rgba(8, 88, 129, 1)");
	}
	
	public Image getImage() {
		return mImage;
	}
}