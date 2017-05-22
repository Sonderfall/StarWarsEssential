package com.starwars.app.client.main.presenter.impl;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.about.event.AboutDescriptionEvent;
import com.starwars.app.client.about.event.AboutDescriptionHandler;
import com.starwars.app.client.about.presenter.About;
import com.starwars.app.client.about.presenter.AboutDescription;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.main.presenter.Header;
import com.starwars.app.client.pager.presenter.NodePath;
import com.starwars.app.client.research.presenter.ResearchEngine;


public class HeaderImpl extends BasePresenter<Header.Display> implements
Header {
	
	private final NodePath mNodePath;
	private final About mAbout;
	private final AboutDescription mAboutDescription;
	private final ResearchEngine mResearchEngine;

	@Inject
	public HeaderImpl(final EventBus eventBus,
			final Header.Display display,
			Provider<NodePath> iProviderNodePath,
			Provider<About> iProviderAbout,
			Provider<AboutDescription> iProviderAboutDescription,
			Provider<ResearchEngine> iProviderResearchEngine) {
		super(eventBus, display);
		
		mNodePath = iProviderNodePath.get();
		display.setNodePath(mNodePath.getDisplay().asWidget());
		mNodePath.bind();
		
		mResearchEngine = iProviderResearchEngine.get();
		display.setSearch(mResearchEngine.getDisplay().asWidget());
		
		mAbout = iProviderAbout.get();
		display.setAbout(mAbout.getDisplay().asWidget());
		
		mAboutDescription = iProviderAboutDescription.get();
		display.setAbout(mAboutDescription.getDisplay().asWidget());
		mAboutDescription.getDisplay().hide();
	}

	@Override
	public void bind() {
		super.bind();
		
		mAbout.bind();
		mAboutDescription.bind();
		mResearchEngine.bind();
		
		registerHandler(eventBus.addHandler(AboutDescriptionEvent.getType(), new AboutDescriptionHandler() {

			@Override
			public void onAboutDescription(AboutDescriptionEvent event) {
				mAboutDescription.getDisplay().show();
			}
		}));
	}
	
	@Override
	public void unbind() {
		super.unbind();
		mAbout.unbind();
		mAboutDescription.unbind();
		mResearchEngine.unbind();
	}
}