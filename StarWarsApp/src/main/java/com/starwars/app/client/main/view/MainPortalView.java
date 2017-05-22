package com.starwars.app.client.main.view;

import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.main.presenter.MainPortal;
import com.starwars.app.client.tools.DivPanel;
import com.starwars.app.client.tools.SpanPanel;

public class MainPortalView extends ADivView implements MainPortal.Display {

	private final DivPanel mHeader;
	private final DivPanel mTitle;
	private final DivPanel mSubTitle;
	private final SpanPanel mMainWrapper;
	private final SpanPanel mClassicPortal;
	private final SpanPanel mLegendsPortal;
	private final SpanPanel mClassicPortalText;
	private final SpanPanel mLegendsPortalText;
	private final DivPanel mFooter;
	
	public MainPortalView() {
		initRoot();
		
		mHeader = new DivPanel();
		mRoot.add(mHeader);
		initHeader();
		
		mTitle = new DivPanel();
//		mRoot.add(mTitle);
		initTitle();
		
		mSubTitle = new DivPanel();
//		mRoot.add(mSubTitle);
		initSubTitle();
		
		mLegendsPortalText = new SpanPanel();
		mRoot.add(mLegendsPortalText);
		
		mMainWrapper = new SpanPanel();
		mRoot.add(mMainWrapper);
		initMainWrapper();
		
		mLegendsPortal = new SpanPanel();
		mMainWrapper.add(mLegendsPortal);
		
		mClassicPortal = new SpanPanel();
		mMainWrapper.add(mClassicPortal);
		
		mClassicPortalText = new SpanPanel();
		mRoot.add(mClassicPortalText);
		
		mFooter = new DivPanel();
		mRoot.add(mFooter);
		initFooter();
		
		zoom();
	}

	public void addCircle(Widget iWidget) {
		mRoot.add(iWidget);
		iWidget.getElement().getStyle().setPosition(Position.RELATIVE);
		iWidget.getElement().getStyle().setBottom(148036320 / ((Window.getClientHeight() + 127) * (Window.getClientHeight() + 127)) + 50 - 71 - 32, Unit.PX);
		iWidget.getElement().getStyle().setZIndex(-1);
		iWidget.getElement().getStyle().setRight(7, Unit.PX);
	}
	
	@Override
	public void addClassicPortal(Widget iWidget) {
		mClassicPortal.add(iWidget);
	}

	@Override
	public void addLegendsPortal(Widget iWidget) {
		mLegendsPortal.add(iWidget);
	}
	
	@Override
	public void addClassicPortalText(Widget iWidget) {
		mClassicPortalText.add(iWidget);
	}

	@Override
	public void addLegendsPortalText(Widget iWidget) {
		mLegendsPortalText.add(iWidget);
	}
	
	public void portalMode() {
		mMainWrapper.show();
		mLegendsPortalText.show();
		mClassicPortalText.show();
		mTitle.setText("Il y a bien longtemps dans une galaxie lointaine, très lointaine...");
		mTitle.getElement().getStyle().setTop(5, Unit.PCT);
//		mSubTitle.setText("Star Wars ! Une des plus grandes sagas Space Opera encore à ce jour. Cet univers, crée par George Lucas et enrichi par "
//				+ "une multitudes d'oeuvres, s'est vu être divisé en deux : Legends et Classic, tous deux regorgeant d'informations."
//				+ " Entrez dans ces mondes débordants d'histoires, d'engins fabuleux et de héros légendaires."
//				+ " Arborez chaque recoin de ces vastes univers."
//				+ " Découvrez Star Wars Essential !");
		
		mSubTitle.setText("Star Wars, une immense saga créée par un seul homme et enrichie par une multitude d'oeuvres à travers les années. "
				+ "Tout ce lore, aujourd'hui divisé en deux univers distincts, se retrouve ici, présenté sous une forme nouvelle. "
				+ "Vivez Star Wars différemment et arborez une galaxie débordante d'histoires, d'engins fabuleux et de héros légendaires. "
				+ "Franchissez le cap, ces univers n'attendent que vous.");
	
		mSubTitle.getElement().getStyle().setTop(6.6, Unit.PCT);
		mSubTitle.getElement().getStyle().setWidth(1000, Unit.PX);
	}
	
	public void loadMode() {
		mMainWrapper.hide();
		mLegendsPortalText.hide();
		mClassicPortalText.hide();
		mTitle.setText("Veuillez patienter un instant...");
		mTitle.getElement().getStyle().setTop(38.56, Unit.PCT);
		mSubTitle.setText("Star Wars Essential se charge, cela peut prendre quelques"
				+ " instants lors de votre première connexion.");
		mSubTitle.getElement().getStyle().setTop(40.16, Unit.PCT);
		mSubTitle.getElement().getStyle().setWidth(390, Unit.PX);
	}
	
	private void initRoot() {
		mRoot.addStyleName(STYLE.mainPortal());
	}

	private void initHeader() {
		mHeader.addStyleName(STYLE.headerPortal());
	}
	
	private void initFooter() {
		mFooter.addStyleName(STYLE.footerPortal());
	}
	
	private void initTitle() {
		mTitle.addStyleName(STYLE.portalTitle());
		mTitle.addStyleName(STYLE.originInitial());
	}

	private void initSubTitle() {
		mSubTitle.addStyleName(STYLE.portalSubTitle());
		mSubTitle.addStyleName(STYLE.originInitial());
	}
		
	private void initMainWrapper() {
		mMainWrapper.addStyleName(STYLE.mainPortalWrapper());
	}
	
	@Override
	public void zoom() {
		if (Window.getClientWidth() < 1200) {
			mTitle.addStyleName(STYLE.zoom60());
			mSubTitle.addStyleName(STYLE.zoom60());
			mMainWrapper.addStyleName(STYLE.zoom60());
			mHeader.addStyleName(STYLE.zoom60());
			mFooter.addStyleName(STYLE.zoom60());
		} else if (Window.getClientWidth() >= 1200 && Window.getClientWidth() < 1800) {
			mTitle.addStyleName(STYLE.zoom70());
			mSubTitle.addStyleName(STYLE.zoom70());
			mMainWrapper.addStyleName(STYLE.zoom70());
			mHeader.addStyleName(STYLE.zoom70());
			mFooter.addStyleName(STYLE.zoom70());
		}
	}

	@Override
	public void fadeOutPortals() {
		mRoot.addStyleName(STYLE.fadeout85());
		mRoot.removeStyleName(STYLE.fadein1());
	}
	
	@Override
	public void fadeInPortals() {
		mRoot.removeStyleName(STYLE.fadeout85());
		mRoot.addStyleName(STYLE.fadein1());
	}
}
