package com.starwars.app.client.pager.view;

import com.google.gwt.dom.client.Style.Unit;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.pager.presenter.AItem;
import com.starwars.app.client.tools.DivPanel;

public abstract class AItemView extends ADivView implements AItem.Display {

	protected final DivPanel mContainer;
	protected final DivPanel mHeader;
	protected final DivPanel mContainerIcon;
	protected final DivPanel mIcon;
	protected final DivPanel mTitle;
	protected final DivPanel mHeaderClear;

	protected final DivPanel mContainerLineTop;
	protected final DivPanel mLineTop;
	protected final DivPanel mContainerLineBottom;
	protected final DivPanel mLineBottom;
	
	public AItemView() {
		mRoot.addStyleName(STYLE.transAll());
		
		mContainer = new DivPanel();
		mHeader = new DivPanel();
		mContainerIcon = new DivPanel();
		mIcon = new DivPanel();
		mTitle = new DivPanel();
		mHeaderClear = new DivPanel();
		mContainerLineTop = new DivPanel();
		mLineTop = new DivPanel();
		
		mContainerLineBottom = new DivPanel();
		mRoot.add(mContainerLineBottom);

		mLineBottom = new DivPanel();
	}

	@Override
	public void setIcon(String iIcon) {
		mIcon.getElement().setAttribute("data-icon", iIcon);
	}
	
	@Override
	public void setTextTitle(String iTitle) {
		mTitle.setText(iTitle);
		mRoot.getElement().setAttribute("id", iTitle);
	}
	
	@Override
	public void setOver() {
		mRoot.getElement().getStyle().setLeft(25, Unit.PX);
	}
	
	@Override
	public void setOut() {
		mRoot.getElement().getStyle().setLeft(0, Unit.PX);
	}
}
