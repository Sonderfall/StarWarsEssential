package com.starwars.app.client.main.view;

import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.dom.client.Style.Unit;
import com.starwars.app.client.abs.view.ASpanView;
import com.starwars.app.client.main.presenter.ClassicPortalText;
import com.starwars.app.client.tools.DivPanel;

public class ClassicPortalTextView extends ASpanView implements ClassicPortalText.Display {

	private final DivPanel mTitle;
	private final DivPanel mParagraph1;
	private final DivPanel mParagraph2;
	private final DivPanel mParagraph3;
	
	public ClassicPortalTextView() {
		initRoot();
		
		mTitle = new DivPanel();
		mRoot.add(mTitle);
		initTitle();
		
		mParagraph1 = new DivPanel();
		mRoot.add(mParagraph1);
		initParagraph1();
		
		mParagraph2 = new DivPanel();
		mRoot.add(mParagraph2);
		initParagraph2();
		
		mParagraph3 = new DivPanel();
		mRoot.add(mParagraph3);
		initParagraph3();
		
		zoom();
	}
	
	public void hide() {
		mRoot.removeStyleName(STYLE.fadein3sec());
//		mRoot.addStyleName(STYLE.fadeout85());
//		mRoot.getElement().getStyle().setRight(35, Unit.PCT);
		mRoot.getElement().getStyle().setDisplay(Display.NONE);
	}
	
	public void show() {
//		mRoot.removeStyleName(STYLE.fadeout85());
		mRoot.getElement().getStyle().setRight(6, Unit.PCT);
		mRoot.addStyleName(STYLE.fadein3sec());
		mRoot.getElement().getStyle().clearDisplay();
	}
	
	private void initRoot() {
		mRoot.addStyleName(STYLE.portalText());
//		mRoot.addStyleName(STYLE.reflect85());
//		mRoot.addStyleName(STYLE.transAll());
	}
	
	private void initTitle() {
		mTitle.addStyleName(STYLE.portalTextTitle());
		mTitle.setText("Classic");
	}
	
	private void initParagraph1() {
		mParagraph1.addStyleName(STYLE.portalTextParagrah());
		mParagraph1.setText("L’Univers dit Classic, ou Canon, regroupe toutes les histoires directement "
				+ "liées aux films Star Wars, aux séries animées et aux éléments encore canons "
				+ "avec la saga originale.");
	}
	
	private void initParagraph2() {
		mParagraph2.addStyleName(STYLE.portalTextParagrah());
		mParagraph2.setText("Toutes ces histoires forment un univers complet et cohérent. Les "
				+ "informations regroupées ici sont en harmonie avec les trois trilogies "
				+ "ainsi que les séries Clones Wars et Rebels.");
	}
	
	private void initParagraph3() {
		mParagraph3.addStyleName(STYLE.portalTextParagrah());
		mParagraph3.setText("Si vous êtes à la recherche d'informations concernant "
				+ "l’univers original de Star Wars, c’est ici que vous les trouverez.");
	}
}
