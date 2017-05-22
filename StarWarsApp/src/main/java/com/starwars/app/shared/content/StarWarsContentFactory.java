package com.starwars.app.shared.content;

import com.starwars.app.shared.AppFactory;
import com.starwars.app.shared.ElementInfo;
import com.starwars.app.client.StarWarsApp;
import com.starwars.app.client.paper.presenter.DescriptionItem;
import com.starwars.app.shared.ElementInfo.ElementColor;

public class StarWarsContentFactory {
	public static ElementInfo getGuerresYuuzhanVongLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Belligérants", "n", "Yuuzhan-Vong, Alliance Galactique, Vestiges de l'Empire, Nouvel Ordre Jedi", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Évènement déclencheur", "B", "Prise de Helska IV", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Évènements de fin", "F", "Bataille de Coruscant (nouvelle Yuuzhan'Tar), mort du Seigneur Suprême Shimrra", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Conséquences", "J", "Guerre la plus meurtrière de toute l'histoire, 375 billions de morts, plusieurs planètes inhabitables, plusieurs espèces disparues", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Guerres Yuuzhan Vong",
					new String[]{"Guerres Yuuzhan Vong", "guerres Yuuzhan-Vong", "guerres Yuuzhan Vong", "guerres Vong"}, 
					"Cette guerre qui s'étendit sur 5 années fut le conflit le plus dévastateur de l'histoire de la galaxie.",
					"Cette guerre qui s'étendit sur 5 années fut le conflit le plus dévastateur de l'histoire de la galaxie.",
					"vongwars",
					25,
					30,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.orange,
					"logovongwar",
					"vongwars1",
					"maravong",
					"vongwars3");
	}

	public static ElementInfo getCrisedeCaamasLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Crise de Caamas",
					new String[]{"Crise de Caamas", "documents de Caamas"}, 
					"La crise du Document de Caamas fut une période de quasi-guerre civile qui faillit détruire la nouvelle République.",
					"",
					"caamasdoc",
					19,
					19,
					null,
					ElementColor.blue,
					"caamasdoc1",
					"caamasdoc2",
					"caamasdoc4");
	}

	public static ElementInfo getCrisedelaFlotteNoireLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Crise de la Flotte Noire",
					new String[]{"Crise de la Flotte Noire"}, 
					"Cette crise débuta durant une période de paix pour la Nouvelle République où des forces Yevethan se sont emparées d'une flotte impériale afin de terrasser tout non-Yevethan. ",
					"",
					"blackfleet",
					16,
					17,
					null,
					ElementColor.blue,
					"blackfleet1",
					"blackfleet2",
					"blackfleet3");
	}

	public static ElementInfo getGuerredelEssaimLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Belligérants", "n", "Empire Chiss, Killiks, Alliance Galactique, Nouvel Ordre Jedi", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Évènements déclencheurs", "B", "Prise de controle de l'ensemble des colonies Killik par le Jedi Raynar Thul, entrée en guerre avec l'Empire Chiss", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Évènement de fin", "F", "Arrestation de Raynar Thul", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Conséquences", "J", "Paix durable entre l'Empire Chiss, les Killiks et l'Alliance Galactique", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Guerre de l'Essaim",
					new String[]{"Guerre de l'Essaim", "guerre de l'Essaim", "guerres de l'Essaim"}, 
					"Conflit qui faillit précipiter une nouvelle fois la Galaxie dans le chaos après la Guerre contre les Yuuzhan Vong.",
					"",
					"swarmwars",
					36,
					36,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.orange,
					"logoswarmwar",
					"swarmwar2");
	}

	public static ElementInfo getSecondGrandSchismeLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Autre nom", "C", "Cent ans d'Obscurité", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Belligérants", "n", "Ordre Jedi, Jedi Noirs", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Évènement déclencheur", "B", "Scission dans l'Ordre Jedi", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Évènement de fin", "F", "Bataille de Corbos", "");
		DescriptionItem lDescriptionItem4 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem4.init("Conséquences", "J", "Bannissement des Jedi Noirs, arrivée des Jedi Noirs sur Korriban, découverte de la race des Sith", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Second Grand Schisme",
					new String[]{"Second Grand Schisme"}, 
					"Les Cents Ans d'Obscurité désigne le Second Grand Schisme qui aboutit à la découverte des Sith sur Korriban.",
					"",
					"secondgreatschisme",
					-7003,
					-6900,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3, 
						lDescriptionItem4}, 
					ElementColor.orange,
					"logosecondgreatschisme",
					"jediexile");
	}

	public static ElementInfo get2dGuerreCivileGalactiqueLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Belligérants", "n", "Confédération Corelienne, Alliance Galactique, Nouvel Ordre Jedi", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Évènement déclencheur", "B", "Sission du secteur Corellia à l'Alliance Galactique", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Évènements de fin", "F", "Mort de Dark Caedus", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Conséquences", "J", "Négociations de paix entre la Confédération et l'Alliance Galactique, exil de Luke et Ben Skywalker", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"2d Guerre Civile Galactique",
					new String[]{"2d Guerre Civile Galactique", "Seconde Guerre Civile Galactique", "seconde guerre civile galactique", "Seconde guerre civile Galactique"}, 
					"La Seconde Guerre Civile Galactique, déclenchée par l'insurrection de Corellia, déchira l'Alliance Galactique menée par Jacen Solo.",
					"",
					"secondcivilwars",
					40,
					41,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.orange,
					"logosecondcivilwar",
					"darkcaedus2",
					"jainacaedus");
	}

	public static ElementInfo getNouvellesGuerresSithLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Belligérants", "n", "Seigneurs Sith indépendants, Ordre Sith, Confrérie des Ténèbres, Mandaloriens, République Galactique, Ordre Jedi", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Évènements déclencheurs", "B", "Schisme au sein de l'Ordre Jedi, fondation du Nouvel Empire Sith", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Évènement de fin", "F", "Septieme bataille de Ruusan", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Conséquences", "J", "Eradication supposée de tous les Sith, établissement de la Règle des Deux par Dark Bane, création de la Vallée des Jedi, Réforme de Ruusan", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nouvelles Guerres Sith",
					new String[]{"Nouvelles Guerres Sith"}, 
					"Conflict extrêmement long opposant l'Ancienne République aux Seigneurs Sith qui vit presque l'anéantissement total de ces derniers.",
					"",
					"newsithwars",
					-2000,
					-1000,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.orange,
					"logonewsithwar",
					"newsithwars2",
					"darkbrotherhood2");
	}

	public static ElementInfo getGuerresMandaloriennesLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Belligérants", "n", "Mandaloriens (manipulés par l'Empire Sith actuel), République Galactique, Revanchistes (Ordre Jedi)", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Évènements déclencheurs", "B", "Ambition démesurée de Mandalore l'Ultime, volonté de l'Empereur d'affaiblir indirectement la République Galactique", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Évènement de fin", "F", "Bataille de Malachor V", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Conséquence", "J", "Effondrement de l'armée mandalorienne", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Guerres Mandaloriennes",
					new String[]{"Guerres Mandaloriennes", "guerres Mandaloriennes"}, 
					"Cette guerre fut possible suite au rassemblant des clans mandaloriens sous l'égide de Mandalore l'Ultime. Ce dernier souhaitait se venger du sang mandalorien versé durant la Grande Guerre Sith.",
					"",
					"mandalorianwars",
					-3976,
					-3960,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.orange,
					"logomandowar",
					"mandalorianwar2");
	}

	public static ElementInfo getGuerreCiviledesJediLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Autre nom", "C", "Seconde guerre des Sith", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Belligérants", "n", "Empire de Revan, République Galactique, Ordre Jedi", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Évènements déclencheurs", "B", "Chûte du coté obscur de Revan et Malak, capture de la Forge Stellaire", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Évènements de fin", "F", "Bataille de la Forge Stellaire", "");
		DescriptionItem lDescriptionItem4 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem4.init("Conséquences", "J", "Ordre Jedi très réduit, Dark Revan capturé, mort de Dark Malak", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Guerre Civile des Jedi",
					new String[]{"Guerre Civile des Jedi"}, 
					"Cette guerre opposa les armées de Dark Revan créée par la Forge Stellaire et la République soutenu par l'Ordre Jedi.",
					"",
					"jedicivilwar",
					-3959,
					-3956,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3, 
						lDescriptionItem4}, 
					ElementColor.orange,
					"logojediwar",
					"revanmalakvitiate",
					"revanbastila",
					"starforgebattle");
	}

	public static ElementInfo getGuerreSithoImperialeLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Belligérants", "n", "Sith Unique, Nouvel Empire Galactique, Alliance Galactique, Nouvel Ordre Jedi", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Évènement déclencheur", "B", "Sabotage par les Sith du plan de restauration des planètes endommagées par les Yuuzhan-Vong", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Évènements de fin", "F", "Bataille de Caamas, coup d'état de Dark Krayt", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Conséquences", "J", "Effondrement de l'Alliance Galactique, Destruction du temple Jedi d'Ossus, Alliance Galactique et Empire légitime en fuite", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Guerre Sitho-Impériale",
					new String[]{"Guerre Sitho-Impériale", "Guerre Impérialo-Sith", "Guerre Sith-Impériale", "Guerre Sith-impériale", "guerre sith-impériale", "guerres sith-impériales", "Guerres Sitho-Impériales "}, 
					"Guerre édifiée par Dark Krayt dans le but de prendre le pouvoir. Elle opposa le Nouvel Empire Galactique contrôlé par des Moffs ambitieux et le Sith Unique contre l'Alliance Galactique et les Jedi.",
					"",
					"imperialsithwar",
					127,
					130,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.orange,
					"logosithoimperialwar",
					"kolfight",
					"kraytthrone");
	}

	public static ElementInfo get1rGuerreCivileImperialeLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Autre nom", "C", "Guerre de purification", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Belligérants", "n", "Seigneurs de Guerre impériaux", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Évènements déclencheurs", "B", "Bataille d'Endor, mort de l'Empereur Palpatine", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Évènement de fin", "F", "Massacre des Seigneurs de Guerre par l'Amirale Daala", "");
		DescriptionItem lDescriptionItem4 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem4.init("Conséquence", "J", "Unification des factions impériales en Vestiges de l'Empire", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"1r Guerre Civile Impériale",
					new String[]{"1r Guerre Civile Impériale", "Première Guerre Civile Impériale", "première Guerre Civile Impériale", "Première guerre civile Impériale"}, 
					"Guerre qui éclata suite à la mort de l'Empereur Palpatine. Les dignitaires de l'Empire devinrent des Seigneurs de Guerre indépendantistes et tournés vers eux-mêmes.   ",
					"",
					"firstimperialcivilwar",
					4,
					12,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3, 
						lDescriptionItem4}, 
					ElementColor.orange,
					"firstimperialcivilwar1",
					"thrawnvador",
					"deathstar22",
					"imperialcivilwar2",
					"thrawn2",
					"palpatinereborn",
					"carnorjax2",
					"imperialcivilwarend");
	}

	public static ElementInfo get2dGuerreCivileImperialeLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Belligérants", "n", "Empire Sith de Dark Krayt, Vestiges de l'Alliance Galactique, Empire en Exil, Nouvel Ordre Jedi", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Évènement déclencheur", "B", "Tentative d'assasinat de l'Empereur Roan Fel par Dark Krayt", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Évènements de fin", "F", "Bataille de Coruscant, Mort de l'Empereur autoproclamé Dark Krayt et de Roan Fel", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Conséquences", "J", "Dislocation du Sith Unique", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"2d Guerre Civile Impériale",
					new String[]{"2d Guerre Civile Impériale", "Seconde Guerre Civile Impériale", "seconde Guerre Civile Impériale", "seconde Guerre civile Impériale"}, 
					"Conflit majeur qui opposa les Vestiges de l'Alliance Galactique, l'Ordre Jedi et l'Empire de Roan Fel poussé à l'exil face au Sith Unique Dark Krayt contrôlant l'Empire Galactique.",
					"",
					"imperialcivilwars",
					130,
					138,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.orange,
					"logoimperialcivilwar",
					"kraytbetrayal",
					"kraytthrone",
					"roanfel3",
					"secondimperialcivilwar2",
					"secondimperialcivilwarend");
	}

	public static ElementInfo getGuerredelHyperespaceLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Belligérants", "n", "Empire Sith, République Galactique, Ordre Jedi, Système Teta", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Évènement déclencheur", "B", "Découverte de la République par les Sith", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Évènement de fin", "F", "Bataille en Espace Sith", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Conséquences", "J", "Quasi-effondrement de l'Empire Sith, exil de Naga Sadow sur Yavin IV, fuite du Seigneur Vitiate sur Dromund Kaas", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Guerre de l'Hyperespace",
					new String[]{"Guerre de l'Hyperespace", "Grande Guerre de l'Hyperespace", "grande Guerre de l'Hyperespace"}, 
					"Première guerre de l'Ordre Sith à l'encontre de la République en 5000 av. BY.  ",
					"",
					"hyperespacewar",
					-5000,
					-5000,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.orange,
					"logohyperespacewar",
					"sadowkressh",
					"hyperespacewar2",
					"hyperespacewar3");
	}

	public static ElementInfo getGrandeGuerredesSithLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Autre nom", "C", "Guerre d'Exar Kun", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Belligérants", "n", "Krath, Mandaloriens, République Galactique, Ordre Sith, Ordre Jedi", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Évènements déclencheurs", "B", "Exar Kun proclamé Seigneur Noir des Sith, alliance avec Ulic Qel-Droma et le Krath", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Évènement de fin", "F", "Bataille de Yavin IV", "");
		DescriptionItem lDescriptionItem4 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem4.init("Conséquences", "J", "Effondrement du Krath, exil d'Ulic Qel-Droma, mort physique d'Exar Kun", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Grande Guerre des Sith",
					new String[]{"Grande Guerre des Sith"}, 
					"Guerre enclenchée par Exar Kun et son disciple Ulic Qel-Droma. Les Sith s'allièrent aux Mandaloriens et au Krath afin de défaire la République.",
					"",
					"greatsithwar",
					-3996,
					-3996,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3, 
						lDescriptionItem4}, 
					ElementColor.orange,
					"logogreatsithwar",
					"exarkunsith",
					"krath2");
	}

	public static ElementInfo getConflitsdAlsakanLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Belligérants", "n", "République de Coruscant, Planète d'Alsakan, Hénémonie Corellienne", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Évènement déclencheur", "B", "Blocus des voies commerciales à l'Hégémonie Corellienne par Alsakan", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Évènement de fin", "F", "Paix proposée par le Prince Jonash Solo", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Conflits d'Alsakan",
					new String[]{"Conflits d'Alsakan"}, 
					"Ensemble de dix-sept guerres qui opposèrent la République Galactique à la planète Alsakan pour le contrôle des Mondes du Noyau et de la Zone en Expansion. ",
					"",
					"alsakanconflict",
					-17018,
					-3017,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2}, 
					ElementColor.orange,
					"alsakanconflict1");
	}

	public static ElementInfo get2dGrdeGuerreGalactiqueLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Belligérants", "n", "Ancien Empire Sith reconstitué, Ordre Sith, République Galactique, Ordre Jedi", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Évènement déclencheur", "B", "Invasion de Taris par l'Empire Sith", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Évènement de fin", "F", "Arrivée de l'Empire Eternel", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Conséquence", "J", "Disparition de l'Empire Sith unifié", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"2d Grde Guerre Galactique",
					new String[]{"2d Grde Guerre Galactique", "Seconde Grande Guerre Galactique"}, 
					"Guerre ineluctable faisant suite à la Guerre Froide Galactique entre l'Empire Sith reconstitué et la République Galactique. Elle sera stopée nette par l'invasion de l'Empire Eternel.",
					"",
					"secondgreatgalacticwar",
					-3642,
					-3640,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.orange,
					"secondgreatgalacticwar1");
	}

	public static ElementInfo get1rGrdeGuerreGalactiqueLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Belligérants", "n", "Ancien Empire Sith Reconstitué (jusqu'à présent resté secret), Mandaloriens, Ordre Sith, République Galactique, Ordre Jedi", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Évènements déclencheurs", "B", "Attaque du bras de Tingel, attaque de Korriban", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Évènements de fin", "F", "Bataille de Coruscant, défaite de la République", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Conséquences", "J", "Traité de Coruscant, destruction du temple Jedi de Coruscant, fuite des Jedi sur Tython, perte de plusieurs territoires républicains", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"1r Grde Guerre Galactique",
					new String[]{"1r Grde Guerre Galactique", "Grande Guerre Galactique"}, 
					"Campagne lancée par l'Empereur Noir des Sith Vitiate contre l'Ancienne République.",
					"",
					"greatgalacticwar",
					-3681,
					-3653,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.orange,
					"logogreatwar",
					"greatgalacticwar1",
					"greatgalacticwar3",
					"greatgalacticwar4",
					"greatgalacticwar5");
	}

	public static ElementInfo getPremierGrandSchismeLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Belligérants", "n", "Ordre Jedi, Légion de Lettow, Suivants de Palawa", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Évènement déclencheur", "B", "Scission dans l'Ordre Jedi", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Évènements de fin", "F", "Bataille de Columus", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Conséquences", "J", "Défaite des premiers Jedi Noirs", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Premier Grand Schisme",
					new String[]{"Premier Grand Schisme"}, 
					"Conflit qui opposa les Jedi aux armées de Xendor, l'un des premiers Jedi noirs. ",
					"",
					"firstgreatschisme",
					-24500,
					-24500,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.orange,
					"logofirstgreatschisme",
					"firstgreatschism2");
	}

	public static ElementInfo get1rGuerreCivileGalactiqueClassic() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Belligérants", "n", "Alliance Rebelle, Empire Galactique", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Évènement déclencheur", "B", "Formation de l'Alliance Rebelle contre le joug de l'Empire", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Évènements de fin", "F", "Bataille d'Endor, mort de l'Empereur Palpatine", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Conséquences", "J", "Flotte Impériale extrêmement réduite, morts de nombreux dignitaires imperiaux", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"1r Guerre Civile Galactique",
					new String[]{"1r Guerre Civile Galactique", "Première Guerre Civile Galactique", "première Guerre Civile Galactique", "Première Guerre Civile galactique"}, 
					"La Guerre Civile Galactique fut une période troublée qui secoua la galaxie pendant plus de vingt ans et vit la chute de l'Empire Galactique.",
					"",
					"firstcivilwarclassic",
					-2,
					4,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.orange,
					"logofirstcivilwar",
					"yavinbattle",
					"deathstar22");
	}

	public static ElementInfo get1rGuerreCivileGalactiqueLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Belligérants", "n", "Alliance Rebelle (puis Nouvelle République), Empire Galactique (puis Vestige de l'Empire)", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Évènement déclencheur", "B", "Formation de l'Alliance Rebelle contre le joug de l'Empire sur Kashyyyk", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Évènement de fin", "F", "Traité du Chimaera, ratifiant la paix entre les Vestiges de l'Empire et la Nouvelle République", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Conséquences", "J", "Flotte Impériale extrêmement réduite, morts de nombreux dignitaires imperiaux, destructions de plusieurs planètes", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"1r Guerre Civile Galactique",
					new String[]{"1r Guerre Civile Galactique", "Première Guerre Civile Galactique", "première Guerre Civile Galactique", "Première Guerre Civile galactique"}, 
					"La Guerre Civile Galactique fut une période troublée qui secoua la galaxie pendant plus de vingt ans et vit la chute de l'Empire Galactique.",
					"",
					"firstcivilwarlegends",
					-2,
					19,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.orange,
					"logofirstcivilwar",
					"palpatinestarkiller",
					"rebelborn",
					"yavinbattle",
					"deathstar22",
					"imperialcivilwar2",
					"thrawn3",
					"carnorjax2",
					"pellaeonpeace");
	}

	public static ElementInfo getGuerredesClonesClassic() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Belligérants", "n", "Confédération des Systèmes Indépendants, Ordre Sith (de façon cachée), République Galactique, Ordre Jedi", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Évènements déclencheurs", "B", "Sécession de plusieurs systèmes de la République, Bataille de Géonosis", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Évènements de fin", "F", "Mort du Général Grievous, coup d'état du Chancelier Suprême Palpatine", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Conséquences", "J", "Ordre 66, quasi-extinction de tous les Jedi, la République se réforme en Empire", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Guerre des Clones",
					new String[]{"Guerre des Clones"}, 
					"Guerre ravageuse qui dura 3 ans qui vit affronter une République vieillissante face à une Alliance de systèmes indépendantistes et de conglomérats industriels surpuissants.",
					"",
					"clonewarsclassic",
					-22,
					-19,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.orange,
					"logoclonewar",
					"geonosisbattle",
					"ahsoka1",
					"luminaraunduli3",
					"grievouscoruscant",
					"palpatineorder66");
	}

	public static ElementInfo getGuerredesClonesLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Belligérants", "n", "Confédération des Systèmes Indépendants, Ordre Sith (de façon cachée), République Galactique, Ordre Jedi", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Évènements déclencheurs", "B", "Sécession de plusieurs systèmes de la République, Bataille de Géonosis", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Évènements de fin", "F", "Mort du Général Grievous, coup d'état du Chancelier Suprême Palpatine", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Conséquences", "J", "Ordre 66, quasi-extinction de tous les Jedi, la République se réforme en Empire", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Guerre des Clones",
					new String[]{"Guerre des Clones"}, 
					"Guerre ravageuse qui dura 3 ans qui vit affronter une République vieillissante face à une Alliance de systèmes indépendantistes et de conglomérats industriels surpuissants.  ",
					"",
					"clonewarslegends",
					-22,
					-19,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.orange,
					"logoclonewar",
					"geonosisbattle",
					"quinlanvosdooku",
					"sevrancetann2",
					"arcsoldier2",
					"tanksismique1",
					"jabiim2",
					"grievouscoruscant",
					"palpatineorder66");
	}

	public static ElementInfo getGuerreFroideGalactiqueLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Belligérants", "n", "Ancien Empire Sith reconstitué, Ordre Sith, République Galactique, Ordre Jedi", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Évènement déclencheur", "B", "Traité de Coruscant", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Évènements de fin", "F", "Assassinats de généraux Républicains", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Conséquence", "J", "Galaxie divisée", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Guerre Froide Galactique",
					new String[]{"Guerre Froide Galactique", "guerre froide", "Guerre Froide"}, 
					"Cette guerre correspond à la période de tension palpable qu'il y a eu entre la République Galactique et l'Ancien Empire Sith reconstitué suite au traité de Coruscant. ",
					"",
					"coldwar",
					-3653,
					-3642,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.orange,
					"logocoldwar",
					"coldwar2");
	}

	public static ElementInfo getForgeStellaireLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Forge Stellaire",
					new String[]{"Forge Stellaire"}, 
					"La Forge Stellaire fut un puissant artefact Rakata utilisé par les Sith Dark Revan et Dark Malak afin de constituer une grande marine spatiale.",
					"",
					"forgestellaire",
					0,
					0,
					null,
					ElementColor.blue,
					"forgestellaire1",
					"starforgebattle");
	}

	public static ElementInfo getClasseDerriphanLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Derriphan",
					new String[]{"Classe Derriphan", "Derriphan"}, 
					"Cuirassé Sith qui participa à de nombreuses de guerres au cours de plusieurs millénaires pour l'Empire Sith.",
					"",
					"derriphan",
					0,
					0,
					null,
					ElementColor.blue,
					"derriphan1",
					"derriphan2");
	}

	public static ElementInfo getIntercepteurFuryLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Intercepteur Fury",
					new String[]{"Intercepteur Fury", "classe Fureur"}, 
					"Vaisseau employé comme intercepteur et transport personnel de dignitaires Sith durant Grande Guerre Galactique et la Guerre Froide. ",
					"",
					"furyinterceptor",
					0,
					0,
					null,
					ElementColor.blue,
					"fury1",
					"fury2");
	}

	public static ElementInfo getChasseurAnnihilateurLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Chasseur Annihilateur",
					new String[]{"Chasseur Annihilateur", "classe Annihilateur", "chasseur Annihilateur"}, 
					"Vaisseau de chasse de la flotte personnelle de Dark Krayt.",
					"",
					"annihilatorfighter",
					0,
					0,
					null,
					ElementColor.blue,
					"annihilatorfighter1",
					"annihilatorfighter2");
	}

	public static ElementInfo getSpheredemeditationLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sphère de méditation",
					new String[]{"Sphère de méditation"}, 
					"Vaisseau unique utilisé par Naga Sadow afin amplifier ses pouvoirs durant la Grande Guerre de l'Hyperespace.",
					"",
					"meditationsphere",
					0,
					0,
					null,
					ElementColor.blue,
					"sithsphere1",
					"sithsphere2");
	}

	public static ElementInfo getClasseDragonLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Dragon",
					new String[]{"Classe Dragon", "croiseur Dragon", "Croiseur de classe Dragon", "Croiseurs de classe Dragon", "Croiseur de Classe Dragon", "Croiseurs de Classe Dragon "}, 
					"Croiseur Sith de la flotte personnelle de Dark Krayt.",
					"",
					"sddragon",
					0,
					0,
					null,
					ElementColor.blue,
					"sddragon1",
					"sddragon2");
	}

	public static ElementInfo getClasseCenturionLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Centurion",
					new String[]{"Classe Centurion"}, 
					"Imposant modèle de croiseur qu'utilisait l'Empire Sith de Dark Revan contre la République.",
					"",
					"sdcenturion",
					0,
					0,
					null,
					ElementColor.blue,
					"sdcenturion1");
	}

	public static ElementInfo getClasseInterdicteurLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Interdicteur",
					new String[]{"Classe Interdicteur", "classse Interdicteur"}, 
					"Le vaisseau de guerre de classe Interdictor fut un puissant vaisseau de combat de la flotte sith de Dark Revan et de Dark Malak durant la Guerre Civile des Jedi.",
					"",
					"sdinterdictor",
					0,
					0,
					null,
					ElementColor.blue,
					"sdinterdictor1",
					"sdinterdictor2");
	}

	public static ElementInfo getClasseHarrowerLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Harrower",
					new String[]{"Classe Harrower", "Harrower"}, 
					"Le cuirassé Harrower fut un vaisseau de combat de l'armada de l'Ancien Empire Sith reconsitué qui fut notamment déployé durant la Grande Guerre Galactique.",
					"",
					"sdharrower",
					0,
					0,
					null,
					ElementColor.blue,
					"sdharrower1",
					"sdharrower2");
	}

	public static ElementInfo getChasseurSithLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Chasseur Sith",
					new String[]{"Chasseur Sith"}, 
					"Le chasseur Sith est un chasseur monoplace utilisé 4 000 ans avant l'Empire Galactique par les Sith.",
					"",
					"sithfighter",
					0,
					0,
					null,
					ElementColor.blue,
					"sithfighter1");
	}

	public static ElementInfo getCimeterreSithLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Cimeterre Sith",
					new String[]{"Cimeterre Sith"}, 
					"Construit à la demande de Dark Sidious par Republic Sienar Systems dans le plus grand secret, il fut offert à Dark Maul comme vaisseau personnel.",
					"",
					"cimeterre",
					0,
					0,
					null,
					ElementColor.blue,
					"cimeterre1",
					"cimeterre2");
	}

	public static ElementInfo getEbonHawkLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ebon Hawk",
					new String[]{"Ebon Hawk"}, 
					"L'Ebon Hawk fut un cargo fortement modifié qui servit durant la Guerre Civile des Jedi. Il eut comme propriétaire les célèbres Chevaliers Jedi Revan et l'Exilée.",
					"",
					"ebonhawk",
					0,
					0,
					null,
					ElementColor.blue,
					"ebonhawk1");
	}

	public static ElementInfo getClasseInexpugnableLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Inexpugnable",
					new String[]{"Classe Inexpugnable", "Inexpugnable"}, 
					"Cette classe de destroyer fut l'une des plus grosse de la Marine Républicaine. Elle servit majoritairement durant les Guerres Mandaloriennes et Civile des Jedi.",
					"",
					"sdinexpugnable",
					0,
					0,
					null,
					ElementColor.blue,
					"sdinexpugnable1",
					"sdinexpugnable2");
	}

	public static ElementInfo getNavetteMinistryLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Navette Ministry",
					new String[]{"Navette Ministry"}, 
					"Navette multifonction utilisée pendant la période des Chevaliers de l'Ancienne République.",
					"",
					"navetteministry",
					0,
					0,
					null,
					ElementColor.blue,
					"navetteministry1");
	}

	public static ElementInfo getClasseHammerheadLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Hammerhead",
					new String[]{"Classe Hammerhead"}, 
					"Le croiseur de classe Hammerhead fut un célèbre modèle de vaisseau de combat de la République qui participa aux Guerres Mandaloriennes et à la Guerre Civile des Jedi.",
					"",
					"hammerhead",
					0,
					0,
					null,
					ElementColor.blue,
					"endar1");
	}

	public static ElementInfo getClasseRendiliLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Rendili",
					new String[]{"Classe Rendili"}, 
					"Le Croiseur lourd de classe Rendili est un croiseur de conception républicaine, antérieur à la Guerre des Clones, qui fut utilisé jusque sous l'Empire Galactique par la Marine Impériale.",
					"",
					"cuirasse",
					0,
					0,
					null,
					ElementColor.blue,
					"cuirasse1");
	}

	public static ElementInfo getClasseAcclamatorICommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Acclamator-I",
					new String[]{"Classe Acclamator-I", "Acclamator"}, 
					"Le transport transgalactique de classe Acclamator fut un transport de troupes massif républicain et l'ancêtre du destroyer stellaire de classe Impérial.",
					"",
					"sdacclamatormk1",
					0,
					0,
					null,
					ElementColor.blue,
					"sdacclamator1",
					"sdacclamator2");
	}

	public static ElementInfo getClasseVenatorCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Venator",
					new String[]{"Classe Venator", "Venator"}, 
					"Le Star Destroyer de classe Venator est un destroyer de la République Galactique alliant puissance et capacité de transport. Il fut déployé durant la Guerre des Clones.",
					"",
					"sdvenator",
					0,
					0,
					null,
					ElementColor.blue,
					"sdvenator1",
					"sdvenator2");
	}

	public static ElementInfo getCannoniereTIOBACommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Cannonière TIO-BA",
					new String[]{"Cannonière TIO-BA", "TIO-BA"}, 
					"La canonnière d'assaut TIO-BA est un vaisseau de déploiement de troupes de l'Armée Clone.",
					"",
					"tioba",
					0,
					0,
					null,
					ElementColor.blue,
					"canoniererep1",
					"canoniererep2");
	}

	public static ElementInfo getClasseArquitensClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Arquitens",
					new String[]{"Classe Arquitens", "Arquitens"}, 
					"Produit par Kuat Drive Yards, la Croiseur Léger Arquitens fut un vaisseau de soutien employé par la Grande Armée de la République.",
					"",
					"sdarquitens",
					0,
					0,
					null,
					ElementColor.blue,
					"sdarquitens1");
	}

	public static ElementInfo getIntercepteurETACommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Intercepteur ETA",
					new String[]{"Intercepteur ETA", "intercepteur Eta-2"}, 
					"L'Intercepteur Jedi Actis Eta-2 est un modèle de chasseur Jedi qui fut développé par Kuat et utilisé par l'Ordre Jedi durant la Guerre des Clones.",
					"",
					"etainterceptor",
					0,
					0,
					null,
					ElementColor.blue,
					"etainterceptor1",
					"etainterceptor2");
	}

	public static ElementInfo getCorvetteCR70Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Corvette CR-70",
					new String[]{"Corvette CR-70"}, 
					"La corvette CR70 est un version non armée de la célèbre corvette CR90 de la Corporation Technique Corellienne.",
					"",
					"corvettecr70",
					0,
					0,
					null,
					ElementColor.blue,
					"corvette2",
					"corvette1");
	}

	public static ElementInfo getEndarSpireLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Endar Spire",
					new String[]{"Endar Spire"}, 
					"L'Endar Spire fut un vaisseau Hammerhead détruit par les Sith de Dark Malak en orbite de Taris, lors de la Guerre Civile des Jedi.",
					"",
					"endarspire",
					0,
					0,
					null,
					ElementColor.blue,
					"endar1");
	}

	public static ElementInfo getCroiseurCR20Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Croiseur CR-20",
					new String[]{"Croiseur CR-20"}, 
					"Le Croiseur de classe Consulaire est un vaisseau diplomatique utilisé par la République et l'Ordre Jedi.",
					"",
					"cr20",
					0,
					0,
					null,
					ElementColor.blue,
					"croiseurrep1");
	}

	public static ElementInfo getVWingCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"V-Wing",
					new String[]{"V-Wing"}, 
					"Le chasseur V-wing Alpha-3 de classe Nimbus est un chasseur de soutien léger de l'Armée Clone.",
					"",
					"vwing",
					0,
					0,
					null,
					ElementColor.blue,
					"vwing2",
					"vwing1");
	}

	public static ElementInfo getNavetteThetaCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Navette Theta",
					new String[]{"Navette Theta"}, 
					"Navette de transport pour haut dignitaire, elle est l'ancêtre de la navette de classe Lambda.",
					"",
					"navettetheta",
					0,
					0,
					null,
					ElementColor.blue,
					"theta1",
					"theta2");
	}

	public static ElementInfo getChasseurCloneCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Chasseur Clone",
					new String[]{"Chasseur Clone"}, 
					"Chasseur léger employé à partir de la seconde année de Guerre des Clones par la République Galactique.",
					"",
					"clonefighter",
					0,
					0,
					null,
					ElementColor.blue,
					"clonefighter1");
	}

	public static ElementInfo getARC170Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"ARC-170",
					new String[]{"ARC-170"}, 
					"L'ARC-170 fut un chasseur républicain adapté à la reconnaissance, qui fut fréquemment utilisé pendant la Guerre des clones.",
					"",
					"arc170",
					0,
					0,
					null,
					ElementColor.blue,
					"arc1701",
					"arc1702");
	}

	public static ElementInfo getCroiseurViscountLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Croiseur Viscount",
					new String[]{"Croiseur Viscount", "Viscount"}, 
					"Ce croiseur lourd, conçu pour surclasser les vaisseaux de l'Empire fut deployé aux premiers jours de la guerre Yuuzhan Vong.",
					"",
					"croiseurviscount",
					0,
					0,
					null,
					ElementColor.blue,
					"sdviscount1");
	}

	public static ElementInfo getFregateTriScytheLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Frégate Tri-Scythe",
					new String[]{"Frégate Tri-Scythe", "Tri-Scythe"}, 
					"Frégate imposante dérivée du croiseur MC-104 Scythe. Elle fut majoritairement employée durant les conflits Sitho-Impériaux et la Seconde Guerre Civile Impériale.  ",
					"",
					"fregatescythe",
					0,
					0,
					null,
					ElementColor.blue,
					"fregatescythe1",
					"fregatescythe2");
	}

	public static ElementInfo getCroiseurMC104Legends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Croiseur MC-104",
					new String[]{"Croiseur MC-104", "MC-104"}, 
					"Vaisseau de guerre à forte puissance de feu, ce type de vaisseau fut le porteur étendart des Vestiges de l'Alliance durant la Seconde Guerre Civile Impériale.  ",
					"",
					"croiseurmc104",
					0,
					0,
					null,
					ElementColor.blue,
					"sdmc1041",
					"sdmc1042");
	}

	public static ElementInfo getCroiseurMC90Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Croiseur MC-90",
					new String[]{"Croiseur MC-90", "MC-90"}, 
					"Le Croiseur stellaire MC90 est le premier croiseur Mon Calamari entièrement voué au combat.",
					"",
					"croiseurmc90",
					0,
					0,
					null,
					ElementColor.blue,
					"croiseurmc901");
	}

	public static ElementInfo getCroiseurMC80Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Croiseur MC-80",
					new String[]{"Croiseur MC-80", "MC-80"}, 
					"Le Croiseur stellaire MC80 est le pivot de la flotte de l'Alliance Rebelle contre l'Empire Galactique.",
					"",
					"croiseurmc80",
					0,
					0,
					null,
					ElementColor.blue,
					"sdmc801");
	}

	public static ElementInfo getCroiseurMC40Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Croiseur MC-40",
					new String[]{"Croiseur MC-40"}, 
					"Le Croiseur léger MC40 est un croiseur léger utilisé pour appuyer les bâtiments lourds.",
					"",
					"croiseurmc40",
					0,
					0,
					null,
					ElementColor.blue,
					"sdmc401");
	}

	public static ElementInfo getCroiseurMC30Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Croiseur MC-30",
					new String[]{"Croiseur MC-30"}, 
					"Vaisseau redoutable Mon Cal, il peut, grâce à son armement de torpilles à protons réduire en morceaux des vaisseaux capitaux de fort tonnage.",
					"",
					"croiseurmc30",
					0,
					0,
					null,
					ElementColor.blue,
					"croiseurmc301");
	}

	public static ElementInfo getSpeederT47Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Speeder T-47",
					new String[]{"Speeder T-47", "T-47"}, 
					"Vaisseau remorqueur atmosphérique reconverti en vaisseau de combat par l'Alliance Rebelle. ",
					"",
					"speedert47",
					0,
					0,
					null,
					ElementColor.blue,
					"snowspeeder1",
					"snowspeeder2");
	}

	public static ElementInfo getXWingCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"X-Wing",
					new String[]{"X-Wing"}, 
					"Le X-Wing T-65 est le chasseur emblématique de supériorité spatiale qui fut utilisé par l'Alliance Rebelle durant la Guerre Civile.",
					"",
					"xwing",
					0,
					0,
					null,
					ElementColor.blue,
					"xwing1",
					"xwing2");
	}

	public static ElementInfo getYWingCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Y-Wing",
					new String[]{"Y-Wing"}, 
					"Le Y-Wing BTL est un chasseur-bombardier qui fut notamment utilisé par l'Alliance Rebelle durant la Guerre Civile contre l'Empire Galactique.",
					"",
					"ywing",
					0,
					0,
					null,
					ElementColor.blue,
					"ywing1",
					"ywing2");
	}

	public static ElementInfo getBWingCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"B-Wing",
					new String[]{"B-Wing"}, 
					"Le B-Wing est un chasseur-bombardier lourd qui entra en fonction dans l'Alliance Rebelle vers la fin de la Guerre Civile contre l'Empire Galactique.",
					"",
					"bwing",
					0,
					0,
					null,
					ElementColor.blue,
					"bwing2",
					"bwing1");
	}

	public static ElementInfo getAWingCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"A-Wing",
					new String[]{"A-Wing"}, 
					"L'intercepteur RZ-1 A-Wing, est un chasseur stellaire léger monoplace qui fut utilisé par l'Alliance Rebelle durant la Guerre Civile Galactique.",
					"",
					"awing",
					0,
					0,
					null,
					ElementColor.blue,
					"awing2",
					"awing1");
	}

	public static ElementInfo getFregateNebulonCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Frégate Nébulon",
					new String[]{"Frégate Nébulon"}, 
					"La Frégate Nébulon-B est vaisseau de soutien et d'escorte conçu par Kuat Drive Yards et qui fut utilisé par l'Alliance Rebelle.",
					"",
					"nebulon",
					0,
					0,
					null,
					ElementColor.blue,
					"nebulon1",
					"nebulon2");
	}

	public static ElementInfo getCrossfireLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Crossfire",
					new String[]{"Crossfire"}, 
					"Le chasseur CF9 Crossfire fut utilisé par la Fédération Galactique des Alliances Libres vers 130 ap. BY.",
					"",
					"crossfire",
					0,
					0,
					null,
					ElementColor.blue,
					"crossfire1");
	}

	public static ElementInfo getLeMynockLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Le Mynock",
					new String[]{"Le Mynock", "le Mynock", "au Mynock", "du Mynock", "du  Mynock", "Le Mynock"}, 
					"Vaisseau de transport de classe Helot utilisé par Cade Skywalker et ses compagnons pour leurs missions de piraterie et de contrebande.",
					"",
					"mynockship",
					0,
					0,
					null,
					ElementColor.blue,
					"mynockship1",
					"mynockship2");
	}

	public static ElementInfo getWildKarrdeLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Wild Karrde",
					new String[]{"Wild Karrde"}, 
					"Vaisseau-amiral du célèbre Talon Karrde et de son organisation. Il est peu armé mais ce défaut est pallié par un protection sensoriel ainsi qu'un bon confort.",
					"",
					"wildkarrde",
					0,
					0,
					null,
					ElementColor.blue,
					"wildkarrde1",
					"wildkarrde2");
	}

	public static ElementInfo getSlave1Classic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Slave 1",
					new String[]{"Slave 1"}, 
					"Le Slave 1, est un patrouilleur d'attaque de classe Firespray modifié ayant appartenu à Jango Fett puis à son fils adoptif, le chasseur de primes Boba Fett.",
					"",
					"slave1classic",
					0,
					0,
					null,
					ElementColor.blue,
					"slave12",
					"slave11");
	}

	public static ElementInfo getSlave1Legends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Slave 1",
					new String[]{"Slave 1"}, 
					"Le Slave 1, est un patrouilleur d'attaque de classe Firespray modifié ayant appartenu à Jango Fett puis à son fils adoptif, le chasseur de primes Boba Fett.",
					"",
					"slave1legends",
					0,
					0,
					null,
					ElementColor.blue,
					"slave12",
					"slave11");
	}

	public static ElementInfo getGhostClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ghost",
					new String[]{"Ghost"}, 
					"Ce Cargo léger VCX-100 modifié par Hera Syndulla fut utilisé par un groupe de rebelles originaires de Lothal contre l'autorité impériale. ",
					"",
					"ghost",
					0,
					0,
					null,
					ElementColor.blue,
					"ghost1",
					"ghost2");
	}

	public static ElementInfo getVoltCobraClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Volt Cobra",
					new String[]{"Volt Cobra"}, 
					"Le Volt Cobra était le vaisseau personnel de la contrebandière Sana Solo.",
					"",
					"volt",
					0,
					0,
					null,
					ElementColor.blue,
					"volt1",
					"volt2");
	}

	public static ElementInfo getUhumeleLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Uhumele",
					new String[]{"Uhumele"}, 
					"Vaisseau de plaisance servant de foyer à l'équipage de Schurk-Heren.",
					"",
					"uhumele",
					0,
					0,
					null,
					ElementColor.blue,
					"uhumele1");
	}

	public static ElementInfo getFauconMilleniumClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Faucon Millenium",
					new String[]{"Faucon Millenium"}, 
					"Le Faucon Millénium fut le vaisseau légendaire ayant appartenu à Han Solo et Lando Calrissian. Ce cargo YT-1300 est devenu un symbole pour l'Alliance Rebelle.",
					"",
					"fauconmilleniumclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"faucon1",
					"faucon2",
					"deathstar22");
	}

	public static ElementInfo getFauconMilleniumLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Faucon Millenium",
					new String[]{"Faucon Millenium"}, 
					"Le Faucon Millénium fut le vaisseau légendaire ayant appartenu à Han Solo et Lando Calrissian. Ce cargo YT-1300 est devenu un symbole pour l'Alliance Rebelle et la Nouvelle République.",
					"",
					"fauconmilleniumlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"faucon1",
					"faucon2",
					"deathstar22");
	}

	public static ElementInfo getLadyLuckLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Lady Luck",
					new String[]{"Lady Luck"}, 
					"Le Lady Luck était le vaisseau de luxe personnel de Lando Calrissian.",
					"",
					"ladyluck",
					0,
					0,
					null,
					ElementColor.blue,
					"ladyluck1",
					"ladyluck2");
	}

	public static ElementInfo getCanonGalactiqueLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Canon Galactique",
					new String[]{"Canon Galactique"}, 
					"Construit autour de Byss, cette superarme destructice fut la dernière créée par l'Empire Galactique.",
					"",
					"canongalactique",
					0,
					0,
					null,
					ElementColor.blue,
					"canongalactique1",
					"canongalactique2");
	}

	public static ElementInfo getBargeTitanCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Barge Titan",
					new String[]{"Barge Titan"}, 
					"Barge de déploiement de TB-TT et TS-TT impériaux utilisée sur les Super Star Destroyers.",
					"",
					"bargetitan",
					0,
					0,
					null,
					ElementColor.blue,
					"bargetitan1",
					"bargetitan2");
	}

	public static ElementInfo getLeTarkinLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Le Tarkin",
					new String[]{"Le Tarkin"}, 
					"Station de combat de l'Empire possédant une arme d'une force destructice. ",
					"",
					"letarkin",
					0,
					0,
					null,
					ElementColor.blue,
					"letarkin2",
					"letarkin1");
	}

	public static ElementInfo getClasseResurgentClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Resurgent",
					new String[]{"Classe Resurgent", "classe Resurgent"}, 
					"Grands vaisseaux de commandement, les Star Destroyers de classe Resurgent sont les premiers vaisseaux du Premier Ordre d'un nouveau type.  ",
					"",
					"sdresurgent",
					0,
					0,
					null,
					ElementColor.blue,
					"sdresurgent1",
					"sdresurgent2");
	}

	public static ElementInfo getClasseArdentLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Ardent",
					new String[]{"Classe Ardent", "classe ardent"}, 
					"Les Star Destroyer de classe Ardent sont des frégates bien armées employées sous le Nouvel Empire Galactique.",
					"",
					"sdardent",
					0,
					0,
					null,
					ElementColor.blue,
					"sdardent1",
					"sdardent2");
	}

	public static ElementInfo getClasseLictorLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Lictor",
					new String[]{"Classe Lictor", "classe Lictor", "Lictor"}, 
					"Les vaisseaux-donjons de classe Lictor sont des centres pénitenciers impériaux servant à convoyer des prisonniers.",
					"",
					"lictor",
					0,
					0,
					null,
					ElementColor.blue,
					"lictor1",
					"lictor2");
	}

	public static ElementInfo getNavetteSigmaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Navette Sigma",
					new String[]{"Navette Sigma"}, 
					"Navette à long rayon d'action de Sienar Fleet Systems, utilisée par le Nouvel Empire Galactique.",
					"",
					"navettesigma",
					0,
					0,
					null,
					ElementColor.blue,
					"navettesigma1");
	}

	public static ElementInfo getNavetteSentinelleCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Navette Sentinelle",
					new String[]{"Navette Sentinelle"}, 
					"La navette de classe Sentinelle fut utilisée comme transport pour les unités légères comme les infanteries, les TP-TT ou les moto-jets. ",
					"",
					"navettesentinel",
					0,
					0,
					null,
					ElementColor.blue,
					"navettesentinel1",
					"navettesentinel2");
	}

	public static ElementInfo getClasseBellatorLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Bellator",
					new String[]{"Classe Bellator", "classe Bellator", "Bellator"}, 
					"Le Croiseur de Bataille de classe Bellator fut un vaisseau de lourd tonnage entré en service dans la Marine Impériale du temps de Palpatine.",
					"",
					"sdbellator",
					0,
					0,
					null,
					ElementColor.blue,
					"sdbellator1");
	}

	public static ElementInfo getClasseAssertorLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Assertor",
					new String[]{"Classe Assertor", "classe Assertor", "Assertor"}, 
					"Le cuirassé stellaire de classe Assertor est un vaisseau de combat conventionnel de lourd tonnage utilisé par l'Empire Galactique.",
					"",
					"sdassertor",
					0,
					0,
					null,
					ElementColor.blue,
					"sdassertor1",
					"sdassertor2");
	}

	public static ElementInfo getClasseTectorCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Tector",
					new String[]{"Classe Tector", "classe Tector", "Tector"}, 
					"Ce Star Destroyer fut majoritairement employé durant la Première Guerre Civile Galactique sous l'égide de l'Empire Galactique.",
					"",
					"sdtector",
					0,
					0,
					null,
					ElementColor.blue,
					"sdtector1");
	}

	public static ElementInfo getClassePraetorLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Praetor",
					new String[]{"Classe Praetor", "classe Praetor", "Praetor"}, 
					"Imposant croiseur de combat de 4 800 mètres de long, le Praetor est le plus grand croiseur jamais construit.",
					"",
					"sdpraetor",
					0,
					0,
					null,
					ElementColor.blue,
					"sdpraetor1");
	}

	public static ElementInfo getClasseVengeanceLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Vengeance",
					new String[]{"Classe Vengeance"}, 
					"Employé par l'Empire Galactique après la Bataille d'Endor, ce model titanesque de cuirassé atteignait la taille d'un Executor.  ",
					"",
					"ssdvegeance",
					0,
					0,
					null,
					ElementColor.blue,
					"ssdvengeance1",
					"ssdvengeance2");
	}

	public static ElementInfo getClasseExecutorLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Executor",
					new String[]{"Classe Executor", "classe Executor", "Executor"}, 
					"Le Super Star Destroyer de classe Executor est le plus long cuirassé de commandement qui ai jamais existé dans l'Histoire galactique impériale. Le premier de son genre fut employé comme vaisseau amiral de l'Escadron de la Mort par Dark Vador.   ",
					"",
					"ssdexecutorlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"ssdexecutor3",
					"ssdexecutor1",
					"ssdexecutor2");
	}

	public static ElementInfo getClasseExecutorClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Executor",
					new String[]{"Classe Executor", "classe Executor", "Executor"}, 
					"Le Super Star Destroyer de classe Executor est le plus long cuirassé de commandement qui ai jamais existé dans l'Histoire galactique impériale. Le premier de son genre fut employé comme vaisseau amiral de l'Escadron de la Mort par Dark Vador.   ",
					"",
					"ssdexecutorclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"ssdexecutor3",
					"ssdexecutor1",
					"ssdexecutor2");
	}

	public static ElementInfo getTIEFOClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"TIE-FO",
					new String[]{"TIE-FO", "TIE/fo"}, 
					"Le chasseur TIE du Premier Ordre, ou TIE/fo, est un appareil de supériorité spatial monoplace, vraisemblablement construit par Sienar Fleet Systems et équipant la Chasse du Premier Ordre.",
					"",
					"tiefo",
					0,
					0,
					null,
					ElementColor.blue,
					"tiefo1",
					"tiefo2");
	}

	public static ElementInfo getTIESFClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"TIE-SF",
					new String[]{"TIE-SF", "TIE/sf"}, 
					"Le Chasseur TIE des Forces Spéciales du Premier Ordre, ou TIE/sf, est un chasseur biplace polyvalent équipant les troupes d'élite de la Marine du Premier Ordre.",
					"",
					"tiespecfo",
					0,
					0,
					null,
					ElementColor.blue,
					"tiespecfo1",
					"tiespecfo2");
	}

	public static ElementInfo getTransporteurClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Transporteur",
					new String[]{"Transporteur"}, 
					"Transporteur de troupes du Premier Ordre.",
					"",
					"transportfo",
					0,
					0,
					null,
					ElementColor.blue,
					"transportfo1",
					"transportfo2");
	}

	public static ElementInfo getCimeterreTIELegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Cimeterre TIE",
					new String[]{"Cimeterre TIE"}, 
					"Le TIE Cimeterre est un bombardier lourd biplace construit par Sienar Fleet Systems et popularisé par le Grand Amiral Thrawn.",
					"",
					"tiescimitar",
					0,
					0,
					null,
					ElementColor.blue,
					"tiecimeterre1");
	}

	public static ElementInfo getDefenseurTIELegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Défenseur TIE",
					new String[]{"Défenseur TIE"}, 
					"Le Défenseur TIE est le plus puissant chasseur de la Marine Impériale construit pendant la Guerre Civile Galactique, Il sera toujours employé des années plus tard par les Vestiges de l'Empire.",
					"",
					"tiedefender",
					0,
					0,
					null,
					ElementColor.blue,
					"tiedefender1",
					"tiedefender2");
	}

	public static ElementInfo getDroideTIELegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Droïde TIE",
					new String[]{"Droïde TIE", "TIE droïde", "droïde TIE"}, 
					"Chasseur automatisé léger peu cher et produit massivement. Certaines usines pouvaient êtres logées dans des Devastateurs de Mondes. ",
					"",
					"tiedroid",
					0,
					0,
					null,
					ElementColor.blue,
					"tiedroid1");
	}

	public static ElementInfo getOppresseurTIELegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Oppresseur TIE",
					new String[]{"Oppresseur TIE"}, 
					"TIE bombardier expérimental impérial jamais produit massivement à cause d'un apport mauvais qualité / prix.",
					"",
					"tieoppressor",
					0,
					0,
					null,
					ElementColor.blue,
					"tieoppressor1",
					"tieoppressor2");
	}

	public static ElementInfo getHunterTIELegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Hunter TIE",
					new String[]{"Hunter TIE", "TIE Hunter"}, 
					"Chasseur impérial polyvalent mais qui ne fut jamais déployé pour des raisons politiques et financières.",
					"",
					"tiehunter",
					0,
					0,
					null,
					ElementColor.blue,
					"tiehunter1",
					"tiehunter2");
	}

	public static ElementInfo getFantômeTIELegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Fantôme TIE",
					new String[]{"Fantôme TIE"}, 
					"Le TIE Fantôme est un chasseur impérial très évolué construit par Sienar Fleet Systems et équipé d'un manteau-bouclier furtif.",
					"",
					"tiephantom",
					0,
					0,
					null,
					ElementColor.blue,
					"tiefantom1",
					"tiefantome2");
	}

	public static ElementInfo getPredateurTIELegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Prédateur TIE",
					new String[]{"Prédateur TIE", "predator TIE", "TIE predator", "TIE Predator"}, 
					"Le Prédateur TIE est le chasseur spatial du Nouvel Empire Galactique. Il fut conçu par Sienar Fleet Systems.",
					"",
					"tiepredator",
					0,
					0,
					null,
					ElementColor.blue,
					"tiepredator1",
					"tiepredator2");
	}

	public static ElementInfo getIntercepteurRoyalTIELegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Intercepteur Royal TIE",
					new String[]{"Intercepteur Royal TIE"}, 
					"Intercepteur TIE peints aux couleurs de la Garde personnelle de Palpatine.",
					"",
					"tieroyal",
					0,
					0,
					null,
					ElementColor.blue,
					"tieroyal1",
					"tieroyal2");
	}

	public static ElementInfo getTIEAvancex1Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"TIE Avancé x1",
					new String[]{"TIE Avancé x1"}, 
					"Prototype d'un nouveau type de chasseur TIE prévu pour le corps à corps spatial. Les plans furent soumis par Dark Vador en personne.",
					"",
					"tieadvancedx1",
					0,
					0,
					null,
					ElementColor.blue,
					"tieadvanced1",
					"tieadvanced2");
	}

	public static ElementInfo getIntercepteurTIECommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Intercepteur TIE",
					new String[]{"Intercepteur TIE", "interceptor TIE", "Interceptor TIE"}, 
					"L'intercepteur TIE est un appareil monoplace rapide et puissant qui fut intégré à la Marine Impériale vers la fin de la Guerre Civile Galactique.",
					"",
					"tieinterceptor",
					0,
					0,
					null,
					ElementColor.blue,
					"tieinterceptor1",
					"tieinterceptor2");
	}

	public static ElementInfo getBombardierTIECommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bombardier TIE",
					new String[]{"Bombardier TIE"}, 
					"Le bombardier TIE fut employé comme bombardier monoplace au service de l'Empire Galactique.",
					"",
					"tiebomber",
					0,
					0,
					null,
					ElementColor.blue,
					"tiebomber1",
					"tiebomber2");
	}

	public static ElementInfo getChasseurTIECommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Chasseur TIE",
					new String[]{"Chasseur TIE"}, 
					"Le chasseur Twin Ion Engine, construit par Sienar Fleet Systems, fut le chasseur de supériorité spatiale standard de l'Empire durant toute la Guerre Civile Galactique.",
					"",
					"tiefighter",
					0,
					0,
					null,
					ElementColor.blue,
					"tiefighter1",
					"tiefighter2");
	}

	public static ElementInfo getClasseImperialICommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Imperial-I",
					new String[]{"Classe Imperial-I", "class Imperial"}, 
					"Le Star Destroyer de classe Impérial-I est un vaisseau de combat lourd qui fut l'emblême de l'Empire Galactique.",
					"",
					"sdimperialmk1",
					0,
					0,
					null,
					ElementColor.blue,
					"sdimperial1",
					"sdimperial2");
	}

	public static ElementInfo getClasseImperialIICommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Imperial-II",
					new String[]{"Classe Imperial-II", "class Imperial-II"}, 
					"Le Star Destroyer de classe Impérial-II est l'évolution du Destroyer Impérial-I.",
					"",
					"sdimperialmk2",
					0,
					0,
					null,
					ElementColor.blue,
					"sdimperialmk21",
					"sdimperialmk22");
	}

	public static ElementInfo getClasseSovereignLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Sovereign",
					new String[]{"Classe Sovereign", "Sovereign"}, 
					"Le Super Star Destroyer de classe Sovereign est un cuirassé puissant et imposant. Il ne fut construit qu'en quatres exemplaires pour la flotte personnelle de l'Empereur Palpatine.",
					"",
					"ssdsovereign",
					0,
					0,
					null,
					ElementColor.blue,
					"ssdsovereign1",
					"ssdsovereign2");
	}

	public static ElementInfo getClasseEclipseLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Eclipse",
					new String[]{"Classe Eclipse", "classe Eclipse", "destroyer Eclipse"}, 
					"Le Super Star Destroyer de classe Eclipse, fut le plus imposant et plus puissant cuirassé stellaire créé par l'Empire Galactique.",
					"",
					"ssdeclipse",
					0,
					0,
					null,
					ElementColor.blue,
					"ssdeclipse1",
					"ssdeclipse2");
	}

	public static ElementInfo getClasseVictoryCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Victory",
					new String[]{"Classe Victory", "Victory"}, 
					"Le Star Destroyer de classe Victoire-I est un croiseur de la fin de la Guerre des Clones, prédécesseur du Venator.",
					"",
					"sdvictory",
					0,
					0,
					null,
					ElementColor.blue,
					"sdvictory1",
					"sdvictory2");
	}

	public static ElementInfo getClassePellaeonLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Pellaeon",
					new String[]{"Classe Pellaeon", "Destroyer Pellaeon", "classe Pellaeon"}, 
					"Le Star Destroyer est le fer de lance de la Marine spatiale du Nouvel Empire Galactique.",
					"",
					"sdpellaeon",
					0,
					0,
					null,
					ElementColor.blue,
					"sdpellaeon1",
					"sdpellaeon2");
	}

	public static ElementInfo getClasseImperiousLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Imperious",
					new String[]{"Classe Imperious"}, 
					"Ce Star Destroyer est le dernier né des chantiers naval Mon Cal et le successeur du répandu Star Destroyer Pellaeon.",
					"",
					"sdimperious",
					0,
					0,
					null,
					ElementColor.blue,
					"sdimperious1",
					"sdimperious2");
	}

	public static ElementInfo getRogueShadowLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Rogue Shadow",
					new String[]{"Rogue Shadow"}, 
					"Transport personnel de Starkiller, l'apprenti secret de Dark Vador. ",
					"",
					"rogueshadow",
					0,
					0,
					null,
					ElementColor.blue,
					"rogueshadow1");
	}

	public static ElementInfo getNavetteNuneLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Navette Nune",
					new String[]{"Navette Nune"}, 
					"Navette polyvalente utilisée par le Nouvel Empire Galactique, qu'il s'agisse de la faction de Roan Fel ou des Sith.",
					"",
					"navettenune",
					0,
					0,
					null,
					ElementColor.blue,
					"navettenune1");
	}

	public static ElementInfo getNavetteUpsilonClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Navette Upsilon",
					new String[]{"Navette Upsilon", "navette de Kylo Ren"}, 
					"Navette imposante construite secrêtement par le Premier Ordre.",
					"",
					"upsilon",
					0,
					0,
					null,
					ElementColor.blue,
					"upsilon1",
					"upsilon2");
	}

	public static ElementInfo getNavetteLambdaCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Navette Lambda",
					new String[]{"Navette Lambda", "navette Lambda"}, 
					"La navette de classe Lambda est un appareil de transport utilisé par l'Empire Galactique durant la Guerre Civile Galactique.",
					"",
					"navettelambda",
					0,
					0,
					null,
					ElementColor.blue,
					"navettelambda1",
					"navettelambda2");
	}

	public static ElementInfo getDevastateurdeMondesLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dévastateur de Mondes",
					new String[]{"Dévastateur de Mondes", "dévastateur de mondes"}, 
					"Le Dévastateur de Mondes fut une redoutable arme de destruction massive utilisée par l'Empire des Ténèbres.",
					"",
					"devastator",
					0,
					0,
					null,
					ElementColor.blue,
					"devastator1",
					"devastator2",
					"devastator3");
	}

	public static ElementInfo getStationStarkillerClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Station Starkiller",
					new String[]{"Station Starkiller", "Starkiller"}, 
					"Planète glaciale transformée en bastion du Premier Ordre, et équipée d'une nouvelle arme farouchement destructrice, capable de détruire des systèmes solaires entiers.",
					"",
					"starkillerbase",
					0,
					0,
					null,
					ElementColor.blue,
					"starkillerstation1",
					"starkillerstation2",
					"hux2");
	}

	public static ElementInfo getEtoileNoireCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Etoile Noire",
					new String[]{"Etoile Noire", "première Etoile de la Mort "}, 
					"Première station de combat sidérale de l'Empire Galactique de 160km de diamètre. Sa puissance de feu peut anéantir une planète entière.",
					"",
					"deathstar1",
					0,
					0,
					null,
					ElementColor.blue,
					"deathstar1",
					"deathstar12",
					"superlaser1");
	}

	public static ElementInfo getEtoiledelaMortCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Etoile de la Mort",
					new String[]{"Etoile de la Mort", "seconde Etoile de la Mort"}, 
					"Station de combat titanesque de l'Empire Galactique, cette immense base spatiale capable de terasser un Cuirassé ou une planète entière fut construite en seulement 3 ans.",
					"",
					"deathstar2",
					0,
					0,
					null,
					ElementColor.blue,
					"deathstar2",
					"deathstar22");
	}

	public static ElementInfo getDroideVautourCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Droïde Vautour",
					new String[]{"Droïde Vautour", "chasseur droïde"}, 
					"Ce Chasseur Droïde est le chasseur spatial de masse de la Fédération du Commerce.",
					"",
					"vulturefighter",
					0,
					0,
					null,
					ElementColor.blue,
					"vulturefighter2",
					"vulturefighter1");
	}

	public static ElementInfo getVoiliersolaireCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Voilier solaire",
					new String[]{"Voilier solaire"}, 
					"Vaisseau unique au design particulier du Comte Dooku. Il est le parfait mélange entre technologie et art ancien.   ",
					"",
					"voiliersolaire",
					0,
					0,
					null,
					ElementColor.blue,
					"voiliersolaire1");
	}

	public static ElementInfo getDroideTrichasseurCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Droïde Tri-chasseur",
					new String[]{"Droïde Tri-chasseur", "Tri-chasseur doïde"}, 
					"Le droïde tri-chasseur fut un chasseur droïde redoutable de la Confédération durant la Guerre des Clones.",
					"",
					"tridroidfighter",
					0,
					0,
					null,
					ElementColor.blue,
					"tridroidfighter1",
					"tridroidfighter2");
	}

	public static ElementInfo getStationSkytopClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Station Skytop",
					new String[]{"Station Skytop"}, 
					"La Station Skytop fut une station d'écoute séparatiste qui fut placée sur Ruusan.",
					"",
					"skytopstation",
					0,
					0,
					null,
					ElementColor.blue,
					"skytopstation1",
					"skytopstation2");
	}

	public static ElementInfo getClasseSubjugatorCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Subjugator",
					new String[]{"Classe Subjugator", "Subjugator"}, 
					"Le croiseur lourd de classe Subjugator est un vaisseau de combat lourd conçu par les Séparatistes durant la Guerre des Clones.",
					"",
					"sdsubjugator",
					0,
					0,
					null,
					ElementColor.blue,
					"sdsubjugator2",
					"sdsubjugator1");
	}

	public static ElementInfo getClasseProvidenceCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Providence",
					new String[]{"Classe Providence"}, 
					"Le Destroyer de classe Providence fut le Vaisseau de combat principal de l'armada séparatiste.",
					"",
					"sdprovidence",
					0,
					0,
					null,
					ElementColor.blue,
					"sdprovidence2",
					"sdprovidence1");
	}

	public static ElementInfo getClasseMunificientCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Munificient",
					new String[]{"Classe Munificient", "Munificient"}, 
					"La frégate Stellaire Munificent fut un vaisseau de communication utilisé par les Séparatistes pendant la Guerre des Clones.",
					"",
					"sdmunificient",
					0,
					0,
					null,
					ElementColor.blue,
					"sdmunificient2",
					"sdmunificient1");
	}

	public static ElementInfo getClasseRecusantCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Classe Recusant",
					new String[]{"Classe Recusant", "Recusant"}, 
					"Le destroyer léger de classe Recusant est le vaisseau le plus polyvalent de toute l'armada de la Confédération des Sytèmes Indépendant.",
					"",
					"sdrecusant",
					0,
					0,
					null,
					ElementColor.blue,
					"sdrecusant1",
					"sdrecusant2");
	}

	public static ElementInfo getNavetteSheathipedeCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Navette Sheathipede",
					new String[]{"Navette Sheathipede"}, 
					"La navette de classe Sheathipede fut un vaisseau à court rayon d'action utilisé par les officiels Neimoidiens.",
					"",
					"navettesheathipede",
					0,
					0,
					null,
					ElementColor.blue,
					"sheathipede1",
					"sheathipede2");
	}

	public static ElementInfo getChasseurNantexCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Chasseur Nantex",
					new String[]{"Chasseur Nantex"}, 
					"Le Chasseur de défense territorial de classe Nantex est un appareil des Forces de Défense Géonosiennes.",
					"",
					"nantexfighter",
					0,
					0,
					null,
					ElementColor.blue,
					"nantex2",
					"nantex1");
	}

	public static ElementInfo getBombardierHyenaCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bombardier Hyena",
					new String[]{"Bombardier Hyena"}, 
					"Le bombardier droïde de classe Hyena fut un bombardier construit par Baktoid Armor sur la base du chasseur Vautour.",
					"",
					"hyenabomber",
					0,
					0,
					null,
					ElementColor.blue,
					"hyenabomber1",
					"hyenabomber2");
	}

	public static ElementInfo getChasseurGinivexCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Chasseur Ginivex",
					new String[]{"Chasseur Ginivex"}, 
					"Le chasseur de classe Ginivex est un vaisseau construit à six exemplaires pour le Comte Dooku.",
					"",
					"ginivex",
					0,
					0,
					null,
					ElementColor.blue,
					"ginivex2",
					"ginivex1");
	}

	public static ElementInfo getCroiseurLucrehulkCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Croiseur Lucrehulk",
					new String[]{"Croiseur Lucrehulk", "Lucrehulk"}, 
					"Vaisseau-cargo lourd de la Fédération du Commerce reconverti en base militaire. ",
					"",
					"croiseurlucrehulk",
					0,
					0,
					null,
					ElementColor.blue,
					"lucrehulk2",
					"lucrehulk1");
	}

	public static ElementInfo getVaisseauNoyauCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Vaisseau-Noyau",
					new String[]{"Vaisseau-Noyau"}, 
					"Les sphères sptiales de classe Lucrehulk étaient les noyaux de commande des cargos de la Fédération du Commerce.",
					"",
					"coreship",
					0,
					0,
					null,
					ElementColor.blue,
					"coreship1",
					"coreship2");
	}

	public static ElementInfo getCanonnieredroideCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Canonnière droïde",
					new String[]{"Canonnière droïde"}, 
					"La Plate-forme de missiles lourde HMP est un bombardier utilisé par la Confédération des Systèmes Indépendants.",
					"",
					"canonnieredroid",
					0,
					0,
					null,
					ElementColor.blue,
					"canonnieredroid1",
					"canonnieredroid2");
	}

	public static ElementInfo getBargeC9979Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Barge C-9979",
					new String[]{"Barge C-9979", "C-9979"}, 
					"La barge de transport C-9979 fut un vaisseau de débarquement de la Fédération du Commerce, utilisé par les Séparatistes durant la Guerre des clones.",
					"",
					"c9979",
					0,
					0,
					null,
					ElementColor.blue,
					"c99792",
					"c99791");
	}

	public static ElementInfo getCroiseurDiamantCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Croiseur Diamant",
					new String[]{"Croiseur Diamant"}, 
					"Le Croiseur Diamant fut l'un des principaux éléments de transport de la Flotte de la Confédération des Systèmes Indépendants.",
					"",
					"diamant",
					0,
					0,
					null,
					ElementColor.blue,
					"diamond1");
	}

	public static ElementInfo getFuseeHardcellCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Fusée Hardcell",
					new String[]{"Fusée Hardcell", "Hardcell"}, 
					"Le Transport Interstellaire de classe Hardcell fut utilisé par la Techno Union et le Clan Bancaire Intergalactique.",
					"",
					"hardcell",
					0,
					0,
					null,
					ElementColor.blue,
					"hardcell1",
					"hardcell2");
	}

	public static ElementInfo getBelbullabCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Belbullab",
					new String[]{"Belbullab"}, 
					"Chasseur d'Assaut Lourd conçu pendant la Guerre des Clones pour le compte de la Confédération des Systèmes Indépendants afin de lutter contre les ARC-170.",
					"",
					"belbullab",
					0,
					0,
					null,
					ElementColor.blue,
					"belbullab1",
					"belbullab2");
	}

	public static ElementInfo getQuadjumperClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Quadjumper",
					new String[]{"Quadjumper"}, 
					"Vaisseau de remorquage disposant de quatre grands propulseurs et d'un cockpit très large.",
					"",
					"quadjumper",
					0,
					0,
					null,
					ElementColor.blue,
					"quadjumper1");
	}

	public static ElementInfo getYachtNabooTHCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Yacht Naboo T-H",
					new String[]{"Yacht Naboo T-H"}, 
					"Petit appareil élégant et discret, appartenant à Padmé Amidala.",
					"",
					"yachtroyalh",
					0,
					0,
					null,
					ElementColor.blue,
					"nabooyacht2",
					"nabooyacht1");
	}

	public static ElementInfo getNefRoyaleNabooTJCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nef Royale Naboo T-J",
					new String[]{"Nef Royale Naboo T-J"}, 
					"Vaisseau diplomatique majestueux utilisé par la Reine Amidala.",
					"",
					"nefroyalj327",
					0,
					0,
					null,
					ElementColor.blue,
					"nefroyal2",
					"nefroyal1");
	}

	public static ElementInfo getChasseurN1Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Chasseur N-1",
					new String[]{"Chasseur N-1"}, 
					"Le Chasseur N-1 Naboo fut un petit chasseur monoplace en service dans les Forces Naboo.",
					"",
					"naboon1",
					0,
					0,
					null,
					ElementColor.blue,
					"naboon11",
					"naboon12");
	}

	public static ElementInfo getGriffeChissLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Griffe Chiss",
					new String[]{"Griffe Chiss"}, 
					"Chasseur moyenne portée utilisé par les Forces de Défense Chiss.",
					"",
					"griffechiss",
					0,
					0,
					null,
					ElementColor.blue,
					"griffechiss1");
	}

	public static ElementInfo getChasseurP38Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Chasseur P-38",
					new String[]{"Chasseur P-38"}, 
					"Le chasseur de classe Rogue Porax-38 est un chasseur de défense utilisé par les forces de la planète Utapau.",
					"",
					"p38",
					0,
					0,
					null,
					ElementColor.blue,
					"porax381");
	}

	public static ElementInfo getVoituredesnuagesCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Voiture des nuages",
					new String[]{"Voiture des nuages"}, 
					"la Voiture des Nuages Storm IV est un véhicule aérien de patrouille et de reconnaissance.",
					"",
					"cloudcar",
					0,
					0,
					null,
					ElementColor.blue,
					"cloudcar1",
					"cloudcar2");
	}

	public static ElementInfo getRTTTCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"RT-TT",
					new String[]{"RT-TT"}, 
					"Le RT-TT, ou Renfort Tactique Tout-Terrain, est un hexapode lourd construit par Rothana durant la Guerre des Clones pour servir l'Armée Clone.",
					"",
					"rttt",
					0,
					0,
					null,
					ElementColor.blue,
					"rttt1",
					"rttt2");
	}

	public static ElementInfo getTRTTCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"TR-TT",
					new String[]{"TR-TT"}, 
					"Le transport de reconnaissance tout terrain est un véhicule walker légèrement armée et peu protégé avant tout conçu pour l'exploration. ",
					"",
					"trtt",
					0,
					0,
					null,
					ElementColor.blue,
					"trtt1",
					"trtt2");
	}

	public static ElementInfo getTOTTCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"TO-TT",
					new String[]{"TO-TT"}, 
					"Transport de troupes octopode dont la soute principale est à l'air libre employée durant la Guerre des Clones.",
					"",
					"tott",
					0,
					0,
					null,
					ElementColor.blue,
					"tott1",
					"tott2");
	}

	public static ElementInfo getTXTTLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"TX-TT",
					new String[]{"TX-TT"}, 
					"Véhicule d'assaut bipode lourdement armé utilisé par l'Armée de la République et prédécesseur du TS-TT de l'Empire Galactique.",
					"",
					"txtt",
					0,
					0,
					null,
					ElementColor.blue,
					"txtt1",
					"txtt2");
	}

	public static ElementInfo getCharTX130Legends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Char TX-130",
					new String[]{"Char TX-130"}, 
					"Le char à répulsion de classe Sabre TX-130 est un véhicule d'assaut de la République Galactique, utilisé par l'Armée Clone.",
					"",
					"tx130",
					0,
					0,
					null,
					ElementColor.blue,
					"tanktx1",
					"tanktx2");
	}

	public static ElementInfo getJuggernautCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Juggernaut",
					new String[]{"Juggernaut"}, 
					"Le Juggernaut HAVw fut un véhicule d'assaut lourd largement utilisé durant la Guerre des Clones, puis par l'Armée Impériale sous l'Empire Galactique.",
					"",
					"juggernaut",
					0,
					0,
					null,
					ElementColor.blue,
					"juggernaut2",
					"juggernaut1");
	}

	public static ElementInfo getNATTCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"NA-TT",
					new String[]{"NA-TT"}, 
					"Véhicule bipode d'artillerie longue portée, utilisé par l'Armée Clone.",
					"",
					"natt",
					0,
					0,
					null,
					ElementColor.blue,
					"natt1");
	}

	public static ElementInfo getALATCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"AL-AT",
					new String[]{"AL-AT"}, 
					"L'artillerie lourde autopropulsée à Turbolaser (ALAP-T) est un véhicule d'assaut terrestre de l'Armée Clone de la République Galactique.",
					"",
					"alat",
					0,
					0,
					null,
					ElementColor.blue,
					"alat1",
					"alat2");
	}

	public static ElementInfo getSpeederbike74ZCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Speeder bike 74-Z",
					new String[]{"Speeder bike 74-Z"}, 
					"La motojet 74-Z est un petit appareil à répulseur très rapide construit par Aratech et notamment utilisé par les Scout Troopers impériaux durant la Guerre Civile.",
					"",
					"speeder74z",
					0,
					0,
					null,
					ElementColor.blue,
					"speeder74z1",
					"speeder1");
	}

	public static ElementInfo getTBTTCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"TB-TT",
					new String[]{"TB-TT"}, 
					"Quadripode de combat lourd, il est l'un des véhicules pour assauts terrestres le plus impressionant de l'arsenal impérial.  ",
					"",
					"tbtt",
					0,
					0,
					null,
					ElementColor.blue,
					"tbtt1",
					"tbtt2");
	}

	public static ElementInfo getTSTTCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"TS-TT",
					new String[]{"TS-TT"}, 
					"Le Transport de Surveillance Tout Terrain est un véhicule de combat léger employé par l'Armée Impériale lors de la Guerre Civile Galactique.",
					"",
					"tstt",
					0,
					0,
					null,
					ElementColor.blue,
					"tstt1",
					"tstt2");
	}

	public static ElementInfo getTPTTCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"TP-TT",
					new String[]{"TP-TT"}, 
					"Machine de guerre anti-personnelle développée par les Industries de Rothana en tant qu'appui pour les soldats au sol.",
					"",
					"tptt",
					0,
					0,
					null,
					ElementColor.blue,
					"tptt1",
					"tptt2");
	}

	public static ElementInfo getTRETTLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"TRE-TT",
					new String[]{"TRE-TT"}, 
					"Le transport de répression d'émeute tout-terrain était, sous le Nouvel Empire, le successeur de l'antique TR-TT.  ",
					"",
					"trett",
					0,
					0,
					null,
					ElementColor.blue,
					"trett1",
					"trett2");
	}

	public static ElementInfo getTBAALegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"TB-AA",
					new String[]{"TB-AA"}, 
					"Quadripode impérial spécialisé dans la combat anti-aérien.",
					"",
					"tbaa",
					0,
					0,
					null,
					ElementColor.blue,
					"tbaa1",
					"tbaa2");
	}

	public static ElementInfo getTLBTTLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"TLB-TT",
					new String[]{"TLB-TT"}, 
					"Le transport lourd blindé tout-terrain était un puissant véhicule utilisé par le Nouvel Empire, qui apparaît comme le successeur de l'antique TB-TT.  ",
					"",
					"tlbtt",
					0,
					0,
					null,
					ElementColor.blue,
					"tlbtt1",
					"tlbtt2");
	}

	public static ElementInfo getATDPClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"AT-DP",
					new String[]{"AT-DP"}, 
					"Variation du TS-TT, cet engin à tête lourdement protégée est des bipède impérial conçu par Kuat Drive Yards. ",
					"",
					"atdp",
					0,
					0,
					null,
					ElementColor.blue,
					"atdp1",
					"atdp2");
	}

	public static ElementInfo getMotoRoueCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Moto-Roue",
					new String[]{"Moto-Roue"}, 
					"Le speeder-roue Tsmeu-6 est un véhicule à roue unique et servant de transport personnel au Général Grievous durant la Guerre des Clones.",
					"",
					"wheelbike",
					0,
					0,
					null,
					ElementColor.blue,
					"wheelbike1",
					"wheelbike2");
	}

	public static ElementInfo getTridroideOctuptarraCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tri-droïde Octuptarra",
					new String[]{"Tri-droïde Octuptarra", "Octuptarra"}, 
					"Droïde moyenne et longue distance du Techno Syndicat développé et employé durant la Guerre des Clones.",
					"",
					"octuptarradroid",
					0,
					0,
					null,
					ElementColor.blue,
					"octuptarradroid1",
					"octuptarradroid2");
	}

	public static ElementInfo getTransportMultiTroupesCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Transport Multi-Troupes",
					new String[]{"Transport Multi-Troupes", "TMT"}, 
					"Véhicule de transport lourd de la Fédération du Commerce construit par Baktoid Armor.",
					"",
					"tmt",
					0,
					0,
					null,
					ElementColor.blue,
					"tmt2",
					"tmt1",
					"tmt3");
	}

	public static ElementInfo getTanksismiqueCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tank sismique",
					new String[]{"Tank sismique"}, 
					"Le tank sismique fut une arme dévastatrice à répulseur utilisée par la Confédération des Systèmes Indépendants durant la Guerre des Clones.",
					"",
					"tanksismique",
					0,
					0,
					null,
					ElementColor.blue,
					"tanksismique2",
					"tanksismique1");
	}

	public static ElementInfo getSuperTankClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Super Tank",
					new String[]{"Super Tank"}, 
					"Le supertank fut un modèle expérimental de Baktoid Armor Workshop lancé durant la Guerre des Clones.",
					"",
					"supertank",
					0,
					0,
					null,
					ElementColor.blue,
					"supertank1",
					"supertank2");
	}

	public static ElementInfo getSTAPCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"STAP",
					new String[]{"STAP"}, 
					"Le Système de Transport Aérien Personnel est un petit engin à répulseurs très rapide spécialement adapté à la morphologie des droïdes de combats.",
					"",
					"stap",
					0,
					0,
					null,
					ElementColor.blue,
					"stap2",
					"stap1");
	}

	public static ElementInfo getDroideAraigneTraqueurCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Droïde Araigné Traqueur",
					new String[]{"Droïde Araigné Traqueur"}, 
					"Le droïde araignée traqueur OG-9 fut un engin militaire de la Confédération des Systèmes Indépendants.",
					"",
					"spidertrackdroid",
					0,
					0,
					null,
					ElementColor.blue,
					"trackerspiderdroid1",
					"trackerspiderdroid2");
	}

	public static ElementInfo getDroideAraigneNaineCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Droïde Araigné Naine",
					new String[]{"Droïde Araigné Naine"}, 
					"Les DSD1 étaient des droïdes construits durant la fin de l'Ancienne République par les Ateliers Baktoid Armor pour la toute puissante Guilde du Commerce.",
					"",
					"spiderdwarfdroid",
					0,
					0,
					null,
					ElementColor.blue,
					"dwarfspiderdroid1",
					"dwarfspiderdroid2");
	}

	public static ElementInfo getChardroideNRN99Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Char droïde NR-N99",
					new String[]{"Char droïde NR-N99"}, 
					"Le char droïde NR-N99 de classe Persuader fut un véhicule d'assaut de la Confédération des Systèmes Indépendants.",
					"",
					"nrn99",
					0,
					0,
					null,
					ElementColor.blue,
					"nrn991",
					"nrn992");
	}

	public static ElementInfo getChardroideHailfireCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Char droïde Hailfire",
					new String[]{"Char droïde Hailfire"}, 
					"Le char droïde de classe Hailfire fut un véhicule lance-missiles de la Confération des Systèmes Indépendants.",
					"",
					"hailfire",
					0,
					0,
					null,
					ElementColor.blue,
					"hailfire2",
					"hailfire1");
	}

	public static ElementInfo getTransportdedroidesCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Transport de droïdes",
					new String[]{"Transport de droïdes"}, 
					"Engin à répulsion de la Fédération du Commerce afin de transporter des droïdes de combat B1.",
					"",
					"droidtransport",
					0,
					0,
					null,
					ElementColor.blue,
					"droidtransport1",
					"droidtransport2");
	}

	public static ElementInfo getDroideCrabeCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Droïde Crabe",
					new String[]{"Droïde Crabe"}, 
					"Le droïde crabe LM-432 fut un droïde de combat lourd hexapode utilisé lors de la Guerre des Clones.",
					"",
					"crabdroid",
					0,
					0,
					null,
					ElementColor.blue,
					"crabdroid2",
					"crabdroid1");
	}

	public static ElementInfo getChardAssautBlindeCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Char d'Assaut Blindé",
					new String[]{"Char d'Assaut Blindé", "CAB"}, 
					"Conçu par Baktoid Armor, le Char d'Assaut Blindé est un véhicule d'assaut terrestre de la Fédération du Commerce.",
					"",
					"cab",
					0,
					0,
					null,
					ElementColor.blue,
					"cab1",
					"cab2");
	}

	public static ElementInfo getPodRacerdeSebulbaCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Pod Racer de Sebulba",
					new String[]{"Pod Racer de Sebulba"}, 
					"Munit d'un moteur Plug-F Mammoth Split-X, le pod racer de Sebulba se reconnaissait facilement par sa grande taille et sa alliage orange.",
					"",
					"podracersebulba",
					0,
					0,
					null,
					ElementColor.blue,
					"podracersebulba1");
	}

	public static ElementInfo getPodRacerdAnakinCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Pod Racer d'Anakin",
					new String[]{"Pod Racer d'Anakin"}, 
					"Employé par Anakin Skywalker en -32 av. BY, il lui permis de remporter la course de la Boonta. ",
					"",
					"podraceranakin",
					0,
					0,
					null,
					ElementColor.blue,
					"podraceranakin1");
	}

	public static ElementInfo getPodRacerCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Pod Racer",
					new String[]{"Pod Racer", "podracer", "module de course"}, 
					"Les podracers étaient des véhicules de courses d'une extrême rapidité créés par Phoebos. Leur notoriété gagna la galaxie entière en faisant l'un des sports les plus appreciés à la fin de l'Ancienne République.",
					"",
					"podracer",
					0,
					0,
					null,
					ElementColor.blue,
					"podracer2",
					"podracer1");
	}

	public static ElementInfo getMoissonneuseCD2Legends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Moissonneuse CD-2",
					new String[]{"Moissonneuse CD-2"}, 
					"Gros engin agricole essentiel à l'économie de certaines planètes.",
					"",
					"cd2",
					0,
					0,
					null,
					ElementColor.blue,
					"cd21",
					"cd22");
	}

	public static ElementInfo getAirspeederKoro2Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Airspeeder Koro-2",
					new String[]{"Airspeeder Koro-2"}, 
					"Petit airspeeder exotique performant construit par Desler Gizh.",
					"",
					"koro2",
					0,
					0,
					null,
					ElementColor.blue,
					"koro22",
					"koro21");
	}

	public static ElementInfo getBongoCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bongo",
					new String[]{"Bongo"}, 
					"Le Bongo est un sous-marin organique Gungan utilisé pour les voyages au coeur de la planète Naboo.",
					"",
					"bongo",
					0,
					0,
					null,
					ElementColor.blue,
					"bongo1",
					"bongo2");
	}

	public static ElementInfo getChardessablesCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Char des sables",
					new String[]{"Char des sables"}, 
					"Témoin d'un monde presque oublié, les chars des sables sont de grands véhicules qui furent conçus pour l'exploitation minière de Tatooine.",
					"",
					"chardessables",
					0,
					0,
					null,
					ElementColor.blue,
					"chardessables1",
					"chardessables2");
	}

	public static ElementInfo getAirspeederCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Airspeeder",
					new String[]{"Airspeeder"}, 
					"Les airspeeders sont les véhicules à répulsion les plus largement utilisés à travers la galaxie comme transport personnel, comme moyen de divertissement ou encore pour le combat. ",
					"",
					"airspeeder",
					0,
					0,
					null,
					ElementColor.blue,
					"airspeeder2",
					"airspeeder1");
	}

	public static ElementInfo getAirspeederXJ6Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Airspeeder XJ-6",
					new String[]{"Airspeeder XJ-6"}, 
					"Airspeeder customisé de bonne mécanique du sénateur Simon Greyshade.",
					"",
					"airspeederxj6",
					0,
					0,
					null,
					ElementColor.blue,
					"airspeederxj61");
	}

	public static ElementInfo getCanonioniqueKDYCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Canon ionique KDY",
					new String[]{"Canon ionique KDY"}, 
					"Le canon ionique KDY v-150 est une gigantesque et puissante arme utilisée pour la défense planétaire.",
					"",
					"canonioniquekdy",
					0,
					0,
					null,
					ElementColor.blue,
					"canonioniquekdy1");
	}

	public static ElementInfo getTurbolaserCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Turbolaser",
					new String[]{"Turbolaser", "turbolaser"}, 
					"La batterie turbolaser est l'arme offensive/défensive de base d'un vaisseau lourd ou d'un emplacement stratégique.",
					"",
					"turbolaser",
					0,
					0,
					null,
					ElementColor.blue,
					"turbolaser1");
	}

	public static ElementInfo getArmeioniqueCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Arme ionique",
					new String[]{"Arme ionique"}, 
					"Le canon ionique est une arme spatiale utilisée pour neutraliser les systèmes électriques d'une cible.",
					"",
					"canonionique",
					0,
					0,
					null,
					ElementColor.blue,
					"canonionique1");
	}

	public static ElementInfo getBatterieFDPTourCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Batterie FD P-Tour",
					new String[]{"Batterie FD P-Tour"}, 
					"La Batterie anti-véhicule 1.4 FD P-Tour est une arme de défense antivéhicules utilisée par l'Alliance Rebelle sur Hoth.",
					"",
					"batteriefd",
					0,
					0,
					null,
					ElementColor.blue,
					"batterieptower1");
	}

	public static ElementInfo getBatterieDF9Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Batterie DF-9",
					new String[]{"Batterie DF-9"}, 
					"La Batterie anti-infanterie DF-9 fut la principale défense de la Base Echo de l'Alliance.",
					"",
					"batteriedf9",
					0,
					0,
					null,
					ElementColor.blue,
					"batteriedf91");
	}

	public static ElementInfo getSuperlaserCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Super laser",
					new String[]{"Super laser", "super-laser", "superlaser"}, 
					"Le super-laser impérial fut l'arme la plus puissante et la plus mortelle que l'Empire Galactique ait possédée.",
					"",
					"superlaser",
					0,
					0,
					null,
					ElementColor.blue,
					"superlaser2",
					"superlaser1",
					"superlaser3");
	}

	public static ElementInfo getDetonateurthermiqueCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Détonateur thermique",
					new String[]{"Détonateur thermique", "étonateur thermique"}, 
					"Le Détonateur thermique est une grenade offensive possédant un grand pouvoir de destruction.",
					"",
					"detona",
					0,
					0,
					null,
					ElementColor.blue,
					"detona1");
	}

	public static ElementInfo getSabrelaserCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sabre laser",
					new String[]{"Sabre laser", "sabrelaser", "sabrolaser", "sabre laser", "épée laser"}, 
					"Le sabre laser est une arme de corps à corps élégante, symbole le plus fort des Jedi et des Sith depuis des temps immémoriaux.",
					"",
					"sabrelaser",
					0,
					0,
					null,
					ElementColor.blue,
					"sabrelaser1",
					"sabrelaser3");
	}

	public static ElementInfo getFusilblasterDC17Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Fusil blaster DC-17",
					new String[]{"Fusil blaster DC-17"}, 
					"Le blaster multifonctions réservés aux commandos clones.",
					"",
					"fusilblasterdc17",
					0,
					0,
					null,
					ElementColor.blue,
					"blasterrifledc171",
					"blasterrifledc172");
	}

	public static ElementInfo getFusilblasterDC15Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Fusil blaster DC-15",
					new String[]{"Fusil blaster DC-15"}, 
					"Fusil d'assaut lourd utilisé par les troupes clones de la République Galactique.",
					"",
					"fusilblasterdc15",
					0,
					0,
					null,
					ElementColor.blue,
					"blasterrifledc151",
					"blasterrifledc152");
	}

	public static ElementInfo getArcaenergieCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Arc à énergie",
					new String[]{"Arc à énergie"}, 
					"Arme rare, l'arc à énergie ne fut utilisé que par les mystérieuses Soeur de la Nuit.",
					"",
					"energyarc",
					0,
					0,
					null,
					ElementColor.blue,
					"energybow1");
	}

	public static ElementInfo getCanonSoniqueCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Canon Sonique",
					new String[]{"Canon Sonique"}, 
					"Le canon sonique est une plate-forme d'artillerie défensive utilisée par les géonosiens.",
					"",
					"canonsonique",
					0,
					0,
					null,
					ElementColor.blue,
					"canonsonique2",
					"canonsonique1");
	}

	public static ElementInfo getCanonEWEBCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Canon E-WEB",
					new String[]{"Canon E-WEB"}, 
					"La plus puissante arme portative employée par l'Empire Galactique du temps de la Guerre Civile Galactique.",
					"",
					"canonrepeteweb",
					0,
					0,
					null,
					ElementColor.blue,
					"eweb2",
					"eweb1");
	}

	public static ElementInfo getBlasterE11Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Blaster E-11",
					new String[]{"Blaster E-11"}, 
					"Cette arme légère et puissante fut le standart des armées de l'Empire Galactique.",
					"",
					"blastere11",
					0,
					0,
					null,
					ElementColor.blue,
					"blastere111",
					"blastere112");
	}

	public static ElementInfo getBlasterDL44Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Blaster DL-44",
					new String[]{"Blaster DL-44", "blaster DL-44"}, 
					"Arme puissante et compacte à moyenne portée du contrebandier Han Solo.",
					"",
					"blasterdl44",
					0,
					0,
					null,
					ElementColor.blue,
					"blasterdl441",
					"blasterdl442");
	}

	public static ElementInfo getBlasterDH17Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Blaster DH-17",
					new String[]{"Blaster DH-17"}, 
					"Blaster à courte portée communément utilisé par l'Alliance Rebelle et la Marine Impériale.",
					"",
					"blasterdh17",
					0,
					0,
					null,
					ElementColor.blue,
					"blasterdh171",
					"blasterdh172");
	}

	public static ElementInfo getBlasterDC15SCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Blaster DC-15-S",
					new String[]{"Blaster DC-15-S"}, 
					"Arme basique moyenne et courte portée de l'Armée Clone.",
					"",
					"blasterdc15s",
					0,
					0,
					null,
					ElementColor.blue,
					"blasterdc15s2",
					"blasterdc15s1");
	}

	public static ElementInfo getTestJediCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Test Jedi",
					new String[]{"Test Jedi"}, 
					"Ecran portable Jedi utilisé par les membre de l'Ordre Jedi afin de tester les candidats potentiels.",
					"",
					"testjedi",
					0,
					0,
					null,
					ElementColor.blue,
					"testjedi2",
					"testjedi1");
	}

	public static ElementInfo getKamaCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kama",
					new String[]{"Kama"}, 
					"Les kamas, souvent appelés basiquement « jupes », étaient une ornementation associée à une armure individuelle.",
					"",
					"kama",
					0,
					0,
					null,
					ElementColor.blue,
					"kama1",
					"kama2");
	}

	public static ElementInfo getJetpackZ6Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jetpack Z-6",
					new String[]{"Jetpack Z-6"}, 
					"Modèle de Jetpack produit par Mitinomon Transport, ce modèle fut largement utilisé par les Mandaloriens.",
					"",
					"jetpackz6",
					0,
					0,
					null,
					ElementColor.blue,
					"jetpackz61",
					"jetpackz62");
	}

	public static ElementInfo getJetpackJT12Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jetpack JT-12",
					new String[]{"Jetpack JT-12"}, 
					"Produit par Merr-Sonn Munitions, Inc sous la République Galactique, le Jetpack JT-12 fut un équipement particulièrement apprécié par les diverses factions Mandaloriennes.",
					"",
					"jetpackjt12",
					0,
					0,
					null,
					ElementColor.blue,
					"jetpackjt121",
					"jetpackjt122");
	}

	public static ElementInfo getHolocronCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Holocron",
					new String[]{"Holocron", "Holocron Sith", "Holocron Jedi"}, 
					"L'holocron fut un artefact éducatif très précieux utilisé par l'Ordre Jedi et par l'Ordre Sith, permettant de stocker des données et d'enseigner certaines pratiques à des utilisateurs de la Force.",
					"",
					"holocron",
					0,
					0,
					null,
					ElementColor.blue,
					"holocron3",
					"holocron2");
	}

	public static ElementInfo getHolonetCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Holonet",
					new String[]{"Holonet", "HoloNet", "holonet"}, 
					"L'Holonet est un système de communication utilisé dans la République Galactique et son successeur, l'Empire Galactique.",
					"",
					"holonet",
					0,
					0,
					null,
					ElementColor.blue,
					"holonet1");
	}

	public static ElementInfo getElectrobinoculaireCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Electro-binoculaire",
					new String[]{"Electro-binoculaire"}, 
					"Ces jumelles sont des objets communément utilisées dans la galaxie. Il en existe de toute tailles et offrent une portée de vue intéressante.",
					"",
					"jumelle",
					0,
					0,
					null,
					ElementColor.blue,
					"jumelle1");
	}

	public static ElementInfo getCuveabactaCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Cuve à bacta",
					new String[]{"Cuve à bacta", "bacta", "cuve à bacta"}, 
					"La cuve à bacta fut le principal mode de traitement des blessés graves par administration systémique du fluide guérisseur le plus utilisé dans la galaxie : le bacta.",
					"",
					"cuvebacta",
					0,
					0,
					null,
					ElementColor.blue,
					"cuvebacta1");
	}

	public static ElementInfo getCreditGalactiqueCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Crédit Galactique",
					new String[]{"Crédit Galactique", "crédit", "crédits", "crédit galactique", "crédits galactiques"}, 
					"Le Crédit fut l'argent utilisé couramment comme monnaie d'échange dans la galaxie.",
					"",
					"credit",
					0,
					0,
					null,
					ElementColor.blue,
					"credit1",
					"credit2");
	}

	public static ElementInfo getComlinkCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Comlink",
					new String[]{"Comlink"}, 
					"Le comlink fut un équipement de base pour les habitants de la galaxie leur permettant de communiquer facilement à des kilomètres de distance.",
					"",
					"comlink",
					0,
					0,
					null,
					ElementColor.blue,
					"comlink1",
					"comlink2");
	}

	public static ElementInfo getHyperpropulsionCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Hyperpropulsion",
					new String[]{"Hyperpropulsion"}, 
					"Technologie très complexe dans son paramétrage permettant à un appareil de se déplacer dans l'hyperespace, permettant de traverser la galaxie en quelques jours.",
					"",
					"hyperpropulsion",
					0,
					0,
					null,
					ElementColor.blue,
					"hyperespace2",
					"hyperespace1",
					"hyperespace3");
	}

	public static ElementInfo getPropulsionCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Propulsion",
					new String[]{"Propulsion"}, 
					"La propulsion subliminique permet aux vaisseaux de voyager à vitesse élevée. Cette vitesse n'est enclenchée qu'une fois le vaisseau éloigné des foules qui pourraient souffrir de la radioactivité.",
					"",
					"propulsion",
					0,
					0,
					null,
					ElementColor.blue,
					"propulsion1",
					"propulsion2");
	}

	public static ElementInfo getRepulsionCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Répulsion",
					new String[]{"Répulsion"}, 
					"Sans doute l'une des technologies les plus communément employées, elle assure via des dispositifs antigravitationnels la sustentation d'un appareil.",
					"",
					"repulsion",
					0,
					0,
					null,
					ElementColor.blue,
					"repulsion2",
					"repulsion1");
	}

	public static ElementInfo getBouclierdeflecteurCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bouclier déflecteur",
					new String[]{"Bouclier déflecteur", "bouclier déflecteur"}, 
					"Egalement appellé écran bouclier, un bouclier déflecteur est un champs d'énergie produit par un générateur de bouclier. Il peut s'étendre d'un individu à une planète entière. ",
					"",
					"bouclier",
					0,
					0,
					null,
					ElementColor.blue,
					"bouclier1");
	}

	public static ElementInfo getAnneauahyperpropulsionCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Anneau à hyperpropulsion",
					new String[]{"Anneau à hyperpropulsion"}, 
					"Le port hyperdrive, ou l'anneau hyperdrive, est un instrument permettant à certains vaisseaux de voyager à la vitesse de la lumière.",
					"",
					"hyperdrivering",
					0,
					0,
					null,
					ElementColor.blue,
					"hyperdrivering2",
					"hyperdrivering1");
	}

	public static ElementInfo getMinerauxCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Minéraux",
					new String[]{"Minéraux", "inéraux", "minéral"}, 
					"Un minéral est une substance inorganique, formée naturellement ou synthétisée artificiellement.",
					"",
					"textures",
					0,
					0,
					null,
					ElementColor.blue,
					"gas1");
	}

	public static ElementInfo getMetauxCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Métaux",
					new String[]{"Métaux"}, 
					"Les métaux sont une classe de matériaux très utilisés dans de nombreux domaines.",
					"",
					"metaux",
					0,
					0,
					null,
					ElementColor.blue,
					"gas1");
	}

	public static ElementInfo getGazCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Gaz",
					new String[]{"Gaz"}, 
					"Ensemble d'atomes ou de molécules très faiblement liés et quasi indépendants.",
					"",
					"gaz",
					0,
					0,
					null,
					ElementColor.blue,
					"gas1");
	}

	public static ElementInfo getZygerriaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Zygerria",
					new String[]{"Zygerria"}, 
					"Zygerria est une planète qui se trouve dans le secteur Chorlien, dans la Bordure Extérieure.",
					"",
					"zygerria",
					0,
					0,
					null,
					ElementColor.blue,
					"zygerria1",
					"zygerria2");
	}

	public static ElementInfo getZeltrosLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Zeltros",
					new String[]{"Zeltros"}, 
					"Zeltros fut la planète natale des hédonistes Zeltrons. Cette planète touristique est à l'image de ses habitants.",
					"",
					"zeltroslegends",
					0,
					0,
					null,
					ElementColor.blue,
					"zeltros1",
					"zeltros2");
	}

	public static ElementInfo getYavinIVClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Yavin IV",
					new String[]{"Yavin IV"}, 
					"Quatrième lune de la géante gazeuse Yavin, Yaving IV fut le théatre de nombreux évènements durant toute son histoire.",
					"",
					"yavin4classic",
					0,
					0,
					null,
					ElementColor.blue,
					"yavin1",
					"yavin2");
	}

	public static ElementInfo getYavinIVLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Yavin IV",
					new String[]{"Yavin IV"}, 
					"Quatrième lune de la géante gazeuse Yavin, Yaving IV fut le théatre de nombreux évènements durant toute son histoire.",
					"",
					"yavin4legends",
					0,
					0,
					null,
					ElementColor.blue,
					"yavin1",
					"yavin2");
	}

	public static ElementInfo getWaylandLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Wayland",
					new String[]{"Wayland"}, 
					"Wayland est située dans le système du même nom situé à la limite de la Bordure Bédiane et de la Bordure Extérieure, à proximité de la route commerciale Hydienne.",
					"",
					"waylandlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"wayland1",
					"wayland2");
	}

	public static ElementInfo getVossLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Voss",
					new String[]{"Voss"}, 
					"Planète située dans le système Voss dans la Bordure Extérieure, elle est habitée par les Voss et les Gormak. Cette planète fut découverte tardivement vers 3653 av. BY.",
					"",
					"vosslegends",
					0,
					0,
					null,
					ElementColor.blue,
					"voss1",
					"voss2");
	}

	public static ElementInfo getVjunLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Vjun",
					new String[]{"Vjun"}, 
					"Vjun est la principale planète du système Vjun, dans le secteur Auril. Cette planète est imprégné par le Côté Obscur. ",
					"",
					"vjunlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"kiros1",
					"vjun2");
	}

	public static ElementInfo getVanqorClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Vanqor",
					new String[]{"Vanqor"}, 
					"Vanqor est une planète située dans la Bordure Extérieure au sein du système Uziel.",
					"",
					"vanqorclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"vanqor1",
					"vanqor2");
	}

	public static ElementInfo getVanqorLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Vanqor",
					new String[]{"Vanqor"}, 
					"Vanqor est une planète située dans la Bordure Extérieure au sein du système Uziel.",
					"",
					"vanqorlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"vanqor1",
					"vanqor2");
	}

	public static ElementInfo getUmbaraClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Umbara",
					new String[]{"Umbara"}, 
					"Planète ténébreuse du secteur Fantôme, elle est le berceau des Umbarans. Les rayons du soleil local n'atteignent jamais complêtement la surface de la planète. ",
					"",
					"umbara",
					0,
					0,
					null,
					ElementColor.blue,
					"umbara1",
					"umbara2");
	}

	public static ElementInfo getTythonLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tython",
					new String[]{"Tython"}, 
					"Située au plus profond du Noyau Profond, cette planète accueilla les ancêtres des Jedi et fut le théatre de leur premier contact avec la Force. ",
					"",
					"tythonlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"tython1",
					"tython2");
	}

	public static ElementInfo getThuleLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Thule",
					new String[]{"Thule"}, 
					"Monde aride de la Bordure Extérieure, cette planète fut très souvent affiliée à l'Ordre Sith. ",
					"",
					"thulelegends",
					0,
					0,
					null,
					ElementColor.blue,
					"thule1",
					"thule2");
	}

	public static ElementInfo getTethClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Teth",
					new String[]{"Teth"}, 
					"Teth fut une planète située dans la Bordure Extérieure, entre l'Espace Hutt et le secteur Corporatiste.",
					"",
					"teth",
					0,
					0,
					null,
					ElementColor.blue,
					"teth1",
					"teth2");
	}

	public static ElementInfo getTatooineClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tatooine",
					new String[]{"Tatooine"}, 
					"La planète Tatooine fut un monde situé dans le secteur Arkanis, peu connu et éloigné au sein de la Bordure Extérieure.",
					"",
					"tatooineclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"tatooine1",
					"tatooine2",
					"tatooine3");
	}

	public static ElementInfo getTatooineLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tatooine",
					new String[]{"Tatooine"}, 
					"La planète Tatooine fut un monde situé dans le secteur Arkanis, peu connu et éloigné au sein de la Bordure Extérieure.",
					"",
					"tatooinelegends",
					0,
					0,
					null,
					ElementColor.blue,
					"tatooine1",
					"tatooine2",
					"tatooine3");
	}

	public static ElementInfo getTarisLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Taris",
					new String[]{"Taris"}, 
					"Taris se situait dans le système Taris, à l'intérieur du secteur Ojoster, dans la Bordure Extérieure. Cette planète-cité alliée à la République fut bombardée durant la Guerre Civile des Jedi. ",
					"",
					"tarislegends",
					0,
					0,
					null,
					ElementColor.blue,
					"taris1",
					"taris2",
					"taris3");
	}

	public static ElementInfo getTaivasLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Taivas",
					new String[]{"Taivas"}, 
					"Taivas fut l'une des planètes du système Zhar, situé dans la Bordure Extérieure. Un Temple Jedi y fut bâti durant la Guerre Sitho-Impériale.",
					"",
					"taivaslegends",
					0,
					0,
					null,
					ElementColor.blue,
					"taivas1",
					"taivas2");
	}

	public static ElementInfo getSerennoClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Serenno",
					new String[]{"Serenno"}, 
					"Monde de la Bordure Extérieure basé sur un régime aristocratique dont fut issu le Comte Dooku.",
					"",
					"serennoclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"serenno1",
					"serenno2");
	}

	public static ElementInfo getSerennoLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Serenno",
					new String[]{"Serenno"}, 
					"Monde de la Bordure Extérieure basé sur un régime aristocratique dont fut issu le Comte Dooku.",
					"",
					"serennolegends",
					0,
					0,
					null,
					ElementColor.blue,
					"serenno1",
					"carannia1");
	}

	public static ElementInfo getSaleucamiClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Saleucami",
					new String[]{"Saleucami"}, 
					"Monde appartenant au Techno Syndicat dans la Bordure Extérieure. Elle est la seule planète habitable de son système.",
					"",
					"saleucamiclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"saleucami1",
					"saleucami2");
	}

	public static ElementInfo getSaleucamiLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Saleucami",
					new String[]{"Saleucami"}, 
					"Monde appartenant au Techno Syndicat dans la Bordure Extérieure; elle abrita un projet secret de clonage pour la C. S. I. durant la Guerre des Clones. ",
					"",
					"saleucamilegends",
					0,
					0,
					null,
					ElementColor.blue,
					"saleucami1",
					"saleucami2");
	}

	public static ElementInfo getRylothClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ryloth",
					new String[]{"Ryloth"}, 
					"Ryloth est la planète natale des Twi'leks, située dans la Bordure Extérieure, dont l'une des faces est en permanence exposée à la lumière du soleil, et l'autre plongée dans l'obscurité.",
					"",
					"rylothclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"ryloth1",
					"ryloth2");
	}

	public static ElementInfo getRylothLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ryloth",
					new String[]{"Ryloth"}, 
					"Ryloth est la planète natale des Twi'leks, située dans la Bordure Extérieure, dont l'une des faces est en permanence exposée à la lumière du soleil, et l'autre plongée dans l'obscurité.",
					"",
					"rylothlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"ryloth1",
					"ryloth2");
	}

	public static ElementInfo getRuusanClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ruusan",
					new String[]{"Ruusan"}, 
					"Planète à l'écart des affaires politiques, elle se situe dans la Bordure Médianne. ",
					"",
					"ruusanclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"ruusan1",
					"ruusan2");
	}

	public static ElementInfo getRuusanLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ruusan",
					new String[]{"Ruusan"}, 
					"Située dans la Bordure Moyenne, Ruusan fut une planète dévastée lors des Nouvelles Guerres Sith. Elle abrite en la Vallée des Jedi.",
					"",
					"ruusanlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"ruusan1",
					"ruusan2",
					"newsithwars2");
	}

	public static ElementInfo getRodiaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Rodia",
					new String[]{"Rodia"}, 
					"Rodia fut une planète située dans le système Tyrius. C'est le monde d'origine des Rodiens.",
					"",
					"rodialegends",
					0,
					0,
					null,
					ElementColor.blue,
					"rodia1",
					"rodia2");
	}

	public static ElementInfo getRodiaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Rodia",
					new String[]{"Rodia"}, 
					"Rodia fut une planète située dans le système Tyrius. C'est le monde d'origine des Rodiens.",
					"",
					"rodiaclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"rodia1",
					"rodia2");
	}

	public static ElementInfo getRhenVarLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Rhen Var",
					new String[]{"Rhen Var"}, 
					"Rhen Var fut une planète du système Tobali dans le secteur de Tion, située dans la Bordure Extérieure.",
					"",
					"rhenvarlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"rhenvar1",
					"rhenvar2");
	}

	public static ElementInfo getRendiliLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Rendili",
					new String[]{"Rendili"}, 
					"Rendili fut la principale planète du système de Rendili dans les Mondes du Noyau.",
					"",
					"rendililegends",
					0,
					0,
					null,
					ElementColor.blue,
					"rendili1",
					"rendili2");
	}

	public static ElementInfo getRaydoniaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Raydonia",
					new String[]{"Raydonia"}, 
					"Raydonia fut une petite planète peu influente de la Bordure Extérieure. ",
					"",
					"raydonia",
					0,
					0,
					null,
					ElementColor.blue,
					"raydonia1",
					"raydonia2");
	}

	public static ElementInfo getRaxusPrimeLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Raxus Prime",
					new String[]{"Raxus Prime"}, 
					"Important centre industriel durant la Guerre des Clones, Raxus Prime devint par la suite une poubelle galactique emplie de déchets.",
					"",
					"raxusprimelegends",
					0,
					0,
					null,
					ElementColor.blue,
					"raxusprime1",
					"raxusprime2");
	}

	public static ElementInfo getRattatakLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Rattatak",
					new String[]{"Rattatak"}, 
					"Rattatak fut la planète principale du système de Rattatak, dans la Bordure Extérieure. Cette planète fut quasiment inconnue du temps de la Guerre des Clones.",
					"",
					"rattataklegends",
					0,
					0,
					null,
					ElementColor.blue,
					"rattatak1",
					"rattatak2");
	}

	public static ElementInfo getRalltiirLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ralltiir",
					new String[]{"Ralltiir"}, 
					"Ralltiir fut une planète des Mondes du Noyau se situant le long de la Route Perlmienne dans le Secteur Darpa. C'est ici que le projet d'Etoile de la Mort fut découvert.",
					"",
					"ralltiirlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"ralltiir1",
					"ralltiir2");
	}

	public static ElementInfo getPraesitlynLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Praesitlyn",
					new String[]{"Praesitlyn"}, 
					"Praesitlyn fut la principale planète du système de Praesitlyn, dans le secteur Sluis, au Sud galactique.",
					"",
					"praesitlynlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"praesitlyn1",
					"praesitlyn2");
	}

	public static ElementInfo getPolisMassaCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Polis Massa",
					new String[]{"Polis Massa"}, 
					"Polis Massa est un astéroïde perdu dans la Bordure Extérieure, vestige d'une ancienne planète.",
					"",
					"polismassa",
					0,
					0,
					null,
					ElementColor.blue,
					"polismassa1",
					"polismassa2");
	}

	public static ElementInfo getPatititePattunaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Patitite Pattuna",
					new String[]{"Patitite Pattuna"}, 
					"Patitite Pattuna fut une planète qui se situait dans la Bordure Médiane, à côté de la planète Balnab.",
					"",
					"patititepattuna",
					0,
					0,
					null,
					ElementColor.blue,
					"patititepattuna1",
					"patititepattuna2");
	}

	public static ElementInfo getOssusLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ossus",
					new String[]{"Ossus"}, 
					"Ossus est une planète de la Bordure Extérieure située dans le secteur d'Auril. Connue pour avoir hébergé l'un des premiers temples Jedi du temps de l'Ancienne République. ",
					"",
					"ossuslegends",
					0,
					0,
					null,
					ElementColor.blue,
					"ossus1",
					"ossus2");
	}

	public static ElementInfo getOrtoPlutoniaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Orto Plutonia",
					new String[]{"Orto Plutonia"}, 
					"Orto Plutonia fut une planète située dans le système de Pantora, lui-même dans le secteur Sujimis.",
					"",
					"ortoplutonia",
					0,
					0,
					null,
					ElementColor.blue,
					"ortoplutonia1",
					"ortoplutonia2");
	}

	public static ElementInfo getOrdMantellLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ord Mantell",
					new String[]{"Ord Mantell"}, 
					"Ord Mantell est localisée dans un coin reculé de la Bordure Médiane dans le secteur du Joyau Brillant.",
					"",
					"ordmantelllegends",
					0,
					0,
					null,
					ElementColor.blue,
					"ordmantel1",
					"ordmantell2");
	}

	public static ElementInfo getOrdCestusLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ord Cestus",
					new String[]{"Ord Cestus"}, 
					"Ord Cestus fut une planète de la Bordure Extérieure qui a longtemps servi de planète-prison.",
					"",
					"ordcestuslegends",
					0,
					0,
					null,
					ElementColor.blue,
					"ordcestus1");
	}

	public static ElementInfo getOrondiaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Orondia",
					new String[]{"Orondia"}, 
					"Planète localisé dans la Bordure Extérieure, proche de Nal Hutta. ",
					"",
					"orondia",
					0,
					0,
					null,
					ElementColor.blue,
					"orondia1",
					"orondia2");
	}

	public static ElementInfo getOnderonClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Onderon",
					new String[]{"Onderon"}, 
					"Onderon est une planète prospère du système Japrael dans la Bordure Intérieure.",
					"",
					"onderonclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"onderon1",
					"onderon2");
	}

	public static ElementInfo getOnderonLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Onderon",
					new String[]{"Onderon"}, 
					"Onderon est une planète prospère du système Japrael dans la Bordure Intérieure.",
					"",
					"onderonlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"onderon1",
					"onderon2");
	}

	public static ElementInfo getObaDiahClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Oba Diah",
					new String[]{"Oba Diah"}, 
					"Oba Diah fut une planète située dans la Bordure Extérieure, peuplée par les Pykes et le Syndicat Pyke, organisation très puissante gérant le trafic d'épices.",
					"",
					"obadiahclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"obadiah1",
					"obadiah2");
	}

	public static ElementInfo getNewHolsticeLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"New Holstice",
					new String[]{"New Holstice"}, 
					"New Holstice fut une planète-hôpital de la Bordure Moyenne, située entre Belderone et Roche.",
					"",
					"newholsticelegends",
					0,
					0,
					null,
					ElementColor.blue,
					"newholtice1",
					"newholtice2");
	}

	public static ElementInfo getNelvaanLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nelvaan",
					new String[]{"Nelvaan"}, 
					"Nelvaan fut une planète du système de Koobi, dans le secteur Arkanis. Planète sans grand intérêt au premier abord et habité par des primitifs.",
					"",
					"nelvaanlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"nelvaan1",
					"nelvaan2");
	}

	public static ElementInfo getNarShaddaaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nar Shaddaa",
					new String[]{"Nar Shaddaa"}, 
					"Lune de Nal Hutta et, de tout temps, repaires des malandrins les plus infâmes de toute la galaxie.",
					"",
					"narshaddaalegends",
					0,
					0,
					null,
					ElementColor.blue,
					"narshaddaa1",
					"narshaddaa2");
	}

	public static ElementInfo getNarShaddaaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nar Shaddaa",
					new String[]{"Nar Shaddaa"}, 
					"Lune de Nal Hutta et, de tout temps, repaires des malandrins les plus infâmes de toute la galaxie.",
					"",
					"narshaddaaclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"narshaddaa1",
					"narshaddaa3");
	}

	public static ElementInfo getNalHuttaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nal Hutta",
					new String[]{"Nal Hutta"}, 
					"Nal Hutta fut une planète de la Bordure Moyenne dans le système Y'Toub.",
					"",
					"nalhuttalegends",
					0,
					0,
					null,
					ElementColor.blue,
					"nalhutta1",
					"nalhutta2");
	}

	public static ElementInfo getNagiLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nagi",
					new String[]{"Nagi"}, 
					"Nagi fut une planète localisée dans les profondeurs des Régions Inconnues et plus particulièrement dans une galaxie naine appelée Poing de Feu qui orbitait autour de la Galaxie connue.",
					"",
					"nagilegends",
					0,
					0,
					null,
					ElementColor.blue,
					"nagi1");
	}

	public static ElementInfo getCymoon1Classic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Cymoon 1",
					new String[]{"Cymoon 1"}, 
					"Cymoon 1 était une lune située dans le Pôle Industriel Corellien disposant d'une usine d'armement impériale.",
					"",
					"cymoonclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"cymoon1");
	}

	public static ElementInfo getSullustClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sullust",
					new String[]{"Sullust"}, 
					"Situé en bordure extérieure, Sullust était la principale planète du système Sullust.",
					"",
					"sullustclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"sullust1",
					"sullust2");
	}

	public static ElementInfo getNZothLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"N'Zoth",
					new String[]{"N'Zoth"}, 
					"N'zoth est une planète des Mondes du Noyau situé dans l'Amas de Koornacht proche de J't'p'tan. C'est la planète d'origine des Yevethas.",
					"",
					"nzoth",
					0,
					0,
					null,
					ElementColor.blue,
					"nzoth1");
	}

	public static ElementInfo getNabooClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Naboo",
					new String[]{"Naboo"}, 
					"Naboo fut une planète pacifique de la Bordure Médiane et le monde d'origine de Sheev Palpatine, Padmé Naberrie et Jar Jar Binks.",
					"",
					"nabooclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"naboo1",
					"naboo2",
					"nabooinvasion");
	}

	public static ElementInfo getNabooLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Naboo",
					new String[]{"Naboo"}, 
					"Naboo fut une planète pacifique de la Bordure Médiane et le monde d'origine de Sheev Palpatine, Padmé Naberrie et Jar Jar Binks.",
					"",
					"naboolegends",
					0,
					0,
					null,
					ElementColor.blue,
					"naboo1",
					"naboo2",
					"naboo3",
					"nabooinvasion");
	}

	public static ElementInfo getMuunilinstLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Muunilinst",
					new String[]{"Muunilinst"}, 
					"Planète extrêment riche, elle est le poumon financier de la galaxie et le monde natal des Muuns.",
					"",
					"muunilinst",
					0,
					0,
					null,
					ElementColor.blue,
					"muunilinst1",
					"muunilinst2");
	}

	public static ElementInfo getMustafarCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mustafar",
					new String[]{"Mustafar"}, 
					"Mustafar, planète désolée de la Bordure Extérieure qui est essentiellement recouverte de lave et de roches volcaniques.",
					"",
					"mustafar",
					0,
					0,
					null,
					ElementColor.blue,
					"mustafar1",
					"mustafar2");
	}

	public static ElementInfo getMortisClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mortis",
					new String[]{"Mortis"}, 
					"Planète inclue dans un monolith localisé dans le système Chrelythiumn. Elle fut le foyer de la Famille.",
					"",
					"mortis",
					0,
					0,
					null,
					ElementColor.blue,
					"mortis1",
					"mortis2");
	}

	public static ElementInfo getMonCalamariClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mon Calamari",
					new String[]{"Mon Calamari"}, 
					"Mon Calamari est une planète-océan, monde natal des Mon Calamari et des Quarrens.",
					"",
					"moncalamariclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"moncalamari1",
					"moncalamari2");
	}

	public static ElementInfo getMonCalamariLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mon Calamari",
					new String[]{"Mon Calamari", "Dac", "DAC"}, 
					"Mon Calamari est une planète-océan, monde natal des Mon Calamari et des Quarrens.",
					"",
					"moncalamarilegends",
					0,
					0,
					null,
					ElementColor.blue,
					"moncalamari1",
					"moncalamari2",
					"devastator3");
	}

	public static ElementInfo getManaanLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Manaan",
					new String[]{"Manaan"}, 
					"Planète océane florissante du système Pyrshak au temps de la République, hélas tombée dans l'oubli. ",
					"",
					"manaanlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"manaan1",
					"manaan2");
	}

	public static ElementInfo getMandaloreClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mandalore",
					new String[]{"Mandalore"}, 
					"Mandalore, ou Manda'yaim en Mando'a, fut la planète principale du secteur Mandalore au sein de la Bordure Extérieure. Berceau des puissants guerriers Mandaloriens.",
					"",
					"mandaloreclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"mandalore1",
					"mandalore2");
	}

	public static ElementInfo getMandaloreLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mandalore",
					new String[]{"Mandalore"}, 
					"Mandalore, ou Manda'yaim en Mando'a, fut la planète principale du secteur Mandalore au sein de la Bordure Extérieure. Berceau des puissants guerriers Mandaloriens.",
					"",
					"mandalorelegends",
					0,
					0,
					null,
					ElementColor.blue,
					"mandalore1",
					"mandalore2");
	}

	public static ElementInfo getMalastareClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Malastare",
					new String[]{"Malastare"}, 
					"Malastare est une planète de la Bordure Médiane qui fut peuplée à la fois par les Dugs et par les Grans.",
					"",
					"malastareclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"malastare1",
					"malastare2");
	}

	public static ElementInfo getMalastareLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Malastare",
					new String[]{"Malastare"}, 
					"Malastare est une planète de la Bordure Médiane qui fut peuplée à la fois par les Dugs et par les Grans.",
					"",
					"malastarelegends",
					0,
					0,
					null,
					ElementColor.blue,
					"malastare1",
					"podracer1");
	}

	public static ElementInfo getMalachorVLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Malachor V",
					new String[]{"Malachor V"}, 
					"Malachor V est une planète du système de Malachor dans la Bordure Extérieure. La planète fut disloquée durant la Guerre Civile des Jedi.",
					"",
					"malachorvlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"malachorv1",
					"malachorv2");
	}

	public static ElementInfo getLothalClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Lothal",
					new String[]{"Lothal"}, 
					"Lothal est une planète située dans la Bordure Extérieure. C'est une planète majoritairement constituée de fermes et d'élevages.",
					"",
					"lothalclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"lothal1",
					"lothal2");
	}

	public static ElementInfo getLolaSayuCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Lola Sayu",
					new String[]{"Lola Sayu"}, 
					"Planète de la Bordure Extérieure du secteur Belderone. Connue pour son centre pénitencier pour Jedi durant la Guerre des Clones.",
					"",
					"lolasayu",
					0,
					0,
					null,
					ElementColor.blue,
					"lolasayu1");
	}

	public static ElementInfo getKorribanLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Korriban",
					new String[]{"Korriban"}, 
					"Korriban, appelée Pesegam à l'origine, fut une planète isolée du système Horuset, dans la Bordure Extérieure.",
					"",
					"korribanlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"korriban1",
					"korriban2");
	}

	public static ElementInfo getZiostLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ziost",
					new String[]{"Ziost"}, 
					"Planète gelée, capitale de l'Ancien Empire Sith, qui abritait la citadelle des Sith, et où siégeaient les Seigneurs Noirs.",
					"",
					"ziost",
					0,
					0,
					null,
					ElementColor.blue,
					"ziost1",
					"ziost2");
	}

	public static ElementInfo getKirosClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kiros",
					new String[]{"Kiros"}, 
					"Kiros est une planète située dans la Région en Expansion.",
					"",
					"kirosclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"kiros1",
					"kiros2");
	}

	public static ElementInfo getKesselClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kessel",
					new String[]{"Kessel"}, 
					"Kessel est située dans le système Kessa - près d'Honoghr - dans la Bordure Extérieure.",
					"",
					"kesselclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"kessel1");
	}

	public static ElementInfo getKesselLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kessel",
					new String[]{"Kessel"}, 
					"Kessel est située dans le système Kessa - près d'Honoghr - dans la Bordure Extérieure.",
					"",
					"kessellegends",
					0,
					0,
					null,
					ElementColor.blue,
					"kessel1");
	}

	public static ElementInfo getKashyyykClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kashyyyk",
					new String[]{"Kashyyyk"}, 
					"La verdoyante planète de Kashyyyk fut un monde qui regorge de mystères et de dangers. Berceau des vaillants Wookiees.",
					"",
					"kashyyykclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"kashyyyk1",
					"kashyyyk2",
					"tarfful2");
	}

	public static ElementInfo getKashyyykLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kashyyyk",
					new String[]{"Kashyyyk"}, 
					"La verdoyante planète de Kashyyyk fut un monde qui regorge de mystères et de dangers. Berceau des vaillants Wookiees.",
					"",
					"kashyyyklegends",
					0,
					0,
					null,
					ElementColor.blue,
					"kashyyyk1",
					"kashyyyk2",
					"tarfful2");
	}

	public static ElementInfo getKaminoClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kamino",
					new String[]{"Kamino"}, 
					"Kamino est une planète-océan de la Bordure Extérieure, où habitent les Kaminoens, une espèce intelligente de généticiens.",
					"",
					"kaminoclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"kamino1",
					"kamino2");
	}

	public static ElementInfo getKaminoLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kamino",
					new String[]{"Kamino"}, 
					"Kamino est une planète-océan de la Bordure Extérieure, où habitent les Kaminoens, une espèce intelligente de généticiens.",
					"",
					"kaminolegends",
					0,
					0,
					null,
					ElementColor.blue,
					"kamino1",
					"kamino2");
	}

	public static ElementInfo getJabiimLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jabiim",
					new String[]{"Jabiim"}, 
					"Cette planète de la Bordure Extérieure fut connut pour son mauvais temps et ses batailles aux allures de carnages durant la Guerre des Clones.",
					"",
					"jabiimlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"jabiim1",
					"jabiim2");
	}

	public static ElementInfo getIllumClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Illum",
					new String[]{"Illum"}, 
					"Ilum fut une planète gelée, à l'instar de Hoth, des Régions Inconnues.",
					"",
					"ilumclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"illum1",
					"illum2");
	}

	public static ElementInfo getIllumLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Illum",
					new String[]{"Illum"}, 
					"Ilum fut une planète gelée, à l'instar de Hoth, des Régions Inconnues, non loin de l'Empire Chiss.",
					"",
					"ilumlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"illum1",
					"illum2");
	}

	public static ElementInfo getIegoClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Iego",
					new String[]{"Iego"}, 
					"Iego fut une planète très particulière située au sein de la nébuleuse Extrictarium dans la Bordure Extérieure, non loin de la route commerciale Perlemienne.",
					"",
					"iegoclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"iego1",
					"iego2");
	}

	public static ElementInfo getIegoLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Iego",
					new String[]{"Iego"}, 
					"Iego fut une planète très particulière située au sein de la nébuleuse Extrictarium dans la Bordure Extérieure, non loin de la route commerciale Perlemienne.",
					"",
					"iegolegends",
					0,
					0,
					null,
					ElementColor.blue,
					"iego1",
					"iego2");
	}

	public static ElementInfo getHothClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Hoth",
					new String[]{"Hoth"}, 
					"Hoth est la sixième planète du système du même nom, située dans le corridor d'Ison à proximité de la route corellienne dans Secteur d'Anoat de la Bordure Extérieure.",
					"",
					"hothclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"hoth1",
					"hoth2");
	}

	public static ElementInfo getHothLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Hoth",
					new String[]{"Hoth"}, 
					"Hoth est la sixième planète du système du même nom, située dans le corridor d'Ison à proximité de la route corellienne dans Secteur d'Anoat de la Bordure Extérieure.",
					"",
					"hothlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"hoth1",
					"hoth2");
	}

	public static ElementInfo getHapesLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Hapes",
					new String[]{"Hapes"}, 
					"Située près du centre de l'Amas de Hapes, la planète constituait avec Kavan, le système de Hapes.",
					"",
					"hapeslegends",
					0,
					0,
					null,
					ElementColor.blue,
					"hapes1",
					"hapes2");
	}

	public static ElementInfo getHadAbbadonLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Had Abbadon",
					new String[]{"Had Abbadon"}, 
					"Had Abbadon fut une ancienne planète mythique, perdue dans la région du Noyau Profond.",
					"",
					"hadabbadonlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"hadabbadon1",
					"hadabbadon2");
	}

	public static ElementInfo getGolmClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Golm",
					new String[]{"Golm"}, 
					"Golm, nommée aussi Bothawui Prime, fut une géante gazeuse située dans le système Both.",
					"",
					"golm",
					0,
					0,
					null,
					ElementColor.blue,
					"golm1");
	}

	public static ElementInfo getDQarClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"D'Qar",
					new String[]{"D'Qar"}, 
					"Planète de la Bordure Extérieure hébergeant la Résistance durant l'avènement du Premier Ordre face à la Nouvelle République.",
					"",
					"dqar",
					0,
					0,
					null,
					ElementColor.blue,
					"dqar1");
	}

	public static ElementInfo getGeonosisClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Géonosis",
					new String[]{"Géonosis"}, 
					"Monde désertique et torride situé sur la Bordure Extérieure. Son seul intéret stratégique se résumait à ses usines à droïdes durant la Guerre des Clones.",
					"",
					"geonosisclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"geonosis1",
					"geonosis2");
	}

	public static ElementInfo getGeonosisLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Géonosis",
					new String[]{"Géonosis"}, 
					"Monde désertique et torride situé sur la Bordure Extérieure. Son seul intéret stratégique se résumait à ses usines à droïdes durant la Guerre des Clones. ",
					"",
					"geonosislegends",
					0,
					0,
					null,
					ElementColor.blue,
					"geonosis1",
					"geonosis2");
	}

	public static ElementInfo getGamorrCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Gamorr",
					new String[]{"Gamorr"}, 
					"Gamorr se situe dans le système d'Opoku, dans la Bordure Extérieure. Il s'agit de la planète d'origine des très charmant Gamorreens.",
					"",
					"gamorr",
					0,
					0,
					null,
					ElementColor.blue,
					"gamorr1",
					"gamorr2");
	}

	public static ElementInfo getFlorrumClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Florrum",
					new String[]{"Florrum"}, 
					"Florrum fut une planète sans intérêt dans le secteur Sertar.",
					"",
					"florrumclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"florrum1",
					"florrum2");
	}

	public static ElementInfo getFeluciaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Felucia",
					new String[]{"Felucia"}, 
					"Panète luxiriante du secteur Thanium dans la Bordure Extérieure.",
					"",
					"feluciaclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"felucia1",
					"felucia2");
	}

	public static ElementInfo getFeluciaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Felucia",
					new String[]{"Felucia"}, 
					"Panète luxiriante du secteur Thanium dans la Bordure Extérieure.",
					"",
					"felucialegends",
					0,
					0,
					null,
					ElementColor.blue,
					"felucia1",
					"felucia2",
					"felucia3");
	}

	public static ElementInfo getEndorClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Endor",
					new String[]{"Endor"}, 
					"La lune forestière de la planète gazeuse Endor (ou Tana) est souvent abrégée Endor, ce qui provoque souvent un amalgame entre la planète originale et sa lune. Elles sont localisées dans le lointain Secteur Moddell, au Sud-Ouest galactique.",
					"",
					"endorclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"endor1",
					"endor2");
	}

	public static ElementInfo getEndorLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Endor",
					new String[]{"Endor"}, 
					"Localisé dans le lointain Secteur Moddell, au Sud-Ouest galactique, cette planète est une géante gazeuse.",
					"",
					"endorlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"endor1",
					"endor2");
	}

	public static ElementInfo getDromundKaasLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dromund Kaas",
					new String[]{"Dromund Kaas"}, 
					"Dromund Kaas fut une planète de l'ancien Empire Sith, puis servi de capitale au Second Empire Sith et enfin fit office de berceau des Prophètes du Côté Obscur.",
					"",
					"dromundkaaslegends",
					0,
					0,
					null,
					ElementColor.blue,
					"dromundkaas1",
					"dromundkaas2");
	}

	public static ElementInfo getDxunLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dxun",
					new String[]{"Dxun"}, 
					"Dxun, aussi connue sous le nom de Lune Démoniaque, est l'un des quatre satellites naturels de la planète Onderon située dans la Bordure Intérieure.",
					"",
					"dxunlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"dxun1",
					"dxun2");
	}

	public static ElementInfo getDevaronLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Devaron",
					new String[]{"Devaron"}, 
					"Devaron fut une planète située non loin de la Voie Marchande Corellienne.",
					"",
					"devaronlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"devaron1",
					"devaron2");
	}

	public static ElementInfo getDathomirLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dathomir",
					new String[]{"Dathomir"}, 
					"Dathomir est une planète de la Bordure Extérieure, située dans le Secteur de Quelii.",
					"",
					"dathomirlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"dathomir1",
					"dathomir2");
	}

	public static ElementInfo getDathomirClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dathomir",
					new String[]{"Dathomir"}, 
					"Dathomir est une planète de la Bordure Extérieure, située dans le Secteur de Quelii.",
					"",
					"dathomirclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"dathomir1",
					"dathomir2");
	}

	public static ElementInfo getDantooineCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dantooine",
					new String[]{"Dantooine"}, 
					"Dantooine fut une planète isolée, recouverte de prairies et de rivières, au coeur du secteur Raioballo, dans la Bordure Extérieure.",
					"",
					"dantooine",
					0,
					0,
					null,
					ElementColor.blue,
					"dantooine1",
					"dantooine2");
	}

	public static ElementInfo getDagobahCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dagobah",
					new String[]{"Dagobah"}, 
					"La planète Dagobah se situe dans le secteur Sluis dans la Bordure Extérieure.",
					"",
					"dagobah",
					0,
					0,
					null,
					ElementColor.blue,
					"dagobah1",
					"dagobah2");
	}

	public static ElementInfo getCsillaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Csilla",
					new String[]{"Csilla"}, 
					"Monde d'origine des Chiss, c'est un monde glacé des Territoires Inconnus.",
					"",
					"csillalegends",
					0,
					0,
					null,
					ElementColor.blue,
					"csilla1",
					"csilla2");
	}

	public static ElementInfo getCoruscantClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Coruscant",
					new String[]{"Coruscant"}, 
					"Coruscant est la planète-capitale de la galaxie, entièrement recouverte par l'urbanisation, siège du pouvoir central galactique.",
					"",
					"coruscantclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"coruscant1",
					"coruscant2");
	}

	public static ElementInfo getCoruscantLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Coruscant",
					new String[]{"Coruscant"}, 
					"Coruscant est la planète-capitale de la galaxie, entièrement recouverte par l'urbanisation, siège du pouvoir central galactique.",
					"",
					"coruscantlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"coruscant1",
					"coruscant2");
	}

	public static ElementInfo getHosnianPrimeClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Hosnian Prime",
					new String[]{"Hosnian Prime"}, 
					"Capitale galactique de la Nouvelle République après Chandrila. Elle fut annihilée par le Premier Ordre.",
					"",
					"hosnianprime",
					0,
					0,
					null,
					ElementColor.blue,
					"hosnianprime1",
					"hosnianprime2");
	}

	public static ElementInfo getJakkuClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jakku",
					new String[]{"Jakku"}, 
					"Planète désertique à la frontière entre les Régions Inconnues.",
					"",
					"jakku",
					0,
					0,
					null,
					ElementColor.blue,
					"jakku1",
					"jakku2");
	}

	public static ElementInfo getCorelliaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Corellia",
					new String[]{"Corellia"}, 
					"Corellia est une planète majeure du Noyau, réputée pour ses chantiers de construction naval et pour son idéologie indépendantiste.",
					"",
					"corellialegends",
					0,
					0,
					null,
					ElementColor.blue,
					"corellia1",
					"corellia2");
	}

	public static ElementInfo getCorbosLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Corbos",
					new String[]{"Corbos"}, 
					"Corbos fut une planète située dans le secteur Sertar, dans la Bordure Extérieure.",
					"",
					"corboslegends",
					0,
					0,
					null,
					ElementColor.blue,
					"corbos1",
					"corbos2");
	}

	public static ElementInfo getConcordiaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Concordia",
					new String[]{"Concordia"}, 
					"Concordia fut une des deux lune de la planète Mandalore, dans le Noyau Extérieur.",
					"",
					"concordiaclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"concordia1",
					"concordia2");
	}

	public static ElementInfo getChristophsisClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Christophsis",
					new String[]{"Christophsis"}, 
					"Christophsis fut une planète de la Bordure Extérieure située dans le secteur de Savareen et le système de Christoph.",
					"",
					"christophsisclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"christophsis1",
					"christophsis2",
					"ahsoka1");
	}

	public static ElementInfo getChandrilaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Chandrila",
					new String[]{"Chandrila"}, 
					"Chandrila est une planète paisible qui se situe dans le secteur Bormea, sur la Route Perlmienne.",
					"",
					"chandrilalegends",
					0,
					0,
					null,
					ElementColor.blue,
					"chandrila1",
					"chandrila2");
	}

	public static ElementInfo getCaridaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Carida",
					new String[]{"Carida"}, 
					"Carida fait partie des mondes du noyau, elle est l'une des cinq planètes du système Carida.",
					"",
					"caridalegends",
					0,
					0,
					null,
					ElementColor.blue,
					"carida1",
					"carida2");
	}

	public static ElementInfo getByssLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Byss",
					new String[]{"Byss"}, 
					"Byss est une planète du Noyau Profond, située à proximité du coeur de la Galaxie. Il s'agit du cinquième monde du Système Beshqek.",
					"",
					"bysslegends",
					0,
					0,
					null,
					ElementColor.blue,
					"byss1",
					"byss2");
	}

	public static ElementInfo getBrentaalIVLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Brentaal IV",
					new String[]{"Brentaal IV"}, 
					"Brentaal IV, généralement appelée Brentaal, est la quatrième planète du système Brentaal dans le secteur Borméa du Noyau Galactique.",
					"",
					"brentaalivlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"brentaal1");
	}

	public static ElementInfo getBozPityLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Boz Pity",
					new String[]{"Boz Pity"}, 
					"Boz Pity est une planète de la Bordure Médiane située entre Bimmisaari et l'Espace Hutt. Elle fut éâtre d'affrontements durant la Guerre des Clones et la Guerre Civile Galactique.",
					"",
					"bozpitylegends",
					0,
					0,
					null,
					ElementColor.blue,
					"bozpity1",
					"bozpity2");
	}

	public static ElementInfo getBespinCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bespin",
					new String[]{"Bespin"}, 
					"Bespin est un monde gazeux du Secteur Anoat, dans la Bordure Extérieure, principalement connu pour sa production très importante de gaz Tibanna et sa célèbre Cité des Nuages.",
					"",
					"bespin",
					0,
					0,
					null,
					ElementColor.blue,
					"bespin1",
					"bespin2",
					"bespin3");
	}

	public static ElementInfo getBastionLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bastion",
					new String[]{"Bastion"}, 
					"Située au cœur du système Sartinaynian, au sein de la Bordure Extérieure.",
					"",
					"bastionlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"bastion1",
					"bastion2");
	}

	public static ElementInfo getBalmorraLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Balmorra",
					new String[]{"Balmorra"}, 
					"Balmorra est l'une des six planètes du système Neevota (ou système Balmorra), située dans les Colonies, proche des Mondes du Noyau.",
					"",
					"balmorralegends",
					0,
					0,
					null,
					ElementColor.blue,
					"balmorra1",
					"balmorra2");
	}

	public static ElementInfo getBakuraLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bakura",
					new String[]{"Bakura"}, 
					"Planète de la Bordure Extérieur, elle fut le lieu de la première trêve entre l'Alliance et l'Empire.",
					"",
					"bakuralegends",
					0,
					0,
					null,
					ElementColor.blue,
					"bakura1",
					"bakura2");
	}

	public static ElementInfo getAquilarisLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Aquilaris",
					new String[]{"Aquilaris"}, 
					"Planète aquatique située dans la Bordure Extérieure, dans le Secteur Grumani.",
					"",
					"aquilarislegends",
					0,
					0,
					null,
					ElementColor.blue,
					"manaan1",
					"aquilaris2");
	}

	public static ElementInfo getAnzatLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Anzat",
					new String[]{"Anzat"}, 
					"Anzat est une planète légendaire de la Bordure Médiane, berceau des Anzatis.",
					"",
					"anzatlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"anzat1");
	}

	public static ElementInfo getAnaxesLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Anaxes",
					new String[]{"Anaxes"}, 
					"Le Défenseur du Noyau. C'est le surnom de la planète Anaxes, monde-forteresse du Système Axum, sous la République Galactique puis l'Empire.",
					"",
					"anaxeslegends",
					0,
					0,
					null,
					ElementColor.blue,
					"anaxes1",
					"anaxes2");
	}

	public static ElementInfo getAnsionLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ansion",
					new String[]{"Ansion"}, 
					"Planète de la Bordure Médiane et proche de Vortex et Bilbringi, localisée dans le corridor Namadii.",
					"",
					"ansionlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"ansion1",
					"ansion2");
	}

	public static ElementInfo getAnoatLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Anoat",
					new String[]{"Anoat"}, 
					"Anoat est l'une des trois planètes habitables du système éponyme, situé dans la Bordure Extérieure, à mi-chemin entre les systèmes Hoth et Bespin.    ",
					"",
					"anoatlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"anoat1",
					"anoat2");
	}

	public static ElementInfo getAmbriaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ambria",
					new String[]{"Ambria"}, 
					"Ambria fut une planète reculée, qui se tient loin de presque tous les événements marquants pour la Galaxie.",
					"",
					"ambrialegends",
					0,
					0,
					null,
					ElementColor.blue,
					"ambria1",
					"ambria2");
	}

	public static ElementInfo getAlderaanCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Alderaan",
					new String[]{"Alderaan"}, 
					"Alderaan est une planète majeure du Noyau, considéré comme l'âme de la République, elle fut détruite par l'Etoile de la Mort.",
					"",
					"alderaan",
					0,
					0,
					null,
					ElementColor.blue,
					"alderaan1",
					"alderaan2");
	}

	public static ElementInfo getOvanisClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ovanis",
					new String[]{"Ovanis"}, 
					"Planète rocheuse de la Bordure Extérieure.",
					"",
					"ovanis",
					0,
					0,
					null,
					ElementColor.blue,
					"ovanis1");
	}

	public static ElementInfo getIbaarClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ibaar",
					new String[]{"Ibaar"}, 
					"Planète de la Bordure Extérieure sous le joug impérial pendant l'Empire.",
					"",
					"ibaar",
					0,
					0,
					null,
					ElementColor.blue,
					"ibaar1");
	}

	public static ElementInfo getAnzatiLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Anzati",
					new String[]{"Anzati"}, 
					"Les Anzatis, également appelés Anzats, sont de dangereux proche-humains sensibles à la Force, originaires de la planète Anzat.",
					"",
					"anzati",
					0,
					0,
					null,
					ElementColor.blue,
					"anzati1",
					"anzati2");
	}

	public static ElementInfo getChagrianCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Chagrian",
					new String[]{"Chagrian"}, 
					"Originaire de Champala, les Chagrians sont de paisibles amphibiens capables de belles prouesses intellectuelles.  ",
					"",
					"chagrian",
					0,
					0,
					null,
					ElementColor.blue,
					"chagrian1",
					"chagrian2");
	}

	public static ElementInfo getAqualishCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Aqualish",
					new String[]{"Aqualish"}, 
					"Humanoïdes belliqueux présentant certaines caractéristiques tenant à la fois des amphibiens et des arachnides, les Aqualish d'Ando sont présents dans toute la galaxie.",
					"",
					"chagrian",
					0,
					0,
					null,
					ElementColor.blue,
					"aqualish1",
					"aqualish2");
	}

	public static ElementInfo getKubazCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kubaz",
					new String[]{"Kubaz"}, 
					"Espèce insectovore constituée de chasseurs et dotée d'un puissant odorat originaire de Kubindi.",
					"",
					"kubaz",
					0,
					0,
					null,
					ElementColor.blue,
					"kubaz1",
					"kubaz2");
	}

	public static ElementInfo getLannikCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Lannik",
					new String[]{"Lannik"}, 
					"Humanoïdes guerriers de petite taille, natifs de la planète Lannik.",
					"",
					"lannik",
					0,
					0,
					null,
					ElementColor.blue,
					"lannik1");
	}

	public static ElementInfo getMirialanCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mirialan",
					new String[]{"Mirialan"}, 
					"Les Mirialans sont des proches-humains originaires de la planète désertique Mirial, dont de nombreux représentants sont sensibles à la Force.",
					"",
					"mirialan",
					0,
					0,
					null,
					ElementColor.blue,
					"mirialan1",
					"mirialan2");
	}

	public static ElementInfo getSullustainCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sullustain",
					new String[]{"Sullustain"}, 
					"Espèce humanoïde de petite taille originaire de Sullust et douée d'un très bon sens de l'orientation.",
					"",
					"sullustain",
					0,
					0,
					null,
					ElementColor.blue,
					"sullustien1");
	}

	public static ElementInfo getUgnaughtCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ugnaught",
					new String[]{"Ugnaught"}, 
					"Petits humanoïdes à l'allure porcine provenant de la planète Gentes. Excellents techniciens de leur état.",
					"",
					"ugnaught",
					0,
					0,
					null,
					ElementColor.blue,
					"ugnaught1",
					"ugnaught2");
	}

	public static ElementInfo getArkanienLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Arkanien",
					new String[]{"Arkanien"}, 
					"Les Arkaniens sont une race proche-humaine habitant la planète Arkania.",
					"",
					"arkanien",
					0,
					0,
					null,
					ElementColor.blue,
					"arkanian1",
					"arkanian2");
	}

	public static ElementInfo getCereenCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Cereen",
					new String[]{"Cereen"}, 
					"Les Céréens sont une espèce humanoïde native de la planète Céréa se situant dans la bordure moyenne.",
					"",
					"cereen",
					0,
					0,
					null,
					ElementColor.blue,
					"cereen1",
					"cereen2");
	}

	public static ElementInfo getChissLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Chiss",
					new String[]{"Chiss"}, 
					"Proche-humains à peau bleu, les Chiss sont originaires de Csilla, dans les régions inconnues. ",
					"",
					"chiss",
					0,
					0,
					null,
					ElementColor.blue,
					"chiss1",
					"chiss2");
	}

	public static ElementInfo getRakataLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Rakata",
					new String[]{"Rakata"}, 
					"Très ancienne espèce intelligente, aujourd'hui éteinte, qui régna sur la galaxie avant la République.",
					"",
					"rakata",
					0,
					0,
					null,
					ElementColor.blue,
					"rakata1",
					"rakata2",
					"rakata3");
	}

	public static ElementInfo getCelesteLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Céleste",
					new String[]{"Céleste"}, 
					"Mystérieuse race des temps passés.",
					"",
					"celeste",
					0,
					0,
					null,
					ElementColor.blue,
					"architect1");
	}

	public static ElementInfo getGranCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Gran",
					new String[]{"Gran"}, 
					"Les Grans sont une espèce de mammifères humanoïdes natifs de la planète Kinyen. On les retrouve également sur des colonies comme Hok ou Malastare.",
					"",
					"gran",
					0,
					0,
					null,
					ElementColor.blue,
					"gran1",
					"gran2");
	}

	public static ElementInfo getIktotchiCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Iktotchi",
					new String[]{"Iktotchi"}, 
					"Les Iktotchis sont une espèce originaire de la sévère et ventée lune Iktotch, qui orbite autour de la planète Iktotchon dans la Région d'Expansion.",
					"",
					"iktotchi",
					0,
					0,
					null,
					ElementColor.blue,
					"iktotchi1");
	}

	public static ElementInfo getIthorienCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ithorien",
					new String[]{"Ithorien"}, 
					"Les Ithoriens sont une espèce de mammifères vivant sur la planète Ithor dans le Système Ottega de la Bordure Extérieure.",
					"",
					"ithorien",
					0,
					0,
					null,
					ElementColor.blue,
					"ithorian1",
					"ithorian2");
	}

	public static ElementInfo getKiffarLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kiffar",
					new String[]{"Kiffar"}, 
					"Les Kiffars sont une sous espèce d'Humains, originaires de la planète Kiffu où ils résident ainsi que sur la planète Kiffex.",
					"",
					"kiffar",
					0,
					0,
					null,
					ElementColor.blue,
					"kiffar1");
	}

	public static ElementInfo getKillikLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Killik",
					new String[]{"Killik"}, 
					"Les Killiks sont une espèce insectoïde native de la planète Alderaan. Cette planète se situait dans le Noyau, jusqu'à sa destruction par l'Empire.",
					"",
					"killik",
					0,
					0,
					null,
					ElementColor.blue,
					"killik1",
					"killik2");
	}

	public static ElementInfo getMassassiLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Massassi",
					new String[]{"Massassi"}, 
					"Les Massassis sont une sous-espèce de l'espèce Sith, transformée génétiquement et croisée avec des Humains. Ils sont originaires de la planète Korriban.",
					"",
					"massassi",
					0,
					0,
					null,
					ElementColor.blue,
					"massassi1",
					"massassi2");
	}

	public static ElementInfo getMiralukaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Miraluka",
					new String[]{"Miraluka"}, 
					"Les Miralukas sont une espèce de proche-humains aveugles, dont l'ensemble des représentants sont sensibles à la Force.",
					"",
					"miraluka",
					0,
					0,
					null,
					ElementColor.blue,
					"miraluka1",
					"miraluka2");
	}

	public static ElementInfo getNagaiLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nagai",
					new String[]{"Nagai"}, 
					"Espèce humanoïde native de Nagi, ils furent pourchassés par les Tofs.",
					"",
					"nagai",
					0,
					0,
					null,
					ElementColor.blue,
					"nagai1");
	}

	public static ElementInfo getNetiLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Neti",
					new String[]{"Neti"}, 
					"Les Netis, également appelés Ryyks, sont une espèce végétale très rare de la planète Myrkr et Ryyk.",
					"",
					"neti",
					0,
					0,
					null,
					ElementColor.blue,
					"neti1",
					"neti2");
	}

	public static ElementInfo getNoghriLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Noghri",
					new String[]{"Noghri"}, 
					"Les Noghris sont une espèce humanoïde habitant le monde d'Honogr.",
					"",
					"noghri",
					0,
					0,
					null,
					ElementColor.blue,
					"noghri1",
					"noghri2");
	}

	public static ElementInfo getRattatakiLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Rattataki",
					new String[]{"Rattataki"}, 
					"Espèce proche-humaine originaire de Rattatak.",
					"",
					"rattataki",
					0,
					0,
					null,
					ElementColor.blue,
					"rattataki1",
					"rattataki2");
	}

	public static ElementInfo getSakiyenLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sakiyen",
					new String[]{"Sakiyen"}, 
					"Les Sakiyans sont une espèce humanoïde originaire de la planète Sakiya.",
					"",
					"sakiyen",
					0,
					0,
					null,
					ElementColor.blue,
					"sakiyan1");
	}

	public static ElementInfo getSelonienLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Selonien",
					new String[]{"Selonien"}, 
					"Les Séloniens sont une espèce de mammifères originaires de la planète Selonia, située dans le dans le Système Corellien.",
					"",
					"selonien",
					0,
					0,
					null,
					ElementColor.blue,
					"selonian1",
					"selonian2");
	}

	public static ElementInfo getSnivvienLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Snivvien",
					new String[]{"Snivvien"}, 
					"Les Snivviens sont des mammifères humanoïdes natifs du monde appelé Cadomai.",
					"",
					"snivvien",
					0,
					0,
					null,
					ElementColor.blue,
					"snivvian1");
	}

	public static ElementInfo getWhiphidLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Whiphid",
					new String[]{"Whiphid"}, 
					"Bipède à fourrure doté d'une forte musculature originaire de Toola.",
					"",
					"whiphid",
					0,
					0,
					null,
					ElementColor.blue,
					"whiphid1");
	}

	public static ElementInfo getYinchorriLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Yinchorri",
					new String[]{"Yinchorri"}, 
					"Les Yinchorris sont des reptiles humanoïdes de la planète Yinchorr.",
					"",
					"yinchorri",
					0,
					0,
					null,
					ElementColor.blue,
					"yinchorri1",
					"yinchorri2");
	}

	public static ElementInfo getYevethaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Yevetha",
					new String[]{"Yevetha"}, 
					"Espèce agressive et xénophobe, exterminée par les Yuuzhan Vong.",
					"",
					"yevetha",
					0,
					0,
					null,
					ElementColor.blue,
					"yevetha1",
					"yevetha2");
	}

	public static ElementInfo getYuuzhanVongLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Yuuzhan Vong",
					new String[]{"Yuuzhan Vong"}, 
					"Les Yuuzhan Vong sont une espèce humanoïde extra-galactique menant certains à croire qu'ils étaient une race de ramification Humaine.",
					"",
					"yuuzhanvong",
					0,
					0,
					null,
					ElementColor.blue,
					"vong1");
	}

	public static ElementInfo getZabrakCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Zabrak",
					new String[]{"Zabrak"}, 
					"Les Zabraks, également connus sous le nom d'Iridonians, sont des humanoïdes natifs d'Iridonia.",
					"",
					"zabrak",
					0,
					0,
					null,
					ElementColor.blue,
					"zabrak1",
					"zabrak2");
	}

	public static ElementInfo getNosaurienLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nosaurien",
					new String[]{"Nosaurien"}, 
					"Espèce humanoïde reptilienne originaire de Nouvelle Plympto.",
					"",
					"nosaurien",
					0,
					0,
					null,
					ElementColor.blue,
					"nosaurien1");
	}

	public static ElementInfo getWookieeCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Wookiee",
					new String[]{"Wookiee"}, 
					"Les Wookiees sont des grands mammifères robustes originaires de la planète jungle Kashyyyk.",
					"",
					"wookie",
					0,
					0,
					null,
					ElementColor.blue,
					"wookie2",
					"wookie1",
					"tarfful2");
	}

	public static ElementInfo getWeequayCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Weequay",
					new String[]{"Weequay"}, 
					"Les Weequays sont une race d'humanoïdes originaire de la planète Sriluur, dans la Bordure Extérieure.",
					"",
					"weequay",
					0,
					0,
					null,
					ElementColor.blue,
					"weequay1",
					"weequay2");
	}

	public static ElementInfo getVurkCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Vurk",
					new String[]{"Vurk"}, 
					"Les Vurks sont les habitants reptiliens et amphibiens de la planète Sembla.",
					"",
					"vurk",
					0,
					0,
					null,
					ElementColor.blue,
					"vurk1",
					"vurk2");
	}

	public static ElementInfo getUtaiCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Utai",
					new String[]{"Utai"}, 
					"Ces petis mammifères partagent avec les Pauans la planète Utapau.",
					"",
					"utai",
					0,
					0,
					null,
					ElementColor.blue,
					"utai1",
					"utai2");
	}

	public static ElementInfo getUmbaranCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Umbaran",
					new String[]{"Umbaran"}, 
					"Les Umbarans sont une espèce de proche-humains vivant sur la planète Umbara.",
					"",
					"umbaran",
					0,
					0,
					null,
					ElementColor.blue,
					"umbaran1",
					"umbaran2");
	}

	public static ElementInfo getTwilekCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Twi'lek",
					new String[]{"Twi'lek"}, 
					"Originaire de Ryloth, les Twi'leks sont des humanoïdes très répandus dans la galaxie.",
					"",
					"twilek",
					0,
					0,
					null,
					ElementColor.blue,
					"twilek1",
					"twilek2");
	}

	public static ElementInfo getTuskenLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tusken",
					new String[]{"Tusken"}, 
					"Les Tuskens, généralement appelé les Pillards Tuskens ou plus communément les Hommes des Sables sont des indigènes de la planète désertique Tatooine.",
					"",
					"tuskenlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"tusken2",
					"tusken1");
	}

	public static ElementInfo getTuskenClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tusken",
					new String[]{"Tusken"}, 
					"Les Tuskens, généralement appelé les Pillards Tuskens ou plus communément les Hommes des Sables sont des indigènes de la planète désertique Tatooine.",
					"",
					"tuskenclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"tusken2",
					"tusken1");
	}

	public static ElementInfo getTrandoshanCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Trandoshan",
					new String[]{"Trandoshan"}, 
					"Les Trandoshans, dit Tdoshok dans leur langue, sont des reptiles humanoïdes issus de la planète Trandosha, également appelée Dosha.",
					"",
					"trandoshan",
					0,
					0,
					null,
					ElementColor.blue,
					"trandoshan1",
					"trandoshan2");
	}

	public static ElementInfo getToydarienCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Toydarien",
					new String[]{"Toydarien"}, 
					"Les Toydariens sont une espèce volante originaire de la planète Toydaria située dans l'Espace Hutt.",
					"",
					"toydarien",
					0,
					0,
					null,
					ElementColor.blue,
					"toydarian1",
					"toydarian2");
	}

	public static ElementInfo getTogrutaCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Togruta",
					new String[]{"Togruta"}, 
					"Espèce humanoïde souvent confondue avec les Twi'leks. Ils sont originaires de Shili.",
					"",
					"togruta",
					0,
					0,
					null,
					ElementColor.blue,
					"togruta1",
					"togruta2");
	}

	public static ElementInfo getThisspiasienCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Thisspiasien",
					new String[]{"Thisspiasien"}, 
					"Les Thisspiasiens sont une espèce reptilienne originaire de la planète Thisspias.",
					"",
					"thisspiasien",
					0,
					0,
					null,
					ElementColor.blue,
					"thisspiasien1",
					"thisspiasien2");
	}

	public static ElementInfo getTalzCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Talz",
					new String[]{"Talz"}, 
					"Les Talzs sont originaires de la planète Alzoc III, un monde recouvert de neige et de glace.",
					"",
					"talz",
					0,
					0,
					null,
					ElementColor.blue,
					"talz1",
					"talz2");
	}

	public static ElementInfo getSkakoanCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Skakoan",
					new String[]{"Skakoan"}, 
					"Les Skakoans sont une espèce humanoïde native de la planète Skako.",
					"",
					"skakoan",
					0,
					0,
					null,
					ElementColor.blue,
					"skakoan1");
	}

	public static ElementInfo getRodienCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Rodien",
					new String[]{"Rodien"}, 
					"Les Rodiens sont des humanoïdes reptiliens natifs de la planète Rodia.",
					"",
					"rodien",
					0,
					0,
					null,
					ElementColor.blue,
					"rodian1",
					"rodian2");
	}

	public static ElementInfo getQuarrenCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Quarren",
					new String[]{"Quarren"}, 
					"Les Quarrens sont une espèce d'amphibiens qui partagent avec les Mon Camalaris, la planète du même nom que ces derniers.",
					"",
					"quarren",
					0,
					0,
					null,
					ElementColor.blue,
					"quarren1",
					"quarren2");
	}

	public static ElementInfo getPykeClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Pyke",
					new String[]{"Pyke"}, 
					"Les Pykes sont des humanoïdes venant de la planète Oba Diah.",
					"",
					"pyke",
					0,
					0,
					null,
					ElementColor.blue,
					"pyke1",
					"pyke2");
	}

	public static ElementInfo getPauanCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Pau'an",
					new String[]{"Pau'an"}, 
					"Les Pauans sont des Proches-Humains à l'aspect émacié originaires d'Utapau.",
					"",
					"pauan",
					0,
					0,
					null,
					ElementColor.blue,
					"pauan1",
					"pauan2");
	}

	public static ElementInfo getOrtolanCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ortolan",
					new String[]{"Ortolan"}, 
					"Les Ortolans sont de très petits bipèdes appartenant aux pachidermes originaires d'Orto.",
					"",
					"ortolan",
					0,
					0,
					null,
					ElementColor.blue,
					"ortolan1",
					"ortolan2");
	}

	public static ElementInfo getNiktoCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nikto",
					new String[]{"Nikto"}, 
					"Les Niktos sont une espèce de reptiliens aux multiples sous espèces et originaires de la planète Kintan.",
					"",
					"nikto",
					0,
					0,
					null,
					ElementColor.blue,
					"nikto1",
					"nikto2");
	}

	public static ElementInfo getNeimodienCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Neimodien",
					new String[]{"Neimodien"}, 
					"Les Neimoidiens sont des humanoïdes natifs de la planète Neimoidia et qui vivent également sur les colonies telles que Cato Nemoidia, Deko Neimoidia, Koru Neimoidia.",
					"",
					"neimodien",
					0,
					0,
					null,
					ElementColor.blue,
					"neimodian1",
					"neimodian2",
					"neimodiansidious");
	}

	public static ElementInfo getNautolanCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nautolan",
					new String[]{"Nautolan"}, 
					"Les Nautolans, originaires de Glee Anselm, possèdent une physiologie commune aux espèces amphibies.",
					"",
					"nautolan",
					0,
					0,
					null,
					ElementColor.blue,
					"nautolan2",
					"nautolan1");
	}

	public static ElementInfo getMonCalCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mon Cal",
					new String[]{"Mon Cal"}, 
					"Les Mon Calamaris, souvent abrégés en Mon Cal, sont un peuple idéaliste, composé d'individus nobles habitant la planète Mon Calamari.",
					"",
					"moncal",
					0,
					0,
					null,
					ElementColor.blue,
					"moncal1",
					"moncal2");
	}

	public static ElementInfo getKorunnaiCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Korunnai",
					new String[]{"Korunnai"}, 
					"Les Korunnais, plus souvent appelés Koruns, sont des Humains originaires de la planète Haruun Kal.",
					"",
					"korunnai",
					0,
					0,
					null,
					ElementColor.blue,
					"korunnai2",
					"korunnai1");
	}

	public static ElementInfo getKelDorCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kel'Dor",
					new String[]{"Kel'Dor"}, 
					"Espèce humanoïde native de Dorin et très sensible à la Force.",
					"",
					"keldor",
					0,
					0,
					null,
					ElementColor.blue,
					"keldor1",
					"keldor2");
	}

	public static ElementInfo getKaminoenCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kaminoen",
					new String[]{"Kaminoen"}, 
					"Originaire de Kamino, cette espèce bipèdique s'est fait connaitre à travers la galaxie pour sa science du clonage.",
					"",
					"kaminoen",
					0,
					0,
					null,
					ElementColor.blue,
					"kaminoan1",
					"kaminoan2",
					"obiwanlamasu");
	}

	public static ElementInfo getKaleeshCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kaleesh",
					new String[]{"Kaleesh"}, 
					"Les Kaleesh sont des reptiliens humanoïdes originaires de la planète Kalee, dont le plus célèbre représentant fut le Général Grievous.",
					"",
					"kaleesh",
					0,
					0,
					null,
					ElementColor.blue,
					"kaleesh2",
					"kaleesh1",
					"grievous1");
	}

	public static ElementInfo getJawaCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jawa",
					new String[]{"Jawa"}, 
					"Les Jawas sont de petits humanoïdes peureux, toujours encapuchonnés d'un long manteau, et dotés de deux grands yeux jaunes. Originaires de Tatooine, ils vivent de récupération et de commerce.",
					"",
					"jawa",
					0,
					0,
					null,
					ElementColor.blue,
					"jawa1",
					"jawa2");
	}

	public static ElementInfo getHuttCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Hutt",
					new String[]{"Hutt"}, 
					"Les Hutts forment une espèce gastéropode intelligente fortement impliquée dans le crime organisé. Originaires de Varl, ces êtres contrôlent une vaste région connue sous le nom d'Espace Hutt.",
					"",
					"hutt",
					0,
					0,
					null,
					ElementColor.blue,
					"hutt1",
					"hutt2");
	}

	public static ElementInfo getHumainCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Humain",
					new String[]{"Humain"}, 
					"L'espèce géographiquement la plus répandue dans la galaxie. Ils sont physiquement très variables et savent s'adapter à beaucoup d'environnements.",
					"",
					"humain",
					0,
					0,
					null,
					ElementColor.blue,
					"human1",
					"human2");
	}

	public static ElementInfo getSithdesangpurLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sith de sang pûr",
					new String[]{"Sith de sang pûr"}, 
					"Les Sith forment une espèce humanoïde jadis colonisée par des Jedi renégats. Au fur et à mesure du temps, les Sith se sont de plus en plus mélés avec les humains.",
					"",
					"sithpur",
					0,
					0,
					null,
					ElementColor.blue,
					"sithpur1",
					"sithpur2",
					"sadowkressh");
	}

	public static ElementInfo getHarchClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Harch",
					new String[]{"Harch"}, 
					"L'espèce nommée Harch est originaire de la planète Secundus Ando. Leur physique n'est pas sans rappeller l'araignée.",
					"",
					"harch",
					0,
					0,
					null,
					ElementColor.blue,
					"harch1");
	}

	public static ElementInfo getGunganCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Gungan",
					new String[]{"Gungan"}, 
					"Les gungans sont une des espèces natives de la planète Naboo.",
					"",
					"gungan",
					0,
					0,
					null,
					ElementColor.blue,
					"gungan1",
					"gungan2",
					"jarjar2");
	}

	public static ElementInfo getGeonosienCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Géonosien",
					new String[]{"Géonosien"}, 
					"Les Géonosiens sont une espèce insectoïde originaire de la planète Géonosis.",
					"",
					"geonosien",
					0,
					0,
					null,
					ElementColor.blue,
					"geonosian1",
					"geonosian2");
	}

	public static ElementInfo getGamorreenCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Gamorréen",
					new String[]{"Gamorréen"}, 
					"Espèce porcine particulièrement primitive et brutale originaire de Gamorr. Souvent engagé comme garde du corps.",
					"",
					"gamorreen",
					0,
					0,
					null,
					ElementColor.blue,
					"gamorrean1",
					"gamorrean2");
	}

	public static ElementInfo getFalleenLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Falleen",
					new String[]{"Falleen"}, 
					"Reptiliens humanoïdes capables d'user des phéromones originaire de Falleen.",
					"",
					"falleen",
					0,
					0,
					null,
					ElementColor.blue,
					"falleen1",
					"falleen2");
	}

	public static ElementInfo getEwokCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ewok",
					new String[]{"Ewok"}, 
					"Petit mammifère bipède tout mignon à de peluche, cet espèce est originaire d'une des lunes de la planète Endor.",
					"",
					"ewok",
					0,
					0,
					null,
					ElementColor.blue,
					"ewok1",
					"ewok2");
	}

	public static ElementInfo getDurosCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Duros",
					new String[]{"Duros"}, 
					"Les Duros sont une espèce d'humanoïdes originaires de la planète Duro. ",
					"",
					"duros",
					0,
					0,
					null,
					ElementColor.blue,
					"duros1",
					"duros2");
	}

	public static ElementInfo getDugCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dug",
					new String[]{"Dug"}, 
					"Espèce mammifère agressive originaire de Malastare qui utilise ses membres supérieur comme moyen de locomotion. ",
					"",
					"dug",
					0,
					0,
					null,
					ElementColor.blue,
					"dug1",
					"dug2");
	}

	public static ElementInfo getDrallLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Drall",
					new String[]{"Drall"}, 
					"Les Dralls originaires de Drall (ça se tient) sont de petits mammifères spécialisés dans les métiers intellectuels.",
					"",
					"drall",
					0,
					0,
					null,
					ElementColor.blue,
					"drall1");
	}

	public static ElementInfo getDevaronienCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Devaronien",
					new String[]{"Devaronien"}, 
					"Les Dévaroniens, également appelé Devish, sont des humanoïdes natifs de la planète Dévaron dans la Région des Colonies.",
					"",
					"devaronien",
					0,
					0,
					null,
					ElementColor.blue,
					"devaronian1",
					"devaronian2");
	}

	public static ElementInfo getDathomirienCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dathomirien",
					new String[]{"Dathomirien"}, 
					"Espèce originaire de Dathomir proche-humaine. Elle est née de la fusion d'humains et de Zabrak d'Iridonia.",
					"",
					"dathomirien",
					0,
					0,
					null,
					ElementColor.blue,
					"dathomirian1",
					"dathomirian2");
	}

	public static ElementInfo getClawditeCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Clawdite",
					new String[]{"Clawdite"}, 
					"Espèce de la planète Zolan originellement prochaine-humaine, elle est dotée de capacités métamorphiques uniques.",
					"",
					"clawdite",
					0,
					0,
					null,
					ElementColor.blue,
					"clawdite1",
					"clawdite2");
	}

	public static ElementInfo getChevinCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Chevin",
					new String[]{"Chevin"}, 
					"Les Chevins sont une espèce de bipèdes de type pachydermoïde originaires de la planète Vinsoth.",
					"",
					"chevin",
					0,
					0,
					null,
					ElementColor.blue,
					"chevin1",
					"chevin2");
	}

	public static ElementInfo getChalactanCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Chalactan",
					new String[]{"Chalactan"}, 
					"Les Chalactans sont une espèce d'Humains natifs de la planète Chalacta.",
					"",
					"chalactan",
					0,
					0,
					null,
					ElementColor.blue,
					"chalactan1",
					"chalactan2");
	}

	public static ElementInfo getChadraFanCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Chadra-Fan",
					new String[]{"Chadra-Fan"}, 
					"Les Chadra-Fans sont une espèce de rongeur-humanoïdes curieuse originaire de la planète Chad.",
					"",
					"chadrafan",
					0,
					0,
					null,
					ElementColor.blue,
					"chadrafan1",
					"chadrafan2");
	}

	public static ElementInfo getBothanCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bothan",
					new String[]{"Bothan"}, 
					"Espèce originaire de Bothawui, les bothan sont souvent considérés comme spécialistes dans l'espionnage et le renseignement.",
					"",
					"bothan",
					0,
					0,
					null,
					ElementColor.blue,
					"bothan1",
					"bothan2");
	}

	public static ElementInfo getBithCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bith",
					new String[]{"Bith"}, 
					"Espèce originaire de Clak'dor VII, ce sont des humanoïdes évolués dotés d'un grand sens artistique.",
					"",
					"bith",
					0,
					0,
					null,
					ElementColor.blue,
					"bith1",
					"bith2");
	}

	public static ElementInfo getBesaliskCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Besalisk",
					new String[]{"Besalisk"}, 
					"Espèce originaire d'Ojom, dont les femelles possèdent 8 bras.",
					"",
					"besalisk",
					0,
					0,
					null,
					ElementColor.blue,
					"besalisk1",
					"besalisk2");
	}

	public static ElementInfo getWullfYularenClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Wullf Yularen",
					new String[]{"Wullf Yularen"}, 
					"Amiral sous la République Galactique, il poursuiva en tant que membre du Bureau de Sécurité Impérial sous l'Empire Galactique. ",
					"",
					"wullfyularenclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"wullfyularen1",
					"wullfyularen2",
					"wullfyularenold");
	}

	public static ElementInfo getWaxerClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Waxer",
					new String[]{"Waxer"}, 
					"Membre de la compagnie Ghost, sous les ordres du Général Obi-Wan Kenobi.",
					"",
					"waxerclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"waxer1",
					"waxer2",
					"waxer3");
	}

	public static ElementInfo getSoldatARCCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Soldat ARC",
					new String[]{"Soldat ARC"}, 
					"Troupes d'élite de l'Armée Clone dotées d'un fort sens de l'indépendance et du devoir.",
					"",
					"soldatarc",
					0,
					0,
					null,
					ElementColor.blue,
					"arcsoldier1",
					"arcsoldier2");
	}

	public static ElementInfo getCommandoduSenatClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Commando du Sénat",
					new String[]{"Commando du Sénat"}, 
					"La Garde du Sénat est un corps armé prestigieux de la République Galactique chargée de la sécurité au sein du Séant, de ses sénateurs et du Chancelier Suprême.",
					"",
					"senatecommando",
					0,
					0,
					null,
					ElementColor.blue,
					"senatecommando1");
	}

	public static ElementInfo getTetaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Teta",
					new String[]{"Teta"}, 
					"Téta fut la guerrière et impératrice qui unifia les sept mondes du système de Koros en -5.000, avant de repousser une invasion sith durant la Grande Guerre de l'Hyperespace.",
					"",
					"teta",
					0,
					0,
					null,
					ElementColor.blue,
					"teta1",
					"teta2");
	}

	public static ElementInfo getTarsusValorumLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tarsus Valorum",
					new String[]{"Tarsus Valorum"}, 
					"Chancelier Suprême du temps de l'Ancienne République à la fin des Nouvelles Guerres Sith. Il fut l'instigateur des Réformes de Ruusan, qui furent l'origine de la décadence inéluctable de la l'Ancienne République.",
					"",
					"tarsusvalorum",
					0,
					0,
					null,
					ElementColor.blue,
					"tarsusvalorum1");
	}

	public static ElementInfo getSioBibbleCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sio Bibble",
					new String[]{"Sio Bibble"}, 
					"Sio Bibble fut le Gouverneur de Naboo et Conseiller personnel de la Reine.",
					"",
					"siobibble",
					0,
					0,
					null,
					ElementColor.blue,
					"siobibble1",
					"siobibble2");
	}

	public static ElementInfo getSaulKarathLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Saul Karath",
					new String[]{"Saul Karath"}, 
					"Originellement Amiral au sein de la flotte de l'Ancienne République, il suiva Revan quand ce dernier devint Seigneur Sith. ",
					"",
					"saulkarath",
					0,
					0,
					null,
					ElementColor.blue,
					"saulkarath1",
					"karath2",
					"malakkarath");
	}

	public static ElementInfo getSatineKryzeClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Satine Kryze",
					new String[]{"Satine Kryze"}, 
					"Satine Kryze fut la Duchesse de Mandalore à l'époque de la Guerre des clones, et entretint une relation platonique avec Obi-Wan Kenobi.",
					"",
					"satinekryze",
					0,
					0,
					null,
					ElementColor.blue,
					"satinekryze1");
	}

	public static ElementInfo getGardeRoyalMandalorienClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Garde Royal Mandalorien",
					new String[]{"Garde Royal Mandalorien"}, 
					"La Garde Royale Mandalorienne avait la lourde tâche d'assurer la protection rapprochée de la Duchesse Satine Kryze des Nouveaux Mandaloriens.",
					"",
					"royalmandoguard",
					0,
					0,
					null,
					ElementColor.blue,
					"royalmandoguard1");
	}

	public static ElementInfo getRexClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Rex",
					new String[]{"Rex"}, 
					"Rex fut un capitaine clone répondant au matricule CC-7567. Il servit sous les ordres d'Anakin Skywalker durant la Guerre des Clones.",
					"",
					"rexclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"rex1",
					"rexchristophsis",
					"rexkamino",
					"rexblue",
					"rexgeonosis",
					"rexumbara",
					"rexscipio",
					"rexold",
					"rexescape",
					"rexbeast");
	}

	public static ElementInfo getQuarshPanakaCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Quarsh Panaka",
					new String[]{"Quarsh Panaka", "Panaka"}, 
					"Capitaine de la garde du palais royal sous le règne de Padmé Naberrie.",
					"",
					"panaka",
					0,
					0,
					null,
					ElementColor.blue,
					"panaka1",
					"panaka2");
	}

	public static ElementInfo getRiyoChuchiClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Riyo Chuchi",
					new String[]{"Riyo Chuchi"}, 
					"Sénatrice de son monde Pantora. Elle réussissa à conclure une paix entre les Talz et les pantorans. ",
					"",
					"riyochuchi",
					0,
					0,
					null,
					ElementColor.blue,
					"riyochuchi1",
					"riyochuchi2",
					"riyochuchi3");
	}

	public static ElementInfo getMasAmeddaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mas Amedda",
					new String[]{"Mas Amedda"}, 
					"Vice président du Sénat Galactique sous Finis Valorum et Sheev Palpatine, ce chagrian fut également l'orateur durant les sessions du Sénat.",
					"",
					"masameddalegends",
					0,
					0,
					null,
					ElementColor.blue,
					"masamedda1",
					"masamedda2",
					"masamedda3");
	}

	public static ElementInfo getMasAmeddaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mas Amedda",
					new String[]{"Mas Amedda"}, 
					"Vice président du Sénat Galactique sous Finis Valorum et Sheev Palpatine, ce chagrian fut également l'orateur durant les sessions du Sénat.",
					"",
					"masameddaclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"masamedda1",
					"masamedda2",
					"masamedda3");
	}

	public static ElementInfo getOrnFreeTaaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Orn Free Taa",
					new String[]{"Orn Free Taa"}, 
					"Orn Free Taa fut un influent sénateur Twi'lek représentant Ryloth durant les dernières décennies de la République et un proche de Palpatine.",
					"",
					"ornfreetaaclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"ornfreetaa1",
					"ornfreetaa2");
	}

	public static ElementInfo getOrnFreeTaaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Orn Free Taa",
					new String[]{"Orn Free Taa"}, 
					"Orn Free Taa fut un influent sénateur Twi'lek représentant Ryloth durant les dernières décennies de la République et un proche de Palpatine.",
					"",
					"ornfreetaalegends",
					0,
					0,
					null,
					ElementColor.blue,
					"ornfreetaa1");
	}

	public static ElementInfo getJarJarBinksClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jar Jar Binks",
					new String[]{"Jar Jar Binks", "Jar Jar"}, 
					"Gungan maladroit de la paisible planète Naboo, il aida la Reine Padmé à reprendre son trône contre la Fédération du Commerce. Il devint par la suite Sénateur au Sénat Galactique.",
					"",
					"jarjarbinksclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"jarjarbinks1",
					"jarjar2",
					"jarjar4",
					"macewindujarjar",
					"jarjar3");
	}

	public static ElementInfo getJarJarBinksLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jar Jar Binks",
					new String[]{"Jar Jar Binks", "Jar Jar"}, 
					"Gungan maladroit de la paisible planète Naboo, il aida la Reine Padmé à reprendre son trône contre la Fédération du Commerce. Il devint par la suite Sénateur au Sénat Galactique.",
					"",
					"jarjarbinkslegends",
					0,
					0,
					null,
					ElementColor.blue,
					"jarjarbinks1",
					"jarjar2",
					"jarjar3");
	}

	public static ElementInfo getDorianJanarusLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dorian Janarus",
					new String[]{"Dorian Janarus", "Janarus"}, 
					"Dorian Janarus fut le Chancelier Suprême de la République pendant la Guerre Froide.",
					"",
					"janarus",
					0,
					0,
					null,
					ElementColor.blue,
					"janarus1",
					"janarus2");
	}

	public static ElementInfo getJamilliaCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jamillia",
					new String[]{"Jamillia"}, 
					"Reine de Naboo après les deux mandats successifs de Padmé Naberrie.",
					"",
					"jamillia",
					0,
					0,
					null,
					ElementColor.blue,
					"jamillia1",
					"jamillia2");
	}

	public static ElementInfo getHuyangClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Huyang",
					new String[]{"Huyang"}, 
					"Droïde architecte conçu pour aider les initiés de l'Ordre Jedi à construire leur sabre laser. ",
					"",
					"huyang",
					0,
					0,
					null,
					ElementColor.blue,
					"huyang1");
	}

	public static ElementInfo getHarronTavusLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Harron Tavus",
					new String[]{"Harron Tavus"}, 
					"Lieutenant puis Commandant des Armées de la République du temps de la Grande Guerre Galactique. Il fut un bon ami du Jedi Orgus Din.",
					"",
					"harrontavus",
					0,
					0,
					null,
					ElementColor.blue,
					"harrontavus1",
					"tavus2",
					"tavus3",
					"tavus4");
	}

	public static ElementInfo getGregarTyphoClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Gregar Typho",
					new String[]{"Gregar Typho"}, 
					"Gregar Typho fut le capitaine des gardes de Naboo et le garde du corps de la Sénatrice Padmé Amidala.",
					"",
					"gregartyphoclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"typho1",
					"typho2");
	}

	public static ElementInfo getGregarTyphoLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Gregar Typho",
					new String[]{"Gregar Typho"}, 
					"Gregar Typho fut le capitaine des gardes de Naboo et le garde du corps de la Sénatrice Padmé Amidala.",
					"",
					"gregartypholegends",
					0,
					0,
					null,
					ElementColor.blue,
					"typho1");
	}

	public static ElementInfo getPoeDameronClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Poe Dameron",
					new String[]{"Poe Dameron"}, 
					"Pilote de la Résistance vers 34 ap BY. Il fut capturé par le Premier Ordre avant de se faire libéré par un stormtrooper dissident.",
					"",
					"poedameron",
					0,
					0,
					null,
					ElementColor.blue,
					"poedameron1",
					"poedameronjakku",
					"poedameronbattle");
	}

	public static ElementInfo getTemminWexleyClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Temmin Wexley",
					new String[]{"Temmin Wexley", "Temmin"}, 
					"Pilote hardu de la Résistance au sein de l'Escadron Noir.",
					"",
					"temminwexley",
					0,
					0,
					null,
					ElementColor.blue,
					"temminwexley1");
	}

	public static ElementInfo getKareKunClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Karé Kun",
					new String[]{"Karé Kun", "Karé"}, 
					"Pilote de la Résistance au sein de l'Escadron Noir.",
					"",
					"karekun",
					0,
					0,
					null,
					ElementColor.blue,
					"karekun1");
	}

	public static ElementInfo getLuloClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"L'ulo",
					new String[]{"L'ulo"}, 
					"Pilote de la Résistance au sein de l'Escadron Vert puis de l'Escadron Noir.",
					"",
					"lulo",
					0,
					0,
					null,
					ElementColor.blue,
					"lulo1");
	}

	public static ElementInfo getJessikaPavaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jessika Pava",
					new String[]{"Jessika Pava", "Jessika"}, 
					"Pilote de la Résistance au sein de l'Escadron Bleu puis de l'Escadron Noir.",
					"",
					"jessikapava",
					0,
					0,
					null,
					ElementColor.blue,
					"jessikapava1");
	}

	public static ElementInfo getOddyMuvaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Oddy Muva",
					new String[]{"Oddy Muva"}, 
					"Pilote et mécanicien de la Résistance au sein de l'Escadron Noir.",
					"",
					"oddymuva",
					0,
					0,
					null,
					ElementColor.blue,
					"oddymuva1");
	}

	public static ElementInfo getFinnClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Finn",
					new String[]{"Finn"}, 
					"Soldat impérial sous le Premier Ordre, il trahira l'Ordre au profit de la Résistance. ",
					"",
					"finn",
					0,
					0,
					null,
					ElementColor.blue,
					"finn1",
					"finnjakku",
					"finntakodana",
					"finnfight");
	}

	public static ElementInfo getFornDodonnaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Forn Dodonna",
					new String[]{"Forn Dodonna"}, 
					"Amiral de la République qui conduisit sa flotte lors de la bataille victorieuse de la Forge Stellaire",
					"",
					"forndodonna",
					0,
					0,
					null,
					ElementColor.blue,
					"forndodonna1",
					"forndodonna2");
	}

	public static ElementInfo getFinisValorumClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Finis Valorum",
					new String[]{"Finis Valorum"}, 
					"Chancelier Suprême de la République Galactique vers 32 av BY. Son règne fut constamment entravée par la corruption.",
					"",
					"finisvalorumclassic",
					-40,
					-32,
					null,
					ElementColor.blue,
					"valorum1",
					"valorum4");
	}

	public static ElementInfo getFinisValorumLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Finis Valorum",
					new String[]{"Finis Valorum"}, 
					"Chancelier Suprême de la République Galactique vers 32 av BY. Son règne fut constamment entravée par la corruption.",
					"",
					"finisvalorumlegends",
					-40,
					-32,
					null,
					ElementColor.blue,
					"valorum1",
					"valorum2",
					"valorum3");
	}

	public static ElementInfo getElinGarzaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Elin Garza",
					new String[]{"Elin Garza"}, 
					"Général de l'armée de la République du temps de la Grande Guerre Galactique contre l'Ancien Empire Sith Reconstitué. ",
					"",
					"elingarza",
					0,
					0,
					null,
					ElementColor.blue,
					"elingarza1");
	}

	public static ElementInfo getCodyClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Cody",
					new String[]{"Cody"}, 
					"Cody fut un vaillant commandant clone ayant servi sous les ordres du général Jedi Obi-Wan Kenobi.",
					"",
					"codyclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"cody1",
					"codychristophsis",
					"codyrishi",
					"codygeonosis",
					"codymanda",
					"cody2");
	}

	public static ElementInfo getCodyLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Cody",
					new String[]{"Cody"}, 
					"Cody fut un vaillant commandant clone ayant servi sous les ordres du général Jedi Obi-Wan Kenobi.",
					"",
					"codylegends",
					0,
					0,
					null,
					ElementColor.blue,
					"cody1",
					"cody2");
	}

	public static ElementInfo getCoburnClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Coburn",
					new String[]{"Coburn"}, 
					"Amiral respecté de la République sous les ordres du Général Jedi Plo Koon durant la Guerre des Clones.",
					"",
					"coburn",
					0,
					0,
					null,
					ElementColor.blue,
					"coburn1",
					"coburn2");
	}

	public static ElementInfo getSoldatCloneCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Soldat Clone",
					new String[]{"Soldat Clone", "soldat clone"}, 
					"Soldat de base composant l'épine dorsale de l'Armée Clone de la République puis, plus tard, l'Empire Galactique.",
					"",
					"clonesoldat",
					0,
					0,
					null,
					ElementColor.blue,
					"clonesoldat1",
					"clonearmy");
	}

	public static ElementInfo getClonepiloteTRTTCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Clone pilote TR-TT",
					new String[]{"Clone pilote TR-TT"}, 
					"Soldats clones formés pour piloter des TR-TT en vue de reconnaître le terrain et patrouiller les champs de bataille.",
					"",
					"clonetrtt",
					0,
					0,
					null,
					ElementColor.blue,
					"clonetrtt1");
	}

	public static ElementInfo getClonedereconnaissanceCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Clone de reconnaissance",
					new String[]{"Clone de reconnaissance"}, 
					"Unités de la République destinées aux mission d'avant-garde, de reconnaissance de terrains et d'espionnage.",
					"",
					"clonereconnaissance",
					0,
					0,
					null,
					ElementColor.blue,
					"clonereco1");
	}

	public static ElementInfo getClonepiloteCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Clone pilote",
					new String[]{"Clone pilote"}, 
					"Corps des soldats clones spécialisés dans le pilotage de chasseurs et de cannonières de la République.",
					"",
					"clonepilote",
					0,
					0,
					null,
					ElementColor.blue,
					"clonepilote1");
	}

	public static ElementInfo getClonemarineCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Clone marine",
					new String[]{"Clone marine"}, 
					"Corps d'élite de l'Armée Clone rompu aux missions en terrain difficile et en apesanteur.",
					"",
					"clonemarine",
					0,
					0,
					null,
					ElementColor.blue,
					"clonemarine1");
	}

	public static ElementInfo getCloneeclaireurCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Clone éclaireur",
					new String[]{"Clone éclaireur"}, 
					"Formés sur la planète océanique Kamino, les Soldats Clones éclaireurs furent les remplaçants des Soldat de reconnaissance. Ils s'occupaient des missions de reconnaissance.",
					"",
					"cloneeclaireur",
					0,
					0,
					null,
					ElementColor.blue,
					"clonescout1");
	}

	public static ElementInfo getClonedemineurClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Clone démineur",
					new String[]{"Clone démineur"}, 
					"Soldat de la République spécialisé dans le désamorçage des bombes du temps de la Guerre des Clones.",
					"",
					"clonedemineur",
					0,
					0,
					null,
					ElementColor.blue,
					"clonedemineur1");
	}

	public static ElementInfo getClonedechocCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Clone de choc",
					new String[]{"Clone de choc"}, 
					"Avec l'augmentation conséquente de l'insécurité créée par la menace permanente d'attentats Séparatistes, ces clones devinrent connus de tous les citoyens de Coruscant pour leur présence dans la capitale.",
					"",
					"clonedechoc",
					0,
					0,
					null,
					ElementColor.blue,
					"clonedechoc1");
	}

	public static ElementInfo getCloneGardedeCoruscantCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Clone Garde de Coruscant",
					new String[]{"Clone Garde de Coruscant"}, 
					"Unité d'élite d'abord utilisées comme gardes rapprochés du Chancelier Palpatine, il furent employés par la suite comme fantassins anti-émeutes.",
					"",
					"clonecoruscantguard",
					0,
					0,
					null,
					ElementColor.blue,
					"clonecoruscantguard1");
	}

	public static ElementInfo getCloneCommandantCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Clone Commandant",
					new String[]{"Clone Commandant"}, 
					"Hauts gradés de l'Armée Clone, ils étaient à la tête d'un régiment, d'un bataillon, voire d'une légion entière.",
					"",
					"clonecommandant",
					0,
					0,
					null,
					ElementColor.blue,
					"clonecommandant1");
	}

	public static ElementInfo getCarthOnasiLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Carth Onasi",
					new String[]{"Carth Onasi"}, 
					"Carth Onasi fut un brillant soldat et pilote de l'Ancienne République Galactique ayant combattu Dark Malak.",
					"",
					"carthonasi",
					0,
					0,
					null,
					ElementColor.blue,
					"carthonasi1",
					"carthonasi2",
					"carthonasi3");
	}

	public static ElementInfo getCalOmasLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Cal Omas",
					new String[]{"Cal Omas"}, 
					"Cal Omas fut un survivant d'Alderaan et le Président de la Nouvelle République, puis de la première Fédération Galactique des Alliances Libres.",
					"",
					"calomas",
					0,
					0,
					null,
					ElementColor.blue,
					"omascal1");
	}

	public static ElementInfo getBoilClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Boil",
					new String[]{"Boil"}, 
					"Boil fut un soldat clone, membre de la Compagnie Ghost, qui participa à la bataille terrestre de Ryloth et à un assaut sur Géonosis.",
					"",
					"boilclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"boil1");
	}

	public static ElementInfo getBailOrganaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bail Organa",
					new String[]{"Bail Organa"}, 
					"Bail Organa fut le vice-roi et le Sénateur d'Alderaan durant la Guerre des Clones et fut connu pour sa sagesse. A la fin du conflit, il adopta Leia et contribua à la fondation de la Rébellion.",
					"",
					"bailorganaclassic",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"logobailorgana",
					"bail2",
					"bail3",
					"bailr2d2");
	}

	public static ElementInfo getBailOrganaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bail Organa",
					new String[]{"Bail Organa"}, 
					"Bail Organa fut le vice-roi et le Sénateur d'Alderaan durant la Guerre des Clones et fut connu pour sa sagesse. A la fin du conflit, il adopta Leia et contribua à la fondation de la Rébellion.",
					"",
					"bailorganalegends",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"logobailorgana",
					"bailpolitic",
					"bailbattle",
					"bail3",
					"palpatinestarkiller");
	}

	public static ElementInfo getPadmeNaberrieClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Padmé Naberrie",
					new String[]{"Padmé Naberrie", "Padmé Amidala", "Padmé"}, 
					"Padmé Amidala fut une jeune reine de Naboo puis une sénatrice durant la Guerre des Clones. Elle épousa Anakin Skywalker et donna naissance aux jumeaux Leia et Luke.",
					"",
					"padmeamidalaclassic",
					0,
					0,
					null,
					ElementColor.yellow,
					"logopadmenaberrie",
					"padme1",
					"padme2",
					"padme3",
					"padme4",
					"padme5",
					"padme6",
					"padme7",
					"padme8");
	}

	public static ElementInfo getPadmeNaberrieLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Padmé Naberrie",
					new String[]{"Padmé Naberrie", "Padmé Amidala", "Padmé"}, 
					"Padmé Amidala fut une jeune reine de Naboo puis une sénatrice durant la Guerre des Clones. Elle épousa Anakin Skywalker et donna naissance aux jumeaux Leia et Luke.",
					"",
					"padmeamidalalegends",
					0,
					0,
					null,
					ElementColor.yellow,
					"logopadmenaberrie",
					"padme1",
					"padme2",
					"padme7",
					"padme8");
	}

	public static ElementInfo getBacaraCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bacara",
					new String[]{"Bacara"}, 
					"Bacara fut un commandant clone sous les ordres de Ki-Adi-Mundi. Il dirigea les Marines Galactiques durant la Guerre des Clones.",
					"",
					"bacara",
					0,
					0,
					null,
					ElementColor.blue,
					"baccara1",
					"bacara2");
	}

	public static ElementInfo getAttonRandLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Atton Rand",
					new String[]{"Atton Rand"}, 
					"Ancien soldat d'élite Sith et compagnon de l'Exilée qui finit par devenir un Jedi.",
					"",
					"attonrand",
					0,
					0,
					null,
					ElementColor.blue,
					"attonrand1",
					"attonrand2");
	}

	public static ElementInfo getAppoClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Appo",
					new String[]{"Appo"}, 
					"Appo fut un commandant clone ayant dirigé la 501ème Légion durant la Guerre des Clones, et ayant participé à l'assaut sur le Temple Jedi après que l'Ordre 66 ait été lancé.",
					"",
					"appoclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"appo1",
					"appo2",
					"appo3");
	}

	public static ElementInfo getZevSenescaCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Zev Senesca",
					new String[]{"Zev Senesca"}, 
					"Pilote de l'Escadron Rogue, il combattit pour l'Alliance Rebelle durant la Guerre Civile Galactique.",
					"",
					"zevsenesca",
					0,
					0,
					null,
					ElementColor.blue,
					"zevsenesca1",
					"zevsenesca2");
	}

	public static ElementInfo getWinterCelchuLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Winter Celchu",
					new String[]{"Winter Celchu", "Winter"}, 
					"Fille unique de Sheltay Retrac, elle grandit avec Leia Organa Skywalker et la considéra comme une soeur. Elle serva l'Alliance Rebelle en tant qu'espionne.",
					"",
					"wintercelchu",
					0,
					0,
					null,
					ElementColor.red,
					"logowintercelchu",
					"winter2");
	}

	public static ElementInfo getWesJansonClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Wes Janson",
					new String[]{"Wes Janson", "Wes"}, 
					"Pilote de l'Alliance Rebelle, il rejoindra l'Escadron Rogue afin de combattre l'Empire Galactique.",
					"",
					"wesjansonclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"wesjanson1");
	}

	public static ElementInfo getWesJansonLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Wes Janson",
					new String[]{"Wes Janson", "Wes"}, 
					"Pilote de l'Alliance Rebelle, il rejoindra l'Escadron Rogue afin de combattre l'Empire Galactique puis intégrera l'Escadron Wraith sous la Nouvelle République.",
					"",
					"wesjansonlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"wesjanson1");
	}

	public static ElementInfo getWedgeAntillesClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Wedge Antilles",
					new String[]{"Wedge Antilles", "Wedge"}, 
					"Habile pilote de X-Wing reconnu de l'Escadron Rogue, il devint un héros pour l'Alliance Rebelle durant la Guerre Civile Galactique.",
					"",
					"wedgeantillesclassic",
					0,
					0,
					null,
					ElementColor.kaki,
					"logowedgeantilles",
					"wedge2");
	}

	public static ElementInfo getWedgeAntillesLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Wedge Antilles",
					new String[]{"Wedge Antilles", "Wedge"}, 
					"Habile pilote de X-Wing reconnu de l'Escadron Rogue, il devint un héros pour l'Alliance Rebelle et la Nouvelle République. ",
					"",
					"wedgeantilleslegends",
					0,
					0,
					null,
					ElementColor.kaki,
					"logowedgeantilles",
					"wedgeiella");
	}

	public static ElementInfo getTychoCelchuLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tycho Celchu",
					new String[]{"Tycho Celchu", "Tycho"}, 
					"Membre de l'Escadron Rogue renommé, il combattit l'Empire Galactique lors de plusieurs affrontements.",
					"",
					"tychocelchulegends",
					0,
					0,
					null,
					ElementColor.red,
					"logotychocelchu");
	}

	public static ElementInfo getTychoCelchuClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tycho Celchu",
					new String[]{"Tycho Celchu", "Tycho"}, 
					"Membre de l'Escadron Rogue renommé, il combattit l'Empire Galactique lors de plusieurs affrontements.",
					"",
					"tychocelchuclassic",
					0,
					0,
					null,
					ElementColor.red,
					"logotychocelchu");
	}

	public static ElementInfo getRontoLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ronto",
					new String[]{"Ronto"}, 
					"Ronto fut un pilote du célèbre escadron Rogue, qui servit sous les ordres de l'Amiral Gar Stazi et combattit les Sith-Impériaux durant la Seconde Guerre Civile Impériale.",
					"",
					"ronto",
					0,
					0,
					null,
					ElementColor.blue,
					"ronto1");
	}

	public static ElementInfo getPoncGavrisomLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ponc Gavrisom",
					new String[]{"Ponc Gavrisom", "Ponc", "Gavrisom"}, 
					"Ce calibop consciencieux et calme fut un Chef d'État de la Nouvelle République. Il est celui qui signa avec l'Amiral Gilad Pellaeon les accords de paix entre la Nouvelle République et les Vestiges de l'Empire.",
					"",
					"poncgavrisom",
					0,
					0,
					null,
					ElementColor.blue,
					"poncgavrisom1");
	}

	public static ElementInfo getOnaAntillesLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ona Antilles",
					new String[]{"Ona Antilles"}, 
					"Lieutenant humaine et aide de camp de l'Amiral Gar Stazi durant la Seconde Guerre Civile Impériale.",
					"",
					"onaantilles",
					0,
					0,
					null,
					ElementColor.blue,
					"onaantilles1");
	}

	public static ElementInfo getNienNunbClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nien Nunb",
					new String[]{"Nien Nunb"}, 
					"Contrebandier sullustien et ami de Lando Calrissian, il aida ce dernier en temps que copilote durant la Bataille d'Endor.",
					"",
					"niennunbclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"niennunb1",
					"niennunb2");
	}

	public static ElementInfo getNienNunbLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nien Nunb",
					new String[]{"Nien Nunb"}, 
					"Contrebandier sullustien et ami de Lando Calrissian, il aida ce dernier en temps que copilote durant la Bataille d'Endor.",
					"",
					"niennunblegends",
					0,
					0,
					null,
					ElementColor.blue,
					"niennunb1",
					"niennunb2");
	}

	public static ElementInfo getMonMothmaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mon Mothma",
					new String[]{"Mon Mothma"}, 
					"Sénatrice sous la République Galactique, elle fut parmi les fondateurs de l'Alliance Rebelle.",
					"",
					"monmothmaclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"monmothma1",
					"deathstar22");
	}

	public static ElementInfo getMonMothmaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mon Mothma",
					new String[]{"Mon Mothma"}, 
					"Sénatrice sous la République Galactique, elle fut parmi les fondateurs de l'Alliance Rebelle et sera la première Chef d'État de la Nouvelle République. ",
					"",
					"monmothmalegends",
					0,
					0,
					null,
					ElementColor.blue,
					"monmothma1",
					"monmothma2");
	}

	public static ElementInfo getMoniaGahanLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Monia Gahan",
					new String[]{"Monia Gahan"}, 
					"Pilote Mon Calamari au service des Vestiges de l'Alliance Galactique, elle effectua ses missions au sein du fameux Escadron Rogue.",
					"",
					"moniagahan",
					0,
					0,
					null,
					ElementColor.blue,
					"moniagahan1",
					"moniagahan2");
	}

	public static ElementInfo getJhoramBeyLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jhoram Bey",
					new String[]{"Jhoram Bey"}, 
					"Pilote weequay combattant pour les Vestiges de l'Alliance Galactique en tant que Rogue Leader. Il devient le Capitaine du Star Destroyer l'Alliance.",
					"",
					"jhorambey",
					0,
					0,
					null,
					ElementColor.blue,
					"jhorambey1");
	}

	public static ElementInfo getEvaanVerlaineClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Evaan Verlaine",
					new String[]{"Evaan Verlaine", "Evaan"}, 
					"Pilote au service de l'Alliance Rebelle originaire d'Alderaan.",
					"",
					"evaan",
					0,
					0,
					null,
					ElementColor.blue,
					"evaan1",
					"evaan2",
					"evaan3");
	}

	public static ElementInfo getJekPorkinsClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jek Porkins",
					new String[]{"Jek Porkins", "Jek", "Porkins"}, 
					"Pilote de X-Wing au service de l'Alliance Rebelle.",
					"",
					"jekporkinsclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"jekporkins1");
	}

	public static ElementInfo getJekPorkinsLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jek Porkins",
					new String[]{"Jek Porkins", "Jek", "Porkins"}, 
					"Ancien marchant, il devint pilote de X-Wing au service de l'Alliance Rebelle.",
					"",
					"jekporkinslegends",
					0,
					0,
					null,
					ElementColor.blue,
					"jekporkins1");
	}

	public static ElementInfo getJanOrsLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jan Ors",
					new String[]{"Jan Ors"}, 
					"Ancienne agent au service d'une organisation terroriste, Jan s'est à finalement retourné sa veste pour aider l'Alliance Rebelle et la Nouvelle République en compagnie de Kyle Katarn. ",
					"",
					"janors",
					0,
					0,
					null,
					ElementColor.blue,
					"janors1",
					"janors2",
					"janors3");
	}

	public static ElementInfo getJanDodonnaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jan Dodonna",
					new String[]{"Jan Dodonna"}, 
					"L'un des premiers Généraux de l'Alliance Rebelle, il fut un leader important pour la rébellion et organisa l'attaque sur l'Etoile Noire.",
					"",
					"jandodonnaclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"jandodonna1",
					"jandodonna2");
	}

	public static ElementInfo getJanDodonnaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jan Dodonna",
					new String[]{"Jan Dodonna"}, 
					"L'un des premiers Généraux de l'Alliance Rebelle, il fut un leader important pour la rébellion et organisa l'attaque sur l'Etoile Noire.",
					"",
					"jandodonnalegends",
					0,
					0,
					null,
					ElementColor.blue,
					"jandodonna1",
					"jandodonna2");
	}

	public static ElementInfo getJaiusYorubLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jaius Yorub",
					new String[]{"Jaius Yorub"}, 
					"Sullustien combattant pour l'Alliance Galactique, il fut le capitaine de l'Indomptable, vaisseau amiral de la flotte de Défense de l'Alliance.",
					"",
					"jaiusyorub",
					0,
					0,
					null,
					ElementColor.blue,
					"jaiusyorub1",
					"jaiusyorub2");
	}

	public static ElementInfo getIellaWessiriLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Iella Wessiri",
					new String[]{"Iella Wessiri", "Iella"}, 
					"Agent de police de la Corsec sur Correlia, elle devint par la suite agent de renseignement à la solde de la Nouvelle République.  ",
					"",
					"iellawessiri",
					0,
					0,
					null,
					ElementColor.kaki,
					"logoiellaantilles",
					"wedgeiella");
	}

	public static ElementInfo getGavinDarklighterLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Gavin Darklighter",
					new String[]{"Gavin Darklighter", "Gavin"}, 
					"Pilote de l'Alliance Rebelle dans l'Escadron Rogue où il en devint le leader, il fut ensuite promu au titre d'Amiral.",
					"",
					"gavindarklighter",
					0,
					0,
					null,
					ElementColor.blue,
					"gavindarklighter1");
	}

	public static ElementInfo getGialGahanLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Gial Gahan",
					new String[]{"Gial Gahan", "Gahan"}, 
					"Gial Gahan est un ancien membre du triumvirat de l'Alliance Galactique. Il aida par la suite les Vestiges de l'Alliance.  ",
					"",
					"gahan",
					0,
					0,
					null,
					ElementColor.blue,
					"gahan1",
					"fgaltriumvirat",
					"gahandeath");
	}

	public static ElementInfo getGarStaziLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Gar Stazi",
					new String[]{"Gar Stazi", "Stazi"}, 
					"Ce duros fut un brillant Amiral de la Flotte de Défense Galactique de la Fédération Galactique des Alliances Libres vers 130 ap. BY. Il dirigea les Vestiges de l'Alliances d'une main de maître durant la Seconde Guerre Civile Impériale.  ",
					"",
					"garstazi",
					0,
					0,
					null,
					ElementColor.blue,
					"garstazi1",
					"moncalbattle1",
					"stazibetrayal",
					"taivasbattle");
	}

	public static ElementInfo getDackRalterLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dack Ralter",
					new String[]{"Dack Ralter"}, 
					"Pilote humain dans l'Escadron Rogue, combattant pour l'Alliance Rebelle.",
					"",
					"dackralterlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"dackralter1",
					"dackralter2");
	}

	public static ElementInfo getDackRalterClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dack Ralter",
					new String[]{"Dack Ralter"}, 
					"Pilote humain dans l'Escadron Rogue, combattant pour l'Alliance Rebelle.",
					"",
					"dackralterclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"dackralter1",
					"dackralter2");
	}

	public static ElementInfo getSharaBeyClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Shara Bey",
					new String[]{"Shara Bey"}, 
					"Pilote rebelle lors de la guerre civile galactique.",
					"",
					"sharabey",
					0,
					0,
					null,
					ElementColor.blue,
					"sharabey1",
					"sharabey2");
	}

	public static ElementInfo getKesDameronClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kes Dameron",
					new String[]{"Kes Dameron"}, 
					"Soldat rebelle lors de la guerre civile galactique. Il participa aux évènements à la surface d'Endor.",
					"",
					"kesdameron",
					0,
					0,
					null,
					ElementColor.blue,
					"kesdameron1");
	}

	public static ElementInfo getCrixMadineClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Crix Madine",
					new String[]{"Crix Madine", "Madine"}, 
					"Crix Madine fut le commandant des Forces Spéciales de l'Alliance pour Restaurer la République.",
					"",
					"crixmadineclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"madine1",
					"madine2");
	}

	public static ElementInfo getCrixMadineLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Crix Madine",
					new String[]{"Crix Madine", "Madine"}, 
					"Crix Madine fut le commandant des Forces Spéciales de l'Alliance pour Restaurer la République puis de la Nouvelle République.",
					"",
					"crixmadinelegends",
					0,
					0,
					null,
					ElementColor.blue,
					"madine1",
					"madine2");
	}

	public static ElementInfo getCarlistRieekanClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Carlist Rieekan",
					new String[]{"Carlist Rieekan", "Rieekan"}, 
					"Brillant stratège de l'Alliance Rebelle, il commanda de la Base Echo durant la Guerre Civile Galactique.",
					"",
					"carlistrieekanclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"rieekan1",
					"rieekan2");
	}

	public static ElementInfo getCarlistRieekanLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Carlist Rieekan",
					new String[]{"Carlist Rieekan", "Rieekan"}, 
					"Brillant stratège de l'Alliance Rebelle, il commanda de la Base Echo durant la Guerre Civile Galactique.",
					"",
					"carlistrieekanlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"rieekan1",
					"rieekan2");
	}

	public static ElementInfo getAksMoeClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Aks Moe",
					new String[]{"Aks Moe"}, 
					"Aks Moe était le représentant du Protectorat Gran au sein du Sénat de la République Galactique.",
					"",
					"aks",
					0,
					0,
					null,
					ElementColor.blue,
					"aks1");
	}

	public static ElementInfo getBorskFeylyaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Borsk Fey'lya",
					new String[]{"Borsk Fey'lya", "Fey'lya", "Borsk Fey'Lya", "Fey'lya"}, 
					"Grand politicien bothan, il intégra l'Alliance Rebelle après la Bataille de Yavin et devint plus tard Chef d'État de la Nouvelle République.",
					"",
					"borskfeylya",
					0,
					0,
					null,
					ElementColor.blue,
					"feylya1",
					"feylya2",
					"feylya3");
	}

	public static ElementInfo getBiggsDarklighterLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Biggs Darklighter",
					new String[]{"Biggs Darklighter", "Biggs"}, 
					"Ami d'enfance de Luke Skywalker, il fut un pilote au service de l'Alliance Rebelle.",
					"",
					"biggsdarklighterlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"biggs1",
					"biggs2");
	}

	public static ElementInfo getBiggsDarklighterClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Biggs Darklighter",
					new String[]{"Biggs Darklighter", "Biggs"}, 
					"Ami d'enfance de Luke Skywalker, il fut un pilote au service de l'Alliance Rebelle.",
					"",
					"biggsdarklighterclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"biggs1");
	}

	public static ElementInfo getAndurgoLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Andurgo",
					new String[]{"Andurgo"}, 
					"Ce dug quitta sa planète natale Malastare pour aller soutenir les Vestiges de l'Alliance Galactique en tant que pilote durant la Seconde Guerre Civile Impériale.",
					"",
					"andurgo",
					0,
					0,
					null,
					ElementColor.blue,
					"andurgo1");
	}

	public static ElementInfo getGaerielCaptisonLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Gaeriel Captison",
					new String[]{"Gaeriel Captison"}, 
					"Membre d'une famille politique influente de Bakura, elle s'allia aux rebelles lors de la crise de Bakura. ",
					"",
					"gaerielcaptison",
					0,
					0,
					null,
					ElementColor.mediumgreen,
					"logogaerielcaptison");
	}

	public static ElementInfo getJunSatoClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jun Sato",
					new String[]{"Jun Sato"}, 
					"Commandant de l'escadron Phoenix faisant partie du réseau rebelle lutant contre l'Empire Galactique.",
					"",
					"junsato",
					0,
					0,
					null,
					ElementColor.blue,
					"junsato1",
					"junsato2",
					"junsatosd");
	}

	public static ElementInfo getBraylenStrammClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Braylen Stramm",
					new String[]{"Braylen Stramm", "Braylen"}, 
					"Membre de l'escadron Blade de B-Wing au service de l'Alliance Rebelle. Ancien pilote impérial.",
					"",
					"braylen",
					0,
					0,
					null,
					ElementColor.blue,
					"braylen1");
	}

	public static ElementInfo getGinaMoonsongClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Gina Moonsong",
					new String[]{"Gina Moonsong", "Gina"}, 
					"Contrebandière repentie en pilote B-Wing au sein de l'escadron Blade de l'Alliance Rebelle.",
					"",
					"gina",
					0,
					0,
					null,
					ElementColor.blue,
					"gina1");
	}

	public static ElementInfo getGialAckbarClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Gial Ackbar",
					new String[]{"Gial Ackbar", "Ackbar"}, 
					"Mon Calamari devenu Capitaine puis Amiral pour l'Alliance pour Restaurer la République, il devint un symbole pour toute sa faction suite à la Bataille d'Endor.",
					"",
					"ackbarclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"ackbar1",
					"ackbar2");
	}

	public static ElementInfo getGialAckbarLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Gial Ackbar",
					new String[]{"Gial Ackbar", "Ackbar"}, 
					"Mon Calamari devenu Capitaine puis Amiral pour l'Alliance pour Restaurer la République, il devint un symbole pour toute sa faction suite à la Bataille d'Endor. ",
					"",
					"ackbarlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"ackbar1",
					"ackbar2");
	}

	public static ElementInfo getColeetClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Coleet",
					new String[]{"Coleet"}, 
					"Agent rebelle infiltrée.",
					"",
					"coleet",
					0,
					0,
					null,
					ElementColor.blue,
					"coleet1");
	}

	public static ElementInfo getEnebRayClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Eneb Ray",
					new String[]{"Eneb Ray"}, 
					"Agent rebelle infiltrée.",
					"",
					"enebray",
					0,
					0,
					null,
					ElementColor.blue,
					"enebray1",
					"enebray2");
	}

	public static ElementInfo getZsinjLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Zsinj",
					new String[]{"Zsinj"}, 
					"Seigneur de Guerre puissant et sûr de lui, il devint rapidement une gêne pour la Nouvelle République.",
					"",
					"zsinj",
					0,
					0,
					null,
					ElementColor.blue,
					"zsinj1",
					"zsinj2");
	}

	public static ElementInfo getYogarLysteClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Yogar Lyste",
					new String[]{"Yogar Lyste"}, 
					"Officier de l'Empire Galactique stationné sur la planète Lothal, il fut chargé de l'acheminement et du traitement des provisions et armes de la caserne.",
					"",
					"yogarlyste",
					0,
					0,
					null,
					ElementColor.blue,
					"yogarlyste1");
	}

	public static ElementInfo getYsanneIsardLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ysanne Isard",
					new String[]{"Ysanne Isard", "Isard"}, 
					"Ysanne Isard, surnommée Coeur de Glace, fut la Directrice des Renseignements Impériaux durant la Guerre Civile Galactique, sous les ordres de l'Empereur Palpatine.",
					"",
					"ysanneisard",
					0,
					0,
					null,
					ElementColor.blue,
					"ysanneisard1",
					"ysanne2");
	}

	public static ElementInfo getLerrDuvatClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Lerr Duvat",
					new String[]{"Lerr Duvat"}, 
					"Capitaine de destroyer impérial Torment durant la Guerre Civile Galactique. ",
					"",
					"lerrduvat",
					0,
					0,
					null,
					ElementColor.blue,
					"lerrduvat1");
	}

	public static ElementInfo getGulinClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Gulin",
					new String[]{"Gulin"}, 
					"Lieutenant impérial en poste sur le destroyer impérial Torment durant la Guerre Civile Galactique.",
					"",
					"gulin",
					0,
					0,
					null,
					ElementColor.blue,
					"gulin1");
	}

	public static ElementInfo getJharedMontferratClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jhared Montferrat",
					new String[]{"Jhared Montferrat"}, 
					"Officier impérial sur le Star Destroyer le Devastator.",
					"",
					"jhared",
					0,
					0,
					null,
					ElementColor.blue,
					"jhared1");
	}

	public static ElementInfo getWilhuffTarkinClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Wilhuff Tarkin",
					new String[]{"Wilhuff Tarkin"}, 
					"D'abord Capitaine au service de la République Galactique, il serva ensuite loyalement l'Empereur Palpatine. Il occupa le très haut grade de Grand Moff.",
					"",
					"wilhufftarkinclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"tarkin1",
					"tarkinleia",
					"deathstarbirth");
	}

	public static ElementInfo getWilhuffTarkinLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Wilhuff Tarkin",
					new String[]{"Wilhuff Tarkin"}, 
					"D'abord Capitaine au service de la République Galactique, il serva ensuite loyalement l'Empereur Palpatine. Il occupa le très haut grade de Grand Moff.",
					"",
					"wilhufftarkinlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"tarkin1",
					"deathstarbirth");
	}

	public static ElementInfo getVenkaCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Venka",
					new String[]{"Venka"}, 
					"Officier de la marine impériale durant la Guerre Civile Galactique, il serva l'Empire à bord du Super Star Destroyer l'Executor. ",
					"",
					"venka",
					0,
					0,
					null,
					ElementColor.blue,
					"venka1");
	}

	public static ElementInfo getVaclenTorLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Vaclen Tor",
					new String[]{"Vaclen Tor"}, 
					"Capitaine de frégate de classe Ardent durant la Seconde Guerre Civile Impériale, il fut fidèle à l'Empereur Dark Krayt.",
					"",
					"vaclentor",
					0,
					0,
					null,
					ElementColor.blue,
					"vaclentor1",
					"ralltiirbattle");
	}

	public static ElementInfo getTiaanJerjerrodCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tiaan Jerjerrod",
					new String[]{"Tiaan Jerjerrod", "Jerjerrod"}, 
					"Général puis Moff de l'Empire Galactique, Tiaan fut assigné à la surpervision de la construction de l'Etoile de la Mort.",
					"",
					"tiaanjerjerrod",
					0,
					0,
					null,
					ElementColor.blue,
					"jerjerrod1",
					"jerjerrod2");
	}

	public static ElementInfo getFlametrooperClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Flametrooper",
					new String[]{"Flametrooper"}, 
					"Soldat du Premier Ordre vêtu d'une armure classique mais armé d'un lance-flammes mortel.",
					"",
					"flametrooper",
					0,
					0,
					null,
					ElementColor.blue,
					"flametrooper1",
					"flametrooper2");
	}

	public static ElementInfo getScouttrooperCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Scouttrooper",
					new String[]{"Scouttrooper", "scout trooper", "scout troopers", "scouttroopers"}, 
					"Ces soldats à l'armure plus légère sont entraînés pour des actions complexes telles que la reconnaissance et l'espionnage. ",
					"",
					"scouttrooper",
					0,
					0,
					null,
					ElementColor.blue,
					"scouttrooper1",
					"scouttrooper2");
	}

	public static ElementInfo getEVOtrooperLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"EVO trooper",
					new String[]{"EVO trooper"}, 
					"Équipés d'une armure lourde améliorée, ces soldats sont entraînés pour s'adapter et survivre dans des environnements difficiles. ",
					"",
					"evotrooper",
					0,
					0,
					null,
					ElementColor.blue,
					"evotrooper1");
	}

	public static ElementInfo getHazardtrooperLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Hazard trooper",
					new String[]{"Hazard trooper"}, 
					"Ces soldats lourds portent un revêtement blindé le rendant immunisé aux températures extrêmes et aux pires des conditions.  ",
					"",
					"hazardtrooper",
					0,
					0,
					null,
					ElementColor.blue,
					"hazardtrooper1",
					"hazardtrooper2");
	}

	public static ElementInfo getSeatrooperLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Seatrooper",
					new String[]{"Seatrooper"}, 
					"Les Seatroopers sont des Stormtrooper spécialisés pour l'environnement marin. Ils sont employés pour faire règner l'ordre et maintenir une présence impériale dans les mondes aquatiques.",
					"",
					"seatrooper",
					0,
					0,
					null,
					ElementColor.blue,
					"seatrooper1",
					"seatrooper2");
	}

	public static ElementInfo getRockettrooperLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Rocket trooper",
					new String[]{"Rocket trooper"}, 
					"Aussi connus sous les noms de Jumptrooper, Skytooper ou encore Trooper d'assaut, ces soldats impériaux sont des soldats munis pack dorsaux leur permettant d'atteindre des hauteurs et des points habituellement inatteignables. ",
					"",
					"rockettrooper",
					0,
					0,
					null,
					ElementColor.blue,
					"rockettrooper1",
					"rockettrooper2");
	}

	public static ElementInfo getStormtrooperCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Stormtrooper",
					new String[]{"Stormtrooper", "stormtrooper", "stormtroopers"}, 
					"Troupes de choc de l'Empire Galactique et des structure impériales qui suivirent. D'une loyauté indéfectible, ils sont les bras armés de l'Empire ainsi que les représentant de son joug. ",
					"",
					"stormtrooper",
					0,
					0,
					null,
					ElementColor.blue,
					"stormtrooper1",
					"stormtrooper2",
					"stormtrooper3");
	}

	public static ElementInfo getSnowtrooperCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Snowtrooper",
					new String[]{"Snowtrooper", "snowtrooper", "snowtroopers", "Snowtroopers"}, 
					"Soldats surentraînés de l'Empire Galactique, ils étaient envoyés aux confins des mondes glacés.",
					"",
					"snowtrooper",
					0,
					0,
					null,
					ElementColor.blue,
					"snowtrooper1",
					"snowtrooper2");
	}

	public static ElementInfo getPhasmaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Phasma",
					new String[]{"Phasma"}, 
					"Soldat d'élite du Premier Ordre.",
					"",
					"phasma",
					0,
					0,
					null,
					ElementColor.blue,
					"chrometrooper1",
					"chrometrooper2");
	}

	public static ElementInfo getHuxClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Hux",
					new String[]{"Hux"}, 
					"Général du Premier Ordre et commandant de la base Starkiller.",
					"",
					"hux",
					0,
					0,
					null,
					ElementColor.blue,
					"hux1",
					"hux2");
	}

	public static ElementInfo getTerexClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Terex",
					new String[]{"Terex"}, 
					"Agent du Premier Ordre.",
					"",
					"terex",
					0,
					0,
					null,
					ElementColor.blue,
					"terex1");
	}

	public static ElementInfo getBlackholetrooperLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Blackhole trooper",
					new String[]{"Blackhole trooper"}, 
					"Les Stormtroopers de Blackhole étaient à l'origine les soldats personnels du Seigneur Cronal.",
					"",
					"blackholetrooper",
					0,
					0,
					null,
					ElementColor.blue,
					"blackholetrooper1",
					"blackholetrooper2");
	}

	public static ElementInfo getStormtrooperdeLumiyaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Stormtrooper de Lumiya",
					new String[]{"Stormtrooper de Lumiya"}, 
					"Les Stormtroopers de Lumiya étaient les soldats personnels de la Dame Sombre des Sith durant sa vengeance personnelle contre Luke Skywalker.",
					"",
					"lumiyatrooper",
					0,
					0,
					null,
					ElementColor.blue,
					"lumiyatrooper1");
	}

	public static ElementInfo getPiloteTIECommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Pilote TIE",
					new String[]{"Pilote TIE"}, 
					"Corps d'élite de soldats composant la marine impériale.",
					"",
					"pilotetie",
					0,
					0,
					null,
					ElementColor.blue,
					"pilotetie1");
	}

	public static ElementInfo getThrawnLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Thrawn",
					new String[]{"Thrawn"}, 
					"Thrawn est un chiss qui devint Grand Amiral de l'Empire durant la Guerre Civile Galactique, et qui se révéla être l'un des meilleurs stratèges militaires de l'Histoire quand il affronta la Nouvelle République.",
					"",
					"thrawn",
					0,
					0,
					null,
					ElementColor.blue,
					"thrawn1",
					"palpatinethrawn",
					"thrawnvador",
					"thrawnjorus");
	}

	public static ElementInfo getSoontirFelLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Soontir Fel",
					new String[]{"Soontir Fel", "Soontir"}, 
					"Chasseur impérial hors pair, il fut considéré comme un héros dans l'Empire Galactique. Il fut promu Baron pour ses victoires au service de l'Empire.",
					"",
					"soontirfel",
					0,
					0,
					null,
					ElementColor.purple,
					"logosoontirfel",
					"soontirfel2");
	}

	public static ElementInfo getShadowspawnLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Shadowspawn",
					new String[]{"Shadowspawn"}, 
					"Seigneur de Guerre Impérial mystérieux, il fut un chef charismatique et fier. ",
					"",
					"shadowspawn",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"shadowspawn1");
	}

	public static ElementInfo getRulfYageLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Rulf Yage",
					new String[]{"Rulf Yage"}, 
					"Moff et Grand Amiral au service du Nouvel Empire Galactique puis de l'Empire de Roan Fel. Il fut pendant un temps commandant de l'Escadron Skull. Il est le père de Gun Yage.",
					"",
					"rulfyage",
					0,
					0,
					null,
					ElementColor.flesh,
					"logoruffyage",
					"rulfyage2",
					"moffcouncil2");
	}

	public static ElementInfo getRanHarkasLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ran Harkas",
					new String[]{"Ran Harkas"}, 
					"Souvent nommé Hardcase par ses troupes, Ran fut un sergent de l'Escouade Joker durant les guerres Sitho-Impériales et Civiles Impériales.",
					"",
					"ranharkas",
					0,
					0,
					null,
					ElementColor.blue,
					"ranharkas1",
					"jokers1",
					"darkmalevaldeath",
					"geisttaivas");
	}

	public static ElementInfo getPetoKelsanLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Peto Kelsan",
					new String[]{"Peto Kelsan"}, 
					"Amiral du temps du Nouvel Empire Galactique de Roan Fel, il se rallia au nouvel Empereur Dark Krayt.",
					"",
					"petokelsan",
					0,
					0,
					null,
					ElementColor.blue,
					"petokelsan1");
	}

	public static ElementInfo getOsvaldTeshikLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Osvald Teshik",
					new String[]{"Osvald Teshik"}, 
					"Grand Amiral de la marine impériale, il commanda le Grand Secteur Extérieur. Il fut un stratège respecté et capable de compassion, fait rare pour un officier impérial. ",
					"",
					"osvaldteshik",
					0,
					0,
					null,
					ElementColor.blue,
					"teshik1");
	}

	public static ElementInfo getNynaCalixteLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nyna Calixte",
					new String[]{"Nyna Calixte", "Calixte", "Morrigan Corde", "Morrigan"}, 
					"Également connue sous le faux nom de Morrigan Corde comme espionne de l'Empire, elle est en vérité une Moff à la tête du service de Renseignement. Elle fut également la conjointe de Kol Skywalker pendant un temps. ",
					"",
					"nynacalixte",
					0,
					0,
					null,
					ElementColor.flesh,
					"logomorigancorde",
					"calixtefamily",
					"calixtecaamas",
					"calixtelabo",
					"calixtemorrigan",
					"calixtesith",
					"roanfel5",
					"coruscantbattle");
	}

	public static ElementInfo getNialDeclannLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nial Declann",
					new String[]{"Nial Declann"}, 
					"Pilote de chasse de la République puis de l'Empire Galactique, il accèdera par la suite au titre de Grand Amiral pour sa capacité à coordonner ses troupes.",
					"",
					"nialdeclann",
					0,
					0,
					null,
					ElementColor.blue,
					"declann1");
	}

	public static ElementInfo getNatasiDaalaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Natasi Daala",
					new String[]{"Natasi Daala", "Daala"}, 
					"Première femme promue Grande Amirale au sein de l'Empire Galactique. Cette femme forte et arriviste devint par la suite Chef d'État de la Fédération Galactique des Alliances Libres.",
					"",
					"natasidaala",
					0,
					0,
					null,
					ElementColor.blue,
					"daala1",
					"daalarun",
					"imperialcivilwarend",
					"daalaluke");
	}

	public static ElementInfo getMylesGrintClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Myles Grint",
					new String[]{"Myles Grint"}, 
					"Officier sur Lothal du temps de l'apogée de l'Empire Galactique, il s'illustra principalement en temps maître des opérations.",
					"",
					"mylesgrint",
					0,
					0,
					null,
					ElementColor.blue,
					"mylesfrint1");
	}

	public static ElementInfo getMorlishVeedLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Morlish Veed",
					new String[]{"Morlish Veed", "Veed"}, 
					"Grand Moff très ambitieux sous le Nouvel Empire Galactique, il trahira son Empereur Roan Fel avec Dark Krayt afin de prendre le pouvoir. ",
					"",
					"morlishveed",
					0,
					0,
					null,
					ElementColor.blue,
					"morlishveed1",
					"moffcouncil3",
					"moffcouncil2");
	}

	public static ElementInfo getMaximilianVeersCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Maximilian Veers",
					new String[]{"Maximilian Veers", "Veers"}, 
					"Général de l'Empire Galactique issu du famille modeste. Il se lança dans une carrière militaire brillante suite au décès de sa femme.",
					"",
					"maximilianveers",
					0,
					0,
					null,
					ElementColor.blue,
					"veers1");
	}

	public static ElementInfo getMartioBatchLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Martio Batch",
					new String[]{"Martio Batch"}, 
					"Grand Amiral de l'Empire Galactique éloigné des complots et des jeux politiques. Il est à l'origine de la conception des Fantômes TIE.",
					"",
					"martiobatch",
					0,
					0,
					null,
					ElementColor.blue,
					"martiobatch1");
	}

	public static ElementInfo getLorthNeedaCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Lorth Needa",
					new String[]{"Lorth Needa", "Needa"}, 
					"Lieutenant-Commandant sous la République promu au titre de Capitaine durant le règne de l'Empereur Palpatine, il fut chargé de traquer le Faucon Millenium peu après la Bataille de Hoth.",
					"",
					"lorthneeda",
					0,
					0,
					null,
					ElementColor.blue,
					"needa1",
					"needa2");
	}

	public static ElementInfo getDreedClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dreed",
					new String[]{"Dreed"}, 
					"Commandant impérial charger de traquer les survivants d'Alderaan.",
					"",
					"dreed",
					0,
					0,
					null,
					ElementColor.blue,
					"dreed1",
					"dreed2");
	}

	public static ElementInfo getTulaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tula",
					new String[]{"Tula"}, 
					"Subalterne impériale originaire d'Alderaan.",
					"",
					"tula",
					0,
					0,
					null,
					ElementColor.blue,
					"tula1",
					"tula2");
	}

	public static ElementInfo getKirKanosLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kir Kanos",
					new String[]{"Kir Kanos", "Kanos"}, 
					"Dernier membre de la Garde Royal de l'Empereur Palpatine. Ce guerrier loyal envers son Empereur traquera les personnes responsables de sa disparition.   ",
					"",
					"kirkanos",
					0,
					0,
					null,
					ElementColor.blue,
					"kirkanos1",
					"carnorjax3");
	}

	public static ElementInfo getKendalOzzelCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kendal Ozzel",
					new String[]{"Kendal Ozzel", "Ozzel"}, 
					"Amiral relativement prétencieux et arrogant; il dirigea l'Escadron de la Mort jusqu'à ce que le Seigneur Dark Vador en décide autrement.   ",
					"",
					"kendalozzel",
					0,
					0,
					null,
					ElementColor.blue,
					"ozzel1",
					"ozzel2");
	}

	public static ElementInfo getKassiusKonstantineClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kassius Konstantine",
					new String[]{"Kassius Konstantine"}, 
					"Amiral impérial sous l'Empire Galactique à la tête du Star Destroyer de classe Imperial.",
					"",
					"kassiuskonstantine",
					0,
					0,
					null,
					ElementColor.blue,
					"kassius1",
					"kassius2");
	}

	public static ElementInfo getJunoEclipseLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Juno Eclipse",
					new String[]{"Juno Eclipse"}, 
					"Pilote d'exception, cette jeune femme sera la pilote didiée du Rogue Shadow sous les ordres de Starkiller.  ",
					"",
					"juno",
					0,
					0,
					null,
					ElementColor.blue,
					"juno1",
					"junomalek");
	}

	public static ElementInfo getKallusClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kallus",
					new String[]{"Kallus"}, 
					"Agent impérial du Service de Sécurité Impérial assigné sur Lothal afin de poursuivre et d'arréter toute trace de rebellion. ",
					"",
					"kallus",
					0,
					0,
					null,
					ElementColor.blue,
					"kallus1",
					"kallus2",
					"kalluszeb",
					"kallusghost",
					"kallusvador",
					"kallusdest");
	}

	public static ElementInfo getJanusGreejatusCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Janus Greejatus",
					new String[]{"Janus Greejatus"}, 
					"Membre du Conseil Règnant de l'Empire Galactique, il fut un conseiller auprès de l'Empereur Palpatine.",
					"",
					"janusgreejatus",
					0,
					0,
					null,
					ElementColor.blue,
					"janusgreejatus1");
	}

	public static ElementInfo getSatePestageLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sate Pestage",
					new String[]{"Sate Pestage", "Pestage"}, 
					"Aide de camp de Palpatine sous la République, devenu par la suite Grand Vizir de l'Empire.",
					"",
					"pestage",
					0,
					0,
					null,
					ElementColor.blue,
					"pestage1",
					"pestage2");
	}

	public static ElementInfo getJaggedFelLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jagged Fel",
					new String[]{"Jagged Fel"}, 
					"Conjoint de Jaina Solo et fils du Baron Soontir Fel, il dédira sa vie aux Vestiges de l'Empire. Il en devint Chef d'État pour ensuite le remanier en Nouvel Empire Galactique.  ",
					"",
					"jaggedfel",
					0,
					0,
					null,
					ElementColor.purple,
					"logojaggedfel",
					"jainajagged",
					"jaina3");
	}

	public static ElementInfo getIlrazIshinLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Il'raz Ishin",
					new String[]{"Il'raz Ishin"}, 
					"Ardu défenseur de l'Empire Galactique établi par Palpatine, ce Grand Amiral fut un élément central du développement idéologique de l'Empire. ",
					"",
					"ishinilraz",
					0,
					0,
					null,
					ElementColor.blue,
					"ishinilraz1");
	}

	public static ElementInfo getHogrumChalkLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Hogrum Chalk",
					new String[]{"Hogrum Chalk"}, 
					"Chevalier Impérial reconverti en Maître Armurier; il est le beau frère de l'Empereur Roan Fel. Cela ne l'empécha pas de trahir en secret l'Empire Fel à plusieurs occasions.",
					"",
					"hogrumchalk",
					0,
					0,
					null,
					ElementColor.mediumorange,
					"logohogrumchalk",
					"chackfel",
					"roanfelfuneral");
	}

	public static ElementInfo getGunnerYageLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Gunner Yage",
					new String[]{"Gunner Yage"}, 
					"Pilote impérial et leader de l'escadron Skull, elle est la fille du Moff Rulf Yage et de Nyna Calixte. 	",
					"",
					"gunnyage",
					0,
					0,
					null,
					ElementColor.flesh,
					"logogunneryage",
					"rulfyage2",
					"skullsquadron");
	}

	public static ElementInfo getGalakFyyarLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Galak Fyyar",
					new String[]{"Galak Fyyar"}, 
					"Amiral et scientifique de l'Empire à l'origine de la création des shadowtroopers.",
					"",
					"galakfyyar",
					0,
					0,
					null,
					ElementColor.blue,
					"galak1",
					"galak2",
					"galak3");
	}

	public static ElementInfo getGiladPellaeonLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Gilad Pellaeon",
					new String[]{"Gilad Pellaeon"}, 
					"Gilad Pellaeon fut l'une des grandes figures de l'Empire Galactique. Disciple de Thrawn et Grand Amiral des Vestiges, il se battit toute sa vie au service de son gouvernement jusqu'à être reconnu par ses adversaires.",
					"",
					"giladpellaeon",
					0,
					0,
					null,
					ElementColor.blue,
					"pellaeon1",
					"pellaeon2",
					"pellaeonpeace");
	}

	public static ElementInfo getGeistLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Geist",
					new String[]{"Geist"}, 
					"Moff en charge l'Armée Impériale, ce Général servira l'Empire Fel puis l'Empire de Dark Krayt quand ce dernier prit le pouvoir.",
					"",
					"geist",
					0,
					0,
					null,
					ElementColor.blue,
					"geist1",
					"moffcouncil3",
					"geisttaivas");
	}

	public static ElementInfo getFirmusPiettCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Firmus Piett",
					new String[]{"Firmus Piett", "Piett"}, 
					"Amiral de l'Escadron de la Mort à bord du Super Star Destroyer l'Executor, il fut en charge de la traque et l'annihilation de la flotte rebelle durant la Guerre Civile Galactique.",
					"",
					"firmuspiett",
					0,
					0,
					null,
					ElementColor.blue,
					"piett1",
					"deathsquadron",
					"piett2");
	}

	public static ElementInfo getFehlaaurLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Fehlaaur",
					new String[]{"Fehlaaur"}, 
					"Fehlaaur'aitel'loro, ou simplement Fehlaaur est un diplomate chiss durant la période de guerres provoqué par Dark Krayt. Il fut gradé en tant que Moff en charge du Corps Diplomatique Impérial. ",
					"",
					"fehlaaur",
					0,
					0,
					null,
					ElementColor.blue,
					"fehlaaur1",
					"moffcouncil2");
	}

	public static ElementInfo getEvirDerricoteLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Evir Derricote",
					new String[]{"Evir Derricote"}, 
					"Officier et scientifique impérial connu pour avoir créé des armes biologiques comme la Peste de l'Empereur et le virus Krytos.",
					"",
					"evirderricote",
					0,
					0,
					null,
					ElementColor.blue,
					"evirderricote1");
	}

	public static ElementInfo getDruValanLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dru Valan",
					new String[]{"Dru Valan"}, 
					"Originellement loyal envers l'Empereur Fel, cet Amiral impérial se tourna vers l'usurpateur Dark Krayt quand ce dernier prit le pouvoir. Il fut charger de la traque de l'Amiral Gar Stazi de l'Alliance Galactique. ",
					"",
					"druvalan",
					0,
					0,
					null,
					ElementColor.blue,
					"valandru1",
					"moncalbattle1");
	}

	public static ElementInfo getDorjaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dorja",
					new String[]{"Dorja"}, 
					"Capitaine d'un Star Destroyer de classe Imperial Mk. 1 au service de l'Empire Galactique. C'est un capitaine consciencieux et fin stratège.  ",
					"",
					"dorja",
					0,
					0,
					null,
					ElementColor.blue,
					"dorja1");
	}

	public static ElementInfo getDemetriusZaarinLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Demetrius Zaarin",
					new String[]{"Demetrius Zaarin"}, 
					"Ancien Grand Amiral impérial qui tenta d'usurper la place de l'Empereur Palpatine. ",
					"",
					"demetriuszaarin",
					0,
					0,
					null,
					ElementColor.blue,
					"demetriuszaarin1");
	}

	public static ElementInfo getCumberlayneAreskoClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Cumberlayne Aresko",
					new String[]{"Cumberlayne Aresko"}, 
					"Officier impérial basé sur Lothal. Avec Myles Grint, ils se devaient entre autres d'entraîner les nouvelles recrues.",
					"",
					"cumberlaynearesko",
					0,
					0,
					null,
					ElementColor.blue,
					"cumberlaynearesko1");
	}

	public static ElementInfo getCassioTaggeCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Cassio Tagge",
					new String[]{"Cassio Tagge"}, 
					"Figure influente, le Général Cassio Tagge est à la tête des forces impériales de l'Etoile Noire.",
					"",
					"cassiotagge",
					0,
					0,
					null,
					ElementColor.blue,
					"cassiotagge1",
					"cassiotagge2");
	}

	public static ElementInfo getPterThanasLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Pter Thanas",
					new String[]{"Pter Thanas"}, 
					"Commandant exemplaire au service de la marine impériale durant la Guerre Civile Galactique.",
					"",
					"ptertanas",
					0,
					0,
					null,
					ElementColor.mediumgreen,
					"logopterthanas");
	}

	public static ElementInfo getWilekNereusLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Wilek Nereus",
					new String[]{"Wilek Nereus"}, 
					"Gouverneur impérial sur Bakura, il fut l'insgateur de la trêve momentanée entre rebelles et Impériaux. ",
					"",
					"wileknereus",
					0,
					0,
					null,
					ElementColor.blue,
					"wileknereus1");
	}

	public static ElementInfo getAstraalVaoLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Astraal Vao",
					new String[]{"Astraal Vao"}, 
					"Cette Twi'lek est une missionnaire au service de la Mission Impériale dans le but d'aider les autres. Elle est la soeur de Shado Vao.",
					"",
					"astraalvao",
					0,
					0,
					null,
					ElementColor.blue,
					"astraalvao1",
					"astraalvao2");
	}

	public static ElementInfo getZenocQuahLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Zenoc Quah",
					new String[]{"Zenoc Quah"}, 
					"Modeleur Yuuzhan Vong, il resta sur Wayland après la défaite de l'envahisseur. Près d'un siècle plus tard, il aida Dark Maladi à saboter le projet de réparation de Kol Skywalker. ",
					"",
					"zenocquah",
					0,
					0,
					null,
					ElementColor.blue,
					"zenocquah1");
	}

	public static ElementInfo getYominCarrLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Yomin Carr",
					new String[]{"Yomin Carr"}, 
					"Yuuzhan Vong de la caste des guerriers, il empoisonna la planète Belkadan mais fut stopé par Luke Skywalker et Mara Jade.",
					"",
					"yomincarr",
					0,
					0,
					null,
					ElementColor.blue,
					"yomincarr1",
					"maravong");
	}

	public static ElementInfo getVuaRapuungLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Vua Rapuung",
					new String[]{"Vua Rapuung"}, 
					"Guerrier Yuuzhan Vong rétrogadé en honteux. Il s'allia aux Jedi afin de défaire Mezhan Kwaad.",
					"",
					"vuarapuung",
					0,
					0,
					null,
					ElementColor.blue,
					"vuarapuung1",
					"vuarapuung2");
	}

	public static ElementInfo getTsavongLahLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tsavong Lah",
					new String[]{"Tsavong Lah"}, 
					"Maitre de Guerre Yuuzhan Vong émérite et impitoyable de la classe des guerriers. ",
					"",
					"tsavonglah",
					0,
					0,
					null,
					ElementColor.blue,
					"tsavonglah1",
					"tsavonglah2");
	}

	public static ElementInfo getShimrraLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Shimrra",
					new String[]{"Shimrra"}, 
					"Successeur de Quoreal au titre de Seigneur Suprême Yuuzhan Vong, Shimrra Jamaane fut utilisé comme un simple outil par le honteux Onimi. ",
					"",
					"shimrra",
					0,
					0,
					null,
					ElementColor.blue,
					"shimrra1",
					"shimrra2");
	}

	public static ElementInfo getOnimiLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Onimi",
					new String[]{"Onimi"}, 
					"Yuuzhan Vong modeleur rétrogadé à la caste des honteux, il influencera le Seigneur Suprême Shimrra et enclenchera la Guerre des Yuuzhan Vong.  ",
					"",
					"onimi",
					0,
					0,
					null,
					ElementColor.blue,
					"onimi1");
	}

	public static ElementInfo getNomAnorLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nom Anor",
					new String[]{"Nom Anor"}, 
					"Manipulateur et maître espion de renom, Nom Anor est un Yuuzhan Vong à ne surtout pas sous estimer.",
					"",
					"nomanor",
					0,
					0,
					null,
					ElementColor.blue,
					"nomanor1",
					"nomanor2");
	}

	public static ElementInfo getNenYimLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nen Yim",
					new String[]{"Nen Yim"}, 
					"Membre de la caste des modeleurs, elle grandira dans la hiérarchie Yuuzhan Vong jusqu'à finir la modeleuse du Seigneur Suprême Shimrra.",
					"",
					"nenyim",
					0,
					0,
					null,
					ElementColor.blue,
					"nenyim1",
					"nenyim2");
	}

	public static ElementInfo getNeiRinLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nei Rin",
					new String[]{"Nei Rin"}, 
					"Modeleuse Yuuzhan Vong, elle assista le Grand Maître Jedi Kol Skywalker au projet de réparation suite aux ravages de la Guerre Yuuzhan Vong.  ",
					"",
					"neirin",
					0,
					0,
					null,
					ElementColor.blue,
					"neirin1",
					"neirin2");
	}

	public static ElementInfo getNasChokaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nas Choka",
					new String[]{"Nas Choka"}, 
					"Grand stratège Yuuzhan Vong appartenant à la caste des guerriers, Nas Choka fut fidèle au Seigneur Suprème Shimrra.  ",
					"",
					"naschoka",
					0,
					0,
					null,
					ElementColor.blue,
					"naschoka1");
	}

	public static ElementInfo getMezhanKwaadLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mezhan Kwaad",
					new String[]{"Mezhan Kwaad"}, 
					"Yuuzhan Vong appartenant à la caste des modeleurs, elle fut considérée comme hérétique de part ses opionions et son amour avec Vua Rapuung. ",
					"",
					"mezhankwaad",
					0,
					0,
					null,
					ElementColor.blue,
					"mezhankwaad1",
					"mezhankwaad2");
	}

	public static ElementInfo getHarrarLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Harrar",
					new String[]{"Harrar"}, 
					"Haut prêtre Yuuzhan Vong, Harrar est une personne intelligente qui s'allia aux Jedi durant la fin de la Guerre Yuuzhan Vong. ",
					"",
					"harrar",
					0,
					0,
					null,
					ElementColor.blue,
					"harrar1");
	}

	public static ElementInfo getElanLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Elan",
					new String[]{"Elan"}, 
					"Pétresse Yuuzhan Vong, elle fut employée par ses supérieurs afin d'infiltrer les Jedi. ",
					"",
					"elan",
					0,
					0,
					null,
					ElementColor.blue,
					"elan1");
	}

	public static ElementInfo getVhonteTervhoLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Vhonte Tervho",
					new String[]{"Vhonte Tervho"}, 
					"Guerriere mandalorienne effective durant les dernières années de la République Galactique. Elle fut recrutée par Jango Fett afin de servir d'entraîneur pour l'Armée clone. ",
					"",
					"vhontetervho",
					0,
					0,
					null,
					ElementColor.blue,
					"vhontetervho1",
					"vhontetervho2");
	}

	public static ElementInfo getTesVevecLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tes Vevec",
					new String[]{"Tes Vevec"}, 
					"Mercenaire mandalorienne durant la Seconde Guerre Civile Impériale, elle fut la femme d'Hondo Karr.",
					"",
					"tesvevec",
					0,
					0,
					null,
					ElementColor.blue,
					"tesvevec1");
	}

	public static ElementInfo getMirtaGevLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mirta Gev",
					new String[]{"Mirta Gev"}, 
					"Chasseresse de prime née sur Mandalore, elle s'illustra principalement durant la Seconde Guerre Civile Galactique.",
					"",
					"mirtagev",
					0,
					0,
					null,
					ElementColor.darkyellow,
					"mirtagev1",
					"salsoloend",
					"mandowedding");
	}

	public static ElementInfo getPulsipherLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Pulsipher",
					new String[]{"Pulsipher"}, 
					"Néo-croisé mandalorien de l'armée de Mandalore l'Ultime, il fut l'assistant du scientifique Demagol sur la station Flashpoint.",
					"",
					"pulsipher",
					0,
					0,
					null,
					ElementColor.blue,
					"pulsipher1",
					"pulsipher2");
	}

	public static ElementInfo getMandalorelUltimeLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mandalore l'Ultime",
					new String[]{"Mandalore l'Ultime"}, 
					"Créateur des Néo-croisés mandaloriens, une armée unifiée et entraînée, Mandalore l'Ultime fut le successeur de Mandalore l'Indomptable et entraîna les Guerres Mandaloriennes.",
					"",
					"mandalorelultime",
					0,
					0,
					null,
					ElementColor.blue,
					"mandultime1",
					"mandalorianwar2");
	}

	public static ElementInfo getMandalorelIndomptableLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mandalore l'Indomptable",
					new String[]{"Mandalore l'Indomptable"}, 
					"Chef suprême des mandaloriens vers 4000 av. BY. Il faisa participer son peuple à la Grande Guerre des Sith sous les ordres d'Ulic Qel-Droma, un Jedi en déroute devenu apprenti Sith. ",
					"",
					"mandalorelindomptable",
					0,
					0,
					null,
					ElementColor.blue,
					"mandindomptable1",
					"mandindomptable2");
	}

	public static ElementInfo getMandaloreleSauveurLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mandalore le Sauveur",
					new String[]{"Mandalore le Sauveur"}, 
					"Ancien soldat au service de Mandalore l'Ultime durant les Guerres Mandaloriennes, il devint mercenaire puis endossa le rôle de Mandalore quand le moment fut venu.",
					"",
					"mandalorelesauveur",
					0,
					0,
					null,
					ElementColor.blue,
					"mandsauveur1");
	}

	public static ElementInfo getMandaloreleRessusciteurLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mandalore le Ressusciteur",
					new String[]{"Mandalore le Ressusciteur"}, 
					"Clone de Jango Fett, il quitta les rangs de l'Armée clone afin de faire revivre la une armée mandalorienne forte.",
					"",
					"mandaloreleressusciteur",
					0,
					0,
					null,
					ElementColor.blue,
					"mandressuciteur1");
	}

	public static ElementInfo getMandaloreleLegitimeLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mandalore le Légitime",
					new String[]{"Mandalore le Légitime"}, 
					"Ce mandalorien, né Artus, fut le successeur de Mandalore le Bref. Il garda intacte la relation qui existait entre les Mandaloriens et l'Ancien Empire Sith Reconstitué.   ",
					"",
					"mandalorelegitime",
					0,
					0,
					null,
					ElementColor.blue,
					"mandlegitime1");
	}

	public static ElementInfo getMandaloreleBrefLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mandalore le Bref",
					new String[]{"Mandalore le Bref"}, 
					"Gladiateur puis chef de guerre mandalorien à la solde de l'Empire Sith Reconstitué durant la Grande Guerre Galactique.",
					"",
					"mandalorelebref",
					0,
					0,
					null,
					ElementColor.blue,
					"mandlebref1",
					"mandlebref2");
	}

	public static ElementInfo getJasterMereelLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jaster Mereel",
					new String[]{"Jaster Mereel"}, 
					"Jaster Mereel fut le leader des Mandaloriens quelques années avant la Guerre des Clones. Il fut le mentor de Jango Fett, qui lui succéda.",
					"",
					"jastermereel",
					0,
					0,
					null,
					ElementColor.blue,
					"jastermereel1");
	}

	public static ElementInfo getHondoKarrLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Hondo Karr",
					new String[]{"Hondo Karr"}, 
					"Mandalorien qui fut contraint de se cacher parmi les légion de l'Empire Fel et l'Escadron Rogue des Vestiges de l'Alliance Galactique. ",
					"",
					"hondokarr",
					0,
					0,
					null,
					ElementColor.blue,
					"hondokarr1",
					"hondokarrbattle",
					"hondokarrimp",
					"hondokarrandurgo",
					"hondokarrmand");
	}

	public static ElementInfo getGhesOradeLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ghes Orade",
					new String[]{"Ghes Orade"}, 
					"Guerrier mandalorien notable durant la Seconde Guerre Civile Galactique sous le maniement du Mandalore actuel, Boba Fett. ",
					"",
					"ghesorade",
					0,
					0,
					null,
					ElementColor.darkyellow,
					"ghesorade1",
					"mandowedding");
	}

	public static ElementInfo getMakinMarecLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Makin Marec",
					new String[]{"Makin Marec"}, 
					"Makin rencontra Ailyn quand elle souhaita connaitre la culture mandalorienne afin de chasser son père. Il éduqua leur fille, Mirta, aux arts mandaloriens.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.darkyellow,
					"logounknown");
	}

	public static ElementInfo getDemagolLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Demagol",
					new String[]{"Demagol", "Antos Wyrick"}, 
					"Né Antos Wyrick, Demagol est un scientifique zeltron qui se rallia aux néo-croisés durant les Guerres Mandaloriennes afin de mener des expériences sur la Force.",
					"",
					"demagol",
					0,
					0,
					null,
					ElementColor.blue,
					"demagol1",
					"chantiqueyoung",
					"demagolflashpoint",
					"jaraelvschantique");
	}

	public static ElementInfo getCassusFettLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Cassus Fett",
					new String[]{"Cassus Fett"}, 
					"Grand Maréchal sous le règne de Mandalore l'Ultime durant les Guerres Mandaloriennes, Cassus Fett fut un chef de guerre craint par ses stratégies de guerres.  ",
					"",
					"cassusfett",
					0,
					0,
					null,
					ElementColor.blue,
					"cassusfett1",
					"cassusfett2",
					"cassustaris",
					"cassuszayne");
	}

	public static ElementInfo getHeraSyndullaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Hera Syndulla",
					new String[]{"Hera Syndulla", "Hera"}, 
					"Femme Twi'lek pilote du vaisseau rebelle Ghost durant le règne de l'Empire Galactique.  ",
					"",
					"herasyndulla",
					0,
					0,
					null,
					ElementColor.blue,
					"herasyndulla1",
					"hera1",
					"meetr2d2c3po",
					"fyrnocksbattle",
					"ghostcrew1",
					"ghostcrew2",
					"ghostcrew3",
					"herabwing",
					"hera2",
					"herahospital",
					"heracell",
					"heraholo");
	}

	public static ElementInfo getGarazebOrreliosClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Garazeb Orrelios",
					new String[]{"Garazeb Orrelios", "Zeb"}, 
					"Ce guerrier Lasat, souvent nommé Zeb, fut un rebelle et membre de l'équipage du Ghost.",
					"",
					"garazeborrelios",
					0,
					0,
					null,
					ElementColor.blue,
					"garazeborrelios1",
					"zeb2",
					"zeb3",
					"zeb4",
					"ghostcrew4",
					"zebmoney",
					"zeb5",
					"herabwing",
					"kanantie",
					"rexbeast");
	}

	public static ElementInfo getZiroleHuttClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ziro le Hutt",
					new String[]{"Ziro le Hutt"}, 
					"Ziro Desilijic Tiure, ou simplement Ziro le Hutt, est l'oncle de Jabba Desilijic Tiure. Il fut un seigneur du crime hutt mais également un vigo du Soleil Noir.  ",
					"",
					"ziro",
					0,
					0,
					null,
					ElementColor.blue,
					"ziro1");
	}

	public static ElementInfo getGrakkusClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Grakkus",
					new String[]{"Grakkus"}, 
					"Chef Crimine Hutt de Nar Shaddaa passionné d'Histoire.",
					"",
					"grakkus",
					0,
					0,
					null,
					ElementColor.blue,
					"grakkus1",
					"grakkus2");
	}

	public static ElementInfo getZamWesellClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Zam Wesell",
					new String[]{"Zam Wesell", "Zam"}, 
					"Chasseresse de primes clawdite usant de sa capacité à se changer de formes pour chasser ses proies. Elle s'allia à plusieurs reprises au chasseur Jango Fett.",
					"",
					"zamwesellclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"zamwesell1");
	}

	public static ElementInfo getZamWesellLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Zam Wesell",
					new String[]{"Zam Wesell", "Zam"}, 
					"Chasseresse de primes clawdite usant de sa capacité à se changer de formes pour chasser ses proies. Elle s'allia à plusieurs reprises au chasseur Jango Fett. ",
					"",
					"zamweselllegends",
					0,
					0,
					null,
					ElementColor.blue,
					"zamwesell1");
	}

	public static ElementInfo getXizorLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Xizor",
					new String[]{"Xizor"}, 
					"Ce falleen est le dirigeant du Soleil Noir, la plus grande organisation criminelle du temps de la Première Guerre Civile Galactique. Il demeure une figure forte et charismatique et fut quelques fois employé par l'Empereur lui-même.  ",
					"",
					"xizor",
					0,
					0,
					null,
					ElementColor.blue,
					"xizor1",
					"xizor2");
	}

	public static ElementInfo getTorVizslaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tor Vizsla",
					new String[]{"Tor Vizsla"}, 
					"Fondateur et leader de la Death Watch, Tor Vizla fut un guerrier mandalorien farouche qui affronta les Vrais Mandaloriens pendants des années.  ",
					"",
					"torvizsla",
					0,
					0,
					null,
					ElementColor.blue,
					"torvizsla1");
	}

	public static ElementInfo getSabineWrenClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sabine Wren",
					new String[]{"Sabine Wren", "Sabine"}, 
					"Originaire de Mandalore, elle entra dans l'équipe du Ghost à l'époque du règne de l'Empereur Palpatine en tant qu'experte en armes et en graffitis. ",
					"",
					"sabinewren",
					0,
					0,
					null,
					ElementColor.blue,
					"sabinewren1",
					"sabine1",
					"meetr2d2c3po",
					"fyrnocksbattle",
					"sabine2",
					"sabine3",
					"rexold2",
					"sabine4",
					"sabine6",
					"ghostcrew6",
					"sabineholo",
					"sabinebounty",
					"sabinefire");
	}

	public static ElementInfo getTalonKarrdeLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Talon Karrde",
					new String[]{"Talon Karrde"}, 
					"A la fois contrebandier et revendeur d'informations, cela n'empêche en rien Talon Karrde de rester un homme honnête et honorable. Il dirige une organisation de contrebandiers qu'il souhaite garder neutre parmi les guerres qui font rage.  ",
					"",
					"talonkarrde",
					0,
					0,
					null,
					ElementColor.blue,
					"talonkarrde1",
					"karrde2");
	}

	public static ElementInfo getSintYoruLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sint Yoru",
					new String[]{"Sint Yoru"}, 
					"Assassin anzat et compagnion de Nakia Yoru. Il travailla pour le vigo Lun Rask du Soleil Noir du temps de l'apogée du Sith Unique de Dark Krayt.",
					"",
					"sintyoru",
					0,
					0,
					null,
					ElementColor.blue,
					"sintyoru1");
	}

	public static ElementInfo getSintasVelLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sintas Vel",
					new String[]{"Sintas Vel"}, 
					"Kiffar d'origine, cette jeune chasseresse de primes fut la compagne de Boba Fett avec qui elle eu Ailyn Vel. ",
					"",
					"sintasvel",
					0,
					0,
					null,
					ElementColor.darkyellow,
					"sintasvel1",
					"fettfamily");
	}

	public static ElementInfo getShaeVizlaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Shae Vizla",
					new String[]{"Shae Vizla"}, 
					"Chasseresse de primes à la solde de l'Ancien Empire Sith Reconstitué durant la Grande Guerre Galactique et la Guerre Froide Galactique, Shae Vizla fut majoritairement employée pour des missions à hauts risques.",
					"",
					"shaevizla",
					0,
					0,
					null,
					ElementColor.blue,
					"shaevizla1",
					"greatgalacticwar4");
	}

	public static ElementInfo getRavLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Rav",
					new String[]{"Rav"}, 
					"Rav est un pirate de l'espace du temps de la débacle des Jedi et de l'Alliance Galactique face à Dark Krayt. Il trouvera Cade Skywalker, l'instruisant par la piraterie. ",
					"",
					"rav",
					0,
					0,
					null,
					ElementColor.blue,
					"rav1",
					"ravcade",
					"ravcade2");
	}

	public static ElementInfo getNakiaYoruLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nakia Yoru",
					new String[]{"Nakia Yoru"}, 
					"Femme de Sint Yoru, cette anzat fut une assassin au service du Soleil Noir durant le règne de l'Empire Sith de Krayt.",
					"",
					"nakiayoru",
					0,
					0,
					null,
					ElementColor.blue,
					"nakiayoru1",
					"cadenakia");
	}

	public static ElementInfo getMarnHierogryphLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Marn Hierogryph",
					new String[]{"Marn Hierogryph", "Marn"}, 
					"Surnommé Gryph, il fut d'abord connu comme vendeur au marché noir avant de s'embarquer dans mille et une aventures avec Zayne Carrick durant les Guerres Mandaloriennes. Il se veut être une tête pensante insaisissable préférant toujours la ruse au combat.",
					"",
					"marnhierogryph",
					0,
					0,
					null,
					ElementColor.blue,
					"marnhierogryph1",
					"zaynerun",
					"petitbivoli",
					"zayneend",
					"jaraelvschantique");
	}

	public static ElementInfo getLandoCalrissianClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Lando Calrissian",
					new String[]{"Lando Calrissian"}, 
					"D'abord grand joueur et contrebandier, Lando devint par la suite l'administrateur de la Cité des Nuages de Bespin puis Général de l'Alliance Rebelle. Il fut de temps à autres l'ami d'Han Solo.",
					"",
					"landocalrissianclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"lando1",
					"landoreb",
					"hanlando2",
					"deathstar22");
	}

	public static ElementInfo getLandoCalrissianLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Lando Calrissian",
					new String[]{"Lando Calrissian"}, 
					"D'abord grand joueur et contrebandier, Lando devint par la suite l'administrateur de la Cité des Nuages de Bespin puis Général de l'Alliance Rebelle. Il fut de temps à autres l'ami d'Han Solo.  ",
					"",
					"landocalrissianlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"lando1",
					"hanlando1",
					"hanlando2",
					"deathstar22",
					"garmbeliblis2",
					"landovong");
	}

	public static ElementInfo getKuVratLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ku Vrat",
					new String[]{"Ku Vrat"}, 
					"Sous le règne de l'Empire Sith de Dark Krayt, Ku Vrat fut un chasseur de primes égorgeur qui officiat comme assassin à la solde du Soleil Noir.",
					"",
					"kuvrat",
					0,
					0,
					null,
					ElementColor.blue,
					"kuvrat1",
					"calixtekuvrat");
	}

	public static ElementInfo getKeeLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kee",
					new String[]{"Kee"}, 
					"Contrebandière, copilote et mécanicienne dévaronienne à bord du Grinning Liar dont le capitaine et Cha'K. ",
					"",
					"kee",
					0,
					0,
					null,
					ElementColor.blue,
					"kee1",
					"allvscalixte");
	}

	public static ElementInfo getJoolLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jool",
					new String[]{"Jool"}, 
					"Cette hutt est propriétaire de plusieurs cantinas, lui servant de lieu d'échange d'informations. Elle siège également au Grand Conseil Hutt. ",
					"",
					"jool",
					0,
					0,
					null,
					ElementColor.blue,
					"jool1",
					"joolcade");
	}

	public static ElementInfo getJariahSynLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jariah Syn",
					new String[]{"Jariah Syn", "Jariah"}, 
					"D'abord pirate au service de Rav, il s'émencipa et devint chasseur de prime avec Cade Skywalker et Deliah Blue. Il a une haine viscérale envers les utilisateurs de la Force, les accusants de la mort de son père. ",
					"",
					"jariahsyn",
					0,
					0,
					null,
					ElementColor.blue,
					"jariahsyn1",
					"cadedeliahjaria",
					"allvscalixte",
					"jariahsyn2",
					"jariahsyn3",
					"taivasbattle");
	}

	public static ElementInfo getJaraelLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jarael",
					new String[]{"Jarael"}, 
					"Jarael, née Edessa, est une sion au tempérament ardu. Elle vécut beaucoup d'aventures en compagnie de Zayne Carrick, un Jedi en fuite et de Marn Hiérogryph, snivvien qui a de la suite dans les idées.  ",
					"",
					"jarael",
					0,
					0,
					null,
					ElementColor.blue,
					"jarael1",
					"zaynejarael",
					"arkanianbattle",
					"jaraelvschantique");
	}

	public static ElementInfo getJangoFettClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jango Fett",
					new String[]{"Jango Fett", "Jango"}, 
					"Chasseur de prîme, assassin et mercenaire de renom, il est tout naturel qu'il fut l'homme utilisé comme model pour l'armée clone de la République Galactique.",
					"",
					"jangofettclassic",
					0,
					0,
					null,
					ElementColor.orange,
					"jangofett1",
					"jangoarmy");
	}

	public static ElementInfo getJangoFettLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jango Fett",
					new String[]{"Jango Fett", "Jango"}, 
					"Chasseur de prîme, assassin et mercenaire de renom, il est tout naturel qu'il fut l'homme utilisé comme model pour l'armée clone de la République Galactique.   ",
					"",
					"jangofettlegends",
					0,
					0,
					null,
					ElementColor.orange,
					"jangofett1",
					"deathwatch3",
					"jangoarmy");
	}

	public static ElementInfo getJabbaleHuttClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jabba le Hutt",
					new String[]{"Jabba le Hutt", "Jabba"}, 
					"De son nom complet Jabba Desilijic Tiure, il fut l'un des premiers et plus puissant Seigneur du crime hutt durant la période impériale.",
					"",
					"jabbaclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"jabba1",
					"bobafettjabba",
					"jabbaluke",
					"jabbadeath");
	}

	public static ElementInfo getJabbaleHuttLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jabba le Hutt",
					new String[]{"Jabba le Hutt", "Jabba"}, 
					"De son nom complet Jabba Desilijic Tiure, il fut l'un des premiers et plus puissant Seigneur du crime hutt durant la période impériale.",
					"",
					"jabbalegends",
					0,
					0,
					null,
					ElementColor.blue,
					"jabba1",
					"bobafettjabba",
					"jabbaluke",
					"jabbadeath");
	}

	public static ElementInfo getIG86Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"IG-86",
					new String[]{"IG-86"}, 
					"l'IG-86 est un model de droïde produit par Holowan Mechanicals, la même entreprise qui produit les droïdes assassins de série IG-88. Il est conçu pour la garde rapproché, la sécurité et parfois se voit utilisé pour des desseins plus sombres. ",
					"",
					"ig86",
					0,
					0,
					null,
					ElementColor.blue,
					"ig86");
	}

	public static ElementInfo getHyloViszLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Hylo Visz",
					new String[]{"Hylo Visz"}, 
					"Cette mirialan qui vécue durant la Grande Guerre Galactique fut une contrebandière galactiquement connue pour avoir forcé le blocus mandalorien qui barrait le coeur de la République de ses ressources. ",
					"",
					"hylovisz",
					0,
					0,
					null,
					ElementColor.blue,
					"hylovisz1",
					"hylovizs2",
					"hyloviszblock",
					"hyloviszfame");
	}

	public static ElementInfo getHanSoloClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Han Solo",
					new String[]{"Han Solo", "Han"}, 
					"Célèbre contrebandier correlien devenu Général de l'Alliance Rebelle durant le règne de l'Empire Galactique. Il est le pilote de la casserole volante nommée le Faucon Millenium, copiloté par le Wookiee Chewbacca.",
					"",
					"hansoloclassic",
					0,
					0,
					null,
					ElementColor.green,
					"logohansolo",
					"han1",
					"han2",
					"hancyrkon",
					"han3",
					"hansolosana",
					"han5",
					"han6",
					"hanchewieold",
					"hansoloend");
	}

	public static ElementInfo getHanSoloLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Han Solo",
					new String[]{"Han Solo", "Han"}, 
					"Célèbre contrebandier correlien devenu Général de l'Alliance Rebelle durant le règne de l'Empire Galactique. Il est le pilote de la casserole volante nommée le Faucon Millenium, copiloté par le Wookiee Chewbacca.  ",
					"",
					"hansololegends",
					0,
					0,
					null,
					ElementColor.green,
					"logohansolo",
					"hantie",
					"han1",
					"han2",
					"han5",
					"han6",
					"garmbeliblis2",
					"blackfleet2",
					"chewiedeath",
					"hankillik",
					"leiahan");
	}

	public static ElementInfo getAilynVelLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ailyn Vel",
					new String[]{"Ailyn Vel"}, 
					"Jeune chasseresse de prîme reconnue efficace et respectable. Elle est la fille de Boba Fett et de Sintas Vel.",
					"",
					"ailynvel",
					0,
					0,
					null,
					ElementColor.darkyellow,
					"ailynvel1",
					"fettfamily");
	}

	public static ElementInfo getGreedoCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Greedo",
					new String[]{"Greedo"}, 
					"Chasseur de prîme rodien à la solde de faction comme la Fédération du Commerce, l'Empire Galactique ou les Hutt. ",
					"",
					"greedo",
					0,
					0,
					null,
					ElementColor.blue,
					"greedo1",
					"greedodeath");
	}

	public static ElementInfo getGhaNachktClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Gha Nachkt",
					new String[]{"Gha Nachkt"}, 
					"Pilleur et ferailleur trandoshan durant les dernières années de la République Galactique. Bien qu'il souhaite rester neutre durant la Guerre des Clones, il s'allia à quelques reprises aux Séparatistes.  ",
					"",
					"ghanachkt",
					0,
					0,
					null,
					ElementColor.blue,
					"ghanachkt1");
	}

	public static ElementInfo getEzraBridgerClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ezra Bridger",
					new String[]{"Ezra Bridger", "Ezra"}, 
					"Ce jeune orphelin sensible à la Force et originaire de Lothal fut découvert par Kanan Jarrus, il s'ensuivit d'une formation de Jedi par ce dernier.",
					"",
					"ezrabridger",
					0,
					0,
					null,
					ElementColor.blue,
					"ezrabridger1",
					"ezrapilote",
					"ezrasabre",
					"ezra2",
					"ezrainquisitor",
					"ezrainfiltre",
					"ezra3",
					"ezra4",
					"ezravador",
					"ezraahsoka",
					"ezra5",
					"ezraondo",
					"ezrababy",
					"kananleia",
					"heracell",
					"ezrayoda",
					"ezramalachor",
					"ezravador2");
	}

	public static ElementInfo getDeliahBlueLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Deliah Blue",
					new String[]{"Deliah Blue", "Deliah"}, 
					"Belle zeltronne vivant durant la période des guerres Sitho-Impériale et Civile Impériale, elle fut la concubine du recherché Cade Skywalker et la mécanicienne de son vaisseau, le Mynock.",
					"",
					"deliahblue",
					0,
					0,
					null,
					ElementColor.blue,
					"deliahblue1",
					"cadedeliahjaria",
					"deliahvong",
					"hadabbadonbattle",
					"deliahmission",
					"cadedeliah");
	}

	public static ElementInfo getDengarClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dengar",
					new String[]{"Dengar"}, 
					"Pilote de moto swoop émérite, ce corellien commencera à se faire un nom en devenant un chasseur de prîme renommé.",
					"",
					"dengarclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"dengar1",
					"dengarkage",
					"dengarchewie");
	}

	public static ElementInfo getDengarLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dengar",
					new String[]{"Dengar"}, 
					"Pilote de moto swoop émérite, ce corellien commencera à se faire un nom en devenant un chasseur de prîme renommé. ",
					"",
					"dengarlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"dengar1",
					"bobadengar");
	}

	public static ElementInfo getBomoVertemousseLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bomo Vertemousse",
					new String[]{"Bomo Vertemousse"}, 
					"Réfugié nosaurien de la Guerre de Clones.",
					"",
					"bomo",
					0,
					0,
					null,
					ElementColor.blue,
					"bomo1");
	}

	public static ElementInfo getCrysTaanzerLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Crys Taanzer",
					new String[]{"Crys Taanzer"}, 
					"Contrebandière et membre d'équipage du Uhumele.",
					"",
					"crystaanzer",
					0,
					0,
					null,
					ElementColor.blue,
					"crystaanzer1");
	}

	public static ElementInfo getJanksLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Janks",
					new String[]{"Janks"}, 
					"Contrebandier et membre d'équipage du Uhumele.",
					"",
					"janks",
					0,
					0,
					null,
					ElementColor.blue,
					"janks1");
	}

	public static ElementInfo getMezgrafLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mezgraf",
					new String[]{"Mezgraf"}, 
					"Contrebandier et membre d'équipage du Uhumele.",
					"",
					"mezgraf",
					0,
					0,
					null,
					ElementColor.blue,
					"mezgraf1");
	}

	public static ElementInfo getMeekerdinmaaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Meekerdin-maa",
					new String[]{"Meekerdin-maa", "Ratty"}, 
					"Contrebandier et membre du Uhumele. ",
					"",
					"meekerdinmaa",
					0,
					0,
					null,
					ElementColor.blue,
					"meekerdinmaa1");
	}

	public static ElementInfo getKoVakierLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ko Vakier",
					new String[]{"Ko Vakier"}, 
					"Membre d'équipage du Uhumele.",
					"",
					"kovakier",
					0,
					0,
					null,
					ElementColor.blue,
					"kovakier1");
	}

	public static ElementInfo getSchurkHerenLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Schurk-Heren",
					new String[]{"Schurk-Heren"}, 
					"Capitaine du Uhumele au temps de l'avènement de l'Empire Galactique.",
					"",
					"schurkheren",
					0,
					0,
					null,
					ElementColor.blue,
					"schurkheren1");
	}

	public static ElementInfo getChewbaccaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Chewbacca",
					new String[]{"Chewbacca", "Chewie"}, 
					"Autrefois fier guerrier Wookiee allié à la République, ce contrebandier est devenu le copilote et meilleur ami d'Han Solo. Ensemble, ils vivront moult tumultes et péripéties épiques.",
					"",
					"chewbaccaclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"chewie1",
					"chewietrando",
					"tarfful2",
					"han2",
					"chewiecymoon",
					"dengarchewie",
					"c3pochewie",
					"han6",
					"hanchewieold");
	}

	public static ElementInfo getChewbaccaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Chewbacca",
					new String[]{"Chewbacca", "Chewie"}, 
					"Autrefois fier guerrier Wookiee allié à la République, ce contrebandier est devenu le copilote et meilleur ami d'Han Solo. Ensemble, ils vivront moult tumultes et péripéties épiques. ",
					"",
					"chewbaccalegends",
					0,
					0,
					null,
					ElementColor.blue,
					"chewie1",
					"tarfful2",
					"hantie",
					"hanchewie",
					"han2",
					"han6",
					"chewiedeath");
	}

	public static ElementInfo getSanaSoloClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sana Solo",
					new String[]{"Sana Solo", "Sana"}, 
					"Jeune humaine chasseresse de primes, qui, a une certaine date inconnue épousa Han Solo.",
					"",
					"sanasolo",
					0,
					0,
					null,
					ElementColor.green,
					"sanasolo1",
					"sanasolo2",
					"sanasolo3");
	}

	public static ElementInfo getChaKLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Cha'K",
					new String[]{"Cha'K"}, 
					"Contrebandier Wookiee qui aura connu les dernières années de l'Ancienne République et la chûte de l'Alliance Galactique face à Dark Krayt. ",
					"",
					"chaka",
					0,
					0,
					null,
					ElementColor.blue,
					"chak1",
					"allvscalixte");
	}

	public static ElementInfo getCaloNordLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Calo Nord",
					new String[]{"Calo Nord"}, 
					"Chasseur de prîme durant la période entourant la Guerre Civile des Jedi. Son enfance tragique le porta à devenir un chasseur dangeureux n'épargnant personne sur son chemin.",
					"",
					"calonord",
					0,
					0,
					null,
					ElementColor.blue,
					"calonord1",
					"calonord2");
	}

	public static ElementInfo getCadBaneClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Cad Bane",
					new String[]{"Cad Bane"}, 
					"Chasseur de prîme duros, Cad Bane se fit majoritairement connaître durant la Guerre des Clones comme étant un mercenaire méthodique, sans peur et fatal.",
					"",
					"cadbane",
					0,
					0,
					null,
					ElementColor.blue,
					"cadbane1",
					"cadbane2",
					"aurasing2");
	}

	public static ElementInfo getBosskClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bossk",
					new String[]{"Bossk"}, 
					"Chasseur de prîmes trandoshan et rival de Boba Fett, il se plait à pister les proies difficiles.",
					"",
					"bosskclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"bossk1",
					"aurraboba",
					"asajjborsk");
	}

	public static ElementInfo getBosskLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bossk",
					new String[]{"Bossk"}, 
					"Chasseur de prîmes trandoshan et rival de Boba Fett, il se plait à pister les proies difficiles.",
					"",
					"bossklegends",
					0,
					0,
					null,
					ElementColor.blue,
					"bossk1",
					"bobabossk");
	}

	public static ElementInfo getBoKaTanKryzeClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bo-KaTan Kryze",
					new String[]{"Bo-KaTan Kryze", "Bo-KaTan"}, 
					"Soeur de la duchesse Satine Kryze, cette mandalorienne est une membre active de la Death Watch.  ",
					"",
					"bokatan",
					0,
					0,
					null,
					ElementColor.blue,
					"bokatankryze1",
					"bokatanplan",
					"bokatanobiwan");
	}

	public static ElementInfo getMazKanataClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Maz Kanata",
					new String[]{"Maz Kanata", "Maz"}, 
					"Pirate millénaire sensible à la force, elle gère son chateau sur la planète Takodana. ",
					"",
					"mazkanata",
					0,
					0,
					null,
					ElementColor.blue,
					"mazkanata1",
					"mazkanata2");
	}

	public static ElementInfo getKrrsantanleNoirClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Krrsantan le Noir",
					new String[]{"Krrsantan le Noir", "Krrsantan"}, 
					"Chasseur de prîme Wookiee du temps de la Guerre Civile Galactique.",
					"",
					"krrsantan",
					0,
					0,
					null,
					ElementColor.blue,
					"krrsantan1",
					"krrsantan2");
	}

	public static ElementInfo getBobaFettClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Boba Fett",
					new String[]{"Boba Fett", "Boba"}, 
					"Chasseur de prîme de légende durant la période impériale, il est le fils cloné de Jango Fett. Réputé comme le plus meilleur de sa catégorie, ses tarifs exhorbitants sont toujours synonymes de réussite.",
					"",
					"bobafettclassic",
					0,
					0,
					null,
					ElementColor.orange,
					"bobafett1",
					"bobafettyoung",
					"bobafett3",
					"bobafettjabba");
	}

	public static ElementInfo getBobaFettLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Boba Fett",
					new String[]{"Boba Fett", "Boba"}, 
					"Chasseur de prîme de légende, il est le fils cloné de Jango Fett. Réputé comme le plus meilleur de sa catégorie, ses tarifs exhorbitants sont toujours synonymes de réussite.",
					"",
					"bobafettlegends",
					0,
					0,
					null,
					ElementColor.orange,
					"bobafett1",
					"bobafettyoung",
					"bobafett3",
					"bobafettvsvador",
					"bobafettjabba",
					"bobafett2",
					"bobafett8",
					"bobafettjaina");
	}

	public static ElementInfo getArlaFettLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Arla Fett",
					new String[]{"Arla Fett"}, 
					"Grande soeur de Jango Fett. Prise pour morte lors de l'attaque de la Death Watch sur Concord Dawn, elle entra dans leur rang en tant qu'assassin. ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.orange,
					"logounknown");
	}

	public static ElementInfo getBibFortunaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bib Fortuna",
					new String[]{"Bib Fortuna"}, 
					"Ce Twi'lek est le majordome et homme de main cupide du baron du crîme Jabba le Hutt.",
					"",
					"bibfortunaclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"bibfortuna1",
					"bibfortuna2");
	}

	public static ElementInfo getBibFortunaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bib Fortuna",
					new String[]{"Bib Fortuna"}, 
					"Ce Twi'lek est le majordome et homme de main cupide du baron du crîme Jabba le Hutt.",
					"",
					"bibfortunalegends",
					0,
					0,
					null,
					ElementColor.blue,
					"bibfortuna1",
					"bibfortuna2",
					"jabbaluke");
	}

	public static ElementInfo getAurraSingClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Aurra Sing",
					new String[]{"Aurra Sing", "Aurra"}, 
					"Mercenaire et chasseresse de primes tout aussi dangeureuse qu'impitoyable réputée à travers la galaxie pour sa capacité à traquer ses cibles sans relâche.",
					"",
					"aurrasingclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"aurasing1",
					"aurraboba",
					"aurasing2");
	}

	public static ElementInfo getAurraSingLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Aurra Sing",
					new String[]{"Aurra Sing", "Aurra"}, 
					"Jedi déchue, elle se tourna vers la chasse à l'homme en usant de ses abilités pour tuer ses proies.",
					"",
					"aurrasinglegends",
					0,
					0,
					null,
					ElementColor.blue,
					"aurasing1",
					"aurrahunt",
					"aurracoma");
	}

	public static ElementInfo getTalzinClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Talzin",
					new String[]{"Talzin"}, 
					"Figure de pouvoir au sein des Soeurs de la Nuit durant les Guerres des Clones. Elle est le guide spirituel ainsi que la mère du clan.",
					"",
					"talzin",
					0,
					0,
					null,
					ElementColor.blue,
					"talzin1",
					"talzin2",
					"talzin3");
	}

	public static ElementInfo getSnokeClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Snoke",
					new String[]{"Snoke"}, 
					"Leader Suprême du Premier Ordre, le mystérieux Snoke est un maître adepte du Côté Obscur avec pour apprenti Kylo Ren. ",
					"",
					"snoke",
					0,
					0,
					null,
					ElementColor.blue,
					"snoke1",
					"snoke2");
	}

	public static ElementInfo getKyloRenClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kylo Ren",
					new String[]{"Kylo Ren", "Kylo"}, 
					"Ancien Jedi du Nouvel Ordre de Luke Skywalker. Il devint le chef des Chevaliers de Ren et une figure de terreur durant le règne du Premier Ordre.",
					"",
					"kyloren",
					0,
					0,
					null,
					ElementColor.blue,
					"kyloren1",
					"kyloren2",
					"kyloren3",
					"kyloren4");
	}

	public static ElementInfo getBenSoloClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ben Solo",
					new String[]{"Ben Solo"}, 
					"Ancien Jedi du Nouvel Ordre de Luke Skywalker. Il devint le chef des Chevaliers de Ren et une figure de terreur durant le règne du Premier Ordre.",
					"",
					"kyloren",
					0,
					0,
					null,
					ElementColor.green,
					"bensolo1",
					"kyloren2",
					"kyloren3",
					"kyloren4");
	}

	public static ElementInfo getDarkVadorClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Vador",
					new String[]{"Dark Vador", "Vador"}, 
					"Cendres d'Anakin Skywalker, ce Seigneur Sith règna d'une poigne de Fer avec son maître Dark Sidious sur la quasi-totalité de la galaxie connue durant 23 années.",
					"",
					"anakinskywalkerclassic",
					0,
					0,
					null,
					ElementColor.red,
					"logodarkvador",
					"anakin1",
					"anakin2",
					"anakin3",
					"anakin4",
					"anakin5",
					"anakin6",
					"anakin7",
					"anakin8",
					"anakin9",
					"zillo2",
					"anakin11",
					"anakin12",
					"anakin13",
					"anakin14",
					"anakin15",
					"anakin16",
					"anakin17",
					"anakin18",
					"anakin19",
					"vadorlothal",
					"ahsokavador2",
					"anakin20",
					"anakin21",
					"vadorjabba",
					"vadoraphra",
					"vadorleia",
					"anakin22",
					"anakin23");
	}

	public static ElementInfo getDarkVadorLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Vador",
					new String[]{"Dark Vador", "Vador"}, 
					"Cendres d'Anakin Skywalker, ce Seigneur Sith règna d'une poigne de Fer avec son maître Dark Sidious sur la quasi-totalité de la galaxie connue durant 23 années.",
					"",
					"anakinskywalkerlegends",
					0,
					0,
					null,
					ElementColor.red,
					"logodarkvador",
					"anakin1",
					"anakin2",
					"anakin3",
					"anakin4",
					"anakin5",
					"anakin16",
					"anakin17",
					"anakin18",
					"anakin19",
					"anakin20",
					"anakin22",
					"anakin23");
	}

	public static ElementInfo getDarkSidiousClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Sidious",
					new String[]{"Dark Sidious", "Sidious"}, 
					"Originaire de Naboo, cet humain instruit au Côté Obscur par Dark Plagueis, fut sénateur puis Chancelier Suprême avant de renverser la République Galactique pour établir le premier Empire Galactique et règner en maître.",
					"",
					"sheevpalpatineclassic",
					0,
					0,
					null,
					ElementColor.red,
					"logodarksidious",
					"neimodiansidious",
					"palpatineanakin1",
					"palpatinepolitic",
					"palpatinechildt",
					"palpatinezillo",
					"savage3",
					"palpatineorder66",
					"palpatinecylo",
					"palpatineend");
	}

	public static ElementInfo getDarkSidiousLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Sidious",
					new String[]{"Dark Sidious", "Sidious"}, 
					"Originaire de Naboo, cet humain instruit au Côté Obscur par Dark Plagueis, fut sénateur puis Chancelier Suprême avant de renverser la République Galactique pour établir le premier Empire Galactique et règner en maître.",
					"",
					"sheevpalpatinelegends",
					0,
					0,
					null,
					ElementColor.red,
					"logodarksidious",
					"palpatineapprentice",
					"palpatinethrawn",
					"palpatineorder66",
					"palpatineemperor",
					"palpatinestarkiller",
					"palpatineend",
					"palpatinereborn");
	}

	public static ElementInfo getSheevPalpatineClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sheev Palpatine",
					new String[]{"Sheev Palpatine", "Palpatine"}, 
					"Originaire de Naboo, cet humain instruit au Côté Obscur par Dark Plagueis, fut sénateur puis Chancelier Suprême avant de renverser la République Galactique pour établir le premier Empire Galactique et règner en maître.",
					"",
					"sheevpalpatineclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"palpatine1",
					"neimodiansidious",
					"palpatinepolitic",
					"palpatinechildt",
					"palpatinezillo",
					"savage3",
					"palpatineorder66",
					"palpatinecylo",
					"palpatineend");
	}

	public static ElementInfo getSheevPalpatineLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sheev Palpatine",
					new String[]{"Sheev Palpatine", "Palpatine"}, 
					"Originaire de Naboo, cet humain instruit au Côté Obscur par Dark Plagueis, fut sénateur puis Chancelier Suprême avant de renverser la République Galactique pour établir le premier Empire Galactique et règner en maître. ",
					"",
					"sheevpalpatinelegends",
					0,
					0,
					null,
					ElementColor.blue,
					"palpatine1",
					"palpatineapprentice",
					"palpatinethrawn",
					"palpatineorder66",
					"palpatineemperor",
					"palpatinestarkiller",
					"palpatineend",
					"palpatinereborn");
	}

	public static ElementInfo getArdenLynLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Arden Lyn",
					new String[]{"Arden Lyn"}, 
					"Amante de Xendor et combattante capable de térasser ses ennemis à main nues. Elle aida Xendor dans sa lutte contre l'Ordre Jedi établi.",
					"",
					"ardenlyn",
					0,
					0,
					null,
					ElementColor.blue,
					"ardenlyn1",
					"firstgreatschism2");
	}

	public static ElementInfo getZekkLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Zekk",
					new String[]{"Zekk"}, 
					"Jeune et humble Chevalier Jedi et membre de l'Académie des Ombres.",
					"",
					"zekk",
					0,
					0,
					null,
					ElementColor.blue,
					"zekk1",
					"zekk2",
					"zekk3");
	}

	public static ElementInfo getYunLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Yun",
					new String[]{"Yun"}, 
					"Jeune Jedi Noir originaire de Panatha, il suiva Sariss et Jerec après avoir assassiné son propre père.",
					"",
					"yun",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"yun1",
					"yun2");
	}

	public static ElementInfo getXoxaanLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Xoxaan",
					new String[]{"Xoxaan"}, 
					"Parmi les premiers Jedi Noirs, elle commença à bâtir ce qui devint l'Ordre Sith. L'esprit de sa tombe rencontrera A'Sharad Hett, l'instruisant au Côté Obscur. ",
					"",
					"xoxaan",
					0,
					0,
					null,
					ElementColor.darkblue,
					"logoxoxaan",
					"karnessmuur2",
					"kraytxoxaan");
	}

	public static ElementInfo getXeshLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Xesh",
					new String[]{"Xesh"}, 
					"Chien de Force et esclave du prédeur Tul'kar, il infiltra les Je'daii de Tython et tomba amoureux de Shae Koda.",
					"",
					"xesh",
					0,
					0,
					null,
					ElementColor.blue,
					"xesh1",
					"xesh2",
					"xesh3",
					"xesh4");
	}

	public static ElementInfo getXendorLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Xendor",
					new String[]{"Xendor"}, 
					"Xendor, le commandant des Légions de Lettow, fut une figure majeure et mystérieuse du Premier Grand Schisme ainsi que l'amant d'Arden Lyn.",
					"",
					"xendor",
					0,
					0,
					null,
					ElementColor.blue,
					"xendor1",
					"firstgreatschism2");
	}

	public static ElementInfo getVulIsenLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Vul Isen",
					new String[]{"Vul Isen"}, 
					"Scientifique Sith au service du Sith Unique de Dark Krayt. Ses méthodes furent employées afin d'accélérer le génocide de Mon Calamari.  ",
					"",
					"vulisen",
					0,
					0,
					null,
					ElementColor.blue,
					"vulisen1",
					"vulisen2",
					"vulisen3");
	}

	public static ElementInfo getVitiateLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Vitiate",
					new String[]{"Vitiate", "Empereur Sith", "Valkorion"}, 
					"L'Empereur Noir des Sith, il est le Seigneur Sith à avoir restaurer l'Empire Sith déchu de Naga Sadow sous la forme de l'Ancien Empire Sith Reconstitué.",
					"",
					"vitiate",
					0,
					0,
					null,
					ElementColor.darkblue,
					"logovitiate",
					"greatgalacticwar1",
					"revanmalakvitiate",
					"vitiate2",
					"vitiate3",
					"eternalthrone");
	}

	public static ElementInfo getThexanLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Thexan",
					new String[]{"Thexan"}, 
					"Fils de l'Empereur Valkorion et frère jumeaux d'Arcann. Il fut entrainé comme un guerrier afin de faire la fierté de son père.",
					"",
					"thexan",
					0,
					0,
					null,
					ElementColor.blue,
					"thexan1",
					"thexan2");
	}

	public static ElementInfo getArcannLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Arcann",
					new String[]{"Arcann"}, 
					"Fils de l'Empereur Valkorion et frère jumeaux de Thexan. Il fut entrainé comme un guerrier afin de faire la fierté de son père.",
					"",
					"arcann",
					0,
					0,
					null,
					ElementColor.blue,
					"arcann1",
					"arcann2");
	}

	public static ElementInfo getVergereLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Vergere",
					new String[]{"Vergere"}, 
					"Cette fosh fut une chevalier Jedi dans les dernières années de la République avant de se tourner vers le Côté Obscur et d'amener plusieurs Jedi à suivre son chemin.",
					"",
					"vergere",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"logovergere",
					"vongwars1",
					"kraytvergere");
	}

	public static ElementInfo getSkalNasLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Skal'Nas",
					new String[]{"Skal'Nas", "Skal'nas"}, 
					"Prédeur de l'Empire Infini, il organisa avec Tul'Kar l'invasion de Tython, un monde riche en Force.",
					"",
					"skalnas",
					0,
					0,
					null,
					ElementColor.blue,
					"skalnas1",
					"skalnas2",
					"skalnas3");
	}

	public static ElementInfo getTulKarLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tul'Kar",
					new String[]{"Tul'Kar", "ul'kar"}, 
					"Prédeur de l'Empire Infini, il forma plusieurs esclaves au rang de Chien de Force afin de débusquer des mondes emplis de Force.",
					"",
					"tulkar",
					0,
					0,
					null,
					ElementColor.blue,
					"tulkar1");
	}

	public static ElementInfo getTrillLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Trill",
					new String[]{"Trill"}, 
					"Chien de Force au service de l'Empire Infini des Rakata, elle fut une servante du prédeur Skal'nas. Elle fut une rivale du Chien de Force Xesh. ",
					"",
					"trill",
					0,
					0,
					null,
					ElementColor.blue,
					"trill1",
					"trill2");
	}

	public static ElementInfo getTolSkorrLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tol Skorr",
					new String[]{"Tol Skorr"}, 
					"Jedi Noir au service du Comte Dooku durant la Guerre des Clones, il fit de Quinlan Vos un ennemi personnel.",
					"",
					"tolskorr",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"tolskorr1",
					"tolskorr2",
					"quinlanvosskor");
	}

	public static ElementInfo getTenebKelLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Teneb Kel",
					new String[]{"Teneb Kel"}, 
					"Acolyte Sith durant la Guerre Froide Galactique, il se renomma Dark Thanaton après avoir pourchassé une ancienne disciple de l'Empereur Noir des Sith.",
					"",
					"tenebkel",
					0,
					0,
					null,
					ElementColor.blue,
					"tenebkel1",
					"tenebkel2",
					"tenebkel3",
					"tenebkel4");
	}

	public static ElementInfo getTavionAxmisLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tavion Axmis",
					new String[]{"Tavion Axmis", "Tavion"}, 
					"Jedi Noire disciple de Desann, elle forma le Culte de Ragnos afin de térasser le Nouvel Ordre Jedi de Luke Skywalker. ",
					"",
					"tavion",
					0,
					0,
					null,
					ElementColor.blue,
					"tavion1",
					"taviondesann",
					"tavion2");
	}

	public static ElementInfo getStarkillerLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Starkiller",
					new String[]{"Starkiller", "Galen Marek"}, 
					"Elève secret de Dark Vador, il fut l'intrument des Seigneurs Sith afin de débusquer les ennemis de l'Empire Galactique de Palpatine.",
					"",
					"starkiller",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"logostarkiller",
					"starkillerrahmkota",
					"starkillerreturn",
					"palpatinestarkiller");
	}

	public static ElementInfo getSoraBulqLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sora Bulq",
					new String[]{"Sora Bulq"}, 
					"Puissant Maître Jedi tombé du côté obscur durant la Guerre des Clones.",
					"",
					"sorabulq",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"sorabulq1",
					"sorabulq2",
					"opporancisisdeath");
	}

	public static ElementInfo getSimusLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Simus",
					new String[]{"Simus"}, 
					"Seigneur Sith de sang pûr rival du Seigneur Marka Ragnos. Il siéga au Grand Conseil de l'Empire Sith.",
					"",
					"simus",
					0,
					0,
					null,
					ElementColor.darkblue,
					"logosimus");
	}

	public static ElementInfo getSevRanceTannLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sev'Rance Tann",
					new String[]{"Sev'Rance Tann", "Sev'Rance"}, 
					"Cette adepte du Côté Obscur fut une excellente agent au service du Comte Dooku pour le compte de Confédération des Systèmes Indépendants. ",
					"",
					"sevrancetann",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"logosevrancetann",
					"sevrancetann2");
	}

	public static ElementInfo getSetHarthLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Set Harth",
					new String[]{"Set Harth"}, 
					"Jedi Noir anciennement padawan de Maître Aru-Wen durant la campagne de Ruusan à la fin des Nouvelles Guerres Sith.",
					"",
					"setharth",
					0,
					0,
					null,
					ElementColor.blue,
					"setharth1",
					"setharth2");
	}

	public static ElementInfo getSedrissLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sedriss",
					new String[]{"Sedriss"}, 
					"Adepte du Côté Obscur et exécuteur au service de Palpatine lorsque ce dernier revint en 10 ap. BY.",
					"",
					"sedriss",
					0,
					0,
					null,
					ElementColor.blue,
					"sedriss1",
					"darkempire2");
	}

	public static ElementInfo getScourgeLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Scourge",
					new String[]{"Scourge"}, 
					"Seigneur Sith de sang pûr, il serva pour l'Ancien Empire Sith Reconstitué. Il fut nommé la Colère de l'Empereur.  ",
					"",
					"scourge",
					0,
					0,
					null,
					ElementColor.mediumgreen,
					"logoscourge",
					"scourge2",
					"scourge3");
	}

	public static ElementInfo getSavageOpressClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Savage Opress",
					new String[]{"Savage Opress", "Savage"}, 
					"Ce Zabrak originaire de Dathomir et frère de Maul, fut un guerrier puissant du Côté Obscur durant la Guerre des Clones.",
					"",
					"savageopress",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"logosavageopress",
					"savage1",
					"savage2",
					"savage3");
	}

	public static ElementInfo getAbelothLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Abeloth",
					new String[]{"Abeloth"}, 
					"Entité du Côté Obscur de la Force lui-même, Abeloth est extrêment puissante et mystérieuse à la fois. Elle chercha à séduire Luke Skywalker ainsi que la Tribue Perdue des Sith.",
					"",
					"abeloth",
					0,
					0,
					null,
					ElementColor.blue,
					"abeloth1",
					"abeloth2",
					"abeloth3");
	}

	public static ElementInfo getAjuntaPallLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ajunta Pall",
					new String[]{"Ajunta Pall"}, 
					"L'un des premiers Jedi Noirs à avoir marché sur Korriban après le Second Grand Schisme Jedi. Puissant, il règna en tant que Grand Seigneur Sith. ",
					"",
					"ajuntapall",
					0,
					0,
					null,
					ElementColor.blue,
					"ajuntapall1",
					"ajuntapall2");
	}

	public static ElementInfo getVestaraKhaiLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Vestara Khai",
					new String[]{"Vestara Khai", "Vestara"}, 
					"Membre de la Tribue Perdue des Sith, elle aida les Jedi dans leur lutte contre Abeloth et tomba amoureuse de Ben Skywalker.",
					"",
					"vestarakhai",
					0,
					0,
					null,
					ElementColor.blue,
					"logovestarakhai",
					"vestarakhai2",
					"benvestara",
					"jainavsvestara");
	}

	public static ElementInfo getGavarKhaiLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Gavar Khai",
					new String[]{"Gavar Khai"}, 
					"Sabre de la Tribue Perdue des Sith, Gavar Khai combattit et s'allia avec Luke Skywalker afin de défaire Abeloth.",
					"",
					"gavarkhai",
					0,
					0,
					null,
					ElementColor.blue,
					"gavarkhai1",
					"gavarkhai2",
					"abeloth3");
	}

	public static ElementInfo getAleemaKetoLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Aleema Keto",
					new String[]{"Aleema Keto", "Aleema"}, 
					"Jeune chef du Krath, elle fut l'amante d'Ulic Qel-Droma et participa activement à la Grande Guerre des Sith.",
					"",
					"aleemaketo",
					0,
					0,
					null,
					ElementColor.kaki,
					"logoaleemaketo",
					"krathbook",
					"aleemaketo3",
					"aleemaketo4");
	}

	public static ElementInfo getAloraLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Alora",
					new String[]{"Alora"}, 
					"Jedi Noire et bras droit de Tavion, elle aida cette dernière dans la création du Culte de Ragnos. ",
					"",
					"alora",
					0,
					0,
					null,
					ElementColor.blue,
					"alora1",
					"alora2");
	}

	public static ElementInfo getSatalKetoLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Satal Keto",
					new String[]{"Satal Keto", "Satal"}, 
					"Cousin d'Aleema Keto. Il fut avec elle le leader du Krath, après avoir usurpé plusieurs systèmes grâce à la magie noire Sith.   ",
					"",
					"satalketo",
					0,
					0,
					null,
					ElementColor.kaki,
					"logosatalketo",
					"krathbook");
	}

	public static ElementInfo getSarissLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sariss",
					new String[]{"Sariss"}, 
					"Jedi Noire, elle fut la menteur de Yun et suivit Jerec dans sa quête de la Vallé des Jedi.",
					"",
					"sariss",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"sariss1",
					"sariss2");
	}

	public static ElementInfo getSaaraiLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Saarai",
					new String[]{"Saarai"}, 
					"Fille de Dark Wyyrlok III et destinée à suivre la voie de son père en tant que bras droit du Seigneur Sith Dark Krayt. ",
					"",
					"saarai",
					0,
					0,
					null,
					ElementColor.blue,
					"saarai1",
					"darkstryfevssaarai");
	}

	public static ElementInfo getDarkRevanLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Revan",
					new String[]{"Dark Revan", "Revan"}, 
					"Chevalier Jedi et Seigneur Sith, il oscilla de nombreuses fois entre lumière et ténèbres, causant souvent de nombreux tords vis à vis des factions en jeu.  ",
					"",
					"revan",
					0,
					0,
					null,
					ElementColor.mediumgreen,
					"logodarkrevan",
					"revanmandowar",
					"revanmalak",
					"revanvsmalak",
					"revanjedi",
					"revansith2",
					"revansith3");
	}

	public static ElementInfo getOdionLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Odion",
					new String[]{"Odion"}, 
					"Seigneur Sith témérère vivant durant les Nouvelles Guerres Sith, il est le frère du Seigneur Daiman. Il dirigea d'une main de fer la partie Est du secteur Grumani.",
					"",
					"odion",
					0,
					0,
					null,
					ElementColor.blue,
					"odion1",
					"odion2",
					"odion3");
	}

	public static ElementInfo getNagaSadowLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Naga Sadow",
					new String[]{"Naga Sadow"}, 
					"Seigneur Sith puissant et influent qui règna après la mort de Marka Ragnos. Il provoqua la chûte de l'Ordre Sith et parti en exil sur Yavin 4 avec ses massassis.  ",
					"",
					"nagasadow",
					0,
					0,
					null,
					ElementColor.darkblue,
					"logonagasadow",
					"nagasadow2",
					"hyperespacewar2",
					"nagasadowyavin");
	}

	public static ElementInfo getMawLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Maw",
					new String[]{"Maw"}, 
					"Jedi Noir boltrunien autrefois Ombre Jedi. Il joignit le miraluka Jerec dans sa recherche de la Vallée des Jedi.  ",
					"",
					"maw",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"maw1",
					"mawvskyle");
	}

	public static ElementInfo getMarkaRagnosLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Marka Ragnos",
					new String[]{"Marka Ragnos"}, 
					"Neuvième Seigneur Noir Sith de l'Ordre Sith originel, Marka Ragnos règna 200 ans en despote durant l'Âge d'Or des Sith. ",
					"",
					"markaragnos",
					0,
					0,
					null,
					ElementColor.darkblue,
					"logomarkaragnos",
					"markaragnos2");
	}

	public static ElementInfo getDarkMalakLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Malak",
					new String[]{"Dark Malak", "Malak"}, 
					"Autrefois Jedi luttant contre les mandaloriens, Dark Malak bascula du Côté Obscur en même temps que son maître Revan. Il trahissa ce dernier afin de prendre le pouvoir.",
					"",
					"malak",
					0,
					0,
					null,
					ElementColor.mediumgreen,
					"logodarkmalak",
					"darkmalak2",
					"revanmalakvitiate",
					"revanvsmalak");
	}

	public static ElementInfo getLumiyaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Lumiya",
					new String[]{"Lumiya"}, 
					"La Dame Sombre des Sith fut, comme Mara Jade, l'une des Mains de l'Empereur durant le règne de Palpatine. Elle devint par la suite une ennemie intime de Luke Skywalker. ",
					"",
					"lumiya",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"logolumiya",
					"lumiya2",
					"lumiya3");
	}

	public static ElementInfo getLudoKresshLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ludo Kressh",
					new String[]{"Ludo Kressh"}, 
					"Seigneur Sith puissant et rival de Naga Sadow lors de l'Âge d'Or des Sith, il fut trahi par ce dernier afin de diriger l'Ordre Sith.",
					"",
					"ludokressh",
					0,
					0,
					null,
					ElementColor.blue,
					"ludokressh1",
					"markaragnos2");
	}

	public static ElementInfo getKuellerLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kueller",
					new String[]{"Kueller"}, 
					"Originellement appellé Doph, ce jeune Jedi du Nouvel Ordre de Luke Skywalker sombra dans le Côté Obscur en découvrant son monde ravagé par une guerre locale.",
					"",
					"kueller",
					0,
					0,
					null,
					ElementColor.blue,
					"kueller1",
					"kuellerbrakiss");
	}

	public static ElementInfo getKarnessMuurLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Karness Muur",
					new String[]{"Karness Muur"}, 
					"Il fut l'un des premiers Jedi Noirs à devenir Seigneur Sith lors de son arrivée sur Korriban. Karness Muur créa par la suite un talisman afin d'y enfermer son esprit et sa magie.",
					"",
					"karmessmuur",
					0,
					0,
					null,
					ElementColor.blue,
					"logokarnessmuur",
					"karnessmuur2",
					"karnessmuur3");
	}

	public static ElementInfo getJerecLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jerec",
					new String[]{"Jerec"}, 
					"Ce Jedi Noir miraluka fut autrefois un Jedi et disciple de Jocasta Nu avant de devenir Inquisiteur au service de Palpatine.",
					"",
					"jerec",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"jerec1",
					"kylejerec");
	}

	public static ElementInfo getJoruusCBaothLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Joruus C'Baoth",
					new String[]{"Joruus C'Baoth"}, 
					"Joruus C'baoth était le clone fou d'un ancien Maître Jedi. Il était le gardien du Mont Tantiss et avait des aspirations de domination.",
					"",
					"joruus",
					0,
					0,
					null,
					ElementColor.blue,
					"joruus1",
					"joruus4",
					"joruus3");
	}

	public static ElementInfo getLInquisiteurClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"L'Inquisiteur",
					new String[]{"L'Inquisiteur"}, 
					"Ce pau'an formé aux arts Sith agissait pour le compte de l'Empire Galactique de Palpatine quelques années avant la bataille de Yavin 4. ",
					"",
					"inquisiteur",
					0,
					0,
					null,
					ElementColor.blue,
					"pauan2",
					"inquisitorbeg",
					"kananinquisitor2",
					"inquisitorend");
	}

	public static ElementInfo getCinquiemeFrereClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Cinquième Frère",
					new String[]{"Cinquième Frère", "cinquième frère", "cinquième Frère"}, 
					"Inquisieur impérial mandaté pour retrouver les Rebelles de Lothal.",
					"",
					"fivebrother",
					0,
					0,
					null,
					ElementColor.blue,
					"fivebrother1",
					"fivebrother2",
					"fivebrother3",
					"ahsokamalachor");
	}

	public static ElementInfo getSeptiemeSoeurClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Septième Soeur",
					new String[]{"Septième Soeur", "septième soeur", "septième Soeur"}, 
					"La Septième Sœur fut une Inquisitrice mandatée par Dark Vador pour retrouver les Jedi Rebelles de Lothal.",
					"",
					"sevensister",
					0,
					0,
					null,
					ElementColor.blue,
					"sevensister1",
					"sevensister2",
					"sevensister3",
					"ezramalachor");
	}

	public static ElementInfo getHuitiemeFrereClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Huitième Frère",
					new String[]{"Huitième Frère", "huitième frère", "huitième Frère"}, 
					"Ancien Jedi devenu Inquisieur impérial.",
					"",
					"eightbrother",
					0,
					0,
					null,
					ElementColor.blue,
					"eightbrother1",
					"eightbrother2");
	}

	public static ElementInfo getHaazenLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Haazen",
					new String[]{"Haazen"}, 
					"Ami, intendant puis traître auprès de la famille Draay, Haazen fut l'un des architecte du Pacte Jedi avec Krynda Draay tout en oeuvrant pour ses propres fins.",
					"",
					"haazen",
					0,
					0,
					null,
					ElementColor.blue,
					"haazen1",
					"haazenreborn",
					"jedicovenant1",
					"haazensith");
	}

	public static ElementInfo getGithanyLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Githany",
					new String[]{"Githany"}, 
					"Padawan Jedi déchue aux profit de la Confrérie des Ténèbres du Seigneur Kaan, cette Dame Sith est une véritable furie.",
					"",
					"githany",
					0,
					0,
					null,
					ElementColor.darkblue,
					"githany1",
					"githanydeath");
	}

	public static ElementInfo getFreedonNaddLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Freedon Nadd",
					new String[]{"Freedon Nadd"}, 
					"Padawan Jedi tombé du Côté Obscur, il devint un puissant Seigneur Sith et règna et instaura la terreur sur Onderon vers 4400 av. BY.",
					"",
					"freedonnadd",
					0,
					0,
					null,
					ElementColor.kaki,
					"logofreedonnadd",
					"freedonnadd2");
	}

	public static ElementInfo getExarKunLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Exar Kun",
					new String[]{"Exar Kun"}, 
					"Exar Kun est un puissant Seigneur des Sith qui faillit renverser la République avec l'aide d'Ulic Qel-Droma et des Mandaloriens.",
					"",
					"exarkun",
					0,
					0,
					null,
					ElementColor.kaki,
					"logoexarkun",
					"exarkunsith",
					"exarkun2",
					"exarkunreturn");
	}

	public static ElementInfo getExalKresshLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Exal Kressh",
					new String[]{"Exal Kressh"}, 
					"Cette sith au sang pûr et descandante du Seigneur Ludo Kressh, fut l'apprentie de l'Empereur Noir des Sith.",
					"",
					"exalkressh",
					0,
					0,
					null,
					ElementColor.darkblue,
					"logoexalkressh",
					"exalkressh2",
					"exalkressh3");
	}

	public static ElementInfo getDookuClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dooku",
					new String[]{"Dooku", "Comte Dooku", "Dark Tyranus"}, 
					"Le Comte Dooku fut un membre émérite de l'Ordre Jedi avant de perdre son apprenti Qui-Gon Jinn et de passer du Côté Obscur en devenant Dark Tyranus.",
					"",
					"dookuclassic",
					0,
					0,
					null,
					ElementColor.red,
					"logodarktyranus",
					"geonosisbattle",
					"dookucapture",
					"savage2",
					"anakin15",
					"anakin16");
	}

	public static ElementInfo getDookuLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dooku",
					new String[]{"Dooku", "Comte Dooku", "Dark Tyranus"}, 
					"Le Comte Dooku fut un membre émérite de l'Ordre Jedi avant de perdre son apprenti Qui-Gon Jinn et de passer du Côté Obscur en devenant Dark Tyranus.",
					"",
					"dookulegends",
					0,
					0,
					null,
					ElementColor.red,
					"logodarktyranus",
					"dookuyoung",
					"dookusifo",
					"geonosisbattle",
					"tholmevsdooku",
					"quinlanvosdooku",
					"anakin16");
	}

	public static ElementInfo getDesannLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Desann",
					new String[]{"Desann"}, 
					"Ancien élève de l'Académie de Luke Skywalker sur Yavin 4, ce jedi déchu s'allia avec Galak Fyyar afin de mettre sur pied les terribles shadowtroopers. ",
					"",
					"desann",
					0,
					0,
					null,
					ElementColor.blue,
					"desann1",
					"desannjerec");
	}

	public static ElementInfo getDarkZannahLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Zannah",
					new String[]{"Dark Zannah"}, 
					"Apprentie de Dark Bane, puis Dame Sith à la mort de ce dernier. Elle pratiqua avec dextérité l'art défensif du double sabre laser ainsi que la sorcellerie Sith. ",
					"",
					"darkzannah",
					0,
					0,
					null,
					ElementColor.red,
					"logodarkzannah",
					"darkzannahyoung",
					"darkbanezannah",
					"duelontython",
					"darkzannah2");
	}

	public static ElementInfo getDarkWyyrlokLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Wyyrlok",
					new String[]{"Dark Wyyrlok"}, 
					"Seigneur Sith et bras droit du Seigneur Dark Krayt, il est le troisième déscendant de cette lignée loyaliste. Ce qui ne l'empêcha pas de trahir son maître.  ",
					"",
					"darkwyyrlok",
					0,
					0,
					null,
					ElementColor.mediumorange,
					"logowyyrlok",
					"darkwyyrlok2",
					"wyyrlokforce",
					"wyyrlokbetrayal",
					"kraytvswyyrlok");
	}

	public static ElementInfo getDarkUnderlordLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Underlord",
					new String[]{"Dark Underlord"}, 
					"Seigneur Noir des Sith aux moments des Nouvelles Guerres Sith, certaines légendes content qu'il serait un esprit revenant de Xendor. ",
					"",
					"darkunderlord",
					0,
					0,
					null,
					ElementColor.blue,
					"darkunderlord1");
	}

	public static ElementInfo getDarkTrayaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Traya",
					new String[]{"Dark Traya"}, 
					"Ancienne Gardienne Jedi nommée Kreia, elle se détourna du Côté Clair de la Force pour devenir Dark Traya après avoir découvert l'Empire Sith Reconstitué de Vitiate. ",
					"",
					"darktraya",
					0,
					0,
					null,
					ElementColor.green,
					"logodarktraya");
	}

	public static ElementInfo getDarkTenebrousLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Tenebrous",
					new String[]{"Dark Tenebrous"}, 
					"Seigneur Sith bith, et maître de Dark Venamis et de Dark Plagueis le sage. Il fut trahi par ce dernier.   ",
					"",
					"darktenebrous",
					0,
					0,
					null,
					ElementColor.red,
					"logodarktenebrous",
					"darktenebrous2");
	}

	public static ElementInfo getDarkTalonLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Talon",
					new String[]{"Dark Talon"}, 
					"Dame Sith du Sith Unique de Dark Krayt. Cette Twi'lek fut désignée comme l'assassin personnelle de son Empereur. ",
					"",
					"darktalon",
					0,
					0,
					null,
					ElementColor.mediumorange,
					"logodarktalon",
					"darkruyndeath",
					"vendaxabattle",
					"cadesith",
					"hadabbadonbattle",
					"darktalonkrayt",
					"darktaloncade");
	}

	public static ElementInfo getDarkStryfeLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Stryfe",
					new String[]{"Dark Stryfe"}, 
					"Seigneur Sith et guerrier puissant sous le règne du nouvel Ordre Sith établi par Dark Krayt.",
					"",
					"darkstryfe",
					0,
					0,
					null,
					ElementColor.mediumorange,
					"logodarkstryfe",
					"darkstryfe2",
					"darkstryfevssaarai",
					"darkstryfevssazen");
	}

	public static ElementInfo getDarkSionLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Sion",
					new String[]{"Dark Sion"}, 
					"Seigneur Sith de la douleur et membre du Triumvirat Sith lors de la Seconde Guerre Civile des Jedi.",
					"",
					"darksion",
					0,
					0,
					null,
					ElementColor.green,
					"logodarksion",
					"atrisdarksion");
	}

	public static ElementInfo getDarkRuynLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Ruyn",
					new String[]{"Dark Ruyn"}, 
					"Seigneur Sith et membre vénérable du Sith Unique de Dark Krayt.   ",
					"",
					"darkruyn",
					0,
					0,
					null,
					ElementColor.mediumorange,
					"logodarkruyn",
					"darkruyndeath");
	}

	public static ElementInfo getDarkRuinLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Ruin",
					new String[]{"Dark Ruin"}, 
					"Ancien Jedi devenu Seigneur SIth, il fut le créateur du Nouvel Empire Sith et par conséquent l'instigateur des Nouvelles Guerres Sith.",
					"",
					"darkruin",
					0,
					0,
					null,
					ElementColor.blue,
					"logonewsithempire");
	}

	public static ElementInfo getDarkRivanLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Rivan",
					new String[]{"Dark Rivan"}, 
					"Seigneur Sith durant les Nouvelles Guerres Sith et antérieur à la Dame Sombre Belia Darzu.",
					"",
					"darkrivan",
					0,
					0,
					null,
					ElementColor.blue,
					"darkrivan1");
	}

	public static ElementInfo getDarkPlagueisClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Plagueis",
					new String[]{"Dark Plagueis"}, 
					"Maître Sith respectueux de la Règle des Deux et enseignant de Dark Sidious.",
					"",
					"darkplagueisclassic",
					0,
					0,
					null,
					ElementColor.red,
					"logodarkplagueis",
					"darkplagueis1");
	}

	public static ElementInfo getDarkPlagueisLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Plagueis",
					new String[]{"Dark Plagueis"}, 
					"Maître Sith respectueux de la Règle des Deux et enseignant de Dark Sidious. ",
					"",
					"darkplagueislegends",
					0,
					0,
					null,
					ElementColor.red,
					"logodarkplagueis",
					"darkplagueis1");
	}

	public static ElementInfo getDarkNihlLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Nihl",
					new String[]{"Dark Nihl"}, 
					"Seigneur Sith nagaï et l'un des exécuteurs de Dark Krayt, il dirigea le Sith Unique à la fin de la Seconde Guerre Civile Impériale.   ",
					"",
					"darknihl",
					0,
					0,
					null,
					ElementColor.mediumorange,
					"logodarknihl",
					"nihlmassacre",
					"nihlcade",
					"nihlfail",
					"nihlhavok");
	}

	public static ElementInfo getDarkNihilusLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Nihilus",
					new String[]{"Dark Nihilus"}, 
					"Le Seigneur Sith de la faim fut un puissant adepte de la Force et l'un des trois membres du Triumvirat Sith. ",
					"",
					"darknihilus",
					0,
					0,
					null,
					ElementColor.green,
					"logodarknihilus",
					"darknihilus2");
	}

	public static ElementInfo getDarkMillennialLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Millennial",
					new String[]{"Dark Millennial"}, 
					"Disciple de Dark Cognus, ce Seigneur Sith quitta son maître pour Dromund Kaas afin d'établir sa propre idéologie. ",
					"",
					"darkmillenial",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"logodarkmillenial");
	}

	public static ElementInfo getDarkMaulClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Maul",
					new String[]{"Dark Maul"}, 
					"Ce Zabrak originaire de Dathomir fut un guerrier Sith et apprenti du Seigneur Sith Dark Sidious.",
					"",
					"darkmaulclassic",
					0,
					0,
					null,
					ElementColor.red,
					"logodarkmaul",
					"darkmaulvsjedi",
					"darkmaul2");
	}

	public static ElementInfo getDarkMaulLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Maul",
					new String[]{"Dark Maul"}, 
					"Ce Zabrak originaire de Dathomir fut un guerrier Sith et apprenti du Seigneur Sith Dark Sidious.",
					"",
					"darkmaullegends",
					0,
					0,
					null,
					ElementColor.red,
					"logodarkmaul",
					"darkmaulvsjedi");
	}

	public static ElementInfo getDarkMarrLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Marr",
					new String[]{"Dark Marr"}, 
					"Seigneur Sith et membre du Conseil Sombre durant la Grande Guerre Galactique, il fut un précieux conseiller aux yeux de l'Empereur Noir des Sith Vitiate.",
					"",
					"darkmarr",
					0,
					0,
					null,
					ElementColor.blue,
					"darkmarr1",
					"darkmarr2",
					"darkmarr3");
	}

	public static ElementInfo getDarkMalgusLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Malgus",
					new String[]{"Dark Malgus"}, 
					"Puissant Seigneur Sith aux compétences exceptionnelles, il dirigea le sac de Coruscant à la fin de la Grande Guerre Galactique.",
					"",
					"darkmalgus",
					0,
					0,
					null,
					ElementColor.blue,
					"darkmalgus1",
					"darkmalgusmarch",
					"satelevsmalgus");
	}

	public static ElementInfo getDarkMalevalLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Maleval",
					new String[]{"Dark Maleval"}, 
					"Seigneur Sith sous les ordres de Dark Krayt, il fut principalement chargé de matter les poches de résistances de l'Empire en Exil de Roan Fel.",
					"",
					"darkmaleval",
					0,
					0,
					null,
					ElementColor.mediumorange,
					"logodarkmaleval",
					"darkmalevaldeath");
	}

	public static ElementInfo getDarkMaladiLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Maladi",
					new String[]{"Dark Maladi"}, 
					"Directrice des renseignements durant le règne de Dark Krayt. Cette dévaronienne fut la responsable du sabotage du plan de restauration conduit par Kol Skywalker. ",
					"",
					"darkmaladi",
					0,
					0,
					null,
					ElementColor.mediumorange,
					"logodarkmaladi",
					"maladibegin",
					"maladidorn",
					"maladivao",
					"maladiwayland",
					"maladibomb");
	}

	public static ElementInfo getDarkKruhlLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Kruhl",
					new String[]{"Dark Kruhl"}, 
					"Guerrier Sith dévoué à Dark Krayt durant la Seconde Guerre Civile Impériale.",
					"",
					"darkkruhl",
					0,
					0,
					null,
					ElementColor.mediumorange,
					"logodarkkruhl",
					"kruhljassar",
					"kruhlroanfel");
	}

	public static ElementInfo getDarkKraytLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Krayt",
					new String[]{"Dark Krayt", "A'Sharad Hett", "A'Sharad Hett"}, 
					"Autrefois A'Sharad Hett, chevalier Jedi de l'Ancienne République, avant de devenir le Seigneur Noir des Sith du temps de la Guerre Sitho-Impériale.",
					"",
					"darkkrayt",
					0,
					0,
					null,
					ElementColor.mediumorange,
					"logodarkkrayt",
					"kraytclonewars",
					"kraytobiwan",
					"kraytvong",
					"kraytthrone",
					"vendaxabattle",
					"hadabbadonbattle",
					"kraytvswyyrlok",
					"secondimperialcivilwarend");
	}

	public static ElementInfo getDarkJadusLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Jadus",
					new String[]{"Dark Jadus"}, 
					"Seigneur Sith très puissant de l'Ordre Sith de l'Ancien Empire Reconstitué de Vitiate, il est à la tête du plus grand réseau secret d'information de la galaxie. ",
					"",
					"darkjadus",
					0,
					0,
					null,
					ElementColor.blue,
					"darkjadus1",
					"darkjadus2");
	}

	public static ElementInfo getDarkCognusLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Cognus",
					new String[]{"Dark Cognus"}, 
					"Seigneur Sith qui suiva les traces de Dark Bane sur la voie de la Règle des Deux. Il eu plusieurs apprentis dont Dark Millenial, qui ne voulu se résoudre à la Règle des Deux. ",
					"",
					"darkcognus",
					0,
					0,
					null,
					ElementColor.red,
					"logodarkcognus");
	}

	public static ElementInfo getDarkBarasLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Baras",
					new String[]{"Dark Baras"}, 
					"Dark Baras fut un Seigneur Sith de l'Ancien Empire Sith Reconstitué au temps de la Grande Guerre Galactique. En tant que tel, il joua un rôle majeur dans la guerre, et notamment dans le Sac de Coruscant qui provoqua la cessation soudaine des combats et le début de la Guerre Froide.",
					"",
					"darkbaras",
					0,
					0,
					null,
					ElementColor.blue,
					"darkbaras1",
					"darkbaras2",
					"darkbaras3");
	}

	public static ElementInfo getDarkBaneLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Bane",
					new String[]{"Dark Bane"}, 
					"Seigneur des Sith humain qui vécu à l'époque des Nouvelles Guerres Sith, après lesquelles il fonda la Règle des Deux. De son vrai nom Dessel, il eut pour apprentie Dark Zannah.",
					"",
					"darkbane",
					0,
					0,
					null,
					ElementColor.red,
					"logodarkbane",
					"darkbane2",
					"thoughtbomb",
					"darkbaneorb",
					"duelontython",
					"darkbanevszannah");
	}

	public static ElementInfo getDarkAzardLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Azard",
					new String[]{"Dark Azard"}, 
					"Seigneur Sith sous le règne de Dark Krayt lors de Seconde Guerre Civile Impériale, il conduisa avec Vul Isen le génocide de Mon Calamari. ",
					"",
					"darkazard",
					0,
					0,
					null,
					ElementColor.mediumorange,
					"darkazard1",
					"darkazard2",
					"darkazard3",
					"darkazarddeath");
	}

	public static ElementInfo getDarkAngralLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Angral",
					new String[]{"Dark Angral"}, 
					"Seigneur Sith au service de l'Empereur Noir des Sith, il fut l'un des instigateur du sac de Coruscant qui menat à la Guerre Froide Galactique.",
					"",
					"darkangral",
					0,
					0,
					null,
					ElementColor.blue,
					"darkangral1",
					"darkangral2",
					"darkangralvstavus");
	}

	public static ElementInfo getDaimanLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Daiman",
					new String[]{"Daiman"}, 
					"Aux heures sombres de la République Galactique durant les Nouvelles Guerres Sith, le Seigneur Sith Daiman, frère d'Odion, fut puissant et respecté parmi les siens. ",
					"",
					"daiman",
					0,
					0,
					null,
					ElementColor.blue,
					"daiman1",
					"daiman2",
					"daimanarrive");
	}

	public static ElementInfo getCarnorJaxLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Carnor Jax",
					new String[]{"Carnor Jax"}, 
					"Ancien membre de la garde personnelle de l'Empereur Palpatine, il le trahi et devint un Seigneur de Guerre déterminé et redoutable.",
					"",
					"carnorjax",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"logocarnorjax",
					"carnorjaxsith",
					"carnorjax2");
	}

	public static ElementInfo getBrakissLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Brakiss",
					new String[]{"Brakiss"}, 
					"Enlevé enfant par les Impériaux afin de devenir un Jedi Noir, il créa par la suite l'Académie des Ombres.",
					"",
					"brakiss",
					0,
					0,
					null,
					ElementColor.blue,
					"brakiss1",
					"kuellerbrakiss");
	}

	public static ElementInfo getBocAsecaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Boc Aseca",
					new String[]{"Boc Aseca"}, 
					"Jedi Noir Twi'lek au service de l'Inquisiteur Jerec du temps de la Première Guerre Civile Galactique.",
					"",
					"bocaseca",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"bocaseca1",
					"bocvskyle");
	}

	public static ElementInfo getBeliaDarzuLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Belia Darzu",
					new String[]{"Belia Darzu"}, 
					"Dame Sombre des Sith durant les Nouvelles Guerres Sith. Sa mort provoqua la débâcle de son armée qui fut reconstruite quelques années plus tard par le Seigneur Sith Kaan. ",
					"",
					"beliadarzu",
					0,
					0,
					null,
					ElementColor.darkblue,
					"logobelia",
					"technobeast1");
	}

	public static ElementInfo getAzrakelLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Azrakel",
					new String[]{"Azrakel"}, 
					"Guerrier du Côté Obscur, et objet de toutes les manipulations de ses maîtres.",
					"",
					"azrakel",
					0,
					0,
					null,
					ElementColor.blue,
					"azrakel1");
	}

	public static ElementInfo getAsajjVentressClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Asajj Ventress",
					new String[]{"Asajj Ventress", "Asajj"}, 
					"Asajj Ventress fut une guerrière du Côté Obscur ralliée au Comte Dooku durant la Guerre des Clones reprochant aux Jedi d'avoir abandonné son Maître.",
					"",
					"asajjventressclassic",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"logoasajjventress",
					"asajjyoung",
					"asajjrota",
					"asajjanakin",
					"asajjdatho",
					"asajjborsk",
					"asajjahsoka",
					"asajjenigma");
	}

	public static ElementInfo getAsajjVentressLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Asajj Ventress",
					new String[]{"Asajj Ventress", "Asajj"}, 
					"Asajj Ventress fut une guerrière du Côté Obscur ralliée au Comte Dooku durant la Guerre des Clones reprochant aux Jedi d'avoir abandonné son Maître, Ky Narec.",
					"",
					"asajjventresslegends",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"logoasajjventress",
					"asajjventressvsdooku",
					"asajjventressvsanakin",
					"asajjventressambush",
					"asajjventressvsanakin2",
					"asajjventresshurt");
	}

	public static ElementInfo getZymLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Zym",
					new String[]{"Zym"}, 
					"Maître Jedi qui siégeait au conseil Jedi de Tython durant la Grande Guerre Galactique et la Guerre Froide Galactique. ",
					"",
					"zym",
					0,
					0,
					null,
					ElementColor.blue,
					"zym1");
	}

	public static ElementInfo getZuleXissLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Zule Xiss",
					new String[]{"Zule Xiss"}, 
					"Padawan Jedi du temps de la Guerre des Clones.",
					"",
					"zulexiss",
					0,
					0,
					null,
					ElementColor.blue,
					"zulexiss1",
					"zulexiss2");
	}

	public static ElementInfo getZayneCarrickLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Zayne Carrick",
					new String[]{"Zayne Carrick", "Zayne"}, 
					"Zayne Carrick fut le Padawan de Lucien Draay. Il fut faussement accusé des meurtres de ses camarades et fit tout pour rétablir son honneur. Il continua son odysée galactique afin d'aider ceux qui en avaient besoin.",
					"",
					"zaynecarrick",
					0,
					0,
					null,
					ElementColor.blue,
					"zaynecarrick1",
					"zaynerun",
					"zaynemando",
					"zaynesith",
					"jaraelvschantique");
	}

	public static ElementInfo getDassJennirLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dass Jennir",
					new String[]{"Dass Jennir", "Dass"}, 
					"Chevalier Jedi de l'Ancienne République survivant de l'Ordre 66.",
					"",
					"dassjennir",
					0,
					0,
					null,
					ElementColor.blue,
					"dassjennir1",
					"dassjennir2",
					"dassjennir3",
					"dassjennir4");
	}

	public static ElementInfo getBeyghorSahdettLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Beyghor Sahdett",
					new String[]{"Beyghor Sahdett", "Sahdett"}, 
					"Maître Jedi survivant de la Purge Jedi.",
					"",
					"beyghor",
					0,
					0,
					null,
					ElementColor.blue,
					"beyghor1");
	}

	public static ElementInfo getYodaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Yoda",
					new String[]{"Yoda"}, 
					"Parmi les Maître Jedi les plus renommés de la Galaxie, maître Yoda survécu à la purge Jedi de l'Ordre 66 afin d'enseigner les voie de la Force à Luke Skywalker.",
					"",
					"yodaclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"yoda3",
					"geonosisbattle",
					"yodaclones",
					"yodazillo",
					"yodacouncil",
					"yodasifo",
					"yodaship",
					"yodavssidious",
					"luke6",
					"obiwan15");
	}

	public static ElementInfo getYodaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Yoda",
					new String[]{"Yoda"}, 
					"Parmi les Maître Jedi les plus renommés de la Galaxie, maître Yoda survécu à la purge Jedi de l'Ordre 66 afin d'enseigner les voie de la Force à Luke Skywalker.  ",
					"",
					"yodalegends",
					0,
					0,
					null,
					ElementColor.blue,
					"yoda3",
					"yodayoung",
					"yodamission",
					"yodavssidious",
					"starkilleryoda",
					"luke6",
					"obiwan15");
	}

	public static ElementInfo getYaraelPoofClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Yarael Poof",
					new String[]{"Yarael Poof"}, 
					"Maître Jedi quermien et membre vénéré du conseil Jedi de Coruscant durant les dernières années de la République Galactique.",
					"",
					"yaraelpoofclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"yaraelpoof1");
	}

	public static ElementInfo getYaraelPoofLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Yarael Poof",
					new String[]{"Yarael Poof"}, 
					"Maître Jedi quermien et membre vénéré du conseil Jedi de Coruscant durant les dernières années de la République Galactique.",
					"",
					"yaraelpooflegends",
					0,
					0,
					null,
					ElementColor.blue,
					"yaraelpoof1",
					"yaraelpoof2");
	}

	public static ElementInfo getYaddleClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Yaddle",
					new String[]{"Yaddle"}, 
					"Yaddle fut un Maître Jedi membre du Haut Conseil sous la République Galactique.",
					"",
					"yaddleclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"yaddle1");
	}

	public static ElementInfo getYaddleLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Yaddle",
					new String[]{"Yaddle"}, 
					"Yaddle fut un Maître Jedi membre du Haut Conseil sous la République Galactique.",
					"",
					"yaddlelegends",
					0,
					0,
					null,
					ElementColor.blue,
					"yaddle1",
					"yaddledeath");
	}

	public static ElementInfo getXamarLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Xamar",
					new String[]{"Xamar"}, 
					"Maître Jedi voyant du et membre éminent du Pacte Jedi. ",
					"",
					"xamar",
					0,
					0,
					null,
					ElementColor.blue,
					"xamar1",
					"xamardream",
					"xamardeath");
	}

	public static ElementInfo getXanatosLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Xanatos",
					new String[]{"Xanatos"}, 
					"Jedi apprenti de Qui-Gon Jinn, corrompu par le pouvoir il devint un Jedi Noir.",
					"",
					"xanatos",
					0,
					0,
					null,
					ElementColor.blue,
					"xanatos1",
					"xanatos2");
	}

	public static ElementInfo getWolfSazenLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Wolf Sazen",
					new String[]{"Wolf Sazen"}, 
					"Maître du Nouvel Ordre Jedi ayant entraîné Cade Skywalker et Shado Vao. Il fut le disciple du maître Kol Skywalker.",
					"",
					"wolfsazen",
					0,
					0,
					null,
					ElementColor.blue,
					"wolfsazen1",
					"antaresvendaxa",
					"darkstryfevssazen");
	}

	public static ElementInfo getVodoSioskBaasLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Vodo-Siosk Baas",
					new String[]{"Vodo-Siosk Baas", "Vodo-Siosk"}, 
					"Vodo Siosk Baas fut un maître respecté de l'Ordre Jedi du temps des guerres Mandaloriennes et de la Grande Guerre des Sith. Il fut cependant trahi par son padawan Exar Kun. ",
					"",
					"vodosioskbaas",
					0,
					0,
					null,
					ElementColor.blue,
					"vodosioskbaas1",
					"vodosioskbaas2",
					"vodovsexarkun");
	}

	public static ElementInfo getVimaSunriderLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Vima Sunrider",
					new String[]{"Vima Sunrider"}, 
					"Jeune apprentie Jedi et fille de Nomi et Andur Sunrider. Elle apprit les voies de la Force par Ulic Qel-Droma.",
					"",
					"vimasunrider",
					0,
					0,
					null,
					ElementColor.blue,
					"vimasunrider1",
					"vima2",
					"vimaulic");
	}

	public static ElementInfo getVannarTreeceLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Vannar Treece",
					new String[]{"Vannar Treece"}, 
					"Vannar Treece fut un Maître Jedi à la fin des Nouvelles Guerre Sith. Il fut également le maître de Kerra Holt.",
					"",
					"vannartreece",
					0,
					0,
					null,
					ElementColor.blue,
					"vannartreece1",
					"kerraarrive");
	}

	public static ElementInfo getVandarTokareLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Vandar Tokare",
					new String[]{"Vandar Tokare"}, 
					"Maître Jedi du temps des guerres Mandaloriennes et de la Guerre Civile des Jedi, il siégeait principalement au conseil Jedi de l'Académie de Dantooine.",
					"",
					"vandar",
					0,
					0,
					null,
					ElementColor.blue,
					"vandar1",
					"vandar2",
					"vandar3",
					"vandar4");
	}

	public static ElementInfo getValenthyneFarfallaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Valenthyne Farfalla",
					new String[]{"Valenthyne Farfalla"}, 
					"Maître Jedi ayant participé à la campagne de Ruusan aux côtés du général Hoth, à la fin des Nouvelles Guerres Sith.",
					"",
					"valenthynefarfalla",
					0,
					0,
					null,
					ElementColor.blue,
					"valenthynefarfalla1",
					"valenthynefarfalla2");
	}

	public static ElementInfo getUlicQelDromaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ulic Qel-Droma",
					new String[]{"Ulic Qel-Droma"}, 
					"Chevalier Jedi sous l'Ancienne République qui succomba au Côté Obscur afin de devenir l'apprenti sur Seigneur Sith Exar Kun. Plus tard, en exil, il formera Vima Sunrider.",
					"",
					"ulicqeldroma",
					0,
					0,
					null,
					ElementColor.kaki,
					"logoulicdroma",
					"krath3",
					"caydeath",
					"vimaulic");
	}

	public static ElementInfo getTsuiChoiLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tsui Choi",
					new String[]{"Tsui Choi"}, 
					"Tsui Choi fut un Maître Jedi aleena qui lors de la Guerre des Clones.",
					"",
					"tsuichoi",
					0,
					0,
					null,
					ElementColor.blue,
					"tsuichoi1",
					"tsuchoideath");
	}

	public static ElementInfo getTraSaaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"T'ra Saa",
					new String[]{"T'ra Saa"}, 
					"Sage Maître Jedi de la race des Neti. Elle connue l'Ordre Jedi de l'Ancienne République ainsi que le Nouvel Ordre Jedi fondé par Luke Skywalker.",
					"",
					"trasaa",
					0,
					0,
					null,
					ElementColor.blue,
					"trasaa1",
					"trasaa2",
					"trasaa3",
					"trasaa4");
	}

	public static ElementInfo getTionneSolusarLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tionne Solusar",
					new String[]{"Tionne Solusar", "Tionne"}, 
					"Historienne Jedi lors du Nouvel Ordre Jedi de Luke Skywalker. Elle fut l'une de ses premières étudiantes.",
					"",
					"tionnesolusar",
					0,
					0,
					null,
					ElementColor.blue,
					"tionnesolusar1",
					"tionne2");
	}

	public static ElementInfo getThonLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Thon",
					new String[]{"Thon"}, 
					"Maître Jedi Tchuukthai lors de la Grande Guerre des Sith, il vivait reclu sur Ambria. ",
					"",
					"thon",
					0,
					0,
					null,
					ElementColor.blue,
					"thon1",
					"thon2",
					"thon3");
	}

	public static ElementInfo getTholmeLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tholme",
					new String[]{"Tholme"}, 
					"Maître Jedi durant les guerres cloniques, il enseigna à Quinlan Vos et à Aayla Secura. Il devint également expert dans les mission d'espionnage et d'infiltration. ",
					"",
					"tholm",
					0,
					0,
					null,
					ElementColor.blue,
					"tholme1",
					"quinlanvostholme",
					"opporancisisdeath");
	}

	public static ElementInfo getTenelKaDjoLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tenel Ka Djo",
					new String[]{"Tenel Ka Djo", "Tenel'Ka", "Tenel Ka"}, 
					"Tenel'Ka Djo est la fille de Teneniel Djo et du prince Isolder d'Hapes et conjointe du Jedi Jacen Solo. ",
					"",
					"tenelka",
					0,
					0,
					null,
					ElementColor.darkblue,
					"logotenelka",
					"tenelkajacen",
					"tenelkaqueen",
					"tenelkaold");
	}

	public static ElementInfo getTashaRyoLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tasha Ryo",
					new String[]{"Tasha Ryo", "Tasha"}, 
					"Voyageuse Je'daii Twi'lek durant une époque qui précéda l'Ancienne République.",
					"",
					"tasharyo",
					0,
					0,
					null,
					ElementColor.blue,
					"tasharyo1",
					"tasharyo2");
	}

	public static ElementInfo getTahlLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tahl",
					new String[]{"Tahl"}, 
					"Tahl fut un Chevalier Jedi qui fut la meilleure amie ainsi que le grand amour de Qui-Gon Jinn.",
					"",
					"tahl",
					0,
					0,
					null,
					ElementColor.blue,
					"tahl1",
					"tahldeath");
	}

	public static ElementInfo getTahiriVeilaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tahiri Veila",
					new String[]{"Tahiri Veila", "Tahiri", "Veila"}, 
					"Tahiri Veila fut une jeune membre du Nouvel Ordre Jedi à l'époque de l'invasion Yuuzhan Vong, et la plus proche amie du jeune Anakin Solo.",
					"",
					"tahiriveila",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"tahiriveila1",
					"tahirianakin",
					"tahirivong",
					"tahiriold");
	}

	public static ElementInfo getStassAllieClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Stass Allie",
					new String[]{"Stass Allie"}, 
					"Cousine de la Jedi Adi Gallia, combattante et guérisseuse Jedi émérite.",
					"",
					"strassallieclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"strassallie1",
					"stassalliedeath");
	}

	public static ElementInfo getStassAllieLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Stass Allie",
					new String[]{"Stass Allie"}, 
					"Cousine de la Jedi Adi Gallia, combattante et guérisseuse Jedi émérite.",
					"",
					"strassallielegends",
					0,
					0,
					null,
					ElementColor.blue,
					"strassallie1",
					"stassalliedeath");
	}

	public static ElementInfo getSiriTachiLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Siri Tachi",
					new String[]{"Siri Tachi"}, 
					"Maître Jedi et ancienne padawan d'Adi Gallia, elle fut une pilote talentueuse au service de la République Galactique.",
					"",
					"siritachi",
					0,
					0,
					null,
					ElementColor.blue,
					"siritachi1",
					"siritachi2",
					"siritachi3",
					"siritachi4");
	}

	public static ElementInfo getSifoDyasCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sifo Dyas",
					new String[]{"Sifo Dyas"}, 
					"Sifo-Dyas fut un Maître Jedi mystérieux à l'origine de l'armée de clones de Kamino. Ami du Comte Dooku lorsqu'il fut Jedi, il fut trahi et tué par ce dernier dans des conditions obscures.",
					"",
					"sifodyas",
					0,
					0,
					null,
					ElementColor.blue,
					"sifodyas1");
	}

	public static ElementInfo getSharadHettLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sharad Hett",
					new String[]{"Sharad Hett"}, 
					"Chevalier Jedi et chef de guerre Tusken puissant du temps de la Guerre des Clones et père du Jedi A'Sharad Hett.",
					"",
					"sharadhett",
					0,
					0,
					null,
					ElementColor.blue,
					"sharadhett1",
					"sharadhett2");
	}

	public static ElementInfo getShaeKodaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Shae Koda",
					new String[]{"Shae Koda", "Koda"}, 
					"Voyageuse de l'Ordre Je'daii durant le règne de l'Empire Infini des Rakata. Elle devint la compagne du chien de Force Xesh. ",
					"",
					"shaekoda",
					0,
					0,
					null,
					ElementColor.blue,
					"shaekoda1",
					"shaekodayoung",
					"shaekodadianoga",
					"shaekoda3",
					"shaekodafight");
	}

	public static ElementInfo getDaegenLokLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Daegen Lok",
					new String[]{"Daegen Lok", "Daegen", "Lok"}, 
					"Ranger Je'daii envoyé sur la lune Bogan après que ce dernier ait eu de sombres visions.",
					"",
					"daegenlok",
					0,
					0,
					null,
					ElementColor.blue,
					"daegenlok1",
					"daegenlok2",
					"daegenlok3",
					"skalnas3");
	}

	public static ElementInfo getSeknosRathLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sek'nos Rath",
					new String[]{"Sek'nos Rath", "Sek'nos", "Rath"}, 
					"Voyageur Je'daii, plus souvent nommé Seki par les groupies. Il enquêtera avec Shae et Tasha sur Xesh. ",
					"",
					"seknos",
					0,
					0,
					null,
					ElementColor.blue,
					"seknos1",
					"seknos2");
	}

	public static ElementInfo getShadoVaoLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Shado Vao",
					new String[]{"Shado Vao"}, 
					"Shado Vao est un chevalier Jedi ayant vécu à l'époque de la Guerre Impérialo-Sith, qui lutta activement contre le Nouvel Ordre Sith de Dark Krayt.",
					"",
					"shadovao",
					0,
					0,
					null,
					ElementColor.blue,
					"shadovao1",
					"shadoyoung",
					"antaresvendaxa",
					"shadotrain",
					"hadabbadonbattle",
					"shadorescue");
	}

	public static ElementInfo getShaakTiClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Shaak-Ti",
					new String[]{"Shaak-Ti"}, 
					"Shaak-Ti fut une femelle togruta et membre éminent de l'Ordre Jedi qui participa à la Guerre des Clones.",
					"",
					"shaakticlassic",
					0,
					0,
					null,
					ElementColor.blue,
					"shaakti1",
					"shaakti4",
					"shaakti2");
	}

	public static ElementInfo getShaakTiLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Shaak-Ti",
					new String[]{"Shaak-Ti"}, 
					"Shaak-Ti fut une femelle togruta et membre éminent de l'Ordre Jedi qui participa à la Guerre des Clones.",
					"",
					"shaaktilegends",
					0,
					0,
					null,
					ElementColor.blue,
					"shaakti1",
					"geonosisbattle",
					"shaakti3",
					"shaaktideath");
	}

	public static ElementInfo getSateleShanLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Satele Shan",
					new String[]{"Satele Shan", "Satele"}, 
					"Satele Shan, descendante de la célèbre Bastila Shan, dirigea l'Ordre Jedi au titre de Grand Maître Jedi durant la Guerre Froide contre l'Empire Sith Reconstitué.",
					"",
					"sateleshan",
					0,
					0,
					null,
					ElementColor.blue,
					"sateleshan1",
					"sateleyoung",
					"darkbaras2",
					"sateleold",
					"satelevsmalgus");
	}

	public static ElementInfo getSarroXajLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sarro Xaj",
					new String[]{"Sarro Xaj"}, 
					"Chevalier Jedi de forte stature, duelliste d'exception, qui vécut vers la fin des Nouvelles Guerres Sith.",
					"",
					"sarroxaj",
					0,
					0,
					null,
					ElementColor.blue,
					"sarroxaj1",
					"duelontython");
	}

	public static ElementInfo getSaeseeTiinClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Saesee Tiin",
					new String[]{"Saesee Tiin"}, 
					"Saesee Tiin fut un Maître Jedi iktotchi, membre du Conseil Jedi de Coruscant qui fut tué par Dark Sidious.",
					"",
					"saeseetiinclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"saeseetiin1",
					"saeseetiin3",
					"palpatinearrest");
	}

	public static ElementInfo getSaeseeTiinLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Saesee Tiin",
					new String[]{"Saesee Tiin"}, 
					"Saesee Tiin fut un Maître Jedi iktotchi, membre du Conseil Jedi de Coruscant qui fut tué par Dark Sidious.",
					"",
					"saeseetiinlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"saeseetiin1",
					"saeseetiin2",
					"palpatinearrest");
	}

	public static ElementInfo getRoshPeninLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Rosh Penin",
					new String[]{"Rosh Penin"}, 
					"Jeune padawan Jedi du temps de la reconstruction de l'Ordre Jedi par Luke Skywalker.",
					"",
					"roshpenin",
					0,
					0,
					null,
					ElementColor.blue,
					"roshpenin1",
					"roshpeninbegin");
	}

	public static ElementInfo getRoriFennLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Rori Fenn",
					new String[]{"Rori Fenn"}, 
					"Ranger Je'daii sur Tython du temps de la l'apogée de l'Empire Infini.",
					"",
					"rorifenn",
					0,
					0,
					null,
					ElementColor.blue,
					"rorifenn1",
					"rorifenn2",
					"rorifenn3");
	}

	public static ElementInfo getRoblioDarteLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Roblio Darte",
					new String[]{"Roblio Darte"}, 
					"Roblio Darté fut un Maître Jedi du temps de la Guerre des Clones. Il en devint un général charismatique.",
					"",
					"robliodarte",
					0,
					0,
					null,
					ElementColor.blue,
					"robliodarte1");
	}

	public static ElementInfo getRaynarThulLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Raynar Thul",
					new String[]{"Raynar Thul"}, 
					"Ami des enfants jumeaux Jacen et Jaina Solo, il fut enlevé part les Killiks et devint UnuThul pour régner sur la colonie. ",
					"",
					"raynarthul",
					0,
					0,
					null,
					ElementColor.blue,
					"raynarthul1",
					"raynarthul2");
	}

	public static ElementInfo getRasktaLsuLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Raskta Lsu",
					new String[]{"Raskta Lsu"}, 
					"Maître d'armes Jedi qui vécut vers la fin des Nouvelles Guerres Sith, Raskta Lsu fut une experte Echani.",
					"",
					"rasktalsu",
					0,
					0,
					null,
					ElementColor.blue,
					"rasktalsu1",
					"duelontython");
	}

	public static ElementInfo getRahmKotaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Rahm Kota",
					new String[]{"Rahm Kota"}, 
					"Rahm Kota est un Général Jedi ayant survécu à l'Ordre 66 et qui affronta Galen Marek, l'apprenti secret de Dark Vador, avant de devenir son mentor après la rédemption du jeune homme.",
					"",
					"rahmkota",
					0,
					0,
					null,
					ElementColor.blue,
					"rahmkota1",
					"rahmkota2",
					"rahmkota3");
	}

	public static ElementInfo getRaanaTeyLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Raana Tey",
					new String[]{"Raana Tey"}, 
					"Maître Jedi à l'Académie Jedi de Taris et memnbre du conseil du Pacte Jedi.  ",
					"",
					"raanatey",
					0,
					0,
					null,
					ElementColor.blue,
					"raanatey1",
					"raanatey2",
					"raanatey3",
					"raanateydeath");
	}

	public static ElementInfo getQuRahnLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Qu Rahn",
					new String[]{"Qu Rahn"}, 
					"Mentor de Kyle Katarn, tué par Jerec durant la Guerre Civile Galactique.",
					"",
					"qurahn",
					0,
					0,
					null,
					ElementColor.blue,
					"qurahn1",
					"qurahn2");
	}

	public static ElementInfo getQuinlanVosClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Quinlan Vos",
					new String[]{"Quinlan Vos", "Quinlan"}, 
					"Quinlan Vos fut un Jedi de l'Ancienne République qui fut célèbre pour ses dons de psychométrie, et qui eut pour padawan Aayla Secura.",
					"",
					"quinlanvosclassic",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"quinlanvos1",
					"quinlanvosobiwan");
	}

	public static ElementInfo getQuinlanVosLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Quinlan Vos",
					new String[]{"Quinlan Vos", "Quinlan"}, 
					"Quinlan Vos fut un Jedi de l'Ancienne République qui fut célèbre pour ses dons de psychométrie, et qui eut pour padawan Aayla Secura.",
					"",
					"quinlanvoslegends",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"quinlanvos1",
					"quinlanvosyoung",
					"bok2",
					"quinlanvosdooku",
					"quinlanvoskkruhk",
					"opporancisisdeath",
					"quinlanvoshurt");
	}

	public static ElementInfo getQuiGonJinnClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Qui-Gon Jinn",
					new String[]{"Qui-Gon Jinn", "Qui-Gon"}, 
					"Qui-Gon Jinn fut un Maître Jedi téméraire sous la République. Élève du Comte Dooku, il fut le maître d'Obi-Wan Kenobi.",
					"",
					"quigonjinnclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"quigon1",
					"quigondestroyer",
					"darkmaulvsjedi");
	}

	public static ElementInfo getQuiGonJinnLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Qui-Gon Jinn",
					new String[]{"Qui-Gon Jinn", "Qui-Gon"}, 
					"Qui-Gon Jinn fut un Maître Jedi téméraire de l'Ancienne République. Élève du Comte Dooku, il fut le maître de Xanatos et d'Obi-Wan Kenobi.",
					"",
					"quigonjinnlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"quigon1",
					"quigonyoung",
					"xanatos2",
					"quigonobiwan2",
					"tahldeath",
					"quigondestroyer",
					"darkmaulvsjedi");
	}

	public static ElementInfo getQuanJangLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Quan-Jang",
					new String[]{"Quan-Jang"}, 
					"Maître Je'daii vivant sur Tython lors du règne de l'Empire Infini. Il fut l'administrateur du temple Jedi d'Anil Kesh.",
					"",
					"quanjang",
					0,
					0,
					null,
					ElementColor.blue,
					"quanjang1");
	}

	public static ElementInfo getQAniliaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Q'Anilia",
					new String[]{"Q'Anilia"}, 
					"Jeune Maître Jedi Miraluka dotée d'un pouvoir de voyance très puissant. Cette Jedi consulaire faisait parti du groupe très restreint du conseil du Pacte Jedi. ",
					"",
					"qanilia",
					0,
					0,
					null,
					ElementColor.blue,
					"qanilia1",
					"qaniliayoung",
					"jedicovenant1",
					"qanilia2",
					"kryndadeath");
	}

	public static ElementInfo getPongKrellClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Pong Krell",
					new String[]{"Pong Krell"}, 
					"Chevalier Jedi besalisk imprudent qui tourna le dos à la République durant la Guerre des Clones. ",
					"",
					"pongkrell",
					0,
					0,
					null,
					ElementColor.blue,
					"pongkrell1",
					"pongkrell2",
					"pongkrell3");
	}

	public static ElementInfo getPloKoonClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Plo Koon",
					new String[]{"Plo Koon"}, 
					"Plo Koon fut un maître Jedi membre du Conseil appartenant à l'espèce des Kel Dor, et ayant participé à la Guerre des Clones.",
					"",
					"plokoonclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"plokoon1",
					"plokoon3",
					"plokoonbobafett",
					"plokoon4",
					"plokoondeath");
	}

	public static ElementInfo getPloKoonLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Plo Koon",
					new String[]{"Plo Koon"}, 
					"Plo Koon fut un maître Jedi membre du Conseil appartenant à l'espèce des Kel Dor, et ayant participé à la Guerre des Clones.",
					"",
					"plokoonlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"plokoon1",
					"plokoon2",
					"plokoondeath");
	}

	public static ElementInfo getOrgusDinLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Orgus Din",
					new String[]{"Orgus Din"}, 
					"Orgus Din fut un Maître Jedi de l'Ancienne République au temps de la Grande Guerre Galactique. Jedi sage et aguerri, Din affronta les Sith lors du Siège de Coruscantet assista à la destruction du Temple Jedi.",
					"",
					"orgusdin",
					0,
					0,
					null,
					ElementColor.blue,
					"orgusdin1",
					"orgusdin2",
					"orgusdin3");
	}

	public static ElementInfo getOppoRancisisClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Oppo Rancisis",
					new String[]{"Oppo Rancisis"}, 
					"Eminent membre du Conseil Jedi thisspiasien durant les dernières années de la République Galactique.",
					"",
					"opporancisisclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"opporancisis1");
	}

	public static ElementInfo getOppoRancisisLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Oppo Rancisis",
					new String[]{"Oppo Rancisis"}, 
					"Eminent membre du Conseil Jedi thisspiasien durant les dernières années de la République Galactique.",
					"",
					"opporancisislegends",
					0,
					0,
					null,
					ElementColor.blue,
					"opporancisis1",
					"opporancisisdeath");
	}

	public static ElementInfo getOorooLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ooroo",
					new String[]{"Ooroo"}, 
					"Maître Jedi célégien sur la planète Ossus du temps de la Guerre de l'Hyperespace, il devait vivre dans une cuve afin de pouvoir survivre parmi les autres.  ",
					"",
					"ooroo",
					0,
					0,
					null,
					ElementColor.blue,
					"ooroo1",
					"ooroodeath");
	}

	public static ElementInfo getOodBnarLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ood Bnar",
					new String[]{"Ood Bnar"}, 
					"Jedi Neti âgé de plusieurs millénaires qui s'illustra au cours de la Grande Guerre des Sith.",
					"",
					"oodbnar",
					0,
					0,
					null,
					ElementColor.blue,
					"oodbnar1",
					"oodbnar2");
	}

	public static ElementInfo getOdanUrrLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Odan Urr",
					new String[]{"Odan Urr"}, 
					"Jedi pacifiste Draethos de l'Ancienne République, connu pour ses travaux sur le Code Jedi.",
					"",
					"odanurr",
					0,
					0,
					null,
					ElementColor.blue,
					"odanurr1",
					"odanurr2");
	}

	public static ElementInfo getObiWanKenobiClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Obi-Wan Kenobi",
					new String[]{"Obi-Wan Kenobi", "Obi-Wan"}, 
					"Obi-Wan Kenobi, connu aussi sous le diminutif de Ben Kenobi, est un célèbre Maître Jedi qui forma Anakin Skywalker, puis son fils Luke Skywalker.",
					"",
					"obiwankenobiclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"obiwankenobi1",
					"obiwan1",
					"obiwancrash1",
					"obiwan2",
					"obiwan3",
					"obiwan4",
					"obiwan5",
					"obiwan6",
					"obiwan7",
					"obiwan8",
					"obiwan9",
					"obiwan10",
					"obiwan11",
					"obiwandathomir1",
					"obiwangrievous",
					"obiwan13",
					"obiwansaveluke",
					"obiwan14",
					"obiwan15");
	}

	public static ElementInfo getObiWanKenobiLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Obi-Wan Kenobi",
					new String[]{"Obi-Wan Kenobi", "Obi-Wan"}, 
					"Obi-Wan Kenobi, connu aussi sous le diminutif de Ben Kenobi, est un célèbre Maître Jedi qui forma Anakin Skywalker, puis son fils Luke Skywalker.",
					"",
					"obiwankenobilegends",
					0,
					0,
					null,
					ElementColor.blue,
					"obiwankenobi1",
					"obiwan1",
					"obiwan2",
					"obiwangrievous",
					"obiwan13",
					"obiwan14",
					"obiwan15");
	}

	public static ElementInfo getNomiSunriderLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nomi Sunrider",
					new String[]{"Nomi Sunrider"}, 
					"Nomi Sunrider fut une puissante et respectée Jedi qui vécut sous l'Ancienne République, pendant la Guerre des Sith.",
					"",
					"nomisunrider",
					0,
					0,
					null,
					ElementColor.blue,
					"nomisunrider1",
					"nomisunrider2",
					"nomisunrider4",
					"nomisunrider5");
	}

	public static ElementInfo getNatSkywalkerLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nat Skywalker",
					new String[]{"Nat Skywalker", "Bantha Rawk", "oncle Bantha"}, 
					"Nat Skywalker est un descendant de Luke Skywalker qui vécut plus d'un siècle après lui, et qui quitta l'Ordre Jedi, prenant le surnom de Bantha Rawk.",
					"",
					"natskywalker",
					0,
					0,
					null,
					ElementColor.blue,
					"logonatskywalker",
					"natcade",
					"azlynbacta",
					"natjedi");
	}

	public static ElementInfo getNahdarVebbClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nahdar Vebb",
					new String[]{"Nahdar Vebb"}, 
					"Nahdar Vebb fut un Chevalier Jedi Mon Calamari qui fut tué par Grievous lors de sa mission sur Vassek.",
					"",
					"nahdarvebb",
					0,
					0,
					null,
					ElementColor.blue,
					"nahdarvebb1",
					"nahdarvebb2");
	}

	public static ElementInfo getMarisBroodLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Maris Brood",
					new String[]{"Maris Brood"}, 
					"Maris Brood est une Jedi Zabrak qui fut la dernière élève de Shaak Ti, et qui affronta l'apprenti secret de Dark Vador, Galen Marek, sur la planète Felucia.",
					"",
					"marisbrood",
					0,
					0,
					null,
					ElementColor.blue,
					"marisbrood1",
					"marisbrood2");
	}

	public static ElementInfo getMaceWinduClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mace Windu",
					new String[]{"Mace Windu"}, 
					"Mace Windu fut l'un des plus éminents membres du Conseil Jedi durant les décennies qui précédèrent la chute de la République.",
					"",
					"macewinduclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"macewindu1",
					"geonosisbattle",
					"macewinduwattambor",
					"macewinduanakin",
					"macewindujarjar",
					"palpatinearrest");
	}

	public static ElementInfo getMaceWinduLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mace Windu",
					new String[]{"Mace Windu"}, 
					"Mace Windu fut l'un des plus éminents membres du Conseil Jedi durant les décennies qui précédèrent la chute de l'Ancienne République.",
					"",
					"macewindulegends",
					0,
					0,
					null,
					ElementColor.blue,
					"macewindu1",
					"macewindu2",
					"geonosisbattle",
					"macewinduvssora",
					"macewinduyoda",
					"palpatinearrest");
	}

	public static ElementInfo getLuminaraUnduliClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Luminara Unduli",
					new String[]{"Luminara Unduli"}, 
					"Jeune Maître Jedi redoutable au combat rapproché ayant vécu vers la fin de la République.",
					"",
					"luminaraunduliclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"luminaraunduli1",
					"luminaraunduli3",
					"luminaraunduli5");
	}

	public static ElementInfo getLuminaraUnduliLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Luminara Unduli",
					new String[]{"Luminara Unduli"}, 
					"Jeune Maître Jedi redoutable au combat rapproché ayant vécu vers la fin de l'Ancienne République.",
					"",
					"luminaraundulilegends",
					0,
					0,
					null,
					ElementColor.blue,
					"luminaraunduli1",
					"luminaraunduli4",
					"luminaraundulikashyyyk");
	}

	public static ElementInfo getCorranHornLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Corran Horn",
					new String[]{"Corran Horn", "Corran"}, 
					"Chevalier Jedi héros de la Nouvelle République et pilote émérite de l'Escadron Rogue.",
					"",
					"corranhorn",
					0,
					0,
					null,
					ElementColor.blue,
					"corranhorn1",
					"corrancorsec",
					"corranapprenti",
					"corransabres",
					"corranshedao");
	}

	public static ElementInfo getLukeSkywalkerClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Luke Skywalker",
					new String[]{"Luke Skywalker", "Luke"}, 
					"Luke Skywalker, fils d'Anakin Skywalker et de Padmé Amidala, devint grâce à Obi-Wan Kenobi un Chevalier Jedi et un héros de l'Alliance Rebelle.",
					"",
					"lukeskywalkerclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"logolukeskywalker",
					"luke1",
					"obiwansaveluke",
					"luke3",
					"luke4",
					"lukesarco1",
					"luke5",
					"lukekongo",
					"luke6",
					"luke7",
					"lukeold");
	}

	public static ElementInfo getLukeSkywalkerLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Luke Skywalker",
					new String[]{"Luke Skywalker", "Luke"}, 
					"Luke Skywalker, fils d'Anakin Skywalker et de Padmé Amidala, devint grâce à Obi-Wan Kenobi un Chevalier Jedi et un héros de l'Alliance Rebelle, avant de fonder le Nouvel Ordre Jedi.",
					"",
					"lukeskywalkerlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"logolukeskywalker",
					"luke1",
					"luke2",
					"luke3",
					"luke4",
					"celesteluke",
					"luke6",
					"luke7",
					"thrawn2",
					"r2d2lukepalpatine",
					"blackfleet2",
					"maraluke",
					"lukevong",
					"lukekillik",
					"maradeath",
					"lukecaedus",
					"lukeabeloth",
					"lukecade");
	}

	public static ElementInfo getLucienDraayLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Lucien Draay",
					new String[]{"Lucien Draay"}, 
					"Maître Jedi du padawan Zayne Carrick durant les Guerres Mandaloriennes. Il fut le fils de Krynda Draay et par conséquent un membre imminent du Pacte Jedi. ",
					"",
					"luciendraay",
					0,
					0,
					null,
					ElementColor.blue,
					"luciendraay1",
					"luciendraayyoung",
					"jedicovenant1",
					"luciendraayzayne",
					"luciendraayadasca",
					"luciendraaybad");
	}

	public static ElementInfo getLowbaccaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Lowbacca",
					new String[]{"Lowbacca"}, 
					"Chevalier Jedi Wookiee entraîné par Luke Skywalker, membre du Nouvel Ordre Jedi.",
					"",
					"lowbacca",
					0,
					0,
					null,
					ElementColor.blue,
					"lowbacca1",
					"newjediorder4",
					"chisswar");
	}

	public static ElementInfo getGarmBelIblisLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Garm Bel Iblis",
					new String[]{"Garm Bel Iblis", "Garm", "Bel Iblis"}, 
					"Ancien sénateur et chef militaire voué à détruire l'Empire.",
					"",
					"garmbeliblis",
					0,
					0,
					null,
					ElementColor.blue,
					"garmbeliblis1",
					"rebelborn",
					"garmbeliblis2");
	}

	public static ElementInfo getKorrSellaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Korr Sella",
					new String[]{"Korr Sella"}, 
					"Korr Sella est une Humaine servant comme commandante dans la Résistance en poste dans la base de la Résistance. Elle servit également d'envoyé politique auprès de la Nouvelle République.",
					"",
					"korrsella",
					0,
					0,
					null,
					ElementColor.blue,
					"korrsella1");
	}

	public static ElementInfo getLeiaOrganaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Leia Organa",
					new String[]{"Leia Organa", "Leia", "Leia Organa Solo", "Leia Skywalker"}, 
					"Leia Organa Skywalker, fille cachée d'Anakin Skywalker et Padmé Amidala, et soeur jumelle de Luke Skywalker, devint Princesse d'Alderaan sous l'Empire et participa à la Rébellion.",
					"",
					"leiaskywalkerclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"logoleiaskywalker",
					"leia1",
					"kananleia",
					"leia2",
					"leiaalde",
					"leia3",
					"vadorleia",
					"leia4",
					"leia5",
					"han6",
					"newrepublic2",
					"leiaresistance");
	}

	public static ElementInfo getLeiaOrganaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Leia Organa",
					new String[]{"Leia Organa", "Leia", "Leia Organa Solo", "Leia Skywalker"}, 
					"Leia Organa Skywalker, fille cachée d'Anakin Skywalker et Padmé Amidala, et soeur jumelle de Luke Skywalker, devint Princesse d'Alderaan sous l'Empire et participa à la Rébellion.",
					"",
					"leiaskywalkerlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"logoleiaskywalker",
					"leia1",
					"leia2",
					"leia4",
					"leia5",
					"han6",
					"leiaholocron",
					"caamasdoc2",
					"leiakillik",
					"leiahan",
					"leiaold");
	}

	public static ElementInfo getKypDurronLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kyp Durron",
					new String[]{"Kyp Durron"}, 
					"Kyp Durron fut un jeune chevalier Jedi talentueux de l'Académie Jedi de Luke Skywalker, possédé un temps par Exar Kun, un ancien Seigneur Sith du temps de la Grande Guerre des Sith.",
					"",
					"kypdurron",
					0,
					0,
					null,
					ElementColor.blue,
					"kypdurron1",
					"kypdurron2",
					"kypdurron3");
	}

	public static ElementInfo getKyleKatarnLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kyle Katarn",
					new String[]{"Kyle Katarn"}, 
					"Tout d'abord mercenaire, il continua sur la voie des Jedi, comme son père avant lui. Il fit parti de l'Académie de Luke Skywalker du temps de la débâcle de l'Empire Galactique contre la Nouvelle République.",
					"",
					"kylekatarn",
					0,
					0,
					null,
					ElementColor.blue,
					"kylekatarn1",
					"kylejerec");
	}

	public static ElementInfo getKryndaDraayLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Krynda Draay",
					new String[]{"Krynda Draay"}, 
					"Fondatrice du Pacte Jedi, Maître Jedi dotée d'une très grande vision et mère du Jedi Lucien Draay. ",
					"",
					"kryndadraay",
					0,
					0,
					null,
					ElementColor.blue,
					"kryndadraay1",
					"kryndaold",
					"kryndadeath");
	}

	public static ElementInfo getKolSkywalkerLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kol Skywalker",
					new String[]{"Kol Skywalker", "Kol"}, 
					"Kol Skywalker fut un descendant direct de Luke Skywalker. Grand Maître de l'Ordre Jedi et père de Cade Skywalker, il fut l'instigateur du projet de restauration visant à réparer les dégats causés par les Yuuzhan Vongs.",
					"",
					"kolskywalker",
					0,
					0,
					null,
					ElementColor.blue,
					"logokolskywalker",
					"neirin2",
					"kolfight",
					"cadekol");
	}

	public static ElementInfo getKKruhkLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"K'Kruhk",
					new String[]{"K'Kruhk"}, 
					"Rare Maître Jedi ayant survécut aux deux grandes purges de l'histoire de l'Ordre Jedi, K'Kruhk est pour un ainsi dire un très fort symbol d'espoir et de sagesse dans tout l'Ordre.",
					"",
					"kkruhk",
					0,
					0,
					null,
					ElementColor.blue,
					"kkruhk1",
					"quinlanvoskkruhk",
					"kkruhknature",
					"kkruhkcade");
	}

	public static ElementInfo getKitFistoClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kit Fisto",
					new String[]{"Kit Fisto"}, 
					"Puissant Maître Jedi de race Nautolan, sous l'Ancienne République.",
					"",
					"kitfistoclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"kitfisto1",
					"kitfistogrievous",
					"kitfistoquarren",
					"palpatinearrest");
	}

	public static ElementInfo getKitFistoLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kit Fisto",
					new String[]{"Kit Fisto"}, 
					"Puissant Maître Jedi de race Nautolan, sous l'Ancienne République.",
					"",
					"kitfistolegends",
					0,
					0,
					null,
					ElementColor.blue,
					"kitfisto1",
					"kitfisto2",
					"palpatinearrest");
	}

	public static ElementInfo getKiranaTiLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kirana Ti",
					new String[]{"Kirana Ti"}, 
					"Originellement sorcière de la nuit du clan des Montagnes Chantantes, elle devint l'une des premières Jedi de la nouvelle Académie fondée par Luke Skywalker.",
					"",
					"kiranati",
					0,
					0,
					null,
					ElementColor.blue,
					"kiranati1",
					"leviathan2");
	}

	public static ElementInfo getKiAdiMundiClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ki-Adi-Mundi",
					new String[]{"Ki-Adi-Mundi"}, 
					"Maître Jedi Céréen, membre du Conseil Jedi de Coruscant durant la fin de la République Galactique.",
					"",
					"kiadimundiclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"kiadimundi1",
					"kiadimundi3",
					"kiadimundideath");
	}

	public static ElementInfo getKiAdiMundiLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ki-Adi-Mundi",
					new String[]{"Ki-Adi-Mundi"}, 
					"Maître Jedi Céréen, membre du Conseil Jedi de Coruscant durant la fin de la République Galactique.",
					"",
					"kiadimundilegends",
					0,
					0,
					null,
					ElementColor.blue,
					"kiadimundi1",
					"kiadimundiyoung",
					"geonosisbattle",
					"kiadimundideath");
	}

	public static ElementInfo getKetuLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ketu",
					new String[]{"Ketu"}, 
					"Maïtre de Temple Je'daii durant les guerres qui opposa l'Ordre Je'daii à l'Empire Infini des Rakata. Il fut considéré comme l'un des plus puissante membre de cet ordre.  ",
					"",
					"ketu",
					0,
					0,
					null,
					ElementColor.blue,
					"ketu1");
	}

	public static ElementInfo getKerraHoltLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kerra Holt",
					new String[]{"Kerra Holt", "Kerra"}, 
					"Kerra Holt fut une jeune Jedi née dans l'Espace Sith durant les Nouvelles Guerres Sith et qui livra une lutte solitaire contre le Seigneurs Sith du Secteur Grumani après la mort de son mentor, Vannar Treece, et de leurs compagnons Jedi.",
					"",
					"kerraholt",
					0,
					0,
					null,
					ElementColor.blue,
					"kerraholt1",
					"kerraarrive",
					"kerra2",
					"kerrasith");
	}

	public static ElementInfo getKananJarrusClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kanan Jarrus",
					new String[]{"Kanan Jarrus", "Kanan"}, 
					"Rare Jedi à avoir pu échappé à la purge Jedi de l'Ordre 66, il mena une vie d'errance avant de créer une étincelle de rébellion contre l'Empire Galactique.",
					"",
					"kananjarrus",
					0,
					0,
					null,
					ElementColor.blue,
					"kananjarrus1",
					"kananjarrusyoung",
					"kananjarrus2",
					"kananjarrus3",
					"kananjarrus4",
					"kananinquisitor",
					"landoreb",
					"kananinquisitor2",
					"kananjarrusvador",
					"rexold2",
					"kanantrooper",
					"ghostcrew7",
					"kananleia",
					"kanantie",
					"kananhera",
					"kananblind");
	}

	public static ElementInfo getKamSolusarLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kam Solusar",
					new String[]{"Kam Solusar"}, 
					"Kam Solusar fut l'un des premiers élèves de l'Académie Jedi de Yavin IV, puis un de ses professeurs avec sa femme Tionne. Cet éminent maître Jedi devint également un des membres du Haut Conseil Jedi.",
					"",
					"kamsolusar",
					0,
					0,
					null,
					ElementColor.blue,
					"kamsolusar1",
					"kamsolusar2");
	}

	public static ElementInfo getKaceDorjanderLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kace Dorjander",
					new String[]{"Kace Dorjander"}, 
					"Kace Dorjander fut un Maître Jedi, ancien membre du Haut Conseil Jedi qui trahit la République durant les Guerres Mandaloriennes en devenant un Chevalier Mandalorien.",
					"",
					"kacedorjander",
					0,
					0,
					null,
					ElementColor.blue,
					"dorjanderkace1",
					"kacearrive",
					"mandoknight");
	}

	public static ElementInfo getJohunOthoneLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Johun Othone",
					new String[]{"Johun Othone"}, 
					"Johun Othone fut le padawan du général Hoth avant de devenir Chevalier Jedi durant les Nouvelles Guerres Sith. Il fut l'instigateur de la construction de la Vallée des Jedi sur Ruusan.",
					"",
					"johunothone",
					0,
					0,
					null,
					ElementColor.blue,
					"johunothone1");
	}

	public static ElementInfo getJocastaNuClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jocasta Nu",
					new String[]{"Jocasta Nu"}, 
					"Archiviste Jedi au Temple Jedi de Coruscant.",
					"",
					"jocastanuclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"jocastanu1",
					"jocastanu2");
	}

	public static ElementInfo getJocastaNuLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jocasta Nu",
					new String[]{"Jocasta Nu"}, 
					"Archiviste Jedi au Temple Jedi de Coruscant.",
					"",
					"jocastanulegends",
					0,
					0,
					null,
					ElementColor.blue,
					"jocastanu1",
					"jocastanu2");
	}

	public static ElementInfo getJainaSoloLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jaina Solo",
					new String[]{"Jaina Solo", "Jaina"}, 
					"Jaina Solo fut la fille de Leia Organa et Han Solo, et un membre du Nouvel Ordre Jedi.",
					"",
					"jainasolo",
					0,
					0,
					null,
					ElementColor.green,
					"logojainasolo",
					"jainajacenbirth",
					"jainajagged",
					"swarmwar2",
					"jainacaedus",
					"jaina2",
					"jaina3",
					"jainavsvestara");
	}

	public static ElementInfo getJacenSoloLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jacen Solo",
					new String[]{"Jacen Solo", "Jacen"}, 
					"Jacen Solo fut le fils aîné de Leia Organa et Han Solo et le frère jumeau de Jaina Solo. La Guerre contre les Yuuzhan Vong aura de graves conséquences pour lui et le conduira à emprunter la voie des Sith quelques années plus tard.",
					"",
					"jacensolo",
					0,
					0,
					null,
					ElementColor.green,
					"logojacensolo",
					"jainajacenbirth",
					"lukevong",
					"maradeath",
					"darkcaedus2",
					"jainacaedus2");
	}

	public static ElementInfo getDarkCaedusLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Caedus",
					new String[]{"Dark Caedus", "Caedus"}, 
					"Jedi et fils aîné de Leia Organa et Han Solo et le frère jumeau de Jaina Solo. La Guerre contre les Yuuzhan Vong aura de graves conséquences pour lui et le conduira à emprunter la voie des Sith quelques années plus tard.",
					"",
					"jacensolo",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"logodarkcaedus",
					"jainajacenbirth",
					"lukevong",
					"maradeath",
					"darkcaedus2",
					"jainacaedus2");
	}

	public static ElementInfo getHawkRyoLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Hawk Ryo",
					new String[]{"Hawk Ryo"}, 
					"Ranger Je'daii Twi'lek du temps du règne de l'Empire Infini bien avant la création de l'Ancienne République. ",
					"",
					"hawkryo",
					0,
					0,
					null,
					ElementColor.blue,
					"hawkryo1",
					"hawkryo2");
	}

	public static ElementInfo getGannerRhysodeLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ganner Rhysode",
					new String[]{"Ganner Rhysode", "Ganner", "Rhysode"}, 
					"Jeune chevalier Jedi têtu membre du Nouvel Ordre de Luke Skywalker.",
					"",
					"gannerrhysode",
					0,
					0,
					null,
					ElementColor.blue,
					"gannerrhysode1",
					"gannerrhysode2",
					"gannerend");
	}

	public static ElementInfo getEvenPiellClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Even Piell",
					new String[]{"Even Piell"}, 
					"Maître Jedi Lannik, membre du Conseil Jedi de Coruscant.",
					"",
					"evenpiellclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"evenpiell1",
					"evenpielldeath");
	}

	public static ElementInfo getEvenPiellLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Even Piell",
					new String[]{"Even Piell"}, 
					"Maître Jedi Lannik, membre du Conseil Jedi de Coruscant du temps de la République Galactique.",
					"",
					"evenpielllegends",
					0,
					0,
					null,
					ElementColor.blue,
					"evenpiell1");
	}

	public static ElementInfo getEethKothClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Eeth Koth",
					new String[]{"Eeth Koth", "Eeth"}, 
					"Maître Jedi Zabrak endurant et d'une grande force mentale du temps de la République Galactique.",
					"",
					"eethkothclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"eethkoth1",
					"eethkothgrievous",
					"eethkoth3");
	}

	public static ElementInfo getEethKothLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Eeth Koth",
					new String[]{"Eeth Koth", "Eeth"}, 
					"Maître Jedi Zabrak endurant et d'une grande force mentale du temps de l'Ancienne République.",
					"",
					"eethkothlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"eethkoth1",
					"eethkoth2");
	}

	public static ElementInfo getEchuuShenJonLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Echuu Shen-Jon",
					new String[]{"Echuu Shen-Jon"}, 
					"Rare Maître Jedi à avoir survécu à la purge de l'Ordre 66, il aida la princess Leia Organa lors de la Première Guerre Civile Galactique. ",
					"",
					"echuushenjon",
					0,
					0,
					null,
					ElementColor.blue,
					"echuu1",
					"echuu2");
	}

	public static ElementInfo getDepaBillabaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Depa Billaba",
					new String[]{"Depa Billaba"}, 
					"Jeune femme membre du Conseil Jedi et élève du Maître Jedi Mace Windu.",
					"",
					"depabillabaclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"depabillaba1",
					"depabillabadeath");
	}

	public static ElementInfo getDepaBillabaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Depa Billaba",
					new String[]{"Depa Billaba"}, 
					"Jeune femme membre du Conseil Jedi et élève du Maître Jedi Mace Windu.",
					"",
					"depabillabalegends",
					0,
					0,
					null,
					ElementColor.blue,
					"depabillaba1",
					"depabillaba2");
	}

	public static ElementInfo getDarNalaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dar'Nala",
					new String[]{"Dar'Nala"}, 
					"Cette Troguta fut une Maître Jedi du temps de la Guerre Froide Galactique qui opposa l'Ancienne République à l'Ancien Empire Sith Reconstitué.",
					"",
					"darnala",
					0,
					0,
					null,
					ElementColor.blue,
					"darnala1");
	}

	public static ElementInfo getColemanTreborCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Coleman Trebor",
					new String[]{"Coleman Trebor"}, 
					"Maître Jedi Vurk renommé du temps de la République Galactique. Décédé au tout début de la Guerre des Clones par Jango Fett.",
					"",
					"colemantrebor",
					0,
					0,
					null,
					ElementColor.blue,
					"colemantrebor1");
	}

	public static ElementInfo getCelesteMorneLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Celeste Morne",
					new String[]{"Celeste Morne"}, 
					"Céleste Morne fut un Jedi et une ombre du Pacte Jedi dont le destin fut lié à celui du Talisman de Muur.",
					"",
					"celestemorne",
					0,
					0,
					null,
					ElementColor.blue,
					"celestemorne1",
					"celestemorne2",
					"celestevador",
					"celesteluke",
					"celestekrayt");
	}

	public static ElementInfo getCayQelDromaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Cay Qel-Droma",
					new String[]{"Cay Qel-Droma"}, 
					"Cay Qel-Droma fut un Chevalier Jedi du temps de l'Ancienne République et le frère d'Ulic Qel-Droma.",
					"",
					"cayqeldroma",
					0,
					0,
					null,
					ElementColor.blue,
					"cayqeldroma1",
					"caymission",
					"cayarm",
					"cayspeach",
					"caydeath");
	}

	public static ElementInfo getCadeSkywalkerLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Cade Skywalker",
					new String[]{"Cade Skywalker", "Cade"}, 
					"Cade Skywalker est un descendant de la famille Skywalker qui vécut vers l'an 130, fils du célèbre Maître Jedi Kol Skywalker. Il fut le centre d'intérêt du Seigneur Sith Dark Krayt.",
					"",
					"cadeskywalker",
					0,
					0,
					null,
					ElementColor.blue,
					"logocadeskywalker",
					"kolfight",
					"cadedeliahjaria",
					"vendaxabattle",
					"cadesith",
					"taivasarrival",
					"hadabbadonbattle",
					"azlynbacta",
					"cadenakia",
					"cadedeliah",
					"taivasbattle",
					"secondimperialcivilwarend");
	}

	public static ElementInfo getBruckChunLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bruck Chun",
					new String[]{"Bruck Chun"}, 
					"Apprenti Jedi du temps de l'Ancienne République. Enragé contre d'Obi-Wan Kenobi, il attentat à la vie de plusieurs personnes.",
					"",
					"bruckchun",
					0,
					0,
					null,
					ElementColor.blue,
					"bruckchun1",
					"bruckchun2");
	}

	public static ElementInfo getBenSkywalkerLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ben Skywalker",
					new String[]{"Ben Skywalker"}, 
					"Fils de Mara Jade et de Luke Skywalker, il devint un membre important du Nouvel Ordre Jedi de son père.",
					"",
					"benskywalker",
					0,
					0,
					null,
					ElementColor.blue,
					"logobenskywalker",
					"skywalkerfamily",
					"benskywalker2",
					"maradeath",
					"benvestara");
	}

	public static ElementInfo getBastilaShanLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bastila Shan",
					new String[]{"Bastila Shan", "Bastila"}, 
					"Bastila Shan fut une célèbre Jedi de l'Ancienne République, qui combattit les Sith et sépara Revan du Côté Obscur, permettant ainsi sa rédemption.",
					"",
					"bastilashan",
					0,
					0,
					null,
					ElementColor.blue,
					"bastilashan1",
					"bastila2",
					"revanbastila");
	}

	public static ElementInfo getBarissOffeeClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bariss Offee",
					new String[]{"Bariss Offee"}, 
					"Barriss Offee est une Jedi Mirialan experte dans le domaine médical, qui vécut durant les dernières années de la République et qui participa à la Guerre des Clones.",
					"",
					"barissoffeeclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"barissoffee1",
					"barrissoffeeahsoka",
					"barrisoffeeanakin");
	}

	public static ElementInfo getBarissOffeeLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bariss Offee",
					new String[]{"Bariss Offee"}, 
					"Barriss Offee est une Jedi Mirialan experte dans le domaine médical, qui vécut durant les dernières années de la République et qui participa à la Guerre des Clones.",
					"",
					"barissoffeelegends",
					0,
					0,
					null,
					ElementColor.blue,
					"barissoffee1",
					"luminaraunduli4",
					"barrissoffee2",
					"barrissoffeedeath");
	}

	public static ElementInfo getAtrisLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Atris",
					new String[]{"Atris"}, 
					"Historienne Jedi du temps des guerres Mandaloriennes et de la guerre civile des Jedi.",
					"",
					"atris",
					0,
					0,
					null,
					ElementColor.blue,
					"atris1",
					"atris2",
					"atrisdarksion");
	}

	public static ElementInfo getArcaJethLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Arca Jeth",
					new String[]{"Arca Jeth"}, 
					"Arca Jeth fut un Maître Jedi de l'Ancienne République dont la mort provoqua la chute de son apprenti Ulic Qel-Droma et dont l'ADN fut utilisé par le mandalorien Démagol pour tenter de créer une armée de Chevaliers Mandaloriens.",
					"",
					"arcajeth",
					0,
					0,
					null,
					ElementColor.blue,
					"arcajeth1",
					"arcajeth2",
					"arcajethdeath");
	}

	public static ElementInfo getAnyaKuroLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Anya Kuro",
					new String[]{"Anya Kuro", "Femme Obscure"}, 
					"Grand Maître Jedi sous la République Galactique plus connue sous le surnom de Femme Obscure.",
					"",
					"anyakuro",
					0,
					0,
					null,
					ElementColor.blue,
					"anyakuro1",
					"aurracoma",
					"anyakuro2",
					"anyakuro3");
	}

	public static ElementInfo getAnakinSkywalkerClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Anakin Skywalker",
					new String[]{"Anakin Skywalker"}, 
					"Anakin Skywalker, héros de la République durant la Guerre des Clones, fut l'élève du Maître Jedi Obi-Wan Kenobi, avant de céder au Côté Obscur et devenir Dark Vador.",
					"",
					"anakinskywalkerclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"logoanakinskywalker",
					"anakin1",
					"anakin2",
					"anakin3",
					"anakin4",
					"anakin5",
					"anakin6",
					"anakin7",
					"anakin8",
					"anakin9",
					"zillo2",
					"anakin11",
					"anakin12",
					"anakin13",
					"anakin14",
					"anakin15",
					"anakin16",
					"anakin17",
					"anakin18",
					"anakin19",
					"vadorlothal",
					"ahsokavador2",
					"anakin20",
					"anakin21",
					"vadorjabba",
					"vadoraphra",
					"vadorleia",
					"anakin22",
					"anakin23");
	}

	public static ElementInfo getAnakinSkywalkerLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Anakin Skywalker",
					new String[]{"Anakin Skywalker"}, 
					"Anakin Skywalker, héros de la République durant la Guerre des Clones, fut l'élève du Maître Jedi Obi-Wan Kenobi, avant de céder au Côté Obscur et devenir Dark Vador.",
					"",
					"anakinskywalkerlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"logoanakinskywalker",
					"anakin1",
					"anakin2",
					"anakin3",
					"anakin4",
					"anakin5",
					"anakin16",
					"anakin17",
					"anakin18",
					"anakin19",
					"anakin20",
					"anakin22",
					"anakin23");
	}

	public static ElementInfo getAnakinSoloLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Anakin Solo",
					new String[]{"Anakin Solo"}, 
					"Dernier enfant de Leia et Han Solo, il fut un Jedi du Nouvel Ordre Jedi de Luke Skywalker.",
					"",
					"anakinsolo",
					0,
					0,
					null,
					ElementColor.green,
					"logoanakinsolo",
					"anakinsolo2");
	}

	public static ElementInfo getAllanaSoloLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Allana Solo",
					new String[]{"Allana Solo", "Amelia", "Allana"}, 
					"Allana Djo Solo est la fille de Chevalier Jedi Jacen Solo et de	la reine mère d'Hapes Tenel Ka Djo. Elle fut souvent nommée Amelia pour sa sécurité puis placée sous la garde de Leia Organa et Han Solo. ",
					"",
					"allanasolo",
					0,
					0,
					null,
					ElementColor.green,
					"logoallanasolo",
					"jainaallana");
	}

	public static ElementInfo getAlemaRarLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Alema Rar",
					new String[]{"Alema Rar", "Alema"}, 
					"Alema Rar fut une jeune Jedi Twi'lek membre du Nouvel Ordre Jedi, qui combattit lors de la guerre contre les Yuuzhan Vong et les conflits suivants, tout en sombrant dans la folie et le Côté Obscur.",
					"",
					"alemarar",
					0,
					0,
					null,
					ElementColor.blue,
					"alemarar1",
					"alemarar2",
					"alemavoxyn",
					"alemarar3");
	}

	public static ElementInfo getRasiTuumLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Rasi Tuum",
					new String[]{"Rasi Tuum"}, 
					"Maître Jedi qui eut pour padawan Azlyn Rae, il tua le père de Jariah Syn au cours d'une mission sur Roon.",
					"",
					"rasituum",
					0,
					0,
					null,
					ElementColor.blue,
					"rasituum1");
	}

	public static ElementInfo getAhsokaTanoClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ahsoka Tano",
					new String[]{"Ahsoka Tano", "Ahsoka"}, 
					"Ahsoka Tano est une jeune Jedi Togruta qui fut la padawan d'Anakin Skywalker durant la Guerre des Clones et qui partagea bon nombre de ses aventures contre la Confédération des Systèmes Indépendants.",
					"",
					"ahsokatano",
					0,
					0,
					null,
					ElementColor.blue,
					"ahsokatano1",
					"ahsoka1",
					"ahsoka2",
					"ahsoka3",
					"ahsoka4",
					"ahsoka5",
					"ahsoka6",
					"ahsoka7",
					"ahsoka8",
					"ahsoka9",
					"ahsoka10",
					"rexold",
					"ahsokafight",
					"ahsokavador",
					"ahsokamalachor",
					"ahsokavador2");
	}

	public static ElementInfo getAgenKolarClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Agen Kolar",
					new String[]{"Agen Kolar"}, 
					"Jedi Zabrak qui combattit durant la Guerre des Clones. Il fut l'un des rares durant la Guerre des Clones à affronté un Seigneur Sith.",
					"",
					"agenkolarclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"agenkolar1",
					"palpatinearrest");
	}

	public static ElementInfo getAgenKolarLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Agen Kolar",
					new String[]{"Agen Kolar"}, 
					"Jedi Zabrak qui combattit durant la Guerre des Clones. Il fut l'un des rares durant la Guerre des Clones à affronté un Seigneur Sith. ",
					"",
					"agenkolarlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"agenkolar1",
					"agenkolarquinlan",
					"palpatinearrest");
	}

	public static ElementInfo getAdiGalliaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Adi Gallia",
					new String[]{"Adi Gallia"}, 
					"Jeune Maître Jedi native de Corellia, membre du Conseil Jedi lors de la République Galactique.",
					"",
					"adigalliaclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"adigallia1");
	}

	public static ElementInfo getAdiGalliaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Adi Gallia",
					new String[]{"Adi Gallia"}, 
					"Jeune Maître Jedi native de Corellia, membre du Conseil Jedi lors de la République Galactique.",
					"",
					"adigallialegends",
					0,
					0,
					null,
					ElementColor.blue,
					"adigallia1",
					"aurracoma",
					"siritachi4");
	}

	public static ElementInfo getAaylaSecuraClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Aayla Secura",
					new String[]{"Aayla Secura", "Aayla"}, 
					"Aayla Secura fut une brillante Jedi Twi'lek de la République Galactique.",
					"",
					"aaylasecuraclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"aaylasecura1");
	}

	public static ElementInfo getAaylaSecuraLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Aayla Secura",
					new String[]{"Aayla Secura", "Aayla"}, 
					"Aayla Secura fut une brillante Jedi Twi'lek de l'Ancienne République.",
					"",
					"aaylasecuralegends",
					0,
					0,
					null,
					ElementColor.blue,
					"aaylasecura1",
					"aurravsaayla",
					"aaylasecuradeath");
	}

	public static ElementInfo getLePereClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Le Père",
					new String[]{"Le Père"}, 
					"Personnage puissant et mystérieux vivant sur Mortis, il vivait en companie de sa Fille et de son Fils, éloigné du reste de la galaxie.",
					"",
					"thefather",
					0,
					0,
					null,
					ElementColor.blue,
					"thefather1",
					"thefather2");
	}

	public static ElementInfo getLeFilsClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Le Fils",
					new String[]{"Le Fils"}, 
					"Opposé de sa soeur, la Fille, il est souvent considéré comme l'incarnation du coté obscur de la Force et fut en conséquence isolé sur le planète Mortis. ",
					"",
					"theson",
					0,
					0,
					null,
					ElementColor.blue,
					"theson1",
					"theson2");
	}

	public static ElementInfo getLaFilleClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"La Fille",
					new String[]{"La Fille"}, 
					"Utilisatrice de la Force lumineuse à tel point qu'elle en devint un véritable avatar, la Fille fut isolée par le Père sur la planète Mortis.",
					"",
					"thedaughter",
					0,
					0,
					null,
					ElementColor.blue,
					"thedaughter1",
					"thedaughter2");
	}

	public static ElementInfo getAntaresDracoLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Antares Draco",
					new String[]{"Antares Draco"}, 
					"Antares Draco fut le chef des Chevaliers Impériaux, à l'époque de la guerre impérialo-sith et de la Seconde Guerre Civile Impériale qui opposa l'Empire Galactique de Roan Fel au Sith Unique de Dark Krayt.",
					"",
					"antaresdraco",
					0,
					0,
					null,
					ElementColor.purple,
					"logodracoantares",
					"antaresfel",
					"antaresvendaxa",
					"hadabbadonbattle",
					"antaressith",
					"antaresfelfight");
	}

	public static ElementInfo getAzlynRaeLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Azlyn Rae",
					new String[]{"Azlyn Rae"}, 
					"Ancienne Jedi humaine formée aux voie des Chevaliers Impériaux aux début de la Seconde Guerre Civile Impériale afin de servir et protéger l'Empereur légitime.  ",
					"",
					"azlynrae",
					0,
					0,
					null,
					ElementColor.blue,
					"azlynrae1",
					"azlyn2",
					"azlynrasituum",
					"azlynkrayt",
					"azlynbacta",
					"imperialknight1",
					"azlyn3");
	}

	public static ElementInfo getElkeVetterLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Elke Vetter",
					new String[]{"Elke Vetter"}, 
					"Elke Vetter est un Chevalier Impérial et garde du corps de la princesse Marasiah Fel au temps de la Seconde Guerre Civile Impériale.",
					"",
					"elkevetter",
					0,
					0,
					null,
					ElementColor.blue,
					"elkevetter1",
					"elkevetter2");
	}

	public static ElementInfo getElliahChalkLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Elliah Chalk",
					new String[]{"Elliah Chalk"}, 
					"Elliah Fel fut l'épouse de l'Empereur Roan Fel et la mère de Marasiah. Elle fut tuée par le Chevalier Impérial renégat Eshkar Niin avant la Guerre Impérialo-Sith.",
					"",
					"elliahchalk",
					0,
					0,
					null,
					ElementColor.mediumorange,
					"logoelliahchalk");
	}

	public static ElementInfo getGannerKriegLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ganner Krieg",
					new String[]{"Ganner Krieg"}, 
					"Ganner Krieg est un Chevalier Impérial qui servait le Nouvel Empire Galactique de Roan Fel, aux côtés notamment de son ami Antares Draco, à l'époque de la Guerre Impérialo-Sith.",
					"",
					"gannerkrieg",
					0,
					0,
					null,
					ElementColor.blue,
					"gannerkrieg1",
					"antaresvendaxa",
					"krieg2",
					"shadorescue",
					"taivasbattle");
	}

	public static ElementInfo getMarasiahFelLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Marasiah Fel",
					new String[]{"Marasiah Fel", "Marasiah"}, 
					"Fille de l'Empereur Roan Fel, formée pour devenir Chevalier Impérial et à succéder à son père en temps qu'Impératrice du Nouvel Empire Galactique.",
					"",
					"marasiahfel",
					0,
					0,
					null,
					ElementColor.purple,
					"logomarasiahfel",
					"marasiahheir",
					"marasiahvendaxa",
					"taivasarrival",
					"roanfel5",
					"marasiahtorture",
					"taivasbattle",
					"roanfelsith");
	}

	public static ElementInfo getRoanFelLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Roan Fel",
					new String[]{"Roan Fel"}, 
					"Roan Fel fut le troisième Empereur du Nouvel Empire Galactique et fut confronté au Sith Unique de Dark Krayt.",
					"",
					"roanfel",
					0,
					0,
					null,
					ElementColor.purple,
					"logoroanfel",
					"roanfel3",
					"antaresvendaxa",
					"roanfel4",
					"roanfel5",
					"roanfeldeath");
	}

	public static ElementInfo getSigelDareLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sigel Dare",
					new String[]{"Sigel Dare"}, 
					"Sigel Dare est une jeune humaine qui fut membre du corps des Chevaliers Impériaux du Nouvel Empire Galactique.",
					"",
					"sigeldare",
					0,
					0,
					null,
					ElementColor.blue,
					"sigeldare1",
					"sigelstazi",
					"sigelshado");
	}

	public static ElementInfo getTreisSindeLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Treis Sinde",
					new String[]{"Treis Sinde"}, 
					"Chevalier Impérial expérimenté au service l'Empereur Roan Fel sous le Nouvel Empire Galactique.",
					"",
					"treissinde",
					0,
					0,
					null,
					ElementColor.blue,
					"treissinde1",
					"treissinde2",
					"treissindemoncal",
					"roanfel5");
	}

	public static ElementInfo getWA7Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"WA-7",
					new String[]{"WA-7"}, 
					"WA-7 est une série de droïde serveur à roue. Flo, un modèle WA-7, est serveuse au Dex's Diner à Coruscant.",
					"",
					"wa7",
					0,
					0,
					null,
					ElementColor.blue,
					"wa71",
					"wa72");
	}

	public static ElementInfo getR7D4Classic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"R7-D4",
					new String[]{"R7-D4"}, 
					"Droïde astromécano attaché au chasseur Delta-7B du Maître Jedi Plo Koon, qui servi la République Galactique au temps de la guerre des Clones.",
					"",
					"r7d4",
					0,
					0,
					null,
					ElementColor.blue,
					"r7d4");
	}

	public static ElementInfo getR7A7Classic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"R7-A7",
					new String[]{"R7-A7"}, 
					"Droïde astromécano du Jedi Ahsoka Tano, qui servi la République Galactique au temps de la guerre des Clones.",
					"",
					"r7a7",
					0,
					0,
					null,
					ElementColor.blue,
					"r7a7");
	}

	public static ElementInfo getR6H5Classic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"R6-H5",
					new String[]{"R6-H5"}, 
					"Droïde astromécano captricieux du Maître Jedi Kit Fisto, qui servi la République Galactique au temps de la guerre des Clones.",
					"",
					"r6h5",
					0,
					0,
					null,
					ElementColor.blue,
					"r6h5");
	}

	public static ElementInfo getR4P17Classic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"R4-P17",
					new String[]{"R4-P17"}, 
					"Droïde astromécano d'Obi-Wan Kenobi, attaché à ses chasseurs Eta et Delta-7B, afin de servir la République Galactique au temps de la guerre des Clones.",
					"",
					"r4p17",
					0,
					0,
					null,
					ElementColor.blue,
					"r4p17");
	}

	public static ElementInfo getR3S6Classic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"R3-S6",
					new String[]{"R3-S6"}, 
					"Droïde astromécano, renommé Goldie en raison de ses marquages dorés, qui servi la République Galactique au temps de la guerre des Clones.",
					"",
					"r3s6",
					0,
					0,
					null,
					ElementColor.blue,
					"r3s6");
	}

	public static ElementInfo getR2KTClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"R2-KT",
					new String[]{"R2-KT"}, 
					"Droïde astromécano souvent nommé Katie qui servi la République Galactique au temps de la guerre des Clones.",
					"",
					"r2kt",
					0,
					0,
					null,
					ElementColor.blue,
					"r2kt");
	}

	public static ElementInfo get000Classic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"0-0-0",
					new String[]{"0-0-0", "Triple Zéros"}, 
					"Droïde de protocole spécialisé dans l'étiquette, la traduction et la torture.",
					"",
					"tz",
					0,
					0,
					null,
					ElementColor.blue,
					"tz1",
					"tz2",
					"tz3");
	}

	public static ElementInfo getBT1Classic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"BT-1",
					new String[]{"BT-1"}, 
					"Dröide assassin sous couverture d'un astromécano commun.",
					"",
					"bt1",
					0,
					0,
					null,
					ElementColor.blue,
					"bt11",
					"bt12",
					"bt13");
	}

	public static ElementInfo getR2D2Classic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"R2-D2",
					new String[]{"R2-D2", "R2D2", "R2"}, 
					"R2-D2 est un célèbre droïde astromécano qui sauva la galaxie à plusieurs reprises et qui fut le compagnon d'Anakin Skywalker puis de son fils Luke.",
					"",
					"r2d2classic",
					0,
					0,
					null,
					ElementColor.blue,
					"r2d21",
					"r2d2gadgets",
					"r2d2naboo1",
					"r2d2naboo2",
					"r2d2geonosis",
					"r2d2saveanakin",
					"r2d2citadelle",
					"r2d2prestatite",
					"r2d2droides",
					"r2d2vsdroid",
					"r2d2mustafar",
					"c3poreb",
					"r2d2leia",
					"r2d2tatooine",
					"r2d2deathstar",
					"r2d2trav",
					"r2d2cymoon",
					"r2d2narshaddaa",
					"r2d2dagobah",
					"endorend");
	}

	public static ElementInfo getR2D2Legends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"R2-D2",
					new String[]{"R2-D2", "R2D2", "R2"}, 
					"R2-D2 est un célèbre droïde astromécano qui sauva la galaxie à plusieurs reprises et qui fut le compagnon de plusieurs membres de la famille Skywalker.",
					"",
					"r2d2legends",
					0,
					0,
					null,
					ElementColor.blue,
					"r2d21",
					"r2d2gadgets",
					"r2d2naboo1",
					"r2d2naboo2",
					"r2d2geonosis",
					"r2d2illum",
					"r2d2leia",
					"r2d2tatooine",
					"r2d2deathstar",
					"r2d2dagobah",
					"endorend",
					"joruus2",
					"r2d2lukepalpatine",
					"r2d2jediyavin",
					"r2d2killik",
					"r2d2cade",
					"r2d2sun");
	}

	public static ElementInfo getDroideMecanoCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Droïde Mécano",
					new String[]{"Droïde Mécano"}, 
					"Droïde mécanicien utilisé sur les circuits de courses de podracers.",
					"",
					"pitdroid",
					0,
					0,
					null,
					ElementColor.blue,
					"pitdroid1",
					"pitdroid2");
	}

	public static ElementInfo getChopperClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Chopper",
					new String[]{"Chopper"}, 
					"Droïde astromécano capricieux et membre du vaisseau rebelle le Ghost.",
					"",
					"chopper",
					0,
					0,
					null,
					ElementColor.blue,
					"chopper1",
					"chopper2",
					"chopper3",
					"chopperblack",
					"chopper4",
					"ghostcrew1",
					"ghostcrew5",
					"chopperezra",
					"chopper5",
					"chopperbaby",
					"kananleia",
					"heracell",
					"choppermalachor");
	}

	public static ElementInfo getH2Legends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"H2",
					new String[]{"H2"}, 
					"Droïde technicien qui serva le Jedi Dass Jennir après la Purge Jedi. ",
					"",
					"h2",
					0,
					0,
					null,
					ElementColor.blue,
					"h21",
					"h22");
	}

	public static ElementInfo getDroideenergetiqueCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Droïde énergétique",
					new String[]{"Droïde énergétique"}, 
					"Modèle très répandu de droïde énergétique, réputé pour sa bêtise et sa lenteur.",
					"",
					"energydroid",
					0,
					0,
					null,
					ElementColor.blue,
					"energydroid1");
	}

	public static ElementInfo getDroidemedicalCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Droïde médical",
					new String[]{"Droïde médical"}, 
					"Le Droïde Médical 2-1B fait partie d'une série de droïdes médicaux très populaire dans la galaxie, à l'époque de la Guerre Civile Galactique.",
					"",
					"mecdroid",
					0,
					0,
					null,
					ElementColor.blue,
					"mecdroid1");
	}

	public static ElementInfo getDroideprotocolaireCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Droïde protocolaire",
					new String[]{"Droïde protocolaire"}, 
					"Droïde multifonction conçu pour les besoins domestiques pourvu d'une grande connaissance culturelle.",
					"",
					"protodroid",
					0,
					0,
					null,
					ElementColor.blue,
					"protodroid1",
					"c3potantive");
	}

	public static ElementInfo getBB8Classic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"BB-8",
					new String[]{"BB-8"}, 
					"Droïde de Poe Dameron durant la rébellion qui opposant la Résistance au Premier Ordre.",
					"",
					"bb8",
					0,
					0,
					null,
					ElementColor.blue,
					"bb81",
					"bb82",
					"bb83");
	}

	public static ElementInfo getC3POClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"C-3PO",
					new String[]{"C-3PO", "C3PO", "3PO"}, 
					"Droïde protocolaire construit par Anakin Skywalker. Il vivra moult aventures en accompagnant les familles Skywalker, Naberrie et Organa.",
					"",
					"c3poclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"c3po1",
					"c3pobirth",
					"c3potatooine",
					"c3pogeonosis",
					"c3popadme",
					"c3porodia",
					"c3pocadbane",
					"c3popatitite",
					"c3pomustafar",
					"c3poreb",
					"c3potantive",
					"c3poluke",
					"c3pocymoon",
					"c3pohoth",
					"c3pochewie",
					"endorend",
					"c3poresistance");
	}

	public static ElementInfo getC3POLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"C-3PO",
					new String[]{"C-3PO", "C3PO", "3PO"}, 
					"Droïde protocolaire construit par Anakin Skywalker. Il vivra moult aventures en accompagnant les familles Skywalker, Naberrie et Organa. ",
					"",
					"c3polegends",
					0,
					0,
					null,
					ElementColor.blue,
					"c3po1",
					"c3pobirth",
					"c3potatooine",
					"c3pogeonosis",
					"c3pomustafar",
					"zorneth1",
					"c3potantive",
					"c3poluke",
					"c3pohoth",
					"c3pochewie",
					"endorend",
					"c3popalpatine",
					"darkcaedus2");
	}

	public static ElementInfo getWhormLoathsomClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Whorm Loathsom",
					new String[]{"Whorm Loathsom"}, 
					"Général séparatiste qui mena ses troupes lors de la bataille de Christophsis notamment.",
					"",
					"whormloathsom",
					0,
					0,
					null,
					ElementColor.blue,
					"whormloathsom1",
					"whormloathsom2");
	}

	public static ElementInfo getPoggleleBrefClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Poggle le Bref",
					new String[]{"Poggle le Bref"}, 
					"Chef suprême des Géonosiens, rallié au Comte Dooku et aux séparatistes.",
					"",
					"pogglethebriefclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"pogglethebrief1",
					"pogglethebrief2");
	}

	public static ElementInfo getPoggleleBrefLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Poggle le Bref",
					new String[]{"Poggle le Bref"}, 
					"Chef suprême des Géonosiens, rallié au Comte Dooku et aux séparatistes.",
					"",
					"pogglethebrieflegends",
					0,
					0,
					null,
					ElementColor.blue,
					"pogglethebrief1",
					"pogglethebrief2");
	}

	public static ElementInfo getAltoStratusLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Alto Stratus",
					new String[]{"Alto Stratus"}, 
					"Leader des armées séparatistes jabiimiennes lors de la Bataille de Jabiim.",
					"",
					"altostratus",
					0,
					0,
					null,
					ElementColor.blue,
					"altostratus1",
					"altostratus2");
	}

	public static ElementInfo getWatTamborCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Wat Tambor",
					new String[]{"Wat Tambor"}, 
					"Leader du puissant Techno-Syndicat, allié aux Séparatistes durant la guerre des Clones.",
					"",
					"wattambor",
					0,
					0,
					null,
					ElementColor.blue,
					"wattambor1");
	}

	public static ElementInfo getTX20Classic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"TX-20",
					new String[]{"TX-20"}, 
					"produit pour servir la Confédération des Systèmes Indépendants, TX-20 fut un tacticien qui accompagna Wat Tambor lors du siège de Ryloth.",
					"",
					"tx20",
					0,
					0,
					null,
					ElementColor.blue,
					"tx20",
					"tx202");
	}

	public static ElementInfo getTrenchClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Trench",
					new String[]{"Trench"}, 
					"Amiral et fin stratège harch d'une flotte séparatiste.",
					"",
					"trench",
					0,
					0,
					null,
					ElementColor.blue,
					"trench1",
					"trench2");
	}

	public static ElementInfo getTA175Classic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"TA-175",
					new String[]{"TA-175"}, 
					"Produit pour servir la Confédération des Systèmes Indépendants, TA-175 fut un tacticien qui accompagna Wat Tambor sur Ryloth pour l'aider à diriger les troupes terrestres et à asservir la population.",
					"",
					"ta175",
					0,
					0,
					null,
					ElementColor.blue,
					"ta175",
					"ta1752");
	}

	public static ElementInfo getShuMaiCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Shu Mai",
					new String[]{"Shu Mai"}, 
					"Présidente de la Guilde du Commerce, liée à la Confédération des Systèmes Indépendants.",
					"",
					"shumai",
					0,
					0,
					null,
					ElementColor.blue,
					"shumai1",
					"shumai2");
	}

	public static ElementInfo getSanHillCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"San Hill",
					new String[]{"San Hill"}, 
					"Président cupide du Clan Bancaire Intergalactique basé sur Muunilinst.",
					"",
					"sanhill",
					0,
					0,
					null,
					ElementColor.blue,
					"sanhill1");
	}

	public static ElementInfo getRuneHaakoCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Rune Haako",
					new String[]{"Rune Haako"}, 
					"Rune Haako fut un Neimoidien sans scrupules, proche conseiller de Nute Gunray. Il fit partie du Conseil Séparatiste lors de la Guerre des Clones.",
					"",
					"runehaako",
					0,
					0,
					null,
					ElementColor.blue,
					"runehaako1",
					"neimodiansidious");
	}

	public static ElementInfo getPreVizslaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Pre Vizsla",
					new String[]{"Pre Vizsla"}, 
					"Chef du Death Watch, un groupe de guerriers dissidants de la planète Mandalore.",
					"",
					"previzsla",
					0,
					0,
					null,
					ElementColor.blue,
					"previzsla1",
					"previzsla2");
	}

	public static ElementInfo getPoNudoCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Po Nudo",
					new String[]{"Po Nudo"}, 
					"Sénateur aqualish sans scrupule à la solde de la Confédération des Systèmes Indépendants.",
					"",
					"ponudo",
					0,
					0,
					null,
					ElementColor.blue,
					"ponudo1",
					"ponudo2");
	}

	public static ElementInfo getPasselArgenteCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Passel Argente",
					new String[]{"Passel Argente"}, 
					"Koorivar dirigeant de l'Alliance des Corporations, il est clairement hostile à la République.",
					"",
					"passelargente",
					0,
					0,
					null,
					ElementColor.blue,
					"passelargente1",
					"passelargente2");
	}

	public static ElementInfo getNuteGunrayClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nute Gunray",
					new String[]{"Nute Gunray"}, 
					"Nute Gunray fut le vice-roi de la Fédération du Commerce et ennemi de Padmé Amidala. Il fut un des principaux dirigeants de la Confédération des Systèmes Indépendants lors de la Guerre des Clones.",
					"",
					"nutegunrayclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"nutegunray1",
					"neimodiansidious",
					"mustafarmassacre");
	}

	public static ElementInfo getNuteGunrayLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nute Gunray",
					new String[]{"Nute Gunray"}, 
					"Nute Gunray fut le vice-roi de la Fédération du Commerce et ennemi de Padmé Amidala. Il fut un des principaux dirigeants de la Confédération des Systèmes Indépendants lors de la Guerre des Clones.",
					"",
					"nutegunraylegends",
					0,
					0,
					null,
					ElementColor.blue,
					"nutegunray1",
					"neimodiansidious",
					"mustafarmassacre");
	}

	public static ElementInfo getMarTuukClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mar Tuuk",
					new String[]{"Mar Tuuk"}, 
					"Commandant d'un vaisseau de contrôle séparatiste qui participa au blocus de Ryloth.",
					"",
					"martuuk",
					0,
					0,
					null,
					ElementColor.blue,
					"martuuk1");
	}

	public static ElementInfo getMagnagardeIG100Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Magnagarde IG-100",
					new String[]{"Magnagarde IG-100", "Magnagarde"}, 
					"Garde du corp et exécuteur personnel du Général Grievous. Ce dernier disposait toujours de plusieurs Magnagardes lors de ses déplacements.",
					"",
					"magnagardig100",
					0,
					0,
					null,
					ElementColor.blue,
					"magnaguard1",
					"magnaguard2");
	}

	public static ElementInfo getLushrosDofineCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Lushros Dofine",
					new String[]{"Lushros Dofine", "Lushros"}, 
					"Capitaine neimoidien, cousin de Daultay Dofine, qui servit sur la Main Invisible durant la Guerre des Clones.",
					"",
					"lushrosdofine",
					0,
					0,
					null,
					ElementColor.blue,
					"dofine1");
	}

	public static ElementInfo getDaultayDofineCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Daultay Dofine",
					new String[]{"Daultay Dofine", "Daultay"}, 
					"Le Capitaine peureux du vaisseau amiral droïde de la Fédération du Commerce.",
					"",
					"daultaydofine",
					0,
					0,
					null,
					ElementColor.blue,
					"daultaydofine1",
					"daultaydofine2");
	}

	public static ElementInfo getLottDodClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Lott Dod",
					new String[]{"Lott Dod"}, 
					"Lott Dod fut le représentant de la Fédération du Commerce au Sénat Galactique.",
					"",
					"lottdod",
					0,
					0,
					null,
					ElementColor.blue,
					"lottdod1");
	}

	public static ElementInfo getLokDurdClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Lok Durd",
					new String[]{"Lok Durd"}, 
					"Général neimoidien ayant conçu le Défoliateur, une arme de destruction massive, durant la Guerre des Clones.",
					"",
					"lokdurd",
					0,
					0,
					null,
					ElementColor.blue,
					"lokdurd1",
					"lokdurd2");
	}

	public static ElementInfo getRohlanDyreLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Rohlan Dyre",
					new String[]{"Rohlan Dyre"}, 
					"Rohlan Dyre était un valeureux guerrier mandalorien qui s'interrogea sur les raisons qui avaient conduits son peuple à déclencher les Guerres Mandaloriennes.",
					"",
					"rohlandyre",
					0,
					0,
					null,
					ElementColor.blue,
					"rohlandyre1",
					"demagolflashpoint",
					"jaraelvschantique");
	}

	public static ElementInfo getHondoOhnakaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Hondo Ohnaka",
					new String[]{"Hondo Ohnaka"}, 
					"Hondo Ohnaka fut le chef d'un gang de pirates weequays pendant la Guerre des Clones. Il participa à la capture du Comte Dooku et combattit les Jedi plusieurs fois.",
					"",
					"hondoohnaka",
					0,
					0,
					null,
					ElementColor.blue,
					"hondoohnaka1",
					"hondo2",
					"hondo3",
					"ezraondo");
	}

	public static ElementInfo getCikatroVizagoClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Cikatro Vizago",
					new String[]{"Cikatro Vizago", "Cikatro", "Vizago"}, 
					"Dévaronien qui est devenu un chef du Broken Horn Syndicate, spécialisé dans le trafic illégal d'armes sur Lothal.",
					"",
					"cikatro",
					0,
					0,
					null,
					ElementColor.blue,
					"cikatro1",
					"cikatro2",
					"ezraondo");
	}

	public static ElementInfo getGrievousClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Grievous",
					new String[]{"Grievous"}, 
					"Le général Grievous est un cyborg impitoyable d'origine kaleesh qui dirigea l'armée de la Confédération des Systèmes Indépendants durant la Guerre des Clones.",
					"",
					"grievousclassic",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"logogrievous",
					"sdsubjugator1",
					"kitfistogrievous",
					"eethkothgrievous",
					"obiwangrievous");
	}

	public static ElementInfo getGrievousLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Grievous",
					new String[]{"Grievous"}, 
					"Le général Grievous est un cyborg impitoyable d'origine kaleesh qui dirigea l'armée de la Confédération des Systèmes Indépendants durant la Guerre des Clones.",
					"",
					"grievouslegends",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"logogrievous",
					"grievous4",
					"sanhillgrievous",
					"csi1",
					"grievouscoruscant",
					"obiwangrievous");
	}

	public static ElementInfo getKhaleenHentzLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Khaleen Hentz",
					new String[]{"Khaleen Hentz"}, 
					"Espionne au service de la Confédération des Systèmes Indépendants devenue la compagne de Quinlan Vos, dont elle eut un fils.",
					"",
					"khaleenhentz",
					0,
					0,
					null,
					ElementColor.blue,
					"khaleenhentz1",
					"khaleen2",
					"kortovos");
	}

	public static ElementInfo getBokLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bok",
					new String[]{"Bok"}, 
					"Guerrier Morgukaï qui fut cloné pour créer l'armée secrète de la CSI durant la Guerre des Clones.",
					"",
					"bok",
					0,
					0,
					null,
					ElementColor.blue,
					"bok1",
					"bok2");
	}

	public static ElementInfo getDurgeLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Durge",
					new String[]{"Durge"}, 
					"Durge fut un chasseur de primes Gen'Dai sanguinaire, âgé de plus de deux mille ans qui travailla pour le compte de Dooku durant la Guerre des Clones.",
					"",
					"durge",
					0,
					0,
					null,
					ElementColor.blue,
					"durge1",
					"durge2",
					"durge3");
	}

	public static ElementInfo getOOM10Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"OOM-10",
					new String[]{"OOM-10"}, 
					"Ce droïde de combat de série B1 fut capturé et reprogrammé par les Jedi lors de la guerre des Clones afin de libérer le Jedi Even Piell. ",
					"",
					"oom10",
					0,
					0,
					null,
					ElementColor.blue,
					"oom10");
	}

	public static ElementInfo getOOM9Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"OOM-9",
					new String[]{"OOM-9"}, 
					"Série de droïde de combat B1 à plus haute autorité.",
					"",
					"droidoom",
					0,
					0,
					null,
					ElementColor.blue,
					"oom9",
					"oom92");
	}

	public static ElementInfo getDroideDestroyerCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Droïde Destroyer",
					new String[]{"Droïde Destroyer"}, 
					"Le Droïdeka fut un droïde illégal de Colicoid Creation Nest, utilisé par la Fédération du Commerce et la Confédération des Systèmes Indépendants.",
					"",
					"droideka",
					0,
					0,
					null,
					ElementColor.blue,
					"droideka1",
					"droideka2");
	}

	public static ElementInfo getDroidededemolitionCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Droïde de démolition",
					new String[]{"Droïde de démolition"}, 
					"Produits au cours de la Guerre des Clones par une entreprise inconnue, les Droïdes de Démolition étaient l'un des atouts majeurs de la Confédération des Systèmes Indépendants pour instaurer un véritable climat d'insécurité.",
					"",
					"droiddemo",
					0,
					0,
					null,
					ElementColor.blue,
					"droiddemo1",
					"droiddemo2");
	}

	public static ElementInfo getDroideBuzzCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Droïde Buzz",
					new String[]{"Droïde Buzz"}, 
					"e droïde de sabotage Pistoeka, dit droïde buzz fut un petit robot utilisé par les Séparatistes afin de mettre en pièce les appareils ennemi.",
					"",
					"droidbuzz",
					0,
					0,
					null,
					ElementColor.blue,
					"droidbuzz1",
					"droidbuzz2");
	}

	public static ElementInfo getDroidedecombatB2Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Droïde de combat B2",
					new String[]{"Droïde de combat B2"}, 
					"Le super droïde de combat B2 est une version améliorée, mieux armée et plus résistante, du célèbre droïde militaire B1 de la Fédération du Commerce",
					"",
					"droidb2",
					0,
					0,
					null,
					ElementColor.blue,
					"droidb21",
					"droidb22");
	}

	public static ElementInfo getDroidedecombatB1Common() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Droïde de combat B1",
					new String[]{"Droïde de combat B1"}, 
					"Le droide de combat B1 est un modèle de droïde militaire utilisé par la Fédération du Commerce sous la République, puis par les Séparatistes durant la Guerre des Clones.",
					"",
					"droidb1",
					0,
					0,
					null,
					ElementColor.blue,
					"droidb11",
					"droidb12");
	}

	public static ElementInfo getMirajScintelClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Miraj Scintel",
					new String[]{"Miraj Scintel"}, 
					"Reine de l'Empire zygerrien. Elle dirigeait également d'une main de fer la guilde des esclavagistes zygerriens.",
					"",
					"miraj",
					0,
					0,
					null,
					ElementColor.blue,
					"miraj1");
	}

	public static ElementInfo getAtaiMolecClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Atai Molec",
					new String[]{"Atai Molec"}, 
					"Allié aux séparatistes de la Confédération des Systèmes Indépendants, il fut le conseiller de la Reine zygerrienne Miraj Scintel.",
					"",
					"ataimolec",
					0,
					0,
					null,
					ElementColor.blue,
					"ataimolec1",
					"anakin12");
	}

	public static ElementInfo getAgrussClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Agruss",
					new String[]{"Agruss"}, 
					"Esclavagiste zygerrien allié à la Confédération des Systèmes Indépendants durant la Guerre des Clones.",
					"",
					"agruss",
					0,
					0,
					null,
					ElementColor.blue,
					"agruss1",
					"agruss2");
	}

	public static ElementInfo getWattoCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Watto",
					new String[]{"Watto"}, 
					"Watto fut un toydarien marchand et joueur roublard, qui habitait la planète Tatooine. Il fut l'un des propriétaire d'Ankin Skywalker avant de l'affranchir.",
					"",
					"watto",
					0,
					0,
					null,
					ElementColor.blue,
					"watto1",
					"watto2");
	}

	public static ElementInfo getThrackanSalSoloLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Thrackan Sal-Solo ",
					new String[]{"Thrackan Sal-Solo ", "Thrackan"}, 
					"Thrackan Sal-Solo devait être le successeur du Diktat du Secteur Corellien, lequel, cependant, adhéra à la Nouvelle République. Il fut le fondateur de la Ligue Humaine et dirigea les Brigades de la Paix pour les Yuuzhan Vong.",
					"",
					"trackansalsolo",
					0,
					0,
					null,
					ElementColor.green,
					"logotrackansalsolo",
					"salsolo2",
					"salsoloend");
	}

	public static ElementInfo getTenenielDjoLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Teneniel Djo",
					new String[]{"Teneniel Djo", "Teneniel"}, 
					"Teneniel Djo fut une Sorcière de la Nuit de Dathomir et la Reine-Mère du Consortium Hapien.",
					"",
					"tenenieldjo",
					0,
					0,
					null,
					ElementColor.orange,
					"logotenenieldjo",
					"luketeneniel");
	}

	public static ElementInfo getAhnahRawkLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ahnah Rawk",
					new String[]{"Ahnah Rawk"}, 
					"Fille légitime de Droo Rawk et d'un kiffar, elle suivit la voie de sa mère afin de devenir une surveillante.",
					"",
					"ahnahrawk",
					0,
					0,
					null,
					ElementColor.pink,
					"logoahnahrawk",
					"ahnahjariah");
	}

	public static ElementInfo getCalebLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Caleb",
					new String[]{"Caleb"}, 
					"Ermite soigneur ayant vécu sur Ambria à l'époque de la dernière bataille de Ruusan, et qui soigna à deux reprises Dark Bane.",
					"",
					"caleb",
					0,
					0,
					null,
					ElementColor.blue,
					"caleb1",
					"caleb2");
	}

	public static ElementInfo getDrooRawkLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Droo Rawk",
					new String[]{"Droo Rawk"}, 
					"Droo Rawk fut une guérisseuse kiffar ainsi que l'épouse de Bantha Rawk et la mère adoptives de plusieurs enfants.",
					"",
					"droorawk",
					0,
					0,
					null,
					ElementColor.pink,
					"logodroorawk",
					"droo2");
	}

	public static ElementInfo getGormanVandraykLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Gorman Vandrayk",
					new String[]{"Gorman Vandrayk", "Campeur"}, 
					"Scientifique sion extrêment brillant de la planète Arkania, il fuya ses maîtres afin de vivre en ermite. ",
					"",
					"gormanvandrayk",
					0,
					0,
					null,
					ElementColor.blue,
					"gormanvandrayk1",
					"gormanvandraykyoung",
					"gormanvandrayk2",
					"adasca2");
	}

	public static ElementInfo getIsolderLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Isolder",
					new String[]{"Isolder"}, 
					"Isolder fut le Prince d'Hapes, allié de la famille Solo et de la Nouvelle République.",
					"",
					"isolder",
					0,
					0,
					null,
					ElementColor.darkblue,
					"logoisolder");
	}

	public static ElementInfo getTarpalsCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tarpals",
					new String[]{"Tarpals"}, 
					"Roos Tarpals fut un Général Gungan qui combattu la Fédération du commerce puis la Confédération pour la République.",
					"",
					"roostarpals",
					0,
					0,
					null,
					ElementColor.blue,
					"tarpals1",
					"tarpals2");
	}

	public static ElementInfo getTarffulCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tarfful",
					new String[]{"Tarfful"}, 
					"Ce Wookiee est le chef de la ville de Kachirho sur Kashyyyk et ami de Chewbacca.",
					"",
					"tarfful",
					0,
					0,
					null,
					ElementColor.blue,
					"tarfful1",
					"tarfful2");
	}

	public static ElementInfo getLobotLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Lobot",
					new String[]{"Lobot"}, 
					"Lobot était le chef administratif de la Cité des Nuages sur Bespin. Au service du Baron Lando Calrissian, il était connecté à l’ordinateur de la ville via son implant cybernétique.",
					"",
					"lobotlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"lobot1");
	}

	public static ElementInfo getLobotClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Lobot",
					new String[]{"Lobot"}, 
					"Lobot était le chef administratif de la Cité des Nuages sur Bespin. Au service du Baron Lando Calrissian, il était connecté à l’ordinateur de la ville via son implant cybernétique.",
					"",
					"lobotclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"lobot1",
					"lobot2");
	}

	public static ElementInfo getSerraLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Serra",
					new String[]{"Serra"}, 
					"Fille du soigneur Caleb, cette jeune fille de bon coeur n'eu pas la vie facile à cause des Sith. ",
					"",
					"serra",
					0,
					0,
					null,
					ElementColor.blue,
					"serra1",
					"caleb2");
	}

	public static ElementInfo getSkeetoRawkLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Skeeto Rawk",
					new String[]{"Skeeto Rawk"}, 
					"Jeune humain adopté par Nat Skywalker et Droo Rawk vivant sous l'Empire Sith de Dark Krayt.",
					"",
					"skeetorawk",
					0,
					0,
					null,
					ElementColor.pink,
					"logoskeetorawk");
	}

	public static ElementInfo getShmiSkywalkerCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Shmi Skywalker",
					new String[]{"Shmi Skywalker", "Shmi"}, 
					"Esclave depuis sa naissance, elle accoucha d'Anakin Skywalker sans avoir eu de conjoint. Elle fut rachetée puis affranchie par Cliegg Lars.",
					"",
					"shmiskywalker",
					0,
					0,
					null,
					ElementColor.blue,
					"logoshmiskywalker",
					"shmianakin",
					"shmideath");
	}

	public static ElementInfo getLamaSuCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Lama Su",
					new String[]{"Lama Su"}, 
					"Premier ministre tempéré de la planète Kamino résidant à Tipoca City.",
					"",
					"lamasu",
					0,
					0,
					null,
					ElementColor.blue,
					"lamasu1",
					"obiwanlamasu");
	}

	public static ElementInfo getJobalNaberrieCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jobal Naberrie",
					new String[]{"Jobal Naberrie"}, 
					"Jobal est l'épouse de Ruwee Naberrie ainsi que la mère attentionnée de Sola et Padmé Naberrie.",
					"",
					"jobalnaberrie",
					0,
					0,
					null,
					ElementColor.yellow,
					"logojobalnaberrie",
					"naberriefamily");
	}

	public static ElementInfo getDexterJettsterCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dexter Jettster",
					new String[]{"Dexter Jettster"}, 
					"Besalisk connu par son restaurant dans les étages élevés de Coruscant. Véritable encyclopédie vivante, il est l'informateur de plusieurs personnes en quête de renseignements.  ",
					"",
					"dexterjettster",
					0,
					0,
					null,
					ElementColor.blue,
					"dexter1",
					"dexter2");
	}

	public static ElementInfo getClieggLarsCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Cliegg Lars",
					new String[]{"Cliegg Lars", "Cliegg"}, 
					"Père d'Owen Lars, il racheta Shmi Skywalker à Watto quelques années avant son enlèvement.",
					"",
					"cliegglars",
					0,
					0,
					null,
					ElementColor.red,
					"logocliegglars");
	}

	public static ElementInfo getReyClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Rey",
					new String[]{"Rey"}, 
					"Jeune ermite sensible à la force vivant dans les plaines de Jakku.",
					"",
					"rey",
					0,
					0,
					null,
					ElementColor.blue,
					"rey1",
					"reyship",
					"rey2",
					"reyandkylo",
					"kyloren4",
					"reydepart");
	}

	public static ElementInfo getBossNassCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Boss Nass",
					new String[]{"Boss Nass"}, 
					"Boss Nass fut le dirigeant du peuple Gungan qui s'allia à la reine Amidala pendant la Bataille de Naboo, instaurant une paix durable entre les Naboo et les Gungans.",
					"",
					"bossnass",
					0,
					0,
					null,
					ElementColor.blue,
					"bossnass1",
					"bossnass2");
	}

	public static ElementInfo getLorSanTekkaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Lor San Tekka",
					new String[]{"Lor San Tekka"}, 
					"Lor San Tekka est un personnage affilié à la Résistance et vivant sur la planète Jakku au village de Tuanul.",
					"",
					"lorsantekka",
					0,
					0,
					null,
					ElementColor.blue,
					"lorsantekka1");
	}

	public static ElementInfo getEmberChankeliLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ember Chankeli",
					new String[]{"Ember Chankeli", "Ember"}, 
					"Humaine originaire de Telerath. Elle y gérait un club.",
					"",
					"emberchankeli",
					0,
					0,
					null,
					ElementColor.blue,
					"ember1");
	}

	public static ElementInfo getBeruWhitesunCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Beru Whitesun",
					new String[]{"Beru Whitesun", "Beru"}, 
					"Fermière de tatooine, épouse de Owen Lars et tante de Luke Skywalker.",
					"",
					"beruwhitesun",
					0,
					0,
					null,
					ElementColor.darkyellow,
					"logoberuwhitesun",
					"owenberu",
					"berumother",
					"beruold");
	}

	public static ElementInfo getFarnayClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Farnay",
					new String[]{"Farnay"}, 
					"Dévaronienne qui croisa le chemin de Luke peu de temps après la bataille de Yavin.",
					"",
					"farnay",
					0,
					0,
					null,
					ElementColor.blue,
					"farnay1");
	}

	public static ElementInfo getAphraClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Aphra",
					new String[]{"Aphra"}, 
					"Archéologue et experte technique, elle aida le Seigneur Vador dans sa quête pour trouver le responsable de la destruction de l'Etoile Noire.",
					"",
					"aphra",
					0,
					0,
					null,
					ElementColor.blue,
					"aphra1",
					"aphra2",
					"aphra3");
	}

	public static ElementInfo getJoraAstaneClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jora Astane",
					new String[]{"Jora Astane"}, 
					"Réfugiée en fuite d'Alderaan.",
					"",
					"jora",
					0,
					0,
					null,
					ElementColor.blue,
					"jora1");
	}

	public static ElementInfo getUwaPareeceClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Uwa Pareece",
					new String[]{"Uwa Pareece"}, 
					"Réfugiée en fuite d'Alderaan.",
					"",
					"uwa",
					0,
					0,
					null,
					ElementColor.blue,
					"uwa1",
					"uwa2");
	}

	public static ElementInfo getTaceClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tace",
					new String[]{"Tace"}, 
					"Réfugiée en fuite d'Alderaan et soeur de Tula.",
					"",
					"tace",
					0,
					0,
					null,
					ElementColor.blue,
					"tace1",
					"tace2");
	}

	public static ElementInfo getSarcoPlankClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sarco Plank",
					new String[]{"Sarco Plank"}, 
					"Alien vivant sur Devaron qui mena Luke Skywalker au Temple d'Eedit. ",
					"",
					"sarco",
					0,
					0,
					null,
					ElementColor.blue,
					"sarco1",
					"sarco2");
	}

	public static ElementInfo getOwenLarsClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Owen Lars",
					new String[]{"Owen Lars", "Owen"}, 
					"Fermier cultivateur d'humidité de Tatooine, époux de Beru Whitesun et oncle de Luke Skywalker.",
					"",
					"owenlarsclassic",
					0,
					0,
					null,
					ElementColor.red,
					"logoowenlars",
					"owenberu",
					"owen2");
	}

	public static ElementInfo getOwenLarsLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Owen Lars",
					new String[]{"Owen Lars", "Owen"}, 
					"Fermier cultivateur d'humidité de Tatooine, époux de Beru Whitesun et oncle de Luke Skywalker.",
					"",
					"owenlarslegends",
					0,
					0,
					null,
					ElementColor.red,
					"logoowenlars",
					"owenberu",
					"owen2");
	}

	public static ElementInfo getSebulbaCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sebulba",
					new String[]{"Sebulba"}, 
					"Dug de Mos Espa sur Tatooine, considéré par beaucoup comme le meilleur pilote de Podracer de son temps.",
					"",
					"sebulba",
					0,
					0,
					null,
					ElementColor.blue,
					"sebulba1",
					"sebulba2");
	}

	public static ElementInfo getWampaCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Wampa",
					new String[]{"Wampa"}, 
					"Terrible prédateur carnivore de la planète Hoth.",
					"",
					"wampa",
					0,
					0,
					null,
					ElementColor.blue,
					"wampa1",
					"wampa2");
	}

	public static ElementInfo getVoxynLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Voxyn",
					new String[]{"Voxyn"}, 
					"Créé par les Yuuzhan Vong, le voxyn fut une créature conçu pour traquer et tuer les Jedi.",
					"",
					"voxyn",
					0,
					0,
					null,
					ElementColor.blue,
					"voxyn1",
					"voxyn2");
	}

	public static ElementInfo getVaractylCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Varactyl",
					new String[]{"Varactyl"}, 
					"Le Varactyl est un reptile avien natif de la planète Utapau, utilisé comme monture.",
					"",
					"varactyl",
					0,
					0,
					null,
					ElementColor.blue,
					"varactyl1",
					"varactyl2");
	}

	public static ElementInfo getTauntaunCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tauntaun",
					new String[]{"Tauntaun"}, 
					"Herbivore bipédique originaire de Hoth.",
					"",
					"tauntaun",
					0,
					0,
					null,
					ElementColor.blue,
					"tauntaun1",
					"tauntaun2");
	}

	public static ElementInfo getShaakCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Shaak",
					new String[]{"Shaak"}, 
					"Animal herbivore paisible vivant sur Naboo, il est très apprécié pour sa chair.",
					"",
					"shaak",
					0,
					0,
					null,
					ElementColor.blue,
					"shaak1",
					"shaak2");
	}

	public static ElementInfo getSarlaccCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sarlacc",
					new String[]{"Sarlacc"}, 
					"Très vieille créature omnivore pouvant vivre plusieurs milliers d'années se tapissant dans les desert de Tatooine.",
					"",
					"sarlacc",
					0,
					0,
					null,
					ElementColor.blue,
					"sarlacc1",
					"sarlacc2");
	}

	public static ElementInfo getReekCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Reek",
					new String[]{"Reek"}, 
					"Le reek est un paisible herbivore à trois cornes pouvant se changer en féroce prédateur s'il se sent menacé.",
					"",
					"reek",
					0,
					0,
					null,
					ElementColor.blue,
					"reek1",
					"reek2");
	}

	public static ElementInfo getRancorCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Rancor",
					new String[]{"Rancor"}, 
					"Les rancors sont des prédateurs féroces originaires de la planète Dathomir. Pouvant mesurer de 5 à 10 mètres, armés de griffes et de crocs, ils sont néanmoins domesticables dans une certaine mesure.",
					"",
					"rancor",
					0,
					0,
					null,
					ElementColor.blue,
					"rancor1",
					"rancor2");
	}

	public static ElementInfo getRakghoulLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Rakghoul",
					new String[]{"Rakghoul"}, 
					"Créature mutante qui pullule dans les égoûts et bas-fonds de Taris. Créée à partir d'un corps hôte part le biais d'une maladie issue de la magie Sith. ",
					"",
					"rakghoul",
					0,
					0,
					null,
					ElementColor.blue,
					"rakghoul1",
					"rakghoul2");
	}

	public static ElementInfo getOpeeCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Opee",
					new String[]{"Opee"}, 
					"Créature marine géante de Naboo dotée d'une langue préhensile.",
					"",
					"opee",
					0,
					0,
					null,
					ElementColor.blue,
					"opee1",
					"opee2");
	}

	public static ElementInfo getColoCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Colo",
					new String[]{"Colo"}, 
					"Le Poisson Colo, ou Colo à griffe, est l'un des prédateurs les plus redoutés de la planète Naboo. Tout comme l'Aqua Sando, et l'Opee, il vit dans le Noyau planète. Mais contrairement à eux il préfère se terrer dans les cavernes les plus profondes.",
					"",
					"colo",
					0,
					0,
					null,
					ElementColor.blue,
					"colo1",
					"colo2");
	}

	public static ElementInfo getSandoCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sando",
					new String[]{"Sando"}, 
					"Originaire de la planète Naboo, l'Aqua Sando est la créature aquatique le plus impressionnante de la planète. Son habitat de prédilection reste le fond obscur des mers de la planète.",
					"",
					"sando",
					0,
					0,
					null,
					ElementColor.blue,
					"sando1",
					"sando2");
	}

	public static ElementInfo getNarglatchClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Narglatch",
					new String[]{"Narglatch"}, 
					"Prédateur furtifs vivant dans les plaines gelées d'Orto Plutonia.  ",
					"",
					"narglatch",
					0,
					0,
					null,
					ElementColor.blue,
					"narglatch1");
	}

	public static ElementInfo getFambaaCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Fambaa",
					new String[]{"Fambaa"}, 
					"Gigantesque amphibien pouvant être trouvé sur Naboo et Onderron.",
					"",
					"fambaa",
					0,
					0,
					null,
					ElementColor.blue,
					"fambaa1",
					"fambaa2");
	}

	public static ElementInfo getNerfLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nerf",
					new String[]{"Nerf"}, 
					"Mammifère herbivore originaire d'Alderaan. On peut le trouver aujourd'hui dans toute la galaxie.",
					"",
					"nerf",
					0,
					0,
					null,
					ElementColor.blue,
					"nerf1",
					"nerf2");
	}

	public static ElementInfo getNeekLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Neek",
					new String[]{"Neek"}, 
					"Petit reptile herbivore originaire d'Ambria.",
					"",
					"neek",
					0,
					0,
					null,
					ElementColor.blue,
					"neek1");
	}

	public static ElementInfo getOrbaliskLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Orbalisk",
					new String[]{"Orbalisk"}, 
					"Créature parasite toxique provenant de Dxun.",
					"",
					"orbalisk",
					0,
					0,
					null,
					ElementColor.blue,
					"orbalisk1",
					"darkbaneorb");
	}

	public static ElementInfo getNosLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nos",
					new String[]{"Nos"}, 
					"Cet animal est omnivore et provient de Dagobah. Ce reptile reste cependant un gastéropode hermaphrodite. ",
					"",
					"nos",
					0,
					0,
					null,
					ElementColor.blue,
					"nos1");
	}

	public static ElementInfo getTukataLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tuk'ata",
					new String[]{"Tuk'ata"}, 
					"Rare espèce animale sensible à la force originaire de Korriban. Ils furent employés comme chiens de guerre par les Sith durant l'Ancienne République. ",
					"",
					"tukata",
					0,
					0,
					null,
					ElementColor.blue,
					"tukata1",
					"tukata2");
	}

	public static ElementInfo getNunaCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nuna",
					new String[]{"Nuna"}, 
					"Le nuna fut un petit herbivore que l'on trouvait sur Naboo.",
					"",
					"nuna",
					0,
					0,
					null,
					ElementColor.blue,
					"nuna2",
					"nuna1");
	}

	public static ElementInfo getNexuCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nexu",
					new String[]{"Nexu"}, 
					"Puissant et agil carnivore vivant dans les forêts de Cholganna, sur le continent d'Indona.",
					"",
					"nexu",
					0,
					0,
					null,
					ElementColor.blue,
					"nexu3",
					"nexu1");
	}

	public static ElementInfo getMynockCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mynock",
					new String[]{"Mynock"}, 
					"Espèce animale parasite volante hélas trop bien connue des pilotes de cargos.",
					"",
					"mynock",
					0,
					0,
					null,
					ElementColor.blue,
					"mynock1",
					"mynock2");
	}

	public static ElementInfo getGundarkCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Gundark",
					new String[]{"Gundark"}, 
					"Les Gundarks sont des créatures très agressives que l'on trouve sur de nombreux mondes, notamment Naboo, Alaris Prime ou encore Vanqor.",
					"",
					"gundark",
					0,
					0,
					null,
					ElementColor.blue,
					"gundark1",
					"gundark2");
	}

	public static ElementInfo getExogorthCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Exogorth",
					new String[]{"Exogorth"}, 
					"Animal silicieux de très grande taille vivant dans le vide spatial et se réfugiant dans les astéroïdes.",
					"",
					"exogorth",
					0,
					0,
					null,
					ElementColor.blue,
					"exogorth1",
					"exogorth2");
	}

	public static ElementInfo getEopieCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Eopie",
					new String[]{"Eopie"}, 
					"Paisible quadrupède herbivore originaire de Tatooine utilisé comme bête de somme.",
					"",
					"eopie",
					0,
					0,
					null,
					ElementColor.blue,
					"eopie1",
					"eopie2");
	}

	public static ElementInfo getBanthaCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bantha",
					new String[]{"Bantha"}, 
					"Grand et paisible quadrupède herbivore à longs poils répandu dans l'essemble de la galaxie, un vrai mystère scientifique...",
					"",
					"bantha",
					0,
					0,
					null,
					ElementColor.blue,
					"bantha1",
					"bantha2");
	}

	public static ElementInfo getAiwhaCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Aiwha",
					new String[]{"Aiwha"}, 
					"Animal volant originaire de Kamino capable de voler et nager.",
					"",
					"aiwha",
					0,
					0,
					null,
					ElementColor.blue,
					"aiwha1",
					"aiwha2");
	}

	public static ElementInfo getAcklayCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Acklay",
					new String[]{"Acklay"}, 
					"L'acklay, originaire de Vendaxa, fut une féroce créature à six pattes utilisée dans de nombreuses arènes de jeux.",
					"",
					"acklay",
					0,
					0,
					null,
					ElementColor.blue,
					"acklay1",
					"acklay2");
	}

	public static ElementInfo getBeteZilloClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bête Zillo",
					new String[]{"Bête Zillo"}, 
					"La Bête Zillo était un animal très dangereux que l'on rencontrait sur Malastare, supposé éteint à la fin de l'Ancienne République.",
					"",
					"zillo",
					0,
					0,
					null,
					ElementColor.blue,
					"zillo1",
					"zillo2");
	}

	public static ElementInfo getDewbackCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dewback",
					new String[]{"Dewback"}, 
					"Le dewback est un grand reptile originaire de Tatooine, pouvant être apprivoisé.",
					"",
					"dewback",
					0,
					0,
					null,
					ElementColor.blue,
					"dewback1",
					"dewback2");
	}

	public static ElementInfo getDragonKraytCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dragon Krayt",
					new String[]{"Dragon Krayt"}, 
					"Féroces reptiles originaires de la planète désertique Tatooine.",
					"",
					"dragonkrayt",
					0,
					0,
					null,
					ElementColor.blue,
					"dragonkrayt1",
					"dragonkrayt2");
	}

	public static ElementInfo getMidichlorienLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Midi-chlorien",
					new String[]{"Midi-chlorien", "midi-chlorien", "midi-chloriens"}, 
					"Les midi-chloriens sont des symbiotes présents chez toutes les espèces organiques de la galaxie qui maintiennent leur lien avec la Force.",
					"",
					"midichlorienlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"midichlorien1");
	}

	public static ElementInfo getMidichlorienClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Midi-chlorien",
					new String[]{"Midi-chlorien", "midi-chlorien", "midi-chloriens"}, 
					"Les midi-chloriens sont des symbiotes présents chez toutes les espèces organiques de la galaxie qui maintiennent leur lien avec la Force.",
					"",
					"midichlorienclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"midichlorien1");
	}

	public static ElementInfo getMitederocheCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mite de roche",
					new String[]{"Mite de roche"}, 
					"Parasite courant digérant le métal et capable de créer des symbiotes.",
					"",
					"mite",
					0,
					0,
					null,
					ElementColor.blue,
					"mite1");
	}

	public static ElementInfo getKaaduCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kaadu",
					new String[]{"Kaadu"}, 
					"Créature herbivore provenant de Naboo et utilisé par les Gungans.",
					"",
					"kaadu",
					0,
					0,
					null,
					ElementColor.blue,
					"kaadu1",
					"kaadu2");
	}

	public static ElementInfo getVornskrLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Vornskr",
					new String[]{"Vornskr"}, 
					"Prédateur de Myrkr utilisant la Force pour traquer ses proies.",
					"",
					"vornskr",
					0,
					0,
					null,
					ElementColor.blue,
					"vornskr1",
					"vornskr2");
	}

	public static ElementInfo getBansheeClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Banshee",
					new String[]{"Banshee"}, 
					"Les Banshees sont des mammifères cartilagineux volants originaires de la brumeuse planète Umbara.",
					"",
					"banshee",
					0,
					0,
					null,
					ElementColor.blue,
					"banshee1");
	}

	public static ElementInfo getYsalamiriLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ysalamiri",
					new String[]{"Ysalamiri"}, 
					"Petits mammifères arboricoles originaires de la planète Myrkr, capables de repousser la Force de manière naturelle en créant une sorte de bulle anti-Force.",
					"",
					"ysalamiri",
					0,
					0,
					null,
					ElementColor.blue,
					"ysalamiri1",
					"ysalamiri2");
	}

	public static ElementInfo getDianogaCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dianoga",
					new String[]{"Dianoga"}, 
					"Créature charogniarde tentaculaire orginaire de la planète Vodran.",
					"",
					"dianoga",
					0,
					0,
					null,
					ElementColor.blue,
					"dianoga1",
					"dianoga2");
	}

	public static ElementInfo getTriumviratSithLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Organisation secrète Sith annexe de l'Empire Sith", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeants", "U", "Les Seigneurs Sith Dark Traya, Dark Sion et Dark Nihilus", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènements de fondation", "B", "Réunification des Sith en déroute, volonté d'en finir avec les Jedi", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènements de dissolution", "F", "Mort de Dark Traya, destruction de Malachor V", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Triumvirat Sith",
					new String[]{"Triumvirat Sith"}, 
					"Le Triumvirat Sith fut l'union des Seigneurs Sith Dark Traya, Dark Sion et Dark Nihilus qui se créa juste après la Guerre Civile des Jedi et qui faillit détruire à jamais l'Ordre Jedi.",
					"",
					"triumviratsith",
					-3955,
					-3951,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.yellow,
					"logotriumviratsith",
					"logodarktraya",
					"logodarknihilus",
					"logodarksion");
	}

	public static ElementInfo getEmpireInfiniLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Domination suprématique impérialiste", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeants", "U", "Haut responsable Skal'Nas...", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de fondation", "B", "Conquête de nombreux mondes", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènements de dissolution", "F", "Peste raciale envers les Rakata, soulèvement des esclaves", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Empire Infini",
					new String[]{"Empire Infini"}, 
					"L'Empire Infini fut fondé par les Rakatas et domina toute la galaxie bien avant l'avènement de la République. Sa chute fut le résultat d'une guerre civile et de la révolte générale des espèces assujettis.",
					"",
					"infinitempire",
					-30000,
					-25200,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.blue,
					"logoinfinityempire",
					"infiniteempire3",
					"architect1",
					"infiniteempire2",
					"revanfleet");
	}

	public static ElementInfo getGuildeduCommerceCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Guilde du Commerce",
					new String[]{"Guilde du Commerce"}, 
					"Organisation commerciale puissante réunissant plusieurs corporations d'extraction et de traitement de matières premières. ",
					"",
					"tradeguild",
					0,
					0,
					null,
					ElementColor.blue,
					"tradeguild1",
					"shumai2");
	}

	public static ElementInfo getFederationduCommerceClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Fédération du Commerce",
					new String[]{"Fédération du Commerce"}, 
					"Corporation commerciale la plus importante sous la République Galactique, elle dispose d'une armée complètement automatisée pour sa propre sécurité.",
					"",
					"tradefederationclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"tradefederation1",
					"nabooinvasion",
					"csi1");
	}

	public static ElementInfo getFederationduCommerceLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Fédération du Commerce",
					new String[]{"Fédération du Commerce"}, 
					"Corporation commerciale la plus importante sous l'Ancienne République, elle dispose d'une armée complètement automatisée pour sa propre sécurité.",
					"",
					"tradefederationlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"tradefederation1",
					"neimodian2",
					"nabooinvasion",
					"csi1");
	}

	public static ElementInfo getTechnoSyndicatClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Techno Syndicat",
					new String[]{"Techno Syndicat"}, 
					"Puissante organisation commerciale à la tête des plus grands constructeurs de vaisseaux tels que Sienar Systèmes, Haor Chall ainsi que Backtoid Armor.",
					"",
					"technosyndicatclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"technosyndicat1");
	}

	public static ElementInfo getTechnoSyndicatLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Techno Syndicat",
					new String[]{"Techno Syndicat"}, 
					"Puissante organisation commerciale à la tête des plus grands constructeurs de vaisseaux tels que Sienar Systèmes, Haor Chall ainsi que Backtoid Armor. ",
					"",
					"technosyndicatlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"technosyndicat1");
	}

	public static ElementInfo getJediAltisiensLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Faction renégate de l'Ordre Jedi", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeant", "U", "Djinn Altis", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de fondation", "B", "Scission dans l'Ordre Jedi", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènement de dissolution", "F", "Ordre 66, avènement de l'Empire", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jedi Altisiens",
					new String[]{"Jedi Altisiens"}, 
					"Les Jedi Altisiens sont un groupe de Jedi dirigés par le Maître Djinn Altis qui évoluent en dehors des contraintes de l'Ordre Jedi. Contrairement à l'ensemble des individus appartenant à l'Ordre Jedi, les Altisiens ne sont pas tous sensibles à la Force.",
					"",
					"jedialtisien",
					-40,
					-19,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.blue,
					"jedialtisien");
	}

	public static ElementInfo getPotentiumLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Mouvement de pensée", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeant", "U", "Leor Hal", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de fondation", "B", "Scission dans l'Ordre Jedi", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Potentium",
					new String[]{"Potentium"}, 
					"La Force Unifiée était la facette de la Force qui englobait l'espace et le temps, dont le Potentium était une déviation.",
					"",
					"potentium",
					0,
					0,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2}, 
					ElementColor.blue,
					"potentium");
	}

	public static ElementInfo getRevanchismeLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Autre nom", "e", "Croisés Jedi", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Type de régime", "e", "Faction renégate de l'Ordre Jedi", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Dirigeants", "U", "Revan, Malak", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènement de fondation", "B", "Scission dans l'Ordre Jedi pour lutter contre l'invasion mandalorienne", "");
		DescriptionItem lDescriptionItem4 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem4.init("Evènement de dissolution", "F", "Fin des guerres mandaloriennes", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Revanchisme",
					new String[]{"Revanchisme"}, 
					"Fondée par le mystérieux Chevalier Jedi Revan, elle permit d'abord à certains Jedi de militer contre la progression des clans Mandaloriens. Mais lorsque les Guerres Mandaloriennes éclatèrent, les Revanchistes prirent les armes contre les Mandaloriens, allant à l'encontre de la décision du Haut Conseil de l'Ordre. ",
					"",
					"revanchism",
					-3964,
					-3960,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3, 
						lDescriptionItem4}, 
					ElementColor.yellow,
					"revanchism1",
					"mandalorianwar2",
					"revanmandowar",
					"revanmalak");
	}

	public static ElementInfo getPacteJediLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Société secrête Jedi", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeants", "U", "Krynda Draay, Haazen", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de fondation", "B", "Empécher le retour des Sith", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènement de dissolution", "F", "Démentellement du Pacte par l'Ordre Jedi", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Pacte Jedi",
					new String[]{"Pacte Jedi"}, 
					"Le Pacte Jedi, également appellé l'Alliance Jedi, est une organisation secrète interne à l'Ordre Jedi afin d'empécher le retour des Sith. ",
					"",
					"pactejedi",
					-3995,
					-3963,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.yellow,
					"logojediorder",
					"jedicovenant1",
					"zaynesith");
	}

	public static ElementInfo getOrdreSithClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ordre Sith",
					new String[]{"Ordre Sith"}, 
					"L'Ordre Sith est une organisation d'utilisateurs de la Force voués au Côté Obscur et opposés à l'Ordre Jedi, dont les origines remontent aussi loin que les Jedi eux-mêmes.",
					"",
					"sithorderclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"logogoldenage",
					"hyperespacewar3",
					"palpatineorder66",
					"galacticempire3");
	}

	public static ElementInfo getOrdreSithLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ordre Sith",
					new String[]{"Ordre Sith"}, 
					"L'Ordre Sith est une organisation d'utilisateurs de la Force voués au Côté Obscur et opposés à l'Ordre Jedi, dont les origines remontent à l'Ancienne République.",
					"",
					"sithorderlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"logogoldenage",
					"jediexile",
					"hyperespacewar2",
					"krath3",
					"revanbastila",
					"greatgalacticwar4",
					"newsithwars2",
					"palpatineorder66",
					"darkcaedus2");
	}

	public static ElementInfo getPremierOrdreClassic() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Impérialisme totalitaire", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeant", "U", "Chef Suprême Snoke", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Premier Ordre",
					new String[]{"Premier Ordre"}, 
					"Faction militaire créée des cendres de l'Empire Galactique de Palpatine suite à la débacle de la Guerre Civile Galactique et de la Concordance Galactique.",
					"",
					"firstorder",
					5,
					Integer.MAX_VALUE,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1}, 
					ElementColor.blue,
					"firstorder1",
					"firstorder2",
					"starkillerstation2");
	}

	public static ElementInfo getChevaliersdeRenClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Chevaliers de Ren",
					new String[]{"Chevaliers de Ren"}, 
					"Groupuscule du côté Obscur. Les Chevaliers de Ren furent dirigés par Kylo Ren durant la guerre entre le Premier Ordre et la Résistance. ",
					"",
					"renknight",
					0,
					0,
					null,
					ElementColor.blue,
					"renknight1",
					"renknight2");
	}

	public static ElementInfo getResistanceClassic() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Organisation militaire constitutionnelle", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeant", "U", "Leia Organa", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Résistance",
					new String[]{"Résistance"}, 
					"Organisation militaire qui succéda à l'Alliance Rebelle dans le but de s'opposer l'Empire du Premier Ordre.",
					"",
					"resistance",
					10,
					Integer.MAX_VALUE,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1}, 
					ElementColor.purple,
					"logoresistance",
					"resistance1");
	}

	public static ElementInfo getAllianceRebelleClassic() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Organisation militaire constitutionnelle", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeants", "U", "Chef d'Etat Mon Mothma", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de fondation", "B", "Résistance envers l'Empire Galactique", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Alliance Rebelle",
					new String[]{"Alliance Rebelle"}, 
					"L'Alliance pour restaurer la République fut un mouvement d'opposition à Palpatine et à son Empire Galactique.",
					"La Rébellion était un mouvement d'opposition à Palpatine et son à Empire Galactique. Sur le plan politique, l'Empire assimila toujours l'Alliance soit à un mouvement anarchiste visant à instaurer le chaos général au service d'intérets nébuleux, soit à un mouvement analogue à la Confédération des Systèmes Indépendants de triste mémoire.",
					"rebelallianceclassic",
					-2,
					4,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2}, 
					ElementColor.purple,
					"logorebelalliance",
					"rebelposter");
	}

	public static ElementInfo getAllianceRebelleLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Autre nom", "e", "Alliance pour la Restauration de la République", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Type de régime", "e", "Organisation militaire constitutionnelle", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Dirigeants", "U", "Chef d'Etat Mon Mothma", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènement de fondation", "B", "Résistance envers l'Empire Galactique, Traité de Corellia", "");
		DescriptionItem lDescriptionItem4 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem4.init("Evènement de dissolution", "F", "Bataille d'Endor, instauration d'une nouvelle République", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Alliance Rebelle",
					new String[]{"Alliance Rebelle"}, 
					"L'Alliance pour restaurer la République fut un mouvement d'opposition à Palpatine et à son Empire Galactique.",
					"La Rébellion était un mouvement d'opposition à Palpatine et son à Empire Galactique. Sur le plan politique, l'Empire assimila toujours l'Alliance soit à un mouvement anarchiste visant à instaurer le chaos général au service d'intérets nébuleux, soit à un mouvement analogue à la Confédération des Systèmes Indépendants de triste mémoire.",
					"rebelalliancelegends",
					-2,
					4,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3, 
						lDescriptionItem4}, 
					ElementColor.purple,
					"logorebelalliance",
					"palpatinestarkiller",
					"yavin2",
					"rebelposter");
	}

	public static ElementInfo getOrdreJediClassic() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Dirigeants", "U", "Haut Conseil Jedi", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Evènements de dissolution", "F", "Ordre 66, Grande Purge Jedi", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ordre Jedi",
					new String[]{"Ordre Jedi"}, 
					"L'Ordre Jedi est un groupe constitué d'individus sensibles à la Force, dirigés par un Conseil Jedi, dont la création remonte à plusieurs millénaires sous la République Galactique.",
					"",
					"jediorderclassic",
					-2000,
					-19,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1}, 
					ElementColor.green,
					"logojediorder",
					"jedicouncil",
					"jediorder1");
	}

	public static ElementInfo getOrdreJediLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Dirigeants", "U", "Grand maître Satele Shan, Yoda, Haut Conseil Jedi...", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Evènement de fondation", "B", "Fin des guerres de la Force", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de dissolution", "F", "Ordre 66, Grande Purge Jedi", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ordre Jedi",
					new String[]{"Ordre Jedi"}, 
					"L'Ordre Jedi est un groupe constitué d'individus sensibles à la Force, dirigés par un Conseil Jedi, dont la création remonte à plusieurs dizaines de millénaires.",
					"",
					"jediorderlegends",
					-25783,
					-19,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2}, 
					ElementColor.green,
					"logojediorder",
					"firstgreatschism2",
					"jediexile",
					"hyperespacewar2",
					"krath3",
					"mandalorianwar2",
					"greatgalacticwar5",
					"newsithwars2",
					"palpatineorder66",
					"jedicouncil",
					"jediorder1");
	}

	public static ElementInfo getNouvelOrdreJediLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Dirigeants", "U", "Grand maître Luke Skywalker, Kenth Hamner, Haut Conseil Jedi...", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Evènement de fondation", "B", "Volonté de Luke Skywalker de réinstaurer l'Ordre Jedi", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nouvel Ordre Jedi",
					new String[]{"Nouvel Ordre Jedi"}, 
					"Le Nouvel Ordre Jedi fut fondé par Luke Skywalker sous la Nouvelle République, afin de défendre la paix galactique.",
					"",
					"newjediorder",
					11,
					Integer.MAX_VALUE,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1}, 
					ElementColor.green,
					"logonewjediorder",
					"newjediorder1",
					"newjediorder2",
					"newjediorder4");
	}

	public static ElementInfo getNouvelOrdreJediClassic() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Dirigeants", "U", "Grand maître Luke Skywalker", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Evènement de fondation", "B", "Volonté de Luke Skywalker de réinstaurer l'Ordre Jedi", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nouvel Ordre Jedi",
					new String[]{"Nouvel Ordre Jedi"}, 
					"Le Nouvel Ordre Jedi fut fondé par Luke Skywalker sous la Nouvelle République, afin de défendre la paix galactique. L'Ordre fut brisé quand Ben Solo le trahissa au profit du Premier Ordre.",
					"",
					"newjediorderclassic",
					0,
					0,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1}, 
					ElementColor.green,
					"logonewjediorder",
					"newjediorder1");
	}

	public static ElementInfo getCoalitionJediLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Dirigeants", "U", "Grand maître Luke Skywalker", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Evènement de fondation", "B", "Volonté de ramener la paix entre l'Alliance Galactique et la Confédération et destituer Dark Caedus", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Coalition Jedi",
					new String[]{"Coalition Jedi"}, 
					"La Coalition Jedi était dirigée par Luke Skywalker et constituait la troisième puissance gouvernementale et militaire au cours de la Seconde Guerre Civile Galactique.",
					"",
					"jedicoalition",
					40,
					41,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1}, 
					ElementColor.purple,
					"logonewjediorder",
					"jedicoalition1");
	}

	public static ElementInfo getCartelHypercomLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Cartel Hypercom.",
					new String[]{"Cartel Hypercom.", "Cartel des Hypercommunications"}, 
					"Cartel adhéré au conglomérat de la C. S. I. dans le seul but de créer un concurrent direct de l'Holonet.",
					"",
					"hypercomcartellegends",
					0,
					0,
					null,
					ElementColor.blue,
					"ponudo1");
	}

	public static ElementInfo getCartelHypercomClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Cartel Hypercom.",
					new String[]{"Cartel Hypercom.", "Cartel des Hypercommunications"}, 
					"Cartel adhéré au conglomérat de la C. S. I. dans le seul but de créer un concurrent direct de l'Holonet.",
					"",
					"hypercomcartelclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"ponudo1");
	}

	public static ElementInfo getAllianceGalactiqueLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Autre nom", "C", "Alliance Galactique", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Type de régime", "e", "Fédération indépendantiste militaire", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Dirigeants", "U", "Chefs d'Etat Cal Omas, Natasi Daala, Jacen Solo, Duumvirat, Triumvirats divers...", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènement de fondation", "B", "Incapacité à la Nouvelle République de contrer les Yuuzhan'Vong", "");
		DescriptionItem lDescriptionItem4 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem4.init("Evènements de dissolution", "F", "Bataille Caamas, complot Sith usant du Nouvel Empire Galactique", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Alliance Galactique",
					new String[]{"Alliance Galactique", "Fédération Galactique des Alliances Libres", "AG"}, 
					"La Fédération Galactique des Alliances Libres fut le gouvernement qui succéda à la Nouvelle République pendant la guerre contre les Yuuzhan Vong.",
					"",
					"galacticalliance",
					28,
					130,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3, 
						lDescriptionItem4}, 
					ElementColor.blue,
					"logofgal",
					"vongwars3",
					"galacticalliancetrooper",
					"darkcaedus2",
					"garstazi2");
	}

	public static ElementInfo getConsortiumdeHapesLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Consortium de Hapes",
					new String[]{"Consortium de Hapes"}, 
					"Gouvernement matriarcal indépendant et riche situé dans l'Amas de Hapes.",
					"",
					"consortiumhapes",
					0,
					0,
					null,
					ElementColor.green,
					"hapesconsortium1",
					"hapesconsortium2");
	}

	public static ElementInfo getKrathLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Société secrête dictatoriale", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeants", "U", "Satal Keeto et Aleema Keto", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènements de fondation", "B", "Découverte d'arctefacts Sith par Satal et Aleema Keto, rencontre avec l'esprit de Freedon Nadd", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènements de dissolution", "F", "Supernova du secteur Cron, exil de Qel-Droma, mort physique d'Exar Kun, mort d'Aleema Keto", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Krath",
					new String[]{"Krath"}, 
					"Le Krath est une société secrète réunissant au départ des jeunes gens riches et corrompus du Système de l'Impératrice Téta qui s'emparèrent du pouvoir dans ce système et qui s'allièrent aux Sith durant la Grande Guerre Sith.",
					"",
					"krath",
					-3998,
					-3995,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.yellow,
					"logokrath",
					"krath2",
					"denebabattle",
					"krath3");
	}

	public static ElementInfo getTribuperduedesSithLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Dirigeant", "U", "Cercle des Seigneurs Sith", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tribu perdue des Sith",
					new String[]{"Tribu perdue des Sith"}, 
					"Fondée par une souche à dominante humaine de marchands issus de l'Ancien Empire Sith, la Tribu Perdue des Sith s'imposa comme le groupe Sith majeur au lendemain de la Seconde Guerre Civile Galactique.",
					"",
					"losttribe",
					-5000,
					44,
					new DescriptionItem[]{
						lDescriptionItem0}, 
					ElementColor.yellow,
					"losttribe",
					"vestarakhai2");
	}

	public static ElementInfo getMandaloriensLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mandaloriens",
					new String[]{"Mandaloriens"}, 
					"Les Mandaloriens sont des combattants formant un peuple unis par une même culture, dont la capitale est Mandalore.",
					"",
					"mandalorian",
					0,
					0,
					null,
					ElementColor.blue,
					"mando1",
					"taung2",
					"krath3",
					"mandalorianwar2",
					"deathwatch3",
					"mandowedding",
					"mandoarmor",
					"basilisk1",
					"newmandalore1");
	}

	public static ElementInfo getNouvelEmpireSithLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Dirigeants", "U", "Seigneur Noir des Sith Dark Ruin, Dark Underlord, Dark Rivan", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Evènement de fondation", "B", "Ralliment des Sith par Dark Ruin, un ancien Jedi", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de dissolution", "F", "Guerres intestines après l'assassinat du dernier Seigneur Sith Belia Darzu", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nouvel Empire Sith",
					new String[]{"Nouvel Empire Sith"}, 
					"Créé par un ancien Jedi, cette immense organisation qui se veut succéder à l'Ancien Empire Sith Reconstitué du Seigneur Sith Vitiate fut l'instigateur des nouvelles guerres Sith. ",
					"",
					"newsithempire",
					-2000,
					-1010,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2}, 
					ElementColor.purple,
					"logonewsithempire",
					"darkbrotherhood2",
					"thoughtbomb");
	}

	public static ElementInfo getNouvelEmpireGalactiqueLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Autres noms", "C", "Empire Fel, Second Empire Galactique", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Type de régime", "e", "Impérialisme traditionnel héréditaire", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Dirigeants", "U", "Empereur Jagged Fel, Roan Fel, Fel II, Conseil des Moffs", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènements de fondation", "B", "Volonté d'instaurer la paix et la justice, rompre avec l'image véhiculée durant le Premier Empire Galactique de Palpatine", "");
		DescriptionItem lDescriptionItem4 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem4.init("Evènement de dissolution", "F", "Coup d'état de Dark Krayt, exil de l'Empereur légitime Roan Fel", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nouvel Empire Galactique",
					new String[]{"Nouvel Empire Galactique"}, 
					"Gouvernement instigué par Jagged Fel qui succéda aux Vestiges Impériaux après la guerre contre les Yuuzhan Vong. Prônant la doctrine de -La victoire sans la guerre-. ",
					"",
					"newgalacticempire",
					44,
					130,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3, 
						lDescriptionItem4}, 
					ElementColor.blue,
					"logonewgalacticempire",
					"jaggedjaina",
					"roanfel2",
					"moffcouncil2",
					"imperialknight1",
					"felfleet1",
					"kraytcome");
	}

	public static ElementInfo getSithUniqueLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Dirigeant", "U", "Seigneur Noir des Sith Dark Krayt", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Evènement de fondation", "B", "Vision de Dark Krayt d'un Ordre Sith unifié", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sith Unique",
					new String[]{"Sith Unique", "Nouvel Ordre Sith"}, 
					"Fondé en 30 ap. BY par Dark Krayt, cette nouvelle idéologie renie celle établie par Dark Bane plus de 1 000 ans auparavant. Il n'y aura plus deux Siths, mais l'Ordre Sith lui même.   ",
					"",
					"onesith",
					30,
					139,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1}, 
					ElementColor.green,
					"logoonesith",
					"kraytobiwan",
					"kraytcome",
					"kraytbetrayal");
	}

	public static ElementInfo getSecondEmpireSithLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Autres noms", "C", "Ancien Empire Sith Reconstitué, Empire Sith", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Type de régime", "e", "Militaire impérialiste imprégné d'une culture Sith", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Dirigeants", "U", "Empereur des Sith Vitiate, Conseil Obscur", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènements de fondation", "B", "Découverte de Dromund Kaas, vengeance envers la Répubique", "");
		DescriptionItem lDescriptionItem4 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem4.init("Evènement de dissolution", "F", "Invasion de l'Empire Eternel", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Second Empire Sith",
					new String[]{"Second Empire Sith", "Ancien Empire Sith reconstitué", "second Empire Sith", "Ancien Empire Sith Reconstitué"}, 
					"L'Ancien Empire Sith Reconstitué fut créé par le Seigneur Noir des Sith Vitiate sur Dromund Kaas suite à la débacle de Naga Sadow durant la Grande Guerre de l'Hyperespace. ",
					"",
					"oldsithempirerebuild",
					-4970,
					-3639,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3, 
						lDescriptionItem4}, 
					ElementColor.purple,
					"logooldsithempirerebuild",
					"dromundkaas2",
					"greatgalacticwar1",
					"mandalorianwar2",
					"revanmalakvitiate",
					"greatgalacticwar4",
					"greatgalacticwar5",
					"eternalthrone");
	}

	public static ElementInfo getAncienEmpireSithLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Fédération monarchique Sith", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeants", "U", "Seigneurs Noirs des Sith Simus, Marka Ragnos, Naga Sadow...", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènements de fondation", "B", "Exil des Jedi Noirs (XoXaan, Karness Muur, Ajunta Pall...) sur Korriban, assouvissement de la race Sith pour en devenir ses seigneurs", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènement de dissolution", "F", "Défaite lors de la Grande guerre de l'Hyperespace", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ancien Empire Sith",
					new String[]{"Ancien Empire Sith"}, 
					"L'Empire Sith était un vaste empire érigé par les Jedi sombres exilés de la République et la civilisation Sith pré-existantes.",
					"",
					"oldsithempire",
					-6900,
					-5000,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.purple,
					"logooldsithempire",
					"jediexile",
					"korriban3",
					"hyperespacewar3",
					"greatgalacticwar1",
					"dromundkaas2");
	}

	public static ElementInfo getVestigesdelEmpireLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Impérialisme traditionnel", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeants", "U", "Gilad Pellaeon, Conseil des Moffs...", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de fondation", "B", "Unification des forces des seigneurs de guerres impériaux", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènement de dissolution", "F", "Restructuration en Nouvel Empire Galactique", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Vestiges de l'Empire",
					new String[]{"Vestiges de l'Empire"}, 
					"Les Vestiges de l'Empire fut le gouvernement constitué à partir des dernières factions de l'Empire Galactique.",
					"",
					"remnantempire",
					12,
					44,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.purple,
					"logogalacticempire",
					"impbattle",
					"pellaeonpeace");
	}

	public static ElementInfo getEmpiredeRevanLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Monarchie Sith", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeants", "U", "Seigneur Noir des Sith Dark Revan et son apprenti Dark Malak", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de fondation", "B", "Corruption de Revan et Malak par l'Empereur des Sith Vitiate, découverte de la Forge Stellaire", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènement de dissolution", "F", "Bataille de la Forge Stellaire, mort de Dark Malak", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Empire de Revan",
					new String[]{"Empire de Revan", "Empire de Dark Revan"}, 
					"Empire Sith créé par Dark Revan. Son armée créée par la forge stellaire affronta la République lors de la Guerre Civile des Jedi.",
					"",
					"revanempire",
					-3959,
					-3956,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.purple,
					"logorevanempire",
					"revanemperor",
					"revanmalakvitiate",
					"revanfleet",
					"starforgebattle");
	}

	public static ElementInfo getEmpiredelaMainLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Impérialisme totalitaire", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeants", "U", "Grand Amiral Thrawn", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de fondation", "B", "Protéger l'espace Chiss et l'Empire Galactique des menaces extérieures des régions inconnues", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Empire de la Main",
					new String[]{"Empire de la Main"}, 
					"Territoire colossal des Régions Inconnues unifié par Thrawn et ses alliés.",
					"",
					"handempire",
					-19,
					22,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2}, 
					ElementColor.purple,
					"logohandempire",
					"thrawn3");
	}

	public static ElementInfo getEmpireGalactiqueClassic() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Impérialisme totalitaire fasciste", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeants", "U", "Empereur Palpatine", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènements de fondation", "B", "Avênement de l'Ordre Sith (après 1000 ans de silence), purge Jedi", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènements de dissolution", "F", "Bataille d'Endor, mort de Palpatine", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Empire Galactique",
					new String[]{"Empire Galactique"}, 
					"L'Empire Galactique est un régime autoritaire et militariste fondé par Palpatine à l'issue de la Guerre des Clones, sur les cendres de la République Galactique et de l'Ordre Jedi.",
					"L'Empire Galactique est un régime autoritaire et militariste fondé par Palpatine à l'issue de la Guerre des Clones, sur les cendres de la République Galactiqu.et de l'Ordre Jedi. l'Empire est un régime qui se veut, à l'origine, la solution à l'injustice et la corruption régnantes. Mais l'impérialisation ne s'avère être qu'un masque dissimulant une véritable politique de conquête basée sur la brutalité et la terreur inspirée par l'armée impériale.",
					"galacticempireclassic",
					-19,
					5,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.blue,
					"logogalacticempire",
					"palpatineorder66",
					"ghostcrew4",
					"deathstar22",
					"jakku2",
					"imperialcouncil",
					"imperialposter");
	}

	public static ElementInfo getEmpireGalactiqueLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Impérialisme totalitaire fasciste", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeants", "U", "Empereur Palpatine", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènements de fondation", "B", "Avênement de l'Ordre Sith (après 1000 ans de silence), purge Jedi", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènement de dissolution", "F", "Restructuration en Empire des Ténèbres", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Empire Galactique",
					new String[]{"Empire Galactique"}, 
					"L'Empire Galactique est un régime autoritaire et militariste fondé par Palpatine à l'issue de la Guerre des Clones, sur les cendres de la République Galactique et de l'Ordre Jedi. Il restera à travers les âges comme l'une des plus grandes puissances ayant jamais existées.",
					"L'Empire Galactique est un régime autoritaire et militariste fondé par Palpatine à l'issue de la Guerre des Clones, sur les cendres de la République Galactique et de l'Ordre Jedi. l'Empire est un régime qui se veut, à l'origine, la solution à l'injustice et la corruption régnantes. Mais l'impérialisation ne s'avère être qu'un masque dissimulant une véritable politique de conquête basée sur la brutalité et la terreur inspirée par l'armée impériale.",
					"galacticempire",
					-19,
					10,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.blue,
					"logogalacticempire",
					"palpatineorder66",
					"imperialposter",
					"imperialcouncil",
					"galacticempire1",
					"imperialforce");
	}

	public static ElementInfo getNouvelleRepubliqueLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Démocratie fédérale parlementaire", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeants", "U", "Chef d'Etat Mon Mothma, Leia Organa, Cal Omas...", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènements de fondation", "B", "Prise de Coruscant par l'Alliance Rebelle, dislocation de l'Empire Galactique", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènement de dissolution", "F", "Restructuration en Fédération Galactique des Alliances Libres", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nouvelle République",
					new String[]{"Nouvelle République"}, 
					"La Nouvelle République est le gouvernement démocratique qui succéda à l'Alliance Rebelle. Elle sera restructurée en 28 ap. BY.",
					"",
					"newrepublic",
					4,
					28,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.blue,
					"logonewrepublic",
					"newrepublic2");
	}

	public static ElementInfo getNouvelleRepubliqueClassic() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Démocratie fédérale parlementaire", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Evènement de dissolution", "F", "Restructuration en Fédération Galactique des Alliances Libres", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nouvelle République",
					new String[]{"Nouvelle République"}, 
					"La Nouvelle République est le gouvernement démocratique qui succéda à l'Alliance Rebelle.",
					"",
					"newrepublicclassic",
					4,
					36,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1}, 
					ElementColor.blue,
					"newrepublicclassic1",
					"newrepublic2");
	}

	public static ElementInfo getRepubliqueGalactiqueClassic() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Démocratie fédérale parlementaire", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeants", "U", "Finis Valorum, Sheev Palpatine...", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de fondation", "B", "Constitution galactique ratifiée par Coruscant, Alderaan et Corellia", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènement de dissolution", "F", "Avènement de l'Empire Galactique par Dark Sidious", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"République Galactique",
					new String[]{"République Galactique", "Ancienne République Galactique", "Ancienne République"}, 
					"La République Galactique fut un gouvernement démocratique qui a régit la galaxie pendant près de 1 000 ans. Elle fut remplacée par l'Empire Galactique de Dark Sidious en 19 av. BY. ",
					"",
					"galacticrepublicclassic",
					-1000,
					-19,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.blue,
					"logooldrepublic",
					"oldrepublic2",
					"jediorder1");
	}

	public static ElementInfo getRepubliqueGalactiqueLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Démocratie fédérale parlementaire", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeants", "U", "Chanceliers suprêmes Kalpana, Finis Valorum, Sheev Palpatine...", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de fondation", "B", "Constitution galactique ratifiée par Coruscant, Alderaan, Chandrilla et Corellia", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènement de dissolution", "F", "Avènement de l'Empire Galactique par Dark Sidious", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"République Galactique",
					new String[]{"République Galactique", "Ancienne République", "Ancienne République Galactique", "ancienne République"}, 
					"La République Galactique fut un gouvernement démocratique qui a régit la galaxie pendant près de 25 000 ans. Créée à partir d'un conglomérat de quatres planètes et renversé au profit d'un Empire.",
					"",
					"galacticrepubliclegends",
					-25053,
					-19,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.blue,
					"logooldrepublic",
					"oldrepublic2",
					"jediorder1",
					"hyperespacewar2",
					"nabooinvasion",
					"repbattle");
	}

	public static ElementInfo getDeathWatchClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Death Watch",
					new String[]{"Death Watch"}, 
					"Organisation mercenaire qui prône une Mandalore grande et puissante, créée par Pre Vizsla.",
					"",
					"deathwatchclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"deathwatch1",
					"deathwatch2");
	}

	public static ElementInfo getDeathWatchLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Death Watch",
					new String[]{"Death Watch"}, 
					"Organisation mercenaire qui prône une Mandalore grande et puissante, créée par Tor Vizsla.",
					"",
					"deathwatchlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"deathwatch1",
					"deathwatch3");
	}

	public static ElementInfo getCzerkaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Czerka",
					new String[]{"Czerka"}, 
					"La Corporation Czerka fut une entreprise amorale très répandue et très influente durant l'ère de l'Ancienne République.",
					"",
					"czerkalegends",
					0,
					0,
					null,
					ElementColor.blue,
					"czerka1");
	}

	public static ElementInfo getCzerkaClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Czerka",
					new String[]{"Czerka"}, 
					"La Corporation Czerka fut une entreprise amorale très répandue et très influente durant l'ère de la République Galactique.",
					"",
					"czerkaclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"czerka1");
	}

	public static ElementInfo getCSIClassic() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Autres noms", "C", "Confédération des Systèmes Indépendants, Alliance Séparatiste", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Type de régime", "e", "Regroupement corporatif d'intérets militaires et commerciales", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Dirigeants", "U", "Dark Tyranus, Dark Sidious (Chancelier Suprême Palpatine), Conseil Séparatiste, Général Grievous", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènement de fondation", "B", "Sécession au sein de la République, surélévation des taxes commerciales", "");
		DescriptionItem lDescriptionItem4 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem4.init("Evènement de dissolution", "F", "Massacre de Mustafar, démentellement de l'armée séparatiste", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"C. S. I.",
					new String[]{"C. S. I.", "Confédération des Systèmes Indépendants"}, 
					"La Confédération des Systèmes Indépendants est un mouvement séparatiste, composé majoritairement de grands groupes industriels et de systèmes souhaitant leur indépendance, créé de toute pièce par Dark Sidious et son apprenti Dark Tyranus afin de mettre en déroute la République Galactique.",
					"",
					"csiclassic",
					-24,
					-19,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3, 
						lDescriptionItem4}, 
					ElementColor.purple,
					"logocsi",
					"separatistcouncil",
					"geonosisbattle",
					"mustafarmassacre");
	}

	public static ElementInfo getCSILegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Autres noms", "C", "Confédération des Systèmes Indépendants, Alliance Séparatiste", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Type de régime", "e", "Regroupement corporatif d'intérets militaires et commerciales", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Dirigeants", "U", "Dark Tyranus, Dark Sidious (Chancelier Suprême Palpatine), Conseil Séparatiste, Général Grievous", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènement de fondation", "B", "Sécession au sein de la République, surélévation des taxes commerciales", "");
		DescriptionItem lDescriptionItem4 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem4.init("Evènement de dissolution", "F", "Massacre de Mustafar, démentellement de l'armée séparatiste", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"C. S. I.",
					new String[]{"C. S. I.", "Confédération des Systèmes Indépendants"}, 
					"La Confédération des Systèmes Indépendants est un mouvement séparatiste, composé majoritairement de grands groupes industriels et de systèmes souhaitant leur indépendance, créé de toute pièce par Dark Sidious et son apprenti Dark Tyranus afin de mettre en déroute la République Galactique.",
					"",
					"csilegends",
					-24,
					-19,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3, 
						lDescriptionItem4}, 
					ElementColor.purple,
					"logocsi",
					"nabooinvasion",
					"separatistcouncil",
					"geonosisbattle",
					"mustafarmassacre");
	}

	public static ElementInfo getConfreriedesTenebresLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Dirigeant", "U", "Seigneur Noir Skere Kaan", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Evènement de fondation", "B", "Unification des Seigneurs Sith par Kaan", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de dissolution", "F", "Septième bataille de Ruusan, mort de Skere Kaan", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Confrérie des Ténèbres",
					new String[]{"Confrérie des Ténèbres"}, 
					"Groupuscule Sith fondé et dirigé par le Seigneur Kaan pendant les Nouvelles Guerres Sith. La confrérie succéda la débacle des Sith face à la République.",
					"",
					"confrerietenebres",
					-1010,
					-1000,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2}, 
					ElementColor.purple,
					"logodarkbrotherhood",
					"kaan2",
					"thoughtbomb");
	}

	public static ElementInfo getClanBancaireClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Clan Bancaire",
					new String[]{"Clan Bancaire", "Clan Bancaire Intergalactique", "Clan Bancaire InterGalactique"}, 
					"Organisation commerciale ralliée au mouvement séparatiste.",
					"",
					"clanbancaireclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"sanhill1");
	}

	public static ElementInfo getClanBancaireLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Clan Bancaire",
					new String[]{"Clan Bancaire", "Clan Bancaire Intergalactique", "Clan Bancaire InterGalactique"}, 
					"Organisation commerciale ralliée au mouvement séparatiste.",
					"",
					"clanbancairelegends",
					0,
					0,
					null,
					ElementColor.blue,
					"sanhill1",
					"mustafarmassacre");
	}

	public static ElementInfo getBaktoidArmorClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Baktoid Armor",
					new String[]{"Baktoid Armor"}, 
					"Baktoid Armor Workshop fut le plus gros fabricant de droïdes et de véhicules de la Confédération des Systèmes Indépendants durant la Guerre des Clones.",
					"",
					"baktoiarmorclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"baktoid1");
	}

	public static ElementInfo getBaktoidArmorLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Baktoid Armor",
					new String[]{"Baktoid Armor"}, 
					"Baktoid Armor Workshop fut le plus gros fabricant de droïdes et de véhicules de la Confédération des Systèmes Indépendants durant la Guerre des Clones.",
					"",
					"baktoiarmorlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"baktoid1");
	}

	public static ElementInfo getAllianceIntercoorpCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Alliance Intercoorp.",
					new String[]{"Alliance Intercoorp.", "Alliance InterCorporation"}, 
					"Puissante organisation commerciale de holding, d'achats et reventes d'entreprises. Elle est basée sur Murkhana. ",
					"",
					"allianceintercorportation",
					0,
					0,
					null,
					ElementColor.blue,
					"alliancecorpo1");
	}

	public static ElementInfo getEmpiredesTenebresLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Impérialisme avec culture Sith", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeant", "U", "Empereur Palpatine", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de fondation", "B", "Renaissance de Palpatine", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènement de dissolution", "F", "Mort de Palpatine sur Byss", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Empire des Ténèbres",
					new String[]{"Empire des Ténèbres"}, 
					"Empire fidèle à l'Empereur Palpatine ressuscité siégeant sur Byss. Il y sera érigés les effroyables Dévastateurs de Mondes et les Cuirassés de classe Eclipse. ",
					"",
					"",
					10,
					11,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.purple,
					"logodarkempire");
	}

	public static ElementInfo getEmpireEcarlateLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Impérialisme traditionnel", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeants", "U", "Seigneur Noir Carnor Jax, Xandel Carivus, Conseil Intérimaire", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènements de fondation", "B", "Mort d'Ardus Kaine, mort de Palpatine", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènement de dissolution", "F", "Mort de l'Empereur autoproclamé Xandel Carivus, dislocation du Conseil Intérimaire", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Empire Ecarlate",
					new String[]{"Empire Ecarlate", "Empire écarlate"}, 
					"Seul état impérial à pouvoir se dire légitime dans la multitude de seigneuries, l'Empire Écarlate sera successivement dirigé par Carnor Jax, le Conseil Intérimaire puis Xandel Carivus qui l'amena à sa fin.",
					"",
					"crimsonempire",
					11,
					12,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.purple,
					"logocrimsonempire",
					"crimsonempire1",
					"carnorjax2",
					"crimsonempire2");
	}

	public static ElementInfo getAlignementdePentastarLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Impérialisme isolationiste", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeant", "U", "Grand Moff Ardus Kaine", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de fondation", "B", "Dislocation de l'Empire Galactique", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènement de dissolution", "F", "Annexé par l'Amiral Pellaeon dans les Vestiges de l'Empire", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Alignement de Pentastar",
					new String[]{"Alignement de Pentastar"}, 
					"Conglomérat politique impériale contrôlant une grande partie des régions extérieures.",
					"",
					"",
					7,
					12,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.purple,
					"logopentastaralign");
	}

	public static ElementInfo getAuthoritedEriaduLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Impérialisme traditionnel", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeant", "U", "Général Sander Delvardus", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de fondation", "B", "Bataille d'Endor, mort de l'Empereur Palpatine", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènement de dissolution", "F", "Annexé par l'Amiral Pellaeon dans les Vestiges de l'Empire", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Authorité d'Eriadu",
					new String[]{"Authorité d'Eriadu"}, 
					"La seigneurie impériale dirigée par le Général Sander Delvardus qui fut créée suite à la mort de l'Empereur, et qui fut dissoute à la mort de son dirigeant.",
					"",
					"",
					4,
					12,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.purple,
					"logogalacticempire");
	}

	public static ElementInfo getEmpiredHarrskLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Impérialisme fasciste", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeants", "U", "Blitzer Harrsk", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de fondation", "B", "Bataille d'Endor, mort de l'Empereur Palpatine", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènement de dissolution", "F", "Annexé par l'Amiral Pellaeon dans les Vestiges de l'Empire", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Empire d'Harrsk",
					new String[]{"Empire d'Harrsk"}, 
					"Descendant du Zero Command, l'Empire d'Harrsk restera très indépendant depuis la chute de l'Empire Galactique.  ",
					"",
					"",
					4,
					12,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.purple,
					"logogalacticempire");
	}

	public static ElementInfo getEmpiredeXimLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Autoritaire", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeants", "U", "Xim le despote", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de fondation", "B", "Conquête de nombreux mondes par Xer VIII et son fils Xim", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènement de dissolution", "F", "Défaite lors de la bataille de Vontor", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Empire de Xim",
					new String[]{"Empire de Xim"}, 
					"Premier grand Empire interstellaire humain dirigé d'une main de fer par le légendaire Xim.",
					"",
					"",
					-25130,
					-25096,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.blue,
					"ximempire1");
	}

	public static ElementInfo getGrandSecteurExterieurLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Impérialisme traditionnel", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeants", "U", "Grand Moff Ardus Kaine", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènements de fondation", "B", "Bataille d'Endor, mort de l'Empereur Palpatine", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Grand Secteur Extérieur",
					new String[]{"Grand Secteur Extérieur"}, 
					"Grand secteur impérial sous la domination du Grand Moff Artus Kaine suite au décès du Grand Moff Tarkin.",
					"",
					"",
					4,
					7,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2}, 
					ElementColor.purple,
					"logogalacticempire");
	}

	public static ElementInfo getEmpiredeZsinjLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Impérialisme traditionnel", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeants", "U", "Seigneur de Guerre Zsinj", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènements de fondation", "B", "Bataille d'Endor, mort de l'Empereur Palpatine", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Empire de Zsinj",
					new String[]{"Empire de Zsinj"}, 
					"Vaste région impériale dans le grand secteur de Quelii régie par Zsinj qui refusa de suivre le conseil impérial.  ",
					"",
					"",
					4,
					8,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2}, 
					ElementColor.purple,
					"logogalacticempire");
	}

	public static ElementInfo getGrandMaldroodLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Impérialisme traditionnel", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeant", "U", "Amiral Treuten Teradoc", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de fondation", "B", "Bataille d'Endor, mort de l'Empereur Palpatine", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Grand Maldrood",
					new String[]{"Grand Maldrood"}, 
					"Seigneurie impériale dirigée par l'Amiral Treuten Teradoc créée suite à la mort de l'Empereur.",
					"",
					"",
					4,
					8,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2}, 
					ElementColor.purple,
					"logogalacticempire");
	}

	public static ElementInfo getDominiondePrentiochLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Impérialisme traditionnel", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeant", "U", "Moff Utoxx Prentioch", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènements de fondation", "B", "Bataille d'Endor, mort de l'Empereur Palpatine", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dominion de Prentioch",
					new String[]{"Dominion de Prentioch"}, 
					"Seigneurie impériale qui fut brièvement gouverné par le Moff Utoxx Prentioch avant d'être absorbée par la Nouvelle République quelques années après la bataille d'Endor.",
					"",
					"",
					4,
					5,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2}, 
					ElementColor.purple,
					"logogalacticempire");
	}

	public static ElementInfo getColonieshumainesLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Evènement de fondation", "B", "Éffondrement de l'Empire Infini", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Evènement de dissolution", "F", "Formation de la République Galactique", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Colonies humaines",
					new String[]{"Colonies humaines"}, 
					"Colonies présentent sur Coruscant, Corellia, Chandrilla et Alderaan.",
					"",
					"",
					-25200,
					-25053,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1}, 
					ElementColor.blue,
					"logooldrepublic");
	}

	public static ElementInfo getVestigesdelAllianceLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Organisation militaire constitutionnelle", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeant", "U", "Amiral Gar Stazi", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de fondation", "B", "Bataille de Caamas", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènements de dissolution", "F", "Fin du règne de Dark Krayt, restructuration en Fédération tripartite", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Vestiges de l'Alliance",
					new String[]{"Vestiges de l'Alliance"}, 
					"Unique reste de la flotte fédérale après le désastre de la bataille de Caamas commandé le brillant amiral Gar Stazi.",
					"",
					"",
					130,
					138,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.purple,
					"logofgal");
	}

	public static ElementInfo getEmpireenExilLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Impérialisme traditionnel héréditaire", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeant", "U", "Empereur Roan Fel", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de fondation", "B", "Coup d'état de Dark Krayt", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènements de dissolution", "F", "Fin du règne de Dark Krayt, restructuration en Fédération tripartite", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Empire en Exil",
					new String[]{"Empire en Exil"}, 
					"Les membres fidèles au véritable Empereur Roan Fel se sont regroupés sous l'égide de l'Empire en Exil à Bastion.",
					"",
					"",
					130,
					138,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.purple,
					"logonewgalacticempire");
	}

	public static ElementInfo getEmpiredeKraytLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Impérialisme totalitaire Sith", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeant", "U", "Empereur Dark Krayt", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de fondation", "B", "Complot Sith pour renverser les pouvoirs (Alliance et Empire) en place, coup d'état de Dark Krayt", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènement de dissolution", "F", "Bataille de Coruscant, mutinerie de certains Moffs", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Empire de Krayt",
					new String[]{"Empire de Krayt"}, 
					"Successeur du Nouvel Empire Galactique sous le joug tyranique du Seigneur Noir des Sith Dark Krayt. ",
					"",
					"",
					130,
					138,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.blue,
					"logogalacticempire");
	}

	public static ElementInfo getCroisadesdeContispexLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Belligérants", "U", "République Galactique, Secte Pius Dea, autres sectes", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Evènements déclencheurs", "B", "Ascension de Contispex I au titre de Chancelier Suprême", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de fin", "F", "Arrêt de Contispex XIX par les Jedi", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Croisades de Contispex",
					new String[]{"Croisades de Contispex"}, 
					"Période historique de la République Galactique marquée par l'accès de Constipex au rang de Chancelier Suprême. Alors membre de la secte Pius Dea, il tenta de faire de la République une théocratie combattant les autres sectes de la Bordure Extérieure.",
					"",
					"contispex",
					-11965,
					-10966,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2}, 
					ElementColor.orange,
					"contispex1");
	}

	public static ElementInfo getGuerreTionienneLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Belligérants", "U", "République Galactique, Union Honorable de Desevro et Tion", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Evènements déclencheurs", "B", "Invasion Tionienne", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de fin", "F", "Victoire de la République lors de la bataille de Desevro", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Guerre Tionienne",
					new String[]{"Guerre Tionienne"}, 
					"Conflit poussé par les dirigeants de Desevro qui voyait la République comme une cible riche mais faible.",
					"",
					"",
					-24000,
					-23900,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2}, 
					ElementColor.orange,
					"tionwar1");
	}

	public static ElementInfo getGuerresdeXimLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Belligérants", "U", "Empire Hutt, Empire de Xim", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Evènement déclencheurs", "B", "Invasion de Xim", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènements de fin", "F", "Victoire des Hutt lors de la bataille de Vontor, dissolution de l'Empire de Xim", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Guerres de Xim",
					new String[]{"Guerres de Xim"}, 
					"Après avoir acquis de nombreux territoires grâce au lègue de son père, Xim le despote tenta de conquérir de nombreux mondes. Il se lança à la conquête de l'Empire Hutt suite à un mésaccord diplomatique.",
					"",
					"",
					-25102,
					-25096,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2}, 
					ElementColor.orange,
					"ximwars1");
	}

	public static ElementInfo getGuerredeStarkLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Belligérants", "U", "Cartel Commercial de Stark (contrebandiers), Fédération du Commerce, République Galactique", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Evènements déclencheurs", "B", "Crise des matières premières, explosion d'une usine à bacta", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de fin", "F", "Bataille de Troiken", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Guerre de Stark",
					new String[]{"Guerre de Stark"}, 
					"La Guerre Hyperspatiale de Stark fut le dernier grand conflit galactique avant la Guerre des Clones. Elle se déroula environ douze ans avant celle-ci, principalement à cause de la pénurie de la plus courante fourniture médicale de la Galaxie, le bacta.",
					"",
					"stark",
					-44,
					-44,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2}, 
					ElementColor.orange,
					"stark1");
	}

	public static ElementInfo getGuerresSombresLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Autre nom", "C", "Seconde guerre civile des Jedi, Guerre Civile Sith", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Belligérants", "U", "Triumvirat Sith, République Galactique, Ordre Jedi", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènements déclencheurs", "B", "Mort de Dark Malak, formation du Triumvirat Sith", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Evènement de fin", "F", "Destruction de Malachor V", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Guerres Sombres",
					new String[]{"Guerres Sombres"}, 
					"Période tragique au cours de laquelle les Jedi furent presque tous décimés par le triumvirat Sith composé de Dark Nihilus, Dark Sion et Dark Traya. Ce fut grâce à l'Exilée Jedi que les Sith furent défaits et que l'Ordre Jedi fut sauvé.",
					"",
					"",
					-3955,
					-3951,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.orange,
					"logodarkwar");
	}

	public static ElementInfo getGuerresdelaForceLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Belligérants", "n", "Ordre Je'daii, adeptes de Ashla, adeptes de Bogan, Empire Infini", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Evènements déclencheurs", "B", "Invasion de l'Empire Infini, conflit entre les deux factions d'adeptes de la Force", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de fin", "F", "Défaite des Adeptes de Bogan", "");
		DescriptionItem lDescriptionItem3 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem3.init("Conséquence", "J", "Création de l'Ordre Jedi", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Guerres de la Force",
					new String[]{"Guerres de la Force"}, 
					"Conflit qui opposa les adeptes de l'Ashla à ceux du Bogan sur Tython.",
					"",
					"",
					-25784,
					-25784,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2, 
						lDescriptionItem3}, 
					ElementColor.orange,
					"logoforcewar");
	}

	public static ElementInfo getGuerreEternelleLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Belligérants", "n", "Empire Sith, République Galactique, Empire Eternel", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Évènement déclencheur", "B", "Invasion galactique par l'Empire Eternel par Vitiate sous le nom de Valkorion", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Évènement de fin", "F", "Défaite de la République et de l'Empire Sith Reconstitué", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Guerre Eternelle",
					new String[]{"Guerre Eternelle"}, 
					"Invasion massive des mondes de l'Empire Sith et de la République par l'Empire Eternel, faction ne servant que l'Empereur Sith Vitiate.",
					"",
					"",
					-3640,
					-3640,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2}, 
					ElementColor.orange,
					"eternalwar1");
	}

	public static ElementInfo getGuerresdelaReinedesposteLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Belligérants", "U", "Reine Hadiya, Barons du crime, Ordre Je'daii", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Guerres de la Reine desposte",
					new String[]{"Guerres de la Reine desposte"}, 
					"Conflit survenu par l'unification des forces de la reine Hadiya aux barons du crime du noyau profond afin de conquérir la planète Tython. ",
					"",
					"",
					-25805,
					-25805,
					new DescriptionItem[]{
						lDescriptionItem0}, 
					ElementColor.orange,
					"logodespotwar");
	}

	public static ElementInfo getOrdreJedaiiLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Dirigeant", "U", "Conseil Je'daii", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Evènement de fondation", "B", "Arrivée des Tho Yor sur Tython", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ordre Je'daii",
					new String[]{"Ordre Je'daii"}, 
					"Organisation unifée par la croyance et l'observation de la Force sur la planète Tython.",
					"",
					"",
					-36453,
					-25783,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1}, 
					ElementColor.green,
					"logojedaiiorder");
	}

	public static ElementInfo getFederationGalactiqueTripartiteLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Fédération indépendantiste militaire", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeants", "U", "Triumvirat composé de l'Impératrice Marasiah Fel, Maître K'Kruhk et l'Amiral Gar Stazi", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènements de fondation", "B", "Unification de la cours Impériale, du Conseil Jedi et de l'Alliance Galactique, funérailles de l'Empereur Roan Fel", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Fédération Galactique Tripartite",
					new String[]{"Fédération Galactique Tripartite"}, 
					"Nouveau gouvernement mis en place suite au règne de terreur de Dark Krayt afin de protéger la galaxie d'un éventuel retour des Sith.",
					"",
					"",
					138,
					Integer.MAX_VALUE,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2}, 
					ElementColor.blue,
					"logofgal");
	}

	public static ElementInfo getEmpireEternelLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Dirigeant", "U", "Empereur Valkorion (Vitiate), Arcann", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Empire Eternel",
					new String[]{"Empire Eternel"}, 
					"Gouvernement basé sur Zakuul dans les régions inconnues. Il combattit à la fois l'Empire Sith et la République Galactique. ",
					"",
					"",
					-3645,
					-3630,
					new DescriptionItem[]{
						lDescriptionItem0}, 
					ElementColor.blue,
					"eternalempire1");
	}

	public static ElementInfo getOrdredeRevanLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Type de régime", "e", "Société secrète Sith", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Dirigeants", "U", "Revan, Tari Darkspanner", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ordre de Revan",
					new String[]{"Ordre de Revan"}, 
					"L'Ordre de Revan était une société secrète au sein du Second Empire Sith. En tant qu'admirateurs de la philosophie de Revan, les membres de ce culte furent peu à peu bannis par la société impériale.",
					"",
					"",
					-3700,
					-3640,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1}, 
					ElementColor.blue,
					"revanorder1");
	}

	public static ElementInfo getVraisSithLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Dirigeants", "U", "Seigneurs Vitiate, Skere Kaan, Dark Ruin...", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Evènement de fondation", "B", "Restauration de l'Ordre Sith par le Seigneur Vitiate", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènements de dissolution", "F", "Septième bataille de Ruusan, avènement de la Règle des Deux", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Vrais Sith",
					new String[]{"Vrais Sith"}, 
					"Les Vrais Sith sont issus des Sith ayant survécus à la grande Guerre des l'Hyperespace et ayant participés au Nouvel Âge d'Or des Sith. ",
					"",
					"",
					-4970,
					-1000,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2}, 
					ElementColor.yellow,
					"logorenewsith");
	}

	public static ElementInfo getNaddismeLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Naddisme",
					new String[]{"Naddisme"}, 
					"Organisation de fanatiques Sith issue du règne du Seigneur Noir des Sith Freedon Nadd.",
					"Organisation de fanatiques Sith issue du règne du Seigneur Noir des Sith Freedon Nadd. Ce dernier, qui avait suivi l'apprentissage de l'ancien Seigneur Noir des Sith Naga Sadow, avait conquis la planète Ondéron et en étant devenu le roi.",
					"",
					-4500,
					-3995,
					null,
					ElementColor.yellow,
					"logonaddism");
	}

	public static ElementInfo getConfrerieSithLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Dirigeant", "U", "Exar Kun", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Evènement de dissolution", "F", "Bataille de Yavin 4", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Confrérie Sith",
					new String[]{"Confrérie Sith"}, 
					"Association de Chevaliers Jedi possédés dirigée par le Seigneur Noir des Sith Exar Kun au temps de la Grande Guerre des Sith.",
					"La Confrérie des Ténèbres était une association de Chevaliers Jedi possédés dirigée par le Seigneur Noir des Sith Exar Kun au temps de la Grande Guerre des Sith. Composée d'au moins six Jedi déchus, et d'une quinzaine d'autres utilisateurs de la Force partisans du côté obscur, la Confrérie des Sith prolongea la Grande Guerre des Sith initiée trois ans plus tôt par les disciples du défunt Seigneur Noir Freedon Nadd.",
					"",
					-3997,
					-3996,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1}, 
					ElementColor.yellow,
					"logoexarkun");
	}

	public static ElementInfo getDisciplesdeRagnosLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Dirigeant", "U", "Tavion Axmis", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Evènement de fondation", "B", "Prise en possession du septre de Marka Ragnos par Tavion", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènements de dissolution", "F", "Bataille de Korriban, mort de Tavion, destruction du septre de Marka Ragnos", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Disciples de Ragnos",
					new String[]{"Disciples de Ragnos"}, 
					"Organisation dirigée par Tavion Axmis qui avait pour but la résurrection de Marka Ragnos. Elle fut vivement combattu par le Nouvel Ordre Jedi.",
					"Organisation dirigée par Tavion Axmis qui avait pour but la résurrection de Marka Ragnos. Elle faillit détruire la Nouvelle République mais fut vivement combattu par le Nouvel Ordre Jedi.",
					"",
					13,
					14,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2}, 
					ElementColor.yellow,
					"logomarkaragnos");
	}

	public static ElementInfo getSithdeLumiyaLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Dirigeant", "U", "Dame Noire des Sith Lumiya", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sith de Lumiya",
					new String[]{"Sith de Lumiya"}, 
					"Organisation Sith créée par la Dame Noire des Sith Lumiya afin de venger la mort de l'Empereur Palpatine sur les Jedi.",
					"",
					"",
					4,
					41,
					new DescriptionItem[]{
						lDescriptionItem0}, 
					ElementColor.yellow,
					"logolumiya");
	}

	public static ElementInfo getRegledesDeuxLegends() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Dirigeants", "U", "Dark Bane, Dark Zannah, Dark Sidious...", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Evènements de fondation", "B", "Septième bataille de Ruusan, trahison de Dark Bane", "");
		DescriptionItem lDescriptionItem2 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem2.init("Evènement de dissolution", "F", "Avènement du Sith Unique", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Règle des Deux",
					new String[]{"Règle des Deux"}, 
					"Règle ancestrâle Sith considérant qu'il ne doit y avoir que deux Sith; pas plus. Un détenant le pouvoir, un autre y aspirant.",
					"Règle ancestrâle Sith considérant qu'il ne doit y avoir que deux Sith; pas plus. Un détenant le pouvoir, un autre y aspirant.",
					"",
					-1000,
					30,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1, 
						lDescriptionItem2}, 
					ElementColor.green,
					"logoruleoftwo");
	}

	public static ElementInfo getRegledesDeuxClassic() {
		DescriptionItem lDescriptionItem0 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem0.init("Dirigeants", "U", "Dark Bane, Dark Sidious...", "");
		DescriptionItem lDescriptionItem1 = StarWarsApp.ginjector.getDescriptionItem();
		lDescriptionItem1.init("Evènement de dissolution", "F", "Mort de Dark Sidious et de Dark Vador", "");
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Règle des Deux",
					new String[]{"Règle des Deux"}, 
					"Règle ancestrâle Sith considérant qu'il ne doit y avoir que deux Sith; pas plus. Un détenant le pouvoir, un autre y aspirant.",
					"Règle ancestrâle Sith considérant qu'il ne doit y avoir que deux Sith; pas plus. Un détenant le pouvoir, un autre y aspirant.",
					"",
					-1000,
					4,
					new DescriptionItem[]{
						lDescriptionItem0, 
						lDescriptionItem1}, 
					ElementColor.green,
					"logoruleoftwo");
	}

	public static ElementInfo getProphetiedelEluClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Prophétie de l'Elu",
					new String[]{"Prophétie de l'Elu"}, 
					"Cette ancienne prophétie aux origines troubles fut une ancienne légende Jedi. Elle fut le point de départ de la chute d'Anakin Skywalker et la revanche des Sith...",
					"",
					"theoneclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"theone1");
	}

	public static ElementInfo getLaForceCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"La Force",
					new String[]{"La Force"}, 
					"La Force est un champ d'énergie s'appliquant à tous les êtres vivants. Elle est aussi omniprésente que mystérieuse et personne n'est encore arrivé à percer l'origine.",
					"",
					"force",
					0,
					0,
					null,
					ElementColor.blue,
					"force1",
					"force2");
	}

	public static ElementInfo getCodeSithCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Code Sith",
					new String[]{"Code Sith"}, 
					"Le Code Sith fut la doctrine conçue par les Jedi Noir éxilés et apprise par tous les Sith. Ces préceptes se veulent l'exact opposé de la doctrine Jedi.",
					"",
					"sithcode",
					-6900,
					-1000,
					null,
					ElementColor.green,
					"logogoldenage");
	}

	public static ElementInfo getArtJediLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Art Jedi",
					new String[]{"Art Jedi"}, 
					"Les Arts Jedi sont l'ensemble des techniques de maniement du sabre laser propres aux Jedi et aux Sith.",
					"",
					"jediartlegends",
					0,
					0,
					null,
					ElementColor.blue,
					"jediart1",
					"tython2",
					"jediart2",
					"jediart3",
					"shiicho",
					"makashi",
					"soresu",
					"ataru",
					"djemso",
					"niman",
					"juyo",
					"sokan",
					"jarkai",
					"zezkai",
					"trakata",
					"dunmoch");
	}

	public static ElementInfo getArtJediClassic() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Art Jedi",
					new String[]{"Art Jedi"}, 
					"Les Arts Jedi sont l'ensemble des techniques de maniement du sabre laser propres aux Jedi et aux Sith.",
					"",
					"jediartclassic",
					0,
					0,
					null,
					ElementColor.blue,
					"jediart1",
					"jediart2",
					"jediart3",
					"shiicho",
					"makashi",
					"soresu",
					"ataru",
					"djemso",
					"niman",
					"juyo",
					"sokan",
					"jarkai",
					"zezkai",
					"trakata",
					"dunmoch");
	}

	public static ElementInfo getCodeJediCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Code Jedi",
					new String[]{"Code Jedi"}, 
					"Le Code Jedi est un ensemble de préceptes définisant les règles de conduite que les membres de l'Ordre Jedi devaient adopter, et dont les Maîtres se servaient durant la formation des apprentis.",
					"",
					"jedicode",
					0,
					0,
					null,
					ElementColor.blue,
					"logojediorder");
	}

	public static ElementInfo getLeTempsCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Le Temps",
					new String[]{"Le Temps"}, 
					"Cette notion fondamentale prend une place importante dans cet univers où les voyages spaciaux font changer les calendriers locaus à chaque bond hyperspacial.  ",
					"",
					"time",
					0,
					0,
					null,
					ElementColor.blue,
					"time1");
	}

	public static ElementInfo getDistanceCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Distance",
					new String[]{"Distance"}, 
					"Les mesures de distance de base dans une galaxie très, très lointaine. ",
					"",
					"distance",
					0,
					0,
					null,
					ElementColor.blue,
					"time1");
	}

	public static ElementInfo getAurebeshCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Aurebesh",
					new String[]{"Aurebesh"}, 
					"L'alphabet de référence utilisé dans les mondes civilisés de la Galaxie.",
					"",
					"aurebesh",
					0,
					0,
					null,
					ElementColor.blue,
					"aurebesh1",
					"aurebesh2");
	}

	public static ElementInfo getMaraJadeLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mara Jade",
					new String[]{"Mara Jade", "Mara"}, 
					"Mara Jade fut l'une des Mains de l'Empereur Palpatine avant de rejoindre le Nouvel Ordre Jedi, et de devenir la femme de Luke Skywalker.",
					"",
					"marajade",
					0,
					0,
					null,
					ElementColor.blue,
					"logomarajade",
					"maravador",
					"marahutt",
					"marar2d2",
					"marajedi",
					"caamasdoc4",
					"maraluke",
					"maravong",
					"maraswarmwar",
					"maradeath");
	}

	public static ElementInfo getKenthHamnerLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kenth Hamner",
					new String[]{"Kenth Hamner"}, 
					"Kenth Hammer était un Jedi incorporé à l'armée de la Nouvelle République.",
					"",
					"kenth",
					0,
					0,
					null,
					ElementColor.blue,
					"kenth1");
	}

	public static ElementInfo getMiraxTerrikLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mirax Terrik",
					new String[]{"Mirax Terrik", "Mirax"}, 
					"Fille du contrebandier Booster Terrik et épouse de Corran Horn.",
					"",
					"mirax",
					0,
					0,
					null,
					ElementColor.blue,
					"mirax1",
					"mirax2");
	}

	public static ElementInfo getTendraRisantLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tendra Risant",
					new String[]{"Tendra Risant", "Tendra"}, 
					"Tendra Risant était la femme de Lando Calrissian qu'il rencontra lors de l'Insurrection Corellienne. Elle est la codirigeante de Tendrando Arms.",
					"",
					"tendra",
					0,
					0,
					null,
					ElementColor.blue,
					"tendra1");
	}

	public static ElementInfo getNejaaHalcyonLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nejaa Halcyon",
					new String[]{"Nejaa Halcyon", "Nejaa"}, 
					"Nejaa Halcyon était un Maître Jedi corellien qui participa à la Guerre des Clones et qui fut tué en affrontant des Jedi Noirs.",
					"",
					"nejaa",
					0,
					0,
					null,
					ElementColor.blue,
					"nejaa1");
	}

	public static ElementInfo getSkereKaanLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Skere Kaan",
					new String[]{"Skere Kaan", "Kaan"}, 
					"Seigneur Noir de la Confrérie des Ténèbres, c'est sous son règne que les Sith se rassemblirent sous un même bannière avant de chûter lors de la dernière bataille de Ruusan.",
					"",
					"kaan",
					0,
					0,
					null,
					ElementColor.darkblue,
					"logokaan",
					"darkbrotherhood2");
	}

	public static ElementInfo getAniaSoloLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ania Solo",
					new String[]{"Ania Solo"}, 
					"Contrebandière du temps de la Seconde Guerre Civile Impériale. Elle permit au nouveau Triumvirat établi d'en finir avec le Sith Unique.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.green,
					"aniasolo1");
	}

	public static ElementInfo getLeontyneSareshLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Leontyne Saresh",
					new String[]{"Leontyne Saresh"}, 
					"Twi'lek sénatrice, puis gourverneur et enfin devenue Chancelière Suprême du temps de la Seconde grande guerre Galactique. ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"logounknown");
	}

	public static ElementInfo getKalpanaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kalpana",
					new String[]{"Kalpana"}, 
					"Membre d'une famille influente et alliée de à la famille Valorum, il n'aura aucun mal à devenir Chancelier Suprême de la République.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"logounknown");
	}

	public static ElementInfo getChaNiathalLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Cha Niathal",
					new String[]{"Cha Niathal"}, 
					"Cha Niathal était une Mon Calamari qui fut Commandant Suprême et Chef d'Etat de l'Alliance Galactique au cours de la Nouvelle Guerre Civile Galactique.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"niathal1");
	}

	public static ElementInfo getSabaSebatyneLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Saba Sebatyne",
					new String[]{"Saba Sebatyne"}, 
					"Saba Sebatyne était une Barabel Jedi du Nouvel Ordre Jedi. Elle participa à la recherche de Zonama Sekot et à la crise Killik.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"sebatyne1");
	}

	public static ElementInfo getHaydnarTreenLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Haydnar Treen",
					new String[]{"Haydnar Treen"}, 
					"Membre du triumvirat de l'Alliance Galactique après la mise aux arrêts de Natasi Daala par les Jedi.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"logounknown");
	}

	public static ElementInfo getMerratJaxtonLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Merrat Jaxton",
					new String[]{"Merrat Jaxton"}, 
					"Général de l'Alliance Galactique mis à mal par ses motivations et l'infiltration de la Tribue perdue des Sith.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"logounknown");
	}

	public static ElementInfo getWynnDorvanLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Wynn Dorvan",
					new String[]{"Wynn Dorvan"}, 
					"Principal assistant de la Chef d'Etat de l'Alliance Galactique Natasi Daala, Wynn Dorvan était un homme qui aimait travailler en solitaire. Il deviendra par la suite Chef d'Etat de l'Alliance. ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"dorvan1");
	}

	public static ElementInfo getBailAntilles2Legends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bail Antilles2",
					new String[]{"Bail Antilles2"}, 
					"Bail Antilles est un politicien qui fit parti du Triumvirat de l'Alliance Galactique durant la guerre Impérialo-Sith, il accepta le plan d'attaque qui aboutit à la défaite de Caamas.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"bailantilles1");
	}

	public static ElementInfo getNuToreenaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nu Toreena",
					new String[]{"Nu Toreena"}, 
					"Ithorienne membre du Triumvirat durant les derniers jours de l'Alliance Galactique. Contrairement à Gial Gahan, elle ne soutient pas les Jedi; les accusant d'être responsables de la guerre Sitho-Impériale. ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"nutoreena1");
	}

	public static ElementInfo getConseildesMoffsLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Conseil des Moffs",
					new String[]{"Conseil des Moffs"}, 
					"Le Conseil des Moffs était la plus forte institution du temps des Vestiges de l'Empire. Il devint véritablement très puissant du temps du Nouvel Empire Galactique.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"moffcouncil1");
	}

	public static ElementInfo getXandelCarivusLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Xandel Carivus",
					new String[]{"Xandel Carivus"}, 
					"Originaire d'une famille riche d'Ord Cantrell, il fut le dernier à proclamer le titre d'Empereur avant Jagged Fel. ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"carivus1");
	}

	public static ElementInfo getVitorReigeLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Vitor Reige",
					new String[]{"Vitor Reige"}, 
					"A la base simple pilote de navette, il deviendra Amiral puis Chef d'Etat des Vestiges de l'Empire. ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"logounknown");
	}

	public static ElementInfo getDarkGravidLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Gravid",
					new String[]{"Dark Gravid"}, 
					"Dark Gravid était un Seigneur Sith qui tenta d'introduire des pratiques Jedi dans ses enseignements Sith et qui fut tué par son apprentie Dark Gean lorsqu'il tenta de détruire le savoir de son ordre.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.red,
					"logounknown");
	}

	public static ElementInfo getDarkGeanLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Gean",
					new String[]{"Dark Gean"}, 
					"Dark Gean était une Seigneur Sith Twi'lek qui tua son Maître Dark Gravid lorsqu'il tenta de détruire les enseignements des Sith après être devenu fou.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.red,
					"logounknown");
	}

	public static ElementInfo getDarkRamageLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Ramage",
					new String[]{"Dark Ramage"}, 
					"Maitre de Dark Tenebrous, ils tentèrent de produire ensemble un virus pour anéantir les Jedi.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.red,
					"logodarkramage");
	}

	public static ElementInfo getFemmeInconnueCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Femme Inconnue",
					new String[]{"Femme Inconnue"}, 
					"Aucune information supplémentaire pour cette personne.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"logounknown");
	}

	public static ElementInfo getHommeInconnuCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Homme Inconnu",
					new String[]{"Homme Inconnu"}, 
					"Aucune information supplémentaire pour cette personne.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"logounknown");
	}

	public static ElementInfo getAikaLarsCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Aika Lars",
					new String[]{"Aika Lars"}, 
					"Originaire du monde du noyau d'Ator, elle mourut quand Owen était très jeune. C'est à ce moment que Cliegg retourna sur Tatooine pour s'occuper de la ferme de ses parents.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.red,
					"logounknown");
	}

	public static ElementInfo getBailAntillesCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bail Antilles",
					new String[]{"Bail Antilles"}, 
					"Prince d'Alderaan, il devint sénateur du secteur d'Alderaan au sénat galactique. Il combattit la corruption du sénat. Il fut l'un des concurrent de Palpatine lors des élections suite à la destitution du Chancelier Valorum.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.mediumgreen2,
					"logobailantilles");
	}

	public static ElementInfo getRuweeNaberrieCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ruwee Naberrie",
					new String[]{"Ruwee Naberrie"}, 
					"Homme volontaire et philanthrope, il présida une association de réfugiés et donna de nombreux cours à l'université de Theed.  ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.yellow,
					"logoruweenaberrie");
	}

	public static ElementInfo getSolaNaberrieCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sola Naberrie",
					new String[]{"Sola Naberrie"}, 
					"Soeur ainée de Padme, elle se préoccupe beaucoup du bien de sa petite soeur. Elle réalisa des études d'architecture. ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.yellow,
					"logosolanaberrie");
	}

	public static ElementInfo getBrehaAntillesCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Breha Antilles",
					new String[]{"Breha Antilles"}, 
					"Reine d'Alderaan et ministre de l'Éducation, elle mourut dans la destruction de sa planète par l'Etoile Noire.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.mediumgreen2,
					"logobrehaantilles");
	}

	public static ElementInfo getRaymusAntillesCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Raymus Antilles",
					new String[]{"Raymus Antilles"}, 
					"Prince d'Alderaan et capitaine du Tantive IV de la Guerre des Clones jusqu'à l'abordage par les forces de l'Empire des mains de Dark Vador.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.mediumgreen2,
					"logoraymusantilles");
	}

	public static ElementInfo getHaroWhitesunLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Haro Whitesun",
					new String[]{"Haro Whitesun"}, 
					"Membre de l'Alliance Rebelle, il fut tué sur Naboo pour avoir défendu cette cause.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.darkyellow,
					"logounknown");
	}

	public static ElementInfo getDamaWhitesunLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dama Whitesun",
					new String[]{"Dama Whitesun"}, 
					"Gérante d'une auberge Sidi Driss à Anchorhead durant les premiers jours de la Nouvelle République.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.darkyellow,
					"logounknown");
	}

	public static ElementInfo getSamBrunkLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sam Brunk",
					new String[]{"Sam Brunk"}, 
					"Fermier de moisissures à Anchorhead du temps de l'Empire Galactique.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.darkyellow,
					"logounknown");
	}

	public static ElementInfo getEdernLarsLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Edern Lars",
					new String[]{"Edern Lars"}, 
					"Petit frère de Cliegg, il fut tué à l'âge de 14 ans suite à un accident de speeder. Shmi Skywalker, la seconde femme de Cliegg, fut enterrée à côté. ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.red,
					"logounknown");
	}

	public static ElementInfo getLefLarsLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Lef Lars",
					new String[]{"Lef Lars"}, 
					"Époux de Gredda Lars, il possaidait une ferme sur Tatooine non loin de Mos Eisley avant que son fils ainé n'en hérite.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.red,
					"logounknown");
	}

	public static ElementInfo getGreddaLarsLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Gredda Lars",
					new String[]{"Gredda Lars"}, 
					"Épouse de Lef Lars, elle possaidait une ferme sur Tatooine non loin de Mos Eisley avant que son fils ainé n'en hérite. ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.red,
					"logounknown");
	}

	public static ElementInfo getMalinzaThanasLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Malinza Thanas",
					new String[]{"Malinza Thanas"}, 
					"Orpheline à 5 ans, elle fut principalement éduquée et soutenu par Luke Skywalker. Elle garda cependant un profond mépris pour la Nouvelle République et l'Alliance Galactique. ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.mediumgreen,
					"logomalinzathanas");
	}

	public static ElementInfo getYlandaCaptisonLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ylanda Captison",
					new String[]{"Ylanda Captison"}, 
					"Afin de préserver l'équilibre cosmique décrit par la Religion de l'Equilibre Cosmique de Bakura, elle devint mendiante tandis que sa soeur Gaeriel devenait sénatrice.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.mediumgreen,
					"logounknown");
	}

	public static ElementInfo getMargaCaptisonLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Marga Captison",
					new String[]{"Marga Captison"}, 
					"Porte-parole pour les relations impériales sur Bakura mais fut impliquée dans la résistance contre l'Empire en 1 ap. BY.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.mediumgreen,
					"logounknown");
	}

	public static ElementInfo getDolCaptisonLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dol Captison",
					new String[]{"Dol Captison"}, 
					"Sénateur Bakuran depuis la République Galactique. Sa femme et lui furent tués lors de l'invasion impériale dans un feu croisé entre les forces de résistance et l'Empire. ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.mediumgreen,
					"logounknown");
	}

	public static ElementInfo getYeorgCaptisonLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Yeorg Captison",
					new String[]{"Yeorg Captison"}, 
					"Membre d'une famille politique noble de Bakura, il fut élu sénateur vers 26 av. BY. ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.mediumgreen,
					"logounknown");
	}

	public static ElementInfo getWinamaNaberrieLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Winama Naberrie",
					new String[]{"Winama Naberrie"}, 
					"Meilleur tisseuse de Theed, elle mourut la même année ou sa petite fille Padme devint Monarche de Naboo. ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.yellow,
					"logounknown");
	}

	public static ElementInfo getRyooThuleLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ryoo Thule",
					new String[]{"Ryoo Thule"}, 
					"Grand mère de Padme Naberrie, elle fut assassinée par un inquisiteur impérial qui souhait connaitre des informations sur sa petite fille.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.yellow,
					"logounknown");
	}

	public static ElementInfo getDarredJanrenLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Darred Janren",
					new String[]{"Darred Janren"}, 
					"Architecte qui rencontra durant ses études Sola Naberrie. Ils gardèrent d'un commun accord le nom Naberrie, plus reconnu que le sien.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.yellow,
					"logounknown");
	}

	public static ElementInfo getRyooNaberrieLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ryoo Naberrie",
					new String[]{"Ryoo Naberrie"}, 
					"Son père avait été d'accord pour conserver à Ryoo et sa sœur cadette, Pooja, le nom de leur mère qui était plus reconnu que le sien.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.yellow,
					"logoryoonaberrie");
	}

	public static ElementInfo getPoojaNaberrieLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Pooja Naberrie",
					new String[]{"Pooja Naberrie"}, 
					"Plus jeune fille de Sola Naberrie, elle devint la sénatrice du Secteur de Chommell, comprenant Naboo.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.yellow,
					"logopoojanaberrie");
	}

	public static ElementInfo getJainaElderLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jaina Elder",
					new String[]{"Jaina Elder"}, 
					"Femme de Jonash, son nom fut repris par son fils Han pour nommer une corvette Lumière de Jaina ainsi que sa fille Jaina Solo. ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.green,
					"logounknown");
	}

	public static ElementInfo getJonashSoloLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jonash Solo",
					new String[]{"Jonash Solo"}, 
					"Kidnappé par des pirates, il se maria avec une dénommée Jaina. Ils disparurent peu de temps après la naissance de leur enfant, Han.  ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.green,
					"logounknown");
	}

	public static ElementInfo getDenSoloLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Den Solo",
					new String[]{"Den Solo"}, 
					"Corellien originaire de Tralus, il deviendra pirate sous le nom de Dalla le Noir clamant le trône de Corellia.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.green,
					"logounknown");
	}

	public static ElementInfo getTiraGamaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tira Gama",
					new String[]{"Tira Gama"}, 
					"Après avoir donné naissance à Jonash et Tiion, la famille Solo fut séparée sans pouvoir se retrouver suite à un raid de pirates.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.green,
					"logounknown");
	}

	public static ElementInfo getTiionSoloLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tiion Solo",
					new String[]{"Tiion Solo"}, 
					"Femme très recluse sur elle-même. Il semblerait qu'elle soit la descendante de l'ancienne royauté de Corellia.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.green,
					"logounknown");
	}

	public static ElementInfo getRandilSalLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Randil Sal",
					new String[]{"Randil Sal"}, 
					"Homme riche qui laissa sa forture à sa femme Tiion et à leur jeune enfant Trackan au moment de sa mort.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.green,
					"logounknown");
	}

	public static ElementInfo getNialOrganaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Nial Organa",
					new String[]{"Nial Organa"}, 
					"Enfant batard de l'affaire scandaleuse entre Tia Organa et le Jedi Halagad Ventor. Il fut éduqué avec sa cousine adoptée Leia Skywalker. ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"logounknown");
	}

	public static ElementInfo getHalagadVentorLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Halagad Ventor",
					new String[]{"Halagad Ventor"}, 
					"Ce Chevalier Jedi fut entraîné très tardivement. Ses actions furent souvent considérées comme non-orthodoxes pour la plupart des autres Jedi. ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"logounknown");
	}

	public static ElementInfo getTiaOrganaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Tia Organa",
					new String[]{"Tia Organa"}, 
					"Promise à un noble de la maison Vandron, elle eu finalement une aventure avec un ami Jedi de Bail, Halagad Ventor.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"logotiaorgana");
	}

	public static ElementInfo getRougeOrganaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Rouge Organa",
					new String[]{"Rouge Organa"}, 
					"Membre d'une grande famille d'Alderaan, elle aida sa nièce adoptée Leia en lui inculpant les codes et protocoles de la haute société. ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"logorougeorgana");
	}

	public static ElementInfo getCellyOrganaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Celly Organa",
					new String[]{"Celly Organa"}, 
					"Membre d'une famille puissante et aisée d'Alderaan, elle décida cependqnt s'occuper d'une oeuvre de charité pour les habitants de Coruscant.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"logocellyorgana");
	}

	public static ElementInfo getMaziciaOrganaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mazicia Organa",
					new String[]{"Mazicia Organa"}, 
					"Reine d'Alderaan avant la guerre des Clones. Elle fut également la première capitaine de la corvette Tantive IV.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"logounknown");
	}

	public static ElementInfo getDearaAntillesLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Deara Antilles",
					new String[]{"Deara Antilles"}, 
					"Conseillère auprès de la Reine Breha Antilles d'Alderaan, elle s'occupa également de la fille adoptive de cette dernière, Leia Skywalker.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.mediumgreen2,
					"logounknown");
	}

	public static ElementInfo getCorlaMetonaeLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Corla Metonae",
					new String[]{"Corla Metonae"}, 
					"Native d'Alderaan, Corla Metonae était attachée à la Maison Antilles, dirigée par Bail Antilles. Elle fit partie de l'équipage du Tantive IV, le vaisseau du sénateur d'Alderaan Bail Organa.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.mediumgreen2,
					"logocorlametonae");
	}

	public static ElementInfo getSheltayRetracLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sheltay Retrac",
					new String[]{"Sheltay Retrac"}, 
					"Native d'Alderaan, Sheltay Retrac avait fait des études de politiques et avait ensuite servi comme aide administrative du sénateur Bail Organa, représentant d'Alderaan au Sénat Galactique, lorsque ce dernier avait prit ses fonctions officielles.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.red,
					"logosheltayretrac");
	}

	public static ElementInfo getAllayaDjoLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Allaya Djo",
					new String[]{"Allaya Djo"}, 
					"Chef de guerre de clan des Montagnes Chantantes des sorcières de Dathomir.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.orange,
					"logounknown");
	}

	public static ElementInfo getBarrukaDjoLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Barruka Djo",
					new String[]{"Barruka Djo"}, 
					"Également tournée du côté obscur comme sa soeur Gethzerion, elle fut cependant capable de se détourner de lui puis s'éxila.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.orange,
					"logounknown");
	}

	public static ElementInfo getGethzerionDjoLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Gethzerion Djo",
					new String[]{"Gethzerion Djo"}, 
					"Seconde fille d'Augwynne Djo, elle succomba au Côté Obscur et fonda les Sœurs de la Nuit",
					"",
					"",
					0,
					0,
					null,
					ElementColor.orange,
					"logogethzeriondjo");
	}

	public static ElementInfo getKaraTeelDjoLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kara'Teel Djo",
					new String[]{"Kara'Teel Djo"}, 
					"Benjamine des filles de la matriarche Augwynne Djo, la Sorcière de Dathomir Kara'teel perdit la vie en protégeant sa mère d'une tentative d'assassinat perpétrée par sa propre soeur, Gethzerion.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.orange,
					"logounknown");
	}

	public static ElementInfo getAugwynneDjoLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Augwynne Djo",
					new String[]{"Augwynne Djo"}, 
					"Chef du clan des Montagnes Chantantes des sorcières de Dathomir. ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.orange,
					"logoaugwynnedjo");
	}

	public static ElementInfo getKalenLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kalen",
					new String[]{"Kalen"}, 
					"Frère aîné d'Isolder, il fut assassiné à l'instigation de sa propre mère.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.darkblue,
					"logounknown");
	}

	public static ElementInfo getTaaChumeLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ta'a Chume",
					new String[]{"Ta'a Chume"}, 
					"Taa Chume était la Reine-mère d'Hapès et la mère du prince Isolder.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.darkblue,
					"logotaachume");
	}

	public static ElementInfo getNiKorishLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ni'Korish",
					new String[]{"Ni'Korish"}, 
					"Reine-Mère de Hapès célèbre pour sa haine envers les Jedi.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.darkblue,
					"logounknown");
	}

	public static ElementInfo getTristaZelLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Trista Zel",
					new String[]{"Trista Zel"}, 
					"Trista Zel était avec sa soeur jumelle Taryn une des cousines de la Reine Mère de Hapes, Tenel Ka. Faisant partie des meilleurs officiers de confiance du trône de Hapes, elle officia notamment au cours de la Seconde Guerre Civile Galactique.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.darkblue,
					"logotristazel");
	}

	public static ElementInfo getTarynZelLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Taryn Zel",
					new String[]{"Taryn Zel"}, 
					"Faisant partie des meilleurs officiers de confiance du trône de Hapes, elle officia notamment au cours de la Seconde Guerre Civile Galactique.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.darkblue,
					"logotarynzel");
	}

	public static ElementInfo getChelikLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Chelik",
					new String[]{"Chelik"}, 
					"Nièce de Ta'a Chume dont la fille fut probablement exécutée pour avoir tenté d'assassiner le Prince Isolder en 27.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.darkblue,
					"logounknown");
	}

	public static ElementInfo getAlyssiaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Alyssia",
					new String[]{"Alyssia"}, 
					"Aspirante Reine Mère au trône d'Hapes, ses tentatives de le prendre par l'assassinat n'ont jamais aboutit.  ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.darkblue,
					"logounknown");
	}

	public static ElementInfo getFelIILegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Fel II",
					new String[]{"Fel II"}, 
					"Fel II fut le Second Empereur du Nouvel Empire Galactique et était le père de Roan Fel.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.purple,
					"logounknown");
	}

	public static ElementInfo getMohrganFelLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mohrgan Fel",
					new String[]{"Mohrgan Fel"}, 
					"Chevalier Impérial et cousin de Roan Fel, il mourut en affrontant Dark Krayt.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.purple,
					"logomohrganfel");
	}

	public static ElementInfo getDavinFelLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Davin Fel",
					new String[]{"Davin Fel"}, 
					"Aîné des Fel, il fut tout d'abord éduqué sur Corellia avant que ses parents ne partent pour les régions inconnues pour servir l'Empire de la Main de Thrawn.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.purple,
					"logodavinfel");
	}

	public static ElementInfo getCemFelLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Cem Fel",
					new String[]{"Cem Fel"}, 
					"Fils de Syal et Soontir Fel, il fut gardé secret par sa famille pour éviter que la famille se fasse entièrement exterminée par des rivaux. ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.purple,
					"logocemfel");
	}

	public static ElementInfo getChakFelLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Chak Fel",
					new String[]{"Chak Fel"}, 
					"Il suiva son père au servie de l'Empire de la Main et devint commandant de flotte.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.purple,
					"logochakfel");
	}

	public static ElementInfo getCherithFelLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Cherith Fel",
					new String[]{"Cherith Fel"}, 
					"Quatrième progéniture de Syal et Soontir Fel, elle fut élevée sur Nirauan avant d'entrer dans l'armée de l'Empire de la Main.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.purple,
					"logocherithfel");
	}

	public static ElementInfo getWynssaFelLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Wynssa Fel",
					new String[]{"Wynssa Fel"}, 
					"Dernière née officielle de Syal Antilles Fel et de Soontir Fel, Wynssa, souvent surnommée Wyn, était une jeune fille curieuse de tout et courageuse.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.purple,
					"logowynssafel");
	}

	public static ElementInfo getFyricFelDadLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Fyric Fel Dad",
					new String[]{"Fyric Fel Dad"}, 
					"Aucune information supplémentaire pour cette personne.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.purple,
					"logofelfather");
	}

	public static ElementInfo getTodrFelLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Todr Fel",
					new String[]{"Todr Fel"}, 
					"Loyal et valeureux, cet impérial est le frère cadet de Soontir Fel.  ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.purple,
					"logotodrfel");
	}

	public static ElementInfo getAjaiFelLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ajai Fel",
					new String[]{"Ajai Fel"}, 
					"Femme du cadet Todr Fel, elle privilégia de nombreuses faveurs grâce au titre de Baron de Soontir Fel.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.purple,
					"logoajaifel");
	}

	public static ElementInfo getFyricFelLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Fyric Fel",
					new String[]{"Fyric Fel"}, 
					"Jeune Fel qui fut kidnappé afin de faire pression sur la famille Fel suite à la défection de Soontir Fel.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.purple,
					"logofyricfel");
	}

	public static ElementInfo getSyalAntillesFelLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Syal Antilles Fel",
					new String[]{"Syal Antilles Fel"}, 
					"Fugant la vie jugée rustre de ses parents, elle devint une actrice renommée sous l'Empire Galactique avec pour nom d'emprun Wynssa Starflare.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.kaki,
					"logosyalantillesfel");
	}

	public static ElementInfo getDiricWessiriLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Diric Wessiri",
					new String[]{"Diric Wessiri"}, 
					"Héritier d'une riche famille de Corellia, Diric Wessiri épousa une enquêtrice de la CorSec, Iella Wessiri. Avec Gil Bastra, Corran Horn et elle, il passa dans la clandestinité pour échapper à Kirtan Loor.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.kaki,
					"logounknown");
	}

	public static ElementInfo getJaggedAntillesLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jagged Antilles",
					new String[]{"Jagged Antilles"}, 
					"Corellien d'origine, il fut tué avec sa femme Zena quelques temps avant la bataille de Yavin 4.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.kaki,
					"logojaggedantilles");
	}

	public static ElementInfo getZenaAntillesLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Zena Antilles",
					new String[]{"Zena Antilles"}, 
					"Corellienne d'origine, elle fut tuée avec son mari quelques temps avant la bataille de Yavin 4.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.kaki,
					"logozenaantilles");
	}

	public static ElementInfo getMyriAntillesLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Myri Antilles",
					new String[]{"Myri Antilles"}, 
					"Myri Antilles était la plus jeune fille de Wedge et Iella Antilles et celle qui avait hérité des talents d'espionne de sa mère.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.kaki,
					"logomyriantilles");
	}

	public static ElementInfo getSyalAntillesLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Syal Antilles",
					new String[]{"Syal Antilles"}, 
					"Syal Antilles était la fille ainée de Iella et Wedge Antilles dont elle hérita des talents de pilote, qu'elle prouva au cours de la Nouvelle Guerre Civile Galactique.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.kaki,
					"logosyalantilles");
	}

	public static ElementInfo getMicahRawkLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Micah Rawk",
					new String[]{"Micah Rawk"}, 
					"Jeune Cathar esclave puis adopté par Nat Skywalker (Bantha Rawk) et Droo Rawk.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.pink,
					"logomicahrawk");
	}

	public static ElementInfo getVisasMarrLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Visas Marr",
					new String[]{"Visas Marr"}, 
					"Jeune Miraluka, Visas Marr fut la seule survivante de sa planète natale, Katarr, après le désastre orchestré par Dark Nihilus. Il devint son nouveau maître, jusqu'à l'intervention de l'Exilée Jedi, laquelle l'aida pas à pas à rejoindre le Côté Lumineux.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.mediumgreen,
					"logovisasmarr");
	}

	public static ElementInfo getDarkBandonLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Bandon",
					new String[]{"Dark Bandon"}, 
					"Dark Bandon était une Main de l'Ombre Sith, élève de Dark Malak, qui vécut durant la Guerre Civile des Jedi.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.mediumgreen,
					"logodarkbandon");
	}

	public static ElementInfo getDarkVenamisLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Venamis",
					new String[]{"Dark Venamis"}, 
					"Mâle Bith, Dark Venamis fut découvert par Dark Tenebrous, lui-même Bith, lequel lui ordonna, après sa formation, de tuer son premier apprenti Sith, Dark Plagueis.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"logounknown");
	}

	public static ElementInfo getFlintLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Flint",
					new String[]{"Flint"}, 
					"Choisi par Dark Vador pour être son apprenti. Après la mort de ce dernier, il devint l'apprenti de la Dame Noire Lumiya.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"logoflint");
	}

	public static ElementInfo getDarkReaveLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dark Reave",
					new String[]{"Dark Reave"}, 
					"Membre du Nouvel Ordre Sith, il fut contaminé par la maladie des rakghoules.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.mediumorange,
					"logodarkreave");
	}

	public static ElementInfo getOmminLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ommin",
					new String[]{"Ommin"}, 
					"Descendant direct de Freedon Nadd qui affronta les Jedi durant la Révolte Naddiste.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.kaki,
					"logoommin");
	}

	public static ElementInfo getNaatLareLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Naat Lare",
					new String[]{"Naat Lare"}, 
					"Mâle Nautolan à l'esprit dérangé, Naat Lare fut repéré par Dark Venamis, qui l'aida à s'échapper de l'asile dans lequel il était enfermé.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"logounknown");
	}

	public static ElementInfo getEspaceHuttCommon() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Espace Hutt",
					new String[]{"Espace Hutt"}, 
					"Régions autonomes de la galaxie. Le nom provient de l'espèce Hutt qui domine la région.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.green,
					"huttspace");
	}

	public static ElementInfo getHegemonieCorellienneLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Hégémonie Corellienne",
					new String[]{"Hégémonie Corellienne"}, 
					"Groupe de systèmes solaires de la République Galactique et qui ont refusé de prendre part au combat entre Alsakan et Coruscant.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.orange,
					"logounknown");
	}

	public static ElementInfo getEspaceChissLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Espace Chiss",
					new String[]{"Espace Chiss"}, 
					"Système gouvernemental des Chiss, qui domine les Régions Inconnues.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.orange,
					"chissascendance1");
	}

	public static ElementInfo getEspaceAlsakanLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Espace Alsakan",
					new String[]{"Espace Alsakan"}, 
					"Les conflits contre Alsakan opposèrent la planète et République Galactique, de -17 018 à -3017, pour le contrôle des Mondes du Noyau et de la Zone d'Expansion.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"alsakanconflict1");
	}

	public static ElementInfo getJediNoirsLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jedi Noirs",
					new String[]{"Jedi Noirs"}, 
					"Les Jedi Noir sont des êtres sensibles à la Force, souvent d'anciens Jedi, qui ont choisi de nier le côté Lumineux de la Force et/ou suivre le côté obscur.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"darkjedi");
	}

	public static ElementInfo getKadrianSeyLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kadrian Sey",
					new String[]{"Kadrian Sey"}, 
					"Jedi Noire Zabrak et aide de camp de Dooku durant la Guerre des Clones, tuée par Quinlan Vos sur Kiffu.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.mediumpurple,
					"kadriansey");
	}

	public static ElementInfo getChasePiruLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Chase Piru",
					new String[]{"Chase Piru"}, 
					"Jedi s'occupant d'un Clan d'apprenti sur Bogden 3 et ayant survécu à l'Ordre 66.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"chasepiru1");
	}

	public static ElementInfo getJiroLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jiro",
					new String[]{"Jiro"}, 
					"Jeune Zabrak Jedi rescapée de l'Ordre 66 avec Chase Piru et K'Kruhk.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"jiro1");
	}

	public static ElementInfo getSeddwiaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Seddwia",
					new String[]{"Seddwia"}, 
					"Apprentie Jedi respacée de l'Ordre 66 avec K'Kruhk et Chase.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"seddwia1");
	}

	public static ElementInfo getKennanTaanzerLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kennan Taanzer",
					new String[]{"Kennan Taanzer"}, 
					"Apprenti Padawan rescapé de l'Ordre 66 et fils de Crys Taanzer.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"kennantaanzer1");
	}

	public static ElementInfo getGenelLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Genel",
					new String[]{"Genel"}, 
					"Jeune Jedi Duros rescapé de l'Ordre 66 avec K'Kruhk et Chase.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"genel1");
	}

	public static ElementInfo getOnkyaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Onkya",
					new String[]{"Onkya"}, 
					"Jeune Jedi Mon Cal rescapée de l'Ordre 66 avec K'Kruhk et Chase.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"onkya1");
	}

	public static ElementInfo getBhatJulLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Bhat Jul",
					new String[]{"Bhat Jul"}, 
					"Padawan de A'Sharad Hett, il fut tué durant la Bataille d'Aargonar au cours de la Guerre des Clones.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"bhatjul1");
	}

	public static ElementInfo getLilitTwoseasLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Lilit Twoseas",
					new String[]{"Lilit Twoseas"}, 
					"Premier Maître de K'Kruhk, elle mourut durant le Soulèvement Yinchorri.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"lilittwoseas1");
	}

	public static ElementInfo getJonAntillesLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jon Antilles",
					new String[]{"Jon Antilles"}, 
					"Jedi énigmatique mort sur Queyta pendant la Guerre des Clones.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"jonantilles1");
	}

	public static ElementInfo getKosulAyadaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kosul Ayada",
					new String[]{"Kosul Ayada"}, 
					"Maitre Kosul Ayada était un Herglic sensible à la Force qui fut recruté par l'Ordre Jedi et qui fut le Maître Jedi d'Eeth Koth.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"kosulayada1");
	}

	public static ElementInfo getKarVastorLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kar Vastor",
					new String[]{"Kar Vastor"}, 
					"Guerrier Korunnai ayant participé aux Guerres Estivales.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"karvastor1");
	}

	public static ElementInfo getNaatReathLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Naat Reath",
					new String[]{"Naat Reath"}, 
					"L'apprentie Naat Reath, soeur de Stam Reath, fut choisie pour être la Padawan d'Echuu Shen-Jon après la mort de son frère.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"naatreath1");
	}

	public static ElementInfo getStamReathLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Stam Reath",
					new String[]{"Stam Reath"}, 
					"Premier apprenti d'Echuu Shen-Jon. Il mourra de la main de Sev'Rance Taan, une acolyte du Comte Dooku, le premier jour de la Guerre des Clones.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"stamreath1");
	}

	public static ElementInfo getIkritLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Ikrit",
					new String[]{"Ikrit"}, 
					"Jedi de l'Ancienne République qui se sacrifia contre les Yuuzhan Vong.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"ikrit1");
	}

	public static ElementInfo getMikoRegliaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Miko Reglia",
					new String[]{"Miko Reglia"}, 
					"Miko Reglia était le jeune apprenti de Kyp Durron, qui fut tué par la Garde Prétorienne au tout début de l'invasion Yuuzhan Vong.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"mikoreglia1");
	}

	public static ElementInfo getOctaRamisLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Octa Ramis",
					new String[]{"Octa Ramis"}, 
					"Humaine de Chandrila membre du Nouvel Ordre Jedi. Elle combattit durant la guerre Yuuzhan-Vong.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"octaramis1");
	}

	public static ElementInfo getSehaDorvaldLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Seha Dorvald",
					new String[]{"Seha Dorvald"}, 
					"Jeune femme de Coruscant dont la famille fut décimée durant l'invasion Yuuzhan-Vong. Elle fut repérée par Jacen Solo pour être introduite dans le Nouvel Ordre Jedi.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"sehadorvald1");
	}

	public static ElementInfo getJadenKorrLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jaden Korr",
					new String[]{"Jaden Korr"}, 
					"Talentueux Jedi du Nouvel Ordre Jedi qui combattit de nombreux ennemis de l'Ordre.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"jadenkorr1");
	}

	public static ElementInfo getDorsk81Legends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dorsk 81",
					new String[]{"Dorsk 81"}, 
					"Quatre-vingt-unième clone de Dorsk, Dorsk 81 fut originaire de Khomm. Ayant la particularité de maîtriser la Force, ses confrères le rejetèrent, le considérant imparfait.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"dorsk811");
	}

	public static ElementInfo getDamaMontalvoLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dama Montalvo",
					new String[]{"Dama Montalvo"}, 
					"Dama Montalvo fut un Padawan torturé à mort par Vador peu avant le Conclave Jedi de Kessel.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"damamontalvo1");
	}

	public static ElementInfo getEelysaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Eelysa",
					new String[]{"Eelysa"}, 
					"Cette jeune humaine naquit quelques mois après la mort de l'Empereur sur Coruscant, et son lien avec la Force se révèla très tôt, alors que ses parents n'y étaient pas réceptifs. ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"eelysa1");
	}

	public static ElementInfo getKenyanFarlanderLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kenyan Farlander",
					new String[]{"Kenyan Farlander"}, 
					"Natif d'Agamar, sensible à la Force, Keyan Farlander rejoignit l'Alliance Rebelle après avoir entendu Un Appel à la Raison déclamé par Mon Mothma en personne. Il participa à la bataille de Yavin, à celle de Hoth et d'Endor.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"keyanfarlander1");
	}

	public static ElementInfo getZonderLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Zonder",
					new String[]{"Zonder"}, 
					"Sélonien d'origine, Zonder fut choisi comme Padawan par Barriss Offee, peu après l'élévation de cette dernière au rang de Chevalier Jedi. Et même si elle ne se limita pas à ça, leur collaboration permit notamment à Zonder de perfectionner ses talents de guérisseur.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"zonder1");
	}

	public static ElementInfo getJaxPavanLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jax Pavan",
					new String[]{"Jax Pavan"}, 
					"Fils de Lorn Pavan, Jax Pavan fut amené au Temple Jedi de Coruscant à l'âge de deux ans, peu après que son affinité avec la Force eut été découverte.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"jaxpavan1");
	}

	public static ElementInfo getRoronCorobbLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Roron Corobb",
					new String[]{"Roron Corobb"}, 
					"Maître Jedi et Général durant la Guerre des Clones, il fut chargé de l'escorte de Palpatine durant l'attaque sur Coruscant par le Général Grievous.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"roroncorobb1");
	}

	public static ElementInfo getDrakeLoGaanLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Drake Lo'Gaan",
					new String[]{"Drake Lo'Gaan"}, 
					"Le jeune Drake Lo'gaan participa avec son mentor à la défense de Coruscant lorsque celle-ci fut attaquée par les Séparatistes, dix-neuf ans avant la Bataille de Yavin.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"drakelogaan1");
	}

	public static ElementInfo getOmoBouriLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Omo Bouri",
					new String[]{"Omo Bouri"}, 
					"Omo Bouri était un Maître Jedi Wol Cabasshite qui forma Saesee Tiin et qui eut une grande influence sur sa vie.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"logounknown");
	}

	public static ElementInfo getVultaDaanatLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Vulta Daanat",
					new String[]{"Vulta Daanat"}, 
					"Jedi Noir qui fut formé par la Confrérie des Ténèbres sous les ordres du chef Skere Kaan durant les Nouvelles Guerres Sith.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.darkblue,
					"vulta1");
	}

	public static ElementInfo getJowdrrlLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Jowdrrl",
					new String[]{"Jowdrrl"}, 
					"Femelle Wookie ingénieure et mécanicienne. ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"jowdrrl1");
	}

	public static ElementInfo getDryantaLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Dryanta",
					new String[]{"Dryanta"}, 
					"Male Wookie qui fut résistant durant l'occupation impériale.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"dryanta1");
	}

	public static ElementInfo getLumpawarooLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Lumpawaroo",
					new String[]{"Lumpawaroo"}, 
					"Guerrier au sein de la communauté Rwookrrorro de Kashyyyk.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"lumpawaroo1");
	}

	public static ElementInfo getMallatobuckLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mallatobuck",
					new String[]{"Mallatobuck"}, 
					"Femme de Chewbacca et soeur du Wookie Vargi.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"mallatobuck1");
	}

	public static ElementInfo getAttichitkutLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Attichitkut",
					new String[]{"Attichitkut"}, 
					"Grand guerrier Wookie influent né en 350 av. BY. ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"attichitkut1");
	}

	public static ElementInfo getVargiLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Vargi",
					new String[]{"Vargi"}, 
					"Wookie aillant trahi les siens pour protéger sa famille.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"vargi1");
	}

	public static ElementInfo getShoranLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Shoran",
					new String[]{"Shoran"}, 
					"Leader Wookie lors de la colonisation d'Alaris Prime. Il aida Chewbacca et son ami Han Solo à libérer Kashyyyk de l'Empire Galactique.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"logounknown");
	}

	public static ElementInfo getMahraccorLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Mahraccor",
					new String[]{"Mahraccor"}, 
					"Mari de Kallabow, il construisait des calculateurs à Thikkiiana City sur Kashyyyk. ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"logounknown");
	}

	public static ElementInfo getKallabowLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Kallabow",
					new String[]{"Kallabow"}, 
					"Soeur de Chewbacca, elle travaillait avec son mari à Thikkiiana City. ",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"logounknown");
	}

	public static ElementInfo getSirrakukLegends() {
		return AppFactory.createElementInfo(AppFactory.sDocIcon,
					"Sirrakuk",
					new String[]{"Sirrakuk"}, 
					"Jeune soeur de Lowbacca. Amoureuse de vols spatiaux, elle fut employée par la Nouvelle République comme pilote de chasse.",
					"",
					"",
					0,
					0,
					null,
					ElementColor.blue,
					"logounknown");
	}


}