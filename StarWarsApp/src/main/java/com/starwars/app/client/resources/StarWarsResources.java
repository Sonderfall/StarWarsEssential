package com.starwars.app.client.resources;

import org.helios.gwt.fonts.client.FontName;
import org.helios.gwt.fonts.client.FontResource;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;

public interface StarWarsResources extends ClientBundle {
	
	public static final StarWarsResources INSTANCE =  GWT.create(StarWarsResources.class);
	
	@Source("css/paper.css")
	public PaperCssResource paperCss();
	
	@Source("css/stylesheet.css")
	public StyleSheetCssResource stylesheetCss();
	
	@Source("css/chronology.css")
	public ChronologyCssResource chronologyCss();
	
	@Source("css/genealogy.css")
	public GenealogyCssResource genealogyCss();
	
	@Source("css/galaxy.css")
	public GalaxyCssResource galaxyCss();
	
	@Source("css/pager.css")
	public PagerCssResource pagerCss();
	
	@Source({"fonts/droidsans/droidsans-webfont.eot",
		"fonts/droidsans/droidsans-webfont.svg",
		"fonts/droidsans/droidsans-webfont.ttf",
		"fonts/droidsans/droidsans-webfont.woff"})
	@FontName("droidsans")
	public FontResource droidsansWebfont();
	
	@Source({"fonts/droidsans/droidsans-bold-webfont.eot",
		"fonts/droidsans/droidsans-bold-webfont.svg",
		"fonts/droidsans/droidsans-bold-webfont.ttf",
		"fonts/droidsans/droidsans-bold-webfont.woff"})
	@FontName("droidsans-bold")
	public FontResource droidsansBoldWebfont();
	
	@Source({"fonts/geometricslabserif/geometricslabserif-medium-italic-webfont-webfont.eot",
		"fonts/geometricslabserif/geometricslabserif-medium-italic-webfont-webfont.svg",
		"fonts/geometricslabserif/geometricslabserif-medium-italic-webfont-webfont.ttf",
		"fonts/geometricslabserif/geometricslabserif-medium-italic-webfont-webfont.woff"})
	@FontName("geoslb712_md_btmedium_italic")
	public FontResource geometricslabserifMediumItalicWebfontWebfont();
	
	@Source({"fonts/geometricslabserif/geometricslabserif-medium-webfont-webfont.eot",
		"fonts/geometricslabserif/geometricslabserif-medium-webfont-webfont.svg",
		"fonts/geometricslabserif/geometricslabserif-medium-webfont-webfont.ttf",
		"fonts/geometricslabserif/geometricslabserif-medium-webfont-webfont.woff"})
	@FontName("geoslb712_md_btmedium")
	public FontResource geometricslabserifMediumWebfontWebfont();
	
	@Source({"fonts/geometricslabserif/geometric_slabserif_703_bold_bt.eot",
		"fonts/geometricslabserif/geometric_slabserif_703_bold_bt.svg",
		"fonts/geometricslabserif/geometric_slabserif_703_bold_bt.ttf",
		"fonts/geometricslabserif/geometric_slabserif_703_bold_bt.woff"})
	@FontName("geoslab703_md_btbold")
	public FontResource geometricSlabserif703BoldBt();
	
	@Source({"fonts/iconsstarwars/icons-starwars-webfont.eot",
		"fonts/iconsstarwars/icons-starwars-webfont.svg",
		"fonts/iconsstarwars/icons-starwars-webfont.ttf",
		"fonts/iconsstarwars/icons-starwars-webfont.woff"})
	@FontName("icons-starwars-webfont")
	public FontResource iconsStarWarsWebfont();
}