package com.starwars.app.shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gwt.resources.client.ImageResource;
import com.starwars.app.client.StarWarsApp;
import com.starwars.app.client.encyclopedia.presenter.HyperLinkImage;
import com.starwars.app.client.mct.ASyncCall;
import com.starwars.app.client.pager.presenter.SectionImage;
import com.starwars.app.client.paper.presenter.MainImage;
import com.starwars.app.client.resources.StarWarsImageResources;
import com.starwars.app.client.resources.StarWarsMethodResources;

public class Info implements Serializable {
	
    private static final long serialVersionUID = 1L;
    
    protected String mIcon;
    protected String mTitle;
    protected String mTag;
    protected String mDescription;
    protected final List<String> mKeyWords;
    
    private ImageResource mImageResource;
    private String mImageName;
    private MainImage mMainImage;
    private HyperLinkImage mHyperTextImage;
    private SectionImage mSectionImage;
    
    public Info() {
    	mImageResource = null;
    	mKeyWords = new ArrayList<String>();
    	mMainImage = StarWarsApp.ginjector.getMainImage();
    	mHyperTextImage = StarWarsApp.ginjector.getHyperTextImage();
    	mSectionImage = StarWarsApp.ginjector.getSectionImage();
    }

	public String getTitle() {
		return mTitle;
	}

	public void setTitle(String iTitle) {
		this.mTitle = iTitle;
		this.mTag = mTitle;
		resetTag();
	}

	public void resetTag() {
		this.mTag = mTitle
				.replaceAll(" ", "")
				.replace("'", "")
				.replace("É", "E")
				.replace("é", "e")
				.replace("è", "e")
				.replace("ê", "e")
				.replace("ë", "e")
				.replace("à", "a")
				.replace("â", "a")
				.replace("ä", "a")
				.replace("ç", "c")
				.replace("î", "i")
				.replace("ï", "i")
				.replace("ü", "u")
				.replace("û", "u")
				.replace("ö", "o")
				.replace("ô", "o");
	}
	
	public String getTag() {
		return mTag;
	}

	public void setTag(String iTag) {
		this.mTag = iTag;
	}
	
	public String getDescription() {
		return mDescription;
	}

	public void setDescription(String iDescription) {
		this.mDescription = iDescription;
	}

	public String getIcon() {
		return mIcon;
	}

	public void setIcon(String iIcon) {
		this.mIcon = iIcon;
	}
	
	public List<String> getKeyWords() {
		return mKeyWords;
	}
	
	public void setImageName(String iImageName) {
    	mImageName = iImageName;
    }
    
    public void setImageResource(ImageResource iImageResource) {
    	mImageResource = iImageResource;
    }
    
    public ImageResource getImageResource() {
    	return mImageResource;
    }
	
    public MainImage getMainImage() {
    	return mMainImage;
    }
    
    public HyperLinkImage getHyperTextImage() {
    	return mHyperTextImage;
    }
    
    public SectionImage getSectionImage() {
    	return mSectionImage;
    }
    
	public static int getDistance(Info iFirstInfo, Info iSecondInfo) {
		int lDistance = 0;
		if (iFirstInfo != null && iSecondInfo != null) {
			String lFirstTag = iFirstInfo.getTag().replace("/Legends", "").replace("/Classic", "");
			String lSecondTag = iSecondInfo.getTag().replace("/Legends", "").replace("/Classic", "");
			int lFirstTagDepth = lFirstTag.split("/", -1).length; 
			int lSecondTagDepth = lSecondTag.split("/", -1).length; 
			String[] lFirstTagTab = lFirstTag.split("/");
			String[] lSecondTagTab = lSecondTag.split("/");
			
			for (int i = 0; i < Math.min(lFirstTagDepth, lSecondTagDepth); ++i) {
				String lFirstSubTag = lFirstTagTab[i];
				String lSecondSubTag = lSecondTagTab[i];
				if (!lFirstSubTag.equals(lSecondSubTag)) {
					lDistance++;
				}
			}
			lDistance += Math.abs(lFirstTagDepth - lSecondTagDepth);
		} else if (iFirstInfo != null) {
			String lFirstTag = iFirstInfo.getTag();
			int lFirstTagDepth = lFirstTag.replace("/Legends", "").replace("/Classic", "").split("/", -1).length - 1;
			return lFirstTagDepth;
		} else if (iSecondInfo != null) {
			String lSecondTag = iSecondInfo.getTag();
			int lSecondTagDepth = lSecondTag.replace("/Legends", "").replace("/Classic", "").split("/", -1).length - 1;
			return lSecondTagDepth;
		} else {
			return 0;
		}
		return lDistance;
	}
	
    public void loadDatas() {
    	if (mImageResource == null) {
	    	mImageResource = StarWarsImageResources.INSTANCE.logounknown();
	    	mMainImage.init(mImageResource);
	    	mHyperTextImage.init(mImageResource);
	    	mSectionImage.init(StarWarsImageResources.INSTANCE.empty());
	    	ASyncCall<ImageResource> lASyncCall = new ASyncCall<ImageResource>() {
				
				@Override
				public void onSuccess(ImageResource iObj) {
					mImageResource = iObj;
					mMainImage.init(mImageResource);
					mHyperTextImage.init(mImageResource);
					mSectionImage.init(mImageResource);
				}
	    	};
	    	StarWarsMethodResources.callMethodImage(lASyncCall, mImageName);
    	}
    }
}