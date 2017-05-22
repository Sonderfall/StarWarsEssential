package com.starwars.app.client.pager.presenter;

import java.util.List;

import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.presenter.Presenter;
import com.starwars.app.shared.ElementInfo;
import com.starwars.app.shared.SectionInfo;


public interface ColumnContainer extends Presenter<ColumnContainer.Display> {

	public static enum ColumnMode {
		home,
		left,
		right,
		none;
	}
	
	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void addItem(Widget iWidget);
		void addSeparator();
		void addLastSeparator();
		void setLeftMode();
		void setRightMode();
		void setNoneMode();
	}
	
	void init(ColumnMode iColumnMode);
	SectionItem addRootSection(SectionInfo iSectionInfo);
	SectionItem addSection(SectionInfo iSectionInfo);
	ElementItem addElement(ElementInfo iElementInfo);
	List<AItem<?, ?>> getItems();
	void reset();
	void clear();
}
