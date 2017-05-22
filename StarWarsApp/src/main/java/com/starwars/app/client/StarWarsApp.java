package com.starwars.app.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.starwars.app.client.gin.Injector;
import com.starwars.app.client.main.presenter.Main;
import com.starwars.app.client.resources.StarWarsResources;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class StarWarsApp implements EntryPoint {

	public static final String majorVersion = "1";
	public static final String minorVersion = "0";
	public static final String revision = "5";
	
	public static final Injector ginjector = GWT.create(Injector.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		loadStyles();
		runApp();
	}

	private void runApp() {
		final Main lMain = ginjector.getMain();
		lMain.bind();
		RootPanel.get().add(lMain.getDisplay().asWidget());
	}

	private void loadStyles() {
		StarWarsResources.INSTANCE.droidsansWebfont().ensureInjected();
		StarWarsResources.INSTANCE.droidsansBoldWebfont().ensureInjected();
		StarWarsResources.INSTANCE.geometricslabserifMediumItalicWebfontWebfont().ensureInjected();
		StarWarsResources.INSTANCE.geometricslabserifMediumWebfontWebfont().ensureInjected();
		StarWarsResources.INSTANCE.geometricSlabserif703BoldBt().ensureInjected();
		StarWarsResources.INSTANCE.iconsStarWarsWebfont().ensureInjected();
		StarWarsResources.INSTANCE.stylesheetCss().ensureInjected();
		StarWarsResources.INSTANCE.paperCss().ensureInjected();
		StarWarsResources.INSTANCE.chronologyCss().ensureInjected();
		StarWarsResources.INSTANCE.genealogyCss().ensureInjected();
		StarWarsResources.INSTANCE.galaxyCss().ensureInjected();
	}
}