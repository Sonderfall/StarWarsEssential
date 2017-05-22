package com.starwars.app.client.paper.view;

import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.Image;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.paper.presenter.MainImage;

public class MainImageView extends ADivView implements MainImage.Display {
	
	private final Image mImage;
	
	public MainImageView() {
		mImage = new Image();
	}

	public void setImage(ImageResource iImage) {
		mImage.setResource(iImage);

		float lWidth = 100;
		float lHeight = resizeImageFromWidth(iImage, lWidth);
		
		mImage.getElement().getStyle().setWidth(lWidth, Unit.PX);
		mImage.getElement().getStyle().setHeight(lHeight, Unit.PX);
		mImage.getElement().getStyle().setPosition(Position.ABSOLUTE);
		
		mImage.getElement().getStyle().setLeft(42, Unit.PX);
//		mImage.getElement().getStyle().setTop(16, Unit.PX);
//		mImage.addStyleName(STYLE.docImage());
		mImage.addStyleName(STYLE.reflect());
		mImage.addStyleName(STYLE.borderRadiusOpposite10());
		
		mImage.getElement().getStyle().setProperty("backgroundSize", "contain");
//		mImage.getElement().getStyle().setProperty("backgroundColor", "rgba(8, 88, 129, 1)");
	}
	
	public Image getImage() {
		return mImage;
	}
}