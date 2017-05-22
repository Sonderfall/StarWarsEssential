package com.starwars.app.client.pager.view;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.pager.presenter.NodePathItem;
import com.starwars.app.client.tools.DivPanel;

public class NodePathItemView extends ADivView implements NodePathItem.Display {

	private final DivPanel mLabel;
	private final DivPanel mContainer;
	private final DivPanel mIcon;

	public NodePathItemView() {
		mContainer = new DivPanel();
		mRoot.add(mContainer);

		mContainer.addStyleName(STYLE.rad3());
		mContainer.addStyleName(STYLE.left());
		mContainer.addStyleName(STYLE.transBg());
		mContainer.addStyleName(STYLE.itemNav());

		mIcon = new DivPanel();
		mContainer.add(mIcon);
		mIcon.getElement().setAttribute("aria-hidden", "true");
		mIcon.addStyleName(STYLE.cFFFFFF());
//		mIcon.addStyleName(STYLE.f18());
		mIcon.addStyleName(STYLE.left());
		mIcon.addStyleName(STYLE.transColor());
		mIcon.addStyleName(STYLE.webfontIcon());

		mLabel = new DivPanel();
		mContainer.add(mLabel);
		mLabel.addStyleName(STYLE.cFFFFFF());
		mLabel.addStyleName(STYLE.droidsans());
		mLabel.addStyleName(STYLE.f11());
		mLabel.addStyleName(STYLE.left());
		mLabel.addStyleName(STYLE.transColor());
	}

	@Override
	public HandlerRegistration addClickHandler(ClickHandler handler) {
		return mRoot.addClickHandler(handler);
	}
	
	public void setLabel(String iText) {
		mLabel.setText(iText);
		mLabel.setTitle(iText);
	}

	public void setIcon(String iIcon) {
		mIcon.getElement().setAttribute("data-icon", iIcon);
		if (iIcon == "L") {
			mIcon.addStyleName(STYLE.f20());
			mIcon.getElement().getStyle().setTop(1, Unit.PX);
		} else {
			mIcon.addStyleName(STYLE.f18());
		}
	}
	
	public void setActivate() {
		mContainer.addStyleName(STYLE.active());
	}
	
	public void setInactivate() {
		mContainer.removeStyleName(STYLE.active());
	}


}
