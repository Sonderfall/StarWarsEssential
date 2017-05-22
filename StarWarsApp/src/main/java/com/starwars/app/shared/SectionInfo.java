package com.starwars.app.shared;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SectionInfo extends Info implements Serializable {

    private static final long serialVersionUID = 1L;
    private boolean mFinal;
    private boolean mResearch;
    private final List<SectionInfo> mSectionInfos;
    private final List<ElementInfo> mElementInfos;

    public SectionInfo() {
    	super();
    	mSectionInfos = new ArrayList<SectionInfo>();
    	mElementInfos = new ArrayList<ElementInfo>();
    	mResearch = false;
    }

	public List<SectionInfo> getSectionInfos() {
		return mSectionInfos;
	}

	public List<ElementInfo> getElementInfos() {
		return mElementInfos;
	}

	public boolean isResearch() {
		return mResearch;
	}
	
	public void setResearch(boolean iResearch) {
		mResearch = iResearch;
	}
	
	public boolean isFinal() {
		return mFinal;
	}
	
	public void setFinal(boolean iFinal) {
		mFinal = iFinal;
	}
}
