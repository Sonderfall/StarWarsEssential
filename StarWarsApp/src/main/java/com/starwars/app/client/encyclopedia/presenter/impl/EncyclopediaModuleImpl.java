package com.starwars.app.client.encyclopedia.presenter.impl;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.TextResource;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.StarWarsApp;
import com.starwars.app.client.encyclopedia.event.HyperLinkTextEvent;
import com.starwars.app.client.encyclopedia.event.HyperLinkTextHandler;
import com.starwars.app.client.encyclopedia.presenter.DiapositiveItem;
import com.starwars.app.client.encyclopedia.presenter.DocItem;
import com.starwars.app.client.encyclopedia.presenter.EncyclopediaModule;
import com.starwars.app.client.encyclopedia.presenter.HyperLinkText;
import com.starwars.app.client.mct.ASyncCall;
import com.starwars.app.client.paper.presenter.impl.AModuleImpl;
import com.starwars.app.client.resources.StarWarsMethodResources;

public class EncyclopediaModuleImpl extends AModuleImpl<EncyclopediaModule.Display> implements
EncyclopediaModule {

	private final List<DocItem> mDocItems;
	private final HyperLinkText mHyperTextDescription; 
	private DiapositiveItem[] mDiapositiveItems;
	private String mText;
	
	private final List<String> mImageMethods;
	private String mTextMethod;

	@Inject
	public EncyclopediaModuleImpl(final EventBus eventBus,
			final EncyclopediaModule.Display display,
			Provider<HyperLinkText> iProvider) {
		super(eventBus, display);
		mDocItems = new ArrayList<DocItem>();
		mHyperTextDescription = iProvider.get();
		mImageMethods = new ArrayList<String>();
		mText = null;
	}

	@Override
	public void bind() {
		super.bind();
		mHyperTextDescription.bind();
		for (DocItem lDocItem : mDocItems) {
			lDocItem.bind();
		}

		registerHandler(eventBus.addHandler(HyperLinkTextEvent.getType(), new HyperLinkTextHandler() {

			@Override
			public void onHyperTextDescription(HyperLinkTextEvent event) {
				if (event.getElementInfo() != null) {
					mHyperTextDescription.draw(event.getElementInfo());
					event.getDisplay().clear();
					event.getDisplay().add(mHyperTextDescription.getDisplay().asWidget());
				} else {
					event.getDisplay().remove(mHyperTextDescription.getDisplay().asWidget());
				}
			}
		}));
	}

	@Override
	public void unbind() {
		super.unbind();
		mHyperTextDescription.unbind();
		for (DocItem lDocItem : mDocItems) {
			lDocItem.unbind();
		}
	}

	@Override
	public void process() {
		int lImageIndex = splitText(mText);
		for (int i = 0; i < mDocItems.size(); ++i) {
			DocItem lDocItem = mDocItems.get(i);
			if (mDocItems.size() != 1) {
				lDocItem.setTitle(getRomanNumber(i + 1) + ". " + lDocItem.getTitle(), false);
			}
			display.add(lDocItem.getDisplay().asWidget());
			lDocItem.draw();
			lDocItem.bind();
		}

		if (lImageIndex == 1 && mDiapositiveItems.length >= 2) {
			mDocItems.get(0).getDisplay().addAssociatedImage(0, mDiapositiveItems[1].getDisplay().asWidget());
			mDiapositiveItems[1].draw();
		}
		
		display.setSources();
	}

	@Override
	public void reset() {
		mHyperTextDescription.getDisplay().hide();
	}

	@Override
	public void loadDatas() {
		if (mText == null) {
			ASyncCall<TextResource> lASyncCallText = new ASyncCall<TextResource>() {
	    		
				@Override
				public void onSuccess(TextResource iObj) {
					mText = iObj.getText();
					process();
				}
	    	};
	    	StarWarsMethodResources.callMethodText(lASyncCallText, mTextMethod);
			
		    for (int i = 0; i < mImageMethods.size(); ++i) {
		    	final String lImageMethodName = mImageMethods.get(i);
		    	final DiapositiveItem lNewItem = StarWarsApp.ginjector.getDiapositiveItem();
		    	ASyncCall<ImageResource> lASyncCallImage = new ASyncCall<ImageResource>() {
		    		
					@Override
					public void onSuccess(ImageResource iObj) {
						lNewItem.init(iObj);
						lNewItem.draw();
					}
		    	};
		    	mDiapositiveItems[i] = lNewItem;
		    	StarWarsMethodResources.callMethodImage(lASyncCallImage, lImageMethodName);
		    }
		}
	}
	
	public void init(String iTextMethod, String... iImageMethods) {
		for (String lImage : iImageMethods) {
			mImageMethods.add(lImage);
		}
		mTextMethod = iTextMethod;
		mDiapositiveItems = new DiapositiveItem[iImageMethods.length];
	}

	private int splitText(String iContent) {
		boolean lInTitle = false;
		boolean lInSubTitle = false;
		boolean lInHyperText = false;
		String lCurrentContent = "";
		int lImageIndex = 1;
		for (int i = 0; i <= iContent.length(); ++i) {
			/* Attach image to text */
			if (iContent.charAt(i) == '%' && (lInTitle || lInSubTitle)) {
				mDocItems.get(mDocItems.size() - 1).addAssociatedImage(mDiapositiveItems[lImageIndex++]);

			/* New big part, begin title */
			} else if (iContent.charAt(i) == '#' && !lInTitle) {
				if (!mDocItems.isEmpty()) {
					mDocItems.get(mDocItems.size() - 1).addText(lCurrentContent.substring(1, lCurrentContent.length() - 2));
				}
				DocItem lNewDocItem = StarWarsApp.ginjector.getDocItem();
				mDocItems.add(lNewDocItem);
				lCurrentContent = "";
				lInTitle = true;
			
			/* End title */
			} else if (iContent.charAt(i) == '#' && lInTitle) {
				mDocItems.get(mDocItems.size() - 1).setTitle(lCurrentContent.replace("@", ""), true);
				lCurrentContent = "";
				lInTitle = false;
				
			/* New sub part, begin title */
			} else if (iContent.charAt(i) == '$' && !lInSubTitle) {
				mDocItems.get(mDocItems.size() - 1).addText(lCurrentContent);
				lCurrentContent = "";
				lInSubTitle = true;
			
			/* End subtitle */
			} else if (iContent.charAt(i) == '$' && lInSubTitle) {
				mDocItems.get(mDocItems.size() - 1).addSubTitle(lCurrentContent.replace("@", ""));
				lCurrentContent = "";
				lInSubTitle = false;
			
			/* New hypertext */
			} else if (iContent.charAt(i) == '@' && !lInHyperText && !lInTitle && !lInSubTitle) {
				mDocItems.get(mDocItems.size() - 1).addText(lCurrentContent);
				lCurrentContent = "";
				lInHyperText = true;
				
			/* End hypertext */				
			} else if (iContent.charAt(i) == '@' && lInHyperText && !lInTitle && !lInSubTitle) {
				mDocItems.get(mDocItems.size() - 1).addHyperText(lCurrentContent);
				lCurrentContent = "";
				lInHyperText = false;
				
			/* End of the text */
			} else if (i == iContent.length()) {
				mDocItems.get(mDocItems.size() - 1).addText(lCurrentContent.substring(1));
				lCurrentContent = "";
				lInTitle = false;
				
			/* Add basic content */
			} else {
				lCurrentContent += iContent.charAt(i);
			}
		}
		return lImageIndex;
	}
	
	private String getRomanNumber(int iNumber) {
		switch (iNumber) {
			case 1:
				return "I";
			case 2:
				return "II";
			case 3:
				return "III";
			case 4:
				return "IV";
			case 5:
				return "V";
			case 6:
				return "VI";
			case 7:
				return "VII";
			case 8:
				return "VIII";
			case 9:
				return "IX";
			case 10:
				return "X";
			case 11:
				return "XI";
			case 12:
				return "XII";
			case 13:
				return "XIII";
			case 14:
				return "XIV";
			case 15:
				return "XV";
		}
		return "";
	}
}
