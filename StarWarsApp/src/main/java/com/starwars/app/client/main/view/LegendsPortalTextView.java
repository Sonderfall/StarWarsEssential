package com.starwars.app.client.main.view;

import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.dom.client.Style.Unit;
import com.starwars.app.client.abs.view.ASpanView;
import com.starwars.app.client.main.presenter.LegendsPortalText;
import com.starwars.app.client.tools.DivPanel;

public class LegendsPortalTextView extends ASpanView implements LegendsPortalText.Display {

	private final DivPanel mTitle;
	private final DivPanel mParagraph1;
	private final DivPanel mParagraph2;
	private final DivPanel mParagraph3;
	
	public LegendsPortalTextView() {
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
//		mRoot.getElement().getStyle().setLeft(35, Unit.PCT);
		mRoot.getElement().getStyle().setDisplay(Display.NONE);
	}
	
	public void show() {
//		mRoot.removeStyleName(STYLE.fadeout85());
		mRoot.addStyleName(STYLE.fadein3sec());
		mRoot.getElement().getStyle().setLeft(6, Unit.PCT);
		mRoot.getElement().getStyle().clearDisplay();
	}
	
	private void initRoot() {
		mRoot.addStyleName(STYLE.portalText());
//		mRoot.addStyleName(STYLE.reflect85());
//		mRoot.addStyleName(STYLE.transAll());
	}
	
	private void initTitle() {
		mTitle.addStyleName(STYLE.portalTextTitle());
		mTitle.setText("Legends");
	}
	
	private void initParagraph1() {
		mParagraph1.addStyleName(STYLE.portalTextParagrah());
		mParagraph1.setText("L’Univers appelé Legends, ou Univers Étendu, correspond à toutes les histoires engendrées"
				+ " à partir des deux premières trilogies, livres, BD et jeux-vidéo créés depuis "
				+ "la sortie du premier film en 1977.");
	}
	
	private void initParagraph2() {
		mParagraph2.addStyleName(STYLE.portalTextParagrah());
		mParagraph2.setText("Cet univers étendu est immense. Les informations regroupées ici procurent "
				+ "les connaissances afin de mieux appréhender et comprendre cet environnement.");
	}
	
	private void initParagraph3() {
		mParagraph3.addStyleName(STYLE.portalTextParagrah());
		mParagraph3.setText("Si vous connaissez déjà bien l’univers Classic de Star Wars et que vous "
				+ "voulez passer à la vitesse supérieure, c’est par ici.");
	}
}