package com.starwars.app.client.gin;


import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.about.presenter.About;
import com.starwars.app.client.about.presenter.AboutDescription;
import com.starwars.app.client.about.presenter.SendButton;
import com.starwars.app.client.backportal.presenter.BackPortal;
import com.starwars.app.client.beta.presenter.Beta;
import com.starwars.app.client.chronology.presenter.ChronoDate;
import com.starwars.app.client.chronology.presenter.ChronoBigFigure;
import com.starwars.app.client.chronology.presenter.ChronologyModule;
import com.starwars.app.client.chronology.presenter.EraPeriod;
import com.starwars.app.client.chronology.presenter.GouvPeriod;
import com.starwars.app.client.chronology.presenter.ReligionPeriod;
import com.starwars.app.client.chronology.presenter.WarPeriod;
import com.starwars.app.client.encyclopedia.presenter.DiapositiveItem;
import com.starwars.app.client.encyclopedia.presenter.DocItem;
import com.starwars.app.client.encyclopedia.presenter.EncyclopediaModule;
import com.starwars.app.client.encyclopedia.presenter.HyperLink;
import com.starwars.app.client.encyclopedia.presenter.HyperLinkImage;
import com.starwars.app.client.encyclopedia.presenter.HyperLinkText;
import com.starwars.app.client.encyclopedia.presenter.ZoomDiapositive;
import com.starwars.app.client.galaxy.presenter.GalaxyChronology;
import com.starwars.app.client.galaxy.presenter.GalaxyChronologyCursor;
import com.starwars.app.client.galaxy.presenter.GalaxyChronologyPeriodDate;
import com.starwars.app.client.galaxy.presenter.GalaxyModule;
import com.starwars.app.client.galaxy.presenter.GalaxyText;
import com.starwars.app.client.galaxy.presenter.Planete;
import com.starwars.app.client.galaxy.presenter.Road;
import com.starwars.app.client.galaxy.presenter.ShowChronologyButton;
import com.starwars.app.client.galaxy.presenter.ShowPlanetesButton;
import com.starwars.app.client.galaxy.presenter.ShowTerritoriesButton;
import com.starwars.app.client.galaxy.presenter.Territory;
import com.starwars.app.client.galaxy.presenter.TerritoryTitle;
import com.starwars.app.client.genealogy.presenter.BasicGeneaNode;
import com.starwars.app.client.genealogy.presenter.GeneaLine;
import com.starwars.app.client.genealogy.presenter.GenealogyModule;
import com.starwars.app.client.genealogy.presenter.JediGeneaNode;
import com.starwars.app.client.genealogy.presenter.UnknownGeneration;
import com.starwars.app.client.main.presenter.ClassicPortal;
import com.starwars.app.client.main.presenter.ClassicPortalText;
import com.starwars.app.client.main.presenter.Footer;
import com.starwars.app.client.main.presenter.Header;
import com.starwars.app.client.main.presenter.LegendsPortal;
import com.starwars.app.client.main.presenter.LegendsPortalText;
import com.starwars.app.client.main.presenter.Main;
import com.starwars.app.client.main.presenter.MainPortal;
import com.starwars.app.client.main.presenter.TopPanel;
import com.starwars.app.client.pager.presenter.Circle;
import com.starwars.app.client.pager.presenter.ColumnDetail;
import com.starwars.app.client.pager.presenter.ElementItem;
import com.starwars.app.client.pager.presenter.Holoprojector;
import com.starwars.app.client.pager.presenter.NodePath;
import com.starwars.app.client.pager.presenter.NodePathItem;
import com.starwars.app.client.pager.presenter.Pager;
import com.starwars.app.client.pager.presenter.SectionImage;
import com.starwars.app.client.paper.presenter.ColumnImage;
import com.starwars.app.client.paper.presenter.Comment;
import com.starwars.app.client.paper.presenter.Description;
import com.starwars.app.client.paper.presenter.DescriptionItem;
import com.starwars.app.client.paper.presenter.MainImage;
import com.starwars.app.client.paper.presenter.Paper;
import com.starwars.app.client.research.presenter.ResearchEngine;
import com.starwars.app.client.tools.ITools;

@GinModules(Module.class)
public interface Injector extends Ginjector {
	/* Main */
	
	Main getMain();
	MainPortal getMainPortal();
	LegendsPortal getLegendsPortal();
	ClassicPortal getClassicPortal();
	LegendsPortalText getLegendsPortalText();
	ClassicPortalText getClassicPortalText();
	Header getHeader();
	Footer getFooter();
	BackPortal getBackPortal();
	About getAbout();
	SendButton getSendButton();
	AboutDescription getAboutDescription();
	EventBus getEventBus();	
	ITools getTools();
	Beta getBeta();
	
	/* Misc */
	
	Description getDescription();
	DescriptionItem getDescriptionItem();
	
	/* Navigation */
	
	NodePath getNodePath();
	NodePathItem getNodePathItem();
	Pager getPager();
	ColumnDetail getColumnDetail();
	ColumnImage getColumnComment();
	Holoprojector getHoloprojector();
	ElementItem getElementItem();
	Paper getPaper();
	Circle getCircle();
	
	/* Research */
	
	ResearchEngine getResearchEngine();
	
	/* Enclyclopedia */
	
	EncyclopediaModule getEncyclopedia();
	DocItem getDocItem();
	DiapositiveItem getDiapositiveItem();
	ZoomDiapositive getZoomDiapositive();
	HyperLink getHyperLink();
	MainImage getMainImage();
	HyperLinkText getHyperTextDescription();
	HyperLinkImage getHyperTextImage();
	SectionImage getSectionImage();
	
	/* Chronology */
	
	ChronologyModule getChronology();
	ChronoBigFigure getChronoBigFigure();
	ChronoDate getChronoDate();
	WarPeriod getWarPeriod();
	GouvPeriod getGouvPeriod();
	EraPeriod getEraPeriod();
	ReligionPeriod getReligionPeriod();
	
	/* Genealogy */
	
	GenealogyModule getGenealogy();
	GeneaLine getGeneaLine();
	UnknownGeneration getUnknownGeneration();
	BasicGeneaNode getBasicGeneaNode();
	JediGeneaNode getJediGeneaNode();
	
	/* Galaxy */

	GalaxyModule getGalaxy();
	GalaxyText getGalaxyText();
	GalaxyChronologyPeriodDate getGalaxyChronologyPeriodDate();
	GalaxyChronologyCursor getGalaxyChronologyCursor();
	GalaxyChronology getGalaxyChronology();
	Planete getPlanete();
	Road getRoad();
	Territory getTerritory();
	TerritoryTitle getTerritoryTitle();
	ShowPlanetesButton getShowPlaneteButton();
	ShowTerritoriesButton getShowTerritoriesButton();
	ShowChronologyButton getShowChronologyButton();
	
	/* Misc */
	
	TopPanel getTopPanel();
	Comment getComment();
}
