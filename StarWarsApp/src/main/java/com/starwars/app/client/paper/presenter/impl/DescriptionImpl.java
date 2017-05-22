package com.starwars.app.client.paper.presenter.impl;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.StarWarsApp;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.encyclopedia.presenter.HyperLink;
import com.starwars.app.client.paper.presenter.Description;
import com.starwars.app.client.paper.presenter.DescriptionItem;
import com.starwars.app.shared.ComponentElement;
import com.starwars.app.shared.DataBase;


public class DescriptionImpl extends BasePresenter<Description.Display> implements
Description {

	private ComponentElement mComponentElement;
	private final HyperLink mHyperLink;
	
	@Inject
	public DescriptionImpl(final EventBus eventBus,
			final Description.Display display) {
		super(eventBus, display);
		 mHyperLink = StarWarsApp.ginjector.getHyperLink();
	}

	@Override
	public void bind() {
		super.bind();
		mHyperLink.bind();
		
		registerHandler(display.getHasClickHandlers().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				display.hide();
			}
		}));
	}
	
	@Override
	public void unbind() {
		super.unbind();
		mHyperLink.unbind();
	}
	
	@Override
	public void init(ComponentElement iComponentElement) {
		mComponentElement = iComponentElement;
	}
	
	public void draw() {
		display.clearAll();
		display.setTitle(mComponentElement.getTitle());
		
		if (mComponentElement.getInfo().getImageResource() != null) {
			display.setImage(mComponentElement.getInfo().getImageResource());
		}
		
		display.setText(mComponentElement.getInfo().getSumup());
		
		for (DescriptionItem lItem : mComponentElement.getInfo().getItems()) {
			
			switch(mComponentElement.getColor()) {
			case blue:
				lItem.getDisplay().setBlue();
				break;
			case green:
				lItem.getDisplay().setGreen();
				break;
			case purple:
				lItem.getDisplay().setPurple();
				break;
			case orange:
				lItem.getDisplay().setOrange();
				break;
			case darkblue:
				lItem.getDisplay().setDarkBlue();
				break;
			case darkyellow:
				lItem.getDisplay().setDarkYellow();
				break;
			case flesh:
				lItem.getDisplay().setFlesh();
				break;
			case kaki:
				lItem.getDisplay().setKaki();
				break;
			case mediumgreen:
				lItem.getDisplay().setMediumGreen();
				break;
			case mediumgreen2:
				lItem.getDisplay().setMediumGreen2();
				break;
			case mediumorange:
				lItem.getDisplay().setMediumOrange();
				break;
			case mediumpurple:
				lItem.getDisplay().setMediumPurple();
				break;
			case pink:
				lItem.getDisplay().setPink();
				break;
			case red:
				lItem.getDisplay().setRed();
				break;
			case yellow:
				lItem.getDisplay().setYellow();
				break;
			}
			display.addItem(lItem.getDisplay().asWidget());
			lItem.draw();
			if (mComponentElement.getInfo().getItems().indexOf(lItem) != mComponentElement.getInfo().getItems().size() - 1) {
				display.addLine();
			}
			
			if (lItem.getValue().length() <= 41) {
				lItem.getDisplay().setTopRightWrapper(10);
			}
		}
		
		switch(mComponentElement.getColor()) {
		case blue:
			display.setBlue();
			break;
		case green:
			display.setGreen();
			break;
		case purple:
			display.setPurple();
			break;
		case orange:
			display.setOrange();
			break;
		case darkblue:
			display.setDarkBlue();
			break;
		case darkyellow:
			display.setDarkYellow();
			break;
		case flesh:
			display.setFlesh();
			break;
		case kaki:
			display.setKaki();
			break;
		case mediumgreen:
			display.setMediumGreen();
			break;
		case mediumgreen2:
			display.setMediumGreen2();
			break;
		case mediumorange:
			display.setMediumOrange();
			break;
		case mediumpurple:
			display.setMediumPurple();
			break;
		case pink:
			display.setPink();
			break;
		case red:
			display.setRed();
			break;
		case yellow:
			display.setYellow();
			break;
		}
		
		if (mComponentElement.getInfo() != null && DataBase.getInstance().getExistingElementFromDataBase(mComponentElement.getInfo())) {
			mHyperLink.setLink(mComponentElement.getInfo());
			display.setHyperLink(mHyperLink.getDisplay().asWidget());
		}
	}
}
