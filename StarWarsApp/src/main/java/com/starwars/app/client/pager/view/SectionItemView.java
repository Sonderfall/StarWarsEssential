package com.starwars.app.client.pager.view;

import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.starwars.app.client.pager.presenter.SectionItem;

public class SectionItemView extends AItemView implements SectionItem.Display {

	
	public SectionItemView() {
		super();
		mRoot.addStyleName(STYLE.relative());
		
		mRoot.add(mContainerLineTop);
		mLineTop.addStyleName(STYLE.line());
		mLineTop.addStyleName(STYLE.gradBlueLine());
		mLineTop.addStyleName(STYLE.w75per());
		mLineTop.addStyleName(STYLE.w220min());
		mLineTop.addStyleName(STYLE.left());
		mLineTop.addStyleName(STYLE.mY15());

		mRoot.add(mContainer);
		mContainer.addStyleName(STYLE.bor00ACE7Op50());
		mContainer.addStyleName(STYLE.borderRadiusOpposite5());
		mContainer.addStyleName(STYLE.left());
		mContainer.addStyleName(STYLE.relative());
		mContainer.addStyleName(STYLE.itemNav());
		mContainer.addStyleName(STYLE.transAll());
		
		mContainer.add(mHeader);
		mHeader.addStyleName(STYLE.rad5());
		mHeader.addStyleName(STYLE.pX10());
		mHeader.addStyleName(STYLE.pY10());


		mHeader.add(mContainerIcon);
		mContainerIcon.addStyleName(STYLE.icon());
		mContainerIcon.addStyleName(STYLE.bgWhite08());
		mContainerIcon.addStyleName(STYLE.left());

		mContainerIcon.add(mIcon);
		mIcon.getElement().setAttribute("aria-hidden", "true");
		mIcon.addStyleName(STYLE.webfontIcon());

		mHeader.add(mTitle);
		mTitle.addStyleName(STYLE.droidsans());
		mTitle.addStyleName(STYLE.cFFFFFF());
		mTitle.addStyleName(STYLE.left());
		mTitle.addStyleName(STYLE.mL10());
		mTitle.addStyleName(STYLE.rightDirection());

		mHeader.add(mHeaderClear);
		mHeaderClear.addStyleName(STYLE.clear());

		mRoot.add(mContainerLineBottom);
		mLineBottom.addStyleName(STYLE.line());
		mLineBottom.addStyleName(STYLE.gradBlueLine());
		mLineBottom.addStyleName(STYLE.w75per());
		mLineBottom.addStyleName(STYLE.w220min());
		mLineBottom.addStyleName(STYLE.left());
		mLineBottom.addStyleName(STYLE.mY15());
	}
	
	public void show() {
		this.getElement().getStyle().clearDisplay();
	}
	
	public void hide() {
		this.getElement().getStyle().setDisplay(com.google.gwt.dom.client.Style.Display.NONE);
	}

	@Override
	public void setLockedMode() {
		mContainer.removeStyleName(STYLE.bg00ACE7Op15());
		mContainer.removeStyleName(STYLE.op99());
		mContainer.removeStyleName(STYLE.pointer());
		mContainer.removeStyleName(STYLE.transAll());
		mContainer.addStyleName(STYLE.bg00ACE7Op30());
		mContainer.addStyleName(STYLE.op70());
		mContainer.addStyleName(STYLE.lock());
		
		mIcon.removeStyleName(STYLE.c1C88AF());
	}

	@Override
	public void setUnlockedMode() {
		mContainer.addStyleName(STYLE.bg00ACE7Op15());
		mContainer.addStyleName(STYLE.op99());
		mContainer.addStyleName(STYLE.pointer());
		mContainer.addStyleName(STYLE.transAll());
		mContainer.removeStyleName(STYLE.bg00ACE7Op30());
		mContainer.removeStyleName(STYLE.op70());
		mContainer.removeStyleName(STYLE.lock());

		
		mIcon.addStyleName(STYLE.c1C88AF());
	}
	
	@Override
	public void setActiveState() {
		setOver();
		
		mHeader.addStyleName(STYLE.backgroundTransBlueActive());
		mHeader.removeStyleName(STYLE.backgroundTransBlueInactive());
		
		mContainer.addStyleName(STYLE.active());
		mContainer.removeStyleName(STYLE.inactive());
		mContainer.addStyleName(STYLE.transAll());
		
		mContainerLineTop.add(mLineTop);
		mContainerLineTop.addStyleName(STYLE.rightDirection());
		
		mContainerLineBottom.add(mLineBottom);
		mContainerLineBottom.addStyleName(STYLE.rightDirection());

		mContainer.removeStyleName(STYLE.w80per());
		mContainer.addStyleName(STYLE.w100per());
		
		mLineTop.getElement().getStyle().setPosition(Position.ABSOLUTE);
		mLineTop.getElement().getStyle().setMarginTop(-13, Unit.PX);

		mLineBottom.getElement().getStyle().setPosition(Position.ABSOLUTE);
		if (mTitle.getStyleName().contains(STYLE.f22())) {
			mLineBottom.getElement().getStyle().setMarginTop(90, Unit.PX);
		} else {
			mLineBottom.getElement().getStyle().setMarginTop(65, Unit.PX);
		}
		
		Timer lTimer = new Timer() {

			@Override
			public void run() {
				mRoot.getElement().scrollIntoView();
				mRoot.getElement().setScrollTop(mRoot.getElement().getScrollTop() + Window.getClientHeight() / 2 - 45);
			}
		};
		lTimer.schedule(300);
	}

	@Override
	public void setInactiveState() {
		setOut();
		
		mHeader.removeStyleName(STYLE.backgroundTransBlueActive());
		mHeader.addStyleName(STYLE.backgroundTransBlueInactive());
		
		mContainer.addStyleName(STYLE.transAll());
		mContainer.removeStyleName(STYLE.active());
		mContainer.addStyleName(STYLE.inactive());
		
		mContainer.addStyleName(STYLE.w80per());
		mContainer.removeStyleName(STYLE.w100per());

		mContainerLineTop.remove(mLineTop);
		mContainerLineBottom.remove(mLineBottom);
	}


	@Override
	public void setModeBig() {
		mContainer.addStyleName(STYLE.pY10());
		mContainer.addStyleName(STYLE.pX10());
		mContainerIcon.addStyleName(STYLE.icon35px());
		mTitle.addStyleName(STYLE.f22());
		mTitle.addStyleName(STYLE.mT5());
	}

	@Override
	public void setModeNormal() {
		mContainer.addStyleName(STYLE.pY5());
		mContainer.addStyleName(STYLE.pX5());
		mContainerIcon.addStyleName(STYLE.icon20px());
		mTitle.addStyleName(STYLE.f17());
		mTitle.addStyleName(STYLE.mT2());
		mTitle.addStyleName(STYLE.w80per());
	}
}
