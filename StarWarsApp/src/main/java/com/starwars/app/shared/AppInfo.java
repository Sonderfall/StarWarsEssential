package com.starwars.app.shared;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AppInfo extends Info implements Serializable {

    private static final long serialVersionUID = 1L;
    private final List<SectionInfo> mSectionInfos;
    
    public AppInfo() {
    	mSectionInfos = new ArrayList<SectionInfo>();
    }

	public List<SectionInfo> getSectionInfos() {
		return mSectionInfos;
	}
}
