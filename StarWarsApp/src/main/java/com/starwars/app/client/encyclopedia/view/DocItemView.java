package com.starwars.app.client.encyclopedia.view;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.encyclopedia.presenter.DocItem;
import com.starwars.app.client.tools.DivPanel;
import com.starwars.app.client.tools.SpanPanel;

public class DocItemView extends ADivView implements DocItem.Display {

	private final DivPanel mTitleWrapper;
	private final DivPanel mTitleText;
	private final DivPanel mTitleImage;
	private final DivPanel mLine;
	private final List<DivPanel> mSubTitles;
	
	public DocItemView() {
		mRoot.addStyleName(STYLE.fadein05());
		
		mSubTitles = new ArrayList<DivPanel>();
		
		mTitleWrapper = new DivPanel();
		mRoot.add(mTitleWrapper);
		
		mTitleText = new DivPanel();
		mRoot.add(mTitleText);
		initTitle();
		
		mTitleImage = new DivPanel();
		mRoot.add(mTitleImage);
		
		mLine = new DivPanel();
		mRoot.add(mLine);
		initLine();
	}

	@Override
	public void setTitle(String iTitle) {
		mTitleText.setText(iTitle);
	}

	@Override
	public void addSubTitle(String iSubTitle) {
		DivPanel lSubTitle = new DivPanel();
		mRoot.add(lSubTitle);
		initSubTitle(lSubTitle);
		lSubTitle.setText(iSubTitle);
		mSubTitles.add(lSubTitle);
	}

	@Override
	public void addText(String iText) {
		SpanPanel lText = new SpanPanel();
		mRoot.add(lText);
		initText(lText);
		lText.setText(iText);
	}

	@Override
	public void addHyperText(Widget iWidget) {
		mRoot.add(iWidget);
	}
	
	@Override
	public void addAssociatedImage(int iIndex, Widget iWidget) {
		if (mSubTitles.size() > 0) {
			mSubTitles.get(iIndex).add(iWidget);
		} else {
			mTitleImage.add(iWidget);
			iWidget.getElement().getStyle().clearTop();
		}
	}

	private void initTitle() {
		mTitleText.addStyleName(STYLE.f20());
		mTitleText.addStyleName(STYLE.droidsansBold());
		mTitleText.getElement().getStyle().setColor("rgba(0, 156, 209, 1)");
		mTitleText.getElement().getStyle().setPosition(Position.RELATIVE);
		mTitleText.getElement().getStyle().setMarginTop(15, Unit.PX);
	}

	private void initLine() {
		mLine.addStyleName(STYLE.docTitleLine());;
	}
	
	private void initSubTitle(DivPanel iSubTitle) {
		iSubTitle.addStyleName(STYLE.f18());
		iSubTitle.addStyleName(STYLE.droidsansBold());
		iSubTitle.addStyleName(STYLE.c333333());
		iSubTitle.getElement().getStyle().setPosition(Position.RELATIVE);
		iSubTitle.getElement().getStyle().setLeft(12, Unit.PX);
		iSubTitle.getElement().getStyle().setMarginBottom(12, Unit.PX);
	}

	private void initText(SpanPanel iText) {
		iText.addStyleName(STYLE.f16());
		iText.addStyleName(STYLE.docText());
	}
}
