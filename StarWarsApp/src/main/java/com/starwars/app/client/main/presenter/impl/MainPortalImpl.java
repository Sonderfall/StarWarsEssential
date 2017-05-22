package com.starwars.app.client.main.presenter.impl;

import com.google.gwt.user.client.Timer;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.main.event.PortalClickEvent;
import com.starwars.app.client.main.event.PortalClickHandler;
import com.starwars.app.client.main.event.PortalOverEvent;
import com.starwars.app.client.main.event.PortalOverEvent.TypePortalOver;
import com.starwars.app.client.main.event.PortalOverHandler;
import com.starwars.app.client.main.presenter.ClassicPortal;
import com.starwars.app.client.main.presenter.ClassicPortalText;
import com.starwars.app.client.main.presenter.LegendsPortal;
import com.starwars.app.client.main.presenter.LegendsPortalText;
import com.starwars.app.client.main.presenter.MainPortal;
import com.starwars.app.client.pager.presenter.Circle;


public class MainPortalImpl extends BasePresenter<MainPortal.Display> implements
MainPortal {

	private final LegendsPortal mLegendsPortal;
	private final ClassicPortal mClassicPortal;
	
	private final LegendsPortalText mLegendsPortalText;
	private final ClassicPortalText mClassicPortalText;
	
	private final Circle mCircle;
	
	@Inject
	public MainPortalImpl(final EventBus eventBus,
			final MainPortal.Display display,
			Provider<LegendsPortal> iLegendsPortal,
			Provider<ClassicPortal> iClassicPortal,
			Provider<LegendsPortalText> iLegendsPortalText,
			Provider<ClassicPortalText> iClassicPortalText,
			Provider<Circle> iCircle) {
		super(eventBus, display);
		mLegendsPortal = iLegendsPortal.get();
		mClassicPortal = iClassicPortal.get();
		
		mLegendsPortalText = iLegendsPortalText.get();
		mClassicPortalText = iClassicPortalText.get();
		
		mCircle = iCircle.get();
		
		display.addLegendsPortal(mLegendsPortal.getDisplay().asWidget());
		display.addClassicPortal(mClassicPortal.getDisplay().asWidget());
		
		display.addLegendsPortalText(mLegendsPortalText.getDisplay().asWidget());
		display.addClassicPortalText(mClassicPortalText.getDisplay().asWidget());
		
		display.addCircle(mCircle.getDisplay().asWidget());
		
		reset();
	}

	@Override
	public void bind() {
		super.bind();
		
		mLegendsPortal.bind();
		mClassicPortal.bind();
		
		mLegendsPortalText.bind();
		mClassicPortalText.bind();
		
		registerHandler(eventBus.addHandler(PortalOverEvent.getType(), new PortalOverHandler() {

			@Override
			public void onPortalOver(PortalOverEvent event) {
				displayText(event.getTypePortalOver());
			}
		}));
		
		registerHandler(eventBus.addHandler(PortalClickEvent.getType(), new PortalClickHandler() {

			@Override
			public void onPortalClick(final PortalClickEvent event) {
				if (!event.isFadeOutPortal()) {
					display.fadeOutPortals();
					Timer lTimer = new Timer() {
						@Override
						public void run() {
							event.setFadeOutPortal(true);
							eventBus.fireEvent(event);
						}
					};
					lTimer.schedule(1000);
				}
			}
		}));
	}
	
	@Override
	public void unbind() {
		super.unbind();
		
		mLegendsPortal.unbind();
		mClassicPortal.unbind();
		
		mLegendsPortalText.unbind();
		mClassicPortalText.unbind();
	}
	
	@Override
	public void reset() {
		display.fadeInPortals();
		mLegendsPortalText.getDisplay().hide();
		mClassicPortalText.getDisplay().hide();
	}
	
	private void displayText(TypePortalOver iTypePortalOver) {
		switch (iTypePortalOver) {
		case hideClassic:
			mClassicPortalText.getDisplay().hide();
			break;
		case hideLegends:
			mLegendsPortalText.getDisplay().hide();
			break;
		case showClassic:
			mClassicPortalText.getDisplay().show();
			break;
		case showLegends:
			mLegendsPortalText.getDisplay().show();
			break;
		}
	}
}
