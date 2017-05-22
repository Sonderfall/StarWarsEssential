package com.starwars.app.client.encyclopedia.view;

import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.dom.client.Style.TextAlign;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Image;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.encyclopedia.presenter.DiapositiveItem;

public class DiapositiveItemView extends ADivView implements DiapositiveItem.Display {
	
	private final Image mImage;
	
	public DiapositiveItemView() {
		initRoot();
		mImage = new Image();
	}

	@Override
	public void setImage(ImageResource iImage) {
		mImage.setResource(iImage);
		mRoot.add(mImage);
		mImage.addStyleName(STYLE.borderRadiusOpposite16());
		mImage.addStyleName(STYLE.shadowBox());
		mImage.addStyleName(STYLE.originTop());
		mImage.addStyleName(STYLE.transAll());
		mImage.addStyleName(STYLE.reflect());
		mImage.getElement().getStyle().setHeight(iImage.getHeight() - 1, Unit.PX);
		mImage.getElement().getStyle().setWidth(iImage.getWidth() - 1, Unit.PX);
		mImage.getElement().getStyle().setProperty("backgroundColor", "black");
		
		if (Window.getClientWidth() < 1200) {
			mImage.addStyleName(STYLE.zoom50());
		} else if (Window.getClientWidth() >= 1200 && Window.getClientWidth() < 1800) {
			mImage.addStyleName(STYLE.zoom60());
		} else {
			mImage.addStyleName(STYLE.zoom90());
		}
		
		float lLeft = 73 + Math.abs(420 - mImage.getWidth()) / 15 + Window.getClientWidth() / 61;
		mRoot.getElement().getStyle().setLeft(lLeft, Unit.PCT);
	}

	public void setNormalPosition() {
		mImage.getElement().getStyle().clearLeft();
		mImage.getElement().getStyle().clearPosition();
		mImage.getElement().getStyle().clearMarginLeft();
	}
	
	public void setZoomPosition() {
		mImage.getElement().getStyle().setLeft(50, Unit.PCT);
		mImage.getElement().getStyle().setPosition(Position.ABSOLUTE);
		mImage.getElement().getStyle().setMarginLeft(-mImage.getWidth() / 2, Unit.PX);
	}
	
	private void initRoot() {
		mRoot.getElement().getStyle().setTextAlign(TextAlign.CENTER);
		mRoot.getElement().getStyle().setPosition(Position.ABSOLUTE);
		mRoot.getElement().getStyle().setTop(1, Unit.PX);
	}
}