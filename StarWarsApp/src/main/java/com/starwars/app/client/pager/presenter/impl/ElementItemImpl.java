package com.starwars.app.client.pager.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.pager.presenter.ColumnContainer.ColumnMode;
import com.starwars.app.client.pager.presenter.ElementItem;
import com.starwars.app.shared.ElementInfo;


public class ElementItemImpl extends AItemImpl<ElementInfo, ElementItem.Display> implements
ElementItem {

	@Inject
	public ElementItemImpl(final EventBus eventBus,
			final ElementItem.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}

	@Override
	public void init(ElementInfo iInfo) {
		super.init(iInfo);
		display.setExamMode();
		display.setTextTitle(iInfo.getTitle());
		display.setIcon(iInfo.getIcon());
		display.setTextContainer(iInfo.getTitle());
		display.setTag(iInfo.getTag());
	}

	@Override
	public void changeColumnMode(ColumnMode iColumnMode) {
		// TODO Auto-generated method stub

	}
}
