package com.starwars.app.client.pager.presenter.impl;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.pager.presenter.ColumnDetail;
import com.starwars.app.client.pager.presenter.Holoprojector;
import com.starwars.app.shared.SectionInfo;


public class ColumnDetailImpl extends BasePresenter<ColumnDetail.Display> implements
ColumnDetail {

	private final Holoprojector mHoloprojector;
	
	@Inject
	public ColumnDetailImpl(final EventBus eventBus,
			final ColumnDetail.Display display,
			Provider<Holoprojector> iProviderHoloprojector) {
		super(eventBus, display);
		mHoloprojector = iProviderHoloprojector.get();
	}

	@Override
	public void bind() {
		super.bind();
	}

	@Override
	public void unbind() {
		super.unbind();
	}
	
	public void init(SectionInfo iSectionInfo) {
		display.setTextTitle(iSectionInfo.getTitle());
		display.setIcon(iSectionInfo.getIcon());
		display.setDescription(iSectionInfo.getDescription());
		
		if (iSectionInfo.getSectionImage() != null) {
			display.setImage(iSectionInfo.getSectionImage().getDisplay().getImage());
			display.setHoloprojector(mHoloprojector.getDisplay().asWidget());
		}
	}
}