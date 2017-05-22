package com.starwars.app.client.pager.view;

import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.dom.client.Style.TextAlign;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.dom.client.Style.WhiteSpace;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.pager.presenter.ColumnDetail;
import com.starwars.app.client.tools.DivPanel;

public class ColumnDetailView extends ADivView implements ColumnDetail.Display {

	private final DivPanel mTitle;
	private final DivPanel mIcon;
	private final DivPanel mDisplay;
	private final DivPanel mImage;
	private final DivPanel mDescription;
	private final DivPanel mSecondLine;

	public ColumnDetailView() {
		mRoot.getElement().getStyle().setPosition(Position.RELATIVE);
		
		DivPanel lHeader = new DivPanel();
		mRoot.add(lHeader);
		
		DivPanel lHeaderContainerIcon = new DivPanel();
		lHeader.add(lHeaderContainerIcon);
		lHeaderContainerIcon.addStyleName(STYLE.icon());
		lHeaderContainerIcon.addStyleName(STYLE.bgBlue());
		lHeaderContainerIcon.addStyleName(STYLE.icon25px());
		lHeaderContainerIcon.addStyleName(STYLE.left());
		lHeaderContainerIcon.addStyleName(STYLE.mT2());
		lHeaderContainerIcon.addStyleName(STYLE.blueShadowBox());
		
		mIcon = new DivPanel();
		lHeaderContainerIcon.add(mIcon);
		mIcon.getElement().setAttribute("aria-hidden", "true");
		mIcon.addStyleName(STYLE.webfontIcon());
		
		mTitle = new DivPanel();
		lHeader.add(mTitle);
		mTitle.addStyleName(STYLE.cFFFFFF());
		mTitle.addStyleName(STYLE.geometricslabserifMediumItalic());
		mTitle.addStyleName(STYLE.f30());
		mTitle.addStyleName(STYLE.left());
		mTitle.addStyleName(STYLE.mL10());
		
		DivPanel lHeaderClear = new DivPanel();
		lHeader.add(lHeaderClear);
		lHeaderClear.addStyleName(STYLE.clear());
		
		HTMLPanel l0 = new HTMLPanel("<br>");
		lHeader.add(l0);
		
		DivPanel lHeaderLine = new DivPanel();
		lHeader.add(lHeaderLine);
		lHeaderLine.addStyleName(STYLE.line());
		lHeaderLine.addStyleName(STYLE.bg4D4D4D());

		mDisplay = new DivPanel();
		mRoot.add(mDisplay);
		mDisplay.addStyleName(STYLE.originTop());
		mDisplay.getElement().getStyle().setPosition(Position.RELATIVE);
		mDisplay.getElement().getStyle().setBottom(30, Unit.PX);
		
		mImage = new DivPanel();
		mDisplay.add(mImage);
		mImage.getElement().getStyle().setHeight(395, Unit.PX);
		mImage.addStyleName(STYLE.positionInitial());
		
		mSecondLine = new DivPanel();
		mSecondLine.addStyleName(STYLE.line());
		mSecondLine.addStyleName(STYLE.bg4D4D4D());
		mSecondLine.getElement().getStyle().setMarginTop(15, Unit.PX);
		mSecondLine.getElement().getStyle().setMarginBottom(25, Unit.PX);

		mDescription = new DivPanel();
		mDescription.addStyleName(STYLE.f12());
		mDescription.addStyleName(STYLE.lh130per());
		mDescription.addStyleName(STYLE.blackShadowText());
		mDescription.getElement().getStyle().setColor("darkgrey");
		mDescription.getElement().getStyle().setTextAlign(TextAlign.JUSTIFY);
		mDescription.getElement().getStyle().setWhiteSpace(WhiteSpace.PRE_LINE);
		mDescription.getElement().getStyle().setPaddingTop(10, Unit.PX);
	}
	
	public void setTextTitle(String iTitle) {
		mTitle.setText(iTitle);
	}
	
	public void setIcon(String iIcon) {
		mIcon.getElement().setAttribute("data-icon", iIcon);
	}
	
	public void setImage(Image iImage) {
		mImage.add(iImage);
		if (Window.getClientWidth() < 1200) {
			mDisplay.addStyleName(STYLE.zoom50());
			mDescription.addStyleName(STYLE.zoom165());
			mSecondLine.addStyleName(STYLE.zoom165());
		} else if (Window.getClientWidth() >= 1200 && Window.getClientWidth() < 1800) {
			mDisplay.addStyleName(STYLE.zoom70());
			mDescription.addStyleName(STYLE.zoom145());
			mSecondLine.addStyleName(STYLE.zoom145());
		} else if (Window.getClientWidth() >= 1800) {
			mDisplay.addStyleName(STYLE.zoom90());
			mDescription.addStyleName(STYLE.zoom115());
			mSecondLine.addStyleName(STYLE.zoom115());
		}
	}
	
	public void setHoloprojector(Widget iWidget) {
		mDisplay.add(iWidget);
		mDisplay.add(mSecondLine);
		mDisplay.add(mDescription);
	}
	
	public void setDescription(String iDescription) {
		mDescription.setText(iDescription);
	}
	
}
