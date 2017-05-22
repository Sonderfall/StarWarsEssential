package com.starwars.app.client.pager.view;

import com.google.gwt.dom.client.Style.TextAlign;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Image;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.pager.presenter.Holoprojector;
import com.starwars.app.client.resources.StarWarsImageResources;
import com.starwars.app.client.tools.DivPanel;

public class HoloprojectorView extends ADivView implements Holoprojector.Display {

	private final DivPanel mProjectionWrapper;
	private final DivPanel mProjectorWrapper;
	private final DivPanel mShadowWrapper;
	
	private final Image mProjectionImage;
	private final Image mProjectorImage;
	private final Image mShadowImage;
	
	public HoloprojectorView() {
		mProjectionWrapper = new DivPanel();
		mRoot.add(mProjectionWrapper);
		initProjectionWrapper();
		
		mProjectionImage = new Image();
		mProjectionWrapper.add(mProjectionImage);
		initProjectionImage();

		mProjectorWrapper = new DivPanel();
		mRoot.add(mProjectorWrapper);
		initProjectorWrapper();
		
		mProjectorImage = new Image();
		mProjectorWrapper.add(mProjectorImage);
		initProjectorImage();

		mShadowWrapper = new DivPanel();
		mRoot.add(mShadowWrapper);
		initShadowWrapper();
		
		mShadowImage = new Image();
		mShadowWrapper.add(mShadowImage);
		initShadowImage();

		initRoot();
	}
	
	private void initRoot() {
		mRoot.addStyleName(STYLE.holoWrapper());
	}
	
	private void initProjectionWrapper() {
		mProjectionWrapper.addStyleName(STYLE.holoProjection());
	}
	
	private void initProjectionImage() {
		mProjectionImage.setResource(StarWarsImageResources.INSTANCE.holoprojection());
		mProjectionWrapper.getElement().getStyle().setMarginLeft(- mProjectionImage.getWidth() / 2 + 4, Unit.PX);
		mProjectionWrapper.getElement().getStyle().setTop(-314.2222f, Unit.PX);
	}

	private void initProjectorWrapper() {
		mProjectorWrapper.getElement().getStyle().setTextAlign(TextAlign.CENTER);
	}
	
	private void initProjectorImage() {
		mProjectorImage.setResource(StarWarsImageResources.INSTANCE.holoprojector());
	}
	
	private void initShadowWrapper() {
		mShadowWrapper.addStyleName(STYLE.holoprojectorShadow());
	}
	
	private void initShadowImage() {
		mShadowImage.setResource(StarWarsImageResources.INSTANCE.shadow());
		mShadowWrapper.getElement().getStyle().setMarginLeft(- mShadowImage.getWidth() / 2, Unit.PX);
		mShadowWrapper.getElement().getStyle().setTop(25, Unit.PX);
	}
}
