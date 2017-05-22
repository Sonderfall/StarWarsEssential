package com.starwars.app.client.pager.presenter;

import com.starwars.app.shared.ElementInfo;



public interface ElementItem extends AItem<ElementInfo, ElementItem.Display> {

	public static enum ExerciseItemType {
		normal,
		exam;
	}
	
	interface Display extends com.starwars.app.client.pager.presenter.AItem.Display {
		void setTag(String iTag);
		void setExamMode();
		void setNormalMode();
		void setTextContainer(String iText);
	}
}
