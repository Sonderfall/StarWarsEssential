package com.starwars.app.client.pager.view;

import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.pager.presenter.ColumnContainer;
import com.starwars.app.client.resources.StarWarsResources;
import com.starwars.app.client.resources.StyleSheetCssResource;
import com.starwars.app.client.tools.DivPanel;

public class ColumnSectionView extends ADivView implements ColumnContainer.Display {

	private static final StyleSheetCssResource STYLE = StarWarsResources.INSTANCE.stylesheetCss();
	
	private final DivPanel mNav;
	
	public ColumnSectionView() {
		mRoot.getElement().setAttribute("role", "navigation");
		mNav = new DivPanel();
		mRoot.add(mNav);
	}

	public void addItem(Widget iWidget) {
		mNav.add(iWidget);
	}
	
	public void addSeparator() {
		DivPanel lSeparator = new DivPanel();
		mNav.add(lSeparator);
		lSeparator.addStyleName(STYLE.sp25());
		lSeparator.addStyleName(STYLE.clear());
	}

	public void addLastSeparator() {
		DivPanel lSeparator = new DivPanel();
		mNav.add(lSeparator);
		lSeparator.addStyleName(STYLE.clear());
		lSeparator.addStyleName(STYLE.sp30());
	}

	@Override
	public void setLeftMode() {
		mNav.removeStyleName(STYLE.navHome());
		mNav.addStyleName(STYLE.navCurrent());
		mNav.removeStyleName(STYLE.navNext());
	}

	@Override
	public void setRightMode() {
		mNav.removeStyleName(STYLE.navHome());
		mNav.removeStyleName(STYLE.navCurrent());
		mNav.addStyleName(STYLE.navNext());
	}

	@Override
	public void setNoneMode() {
		mNav.removeStyleName(STYLE.navHome());
		mNav.removeStyleName(STYLE.navCurrent());
		mNav.removeStyleName(STYLE.navNext());
	}

}
