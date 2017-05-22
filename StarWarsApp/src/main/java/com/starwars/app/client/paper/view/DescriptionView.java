package com.starwars.app.client.paper.view;

import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.paper.presenter.Description;
import com.starwars.app.client.tools.DivPanel;

public class DescriptionView extends ADivView implements Description.Display {

	private final DivPanel mBackground;
	private final DivPanel mMainWrapper;
	private final DivPanel mImageWrapper;
	private final Image mImage;
	private final DivPanel mTitle;
	private final DivPanel mItemWrapper;
	private final DivPanel mText;
	private final DivPanel mHyperLink; 
	
	public DescriptionView() {
		mBackground = new DivPanel();
		mRoot.add(mBackground);
		initBackground();
		
		mMainWrapper = new DivPanel();
		mRoot.add(mMainWrapper);
		initMainWrapper();

		mImageWrapper = new DivPanel();
		mMainWrapper.add(mImageWrapper);
		initImageWrapper();
		
		mImage = new Image();
		mImageWrapper.add(mImage);
		
		mTitle = new DivPanel();
		mMainWrapper.add(mTitle);
		initTitle();
		
		mItemWrapper = new DivPanel();
		mMainWrapper.add(mItemWrapper);
		initItemWrapper();
		
		mText = new DivPanel();
		mMainWrapper.add(mText);
		initText();

		mHyperLink = new DivPanel();
		mMainWrapper.add(mHyperLink);
		
		zoom();
	}

	public HasClickHandlers getHasClickHandlers() {
		return mBackground;
	}
	
	public void hide() {
		mBackground.removeStyleName(STYLE.fadein1());
		mMainWrapper.removeStyleName(STYLE.fadein1());
		
		mMainWrapper.getElement().getStyle().setDisplay(Display.NONE);
		mBackground.getElement().getStyle().setDisplay(Display.NONE);
	}
	
	public void show() {
		mBackground.addStyleName(STYLE.fadein1());
		mMainWrapper.addStyleName(STYLE.fadein1());
		
		mMainWrapper.getElement().getStyle().clearDisplay();
		mBackground.getElement().getStyle().clearDisplay();
	}
	
    public void addLine() {
        DivPanel lLine = new DivPanel();
        mItemWrapper.add(lLine);
        lLine.addStyleName(STYLE.detailStatisticsLine());
        lLine.addStyleName(STYLE.clear());
    }

    public void addItem(Widget iWidget) {
    	mItemWrapper.add(iWidget);
    }
    
	@Override
	public void setText(String iText) {
		mText.setText(iText);
	}

	@Override
	public void setTitle(String iTitle) {
		mTitle.setText(iTitle);
	}
	
	@Override
	public void setImage(ImageResource iImage) {
		mImage.setResource(iImage);
		float lWidth = 130;
		float lHeight = resizeImageFromWidth(iImage, lWidth);
		mImage.getElement().getStyle().setWidth(lWidth, Unit.PX);
		mImage.getElement().getStyle().setHeight(lHeight, Unit.PX);
		mImage.addStyleName(STYLE.logoDescription());
		mImage.getElement().getStyle().setProperty("backgroundSize", "contain");
		mImage.getElement().getStyle().setProperty("backgroundColor", "black");
	}
	
	public void setHyperLink(Widget iWidget) {
		mHyperLink.add(iWidget);
	}
	
	@Override
	public void setGreen() {
		mMainWrapper.addStyleName(STYLE.greenBorder());
		mImage.addStyleName(STYLE.greenBorder());
	}
	
	@Override
	public void setOrange() {
		mMainWrapper.addStyleName(STYLE.orangeBorder());
		mImage.addStyleName(STYLE.orangeBorder());
	}
	
	@Override
	public void setPurple() {
		mMainWrapper.addStyleName(STYLE.purpleBorder());
		mImage.addStyleName(STYLE.purpleBorder());
	}
	
	@Override
	public void setBlue() {
		mMainWrapper.addStyleName(STYLE.blueBorder());
		mImage.addStyleName(STYLE.blueBorder());
	}
	
	@Override
	public void setDarkBlue() {
		mMainWrapper.addStyleName(STYLE.darkblueBorder());
		mImage.addStyleName(STYLE.darkblueBorder());		
	}

	@Override
	public void setDarkYellow() {
		mMainWrapper.addStyleName(STYLE.darkyellowBorder());
		mImage.addStyleName(STYLE.darkyellowBorder());		
	}

	@Override
	public void setYellow() {
		mMainWrapper.addStyleName(STYLE.yellowBorder());
		mImage.addStyleName(STYLE.yellowBorder());		
	}

	@Override
	public void setRed() {
		mMainWrapper.addStyleName(STYLE.redBorder());
		mImage.addStyleName(STYLE.redBorder());
	}

	@Override
	public void setMediumPurple() {
		mMainWrapper.addStyleName(STYLE.mediumpurpleBorder());
		mImage.addStyleName(STYLE.mediumpurpleBorder());		
	}

	@Override
	public void setMediumGreen() {
		mMainWrapper.addStyleName(STYLE.mediumgreenBorder());
		mImage.addStyleName(STYLE.mediumgreenBorder());		
	}

	@Override
	public void setMediumGreen2() {
		mMainWrapper.addStyleName(STYLE.mediumgreen2Border());
		mImage.addStyleName(STYLE.mediumgreen2Border());		
	}

	@Override
	public void setMediumOrange() {
		mMainWrapper.addStyleName(STYLE.mediumorangeBorder());
		mImage.addStyleName(STYLE.mediumorangeBorder());		
	}

	@Override
	public void setKaki() {
		mMainWrapper.addStyleName(STYLE.kakiBorder());
		mImage.addStyleName(STYLE.kakiBorder());		
	}

	@Override
	public void setFlesh() {
		mMainWrapper.addStyleName(STYLE.fleshBorder());
		mImage.addStyleName(STYLE.fleshBorder());
	}

	@Override
	public void setPink() {
		mMainWrapper.addStyleName(STYLE.pinkBorder());
		mImage.addStyleName(STYLE.pinkBorder());		
	}
	
	private void initBackground() {
		mBackground.addStyleName(STYLE.descriptionMask());
	}
	
	private void initMainWrapper() {
		mMainWrapper.addStyleName(STYLE.descriptionWrapper());
		mMainWrapper.addStyleName(STYLE.descriptionBackground());
	}

	private void initImageWrapper() {
		mImageWrapper.addStyleName(STYLE.logoDescriptionWrapper());
	}
	
	private void initTitle() {
		mTitle.addStyleName(STYLE.descriptionTitle());
	}
	
	private void initItemWrapper() {
		mItemWrapper.addStyleName(STYLE.detailStatistics());
	}
	
	private void initText() {
		mText.addStyleName(STYLE.descriptionDetail());
	}
	
	public void clearAll() {
		mHyperLink.clear();
		mItemWrapper.clear();
		mMainWrapper.removeStyleName(STYLE.blueBorder());
		mImage.removeStyleName(STYLE.blueBorder());
		mMainWrapper.removeStyleName(STYLE.purpleBorder());
		mImage.removeStyleName(STYLE.purpleBorder());
		mMainWrapper.removeStyleName(STYLE.orangeBorder());
		mImage.removeStyleName(STYLE.orangeBorder());
		mMainWrapper.removeStyleName(STYLE.greenBorder());
		mImage.removeStyleName(STYLE.greenBorder());
		mMainWrapper.removeStyleName(STYLE.pinkBorder());
		mImage.removeStyleName(STYLE.pinkBorder());
		mMainWrapper.removeStyleName(STYLE.fleshBorder());
		mImage.removeStyleName(STYLE.fleshBorder());
		mMainWrapper.removeStyleName(STYLE.kakiBorder());
		mImage.removeStyleName(STYLE.kakiBorder());
		mMainWrapper.removeStyleName(STYLE.darkblueBorder());
		mImage.removeStyleName(STYLE.darkblueBorder());		
		mMainWrapper.removeStyleName(STYLE.darkyellowBorder());
		mImage.removeStyleName(STYLE.darkyellowBorder());		
		mMainWrapper.removeStyleName(STYLE.yellowBorder());
		mImage.removeStyleName(STYLE.yellowBorder());		
		mMainWrapper.removeStyleName(STYLE.redBorder());
		mImage.removeStyleName(STYLE.redBorder());
		mMainWrapper.removeStyleName(STYLE.mediumpurpleBorder());
		mImage.removeStyleName(STYLE.mediumpurpleBorder());		
		mMainWrapper.removeStyleName(STYLE.mediumgreenBorder());
		mImage.removeStyleName(STYLE.mediumgreenBorder());		
		mMainWrapper.removeStyleName(STYLE.mediumgreen2Border());
		mImage.removeStyleName(STYLE.mediumgreen2Border());		
		mMainWrapper.removeStyleName(STYLE.mediumorangeBorder());
		mImage.removeStyleName(STYLE.mediumorangeBorder());
	}
	
	@Override
	public void zoom() {
		if (Window.getClientWidth() >= 800 && Window.getClientWidth() < 1200) {
			mMainWrapper.addStyleName(STYLE.zoom70());
		} else if (Window.getClientWidth() >= 1200 && Window.getClientWidth() < 1800) {
			mMainWrapper.addStyleName(STYLE.zoom89());
		}
	}
}
