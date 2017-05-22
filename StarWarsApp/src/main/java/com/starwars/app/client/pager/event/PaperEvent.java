package com.starwars.app.client.pager.event;

import com.starwars.app.client.abs.presenter.AEvent;
import com.starwars.app.shared.SectionInfo;


public class PaperEvent extends AEvent<PaperHandler> {

	public static enum PaperType {
		resize
	}
	
	private static Type<PaperHandler> TYPE;
	private final PaperType mPaperType;
	private SectionInfo mSectionInfo;
	private int mTop;

	public static Type<PaperHandler> getType() {
		return TYPE != null ? TYPE : (TYPE = new Type<PaperHandler>());
	}

	public PaperEvent(PaperType iPaperType) {
		mPaperType = iPaperType;
		mTop = -1;
	}

	@Override
	public final Type<PaperHandler> getAssociatedType() {
		return getType();
	}

	@Override
	protected void dispatch(PaperHandler handler) {
		handler.onPaper(this);
	}

	public PaperType getPaperType() {
		return mPaperType;
	}

	public SectionInfo getSectionInfo() {
		return mSectionInfo;
	}

	public void setSectionInfo(SectionInfo iSectionInfo) {
		this.mSectionInfo = iSectionInfo;
	}

	public int getTop() {
		return mTop;
	}

	public void setTop(int iTop) {
		this.mTop = iTop;
	}

}
