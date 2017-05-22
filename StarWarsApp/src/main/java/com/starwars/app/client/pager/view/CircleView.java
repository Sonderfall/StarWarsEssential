package com.starwars.app.client.pager.view;

import com.google.gwt.user.client.Window;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.pager.presenter.Circle;
import com.starwars.app.client.tools.DivPanel;

public class CircleView extends ADivView implements Circle.Display {

	private final DivPanel mMainWrapper;
	private final DivPanel mExtraCircle;
	private final DivPanel mMediumCircle;
	private final DivPanel mInnerCircle;

	public CircleView() {
		initRoot();
		
		mMainWrapper = new DivPanel();
		initMainWrapper();
		mRoot.add(mMainWrapper);
		
		mExtraCircle = new DivPanel();
		initExtraCircle();
		mMainWrapper.add(mExtraCircle);
		
		mMediumCircle = new DivPanel();
		initMediumCircle();
		mMainWrapper.add(mMediumCircle);
		
		mInnerCircle = new DivPanel();
		initInnerCircle();
		mMainWrapper.add(mInnerCircle);
	}
	
	private void initRoot() {
		mRoot.addStyleName(STYLE.originInitial());
	}
	
	private void initMainWrapper() {
		mMainWrapper.addStyleName(STYLE.circles());
	}
	
	private void initExtraCircle() {
		mExtraCircle.addStyleName(STYLE.circle1());
	}
	
	private void initMediumCircle() {
		mMediumCircle.addStyleName(STYLE.circleM());
	}
	
	private void initInnerCircle() {
		mInnerCircle.addStyleName(STYLE.circle2());
	}

	@Override
	public void zoom() {
		if (Window.getClientWidth() < 1200) {
			mRoot.addStyleName(STYLE.zoom70());
		} else if (Window.getClientWidth() >= 1200 && Window.getClientWidth() < 1800) {
			mRoot.addStyleName(STYLE.zoom80());
		}
	}
}
