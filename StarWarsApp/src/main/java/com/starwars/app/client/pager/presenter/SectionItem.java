package com.starwars.app.client.pager.presenter;

import com.starwars.app.shared.SectionInfo;


public interface SectionItem extends AItem<SectionInfo, SectionItem.Display> {

	public static enum SectionItemType {
		big,
		normal;
	}
	
	interface Display extends AItem.Display {
		void setTextTitle(String iTitle);
		void setIcon(String iIcon);
		void setModeBig();
		void setModeNormal();
	}

	void setMode(SectionItemType iSectionItemType);
}
