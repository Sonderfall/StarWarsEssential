package com.starwars.app.client.encyclopedia.presenter.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.StarWarsApp;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.encyclopedia.presenter.DiapositiveItem;
import com.starwars.app.client.encyclopedia.presenter.DocItem;
import com.starwars.app.client.encyclopedia.presenter.HyperLink;


public class DocItemImpl extends BasePresenter<DocItem.Display> implements
DocItem {

	private String mTitle;
	private int mSubTitleIndex;
	private final Map<Integer, DiapositiveItem> mAssociatedImages;
	private final List<HyperLink> mHyperTexts;

	@Inject
	public DocItemImpl(final EventBus eventBus,
			final DocItem.Display display) {
		super(eventBus, display);
		mAssociatedImages = new HashMap<Integer, DiapositiveItem>();
		mHyperTexts = new ArrayList<HyperLink>();
		mSubTitleIndex = 0;
	}

	@Override
	public void bind() {
		super.bind();
		for (HyperLink lHyperText : mHyperTexts) {
			lHyperText.bind();
		}
	}

	@Override
	public void unbind() {
		super.unbind();
		for (HyperLink lHyperText : mHyperTexts) {
			lHyperText.unbind();
		}
	}

	public void draw() {
		display.setTitle(mTitle);
		for (Entry<Integer, DiapositiveItem> lEntry : mAssociatedImages.entrySet()) {
			lEntry.getValue().draw();
		}
	}

	@Override
	public void setTitle(String iTitle, boolean iAddImage) {
		mTitle = iTitle;
		if (iAddImage) {
			DiapositiveItem lDiapositive = mAssociatedImages.get(mSubTitleIndex);
			if (lDiapositive != null) {
				display.addAssociatedImage(mSubTitleIndex, lDiapositive.getDisplay().asWidget());
			}
		}
	}

	public void addSubTitle(String iContent) {
		display.addSubTitle(iContent);
		DiapositiveItem lDiapositive = mAssociatedImages.get(mSubTitleIndex);
		if (lDiapositive != null) {
			display.addAssociatedImage(mSubTitleIndex, lDiapositive.getDisplay().asWidget());
		}
		mSubTitleIndex++;
	}

	public void addText(String iContent) {
		String lPattern = "^[A-Za-z0-9,.;]*$";
		if (iContent.length() < 6 && !iContent.contains(",") && !iContent.contains(")") && !iContent.contains(".") && !! iContent.contains(";")) {
			int lIndex = 0;
			String lDetectString = iContent.substring(lIndex, lIndex + 1);
			while (!lDetectString.matches(lPattern) && lIndex < iContent.length()) {
				++lIndex;
				lDetectString = iContent.substring(lIndex, lIndex + 1);
			}
			if (lIndex == iContent.length() - 1)
				return;
			iContent = iContent.substring(lIndex, iContent.length());
		}
		
		String lDetectBug = iContent.substring(0, 3);
		if (lDetectBug.contains("\n") || lDetectBug.contains("\r")) {
			iContent = iContent.replaceFirst("\n", "");
			iContent = iContent.replaceFirst("\r", "");
			
			lDetectBug = iContent.substring(0, 3);
			if (lDetectBug.contains("\n") || lDetectBug.contains("\r")) {
				iContent = iContent.replaceFirst("\n", "");
				iContent = iContent.replaceFirst("\r", "");
			}
		}
		display.addText(iContent);
	}

	public void addHyperText(String iText) {
		HyperLink lHyperText = StarWarsApp.ginjector.getHyperLink();
		mHyperTexts.add(lHyperText);
		lHyperText.setLink(iText);
		display.addHyperText(lHyperText.getDisplay().asWidget());
	}

	@Override
	public void addAssociatedImage(DiapositiveItem iDiapositiveItem) {
		addAssociatedImage(mSubTitleIndex, iDiapositiveItem);
	}
	
	@Override
	public void addAssociatedImage(int iTextIndex, DiapositiveItem iDiapositiveItem) {
		mAssociatedImages.put(iTextIndex, iDiapositiveItem);
	}

	public String getTitle() {
		return mTitle;
	}
}
