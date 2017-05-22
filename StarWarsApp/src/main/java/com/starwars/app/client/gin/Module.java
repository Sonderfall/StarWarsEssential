package com.starwars.app.client.gin;


import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.starwars.app.client.about.presenter.About;
import com.starwars.app.client.about.presenter.AboutDescription;
import com.starwars.app.client.about.presenter.SendButton;
import com.starwars.app.client.about.presenter.impl.AboutDescriptionImpl;
import com.starwars.app.client.about.presenter.impl.AboutImpl;
import com.starwars.app.client.about.presenter.impl.SendButtonImpl;
import com.starwars.app.client.about.view.AboutDescriptionView;
import com.starwars.app.client.about.view.AboutView;
import com.starwars.app.client.about.view.SendButtonView;
import com.starwars.app.client.backportal.presenter.BackPortal;
import com.starwars.app.client.backportal.presenter.impl.BackPortalImpl;
import com.starwars.app.client.backportal.view.BackPortalView;
import com.starwars.app.client.beta.presenter.Beta;
import com.starwars.app.client.beta.presenter.impl.BetaImpl;
import com.starwars.app.client.beta.view.BetaView;
import com.starwars.app.client.chronology.presenter.ChronoDate;
import com.starwars.app.client.chronology.presenter.ChronoBigFigure;
import com.starwars.app.client.chronology.presenter.ChronologyModule;
import com.starwars.app.client.chronology.presenter.EraPeriod;
import com.starwars.app.client.chronology.presenter.GouvPeriod;
import com.starwars.app.client.chronology.presenter.ReligionPeriod;
import com.starwars.app.client.chronology.presenter.WarPeriod;
import com.starwars.app.client.chronology.presenter.impl.ChronoDateImpl;
import com.starwars.app.client.chronology.presenter.impl.ChronoBigFigureImpl;
import com.starwars.app.client.chronology.presenter.impl.ChronologyModuleImpl;
import com.starwars.app.client.chronology.presenter.impl.EraPeriodImpl;
import com.starwars.app.client.chronology.presenter.impl.GouvPeriodImpl;
import com.starwars.app.client.chronology.presenter.impl.ReligionPeriodImpl;
import com.starwars.app.client.chronology.presenter.impl.WarPeriodImpl;
import com.starwars.app.client.chronology.view.ChronoDateView;
import com.starwars.app.client.chronology.view.ChronoBigFigureView;
import com.starwars.app.client.chronology.view.ChronologyModuleView;
import com.starwars.app.client.chronology.view.EraPeriodView;
import com.starwars.app.client.chronology.view.GouvPeriodView;
import com.starwars.app.client.chronology.view.ReligionPeriodView;
import com.starwars.app.client.chronology.view.WarPeriodView;
import com.starwars.app.client.encyclopedia.presenter.DiapositiveItem;
import com.starwars.app.client.encyclopedia.presenter.DocItem;
import com.starwars.app.client.encyclopedia.presenter.EncyclopediaModule;
import com.starwars.app.client.encyclopedia.presenter.HyperLink;
import com.starwars.app.client.encyclopedia.presenter.HyperLinkImage;
import com.starwars.app.client.encyclopedia.presenter.HyperLinkText;
import com.starwars.app.client.encyclopedia.presenter.ZoomDiapositive;
import com.starwars.app.client.encyclopedia.presenter.impl.DiapositiveItemImpl;
import com.starwars.app.client.encyclopedia.presenter.impl.DocItemImpl;
import com.starwars.app.client.encyclopedia.presenter.impl.EncyclopediaModuleImpl;
import com.starwars.app.client.encyclopedia.presenter.impl.HyperLinkImageImpl;
import com.starwars.app.client.encyclopedia.presenter.impl.HyperLinkImpl;
import com.starwars.app.client.encyclopedia.presenter.impl.HyperLinkTextImpl;
import com.starwars.app.client.encyclopedia.presenter.impl.ZoomDiapositiveImpl;
import com.starwars.app.client.encyclopedia.view.DiapositiveItemView;
import com.starwars.app.client.encyclopedia.view.DocItemView;
import com.starwars.app.client.encyclopedia.view.EncyclopediaModuleView;
import com.starwars.app.client.encyclopedia.view.HyperLinkImageView;
import com.starwars.app.client.encyclopedia.view.HyperLinkTextView;
import com.starwars.app.client.encyclopedia.view.HyperLinkView;
import com.starwars.app.client.encyclopedia.view.ZoomDiapositiveView;
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
import com.starwars.app.client.galaxy.presenter.impl.GalaxyChronologyCursorImpl;
import com.starwars.app.client.galaxy.presenter.impl.GalaxyChronologyImpl;
import com.starwars.app.client.galaxy.presenter.impl.GalaxyChronologyPeriodDateImpl;
import com.starwars.app.client.galaxy.presenter.impl.GalaxyModuleImpl;
import com.starwars.app.client.galaxy.presenter.impl.GalaxyTextImpl;
import com.starwars.app.client.galaxy.presenter.impl.PlaneteImpl;
import com.starwars.app.client.galaxy.presenter.impl.RoadImpl;
import com.starwars.app.client.galaxy.presenter.impl.ShowChronologyButtonImpl;
import com.starwars.app.client.galaxy.presenter.impl.ShowPlanetesButtonImpl;
import com.starwars.app.client.galaxy.presenter.impl.ShowTerritoriesButtonImpl;
import com.starwars.app.client.galaxy.presenter.impl.TerritoryImpl;
import com.starwars.app.client.galaxy.presenter.impl.TerritoryTitleImpl;
import com.starwars.app.client.galaxy.view.GalaxyChronologyCursorView;
import com.starwars.app.client.galaxy.view.GalaxyChronologyPeriodDateView;
import com.starwars.app.client.galaxy.view.GalaxyChronologyView;
import com.starwars.app.client.galaxy.view.GalaxyModuleView;
import com.starwars.app.client.galaxy.view.GalaxyTextView;
import com.starwars.app.client.galaxy.view.PlaneteView;
import com.starwars.app.client.galaxy.view.RoadView;
import com.starwars.app.client.galaxy.view.ShowChronologyButtonView;
import com.starwars.app.client.galaxy.view.ShowPlanetesButtonView;
import com.starwars.app.client.galaxy.view.ShowTerritoriesButtonView;
import com.starwars.app.client.galaxy.view.TerritoryTitleView;
import com.starwars.app.client.galaxy.view.TerritoryView;
import com.starwars.app.client.genealogy.presenter.BasicGeneaNode;
import com.starwars.app.client.genealogy.presenter.GeneaLine;
import com.starwars.app.client.genealogy.presenter.GenealogyModule;
import com.starwars.app.client.genealogy.presenter.JediGeneaNode;
import com.starwars.app.client.genealogy.presenter.UnknownGeneration;
import com.starwars.app.client.genealogy.presenter.impl.BasicGeneaNodeImpl;
import com.starwars.app.client.genealogy.presenter.impl.GeneaLineImpl;
import com.starwars.app.client.genealogy.presenter.impl.GenealogyModuleImpl;
import com.starwars.app.client.genealogy.presenter.impl.JediGeneaNodeImpl;
import com.starwars.app.client.genealogy.presenter.impl.UnknownGenerationImpl;
import com.starwars.app.client.genealogy.view.BasicGeneaNodeView;
import com.starwars.app.client.genealogy.view.GeneaLineView;
import com.starwars.app.client.genealogy.view.GenealogyModuleView;
import com.starwars.app.client.genealogy.view.JediGeneaNodeView;
import com.starwars.app.client.genealogy.view.UnknownGenerationView;
import com.starwars.app.client.main.presenter.ClassicPortal;
import com.starwars.app.client.main.presenter.ClassicPortalText;
import com.starwars.app.client.main.presenter.Footer;
import com.starwars.app.client.main.presenter.Header;
import com.starwars.app.client.main.presenter.LegendsPortal;
import com.starwars.app.client.main.presenter.LegendsPortalText;
import com.starwars.app.client.main.presenter.Main;
import com.starwars.app.client.main.presenter.MainPortal;
import com.starwars.app.client.main.presenter.TopPanel;
import com.starwars.app.client.main.presenter.impl.ClassicPortalImpl;
import com.starwars.app.client.main.presenter.impl.ClassicPortalTextImpl;
import com.starwars.app.client.main.presenter.impl.FooterImpl;
import com.starwars.app.client.main.presenter.impl.HeaderImpl;
import com.starwars.app.client.main.presenter.impl.LegendsPortalImpl;
import com.starwars.app.client.main.presenter.impl.LegendsPortalTextImpl;
import com.starwars.app.client.main.presenter.impl.MainImpl;
import com.starwars.app.client.main.presenter.impl.MainPortalImpl;
import com.starwars.app.client.main.presenter.impl.TopPanelImpl;
import com.starwars.app.client.main.view.ClassicPortalTextView;
import com.starwars.app.client.main.view.ClassicPortalView;
import com.starwars.app.client.main.view.FooterView;
import com.starwars.app.client.main.view.HeaderView;
import com.starwars.app.client.main.view.LegendsPortalTextView;
import com.starwars.app.client.main.view.LegendsPortalView;
import com.starwars.app.client.main.view.MainPortalView;
import com.starwars.app.client.main.view.MainView;
import com.starwars.app.client.main.view.TopPanelView;
import com.starwars.app.client.pager.presenter.Circle;
import com.starwars.app.client.pager.presenter.ColumnContainer;
import com.starwars.app.client.pager.presenter.ColumnDetail;
import com.starwars.app.client.pager.presenter.ElementItem;
import com.starwars.app.client.pager.presenter.Holoprojector;
import com.starwars.app.client.pager.presenter.NodePath;
import com.starwars.app.client.pager.presenter.NodePathItem;
import com.starwars.app.client.pager.presenter.Pager;
import com.starwars.app.client.pager.presenter.SectionImage;
import com.starwars.app.client.pager.presenter.SectionItem;
import com.starwars.app.client.pager.presenter.impl.CircleImpl;
import com.starwars.app.client.pager.presenter.impl.ColumnContainerImpl;
import com.starwars.app.client.pager.presenter.impl.ColumnDetailImpl;
import com.starwars.app.client.pager.presenter.impl.ElementItemImpl;
import com.starwars.app.client.pager.presenter.impl.HoloprojectorImpl;
import com.starwars.app.client.pager.presenter.impl.NodePathImpl;
import com.starwars.app.client.pager.presenter.impl.NodePathItemImpl;
import com.starwars.app.client.pager.presenter.impl.PagerImpl;
import com.starwars.app.client.pager.presenter.impl.SectionImageImpl;
import com.starwars.app.client.pager.presenter.impl.SectionItemImpl;
import com.starwars.app.client.pager.view.CircleView;
import com.starwars.app.client.pager.view.ColumnDetailView;
import com.starwars.app.client.pager.view.ColumnSectionView;
import com.starwars.app.client.pager.view.ElementItemView;
import com.starwars.app.client.pager.view.HoloprojectorView;
import com.starwars.app.client.pager.view.NodePathItemView;
import com.starwars.app.client.pager.view.NodePathView;
import com.starwars.app.client.pager.view.PagerView;
import com.starwars.app.client.pager.view.SectionImageView;
import com.starwars.app.client.pager.view.SectionItemView;
import com.starwars.app.client.paper.presenter.ColumnImage;
import com.starwars.app.client.paper.presenter.Comment;
import com.starwars.app.client.paper.presenter.Description;
import com.starwars.app.client.paper.presenter.DescriptionItem;
import com.starwars.app.client.paper.presenter.MainImage;
import com.starwars.app.client.paper.presenter.Paper;
import com.starwars.app.client.paper.presenter.impl.ColumnCommentImpl;
import com.starwars.app.client.paper.presenter.impl.CommentImpl;
import com.starwars.app.client.paper.presenter.impl.DescriptionImpl;
import com.starwars.app.client.paper.presenter.impl.DescriptionItemImpl;
import com.starwars.app.client.paper.presenter.impl.MainImageImpl;
import com.starwars.app.client.paper.presenter.impl.PaperImpl;
import com.starwars.app.client.paper.view.ColumnCommentView;
import com.starwars.app.client.paper.view.CommentView;
import com.starwars.app.client.paper.view.DescriptionItemView;
import com.starwars.app.client.paper.view.DescriptionView;
import com.starwars.app.client.paper.view.MainImageView;
import com.starwars.app.client.paper.view.PaperView;
import com.starwars.app.client.research.presenter.ResearchEngine;
import com.starwars.app.client.research.presenter.impl.ResearchEngineImpl;
import com.starwars.app.client.research.view.ResearchEngineView;
import com.starwars.app.client.tools.ITools;
import com.starwars.app.client.tools.ToolsImpl;

public class Module extends AbstractGinModule {

	@Override
	protected void configure() {
		/* Main */

		bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
		bind(ITools.class).to(ToolsImpl.class).in(Singleton.class);
		
		bind(Main.class).to(MainImpl.class);
		bind(Main.Display.class).to(MainView.class);

		bind(Header.class).to(HeaderImpl.class);
		bind(Header.Display.class).to(HeaderView.class);
		
		bind(Footer.class).to(FooterImpl.class);
		bind(Footer.Display.class).to(FooterView.class);

		bind(TopPanel.class).to(TopPanelImpl.class);
		bind(TopPanel.Display.class).to(TopPanelView.class);
		
		bind(MainPortal.class).to(MainPortalImpl.class);
		bind(MainPortal.Display.class).to(MainPortalView.class);
		
		bind(LegendsPortal.class).to(LegendsPortalImpl.class);
		bind(LegendsPortal.Display.class).to(LegendsPortalView.class);
		
		bind(LegendsPortalText.class).to(LegendsPortalTextImpl.class);
		bind(LegendsPortalText.Display.class).to(LegendsPortalTextView.class);
		
		bind(ClassicPortal.class).to(ClassicPortalImpl.class);
		bind(ClassicPortal.Display.class).to(ClassicPortalView.class);
		
		bind(ClassicPortalText.class).to(ClassicPortalTextImpl.class);
		bind(ClassicPortalText.Display.class).to(ClassicPortalTextView.class);
		
		bind(BackPortal.class).to(BackPortalImpl.class);
		bind(BackPortal.Display.class).to(BackPortalView.class);
		
		bind(About.class).to(AboutImpl.class);
		bind(About.Display.class).to(AboutView.class);
		
		bind(SendButton.class).to(SendButtonImpl.class);
		bind(SendButton.Display.class).to(SendButtonView.class);
		
		bind(Beta.class).to(BetaImpl.class);
		bind(Beta.Display.class).to(BetaView.class);
		
		bind(AboutDescription.class).to(AboutDescriptionImpl.class);
		bind(AboutDescription.Display.class).to(AboutDescriptionView.class);
		
		/* Misc */
		
		bind(DescriptionItem.class).to(DescriptionItemImpl.class);
		bind(DescriptionItem.Display.class).to(DescriptionItemView.class);
		
		bind(Description.class).to(DescriptionImpl.class);
		bind(Description.Display.class).to(DescriptionView.class);
		
		/* Navigation */

		bind(Pager.class).to(PagerImpl.class);
		bind(Pager.Display.class).to(PagerView.class);
		
		bind(Paper.class).to(PaperImpl.class);
		bind(Paper.Display.class).to(PaperView.class);
		
		bind(Circle.class).to(CircleImpl.class);
		bind(Circle.Display.class).to(CircleView.class);
		
		bind(Holoprojector.class).to(HoloprojectorImpl.class);
		bind(Holoprojector.Display.class).to(HoloprojectorView.class);

		bind(NodePath.class).to(NodePathImpl.class);
		bind(NodePath.Display.class).to(NodePathView.class);
		
		bind(NodePathItem.class).to(NodePathItemImpl.class);
		bind(NodePathItem.Display.class).to(NodePathItemView.class);
		
		bind(ElementItem.class).to(ElementItemImpl.class);
		bind(ElementItem.Display.class).to(ElementItemView.class);
		
		bind(SectionItem.class).to(SectionItemImpl.class);
		bind(SectionItem.Display.class).to(SectionItemView.class);
		
		/* Encyclopedia */
		
		bind(EncyclopediaModule.class).to(EncyclopediaModuleImpl.class);
		bind(EncyclopediaModule.Display.class).to(EncyclopediaModuleView.class);
		
		bind(DiapositiveItem.class).to(DiapositiveItemImpl.class);
		bind(DiapositiveItem.Display.class).to(DiapositiveItemView.class);
		
		bind(ZoomDiapositive.class).to(ZoomDiapositiveImpl.class);
		bind(ZoomDiapositive.Display.class).to(ZoomDiapositiveView.class);
		
		bind(DocItem.class).to(DocItemImpl.class);
		bind(DocItem.Display.class).to(DocItemView.class);
		
		bind(MainImage.class).to(MainImageImpl.class);
		bind(MainImage.Display.class).to(MainImageView.class);
		
		bind(HyperLink.class).to(HyperLinkImpl.class);
		bind(HyperLink.Display.class).to(HyperLinkView.class);
		
		bind(HyperLinkText.class).to(HyperLinkTextImpl.class);
		bind(HyperLinkText.Display.class).to(HyperLinkTextView.class);
		
		bind(HyperLinkImage.class).to(HyperLinkImageImpl.class);
		bind(HyperLinkImage.Display.class).to(HyperLinkImageView.class);
		
		bind(SectionImage.class).to(SectionImageImpl.class);
		bind(SectionImage.Display.class).to(SectionImageView.class);
		
		/* Researcher */
		
		bind(ResearchEngine.class).to(ResearchEngineImpl.class);
		bind(ResearchEngine.Display.class).to(ResearchEngineView.class);
		
		/* Chronology */
		
		bind(ChronologyModule.class).to(ChronologyModuleImpl.class);
		bind(ChronologyModule.Display.class).to(ChronologyModuleView.class);
		
		bind(ChronoBigFigure.class).to(ChronoBigFigureImpl.class);
		bind(ChronoBigFigure.Display.class).to(ChronoBigFigureView.class);
		
		bind(ChronoDate.class).to(ChronoDateImpl.class);
		bind(ChronoDate.Display.class).to(ChronoDateView.class);
		
		bind(WarPeriod.class).to(WarPeriodImpl.class);
		bind(WarPeriod.Display.class).to(WarPeriodView.class);
		
		bind(GouvPeriod.class).to(GouvPeriodImpl.class);
		bind(GouvPeriod.Display.class).to(GouvPeriodView.class);
		
		bind(EraPeriod.class).to(EraPeriodImpl.class);
		bind(EraPeriod.Display.class).to(EraPeriodView.class);
		
		bind(ReligionPeriod.class).to(ReligionPeriodImpl.class);
		bind(ReligionPeriod.Display.class).to(ReligionPeriodView.class);
		
		/* Genealogy */
		
		bind(GenealogyModule.class).to(GenealogyModuleImpl.class);
		bind(GenealogyModule.Display.class).to(GenealogyModuleView.class);
		
		bind(GeneaLine.class).to(GeneaLineImpl.class);
		bind(GeneaLine.Display.class).to(GeneaLineView.class);
		
		bind(UnknownGeneration.class).to(UnknownGenerationImpl.class);
		bind(UnknownGeneration.Display.class).to(UnknownGenerationView.class);
		
		bind(BasicGeneaNode.class).to(BasicGeneaNodeImpl.class);
		bind(BasicGeneaNode.Display.class).to(BasicGeneaNodeView.class);
		
		bind(JediGeneaNode.class).to(JediGeneaNodeImpl.class);
		bind(JediGeneaNode.Display.class).to(JediGeneaNodeView.class);
		
		/* Galaxy */
		
		bind(GalaxyModule.class).to(GalaxyModuleImpl.class);
		bind(GalaxyModule.Display.class).to(GalaxyModuleView.class);
		
		bind(GalaxyText.class).to(GalaxyTextImpl.class);
		bind(GalaxyText.Display.class).to(GalaxyTextView.class);
		
		bind(GalaxyChronology.class).to(GalaxyChronologyImpl.class);
		bind(GalaxyChronology.Display.class).to(GalaxyChronologyView.class);
		
		bind(GalaxyChronologyPeriodDate.class).to(GalaxyChronologyPeriodDateImpl.class);
		bind(GalaxyChronologyPeriodDate.Display.class).to(GalaxyChronologyPeriodDateView.class);
		
		bind(GalaxyChronologyCursor.class).to(GalaxyChronologyCursorImpl.class);
		bind(GalaxyChronologyCursor.Display.class).to(GalaxyChronologyCursorView.class);
		
		bind(Road.class).to(RoadImpl.class);
		bind(Road.Display.class).to(RoadView.class);
		
		bind(Territory.class).to(TerritoryImpl.class);
		bind(Territory.Display.class).to(TerritoryView.class);
		
		bind(TerritoryTitle.class).to(TerritoryTitleImpl.class);
		bind(TerritoryTitle.Display.class).to(TerritoryTitleView.class);
		
		bind(ShowPlanetesButton.class).to(ShowPlanetesButtonImpl.class);
		bind(ShowPlanetesButton.Display.class).to(ShowPlanetesButtonView.class);
		
		bind(ShowTerritoriesButton.class).to(ShowTerritoriesButtonImpl.class);
		bind(ShowTerritoriesButton.Display.class).to(ShowTerritoriesButtonView.class);
		
		bind(ShowChronologyButton.class).to(ShowChronologyButtonImpl.class);
		bind(ShowChronologyButton.Display.class).to(ShowChronologyButtonView.class);
		
		bind(Planete.class).to(PlaneteImpl.class);
		bind(Planete.Display.class).to(PlaneteView.class);
		
		/* Column */
		
		bind(ColumnContainer.class).to(ColumnContainerImpl.class);
		bind(ColumnContainer.Display.class).to(ColumnSectionView.class);
		
		bind(ColumnImage.class).to(ColumnCommentImpl.class);
		bind(ColumnImage.Display.class).to(ColumnCommentView.class);
		
		bind(Comment.class).to(CommentImpl.class);
		bind(Comment.Display.class).to(CommentView.class);

		bind(ColumnDetail.class).to(ColumnDetailImpl.class);
		bind(ColumnDetail.Display.class).to(ColumnDetailView.class);
	}
}
