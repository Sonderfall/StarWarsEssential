package com.starwars.app.client.pager.presenter.impl;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.pager.presenter.AItem;
import com.starwars.app.client.pager.presenter.ColumnContainer;
import com.starwars.app.client.pager.presenter.ElementItem;
import com.starwars.app.client.pager.presenter.SectionItem;
import com.starwars.app.client.pager.presenter.SectionItem.SectionItemType;
import com.starwars.app.shared.ElementInfo;
import com.starwars.app.shared.SectionInfo;


public class ColumnContainerImpl extends BasePresenter<ColumnContainer.Display> implements
ColumnContainer {

	private Provider<SectionItem> mProviderSectionItem;
	private Provider<ElementItem> mProviderElementItem;
	private final List<AItem<?, ?>> mItems;

	@Inject
	public ColumnContainerImpl(final EventBus eventBus,
			final ColumnContainer.Display display,
			Provider<SectionItem> iProviderSectionItem,
			Provider<ElementItem> iProviderElementItem) {
		super(eventBus, display);
		mProviderSectionItem = iProviderSectionItem;
		mProviderElementItem = iProviderElementItem;
		mItems = new ArrayList<AItem<?, ?>>();
	}

	@Override
	public void bind() {
		super.bind();
	}

	public void init(ColumnMode iColumnMode) {
		switch (iColumnMode) {
		case home:
			display.setLeftMode();
			break;
		case left:
			display.setLeftMode();
			break;
		case right:
			display.setRightMode();
			break;
		case none:
			display.setNoneMode();
			break;
		default:
			break;
		}
		for (AItem<?, ?> lItem : mItems) {
			lItem.changeColumnMode(iColumnMode);
		}
	}

	private SectionItem addSection(SectionInfo iSectionInfo, boolean iBig) {
		SectionItem lSectionItem = mProviderSectionItem.get();
		lSectionItem.bind();
		lSectionItem.init(iSectionInfo);
		if (iBig) {
			lSectionItem.setMode(SectionItemType.big);
		} else {
			lSectionItem.setMode(SectionItemType.normal);
		}
		display.addSeparator();
		display.addItem(lSectionItem.getDisplay().asWidget());
		mItems.add(lSectionItem);
		return lSectionItem;
	}
	
	public SectionItem addSection(SectionInfo iSectionInfo) {
		return addSection(iSectionInfo, false);
	}

	public SectionItem addRootSection(SectionInfo iSectionInfo) {
		return addSection(iSectionInfo, true);
	}
	
	@Override
	public ElementItem addElement(ElementInfo iElementInfo) {
		ElementItem lExerciseItem = mProviderElementItem.get();
		lExerciseItem.bind();
		lExerciseItem.init(iElementInfo);
		display.addSeparator();
		display.addItem(lExerciseItem.getDisplay().asWidget());
		mItems.add(lExerciseItem);
		return lExerciseItem;
	}

	@Override
	public void reset() {
		for (AItem<?, ?> lItem : mItems) {
			lItem.reset();
		}
	}
	
	public void clear() {
		mItems.clear();
	}
	
	public List<AItem<?, ?>> getItems() {
		return mItems;
	}
}
