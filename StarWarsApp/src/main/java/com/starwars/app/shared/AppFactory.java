package com.starwars.app.shared;

import java.util.Arrays;

import com.starwars.app.client.StarWarsApp;
import com.starwars.app.client.encyclopedia.presenter.EncyclopediaModule;
import com.starwars.app.client.paper.presenter.DescriptionItem;
import com.starwars.app.client.resources.StarWarsTextResources;
import com.starwars.app.shared.ElementInfo.ElementColor;
import com.starwars.app.shared.content.StarWarsContentDataBase;
import com.starwars.app.shared.content.classic.ChronologyContentClassic;
import com.starwars.app.shared.content.classic.GalaxyContentClassic;
import com.starwars.app.shared.content.classic.GenealogyContentClassic;
import com.starwars.app.shared.content.legends.ChronologyContentLegends;
import com.starwars.app.shared.content.legends.GalaxyContentLegends;
import com.starwars.app.shared.content.legends.GenealogyContentLegends;

public class AppFactory {

	public static String sDocIcon = "L";
	public static String sEncyclopediaIcon = "5";
	public static String sChronologyIcon = "M";
	public static String sGenealogyIcon = "1";
	public static String sGalaxyIcon = "8";
	public static String sSearchIcon = "D";
	
	public static AppInfo createAppInfoClassic() {
		
		final AppInfo lAppInfo = new AppInfo();
		
		/* ROOT > ENCYCLOPEDIA */
		final SectionInfo lEncyclopedia = createSectionInfo("Encyclopédie", sEncyclopediaIcon,
				"encyclopedie",
				StarWarsTextResources.INSTANCE.encyclopedia().getText(), false);
		lAppInfo.getSectionInfos().add(lEncyclopedia);
		
			/* ROOT > ENCYCLOPEDIA > LIFE FORM */
			final SectionInfo lLifeFormEncylopedia  = createSectionInfo("Formes de vie", "5",
					"lifeform",
					StarWarsTextResources.INSTANCE.lifeform().getText(), false);
			lEncyclopedia.getSectionInfos().add(lLifeFormEncylopedia);
			
			/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE */
				final SectionInfo lPeopleEncylopedia = createSectionInfo("Personnages", "5",
						"personnages",
						StarWarsTextResources.INSTANCE.people().getText(), false);
				lLifeFormEncylopedia.getSectionInfos().add(lPeopleEncylopedia);
				
					/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > SENSITIVE */
					final SectionInfo lSensitivesPeopleEncylopedia = createSectionInfo("Sensitifs", "5",
							"sensitivepeople",
							StarWarsTextResources.INSTANCE.peopleforce().getText(), false);
					lPeopleEncylopedia.getSectionInfos().add(lSensitivesPeopleEncylopedia);
										
						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > SENSITIVE > SITH AND DARK JEDI */
						final SectionInfo lSithPeopleEncylopedia = createSectionInfo("Côté Obscur", "5",
								"sithpeople",
								StarWarsTextResources.INSTANCE.peopleforcesith().getText(), true);
						lSensitivesPeopleEncylopedia.getSectionInfos().add(lSithPeopleEncylopedia);
						
						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > SENSITIVE > JEDI */
						final SectionInfo lJediPeopleEncylopedia = createSectionInfo("Côté Clair", "5",
								"jedipeople",
								StarWarsTextResources.INSTANCE.peopleforcejedi().getText(), true);
						lSensitivesPeopleEncylopedia.getSectionInfos().add(lJediPeopleEncylopedia);
						
						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > SENSITIVE > BALANCE */
						final SectionInfo lBalancePeopleEncylopedia = createSectionInfo("Équilibre", "5",
								"balancepeople",
								StarWarsTextResources.INSTANCE.peopleforcebalance().getText(), true);
						lSensitivesPeopleEncylopedia.getSectionInfos().add(lBalancePeopleEncylopedia);
						
					/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > IMPERIAL */
					final SectionInfo lImperialPeopleEncylopedia = createSectionInfo("Impériaux", "5",
								"imperialpeople",
								StarWarsTextResources.INSTANCE.peopleimp().getText(), false);
						lPeopleEncylopedia.getSectionInfos().add(lImperialPeopleEncylopedia);
					
						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > IMPERIAL > MILITARY */
						final SectionInfo lMilitaryImperialPeopleEncylopedia = createSectionInfo("Militaires", "5",
									"imperialmilitary",
									StarWarsTextResources.INSTANCE.peopleimp().getText(), true);
							lImperialPeopleEncylopedia.getSectionInfos().add(lMilitaryImperialPeopleEncylopedia);
						
						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > IMPERIAL > SOLDIER */
						final SectionInfo lSoldierImperialPeopleEncylopedia = createSectionInfo("Troupes", "5",
								"imperialsoldier",
								StarWarsTextResources.INSTANCE.peopleimp().getText(), true);
						lImperialPeopleEncylopedia.getSectionInfos().add(lSoldierImperialPeopleEncylopedia);

						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > CSI */
						final SectionInfo lSeparatistPeopleEncylopedia = createSectionInfo("Séparatistes", "5",
								"csipeople",
								StarWarsTextResources.INSTANCE.peoplecsi().getText(), false);
						lPeopleEncylopedia.getSectionInfos().add(lSeparatistPeopleEncylopedia);
						
						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > CSI > MILITARY */
						final SectionInfo lMilitarySeparatistPeopleEncylopedia = createSectionInfo("Militaires", "5",
								"csimilitary",
								StarWarsTextResources.INSTANCE.peoplecsi().getText(), true);
						lSeparatistPeopleEncylopedia.getSectionInfos().add(lMilitarySeparatistPeopleEncylopedia);

						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > CSI > INDUSTRIAL */
						final SectionInfo lIndustrialSeparatistPeopleEncylopedia = createSectionInfo("Industriels", "5",
								"csiindustrial",
								StarWarsTextResources.INSTANCE.peoplecsi().getText(), true);
						lSeparatistPeopleEncylopedia.getSectionInfos().add(lIndustrialSeparatistPeopleEncylopedia);
						
						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > CSI > SOLDIER */
						final SectionInfo lSoldierSeparatistPeopleEncylopedia = createSectionInfo("Troupes", "5",
								"csisoldier",
								StarWarsTextResources.INSTANCE.peoplecsi().getText(), true);
						lSeparatistPeopleEncylopedia.getSectionInfos().add(lSoldierSeparatistPeopleEncylopedia);
						
					/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > REPUBLIC */
					final SectionInfo lRepublicPeopleEncylopedia = createSectionInfo("Républicains", "5",
							"reppeople",
							StarWarsTextResources.INSTANCE.peoplerep().getText(), false);
					lPeopleEncylopedia.getSectionInfos().add(lRepublicPeopleEncylopedia);
					
						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > REPUBLIC > MILITARY */
						final SectionInfo lMilitaryRepublicPeopleEncylopedia = createSectionInfo("Militaires", "5",
								"repmilitary",
								StarWarsTextResources.INSTANCE.peoplerep().getText(), true);
						lRepublicPeopleEncylopedia.getSectionInfos().add(lMilitaryRepublicPeopleEncylopedia);

						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > REPUBLIC > POLITIC */
						final SectionInfo lPoliticRepublicPeopleEncylopedia = createSectionInfo("Politiques", "5",
								"reppolitic",
								StarWarsTextResources.INSTANCE.peoplerep().getText(), true);
						lRepublicPeopleEncylopedia.getSectionInfos().add(lPoliticRepublicPeopleEncylopedia);

						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > REPUBLIC > SOLDIER */
						final SectionInfo lSoldierRepublicPeopleEncylopedia = createSectionInfo("Troupes", "5",
								"repsoldier",
								StarWarsTextResources.INSTANCE.peoplerep().getText(), true);
						lRepublicPeopleEncylopedia.getSectionInfos().add(lSoldierRepublicPeopleEncylopedia);

					/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > REBEL */
					final SectionInfo lRebelPeopleEncylopedia = createSectionInfo("Rebelles", "5",
							"rebelpeople",
							StarWarsTextResources.INSTANCE.peoplereb().getText(), true);
					lPeopleEncylopedia.getSectionInfos().add(lRebelPeopleEncylopedia);

					/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > OUTLAW */
					final SectionInfo lOutlawPeopleEncylopedia = createSectionInfo("Hors-la-loi", "5",
							"outlawpeople",
							StarWarsTextResources.INSTANCE.peopleout().getText(), true);
					lPeopleEncylopedia.getSectionInfos().add(lOutlawPeopleEncylopedia);

					/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > CIVIL */
					final SectionInfo lCivilPeopleEncylopedia = createSectionInfo("Civils", "5",
							"civilspeople",
							StarWarsTextResources.INSTANCE.peoplecivil().getText(), true);
					lPeopleEncylopedia.getSectionInfos().add(lCivilPeopleEncylopedia);

					/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > DROID */
					final SectionInfo lDroidPeopleEncylopedia = createSectionInfo("Droïdes", "5",
							"droidpeople",
							StarWarsTextResources.INSTANCE.peopledroid().getText(), true);
					lPeopleEncylopedia.getSectionInfos().add(lDroidPeopleEncylopedia);

				/* ROOT > ENCYCLOPEDIA > LIFE FORM > CREATURE */
				final SectionInfo lCreatureEncylopedia = createSectionInfo("Créatures", "5",
						"creatures",
						StarWarsTextResources.INSTANCE.creatures().getText(), true);
				lLifeFormEncylopedia.getSectionInfos().add(lCreatureEncylopedia);

				/* ROOT > ENCYCLOPEDIA > LIFE FORM > SPECIES */
				final SectionInfo lSpeciesEncylopedia = createSectionInfo("Espèces", "5",
						"species",
						StarWarsTextResources.INSTANCE.species().getText(), true);
				lLifeFormEncylopedia.getSectionInfos().add(lSpeciesEncylopedia);

			/* ROOT > ENCYCLOPEDIA > SHIPS */
			final SectionInfo lShipsEncylopedia = createSectionInfo("Vaisseaux", "5",
					"vaisseaux",
					StarWarsTextResources.INSTANCE.ships().getText(), false);
			lEncyclopedia.getSectionInfos().add(lShipsEncylopedia);
			
				/* ROOT > ENCYCLOPEDIA > SHIPS > IMPERIAL FLEET */
				final SectionInfo lImperialFleet = createSectionInfo("Flotte impériale", "5",
						"imperialships",
						StarWarsTextResources.INSTANCE.shipsimp().getText(), false);
				lShipsEncylopedia.getSectionInfos().add(lImperialFleet);
				
					/* ROOT > ENCYCLOPEDIA > SHIPS > IMPERIAL FLEET > FIGHTER */
					final SectionInfo lImperialFighters = createSectionInfo("Chasseurs", "5", 
							"imperialfighters",
							StarWarsTextResources.INSTANCE.shipsfighters().getText(), true);
					lImperialFleet.getSectionInfos().add(lImperialFighters);

					/* ROOT > ENCYCLOPEDIA > SHIPS > IMPERIAL FLEET > TRANSPORT */
					final SectionInfo lImperialTransports = createSectionInfo("Navettes et transports", "5",
							"imperialtransports",
							StarWarsTextResources.INSTANCE.shipstransport().getText(), true);
					lImperialFleet.getSectionInfos().add(lImperialTransports);

					/* ROOT > ENCYCLOPEDIA > SHIPS > IMPERIAL FLEET > SD */
					final SectionInfo lImperialSD = createSectionInfo("Star Destroyers", "5",
							"imperialsd",
							StarWarsTextResources.INSTANCE.shipssd().getText(), true);
					lImperialFleet.getSectionInfos().add(lImperialSD);

					/* ROOT > ENCYCLOPEDIA > SHIPS > IMPERIAL FLEET > SSD */
					final SectionInfo lImperialSSD = createSectionInfo("Super Star Destroyers", "5",
							"imperialssd",
							StarWarsTextResources.INSTANCE.shipsssd().getText(), true);
					lImperialFleet.getSectionInfos().add(lImperialSSD);
		
					/* ROOT > ENCYCLOPEDIA > SHIPS > IMPERIAL FLEET > STATION */
					final SectionInfo lImperialStations = createSectionInfo("Stations de combat", "5",
							"imperialstations",
							StarWarsTextResources.INSTANCE.shipsstation().getText(), true);
					lImperialFleet.getSectionInfos().add(lImperialStations);
				
				/* ROOT > ENCYCLOPEDIA > SHIPS > CSI FLEET */
				final SectionInfo lCsiFleet = createSectionInfo("Flotte séparatiste", "5",
						"csiships",
						StarWarsTextResources.INSTANCE.shipscsi().getText(), false);
				lShipsEncylopedia.getSectionInfos().add(lCsiFleet);
	
					/* ROOT > ENCYCLOPEDIA > SHIPS > CSI FLEET > FIGHTER */
					final SectionInfo lCsiFighters = createSectionInfo("Chasseurs", "5",
							"csifighters",
							StarWarsTextResources.INSTANCE.shipsfighters().getText(), true);
					lCsiFleet.getSectionInfos().add(lCsiFighters);
		
					/* ROOT > ENCYCLOPEDIA > SHIPS > CSI FLEET > TRANSPORT */
					final SectionInfo lCsiTransports = createSectionInfo("Navettes et transports", "5",
							"csitransports",
							StarWarsTextResources.INSTANCE.shipstransport().getText(), true);
					lCsiFleet.getSectionInfos().add(lCsiTransports);
					
					/* ROOT > ENCYCLOPEDIA > SHIPS > CSI FLEET > SD */
					final SectionInfo lCsiSD = createSectionInfo("Croiseurs", "5",
							"csisd",
							StarWarsTextResources.INSTANCE.shipssd().getText(), true);
					lCsiFleet.getSectionInfos().add(lCsiSD);
	
				/* ROOT > ENCYCLOPEDIA > SHIPS > REBEL FLEET */
				final SectionInfo lAllianceFleet = createSectionInfo("Flotte de l'Alliance", "5",
						"rebelships",
						StarWarsTextResources.INSTANCE.shipsreb().getText(), false);
				lShipsEncylopedia.getSectionInfos().add(lAllianceFleet);
	
					/* ROOT > ENCYCLOPEDIA > SHIPS > REBEL FLEET > FIGHTER */
					final SectionInfo lAllianceFighters = createSectionInfo("Chasseurs", "5",
							"rebelfighters",
							StarWarsTextResources.INSTANCE.shipsfighters().getText(), true);
					lAllianceFleet.getSectionInfos().add(lAllianceFighters);

					/* ROOT > ENCYCLOPEDIA > SHIPS > REBEL FLEET > SD */
					final SectionInfo lAllianceSD = createSectionInfo("Croiseurs", "5",
							"rebelsd",
							StarWarsTextResources.INSTANCE.shipssd().getText(), true);
					lAllianceFleet.getSectionInfos().add(lAllianceSD);

				/* ROOT > ENCYCLOPEDIA > SHIPS > REPUBLIC FLEET */
				final SectionInfo lRepublicFleet = createSectionInfo("Flotte républicaine", "5",
						"repships",
						StarWarsTextResources.INSTANCE.shipsrep().getText(), false);
				lShipsEncylopedia.getSectionInfos().add(lRepublicFleet);
	
					/* ROOT > ENCYCLOPEDIA > SHIPS > REPUBLIC FLEET > FIGHTER */
					final SectionInfo lRepublicFighters = createSectionInfo("Chasseurs", "5",
							"repfighters",
							StarWarsTextResources.INSTANCE.shipsfighters().getText(), true);
					lRepublicFleet.getSectionInfos().add(lRepublicFighters);
		
					/* ROOT > ENCYCLOPEDIA > SHIPS > REPUBLIC FLEET > TRANSPORT */
					final SectionInfo lRepublicTransports = createSectionInfo("Navettes et transports", "5",
							"reptransports",
							StarWarsTextResources.INSTANCE.shipstransport().getText(), true);
					lRepublicFleet.getSectionInfos().add(lRepublicTransports);
					
					/* ROOT > ENCYCLOPEDIA > SHIPS > REPUBLIC FLEET > SD */
					final SectionInfo lRepublicSD = createSectionInfo("Destroyers", "5",
							"repsd",
							StarWarsTextResources.INSTANCE.shipssd().getText(), true);
					lRepublicFleet.getSectionInfos().add(lRepublicSD);
					
				/* ROOT > ENCYCLOPEDIA > SHIPS > OUTLAW FLEET */
				final SectionInfo lOutlawFleet = createSectionInfo("Vaisseaux d'hors-la-loi", "5",
						"outlawships",
						StarWarsTextResources.INSTANCE.shipsout().getText(), true);
				lShipsEncylopedia.getSectionInfos().add(lOutlawFleet);
				
				/* ROOT > ENCYCLOPEDIA > SHIPS > CIVIL FLEET */
				final SectionInfo lCivilFleet = createSectionInfo("Vaisseaux civils", "5",
						"indepships",
						StarWarsTextResources.INSTANCE.shipscivil().getText(), true);
				lShipsEncylopedia.getSectionInfos().add(lCivilFleet);
				
			/* ROOT > ENCYCLOPEDIA > VEHICLES */
			final SectionInfo lVehiclesEncylopedia = createSectionInfo("Véhicules", "5", 
					"vehicules",
					StarWarsTextResources.INSTANCE.vehicles().getText(), false);
			lEncyclopedia.getSectionInfos().add(lVehiclesEncylopedia);
			
				/* ROOT > ENCYCLOPEDIA > VEHICLES > IMPERIAL ARMY */
				final SectionInfo lImperialArmy = createSectionInfo("Armée impériale", "5",
						"imperialarmy",
						StarWarsTextResources.INSTANCE.vehiclesimp().getText(), true);
				lVehiclesEncylopedia.getSectionInfos().add(lImperialArmy);
				
				/* ROOT > ENCYCLOPEDIA > VEHICLES > CSI ARMY */
				final SectionInfo lCsiArmy = createSectionInfo("Armée séparatiste", "5",
						"csiarmy",
						StarWarsTextResources.INSTANCE.vehiclescsi().getText(), true);
				lVehiclesEncylopedia.getSectionInfos().add(lCsiArmy);
				
				/* ROOT > ENCYCLOPEDIA > VEHICLES > REPUBLIC ARMY */
				final SectionInfo lRepublicArmy = createSectionInfo("Armée républicaine", "5",
						"reparmy",
						StarWarsTextResources.INSTANCE.vehiclesrep().getText(), true);
				lVehiclesEncylopedia.getSectionInfos().add(lRepublicArmy);
				
				/* ROOT > ENCYCLOPEDIA > VEHICLES > CIVIL VEHICLES */
				final SectionInfo lCivilVehicles = createSectionInfo("Véhicules civils", "5",
						"civilvehicles",
						StarWarsTextResources.INSTANCE.vehiclescivil().getText(), true);
				lVehiclesEncylopedia.getSectionInfos().add(lCivilVehicles);
				
			/* ROOT > ENCYCLOPEDIA > FACTIONS */
			final SectionInfo lFactionsEncylopedia = createSectionInfo("Factions", "5",
					"factions",
					StarWarsTextResources.INSTANCE.factions().getText(), true);
			lEncyclopedia.getSectionInfos().add(lFactionsEncylopedia);
			
			/* ROOT > ENCYCLOPEDIA > PLANETES */
			final SectionInfo lPlanetesEncylopedia = createSectionInfo("Planètes", "5",
					"planetes",
					StarWarsTextResources.INSTANCE.planets().getText(), true);
			lEncyclopedia.getSectionInfos().add(lPlanetesEncylopedia);
			
			/* ROOT > ENCYCLOPEDIA > CONFLICTS */
			final SectionInfo lConflictEncylopedia = createSectionInfo("Conflits", "5",
					"conflict",
					StarWarsTextResources.INSTANCE.conflicts().getText(), true);
			lEncyclopedia.getSectionInfos().add(lConflictEncylopedia);
			
			/* ROOT > ENCYCLOPEDIA > TECHNOLOGIES */
			final SectionInfo lTechnologiesEncylopedia = createSectionInfo("Technologies", "5",
					"materiels",
					StarWarsTextResources.INSTANCE.technologies().getText(), false);
			lEncyclopedia.getSectionInfos().add(lTechnologiesEncylopedia);
			
				/* ROOT > ENCYCLOPEDIA > TECHNOLOGIES > WEAPONS */
				final SectionInfo lWeapons = createSectionInfo("Armes", "5",
						"weapons",
						StarWarsTextResources.INSTANCE.weapons().getText(), true);
				lTechnologiesEncylopedia.getSectionInfos().add(lWeapons);
				
				/* ROOT > ENCYCLOPEDIA > TECHNOLOGIES > NAVIGATION */
				final SectionInfo lNavigation = createSectionInfo("Navigation", "5",
						"navigation",
						StarWarsTextResources.INSTANCE.navigation().getText(), true);
				lTechnologiesEncylopedia.getSectionInfos().add(lNavigation);
				
				/* ROOT > ENCYCLOPEDIA > TECHNOLOGIES > UTILITIES */
				final SectionInfo lUse = createSectionInfo("Utilitaire", "5",
						"utilities",
						StarWarsTextResources.INSTANCE.uses().getText(), true);
				lTechnologiesEncylopedia.getSectionInfos().add(lUse);
				
				/* ROOT > ENCYCLOPEDIA > TECHNOLOGIES > METERIALS */
				final SectionInfo lMaterial = createSectionInfo("Matériaux", "5",
						"materials",
						StarWarsTextResources.INSTANCE.materials().getText(), true);
				lTechnologiesEncylopedia.getSectionInfos().add(lMaterial);
				
			/* ROOT > ENCYCLOPEDIA > CONCEPTS */
			final SectionInfo lConceptEncyclopedia = createSectionInfo("Concepts", "5",
					"concepts",
					StarWarsTextResources.INSTANCE.concepts().getText(), true);
			lEncyclopedia.getSectionInfos().add(lConceptEncyclopedia);
				
		/* ROOT > CHRONOLOGY */
		SectionInfo lChronology = createSectionInfo("Chronologie", sChronologyIcon,
				"chronology",
				StarWarsTextResources.INSTANCE.chronology().getText(), true);
		lAppInfo.getSectionInfos().add(lChronology);
		
		/* ROOT > GENEALOGY */
		SectionInfo lGenealogy = createSectionInfo("Généalogie", sGenealogyIcon,
				"genealogie",
				StarWarsTextResources.INSTANCE.genealogy().getText(), true);
		lAppInfo.getSectionInfos().add(lGenealogy);
		
		/* ROOT > GALAXY */
		SectionInfo lGalaxy = createSectionInfo("Cartographie", sGalaxyIcon,
				"cartography",
				StarWarsTextResources.INSTANCE.galaxy().getText(), true);
		lAppInfo.getSectionInfos().add(lGalaxy);

		/* ROOT > SEARCH */
		SectionInfo lSearch = createSectionInfo("Recherche", sSearchIcon,
				"search",
				StarWarsTextResources.INSTANCE.research().getText(), true);
		lSearch.setResearch(true);
		lAppInfo.getSectionInfos().add(lSearch);

		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAsajjVentressClassic);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCinquiemeFrereClassic);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkMaulClassic);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkPlagueisClassic);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkSidiousClassic);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkVadorClassic);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDookuClassic);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHuitiemeFrereClassic);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLInquisiteurClassic);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKyloRenClassic);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSeptiemeSoeurClassic);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSnokeClassic);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTalzinClassic);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSavageOpressClassic);
		  
    	  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAaylaSecuraClassic);
    	  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAdiGalliaClassic);
    	  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAgenKolarClassic);
    	  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAhsokaTanoClassic);
    	  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAnakinSkywalkerClassic);
    	  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBarissOffeeClassic);
    	  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBenSoloClassic);
    	  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sColemanTreborCommon);
    	  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDepaBillabaClassic);
    	  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sEethKothClassic);
    	  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sEvenPiellClassic);
    	  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sEzraBridgerClassic);
		  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJocastaNuClassic);
		  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKananJarrusClassic);
		  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKiAdiMundiClassic);
		  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKitFistoClassic);
		  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLukeSkywalkerClassic);
		  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLuminaraUnduliClassic);
		  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMaceWinduClassic);
		  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNahdarVebbClassic);
		  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sObiWanKenobiClassic);
		  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOppoRancisisClassic);
		  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPloKoonClassic);
		  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPongKrellClassic);
		  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sQuiGonJinnClassic);
		  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sQuinlanVosClassic);
		  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sReyClassic);
		  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSaeseeTiinClassic);
		  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sShaakTiClassic);
		  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSifoDyasCommon);
		  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sStassAllieClassic);
		  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sYaddleClassic);
		  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sYaraelPoofClassic);
		  lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sYodaClassic);
	
		  lBalancePeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLaFilleClassic);
		  lBalancePeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLeFilsClassic);
		  lBalancePeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLePereClassic);
	
		  lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCassioTaggeCommon);
		  lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCumberlayneAreskoClassic);
		  lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDreedClassic);
		  lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sFirmusPiettCommon);
		  lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGulinClassic);
		  lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHuxClassic);
		  lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJanusGreejatusCommon);
		  lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJharedMontferratClassic);
		  lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKallusClassic);
		  lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKassiusKonstantineClassic);
		  lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKendalOzzelCommon);
		  lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLerrDuvatClassic);
		  lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLorthNeedaCommon);
		  lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMaximilianVeersCommon);
		  lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMylesGrintClassic);
		  lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPhasmaClassic);
		  lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTerexClassic);
		  lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTiaanJerjerrodCommon);
		  lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTulaClassic);
		  lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sVenkaCommon);
		  lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWilhuffTarkinClassic);
		  lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sYogarLysteClassic);
	
		  lSoldierImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sFlametrooperClassic);
		  lSoldierImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPiloteTIECommon);
		  lSoldierImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sScouttrooperCommon);
		  lSoldierImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSnowtrooperCommon);
		  lSoldierImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sStormtrooperCommon);
	
		  lMilitarySeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAgrussClassic);
		  lMilitarySeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAtaiMolecClassic);
		  lMilitarySeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDaultayDofineCommon);
		  lMilitarySeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGrievousClassic);
		  lMilitarySeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLokDurdClassic);
		  lMilitarySeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLottDodClassic);
		  lMilitarySeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLushrosDofineCommon);
		  lMilitarySeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMarTuukClassic);
		  lMilitarySeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOOM10Common);
		  lMilitarySeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOOM9Common);
		  lMilitarySeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTA175Classic);
		  lMilitarySeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTX20Classic);
		  lMilitarySeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTrenchClassic);
		  lMilitarySeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWhormLoathsomClassic);
	
		  lIndustrialSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNuteGunrayClassic);
		  lIndustrialSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRuneHaakoCommon);
		  lIndustrialSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sShuMaiCommon);
		  lIndustrialSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSanHillCommon);
		  lIndustrialSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPoNudoCommon);
		  lIndustrialSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPoggleleBrefClassic);
		  lIndustrialSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPasselArgenteCommon);
		  lIndustrialSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWatTamborCommon);
	
		  lSoldierSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDroidedecombatB1Common);
		  lSoldierSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDroidedecombatB2Common);
		  lSoldierSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDroideBuzzCommon);
		  lSoldierSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDroideDestroyerCommon);
		  lSoldierSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDroidededemolitionCommon);
		  lSoldierSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMagnagardeIG100Common);
	
		  lMilitaryRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAppoClassic);
		  lMilitaryRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBacaraCommon);
		  lMilitaryRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBoilClassic);
		  lMilitaryRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCodyClassic);
		  lMilitaryRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGregarTyphoClassic);
		  lMilitaryRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sQuarshPanakaCommon);
		  lMilitaryRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRexClassic);
		  lMilitaryRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWaxerClassic);
		  lMilitaryRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWullfYularenClassic);
		  lMilitaryRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCoburnClassic);
	
		  lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAksMoeClassic);
		  lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBailOrganaClassic);
		  lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPadmeNaberrieClassic);
		  lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOrnFreeTaaClassic);
		  lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSheevPalpatineClassic);
		  lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJarJarBinksClassic);
		  lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJamilliaCommon);
		  lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRiyoChuchiClassic);
		  lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSatineKryzeClassic);
		  lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sFinisValorumClassic);
		  lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLamaSuCommon);
	
		  lSoldierRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCloneCommandantCommon);
		  lSoldierRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sClonedechocCommon);
		  lSoldierRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sClonedemineurClassic);
		  lSoldierRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sClonedereconnaissanceCommon);
		  lSoldierRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCloneeclaireurCommon);
		  lSoldierRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCloneGardedeCoruscantCommon);
		  lSoldierRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sClonemarineCommon);
		  lSoldierRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sClonepiloteCommon);
		  lSoldierRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sClonepiloteTRTTCommon);
		  lSoldierRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCommandoduSenatClassic);
		  lSoldierRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSoldatARCCommon);
		  lSoldierRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSoldatCloneCommon);
	
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGialAckbarClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBiggsDarklighterClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBraylenStrammClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCarlistRieekanClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sColeetClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCrixMadineClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDackRalterClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sEnebRayClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sEvaanVerlaineClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sFinnClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGinaMoonsongClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJanDodonnaClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJekPorkinsClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJessikaPavaClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJunSatoClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKareKunClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKesDameronClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKorrSellaClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLeiaOrganaClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLuloClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMonMothmaClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNienNunbClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOddyMuvaClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPoeDameronClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSharaBeyClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTemminWexleyClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTychoCelchuClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWedgeAntillesClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWesJansonClassic);
		  lRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sZevSenescaCommon);
	
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAurraSingClassic);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBibFortunaClassic);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBobaFettClassic);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBoKaTanKryzeClassic);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBosskClassic);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCadBaneClassic);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sChewbaccaClassic);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCikatroVizagoClassic);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDengarClassic);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGarazebOrreliosClassic);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGhaNachktClassic);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGrakkusClassic);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGreedoCommon);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHanSoloClassic);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHeraSyndullaClassic);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHondoOhnakaClassic);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJabbaleHuttClassic);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJangoFettClassic);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKrrsantanleNoirClassic);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLandoCalrissianClassic);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMazKanataClassic);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPreVizslaClassic);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSabineWrenClassic);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSanaSoloClassic);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sZamWesellClassic);
		  lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sZiroleHuttClassic);
	
		  lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAphraClassic);
		  lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBeruWhitesunCommon);
		  lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBossNassCommon);
		  lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sClieggLarsCommon);
		  lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDexterJettsterCommon);
		  lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sFarnayClassic);
		  lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJobalNaberrieCommon);
		  lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJoraAstaneClassic);
		  lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLobotClassic);
		  lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLorSanTekkaClassic);
		  lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOwenLarsClassic);
		  lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTaceClassic);
		  lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTarffulCommon);
		  lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTarpalsCommon);
		  lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSarcoPlankClassic);
	      lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSebulbaCommon);
		  lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sShmiSkywalkerCommon);
		  lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sUwaPareeceClassic);
		  lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWattoCommon);

		  lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.s000Classic);
		  lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBB8Classic);
		  lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBT1Classic);
		  lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sC3POClassic);
		  lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sChopperClassic);
		  lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDroideenergetiqueCommon);
		  lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDroidemedicalCommon);
		  lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDroideprotocolaireCommon);
		  lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHuyangClassic);
		  lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sIG86Common);
		  lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDroideMecanoCommon);
		  lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sR2D2Classic);
		  lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sR2KTClassic);
		  lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sR3S6Classic);
		  lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sR4P17Classic);
		  lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sR6H5Classic);
		  lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sR7A7Classic);
		  lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sR7D4Classic);
		  lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWA7Common);
	
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAcklayCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAiwhaCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBansheeClassic);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBanthaCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sColoCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDewbackCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDianogaCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDragonKraytCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sEopieCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sExogorthCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sFambaaCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGundarkCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKaaduCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMidichlorienClassic);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMitederocheCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMynockCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNarglatchClassic);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNexuCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNunaCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOpeeCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRancorCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sReekCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSandoCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSarlaccCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sShaakCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTauntaunCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sVaractylCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWampaCommon);
		  lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBeteZilloClassic);
		
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAqualishCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBesaliskCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBithCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBothanCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCereenCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sChadraFanCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sChagrianCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sChalactanCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sChevinCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sClawditeCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDathomirienCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDevaronienCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDugCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDurosCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sEwokCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGamorreenCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGeonosienCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGunganCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGranCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHarchClassic);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHumainCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHuttCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sIktotchiCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sIthorienCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJawaCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKaleeshCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKaminoenCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKelDorCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKorunnaiCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKubazCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLannikCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMirialanCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMonCalCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNautolanCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNeimodienCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNiktoCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNosaurienLegends);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOrtolanCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPauanCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPykeClassic);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sQuarrenCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRodienCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSkakoanCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSullustainCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTalzCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sThisspiasienCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTogrutaCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sToydarienCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTrandoshanCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTuskenClassic);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTwilekCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sUgnaughtCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sUmbaranCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sUtaiCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sVurkCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWeequayCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWookieeCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sZabrakCommon);

		lImperialFighters.getElementInfos().add(StarWarsContentDataBase.sChasseurTIECommon);
		lImperialFighters.getElementInfos().add(StarWarsContentDataBase.sIntercepteurTIECommon);
		lImperialFighters.getElementInfos().add(StarWarsContentDataBase.sBombardierTIECommon);
		lImperialFighters.getElementInfos().add(StarWarsContentDataBase.sTIEAvancex1Common);
		lImperialFighters.getElementInfos().add(StarWarsContentDataBase.sTIEFOClassic);
		lImperialFighters.getElementInfos().add(StarWarsContentDataBase.sTIESFClassic);
			
		lImperialTransports.getElementInfos().add(StarWarsContentDataBase.sBargeTitanCommon);
		lImperialTransports.getElementInfos().add(StarWarsContentDataBase.sNavetteLambdaCommon);
		lImperialTransports.getElementInfos().add(StarWarsContentDataBase.sNavetteSentinelleCommon);
		lImperialTransports.getElementInfos().add(StarWarsContentDataBase.sNavetteUpsilonClassic);
		lImperialTransports.getElementInfos().add(StarWarsContentDataBase.sTransporteurClassic);

		lImperialSD.getElementInfos().add(StarWarsContentDataBase.sClasseImperialICommon);
		lImperialSD.getElementInfos().add(StarWarsContentDataBase.sClasseImperialIICommon);
		lImperialSD.getElementInfos().add(StarWarsContentDataBase.sClasseResurgentClassic);
		lImperialSD.getElementInfos().add(StarWarsContentDataBase.sClasseTectorCommon);
		lImperialSD.getElementInfos().add(StarWarsContentDataBase.sClasseVictoryCommon);
	
		lImperialSSD.getElementInfos().add(StarWarsContentDataBase.sClasseExecutorClassic);
	
		lImperialStations.getElementInfos().add(StarWarsContentDataBase.sEtoiledelaMortCommon);
		lImperialStations.getElementInfos().add(StarWarsContentDataBase.sEtoileNoireCommon);
		lImperialStations.getElementInfos().add(StarWarsContentDataBase.sStationStarkillerClassic);

		lCsiFighters.getElementInfos().add(StarWarsContentDataBase.sCanonnieredroideCommon);
		lCsiFighters.getElementInfos().add(StarWarsContentDataBase.sChasseurGinivexCommon);
		lCsiFighters.getElementInfos().add(StarWarsContentDataBase.sBombardierHyenaCommon);
		lCsiFighters.getElementInfos().add(StarWarsContentDataBase.sChasseurNantexCommon);
		lCsiFighters.getElementInfos().add(StarWarsContentDataBase.sDroideTrichasseurCommon);
		lCsiFighters.getElementInfos().add(StarWarsContentDataBase.sDroideVautourCommon);
		lCsiFighters.getElementInfos().add(StarWarsContentDataBase.sBelbullabCommon);
	
		lCsiTransports.getElementInfos().add(StarWarsContentDataBase.sBargeC9979Common);
		lCsiTransports.getElementInfos().add(StarWarsContentDataBase.sCroiseurDiamantCommon);
		lCsiTransports.getElementInfos().add(StarWarsContentDataBase.sFuseeHardcellCommon);
		lCsiTransports.getElementInfos().add(StarWarsContentDataBase.sNavetteSheathipedeCommon);
		lCsiTransports.getElementInfos().add(StarWarsContentDataBase.sVoiliersolaireCommon);

		lCsiSD.getElementInfos().add(StarWarsContentDataBase.sVaisseauNoyauCommon);
		lCsiSD.getElementInfos().add(StarWarsContentDataBase.sCroiseurLucrehulkCommon);
		lCsiSD.getElementInfos().add(StarWarsContentDataBase.sClasseMunificientCommon);
		lCsiSD.getElementInfos().add(StarWarsContentDataBase.sClasseProvidenceCommon);
		lCsiSD.getElementInfos().add(StarWarsContentDataBase.sClasseRecusantCommon);
		lCsiSD.getElementInfos().add(StarWarsContentDataBase.sClasseSubjugatorCommon);
		lCsiSD.getElementInfos().add(StarWarsContentDataBase.sStationSkytopClassic);

		lAllianceFighters.getElementInfos().add(StarWarsContentDataBase.sAWingCommon);
		lAllianceFighters.getElementInfos().add(StarWarsContentDataBase.sBWingCommon);
		lAllianceFighters.getElementInfos().add(StarWarsContentDataBase.sXWingCommon);
		lAllianceFighters.getElementInfos().add(StarWarsContentDataBase.sYWingCommon);
		lAllianceFighters.getElementInfos().add(StarWarsContentDataBase.sSpeederT47Common);

		lAllianceSD.getElementInfos().add(StarWarsContentDataBase.sCroiseurMC40Common);
		lAllianceSD.getElementInfos().add(StarWarsContentDataBase.sCroiseurMC80Common);
		lAllianceSD.getElementInfos().add(StarWarsContentDataBase.sCroiseurMC90Common);
		lAllianceSD.getElementInfos().add(StarWarsContentDataBase.sFregateNebulonCommon);

		lRepublicFighters.getElementInfos().add(StarWarsContentDataBase.sARC170Common);
		lRepublicFighters.getElementInfos().add(StarWarsContentDataBase.sChasseurCloneCommon);
		lRepublicFighters.getElementInfos().add(StarWarsContentDataBase.sIntercepteurETACommon);
		lRepublicFighters.getElementInfos().add(StarWarsContentDataBase.sVWingCommon);

		lRepublicTransports.getElementInfos().add(StarWarsContentDataBase.sCannoniereTIOBACommon);
		lRepublicTransports.getElementInfos().add(StarWarsContentDataBase.sCorvetteCR70Common);
		lRepublicTransports.getElementInfos().add(StarWarsContentDataBase.sCroiseurCR20Common);
		lRepublicTransports.getElementInfos().add(StarWarsContentDataBase.sNavetteThetaCommon);

		lRepublicSD.getElementInfos().add(StarWarsContentDataBase.sClasseAcclamatorICommon);
		lRepublicSD.getElementInfos().add(StarWarsContentDataBase.sClasseArquitensClassic);
		lRepublicSD.getElementInfos().add(StarWarsContentDataBase.sClasseVenatorCommon);

		lOutlawFleet.getElementInfos().add(StarWarsContentDataBase.sFauconMilleniumClassic);
		lOutlawFleet.getElementInfos().add(StarWarsContentDataBase.sGhostClassic);
		lOutlawFleet.getElementInfos().add(StarWarsContentDataBase.sSlave1Classic);
		lOutlawFleet.getElementInfos().add(StarWarsContentDataBase.sVoltCobraClassic);

		lCivilFleet.getElementInfos().add(StarWarsContentDataBase.sChasseurN1Common);
		lCivilFleet.getElementInfos().add(StarWarsContentDataBase.sChasseurP38Common);
		lCivilFleet.getElementInfos().add(StarWarsContentDataBase.sNefRoyaleNabooTJCommon);
		lCivilFleet.getElementInfos().add(StarWarsContentDataBase.sYachtNabooTHCommon);
	
		lImperialArmy.getElementInfos().add(StarWarsContentDataBase.sATDPClassic);
		lImperialArmy.getElementInfos().add(StarWarsContentDataBase.sTBTTCommon);
		lImperialArmy.getElementInfos().add(StarWarsContentDataBase.sTPTTCommon);
		lImperialArmy.getElementInfos().add(StarWarsContentDataBase.sTSTTCommon);
		lImperialArmy.getElementInfos().add(StarWarsContentDataBase.sSpeederbike74ZCommon);
	
		lCsiArmy.getElementInfos().add(StarWarsContentDataBase.sChardAssautBlindeCommon);
		lCsiArmy.getElementInfos().add(StarWarsContentDataBase.sChardroideHailfireCommon);
		lCsiArmy.getElementInfos().add(StarWarsContentDataBase.sChardroideNRN99Common);
		lCsiArmy.getElementInfos().add(StarWarsContentDataBase.sDroideCrabeCommon);
		lCsiArmy.getElementInfos().add(StarWarsContentDataBase.sDroideAraigneNaineCommon);
		lCsiArmy.getElementInfos().add(StarWarsContentDataBase.sDroideAraigneTraqueurCommon);
		lCsiArmy.getElementInfos().add(StarWarsContentDataBase.sSuperTankClassic);
		lCsiArmy.getElementInfos().add(StarWarsContentDataBase.sTridroideOctuptarraCommon);
		lCsiArmy.getElementInfos().add(StarWarsContentDataBase.sTransportMultiTroupesCommon);
		lCsiArmy.getElementInfos().add(StarWarsContentDataBase.sTransportdedroidesCommon);
		lCsiArmy.getElementInfos().add(StarWarsContentDataBase.sMotoRoueCommon);
		lCsiArmy.getElementInfos().add(StarWarsContentDataBase.sSTAPCommon);
	
		lRepublicArmy.getElementInfos().add(StarWarsContentDataBase.sALATCommon);
		lRepublicArmy.getElementInfos().add(StarWarsContentDataBase.sNATTCommon);
		lRepublicArmy.getElementInfos().add(StarWarsContentDataBase.sTRTTCommon);
		lRepublicArmy.getElementInfos().add(StarWarsContentDataBase.sRTTTCommon);
		lRepublicArmy.getElementInfos().add(StarWarsContentDataBase.sTOTTCommon);
		lRepublicArmy.getElementInfos().add(StarWarsContentDataBase.sJuggernautCommon);
	
		lCivilVehicles.getElementInfos().add(StarWarsContentDataBase.sAirspeederKoro2Common);
		lCivilVehicles.getElementInfos().add(StarWarsContentDataBase.sAirspeederXJ6Common);
		lCivilVehicles.getElementInfos().add(StarWarsContentDataBase.sAirspeederCommon);
		lCivilVehicles.getElementInfos().add(StarWarsContentDataBase.sBongoCommon);
		lCivilVehicles.getElementInfos().add(StarWarsContentDataBase.sChardessablesCommon);
		lCivilVehicles.getElementInfos().add(StarWarsContentDataBase.sQuadjumperClassic);
		lCivilVehicles.getElementInfos().add(StarWarsContentDataBase.sPodRacerCommon);
		lCivilVehicles.getElementInfos().add(StarWarsContentDataBase.sPodRacerdAnakinCommon);
		lCivilVehicles.getElementInfos().add(StarWarsContentDataBase.sPodRacerdeSebulbaCommon);
		lCivilVehicles.getElementInfos().add(StarWarsContentDataBase.sVoituredesnuagesCommon);
		
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAllianceIntercoorpCommon);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAllianceRebelleClassic);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBaktoidArmorClassic);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCartelHypercomClassic);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sChevaliersdeRenClassic);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sClanBancaireClassic);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCSIClassic);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCzerkaClassic);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDeathWatchClassic);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sEmpireGalactiqueClassic);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sFederationduCommerceClassic);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNouvelleRepubliqueClassic);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNouvelOrdreJediClassic);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOrdreJediClassic);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOrdreSithClassic);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPremierOrdreClassic);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRepubliqueGalactiqueClassic);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sResistanceClassic);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTechnoSyndicatClassic);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGuildeduCommerceCommon);

		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAlderaanCommon);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBespinCommon);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sChristophsisClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sConcordiaClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCoruscantClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCymoon1Classic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDagobahCommon);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDantooineCommon);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDathomirClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDQarClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sEndorClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sFeluciaClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sFlorrumClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGamorrCommon);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGeonosisClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGolmClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHosnianPrimeClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHothClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sIbaarClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sIegoClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sIllumClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJakkuClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKaminoClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKashyyykClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKesselClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKirosClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLolaSayuCommon);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLothalClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMalastareClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMandaloreClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMonCalamariClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMortisClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMustafarCommon);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNabooClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNarShaddaaClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sObaDiahClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOnderonClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOrondiaClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOrtoPlutoniaClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOvanisClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPatititePattunaClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPolisMassaCommon);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRaydoniaClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRodiaClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRuusanClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRylothClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSaleucamiClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSerennoClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSullustClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTatooineClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTethClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sUmbaraClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sVanqorClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sYavinIVClassic);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sZygerriaClassic);

		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGuerredesClonesClassic);
		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.s1rGuerreCivileGalactiqueClassic);

		lWeapons.getElementInfos().add(StarWarsContentDataBase.sArcaenergieCommon);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sArmeioniqueCommon);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sBatterieDF9Common);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sBatterieFDPTourCommon);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sBlasterDC15SCommon);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sBlasterDH17Common);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sBlasterDL44Common);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sBlasterE11Common);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sCanonEWEBCommon);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sCanonioniqueKDYCommon);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sCanonSoniqueCommon);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sDetonateurthermiqueCommon);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sFusilblasterDC15Common);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sFusilblasterDC17Common);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sSabrelaserCommon);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sSuperlaserCommon);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sTurbolaserCommon);
	
		lNavigation.getElementInfos().add(StarWarsContentDataBase.sAnneauahyperpropulsionCommon);
		lNavigation.getElementInfos().add(StarWarsContentDataBase.sBouclierdeflecteurCommon);
		lNavigation.getElementInfos().add(StarWarsContentDataBase.sHyperpropulsionCommon);
		lNavigation.getElementInfos().add(StarWarsContentDataBase.sPropulsionCommon);
		lNavigation.getElementInfos().add(StarWarsContentDataBase.sRepulsionCommon);

		lUse.getElementInfos().add(StarWarsContentDataBase.sComlinkCommon);
		lUse.getElementInfos().add(StarWarsContentDataBase.sCreditGalactiqueCommon);
		lUse.getElementInfos().add(StarWarsContentDataBase.sCuveabactaCommon);
		lUse.getElementInfos().add(StarWarsContentDataBase.sElectrobinoculaireCommon);
		lUse.getElementInfos().add(StarWarsContentDataBase.sHolocronCommon);
		lUse.getElementInfos().add(StarWarsContentDataBase.sHolonetCommon);
		lUse.getElementInfos().add(StarWarsContentDataBase.sJetpackJT12Common);
		lUse.getElementInfos().add(StarWarsContentDataBase.sJetpackZ6Common);
		lUse.getElementInfos().add(StarWarsContentDataBase.sKamaCommon);
		lUse.getElementInfos().add(StarWarsContentDataBase.sTestJediCommon);
	
		lMaterial.getElementInfos().add(StarWarsContentDataBase.sGazCommon);
		lMaterial.getElementInfos().add(StarWarsContentDataBase.sMetauxCommon);
		lMaterial.getElementInfos().add(StarWarsContentDataBase.sMinerauxCommon);

		lConceptEncyclopedia.getElementInfos().add(StarWarsContentDataBase.sArtJediClassic);
		lConceptEncyclopedia.getElementInfos().add(StarWarsContentDataBase.sAurebeshCommon);
		lConceptEncyclopedia.getElementInfos().add(StarWarsContentDataBase.sDistanceCommon);
		lConceptEncyclopedia.getElementInfos().add(StarWarsContentDataBase.sLaForceCommon);
		lConceptEncyclopedia.getElementInfos().add(StarWarsContentDataBase.sCodeJediCommon);
		lConceptEncyclopedia.getElementInfos().add(StarWarsContentDataBase.sCodeSithCommon);
		lConceptEncyclopedia.getElementInfos().add(StarWarsContentDataBase.sProphetiedelEluClassic);
		lConceptEncyclopedia.getElementInfos().add(StarWarsContentDataBase.sLeTempsCommon);

		lChronology.getElementInfos().add(ChronologyContentClassic.getCompleteChronology());
	
		lGenealogy.getElementInfos().add(GenealogyContentClassic.getGeneralGenealogy());
		lGenealogy.getElementInfos().add(GenealogyContentClassic.getSkywalkerHouse());
		lGenealogy.getElementInfos().add(GenealogyContentClassic.getSith());
		lGenealogy.getElementInfos().add(GenealogyContentClassic.getJedi());
		lGenealogy.getElementInfos().add(GenealogyContentClassic.getPoliticEvolution());
	
		lGalaxy.getElementInfos().add(GalaxyContentClassic.getGlobalGalaxy());
			
		return lAppInfo;
	}
	
	public static AppInfo createAppInfoLegends() {
		
		final AppInfo lAppInfo = new AppInfo();
		
		/* ROOT > ENCYCLOPEDIA */
		final SectionInfo lEncyclopedia = createSectionInfo("Encyclopédie", sEncyclopediaIcon,
				"encyclopedie",
				StarWarsTextResources.INSTANCE.encyclopedia().getText(), false);
		lAppInfo.getSectionInfos().add(lEncyclopedia);
		
			/* ROOT > ENCYCLOPEDIA > LIFE FORM */
			final SectionInfo lLifeFormEncylopedia  = createSectionInfo("Formes de vie", "5",
					"lifeform",
					StarWarsTextResources.INSTANCE.lifeform().getText(), false);
			lEncyclopedia.getSectionInfos().add(lLifeFormEncylopedia);
			
			/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE */
				final SectionInfo lPeopleEncylopedia = createSectionInfo("Personnages", "5",
						"personnages",
						StarWarsTextResources.INSTANCE.people().getText(), false);
				lLifeFormEncylopedia.getSectionInfos().add(lPeopleEncylopedia);
				
					/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > SENSITIVE */
					final SectionInfo lSensitivesPeopleEncylopedia = createSectionInfo("Sensitifs", "5",
							"sensitivepeople",
							StarWarsTextResources.INSTANCE.peopleforce().getText(), false);
					lPeopleEncylopedia.getSectionInfos().add(lSensitivesPeopleEncylopedia);
										
						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > SENSITIVE > SITH AND DARK JEDI */
						final SectionInfo lSithPeopleEncylopedia = createSectionInfo("Sith et Jedi Noirs", "5",
								"sithpeople",
								StarWarsTextResources.INSTANCE.peopleforcesith().getText(), true);
						lSensitivesPeopleEncylopedia.getSectionInfos().add(lSithPeopleEncylopedia);
						
						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > SENSITIVE > RAKATA */
						final SectionInfo lRakataPeopleEncylopedia = createSectionInfo("Rakata", "5",
								"rakatapeople",
								StarWarsTextResources.INSTANCE.peopleforcerakata().getText(), true);
						lSensitivesPeopleEncylopedia.getSectionInfos().add(lRakataPeopleEncylopedia);
						
						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > SENSITIVE > JEDAII */
						final SectionInfo lJedaiiPeopleEncylopedia = createSectionInfo("Je'daii", "5",
								"jedaiipeople",
								StarWarsTextResources.INSTANCE.peopleforcejedaii().getText(), true);
						lSensitivesPeopleEncylopedia.getSectionInfos().add(lJedaiiPeopleEncylopedia);
						
						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > SENSITIVE > JEDI */
						final SectionInfo lJediPeopleEncylopedia = createSectionInfo("Jedi", "5",
								"jedipeople",
								StarWarsTextResources.INSTANCE.peopleforcejedi().getText(), true);
						lSensitivesPeopleEncylopedia.getSectionInfos().add(lJediPeopleEncylopedia);
						
						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > SENSITIVE > KNIGHTS */
						final SectionInfo lKnightPeopleEncylopedia = createSectionInfo("Chevaliers Impériaux", "5",
								"knightpeople",
								StarWarsTextResources.INSTANCE.peopleforceknight().getText(), true);
						lSensitivesPeopleEncylopedia.getSectionInfos().add(lKnightPeopleEncylopedia);
						
					/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > IMPERIAL */
					final SectionInfo lImperialPeopleEncylopedia = createSectionInfo("Impériaux", "5",
								"imperialpeople",
								StarWarsTextResources.INSTANCE.peopleimp().getText(), false);
						lPeopleEncylopedia.getSectionInfos().add(lImperialPeopleEncylopedia);
					
						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > IMPERIAL > MILITARY */
						final SectionInfo lMilitaryImperialPeopleEncylopedia = createSectionInfo("Militaires", "5",
									"imperialmilitary",
									StarWarsTextResources.INSTANCE.peopleimp().getText(), true);
							lImperialPeopleEncylopedia.getSectionInfos().add(lMilitaryImperialPeopleEncylopedia);
						
						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > IMPERIAL > SOLDIER */
						final SectionInfo lSoldierImperialPeopleEncylopedia = createSectionInfo("Troupes", "5",
								"imperialsoldier",
								StarWarsTextResources.INSTANCE.peopleimp().getText(), true);
						lImperialPeopleEncylopedia.getSectionInfos().add(lSoldierImperialPeopleEncylopedia);

						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > CSI */
						final SectionInfo lSeparatistPeopleEncylopedia = createSectionInfo("Séparatistes", "5",
								"csipeople",
								StarWarsTextResources.INSTANCE.peoplecsi().getText(), false);
						lPeopleEncylopedia.getSectionInfos().add(lSeparatistPeopleEncylopedia);
						
						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > CSI > MILITARY */
						final SectionInfo lMilitarySeparatistPeopleEncylopedia = createSectionInfo("Militaires", "5",
								"csimilitary",
								StarWarsTextResources.INSTANCE.peoplecsi().getText(), true);
						lSeparatistPeopleEncylopedia.getSectionInfos().add(lMilitarySeparatistPeopleEncylopedia);

						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > CSI > INDUSTRIAL */
						final SectionInfo lIndustrialSeparatistPeopleEncylopedia = createSectionInfo("Industriels", "5",
								"csiindustrial",
								StarWarsTextResources.INSTANCE.peoplecsi().getText(), true);
						lSeparatistPeopleEncylopedia.getSectionInfos().add(lIndustrialSeparatistPeopleEncylopedia);
						
						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > CSI > SOLDIER */
						final SectionInfo lSoldierSeparatistPeopleEncylopedia = createSectionInfo("Troupes", "5",
								"csisoldier",
								StarWarsTextResources.INSTANCE.peoplecsi().getText(), true);
						lSeparatistPeopleEncylopedia.getSectionInfos().add(lSoldierSeparatistPeopleEncylopedia);
						
					/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > REPUBLIC */
					final SectionInfo lRepublicPeopleEncylopedia = createSectionInfo("Républicains", "5",
							"reppeople",
							StarWarsTextResources.INSTANCE.peoplerep().getText(), false);
					lPeopleEncylopedia.getSectionInfos().add(lRepublicPeopleEncylopedia);
					
						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > REPUBLIC > MILITARY */
						final SectionInfo lMilitaryRepublicPeopleEncylopedia = createSectionInfo("Militaires", "5",
								"repmilitary",
								StarWarsTextResources.INSTANCE.peoplerep().getText(), true);
						lRepublicPeopleEncylopedia.getSectionInfos().add(lMilitaryRepublicPeopleEncylopedia);

						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > REPUBLIC > POLITIC */
						final SectionInfo lPoliticRepublicPeopleEncylopedia = createSectionInfo("Politiques", "5",
								"reppolitic",
								StarWarsTextResources.INSTANCE.peoplerep().getText(), true);
						lRepublicPeopleEncylopedia.getSectionInfos().add(lPoliticRepublicPeopleEncylopedia);

						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > REPUBLIC > SOLDIER */
						final SectionInfo lSoldierRepublicPeopleEncylopedia = createSectionInfo("Troupes", "5",
								"repsoldier",
								StarWarsTextResources.INSTANCE.peoplerep().getText(), true);
						lRepublicPeopleEncylopedia.getSectionInfos().add(lSoldierRepublicPeopleEncylopedia);

					/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > REBEL */
					final SectionInfo lRebelPeopleEncylopedia = createSectionInfo("Membres de l'Alliance", "5",
							"rebelpeople",
							StarWarsTextResources.INSTANCE.peoplereb().getText(), false);
					lPeopleEncylopedia.getSectionInfos().add(lRebelPeopleEncylopedia);

						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > REBEL > MILITARY */
						final SectionInfo lMilitaryRebelPeopleEncylopedia = createSectionInfo("Militaires", "5",
								"rebelmilitary",
								StarWarsTextResources.INSTANCE.peoplereb().getText(), true);
						lRebelPeopleEncylopedia.getSectionInfos().add(lMilitaryRebelPeopleEncylopedia);
					
						/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > REBEL > POLITIC */
						final SectionInfo lPoliticRebelPeopleEncylopedia = createSectionInfo("Politiques", "5",
								"rebelpolitic",
								StarWarsTextResources.INSTANCE.peoplereb().getText(), true);
						lRebelPeopleEncylopedia.getSectionInfos().add(lPoliticRebelPeopleEncylopedia);

					/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > OUTLAW */
					final SectionInfo lOutlawPeopleEncylopedia = createSectionInfo("Hors-la-loi", "5",
							"outlawpeople",
							StarWarsTextResources.INSTANCE.peopleout().getText(), true);
					lPeopleEncylopedia.getSectionInfos().add(lOutlawPeopleEncylopedia);

					/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > CIVIL */
					final SectionInfo lCivilPeopleEncylopedia = createSectionInfo("Civils", "5",
							"civilspeople",
							StarWarsTextResources.INSTANCE.peoplecivil().getText(), true);
					lPeopleEncylopedia.getSectionInfos().add(lCivilPeopleEncylopedia);

					/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > DROID */
					final SectionInfo lDroidPeopleEncylopedia = createSectionInfo("Droïdes", "5",
							"droidpeople",
							StarWarsTextResources.INSTANCE.peopledroid().getText(), true);
					lPeopleEncylopedia.getSectionInfos().add(lDroidPeopleEncylopedia);

					/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > MANDO */
					final SectionInfo lMandoPeopleEncylopedia = createSectionInfo("Mandaloriens", "5",
							"mandpeople",
							StarWarsTextResources.INSTANCE.peoplemando().getText(), true);
					lPeopleEncylopedia.getSectionInfos().add(lMandoPeopleEncylopedia);
											
					/* ROOT > ENCYCLOPEDIA > LIFE FORM > PEOPLE > VONG */
					final SectionInfo lVongPeopleEncylopedia = createSectionInfo("Yuuzhan-Vongs", "5",
							"vongpeople",
							StarWarsTextResources.INSTANCE.peoplevong().getText(), true);
					lPeopleEncylopedia.getSectionInfos().add(lVongPeopleEncylopedia);
					
				/* ROOT > ENCYCLOPEDIA > LIFE FORM > CREATURE */
				final SectionInfo lCreatureEncylopedia = createSectionInfo("Créatures", "5",
						"creatures",
						StarWarsTextResources.INSTANCE.creatures().getText(), true);
				lLifeFormEncylopedia.getSectionInfos().add(lCreatureEncylopedia);

				/* ROOT > ENCYCLOPEDIA > LIFE FORM > SPECIES */
				final SectionInfo lSpeciesEncylopedia = createSectionInfo("Espèces", "5",
						"species",
						StarWarsTextResources.INSTANCE.species().getText(), true);
				lLifeFormEncylopedia.getSectionInfos().add(lSpeciesEncylopedia);

			/* ROOT > ENCYCLOPEDIA > SHIPS */
			final SectionInfo lShipsEncylopedia = createSectionInfo("Vaisseaux", "5",
					"vaisseaux",
					StarWarsTextResources.INSTANCE.ships().getText(), false);
			lEncyclopedia.getSectionInfos().add(lShipsEncylopedia);
			
				/* ROOT > ENCYCLOPEDIA > SHIPS > SITH FLEET */
				final SectionInfo lSithFleet = createSectionInfo("Flotte Sith", "5",
						"sithships",
						StarWarsTextResources.INSTANCE.shipssith().getText(), true);
				lShipsEncylopedia.getSectionInfos().add(lSithFleet);
			
				/* ROOT > ENCYCLOPEDIA > SHIPS > IMPERIAL FLEET */
				final SectionInfo lImperialFleet = createSectionInfo("Flotte impériale", "5",
						"imperialships",
						StarWarsTextResources.INSTANCE.shipsimp().getText(), false);
				lShipsEncylopedia.getSectionInfos().add(lImperialFleet);
				
					/* ROOT > ENCYCLOPEDIA > SHIPS > IMPERIAL FLEET > FIGHTER */
					final SectionInfo lImperialFighters = createSectionInfo("Chasseurs", "5", 
							"imperialfighters",
							StarWarsTextResources.INSTANCE.shipsfighters().getText(), true);
					lImperialFleet.getSectionInfos().add(lImperialFighters);

					/* ROOT > ENCYCLOPEDIA > SHIPS > IMPERIAL FLEET > TRANSPORT */
					final SectionInfo lImperialTransports = createSectionInfo("Navettes et transports", "5",
							"imperialtransports",
							StarWarsTextResources.INSTANCE.shipstransport().getText(), true);
					lImperialFleet.getSectionInfos().add(lImperialTransports);

					/* ROOT > ENCYCLOPEDIA > SHIPS > IMPERIAL FLEET > SD */
					final SectionInfo lImperialSD = createSectionInfo("Star Destroyers", "5",
							"imperialsd",
							StarWarsTextResources.INSTANCE.shipssd().getText(), true);
					lImperialFleet.getSectionInfos().add(lImperialSD);

					/* ROOT > ENCYCLOPEDIA > SHIPS > IMPERIAL FLEET > SSD */
					final SectionInfo lImperialSSD = createSectionInfo("Super Star Destroyers", "5",
							"imperialssd",
							StarWarsTextResources.INSTANCE.shipsssd().getText(), true);
					lImperialFleet.getSectionInfos().add(lImperialSSD);
		
					/* ROOT > ENCYCLOPEDIA > SHIPS > IMPERIAL FLEET > STATION */
					final SectionInfo lImperialStations = createSectionInfo("Stations de combat", "5",
							"imperialstations",
							StarWarsTextResources.INSTANCE.shipsstation().getText(), true);
					lImperialFleet.getSectionInfos().add(lImperialStations);
				
				/* ROOT > ENCYCLOPEDIA > SHIPS > CSI FLEET */
				final SectionInfo lCsiFleet = createSectionInfo("Flotte séparatiste", "5",
						"csiships",
						StarWarsTextResources.INSTANCE.shipscsi().getText(), false);
				lShipsEncylopedia.getSectionInfos().add(lCsiFleet);
	
					/* ROOT > ENCYCLOPEDIA > SHIPS > CSI FLEET > FIGHTER */
					final SectionInfo lCsiFighters = createSectionInfo("Chasseurs", "5",
							"csifighters",
							StarWarsTextResources.INSTANCE.shipsfighters().getText(), true);
					lCsiFleet.getSectionInfos().add(lCsiFighters);
		
					/* ROOT > ENCYCLOPEDIA > SHIPS > CSI FLEET > TRANSPORT */
					final SectionInfo lCsiTransports = createSectionInfo("Navettes et transports", "5",
							"csitransports",
							StarWarsTextResources.INSTANCE.shipstransport().getText(), true);
					lCsiFleet.getSectionInfos().add(lCsiTransports);
					
					/* ROOT > ENCYCLOPEDIA > SHIPS > CSI FLEET > SD */
					final SectionInfo lCsiSD = createSectionInfo("Croiseurs", "5",
							"csisd",
							StarWarsTextResources.INSTANCE.shipssd().getText(), true);
					lCsiFleet.getSectionInfos().add(lCsiSD);
	
				/* ROOT > ENCYCLOPEDIA > SHIPS > REBEL FLEET */
				final SectionInfo lAllianceFleet = createSectionInfo("Flotte de l'Alliance", "5",
						"rebelships",
						StarWarsTextResources.INSTANCE.shipsreb().getText(), false);
				lShipsEncylopedia.getSectionInfos().add(lAllianceFleet);
	
					/* ROOT > ENCYCLOPEDIA > SHIPS > REBEL FLEET > FIGHTER */
					final SectionInfo lAllianceFighters = createSectionInfo("Chasseurs", "5",
							"rebelfighters",
							StarWarsTextResources.INSTANCE.shipsfighters().getText(), true);
					lAllianceFleet.getSectionInfos().add(lAllianceFighters);

					/* ROOT > ENCYCLOPEDIA > SHIPS > REBEL FLEET > SD */
					final SectionInfo lAllianceSD = createSectionInfo("Croiseurs", "5",
							"rebelsd",
							StarWarsTextResources.INSTANCE.shipssd().getText(), true);
					lAllianceFleet.getSectionInfos().add(lAllianceSD);

				/* ROOT > ENCYCLOPEDIA > SHIPS > REPUBLIC FLEET */
				final SectionInfo lRepublicFleet = createSectionInfo("Flotte républicaine", "5",
						"repships",
						StarWarsTextResources.INSTANCE.shipsrep().getText(), false);
				lShipsEncylopedia.getSectionInfos().add(lRepublicFleet);
	
					/* ROOT > ENCYCLOPEDIA > SHIPS > REPUBLIC FLEET > FIGHTER */
					final SectionInfo lRepublicFighters = createSectionInfo("Chasseurs", "5",
							"repfighters",
							StarWarsTextResources.INSTANCE.shipsfighters().getText(), true);
					lRepublicFleet.getSectionInfos().add(lRepublicFighters);
		
					/* ROOT > ENCYCLOPEDIA > SHIPS > REPUBLIC FLEET > TRANSPORT */
					final SectionInfo lRepublicTransports = createSectionInfo("Navettes et transports", "5",
							"reptransports",
							StarWarsTextResources.INSTANCE.shipstransport().getText(), true);
					lRepublicFleet.getSectionInfos().add(lRepublicTransports);
					
					/* ROOT > ENCYCLOPEDIA > SHIPS > REPUBLIC FLEET > SD */
					final SectionInfo lRepublicSD = createSectionInfo("Destroyers", "5",
							"repsd",
							StarWarsTextResources.INSTANCE.shipssd().getText(), true);
					lRepublicFleet.getSectionInfos().add(lRepublicSD);
					
				/* ROOT > ENCYCLOPEDIA > SHIPS > OUTLAW FLEET */
				final SectionInfo lOutlawFleet = createSectionInfo("Vaisseaux d'hors-la-loi", "5",
						"outlawships",
						StarWarsTextResources.INSTANCE.shipsout().getText(), true);
				lShipsEncylopedia.getSectionInfos().add(lOutlawFleet);
				
				/* ROOT > ENCYCLOPEDIA > SHIPS > CIVIL FLEET */
				final SectionInfo lCivilFleet = createSectionInfo("Vaisseaux civils", "5",
						"indepships",
						StarWarsTextResources.INSTANCE.shipscivil().getText(), true);
				lShipsEncylopedia.getSectionInfos().add(lCivilFleet);
				
			/* ROOT > ENCYCLOPEDIA > VEHICLES */
			final SectionInfo lVehiclesEncylopedia = createSectionInfo("Véhicules", "5", 
					"vehicules",
					StarWarsTextResources.INSTANCE.vehicles().getText(), false);
			lEncyclopedia.getSectionInfos().add(lVehiclesEncylopedia);
			
				/* ROOT > ENCYCLOPEDIA > VEHICLES > IMPERIAL ARMY */
				final SectionInfo lImperialArmy = createSectionInfo("Armée impériale", "5",
						"imperialarmy",
						StarWarsTextResources.INSTANCE.vehiclesimp().getText(), true);
				lVehiclesEncylopedia.getSectionInfos().add(lImperialArmy);
				
				/* ROOT > ENCYCLOPEDIA > VEHICLES > CSI ARMY */
				final SectionInfo lCsiArmy = createSectionInfo("Armée séparatiste", "5",
						"csiarmy",
						StarWarsTextResources.INSTANCE.vehiclescsi().getText(), true);
				lVehiclesEncylopedia.getSectionInfos().add(lCsiArmy);
				
				/* ROOT > ENCYCLOPEDIA > VEHICLES > REPUBLIC ARMY */
				final SectionInfo lRepublicArmy = createSectionInfo("Armée républicaine", "5",
						"reparmy",
						StarWarsTextResources.INSTANCE.vehiclesrep().getText(), true);
				lVehiclesEncylopedia.getSectionInfos().add(lRepublicArmy);
				
				/* ROOT > ENCYCLOPEDIA > VEHICLES > CIVIL VEHICLES */
				final SectionInfo lCivilVehicles = createSectionInfo("Véhicules civils", "5",
						"civilvehicles",
						StarWarsTextResources.INSTANCE.vehiclescivil().getText(), true);
				lVehiclesEncylopedia.getSectionInfos().add(lCivilVehicles);
				
			/* ROOT > ENCYCLOPEDIA > FACTIONS */
			final SectionInfo lFactionsEncylopedia = createSectionInfo("Factions", "5",
					"factions",
					StarWarsTextResources.INSTANCE.factions().getText(), true);
			lEncyclopedia.getSectionInfos().add(lFactionsEncylopedia);
			
			/* ROOT > ENCYCLOPEDIA > PLANETES */
			final SectionInfo lPlanetesEncylopedia = createSectionInfo("Planètes", "5",
					"planetes",
					StarWarsTextResources.INSTANCE.planets().getText(), true);
			lEncyclopedia.getSectionInfos().add(lPlanetesEncylopedia);
			
			/* ROOT > ENCYCLOPEDIA > CONFLICTS */
			final SectionInfo lConflictEncylopedia = createSectionInfo("Conflits", "5",
					"conflict",
					StarWarsTextResources.INSTANCE.conflicts().getText(), true);
			lEncyclopedia.getSectionInfos().add(lConflictEncylopedia);
			
			/* ROOT > ENCYCLOPEDIA > TECHNOLOGIES */
			final SectionInfo lTechnologiesEncylopedia = createSectionInfo("Technologies", "5",
					"materiels",
					StarWarsTextResources.INSTANCE.technologies().getText(), false);
			lEncyclopedia.getSectionInfos().add(lTechnologiesEncylopedia);
			
				/* ROOT > ENCYCLOPEDIA > TECHNOLOGIES > WEAPONS */
				final SectionInfo lWeapons = createSectionInfo("Armes", "5",
						"weapons",
						StarWarsTextResources.INSTANCE.weapons().getText(), true);
				lTechnologiesEncylopedia.getSectionInfos().add(lWeapons);
				
				/* ROOT > ENCYCLOPEDIA > TECHNOLOGIES > NAVIGATION */
				final SectionInfo lNavigation = createSectionInfo("Navigation", "5",
						"navigation",
						StarWarsTextResources.INSTANCE.navigation().getText(), true);
				lTechnologiesEncylopedia.getSectionInfos().add(lNavigation);
				
				/* ROOT > ENCYCLOPEDIA > TECHNOLOGIES > UTILITIES */
				final SectionInfo lUse = createSectionInfo("Utilitaire", "5",
						"utilities",
						StarWarsTextResources.INSTANCE.uses().getText(), true);
				lTechnologiesEncylopedia.getSectionInfos().add(lUse);
				
				/* ROOT > ENCYCLOPEDIA > TECHNOLOGIES > METERIALS */
				final SectionInfo lMaterial = createSectionInfo("Matériaux", "5",
						"materials",
						StarWarsTextResources.INSTANCE.materials().getText(), true);
				lTechnologiesEncylopedia.getSectionInfos().add(lMaterial);
				
			/* ROOT > ENCYCLOPEDIA > CONCEPTS */
			final SectionInfo lConceptEncyclopedia = createSectionInfo("Concepts", "5",
					"concepts",
					StarWarsTextResources.INSTANCE.concepts().getText(), true);
			lEncyclopedia.getSectionInfos().add(lConceptEncyclopedia);

		/* ROOT > CHRONOLOGY */
		final SectionInfo lChronology = createSectionInfo("Chronologie", sChronologyIcon,
				"chronology",
				StarWarsTextResources.INSTANCE.chronology().getText(), true);
		lAppInfo.getSectionInfos().add(lChronology);
		
		/* ROOT > GENEALOGY */
		final SectionInfo lGenealogy = createSectionInfo("Généalogie", sGenealogyIcon,
				"genealogie",
				StarWarsTextResources.INSTANCE.genealogy().getText(), true);
		lAppInfo.getSectionInfos().add(lGenealogy);
		
		/* ROOT > GALAXY */
		final SectionInfo lGalaxy = createSectionInfo("Cartographie", sGalaxyIcon,
				"cartography",
				StarWarsTextResources.INSTANCE.galaxy().getText(), true);
		lAppInfo.getSectionInfos().add(lGalaxy);
		
		/* ROOT > SEARCH */
		final SectionInfo lSearch = createSectionInfo("Recherche", sSearchIcon,
				"search",
				StarWarsTextResources.INSTANCE.research().getText(), true);
		lSearch.setResearch(true);
		lAppInfo.getSectionInfos().add(lSearch);
    	  
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAbelothLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAjuntaPallLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAleemaKetoLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAloraLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sArcannLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sArdenLynLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAsajjVentressLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAzrakelLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBeliaDarzuLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBocAsecaLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBrakissLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCarnorJaxLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDaimanLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkAngralLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkAzardLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkBaneLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkBarasLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkCaedusLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkCognusLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkJadusLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkKraytLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkKruhlLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkMaladiLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkMalakLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkMalevalLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkMalgusLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkMarrLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkMaulLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkMillennialLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkNihilusLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkNihlLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkPlagueisLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkRivanLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkRuinLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkRuynLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkSidiousLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkSionLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkStryfeLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkTalonLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkTenebrousLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkTrayaLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkUnderlordLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkVadorLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkWyyrlokLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkZannahLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDesannLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDookuLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sExalKresshLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sExarKunLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sFreedonNaddLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGavarKhaiLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGithanyLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHaazenLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJerecLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSkereKaanLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKarnessMuurLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKuellerLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLudoKresshLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLumiyaLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMarkaRagnosLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMawLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNagaSadowLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOdionLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarkRevanLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSaaraiLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSarissLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSatalKetoLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sScourgeLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSedrissLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSetHarthLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSevRanceTannLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSimusLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSoraBulqLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sStarkillerLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTavionAxmisLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTenebKelLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sThexanLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTolSkorrLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sVergereLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sVestaraKhaiLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sVitiateLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sVulIsenLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sXendorLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sXoxaanLegends);
		lSithPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sYunLegends);

		lJedaiiPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDaegenLokLegends);
		lJedaiiPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHawkRyoLegends);
		lJedaiiPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKetuLegends);
		lJedaiiPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sQuanJangLegends);
		lJedaiiPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRoriFennLegends);
		lJedaiiPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSeknosRathLegends);
		lJedaiiPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sShaeKodaLegends);
		lJedaiiPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTashaRyoLegends);
		
		lRakataPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSkalNasLegends);
		lRakataPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTrillLegends);
		lRakataPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTulKarLegends);
		lRakataPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sXeshLegends);
		
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAaylaSecuraLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAdiGalliaLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAgenKolarLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAttonRandLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRasiTuumLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAlemaRarLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAllanaSoloLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAnakinSkywalkerLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAnakinSoloLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAnyaKuroLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sArcaJethLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAtrisLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBarissOffeeLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBastilaShanLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBenSkywalkerLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBeyghorSahdettLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBruckChunLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCadeSkywalkerLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCayQelDromaLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCelesteMorneLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sColemanTreborCommon);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCorranHornLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDarNalaLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDassJennirLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDepaBillabaLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sEchuuShenJonLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sEethKothLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sEvenPiellLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGannerRhysodeLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJacenSoloLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJainaSoloLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJocastaNuLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJohunOthoneLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJoruusCBaothLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKaceDorjanderLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKamSolusarLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKenthHamnerLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKerraHoltLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKiAdiMundiLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKiranaTiLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKitFistoLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKKruhkLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKolSkywalkerLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKryndaDraayLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKyleKatarnLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKypDurronLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLeiaOrganaLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLowbaccaLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLucienDraayLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLukeSkywalkerLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLuminaraUnduliLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMaceWinduLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMaraJadeLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMarisBroodLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNatSkywalkerLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNejaaHalcyonLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNomiSunriderLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sObiWanKenobiLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOdanUrrLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOodBnarLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOorooLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOppoRancisisLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOrgusDinLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPloKoonLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sQAniliaLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sQuiGonJinnLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sQuinlanVosLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sQuRahnLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRaanaTeyLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRahmKotaLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRasktaLsuLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRaynarThulLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRoblioDarteLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRoshPeninLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSaeseeTiinLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSarroXajLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSateleShanLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sShaakTiLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sShadoVaoLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSharadHettLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSifoDyasCommon);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSiriTachiLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sStassAllieLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTahiriVeilaLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTahlLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTenelKaDjoLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTholmeLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sThonLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTionneSolusarLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTraSaaLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTsuiChoiLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sUlicQelDromaLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sValenthyneFarfallaLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sVandarTokareLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sVannarTreeceLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sVimaSunriderLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sVodoSioskBaasLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWolfSazenLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sXamarLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sXanatosLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sYaddleLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sYaraelPoofLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sYodaLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sZayneCarrickLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sZekkLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sZuleXissLegends);
		lJediPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sZymLegends);

		lKnightPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAntaresDracoLegends);
		lKnightPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAzlynRaeLegends);
		lKnightPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sElkeVetterLegends);
		lKnightPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sElliahChalkLegends);
		lKnightPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGannerKriegLegends);
		lKnightPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHogrumChalkLegends);
		lKnightPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMarasiahFelLegends);
		lKnightPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRoanFelLegends);
		lKnightPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSigelDareLegends);
		lKnightPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTreisSindeLegends);

		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAstraalVaoLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCassioTaggeCommon);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDemetriusZaarinLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDorjaLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDruValanLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sEvirDerricoteLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sFehlaaurLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sFirmusPiettCommon);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGalakFyyarLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGeistLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGiladPellaeonLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGunnerYageLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sIlrazIshinLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJaggedFelLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJanusGreejatusCommon);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJunoEclipseLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKendalOzzelCommon);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKirKanosLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLorthNeedaCommon);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMartioBatchLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMaximilianVeersCommon);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMorlishVeedLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNatasiDaalaLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNialDeclannLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNynaCalixteLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOsvaldTeshikLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPetoKelsanLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPterThanasLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRanHarkasLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRulfYageLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSatePestageLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sShadowspawnLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSoontirFelLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sThrawnLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTiaanJerjerrodCommon);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sVaclenTorLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sVenkaCommon);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWilhuffTarkinLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWilekNereusLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sYsanneIsardLegends);
		lMilitaryImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sZsinjLegends);

		lSoldierImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBlackholetrooperLegends);
		lSoldierImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sEVOtrooperLegends);
		lSoldierImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHazardtrooperLegends);
		lSoldierImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPiloteTIECommon);
		lSoldierImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRockettrooperLegends);
		lSoldierImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sScouttrooperCommon);
		lSoldierImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSeatrooperLegends);
		lSoldierImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sStormtrooperCommon);
		lSoldierImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sStormtrooperdeLumiyaLegends);
		lSoldierImperialPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSnowtrooperCommon);

		lMilitarySeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBokLegends);
		lMilitarySeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDaultayDofineCommon);
		lMilitarySeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDurgeLegends);
		lMilitarySeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGrievousLegends);
		lMilitarySeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLushrosDofineCommon);
		lMilitarySeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKhaleenHentzLegends);
		lMilitarySeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOOM9Common);
		lMilitarySeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAltoStratusLegends);

		lIndustrialSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNuteGunrayLegends);
		lIndustrialSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRuneHaakoCommon);
		lIndustrialSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPasselArgenteCommon);
		lIndustrialSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPoggleleBrefLegends);
		lIndustrialSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPoNudoCommon);
		lIndustrialSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSanHillCommon);
		lIndustrialSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sShuMaiCommon);
		lIndustrialSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWatTamborCommon);
	
		lSoldierSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDroidedecombatB1Common);
		lSoldierSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDroidedecombatB2Common);
		lSoldierSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDroideBuzzCommon);
		lSoldierSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDroideDestroyerCommon);
		lSoldierSeparatistPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMagnagardeIG100Common);
	
		lMilitaryRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBacaraCommon);
		lMilitaryRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCarthOnasiLegends);
		lMilitaryRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCodyLegends);
		lMilitaryRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sElinGarzaLegends);
		lMilitaryRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sFornDodonnaLegends);
		lMilitaryRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGregarTyphoLegends);
		lMilitaryRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHarronTavusLegends);
		lMilitaryRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sQuarshPanakaCommon);
		lMilitaryRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSaulKarathLegends);
	
		lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBailOrganaLegends);
		lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDorianJanarusLegends);
		lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sFinisValorumLegends);
		lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGarmBelIblisLegends);
		lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJamilliaCommon);
		lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJarJarBinksLegends);
		lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLamaSuCommon);
		lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMasAmeddaLegends);
		lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOrnFreeTaaLegends);
		lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPadmeNaberrieLegends);
		lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSheevPalpatineLegends);
		lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSioBibbleCommon);
		lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTarsusValorumLegends);
		lPoliticRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTetaLegends);

		lSoldierRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCloneCommandantCommon);
		lSoldierRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sClonedechocCommon);
		lSoldierRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCloneeclaireurCommon);
		lSoldierRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sClonemarineCommon);
		lSoldierRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sClonepiloteCommon);
		lSoldierRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sClonepiloteTRTTCommon);
		lSoldierRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSoldatARCCommon);
		lSoldierRepublicPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSoldatCloneCommon);
	
		lMilitaryRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGialAckbarLegends);
		lMilitaryRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAndurgoLegends);
		lMilitaryRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBiggsDarklighterLegends);
		lMilitaryRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCarlistRieekanLegends);
		lMilitaryRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCrixMadineLegends);
		lMilitaryRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDackRalterLegends);
		lMilitaryRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGarStaziLegends);
		lMilitaryRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGavinDarklighterLegends);
		lMilitaryRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sIellaWessiriLegends);
		lMilitaryRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJaiusYorubLegends);
		lMilitaryRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJanDodonnaLegends);
		lMilitaryRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJanOrsLegends);
		lMilitaryRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJekPorkinsLegends);
		lMilitaryRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJhoramBeyLegends);
		lMilitaryRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMoniaGahanLegends);
		lMilitaryRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNienNunbLegends);
		lMilitaryRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOnaAntillesLegends);
		lMilitaryRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRontoLegends);
		lMilitaryRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTychoCelchuLegends);
		lMilitaryRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWedgeAntillesLegends);
		lMilitaryRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWesJansonLegends);
		lMilitaryRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sZevSenescaCommon);
		
		lPoliticRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBorskFeylyaLegends);
		lPoliticRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCalOmasLegends);
		lPoliticRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGaerielCaptisonLegends);
		lPoliticRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGialGahanLegends);
		lPoliticRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMonMothmaLegends);
		lPoliticRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPoncGavrisomLegends);
		lPoliticRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTendraRisantLegends);
		lPoliticRebelPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWinterCelchuLegends);

		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAilynVelLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAurraSingLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBibFortunaLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBobaFettLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBomoVertemousseLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBosskLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCaloNordLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sChaKLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sChewbaccaLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCrysTaanzerLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDeliahBlueLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDengarLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGreedoCommon);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHanSoloLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHyloViszLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJabbaleHuttLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJangoFettLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJanksLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJaraelLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJariahSynLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJoolLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKeeLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKoVakierLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKuVratLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLandoCalrissianLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMarnHierogryphLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMeekerdinmaaLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMezgrafLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMiraxTerrikLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNakiaYoruLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRavLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSchurkHerenLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sShaeVizlaLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSintasVelLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSintYoruLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTalonKarrdeLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sXizorLegends);
		lOutlawPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sZamWesellLegends);
		
		lMandoPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCassusFettLegends);
		lMandoPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDemagolLegends);
		lMandoPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGhesOradeLegends);
		lMandoPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHondoKarrLegends);
		lMandoPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJasterMereelLegends);
		lMandoPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMandaloreleBrefLegends);
		lMandoPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMandalorelIndomptableLegends);
		lMandoPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMandaloreleLegitimeLegends);
		lMandoPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMandaloreleRessusciteurLegends);
		lMandoPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMandaloreleSauveurLegends);
		lMandoPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMandalorelUltimeLegends);
		lMandoPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMirtaGevLegends);
		lMandoPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPulsipherLegends);
		lMandoPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRohlanDyreLegends);
		lMandoPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTesVevecLegends);
		lMandoPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sVhonteTervhoLegends);
		
		lVongPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sElanLegends);
		lVongPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHarrarLegends);
		lVongPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMezhanKwaadLegends);
		lVongPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNasChokaLegends);
		lVongPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNeiRinLegends);
		lVongPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNenYimLegends);
		lVongPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNomAnorLegends);
		lVongPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOnimiLegends);
		lVongPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sShimrraLegends);
		lVongPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTsavongLahLegends);
		lVongPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sVuaRapuungLegends);
		lVongPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sYominCarrLegends);
		lVongPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sZenocQuahLegends);

		lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAhnahRawkLegends);
		lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBeruWhitesunCommon);
		lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBossNassCommon);
		lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCalebLegends);
		lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sClieggLarsCommon);
		lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDexterJettsterCommon);
		lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDrooRawkLegends);
		lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sEmberChankeliLegends);
		lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGormanVandraykLegends);
		lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sIsolderLegends);
		lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJobalNaberrieCommon);
		lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLobotLegends);
		lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOwenLarsLegends);
		lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sShmiSkywalkerCommon);
		lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSkeetoRawkLegends);
		lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTarffulCommon);
		lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTarpalsCommon);
		lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTenenielDjoLegends);
		lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sThrackanSalSoloLegends);
		lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSebulbaCommon);
		lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSerraLegends);
		lCivilPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWattoCommon);

		lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sC3POLegends);
		lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDroideenergetiqueCommon);
		lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDroideMecanoCommon);
		lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDroidemedicalCommon);
		lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDroideprotocolaireCommon);
		lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sH2Legends);
		lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sR2D2Legends);
		lDroidPeopleEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWA7Common);

		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAcklayCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAiwhaCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBanthaCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sColoCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDewbackCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDianogaCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDragonKraytCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sEopieCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sExogorthCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sFambaaCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGundarkCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKaaduCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMidichlorienLegends);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMitederocheCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMynockCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNeekLegends);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNerfLegends);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNexuCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNosLegends);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNunaCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOpeeCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOrbaliskLegends);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRakghoulLegends);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRancorCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sReekCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSandoCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSarlaccCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sShaakCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTauntaunCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTukataLegends);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sVaractylCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sVornskrLegends);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sVoxynLegends);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWampaCommon);
		lCreatureEncylopedia.getElementInfos().add(StarWarsContentDataBase.sYsalamiriLegends);
		
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAnzatiLegends);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAqualishCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sArkanienLegends);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBesaliskCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBithCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBothanCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCelesteLegends);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sChadraFanCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sChagrianCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sChalactanCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sChevinCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sChissLegends);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sClawditeCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDathomirienCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDevaronienCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDrallLegends);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDugCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDurosCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sEwokCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sFalleenLegends);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGamorreenCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGeonosienCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGunganCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGranCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHumainCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHuttCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sIktotchiCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sIthorienCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJawaCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKaleeshCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKaminoenCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKelDorCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKiffarLegends);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKillikLegends);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKorunnaiCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKubazCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sLannikCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMassassiLegends);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMiralukaLegends);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMirialanCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMonCalCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNagaiLegends);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNautolanCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNeimodienCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNetiLegends);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNiktoCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNoghriLegends);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOrtolanCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPauanCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sQuarrenCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRakataLegends);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRattatakiLegends);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRodienCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSakiyenLegends);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSithdesangpurLegends);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSkakoanCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSnivvienLegends);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSullustainCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTalzCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sThisspiasienCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTogrutaCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sToydarienCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTrandoshanCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTuskenLegends);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTwilekCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sUgnaughtCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sUmbaranCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sUtaiCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sVurkCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWeequayCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWhiphidLegends);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWookieeCommon);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sYevethaLegends);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sYinchorriLegends);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sYuuzhanVongLegends);
		lSpeciesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sZabrakCommon);
			
		lSithFleet.getElementInfos().add(StarWarsContentDataBase.sCimeterreSithLegends);
		lSithFleet.getElementInfos().add(StarWarsContentDataBase.sChasseurAnnihilateurLegends);
		lSithFleet.getElementInfos().add(StarWarsContentDataBase.sChasseurSithLegends);
		lSithFleet.getElementInfos().add(StarWarsContentDataBase.sClasseCenturionLegends);
		lSithFleet.getElementInfos().add(StarWarsContentDataBase.sClasseDerriphanLegends);
		lSithFleet.getElementInfos().add(StarWarsContentDataBase.sClasseDragonLegends);
		lSithFleet.getElementInfos().add(StarWarsContentDataBase.sClasseHarrowerLegends);
		lSithFleet.getElementInfos().add(StarWarsContentDataBase.sClasseInterdicteurLegends);
		lSithFleet.getElementInfos().add(StarWarsContentDataBase.sForgeStellaireLegends);
		lSithFleet.getElementInfos().add(StarWarsContentDataBase.sIntercepteurFuryLegends);
		lSithFleet.getElementInfos().add(StarWarsContentDataBase.sSpheredemeditationLegends);

		lImperialFighters.getElementInfos().add(StarWarsContentDataBase.sTIEAvancex1Common);
		lImperialFighters.getElementInfos().add(StarWarsContentDataBase.sBombardierTIECommon);
		lImperialFighters.getElementInfos().add(StarWarsContentDataBase.sChasseurTIECommon);
		lImperialFighters.getElementInfos().add(StarWarsContentDataBase.sCimeterreTIELegends);
		lImperialFighters.getElementInfos().add(StarWarsContentDataBase.sDefenseurTIELegends);
		lImperialFighters.getElementInfos().add(StarWarsContentDataBase.sDroideTIELegends);
		lImperialFighters.getElementInfos().add(StarWarsContentDataBase.sFantômeTIELegends);
		lImperialFighters.getElementInfos().add(StarWarsContentDataBase.sGriffeChissLegends);
		lImperialFighters.getElementInfos().add(StarWarsContentDataBase.sHunterTIELegends);
		lImperialFighters.getElementInfos().add(StarWarsContentDataBase.sIntercepteurTIECommon);
		lImperialFighters.getElementInfos().add(StarWarsContentDataBase.sIntercepteurRoyalTIELegends);
		lImperialFighters.getElementInfos().add(StarWarsContentDataBase.sOppresseurTIELegends);
		lImperialFighters.getElementInfos().add(StarWarsContentDataBase.sPredateurTIELegends);
		lImperialFighters.getElementInfos().add(StarWarsContentDataBase.sRogueShadowLegends);
				
		lImperialTransports.getElementInfos().add(StarWarsContentDataBase.sBargeTitanCommon);
		lImperialTransports.getElementInfos().add(StarWarsContentDataBase.sNavetteLambdaCommon);
		lImperialTransports.getElementInfos().add(StarWarsContentDataBase.sNavetteSentinelleCommon);
		lImperialTransports.getElementInfos().add(StarWarsContentDataBase.sNavetteNuneLegends);
		lImperialTransports.getElementInfos().add(StarWarsContentDataBase.sNavetteSigmaLegends);

		lImperialSD.getElementInfos().add(StarWarsContentDataBase.sClasseArdentLegends);
		lImperialSD.getElementInfos().add(StarWarsContentDataBase.sClasseImperialICommon);
		lImperialSD.getElementInfos().add(StarWarsContentDataBase.sClasseImperialIICommon);
		lImperialSD.getElementInfos().add(StarWarsContentDataBase.sClasseImperiousLegends);
		lImperialSD.getElementInfos().add(StarWarsContentDataBase.sClasseLictorLegends);
		lImperialSD.getElementInfos().add(StarWarsContentDataBase.sClassePellaeonLegends);
		lImperialSD.getElementInfos().add(StarWarsContentDataBase.sClassePraetorLegends);
		lImperialSD.getElementInfos().add(StarWarsContentDataBase.sClasseTectorCommon);
		lImperialSD.getElementInfos().add(StarWarsContentDataBase.sClasseVictoryCommon);

		lImperialSSD.getElementInfos().add(StarWarsContentDataBase.sClasseAssertorLegends);
		lImperialSSD.getElementInfos().add(StarWarsContentDataBase.sClasseBellatorLegends);
		lImperialSSD.getElementInfos().add(StarWarsContentDataBase.sClasseEclipseLegends);
		lImperialSSD.getElementInfos().add(StarWarsContentDataBase.sClasseExecutorLegends);
		lImperialSSD.getElementInfos().add(StarWarsContentDataBase.sClasseSovereignLegends);
		lImperialSSD.getElementInfos().add(StarWarsContentDataBase.sClasseVengeanceLegends);

		lImperialStations.getElementInfos().add(StarWarsContentDataBase.sCanonGalactiqueLegends);
		lImperialStations.getElementInfos().add(StarWarsContentDataBase.sEtoiledelaMortCommon);
		lImperialStations.getElementInfos().add(StarWarsContentDataBase.sEtoileNoireCommon);
		lImperialStations.getElementInfos().add(StarWarsContentDataBase.sLeTarkinLegends);

		lCsiFighters.getElementInfos().add(StarWarsContentDataBase.sCanonnieredroideCommon);
		lCsiFighters.getElementInfos().add(StarWarsContentDataBase.sChasseurGinivexCommon);
//		lCsiFighters.getElementInfos().add(StarWarsContentDataBase.sBombardierHyenaCommon);
		lCsiFighters.getElementInfos().add(StarWarsContentDataBase.sChasseurNantexCommon);
		lCsiFighters.getElementInfos().add(StarWarsContentDataBase.sDroideTrichasseurCommon);
		lCsiFighters.getElementInfos().add(StarWarsContentDataBase.sDroideVautourCommon);
		lCsiFighters.getElementInfos().add(StarWarsContentDataBase.sBelbullabCommon);

		lCsiTransports.getElementInfos().add(StarWarsContentDataBase.sBargeC9979Common);
		lCsiTransports.getElementInfos().add(StarWarsContentDataBase.sCroiseurDiamantCommon);
		lCsiTransports.getElementInfos().add(StarWarsContentDataBase.sFuseeHardcellCommon);
		lCsiTransports.getElementInfos().add(StarWarsContentDataBase.sNavetteSheathipedeCommon);
		lCsiTransports.getElementInfos().add(StarWarsContentDataBase.sVoiliersolaireCommon);

		lCsiSD.getElementInfos().add(StarWarsContentDataBase.sVaisseauNoyauCommon);
		lCsiSD.getElementInfos().add(StarWarsContentDataBase.sCroiseurLucrehulkCommon);
		lCsiSD.getElementInfos().add(StarWarsContentDataBase.sClasseMunificientCommon);
		lCsiSD.getElementInfos().add(StarWarsContentDataBase.sClasseProvidenceCommon);
		lCsiSD.getElementInfos().add(StarWarsContentDataBase.sClasseRecusantCommon);

		lAllianceFighters.getElementInfos().add(StarWarsContentDataBase.sAWingCommon);
		lAllianceFighters.getElementInfos().add(StarWarsContentDataBase.sBWingCommon);
		lAllianceFighters.getElementInfos().add(StarWarsContentDataBase.sXWingCommon);
		lAllianceFighters.getElementInfos().add(StarWarsContentDataBase.sYWingCommon);
		lAllianceFighters.getElementInfos().add(StarWarsContentDataBase.sCrossfireLegends);
		lAllianceFighters.getElementInfos().add(StarWarsContentDataBase.sSpeederT47Common);

		lAllianceSD.getElementInfos().add(StarWarsContentDataBase.sCroiseurMC30Common);
		lAllianceSD.getElementInfos().add(StarWarsContentDataBase.sCroiseurMC40Common);
		lAllianceSD.getElementInfos().add(StarWarsContentDataBase.sCroiseurMC80Common);
		lAllianceSD.getElementInfos().add(StarWarsContentDataBase.sCroiseurMC90Common);
		lAllianceSD.getElementInfos().add(StarWarsContentDataBase.sCroiseurMC104Legends);
		lAllianceSD.getElementInfos().add(StarWarsContentDataBase.sCroiseurViscountLegends);
		lAllianceSD.getElementInfos().add(StarWarsContentDataBase.sFregateNebulonCommon);
		lAllianceSD.getElementInfos().add(StarWarsContentDataBase.sFregateTriScytheLegends);

		lRepublicFighters.getElementInfos().add(StarWarsContentDataBase.sARC170Common);
		lRepublicFighters.getElementInfos().add(StarWarsContentDataBase.sChasseurCloneCommon);
		lRepublicFighters.getElementInfos().add(StarWarsContentDataBase.sEbonHawkLegends);
		lRepublicFighters.getElementInfos().add(StarWarsContentDataBase.sIntercepteurETACommon);
		lRepublicFighters.getElementInfos().add(StarWarsContentDataBase.sVWingCommon);
	
		lRepublicTransports.getElementInfos().add(StarWarsContentDataBase.sCannoniereTIOBACommon);
		lRepublicTransports.getElementInfos().add(StarWarsContentDataBase.sCorvetteCR70Common);
		lRepublicTransports.getElementInfos().add(StarWarsContentDataBase.sCroiseurCR20Common);
		lRepublicTransports.getElementInfos().add(StarWarsContentDataBase.sNavetteMinistryLegends);
		lRepublicTransports.getElementInfos().add(StarWarsContentDataBase.sNavetteThetaCommon);
	
		lRepublicSD.getElementInfos().add(StarWarsContentDataBase.sClasseAcclamatorICommon);
		lRepublicSD.getElementInfos().add(StarWarsContentDataBase.sClasseHammerheadLegends);
		lRepublicSD.getElementInfos().add(StarWarsContentDataBase.sClasseInexpugnableLegends);
		lRepublicSD.getElementInfos().add(StarWarsContentDataBase.sClasseVenatorCommon);
		lRepublicSD.getElementInfos().add(StarWarsContentDataBase.sClasseRendiliLegends);
		lRepublicSD.getElementInfos().add(StarWarsContentDataBase.sEndarSpireLegends);
			
		lOutlawFleet.getElementInfos().add(StarWarsContentDataBase.sFauconMilleniumLegends);
		lOutlawFleet.getElementInfos().add(StarWarsContentDataBase.sLadyLuckLegends);
		lOutlawFleet.getElementInfos().add(StarWarsContentDataBase.sLeMynockLegends);
		lOutlawFleet.getElementInfos().add(StarWarsContentDataBase.sSlave1Legends);
		lOutlawFleet.getElementInfos().add(StarWarsContentDataBase.sUhumeleLegends);
		lOutlawFleet.getElementInfos().add(StarWarsContentDataBase.sWildKarrdeLegends);

		lCivilFleet.getElementInfos().add(StarWarsContentDataBase.sChasseurN1Common);
		lCivilFleet.getElementInfos().add(StarWarsContentDataBase.sChasseurP38Common);
		lCivilFleet.getElementInfos().add(StarWarsContentDataBase.sNefRoyaleNabooTJCommon);
		lCivilFleet.getElementInfos().add(StarWarsContentDataBase.sYachtNabooTHCommon);
	
		lImperialArmy.getElementInfos().add(StarWarsContentDataBase.sTBAALegends);
		lImperialArmy.getElementInfos().add(StarWarsContentDataBase.sTBTTCommon);
		lImperialArmy.getElementInfos().add(StarWarsContentDataBase.sTLBTTLegends);
		lImperialArmy.getElementInfos().add(StarWarsContentDataBase.sTPTTCommon);
		lImperialArmy.getElementInfos().add(StarWarsContentDataBase.sTRETTLegends);
		lImperialArmy.getElementInfos().add(StarWarsContentDataBase.sTSTTCommon);
		lImperialArmy.getElementInfos().add(StarWarsContentDataBase.sSpeederbike74ZCommon);
		lImperialArmy.getElementInfos().add(StarWarsContentDataBase.sDevastateurdeMondesLegends);
		
		lCsiArmy.getElementInfos().add(StarWarsContentDataBase.sChardAssautBlindeCommon);
		lCsiArmy.getElementInfos().add(StarWarsContentDataBase.sChardroideHailfireCommon);
		lCsiArmy.getElementInfos().add(StarWarsContentDataBase.sChardroideNRN99Common);
		lCsiArmy.getElementInfos().add(StarWarsContentDataBase.sDroideCrabeCommon);
		lCsiArmy.getElementInfos().add(StarWarsContentDataBase.sDroideAraigneNaineCommon);
		lCsiArmy.getElementInfos().add(StarWarsContentDataBase.sDroideAraigneTraqueurCommon);
		lCsiArmy.getElementInfos().add(StarWarsContentDataBase.sTridroideOctuptarraCommon);
		lCsiArmy.getElementInfos().add(StarWarsContentDataBase.sTransportMultiTroupesCommon);
		lCsiArmy.getElementInfos().add(StarWarsContentDataBase.sTransportdedroidesCommon);
		lCsiArmy.getElementInfos().add(StarWarsContentDataBase.sTanksismiqueCommon);
		lCsiArmy.getElementInfos().add(StarWarsContentDataBase.sMotoRoueCommon);
		lCsiArmy.getElementInfos().add(StarWarsContentDataBase.sSTAPCommon);
		
		lRepublicArmy.getElementInfos().add(StarWarsContentDataBase.sALATCommon);
		lRepublicArmy.getElementInfos().add(StarWarsContentDataBase.sNATTCommon);
		lRepublicArmy.getElementInfos().add(StarWarsContentDataBase.sTRTTCommon);
		lRepublicArmy.getElementInfos().add(StarWarsContentDataBase.sRTTTCommon);
		lRepublicArmy.getElementInfos().add(StarWarsContentDataBase.sTOTTCommon);
		lRepublicArmy.getElementInfos().add(StarWarsContentDataBase.sTXTTLegends);
		lRepublicArmy.getElementInfos().add(StarWarsContentDataBase.sCharTX130Legends);
		lRepublicArmy.getElementInfos().add(StarWarsContentDataBase.sJuggernautCommon);
		
		lCivilVehicles.getElementInfos().add(StarWarsContentDataBase.sAirspeederKoro2Common);
		lCivilVehicles.getElementInfos().add(StarWarsContentDataBase.sAirspeederXJ6Common);
		lCivilVehicles.getElementInfos().add(StarWarsContentDataBase.sAirspeederCommon);
		lCivilVehicles.getElementInfos().add(StarWarsContentDataBase.sBongoCommon);
		lCivilVehicles.getElementInfos().add(StarWarsContentDataBase.sChardessablesCommon);
		lCivilVehicles.getElementInfos().add(StarWarsContentDataBase.sMoissonneuseCD2Legends);
		lCivilVehicles.getElementInfos().add(StarWarsContentDataBase.sPodRacerCommon);
		lCivilVehicles.getElementInfos().add(StarWarsContentDataBase.sPodRacerdAnakinCommon);
		lCivilVehicles.getElementInfos().add(StarWarsContentDataBase.sPodRacerdeSebulbaCommon);
		lCivilVehicles.getElementInfos().add(StarWarsContentDataBase.sVoituredesnuagesCommon);
			
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAllianceGalactiqueLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAllianceIntercoorpCommon);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAllianceRebelleLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAncienEmpireSithLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBaktoidArmorLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sClanBancaireLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCoalitionJediLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sConfreriedesTenebresLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sConsortiumdeHapesLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCSILegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCzerkaLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCartelHypercomLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDeathWatchLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sEmpireEcarlateLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sEmpiredelaMainLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sEmpiredeRevanLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sEmpireInfiniLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sEmpireGalactiqueLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sFederationduCommerceLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGuildeduCommerceCommon);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJediAltisiensLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKrathLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMandaloriensLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNouvelEmpireGalactiqueLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNouvelEmpireSithLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNouvelOrdreJediLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNouvelleRepubliqueLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOrdreJediLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOrdreSithLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPacteJediLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPotentiumLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRevanchismeLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSecondEmpireSithLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTechnoSyndicatLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTribuperduedesSithLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTriumviratSithLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRepubliqueGalactiqueLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSithUniqueLegends);
		lFactionsEncylopedia.getElementInfos().add(StarWarsContentDataBase.sVestigesdelEmpireLegends);
		
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAlderaanCommon);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAmbriaLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAnaxesLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAnoatLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAnsionLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAnzatLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sAquilarisLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBakuraLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBalmorraLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBastionLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBespinCommon);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBozPityLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sBrentaalIVLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sByssLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCaridaLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sChandrilaLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCorbosLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCorelliaLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCoruscantLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCsillaLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDagobahCommon);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDantooineCommon);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDathomirLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDevaronLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDromundKaasLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sDxunLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sEndorLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sFeluciaLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGamorrCommon);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGeonosisLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHadAbbadonLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHapesLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sHothLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sIegoLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sIllumLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sJabiimLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKaminoLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKashyyykLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKesselLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sKorribanLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMalachorVLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMalastareLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sManaanLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMandaloreLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMonCalamariLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMustafarCommon);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sMuunilinstLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNabooLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNagiLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNalHuttaLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNarShaddaaLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNelvaanLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNewHolsticeLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNZothLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOnderonLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOrdCestusLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOrdMantellLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sOssusLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPolisMassaCommon);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPraesitlynLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRalltiirLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRattatakLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRaxusPrimeLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRendiliLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRhenVarLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRodiaLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRuusanLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sRylothLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSaleucamiLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSerennoLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTaivasLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTarisLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTatooineLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sThuleLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sTythonLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sVanqorLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sVjunLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sVossLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sWaylandLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sYavinIVLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sZeltrosLegends);
		lPlanetesEncylopedia.getElementInfos().add(StarWarsContentDataBase.sZiostLegends);

		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.sConflitsdAlsakanLegends);
		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.sPremierGrandSchismeLegends);
		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCroisadesdeContispexLegends);
		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.sSecondGrandSchismeLegends);
		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGuerredelHyperespaceLegends);
		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGrandeGuerredesSithLegends);
		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGuerresMandaloriennesLegends);
		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGuerreCiviledesJediLegends);
		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.s1rGrdeGuerreGalactiqueLegends);
		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGuerreFroideGalactiqueLegends);
		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.s2dGrdeGuerreGalactiqueLegends);
		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.sNouvellesGuerresSithLegends);
		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGuerredeStarkLegends);
		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGuerredesClonesLegends);
		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.s1rGuerreCivileGalactiqueLegends);
		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.s1rGuerreCivileImperialeLegends);
		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCrisedelaFlotteNoireLegends);
		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.sCrisedeCaamasLegends);
		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGuerresYuuzhanVongLegends);
		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGuerredelEssaimLegends);
		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.s2dGuerreCivileGalactiqueLegends);
		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.sGuerreSithoImperialeLegends);
		lConflictEncylopedia.getElementInfos().add(StarWarsContentDataBase.s2dGuerreCivileImperialeLegends);
		
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sArmeioniqueCommon);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sBatterieDF9Common);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sBatterieFDPTourCommon);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sBlasterDC15SCommon);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sBlasterDH17Common);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sBlasterDL44Common);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sBlasterE11Common);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sCanonEWEBCommon);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sCanonioniqueKDYCommon);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sCanonSoniqueCommon);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sDetonateurthermiqueCommon);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sFusilblasterDC15Common);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sFusilblasterDC17Common);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sSabrelaserCommon);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sSuperlaserCommon);
		lWeapons.getElementInfos().add(StarWarsContentDataBase.sTurbolaserCommon);
	
		lNavigation.getElementInfos().add(StarWarsContentDataBase.sAnneauahyperpropulsionCommon);
		lNavigation.getElementInfos().add(StarWarsContentDataBase.sBouclierdeflecteurCommon);
		lNavigation.getElementInfos().add(StarWarsContentDataBase.sHyperpropulsionCommon);
		lNavigation.getElementInfos().add(StarWarsContentDataBase.sPropulsionCommon);
		lNavigation.getElementInfos().add(StarWarsContentDataBase.sRepulsionCommon);

		lUse.getElementInfos().add(StarWarsContentDataBase.sComlinkCommon);
		lUse.getElementInfos().add(StarWarsContentDataBase.sCreditGalactiqueCommon);
		lUse.getElementInfos().add(StarWarsContentDataBase.sCuveabactaCommon);
		lUse.getElementInfos().add(StarWarsContentDataBase.sElectrobinoculaireCommon);
		lUse.getElementInfos().add(StarWarsContentDataBase.sHolocronCommon);
		lUse.getElementInfos().add(StarWarsContentDataBase.sHolonetCommon);
		lUse.getElementInfos().add(StarWarsContentDataBase.sJetpackJT12Common);
		lUse.getElementInfos().add(StarWarsContentDataBase.sJetpackZ6Common);
		lUse.getElementInfos().add(StarWarsContentDataBase.sKamaCommon);
		lUse.getElementInfos().add(StarWarsContentDataBase.sTestJediCommon);
	
		lMaterial.getElementInfos().add(StarWarsContentDataBase.sGazCommon);
		lMaterial.getElementInfos().add(StarWarsContentDataBase.sMetauxCommon);
		lMaterial.getElementInfos().add(StarWarsContentDataBase.sMinerauxCommon);
			
		lConceptEncyclopedia.getElementInfos().add(StarWarsContentDataBase.sArtJediLegends);
		lConceptEncyclopedia.getElementInfos().add(StarWarsContentDataBase.sAurebeshCommon);
		lConceptEncyclopedia.getElementInfos().add(StarWarsContentDataBase.sDistanceCommon);
		lConceptEncyclopedia.getElementInfos().add(StarWarsContentDataBase.sLaForceCommon);
		lConceptEncyclopedia.getElementInfos().add(StarWarsContentDataBase.sCodeJediCommon);
		lConceptEncyclopedia.getElementInfos().add(StarWarsContentDataBase.sCodeSithCommon);
		lConceptEncyclopedia.getElementInfos().add(StarWarsContentDataBase.sLeTempsCommon);

		lChronology.getElementInfos().add(ChronologyContentLegends.getCompleteChronology());
		lChronology.getElementInfos().add(ChronologyContentLegends.getEmpireEnd());
		lChronology.getElementInfos().add(ChronologyContentLegends.getAllianceSuccession());
		lChronology.getElementInfos().add(ChronologyContentLegends.getEmpireSuccession());
		lChronology.getElementInfos().add(ChronologyContentLegends.getSithSuccession());

		lGenealogy.getElementInfos().add(GenealogyContentLegends.getGeneralGenealogy());
		lGenealogy.getElementInfos().add(GenealogyContentLegends.getSkywalkerHouse());
		lGenealogy.getElementInfos().add(GenealogyContentLegends.getSoloHouse());
		lGenealogy.getElementInfos().add(GenealogyContentLegends.getFelHouse());
		lGenealogy.getElementInfos().add(GenealogyContentLegends.getHapesHouse());
		lGenealogy.getElementInfos().add(GenealogyContentLegends.getClanFett());
		lGenealogy.getElementInfos().add(GenealogyContentLegends.getAttichitkutFamily());
		lGenealogy.getElementInfos().add(GenealogyContentLegends.getNaberrieHouse());
		lGenealogy.getElementInfos().add(GenealogyContentLegends.getSith());
		lGenealogy.getElementInfos().add(GenealogyContentLegends.getJedi());
		lGenealogy.getElementInfos().add(GenealogyContentLegends.getJediSithEvolution());
		lGenealogy.getElementInfos().add(GenealogyContentLegends.getPoliticEvolution());
	
		lGalaxy.getElementInfos().add(GalaxyContentLegends.getGlobalGalaxy());
		
		return lAppInfo;
	}

	private static SectionInfo createSectionInfo(String iTitle,
			String iIcon,
			String iImage,
			String iDescription,
			boolean iFinal) {
		SectionInfo lSectionInfo = new SectionInfo();
		lSectionInfo.setTitle(iTitle);
		lSectionInfo.setIcon(iIcon);
		if (iImage != null)
			lSectionInfo.setImageName(iImage);
		lSectionInfo.setFinal(iFinal);
		lSectionInfo.setDescription(iDescription);
		return lSectionInfo;
	}
	
	public static ElementInfo createElementInfo(String iIcon, 
												String iTitle, 
												String[] iKeyWords,
												String iDescription,
												String iText,
												String... iImages) {
			EncyclopediaModule lEncyclopedia = StarWarsApp.ginjector.getEncyclopedia();
		    lEncyclopedia.init(iText, iImages);
		        
			ElementInfo lElementInfo = new ElementInfo();
			lElementInfo.setIcon(iIcon);
			lElementInfo.setTitle(iTitle);
			lElementInfo.setDescription(iDescription);
			lElementInfo.setImageName(iImages[0]);
			lElementInfo.getKeyWords().addAll(Arrays.asList(iKeyWords));
			lElementInfo.setAComponent(lEncyclopedia);
			
			return lElementInfo;
	}

	public static ElementInfo createElementInfo(String iIcon, 
												String iTitle, 
												String[] iKeyWords,
												String iDescription,
												String iSumup,
												String iText,
												int iBeginDate,
												int iEndDate,
												DescriptionItem[] iItems,
												ElementColor iColor,
												String... iImages) {
			ElementInfo lElementInfo = new ElementInfo();
			lElementInfo.setIcon(iIcon);
			lElementInfo.setTitle(iTitle);
			lElementInfo.setDescription(iDescription);
			lElementInfo.setImageName(iImages[0]);
			lElementInfo.setBeginDate(iBeginDate);
			lElementInfo.setEndDate(iEndDate);
			lElementInfo.setColor(iColor);
			lElementInfo.getKeyWords().addAll(Arrays.asList(iKeyWords));
			
			DescriptionItem lDateItem = StarWarsApp.ginjector.getDescriptionItem();
			if (iEndDate != Integer.MAX_VALUE && iBeginDate != iEndDate) {
				lDateItem.init("Durée", "M", String.valueOf(iEndDate - iBeginDate), (iEndDate - iBeginDate > 1) ? "années" : "année");
				lElementInfo.getItems().add(lDateItem);
			}
			
			if (iItems != null) {
				lElementInfo.getItems().addAll(Arrays.asList(iItems));
			}
			
			if (iSumup.equals("")) {
				iSumup = iDescription;
			}
			lElementInfo.setSumup(iSumup);
			
			if (!iText.equals("")) {
				EncyclopediaModule lEncyclopedia = StarWarsApp.ginjector.getEncyclopedia();
				lEncyclopedia.init(iText, iImages);
				lElementInfo.setAComponent(lEncyclopedia);
			}

			return lElementInfo;
}
	
	public static ElementInfo createBasicInfo(String iTag,
			  String iTitle,
			  String iDescription) {
			ElementInfo lElementInfo = new ElementInfo();
			lElementInfo.setIcon(iTag);
			lElementInfo.setTitle(iTitle);
			lElementInfo.setDescription(iDescription);
			return lElementInfo;
	}
}