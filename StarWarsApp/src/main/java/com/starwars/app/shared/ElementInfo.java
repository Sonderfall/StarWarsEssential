package com.starwars.app.shared;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.starwars.app.client.paper.presenter.AModule;
import com.starwars.app.client.paper.presenter.DescriptionItem;

public class ElementInfo extends Info implements Serializable {

	public enum ElementColor {
		blue,
		green,
		orange,
		purple,
		darkyellow,
		yellow,
		kaki,
		darkblue,
		mediumgreen,
		mediumgreen2,
		mediumpurple,
		mediumorange,
		red,
		pink,
		flesh
	}
	
    private static final long serialVersionUID = 1L;
    
    private AModule<?> mAComponent;
    
    private List<DescriptionItem> mItems;
    private ElementColor mColor;
    private int mBeginDate;
	private int mEndDate;
	private String mSumup;
    
    public ElementInfo() {
    	super();
    	mIcon = "";
    	mSumup = "";
    	mColor = ElementColor.blue;
    	mItems = new ArrayList<DescriptionItem>();
    }

    public AModule<?> getAModule() {
		return mAComponent;
	}

	public void setAComponent(AModule<?> iAComponent) {
		this.mAComponent = iAComponent;
	}
	
	public void setBeginDate(int iDate) {
		mBeginDate = iDate;
	}
	
	public int getBeginDate() {
		return mBeginDate;
	}

	public void setEndDate(int iDate) {
		mEndDate = iDate;
	}
	
	public int getEndDate() {
		return mEndDate;
	}
	
	public void setColor(ElementColor iColor) {
		mColor = iColor;
	}
	
	public ElementColor getColor() {
		return mColor;
	}
	
	public void setSumup(String iSumup) {
		mSumup = iSumup;
	}
	
	public String getSumup() {
		return mSumup;
	}
	
	public List<DescriptionItem> getItems() {
		return mItems;
	}
}