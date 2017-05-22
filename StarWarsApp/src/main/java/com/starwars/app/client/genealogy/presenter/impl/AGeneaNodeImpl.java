package com.starwars.app.client.genealogy.presenter.impl;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.genealogy.event.GeneaDescriptionEvent;
import com.starwars.app.client.genealogy.presenter.AGeneaNode;
import com.starwars.app.client.genealogy.presenter.GenealogyModule;
import com.starwars.app.client.paper.presenter.impl.AComponentImpl;


public abstract class AGeneaNodeImpl<D extends AGeneaNode.Display> extends AComponentImpl<D> implements
AGeneaNode<D> {

	private final List<AGeneaNode<?>> mSons;
	private GenealogyModule mGenealogy;
	private AGeneaNode<?> mFather;
	private AGeneaNode<?> mMother;
	private AGeneaNode<?> mAdoptedFather;
	private AGeneaNode<?> mAdoptedMother;
	private AGeneaNode<?> mSpouse;
	private boolean mIsVisited;
	private boolean mInverseVisitedParent;
	private boolean mIsAlignSon;
	private boolean mIsBind;
	private int mLevel;
	private int mHardCodeLeftAcc;

	@Inject
	public AGeneaNodeImpl(final EventBus eventBus,
			final D display) {
		super(eventBus, display);
		mSons = new ArrayList<AGeneaNode<?>>();
		mIsVisited = false;
		mInverseVisitedParent = false;
		mIsAlignSon = false;
		mIsBind = false;
		mLevel = 0;
		mHardCodeLeftAcc = 0;
	}

	@Override
	public void bind() {
		super.bind();
		mIsBind = true;
		registerHandler(display.getHasClickHandlers().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				GeneaDescriptionEvent lGeneaDescriptionEvent = new GeneaDescriptionEvent();
				lGeneaDescriptionEvent.setGeneaInfo(mComponentElement);
				eventBus.fireEvent(lGeneaDescriptionEvent);
			}
		}));
	}
	
	@Override
	public void unbind() {
		super.unbind();
		mIsBind = false;
	}
	
	public void init() {}
	
	public boolean getIsAlignSon() {
		return mIsAlignSon;
	}
	
	public void setIsAlignSon(boolean iIsAlignSon) {
		mIsAlignSon = iIsAlignSon;
	}
	
	public int getLevel() {
		return mLevel;
	}

	public void setLevel(int iLevel) {
		this.mLevel = iLevel;
	}

	public GenealogyModule getGenealogy() {
		return mGenealogy;
	}

	public void setGenealogy(GenealogyModule iGenealogy) {
		this.mGenealogy = iGenealogy;
	}

	public int getHardCodeLeftAcc() {
		return mHardCodeLeftAcc;
	}

	public void setHardCodeLeftAcc(int iHardCodeLeftAcc) {
		this.mHardCodeLeftAcc = iHardCodeLeftAcc;
	}

	public boolean getIsVisited() {
		return mIsVisited;
	}

	public void setIsVisited(boolean iIsVisited) {
		this.mIsVisited = iIsVisited;
	}

	public boolean getInverseVisitedParent() {
		return mInverseVisitedParent;
	}

	public void setInverseVisitedParent(boolean iInverseVisitedParent) {
		this.mInverseVisitedParent = iInverseVisitedParent;
	}

	public AGeneaNode<?> getFather() {
		return mFather;
	}

	public void setFather(AGeneaNode<?> iFather) {
		this.mFather = iFather;
		mFather.getSons().add(this);
	}

	public AGeneaNode<?> getMother() {
		return mMother;
	}

	public void setMother(AGeneaNode<?> iMother) {
		this.mMother = iMother;
		mMother.getSons().add(this);
	}
	
	public AGeneaNode<?> getAdoptedFather() {
		return mAdoptedFather;
	}

	public void setAdoptedFather(AGeneaNode<?> iAdoptedFather) {
		this.mAdoptedFather = iAdoptedFather;
	}

	public AGeneaNode<?> getAdoptedMother() {
		return mAdoptedMother;
	}

	public void setAdoptedMother(AGeneaNode<?> iAdoptedMother) {
		this.mAdoptedMother = iAdoptedMother;
	}
	
	public AGeneaNode<?> getSpouse() {
		return mSpouse;
	}
	
	public void setSpouse(AGeneaNode<?> iSpouse) {
		mSpouse = iSpouse;
	}
	
	public List<AGeneaNode<?>> getSons() {
		return mSons;
	}

	public boolean getIsBind() {
		return mIsBind;
	}
	
	public void draw() {
		display.setName(mComponentElement.getTitle());
		switch (mComponentElement.getColor()) {
		case blue:
			display.setBlueNode();
			break;
		case green:
			display.setGreenNode();
			break;
		case purple:
			display.setPurpleNode();
			break;
		case orange:
			display.setOrangeNode();
			break;
		case kaki:
			display.setKakiNode();
			break;
		case yellow:
			display.setYellowNode();
			break;
		case darkblue:
			display.setDarkBlueNode();
			break;
		case darkyellow:
			display.setDarkYellowNode();
			break;
		case mediumgreen:
			display.setMediumGreenNode();
			break;
		case mediumgreen2:
			display.setMediumGreen2Node();
			break;
		case mediumpurple:
			display.setMediumPurpleNode();
			break;
		case red:
			display.setRedNode();
			break;
		case mediumorange:
			display.setMediumOrangeNode();
			break;
		case flesh:
			display.setFleshNode();
			break;
		case pink:
			display.setPinkNode();
			break;
		}
		
		if (mFather != null) {
			mFather.draw();
		}
		if (mMother != null) {
			mMother.draw();
		}
	}
}
