package com.starwars.app.client.paper.view;

import com.google.gwt.dom.client.Style.Unit;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.paper.presenter.DescriptionItem;
import com.starwars.app.client.tools.DivPanel;

public class DescriptionItemView extends ADivView implements DescriptionItem.Display {

	protected final DivPanel mLeftWrapper;
	protected final DivPanel mIcon;
	protected final DivPanel mTitle;
	protected final DivPanel mRightWrapper;
	protected final DivPanel mValue;
	protected final DivPanel mUnit;
	
	public DescriptionItemView() {
    	initRoot();
        
    	mLeftWrapper = new DivPanel();
    	mRoot.add(mLeftWrapper);
    	initLeftWrapper();
            
    	mIcon = new DivPanel();
    	mLeftWrapper.add(mIcon);
    	initIcon();
            
    	mTitle = new DivPanel();
    	mLeftWrapper.add(mTitle);
    	initTitle();
            
    	mRightWrapper = new DivPanel();
    	mRoot.add(mRightWrapper);
    	initRightWrapper();
            
    	mValue = new DivPanel();
    	mRightWrapper.add(mValue);
    	initValue();
            
    	mUnit = new DivPanel();
    	mRightWrapper.add(mUnit);
    	initUnit();
	}
	
    @Override
    public void setTitle(String iTitle) {
    	mTitle.setText(iTitle);
    }
    
    @Override
    public void setIcon(String iIcon) {
    	mIcon.getElement().setAttribute("data-icon", iIcon);
    }

    @Override
    public void setValue(String iValue) {
    	mValue.setText(iValue);
    }

    @Override
    public void setUnit(String iUnit) {
    	mUnit.setText(" " + iUnit);
    }
    
    public void setBlue() {
    	clearAll();
    	mValue.addStyleName(STYLE.blueFont());
    }
    
    public void setGreen() {
    	clearAll();
    	mValue.addStyleName(STYLE.greenFont());
    }
    
    public void setPurple() {
    	clearAll();
    	mValue.addStyleName(STYLE.purpleFont());
    }

    public void setOrange() {
    	clearAll();
    	mValue.addStyleName(STYLE.orangeFont());
    }

	@Override
	public void setDarkBlue() {
		clearAll();
    	mValue.addStyleName(STYLE.darkblueFont());
	}

	@Override
	public void setDarkYellow() {
		clearAll();
    	mValue.addStyleName(STYLE.darkyellowFont());
	}

	@Override
	public void setYellow() {
		clearAll();
    	mValue.addStyleName(STYLE.yellowFont());
	}

	@Override
	public void setRed() {
		clearAll();
    	mValue.addStyleName(STYLE.redFont());
	}

	@Override
	public void setMediumPurple() {
		clearAll();
    	mValue.addStyleName(STYLE.mediumpurpleFont());
	}

	@Override
	public void setMediumGreen() {
		clearAll();
    	mValue.addStyleName(STYLE.mediumgreenFont());
	}

	@Override
	public void setMediumGreen2() {
		clearAll();
    	mValue.addStyleName(STYLE.mediumgreen2Font());
	}

	@Override
	public void setMediumOrange() {
		clearAll();
    	mValue.addStyleName(STYLE.mediumorangeFont());	
	}

	@Override
	public void setKaki() {
		clearAll();
    	mValue.addStyleName(STYLE.kakiFont());
	}

	@Override
	public void setFlesh() {
		clearAll();
    	mValue.addStyleName(STYLE.fleshFont());
	}

	@Override
	public void setPink() {
		clearAll();
    	mValue.addStyleName(STYLE.pinkFont());
	}
    
	public void setTopRightWrapper(int iTop) {
		mRightWrapper.getElement().getStyle().setTop(iTop, Unit.PX);
	}
	
    private void initRoot() {
    	mRoot.addStyleName(STYLE.detailStatWrapper());
    }
    
    private void initLeftWrapper() {
    	mLeftWrapper.addStyleName(STYLE.detailStatContainer());
    }

    private void initIcon() {
    	mIcon.addStyleName(STYLE.detailStatIcon());
        mIcon.getElement().setAttribute("aria-hidden", "true");
    }

    private void initTitle() {
    	mTitle.addStyleName(STYLE.detailStatContent());
    }

    private void initRightWrapper() {
    	mRightWrapper.addStyleName(STYLE.detailStatKey());
    }

    private void initValue() {
    	mValue.addStyleName(STYLE.detailStatValue());
    }

    private void initUnit() {
    	mUnit.addStyleName(STYLE.detailStatReference());
    }
    
    private void clearAll() {
    	mValue.removeStyleName(STYLE.orangeFont());
    	mValue.removeStyleName(STYLE.greenFont());
    	mValue.removeStyleName(STYLE.blueFont());
    	mValue.removeStyleName(STYLE.purpleFont());
      	mValue.removeStyleName(STYLE.darkblueFont());
       	mValue.removeStyleName(STYLE.darkyellowFont());
       	mValue.removeStyleName(STYLE.yellowFont());
       	mValue.removeStyleName(STYLE.redFont());
       	mValue.removeStyleName(STYLE.mediumpurpleFont());
       	mValue.removeStyleName(STYLE.mediumgreenFont());
       	mValue.removeStyleName(STYLE.mediumgreen2Font());
       	mValue.removeStyleName(STYLE.mediumorangeFont());	
       	mValue.removeStyleName(STYLE.kakiFont());
       	mValue.removeStyleName(STYLE.fleshFont());
       	mValue.removeStyleName(STYLE.pinkFont());
    }
}
