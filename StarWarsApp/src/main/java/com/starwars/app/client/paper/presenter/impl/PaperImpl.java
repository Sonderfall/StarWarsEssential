package com.starwars.app.client.paper.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.encyclopedia.event.HyperLinkClickEvent;
import com.starwars.app.client.encyclopedia.event.HyperLinkClickHandler;
import com.starwars.app.client.encyclopedia.presenter.EncyclopediaModule;
import com.starwars.app.client.pager.presenter.Pager;
import com.starwars.app.client.paper.presenter.Paper;
import com.starwars.app.shared.ElementInfo;


public class PaperImpl extends BasePresenter<Paper.Display> implements
Paper {

	private ElementInfo mElementInfo;
	private Pager mPager;
	private int mIter = 0;
	
	@Inject
	public PaperImpl(final EventBus eventBus,
			final Paper.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
		
		registerHandler(eventBus.addHandler(HyperLinkClickEvent.getType(), new HyperLinkClickHandler() {
			
			@Override
			public void onHyperTextLink(HyperLinkClickEvent event) {
				if (mElementInfo != event.getElementInfo()) {
					unbind();
				}
			}
		}));
	}

	@Override
	public void unbind() {
		super.unbind();
		mElementInfo.getAModule().unbind();
	}

	public void init(ElementInfo iElementInfo) {
		mElementInfo = iElementInfo;
		display.clearAdvancedComponent();
		display.setTextTitle(mElementInfo.getTitle());
		display.setDescription(mElementInfo.getDescription());
	}

	public void draw() {
		display.clearAdvancedComponent();
		if (mElementInfo.getAModule() != null) {
			mElementInfo.loadDatas();
			mElementInfo.getAModule().loadDatas();
			if (mElementInfo.getAModule() instanceof EncyclopediaModule) {
				mPager.getDisplay().showImagePanel();
				mElementInfo.getAModule().reset();
				mElementInfo.getAModule().bind();
				display.addDoc(mElementInfo.getAModule().getDisplay().asWidget());
				if (mElementInfo.getImageResource() != null) {
					display.setImageTitle(mElementInfo.getMainImage().getDisplay().getImage());
				}
			}  else {
				display.setAdvancedComponent(mElementInfo.getAModule().getDisplay().asWidget());
				mPager.getDisplay().hideImagePanel();
				mElementInfo.getAModule().reset();
				mElementInfo.getAModule().bind();
				if (mIter++ == 0) {
					mElementInfo.getAModule().process();
				}
			}
		}
	}
	
	@Override
	public void setPager(Pager iPager) {
		mPager = iPager;
	}
}
