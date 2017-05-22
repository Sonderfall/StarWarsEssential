package com.starwars.app.client.pager.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.pager.presenter.ColumnContainer.ColumnMode;
import com.starwars.app.client.pager.presenter.SectionItem;
import com.starwars.app.shared.SectionInfo;


public class SectionItemImpl extends AItemImpl<SectionInfo, SectionItem.Display> implements
SectionItem {

	@Inject
	public SectionItemImpl(final EventBus eventBus,
			final SectionItem.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}

	@Override
	public void init(SectionInfo iSectionInfo) {
		super.init(iSectionInfo);
		display.setTextTitle(iSectionInfo.getTitle());
		display.setIcon(iSectionInfo.getIcon());
	}

	@Override
	public void changeColumnMode(ColumnMode iColumnMode) {
		switch (iColumnMode) {
		case home:
			if (mIsActivateState) {
				display.setInactiveState();
				mIsActivateState = false;
			}
			break;
		default:
			break;
		}
	}

	@Override
	public void setMode(SectionItemType iSectionItemType) {
		switch (iSectionItemType) {
		case big:
			display.setModeBig();
			break;
		case normal:
			display.setModeNormal();
			break;
		default:
			break;
		}
	}
}
