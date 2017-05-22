package com.starwars.app.client.paper.view;

import com.google.gwt.dom.client.Style.Cursor;
import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.paper.presenter.Comment;
import com.starwars.app.client.tools.DivPanel;
import com.starwars.app.client.tools.StyleTools;

public class CommentView extends ADivView implements Comment.Display {
	
	private final DivPanel mType;
	private final DivPanel mIcon;
	private final DivPanel mContainer;
	private final DivPanel mText;
	private final DivPanel mOther;
	private final DivPanel mSp;
	private int mFullHeight;
	
	public CommentView() {
		mRoot.getElement().getStyle().setCursor(Cursor.POINTER);
		mRoot.getElement().getStyle().setLeft(0, Unit.PX);
		mRoot.getElement().getStyle().setPosition(Position.ABSOLUTE);
		//mRoot.getElement().getStyle().setWidth(300, Unit.PX);
		mRoot.getElement().getStyle().setZIndex(95);
		
		mRoot.getElement().getStyle().setWidth(35, Unit.PCT);

		
		DivPanel lContainer = new DivPanel();
		mRoot.add(lContainer);
		
		mType = new DivPanel();
		lContainer.add(mType);

		mIcon = new DivPanel();
		lContainer.add(mIcon);
		mIcon.getElement().setAttribute("aria-hidden", "true");
		
		DivPanel lClear = new DivPanel();
		lContainer.add(lClear);
		lClear.addStyleName(STYLE.clear());

		mContainer = new DivPanel();
		mRoot.add(mContainer);
		
		mText = new DivPanel();
		mContainer.add(mText);
		mText.addStyleName(STYLE.f13());
		mText.addStyleName(STYLE.c333333());
		
		mOther = new DivPanel();
		mContainer.add(mOther);

		mSp = new DivPanel();
		mContainer.add(mSp);
		mSp.addStyleName(STYLE.sp5());
	}
	
	public void setType(String iType) {
		mType.setText(iType);
	}
	
	public void setIcon(String iIcon) {
		mIcon.getElement().setAttribute("data-icon", iIcon);
	}
	
	public void setText(String iText) {
//		mMessageContent = iText;
		mText.setText(iText);
	}
	
	private void clearStyles() {
		StyleTools.clearStyle(mRoot);
		StyleTools.clearStyle(mType);
		StyleTools.clearStyle(mIcon);
	}

	@Override
	public void setGrey() {
		clearStyles();
		
		mRoot.addStyleName(STYLE.bg999999Op07());
		mRoot.addStyleName(STYLE.rad5());
//		mRoot.addStyleName(STYLE.bor666666());
		mRoot.addStyleName(STYLE.pX10());
		
		mType.addStyleName(STYLE.droidsansBold());
		mType.addStyleName(STYLE.f13());
		mType.addStyleName(STYLE.c666666());
		mType.addStyleName(STYLE.fUpp());
		mType.addStyleName(STYLE.left());
		mType.addStyleName(STYLE.mT10());
		
		mIcon.addStyleName(STYLE.c666666());
		mIcon.addStyleName(STYLE.f23());
		mIcon.addStyleName(STYLE.right());
	}

	@Override
	public void setRed() {
		clearStyles();
		
		mRoot.getElement().getStyle().setBackgroundColor("#fef3f3");
		mRoot.addStyleName(STYLE.bgED1C24Op05());
		mRoot.addStyleName(STYLE.rad5());
//		mRoot.addStyleName(STYLE.borED1C24());
		mRoot.addStyleName(STYLE.pX10());
		
		mType.addStyleName(STYLE.droidsansBold());
		mType.addStyleName(STYLE.f13());
		mType.addStyleName(STYLE.cED1C24());
		mType.addStyleName(STYLE.fUpp());
		mType.addStyleName(STYLE.left());
		mType.addStyleName(STYLE.mT10());
		
		mIcon.addStyleName(STYLE.cED1C24());
		mIcon.addStyleName(STYLE.f23());
		mIcon.addStyleName(STYLE.right());

		
	}

	@Override
	public void setBlue() {
		clearStyles();
		
		mRoot.addStyleName(STYLE.bg00ACE7Op07());
		mRoot.addStyleName(STYLE.rad5());
//		mRoot.addStyleName(STYLE.bor00ACE7());
		mRoot.addStyleName(STYLE.pX10());
		
		mType.addStyleName(STYLE.droidsansBold());
		mType.addStyleName(STYLE.f13());
		mType.addStyleName(STYLE.c00ACE7());
		mType.addStyleName(STYLE.fUpp());
		mType.addStyleName(STYLE.left());
		mType.addStyleName(STYLE.mT10());
		
		mIcon.addStyleName(STYLE.c00ACE7());
		mIcon.addStyleName(STYLE.f23());
		mIcon.addStyleName(STYLE.right());
	}

	@Override
	public void setGreen() {
		clearStyles();
		
		mRoot.addStyleName(STYLE.bg39B54AOp05());
		mRoot.addStyleName(STYLE.rad5());
//		mRoot.addStyleName(STYLE.bor39B54A());
		mRoot.addStyleName(STYLE.pX10());
		
		mType.addStyleName(STYLE.droidsansBold());
		mType.addStyleName(STYLE.f13());
		mType.addStyleName(STYLE.c39B54A());
		mType.addStyleName(STYLE.fUpp());
		mType.addStyleName(STYLE.left());
		mType.addStyleName(STYLE.mT10());
		
		mIcon.addStyleName(STYLE.c39B54A());
		mIcon.addStyleName(STYLE.f23());
		mIcon.addStyleName(STYLE.right());
		
	}

	@Override
	public void setOrange() {
		clearStyles();
		
		mRoot.getElement().getStyle().setBackgroundColor("#fdf7f2");
		mRoot.addStyleName(STYLE.bgEA7500Op05());
		mRoot.addStyleName(STYLE.rad5());
//		mRoot.addStyleName(STYLE.borEA7500());
		mRoot.addStyleName(STYLE.pX10());
		
		mType.addStyleName(STYLE.droidsansBold());
		mType.addStyleName(STYLE.f13());
		mType.addStyleName(STYLE.cEA7500());
		mType.addStyleName(STYLE.fUpp());
		mType.addStyleName(STYLE.left());
		mType.addStyleName(STYLE.mT10());
		
		mIcon.addStyleName(STYLE.cEA7500());
		mIcon.addStyleName(STYLE.f23());
		mIcon.addStyleName(STYLE.right());
		
	}

	@Override
	public void showContent() {
		mRoot.addStyleName(STYLE.pY5());
		mContainer.getElement().getStyle().clearDisplay();
//		mSp.getElement().getStyle().clearDisplay();
//		mContainer.getElement().getStyle().clearWidth();
//		mContainer.getElement().getStyle().clearHeight();
//		mText.setText(mMessageContent);
//		mSp.getElement().getStyle().clearWidth();
//		mSp.getElement().getStyle().clearHeight();
	}

	@Override
	public void hideContent() {
		mRoot.removeStyleName(STYLE.pY5());
		mContainer.getElement().getStyle().setDisplay(com.google.gwt.dom.client.Style.Display.NONE);
//		mSp.getElement().getStyle().setDisplay(com.google.gwt.dom.client.Style.Display.NONE);
//		mText.setText("");
//		mContainer.getElement().getStyle().setWidth(0, Unit.PX);
//		mContainer.getElement().getStyle().setHeight(0, Unit.PX);
//		mSp.getElement().getStyle().setWidth(0, Unit.PX);
//		mSp.getElement().getStyle().setHeight(0, Unit.PX);
	}
	
	public void setOther(Widget iWidget) {
		mOther.add(iWidget);
	}
	
	public int getOffsetTop() {
		return mRoot.getElement().getOffsetTop();
	}
	
	@Override
	public int getFullHeight() {
		return mFullHeight;
	}

	@Override
	public void setFullHeight() {
		mRoot.removeStyleName(STYLE.transAll());
		showContent();
		mFullHeight = mRoot.getElement().getClientHeight();
		hideContent();
		mRoot.addStyleName(STYLE.transAll());
	}
		
}
