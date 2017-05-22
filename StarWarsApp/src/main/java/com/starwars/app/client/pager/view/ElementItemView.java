package com.starwars.app.client.pager.view;

import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.starwars.app.client.pager.presenter.ElementItem;
import com.starwars.app.client.tools.DivPanel;

public class ElementItemView extends AItemView implements ElementItem.Display {


	private final DivPanel mContainer;

	public ElementItemView() {
		super();
		mRoot.addStyleName(STYLE.relative());
		mRoot.add(mContainerLineTop);

		mLineTop.addStyleName(STYLE.line());
		mLineTop.addStyleName(STYLE.gradBlueLine());
		mLineTop.addStyleName(STYLE.w80per());
		mLineTop.addStyleName(STYLE.w220min());
		mLineTop.addStyleName(STYLE.left());
		mLineTop.addStyleName(STYLE.mY15());

		mContainer = new DivPanel();
		mRoot.add(mContainer);
	
		mLineBottom.addStyleName(STYLE.line());
		mLineBottom.addStyleName(STYLE.gradBlueLine());
		mLineBottom.addStyleName(STYLE.w80per());
		mLineBottom.addStyleName(STYLE.w220min());
		mLineBottom.addStyleName(STYLE.left());
		mLineBottom.addStyleName(STYLE.mY15());

		setLockedMode();
		setInactiveState();
	}
	
	public void show() {
		this.getElement().getStyle().clearDisplay();
	}
	
	public void hide() {
		this.getElement().getStyle().setDisplay(com.google.gwt.dom.client.Style.Display.NONE);
	}

	@Override
	public void setTag(String iTag) {
//		mTag.setText(iTag);
	}

	@Override
	public void setTextContainer(String iText) {
		mContainer.setTitle(iText);
	}

	public void setLockedMode() {
		mContainer.removeStyleName(STYLE.pointer());
		mContainer.addStyleName(STYLE.lock());
	}

	public void setUnlockedMode() {
		mContainer.removeStyleName(STYLE.lock());
		mContainer.addStyleName(STYLE.pointer());
	}

	public void setActiveState() {
		setOver();
		
		mContainer.removeStyleName(STYLE.inactive());
		mContainer.addStyleName(STYLE.active());
		
		mHeader.addStyleName(STYLE.backgroundTransBlueActive());
		mHeader.removeStyleName(STYLE.backgroundTransBlueInactive());
		
		mContainerLineTop.add(mLineTop);
		mContainerLineTop.addStyleName(STYLE.rightDirection());
		
		mContainerLineBottom.add(mLineBottom);
		mContainerLineBottom.addStyleName(STYLE.rightDirection());

		mLineTop.getElement().getStyle().setPosition(Position.ABSOLUTE);
		mLineTop.getElement().getStyle().setMarginTop(-13, Unit.PX);

		mLineBottom.getElement().getStyle().setPosition(Position.ABSOLUTE);
		mLineBottom.getElement().getStyle().setMarginTop(65, Unit.PX);

		Timer lTimer = new Timer() {
			@Override
			public void run() {
				mRoot.getElement().scrollIntoView();
				mRoot.getElement().setScrollTop(mRoot.getElement().getScrollTop() + Window.getClientHeight() / 2 - 32);
			}
		};
		lTimer.schedule(300);
	}

	public void setInactiveState() {
		setOut();
		
		mHeader.removeStyleName(STYLE.backgroundTransBlueActive());
		mHeader.addStyleName(STYLE.backgroundTransBlueInactive());
		
		mContainer.addStyleName(STYLE.inactive());
		mContainer.removeStyleName(STYLE.active());
		mContainerLineTop.remove(mLineTop);
		mContainerLineBottom.remove(mLineBottom);
	}

	@Override
	public void setExamMode() {
		mRoot.clear();
		mContainer.clear();
		mHeader.clear();
		mContainerIcon.clear();
		
		mRoot.add(mContainer);
		mRoot.add(mContainerLineTop);
		mContainer.add(mHeader);
		mHeader.add(mContainerIcon);
		mContainerIcon.add(mIcon);
		mHeader.add(mTitle);
		mHeader.add(mHeaderClear);

		mRoot.add(mContainerLineBottom);
		
		mContainer.addStyleName(STYLE.bor00ACE7Op50());
		mContainer.addStyleName(STYLE.bg00ACE7Op15());
		mContainer.addStyleName(STYLE.borderRadiusOpposite5());
		mContainer.addStyleName(STYLE.left());
		mContainer.addStyleName(STYLE.relative());
		mContainer.addStyleName(STYLE.itemNav());
		mContainer.addStyleName(STYLE.pY5());
		mContainer.addStyleName(STYLE.pX5());
		mContainer.addStyleName(STYLE.transAll());
		mHeader.addStyleName(STYLE.rad5());
		mHeader.addStyleName(STYLE.pX10());
		mHeader.addStyleName(STYLE.pY10());
		mContainerIcon.addStyleName(STYLE.icon());
		mContainerIcon.addStyleName(STYLE.bgWhite08());
		mContainerIcon.addStyleName(STYLE.left());
		mIcon.getElement().setAttribute("aria-hidden", "true");
		mIcon.addStyleName(STYLE.webfontIcon());
		mTitle.addStyleName(STYLE.droidsans());
		mTitle.addStyleName(STYLE.cFFFFFF());
		mTitle.addStyleName(STYLE.left());
		mTitle.addStyleName(STYLE.mL10());
		mTitle.addStyleName(STYLE.f17());
		mTitle.addStyleName(STYLE.mT2());
		mTitle.addStyleName(STYLE.w80per());
		mTitle.addStyleName(STYLE.rightDirection());
		mHeaderClear.addStyleName(STYLE.clear());
		mContainerIcon.addStyleName(STYLE.icon20px());
	}

	@Override
	public void setNormalMode() {
		mContainer.addStyleName(STYLE.exerciseNav());
		mContainer.addStyleName(STYLE.bg00ACE7Op30());
		mContainer.addStyleName(STYLE.bor00ACE7Op50());
		mContainer.addStyleName(STYLE.rad5());
		mContainer.addStyleName(STYLE.pY5());
		mContainer.addStyleName(STYLE.pX5());
		mContainer.addStyleName(STYLE.left());
		mContainer.addStyleName(STYLE.relative());
		mContainer.addStyleName(STYLE.transAll());
		mContainer.addStyleName(STYLE.w80per());
		mContainer.addStyleName(STYLE.itemNav());
	}
}
