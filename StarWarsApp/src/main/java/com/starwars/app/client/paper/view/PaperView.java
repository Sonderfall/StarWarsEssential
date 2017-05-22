package com.starwars.app.client.paper.view;

import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.dom.client.Style.FontStyle;
import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.dom.client.Style.TextAlign;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.paper.presenter.Paper;
import com.starwars.app.client.tools.DivPanel;

public class PaperView extends ADivView implements Paper.Display {

	private final DivPanel mTitle;
	private final DivPanel mImage;
	private final DivPanel mDescription;
	private final DivPanel mDoc;
	private final DivPanel mAdvancedComponent;
	private final DivPanel mHeader;
	private final DivPanel mTitleWrapper;
//	private final DivPanel mFinalLine;

	public PaperView() {
		initRoot();
		
		mHeader = new DivPanel();
		mRoot.add(mHeader);
		initHeader();
		
		mImage = new DivPanel();
		mHeader.add(mImage);
		
		mTitleWrapper = new DivPanel();
		mHeader.add(mTitleWrapper);
		initTitleWrapper();
		
		mTitle = new DivPanel();
		mTitleWrapper.add(mTitle);
		initTitle();

		mDescription = new DivPanel();
		mTitleWrapper.add(mDescription);
		initDescription();
		
//		mFinalLine = new DivPanel();
//		mTitleWrapper.add(mFinalLine);
//		initFinalLine();
		
		DivPanel lSF0 = new DivPanel();
		mRoot.add(lSF0);
		lSF0.addStyleName(STYLE.sp10());
		
		mDoc = new DivPanel();
		initDoc();
		
		mAdvancedComponent = new DivPanel();
		initAdvancedComponent();
	}

	public void clearAdvancedComponent() {
		mAdvancedComponent.clear();
	}

	public void setTextTitle(String iTitle) {
		mTitle.setText(iTitle);
	}

	public void setImageTitle(Image iImage) {
		mImage.add(iImage);
				
		mTitleWrapper.getElement().getStyle().setPosition(Position.RELATIVE);
		mTitleWrapper.getElement().getStyle().setLeft(200, Unit.PX);
		
		mHeader.getElement().getStyle().setHeight(180, Unit.PX);
		mHeader.getElement().getStyle().setWidth(150, Unit.PCT);
	}
	
	public void setDescription(String iDescription) {
		mDescription.setText(iDescription);
	}

	public void addDoc(Widget iWidget) {
		if (mDoc.getWidgetCount() == 0) {
			mRoot.add(mDoc);
		}
		mDoc.add(iWidget);
	}
	
	public void setAdvancedComponent(Widget iWidget) {
		mRoot.add(mAdvancedComponent);
		mAdvancedComponent.add(iWidget);
	}
	
	private void initRoot() {
		mRoot.getElement().setAttribute("id", "main panel element");
		mRoot.getElement().getStyle().setOpacity(1d);
		mRoot.getElement().getStyle().setDisplay(Display.INLINE_BLOCK);
	}
	
	private void initHeader() {
		mHeader.addStyleName(STYLE.exerciceEditbar());
	}
	
	private void initTitle() {
		mTitle.addStyleName(STYLE.droidsansBold());
		mTitle.addStyleName(STYLE.c333333());
		mTitle.addStyleName(STYLE.f24());
		mTitle.addStyleName(STYLE.mL5());
		mTitle.addStyleName(STYLE.w200per());
		mTitle.addStyleName(STYLE.left());
		mTitle.addStyleName(STYLE.mT2());
	}
	
	private void initTitleWrapper() {
		mTitleWrapper.addStyleName(STYLE.left());
		mTitleWrapper.addStyleName(STYLE.w60per());
	}
	
	private void initDescription() {
		mDescription.addStyleName(STYLE.f16());
		mDescription.addStyleName(STYLE.c777c7e());
		mDescription.addStyleName(STYLE.mT10());
		mDescription.addStyleName(STYLE.lh130per());
		mDescription.getElement().getStyle().setPaddingTop(30, Unit.PX);
		mDescription.getElement().getStyle().setMarginBottom(14, Unit.PX);
		mDescription.getElement().getStyle().setWidth(550, Unit.PX);
		mDescription.getElement().getStyle().setFontStyle(FontStyle.ITALIC);
	}
	
//	private void initFinalLine() {
//		mFinalLine.addStyleName(STYLE.line());
//		mFinalLine.addStyleName(STYLE.bg999999());
//		mFinalLine.getElement().getStyle().setWidth(350, Unit.PX);	
//	}

	private void initDoc() {
		mDoc.getElement().setAttribute("id", "panel doc");
		mDoc.getElement().getStyle().setTextAlign(TextAlign.JUSTIFY);
		mDoc.getElement().getStyle().setPosition(Position.RELATIVE);
		mDoc.getElement().getStyle().setLeft(23, Unit.PX);
	}
	
	private void initAdvancedComponent() {
		mAdvancedComponent.getElement().getStyle().setWidth(100, Unit.PCT);
		mAdvancedComponent.getElement().getStyle().setPosition(Position.RELATIVE);
		mAdvancedComponent.getElement().setAttribute("id", "panel advanced");
	}
}