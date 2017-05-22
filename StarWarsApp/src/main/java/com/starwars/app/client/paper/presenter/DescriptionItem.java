package com.starwars.app.client.paper.presenter;

import com.starwars.app.client.abs.presenter.Presenter;

public interface DescriptionItem extends Presenter<DescriptionItem.Display> {

	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void setTitle(String iTitle);
		void setIcon(String iIcon);
	    void setValue(String iValue);
	    void setUnit(String iUnit);
	    
	    void setTopRightWrapper(int iTop);
	    
	    void setBlue();
	    void setGreen();
	    void setPurple();
	    void setOrange();
	    void setDarkBlue();
	    void setDarkYellow();
	    void setYellow();
	    void setRed();
	    void setMediumPurple();
	    void setMediumGreen();
	    void setMediumGreen2();
	    void setMediumOrange();
	    void setKaki();
	    void setFlesh();
	    void setPink();
	}
	void init(String iTitle, String iIcon, String iValue, String iRef);
	String getValue();
	void draw(); 
}
