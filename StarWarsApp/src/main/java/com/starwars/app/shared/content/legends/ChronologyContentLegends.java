package com.starwars.app.shared.content.legends;

import com.starwars.app.client.StarWarsApp;
import com.starwars.app.client.chronology.presenter.ChronologyModule;
import com.starwars.app.client.chronology.presenter.EraPeriod;
import com.starwars.app.client.chronology.presenter.GouvPeriod;
import com.starwars.app.client.chronology.presenter.ReligionPeriod;
import com.starwars.app.client.chronology.presenter.WarPeriod;
import com.starwars.app.shared.AppFactory;
import com.starwars.app.shared.ElementInfo;
import com.starwars.app.shared.content.StarWarsContentDataBase;

public class ChronologyContentLegends {

	public static final int UNKNOWN_DATE = Integer.MAX_VALUE;
	
	public static ElementInfo getEmpireEnd() {
		GouvPeriod lGalacticEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lGalacticEmpire.init(StarWarsContentDataBase.sEmpireGalactiqueLegends);
		
		GouvPeriod lDarkEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lDarkEmpire.setMajorGouv(false);
		lDarkEmpire.init(StarWarsContentDataBase.sEmpiredesTenebresLegends);
		
		GouvPeriod lCrimsonEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lCrimsonEmpire.setMajorGouv(false);
		lCrimsonEmpire.init(StarWarsContentDataBase.sEmpireEcarlateLegends);
		
		GouvPeriod lNewRepublic = StarWarsApp.ginjector.getGouvPeriod();
		lNewRepublic.init(StarWarsContentDataBase.sNouvelleRepubliqueLegends);
		
		GouvPeriod lHandEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lHandEmpire.init(StarWarsContentDataBase.sEmpiredelaMainLegends);
		lHandEmpire.setMajorGouv(false);
		lHandEmpire.setApproxEndDate("?");
		
		GouvPeriod lRebelAlliance = StarWarsApp.ginjector.getGouvPeriod();
		lRebelAlliance.setMajorGouv(false);
		lRebelAlliance.init(StarWarsContentDataBase.sAllianceRebelleLegends);
		
		GouvPeriod lPentastarAlign = StarWarsApp.ginjector.getGouvPeriod();
		lPentastarAlign.setMajorGouv(false);
		lPentastarAlign.init(StarWarsContentDataBase.sAlignementdePentastarLegends);
		
		WarPeriod lFirstCivilWar = StarWarsApp.ginjector.getWarPeriod();
		lFirstCivilWar.init(StarWarsContentDataBase.s1rGuerreCivileGalactiqueLegends, "Première guerre civile Galactique");
		
		GouvPeriod lEmpireRemain = StarWarsApp.ginjector.getGouvPeriod();
		lEmpireRemain.setMajorGouv(false);
		lEmpireRemain.init(StarWarsContentDataBase.sVestigesdelEmpireLegends);

		GouvPeriod lEriaduAuthority = StarWarsApp.ginjector.getGouvPeriod();
		lEriaduAuthority.setMajorGouv(false);
		lEriaduAuthority.init(StarWarsContentDataBase.sAuthoritedEriaduLegends);
		
		GouvPeriod lHarrskEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lHarrskEmpire.setMajorGouv(false);
		lHarrskEmpire.init(StarWarsContentDataBase.sEmpiredHarrskLegends);

		GouvPeriod lOversectorOuter = StarWarsApp.ginjector.getGouvPeriod();
		lOversectorOuter.setMajorGouv(false);
		lOversectorOuter.init(StarWarsContentDataBase.sGrandSecteurExterieurLegends);

		GouvPeriod lZsinjEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lZsinjEmpire.setMajorGouv(false);
		lZsinjEmpire.init(StarWarsContentDataBase.sEmpiredeZsinjLegends);
		
		GouvPeriod lGreaterMaldrood = StarWarsApp.ginjector.getGouvPeriod();
		lGreaterMaldrood.setMajorGouv(false);
		lGreaterMaldrood.init(StarWarsContentDataBase.sGrandMaldroodLegends);

		GouvPeriod lPrentiochDominion = StarWarsApp.ginjector.getGouvPeriod();
		lPrentiochDominion.setMajorGouv(false);
		lPrentiochDominion.init(StarWarsContentDataBase.sDominiondePrentiochLegends);

		WarPeriod lFirstEmpireCivilWar = StarWarsApp.ginjector.getWarPeriod();
		lFirstEmpireCivilWar.init(StarWarsContentDataBase.s1rGuerreCivileImperialeLegends, "Première guerre civile Impériale");
		
		ChronologyModule lChronology = StarWarsApp.ginjector.getChronology();
		
		lChronology.addPeriod(lFirstCivilWar);
		lChronology.addPeriod(lFirstEmpireCivilWar);
		lChronology.addPeriod(lHandEmpire);
		lChronology.addPeriod(lGalacticEmpire);
		lChronology.addPeriod(lNewRepublic);
		lChronology.addPeriod(lEmpireRemain);
		lChronology.addPeriod(lRebelAlliance);
		lChronology.addPeriod(lCrimsonEmpire);
		lChronology.addPeriod(lGreaterMaldrood);
		lChronology.addPeriod(lEriaduAuthority);
		lChronology.addPeriod(lDarkEmpire);
		lChronology.addPeriod(lZsinjEmpire);
		lChronology.addPeriod(lHarrskEmpire);
		lChronology.addPeriod(lOversectorOuter);
		lChronology.addPeriod(lPentastarAlign);
		
		lChronology.getDisplay().setBlueLegend("Faction dominante");
		lChronology.getDisplay().setPurpleLegend("Faction notable");
		lChronology.getDisplay().setOrangeLegend("Conflict majeur");
		
		lChronology.getDisplay().setTopChronology(500);
		
		ElementInfo lElementInfo = AppFactory.createBasicInfo(AppFactory.sChronologyIcon, "Chute d'un Empire",
				"A la chute de Dark Sidious en 4 ap. BY, l'Empire Galactique se disloque et de nombreux dignitaires impériaux s'autoproclament Seigneur de Guerre, chacun voulant disposer d'un territoire étendu et puissant. C'est le début de la Première Guerre Civile Impériale.");
		lElementInfo.setAComponent(lChronology);
		return lElementInfo;
	}
	
	public static ElementInfo getCompleteChronology() {
		GouvPeriod lInfityEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lInfityEmpire.init(StarWarsContentDataBase.sEmpireInfiniLegends);

//		GouvPeriod lHumanCore = StarWarsApp.ginjector.getGouvPeriod();
//		lHumanCore.init(StarWarsContentDataBase.sColonieshumainesLegends);
		
		GouvPeriod lOldRepublic = StarWarsApp.ginjector.getGouvPeriod();
		lOldRepublic.init(StarWarsContentDataBase.sRepubliqueGalactiqueLegends, "Ancienne République Galactique");
		
		GouvPeriod lGalacticEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lGalacticEmpire.init(StarWarsContentDataBase.sEmpireGalactiqueLegends);
		
		GouvPeriod lDarkEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lDarkEmpire.setMajorGouv(false);
		lDarkEmpire.init(StarWarsContentDataBase.sEmpiredesTenebresLegends);
		
		GouvPeriod lCrimsonEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lCrimsonEmpire.setMajorGouv(false);
		lCrimsonEmpire.init(StarWarsContentDataBase.sEmpireEcarlateLegends);
	
		GouvPeriod lNewRepublic = StarWarsApp.ginjector.getGouvPeriod();
		lNewRepublic.init(StarWarsContentDataBase.sNouvelleRepubliqueLegends, "Nouvelle République Galactique");
		
		GouvPeriod lFGAL = StarWarsApp.ginjector.getGouvPeriod();
		lFGAL.init(StarWarsContentDataBase.sAllianceGalactiqueLegends, "Fédération Galactique des Alliances Libres");
	
		GouvPeriod lCoalitionJedi = StarWarsApp.ginjector.getGouvPeriod();
		lCoalitionJedi.init(StarWarsContentDataBase.sCoalitionJediLegends);
		lCoalitionJedi.setHardTop(true);
		lCoalitionJedi.setMajorGouv(false);
		
		GouvPeriod lCSI = StarWarsApp.ginjector.getGouvPeriod();
		lCSI.setMajorGouv(false);
		lCSI.init(StarWarsContentDataBase.sCSILegends);
		
		GouvPeriod lHandEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lHandEmpire.init(StarWarsContentDataBase.sEmpiredelaMainLegends);
		lHandEmpire.setMajorGouv(false);
		lHandEmpire.setApproxEndDate("?");
		
		GouvPeriod lOldSithEmpireReBuild = StarWarsApp.ginjector.getGouvPeriod();
		lOldSithEmpireReBuild.init(StarWarsContentDataBase.sSecondEmpireSithLegends, "Ancien Empire Sith Reconstitué");
		lOldSithEmpireReBuild.setMajorGouv(false);
		
		WarPeriod lFirstCivilWar = StarWarsApp.ginjector.getWarPeriod();
		lFirstCivilWar.init(StarWarsContentDataBase.s1rGuerreCivileGalactiqueLegends, "Première guerre civile Galactique");
		
		WarPeriod lMandalorianWar = StarWarsApp.ginjector.getWarPeriod();
		lMandalorianWar.init(StarWarsContentDataBase.sGuerresMandaloriennesLegends);
		
		ReligionPeriod lJediOrder = StarWarsApp.ginjector.getReligionPeriod();
		lJediOrder.init(StarWarsContentDataBase.sOrdreJediLegends);
		
		ReligionPeriod lNewJediOrder = StarWarsApp.ginjector.getReligionPeriod();
		lNewJediOrder.setHardTop(true);
		lNewJediOrder.init(StarWarsContentDataBase.sNouvelOrdreJediLegends);
		
		GouvPeriod lOldSithEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lOldSithEmpire.setMajorGouv(false);
		lOldSithEmpire.init(StarWarsContentDataBase.sAncienEmpireSithLegends);
		
		GouvPeriod lRevanEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lRevanEmpire.setMajorGouv(false);
		lRevanEmpire.init(StarWarsContentDataBase.sEmpiredeRevanLegends);
		
		WarPeriod lSecondSchisme = StarWarsApp.ginjector.getWarPeriod();
		lSecondSchisme.init(StarWarsContentDataBase.sSecondGrandSchismeLegends);
		
		WarPeriod lNewSithWar = StarWarsApp.ginjector.getWarPeriod();
		lNewSithWar.init(StarWarsContentDataBase.sNouvellesGuerresSithLegends);

		GouvPeriod lRebelAlliance = StarWarsApp.ginjector.getGouvPeriod();
		lRebelAlliance.setMajorGouv(false);
		lRebelAlliance.init(StarWarsContentDataBase.sAllianceRebelleLegends);
		
		GouvPeriod lNewGalacticEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lNewGalacticEmpire.init(StarWarsContentDataBase.sNouvelEmpireGalactiqueLegends);
		lNewGalacticEmpire.setApproxBeginDate("~44");
		
		GouvPeriod lEmpireExil = StarWarsApp.ginjector.getGouvPeriod();
		lEmpireExil.setMajorGouv(false);
		lEmpireExil.init(StarWarsContentDataBase.sEmpireenExilLegends);
		
		GouvPeriod lFGALRemain = StarWarsApp.ginjector.getGouvPeriod();
		lFGALRemain.setMajorGouv(false);
		lFGALRemain.init(StarWarsContentDataBase.sVestigesdelAllianceLegends);
		
		GouvPeriod lDarkKraytSithEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lDarkKraytSithEmpire.init(StarWarsContentDataBase.sEmpiredeKraytLegends);
		
		GouvPeriod lEmpireRemain = StarWarsApp.ginjector.getGouvPeriod();
		lEmpireRemain.setMajorGouv(false);
		lEmpireRemain.init(StarWarsContentDataBase.sVestigesdelEmpireLegends);
		
		WarPeriod lWarSithEmpire = StarWarsApp.ginjector.getWarPeriod();
		lWarSithEmpire.init(StarWarsContentDataBase.sGuerreSithoImperialeLegends);
		
		WarPeriod lFirstEmpireCivilWar = StarWarsApp.ginjector.getWarPeriod();
		lFirstEmpireCivilWar.init(StarWarsContentDataBase.s1rGuerreCivileImperialeLegends, "Première guerre civile Impériale");
		
		WarPeriod lColdWar = StarWarsApp.ginjector.getWarPeriod();
		lColdWar.init(StarWarsContentDataBase.sGuerreFroideGalactiqueLegends);
		
		WarPeriod lSecondGreatGalacticWar = StarWarsApp.ginjector.getWarPeriod();
		lSecondGreatGalacticWar.setHardTop(true);
		lSecondGreatGalacticWar.init(StarWarsContentDataBase.s2dGrdeGuerreGalactiqueLegends, "Seconde grande guerre Galactique");
		
		WarPeriod lGreatGalacticWar = StarWarsApp.ginjector.getWarPeriod();
		lGreatGalacticWar.init(StarWarsContentDataBase.s1rGrdeGuerreGalactiqueLegends, "Première grande guerre Galactique");
		
		WarPeriod lSecondImperialCivilWar = StarWarsApp.ginjector.getWarPeriod();
		lSecondImperialCivilWar.init(StarWarsContentDataBase.s2dGuerreCivileImperialeLegends, "Seconde guerre civile Impériale");
		
		WarPeriod lCloneWar = StarWarsApp.ginjector.getWarPeriod();
		lCloneWar.init(StarWarsContentDataBase.sGuerredesClonesLegends);
		
		WarPeriod lJediCivilWar = StarWarsApp.ginjector.getWarPeriod();
		lJediCivilWar.init(StarWarsContentDataBase.sGuerreCiviledesJediLegends);
		
		WarPeriod lVongWar = StarWarsApp.ginjector.getWarPeriod();
		lVongWar.init(StarWarsContentDataBase.sGuerresYuuzhanVongLegends);
		
		WarPeriod lSwarmWar = StarWarsApp.ginjector.getWarPeriod();
		lSwarmWar.init(StarWarsContentDataBase.sGuerredelEssaimLegends);
		
		WarPeriod lSecondCivilWar = StarWarsApp.ginjector.getWarPeriod();
		lSecondCivilWar.init(StarWarsContentDataBase.s2dGuerreCivileGalactiqueLegends, "Seconde guerre civile Galactique");
		
		WarPeriod lFirstSchisme = StarWarsApp.ginjector.getWarPeriod();
		lFirstSchisme.init(StarWarsContentDataBase.sPremierGrandSchismeLegends);
		
		WarPeriod lHyperespaceWar = StarWarsApp.ginjector.getWarPeriod();
		lHyperespaceWar.init(StarWarsContentDataBase.sGuerredelHyperespaceLegends);
		
		WarPeriod lGreatSithWar = StarWarsApp.ginjector.getWarPeriod();
		lGreatSithWar.init(StarWarsContentDataBase.sGrandeGuerredesSithLegends);
		
		WarPeriod lDarkWar = StarWarsApp.ginjector.getWarPeriod();
		lDarkWar.init(StarWarsContentDataBase.sGuerresSombresLegends);
		
		WarPeriod lForceWar = StarWarsApp.ginjector.getWarPeriod();
		lForceWar.init(StarWarsContentDataBase.sGuerresdelaForceLegends);

		WarPeriod lCriseBlackFleet = StarWarsApp.ginjector.getWarPeriod();
		lCriseBlackFleet.setHardBottom(true);
		lCriseBlackFleet.init(StarWarsContentDataBase.sCrisedelaFlotteNoireLegends);
		
		WarPeriod lCriseCaamas = StarWarsApp.ginjector.getWarPeriod();
		lCriseCaamas.setHardBottom(true);
		lCriseCaamas.init(StarWarsContentDataBase.sCrisedeCaamasLegends);
		
		WarPeriod lDespotWar = StarWarsApp.ginjector.getWarPeriod();
		lDespotWar.init(StarWarsContentDataBase.sGuerresdelaReinedesposteLegends);
		
		ReligionPeriod lJedaiiOrder = StarWarsApp.ginjector.getReligionPeriod();
		lJedaiiOrder.setHardBottom(true);
		lJedaiiOrder.init(StarWarsContentDataBase.sOrdreJedaiiLegends);
		
		GouvPeriod lSecondFGAL = StarWarsApp.ginjector.getGouvPeriod();
		lSecondFGAL.init(StarWarsContentDataBase.sFederationGalactiqueTripartiteLegends);
		
		GouvPeriod lNewSithEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lNewSithEmpire.setMajorGouv(false);
		lNewSithEmpire.init(StarWarsContentDataBase.sNouvelEmpireSithLegends);
		
		GouvPeriod lDarkBrotherhood = StarWarsApp.ginjector.getGouvPeriod();
		lDarkBrotherhood.setMajorGouv(false);
		lDarkBrotherhood.init(StarWarsContentDataBase.sConfreriedesTenebresLegends);
		
		GouvPeriod lEternalEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lEternalEmpire.setApproxBeginDate("?");
		lEternalEmpire.setApproxEndDate("?");
		lEternalEmpire.init(StarWarsContentDataBase.sEmpireEternelLegends);
		
		WarPeriod lEternalWar = StarWarsApp.ginjector.getWarPeriod();
		lEternalWar.init(StarWarsContentDataBase.sGuerreEternelleLegends);
		
		WarPeriod lAlsakanConflict = StarWarsApp.ginjector.getWarPeriod();
		lAlsakanConflict.init(StarWarsContentDataBase.sConflitsdAlsakanLegends);
		
		
		WarPeriod lContispexCrusade = StarWarsApp.ginjector.getWarPeriod();
		lContispexCrusade.init(StarWarsContentDataBase.sCroisadesdeContispexLegends);
		lContispexCrusade.setHardTop(true);
		
		WarPeriod lStarkkWar = StarWarsApp.ginjector.getWarPeriod();
		lStarkkWar.init(StarWarsContentDataBase.sGuerredeStarkLegends);
		lStarkkWar.setHardTop(true);
		
		WarPeriod lTionWar = StarWarsApp.ginjector.getWarPeriod();
		lTionWar.init(StarWarsContentDataBase.sGuerreTionienneLegends);
		lTionWar.setHardTop(true);
		
		WarPeriod lXimWar = StarWarsApp.ginjector.getWarPeriod();
		lXimWar.init(StarWarsContentDataBase.sGuerresdeXimLegends);
		lXimWar.setHardTop(true);
		
		GouvPeriod lXimEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lXimEmpire.init(StarWarsContentDataBase.sEmpiredeXimLegends);
		lXimEmpire.setHardTop(true);
		
		EraPeriod lTrueSith = StarWarsApp.ginjector.getEraPeriod();
		lTrueSith.setHardBottom(true);
		lTrueSith.init(StarWarsContentDataBase.sVraisSithLegends);
		
		EraPeriod lNaddist = StarWarsApp.ginjector.getEraPeriod();
		lNaddist.init(StarWarsContentDataBase.sNaddismeLegends);
		
		EraPeriod lKrath = StarWarsApp.ginjector.getEraPeriod();
		lKrath.init(StarWarsContentDataBase.sKrathLegends);
		
		EraPeriod lSithTriumvirat = StarWarsApp.ginjector.getEraPeriod();
		lSithTriumvirat.init(StarWarsContentDataBase.sTriumviratSithLegends);
		
		EraPeriod lSithBrotherhood = StarWarsApp.ginjector.getEraPeriod();
		lSithBrotherhood.init(StarWarsContentDataBase.sConfrerieSithLegends);
		
		EraPeriod lRagnosDisciple = StarWarsApp.ginjector.getEraPeriod();
		lRagnosDisciple.init(StarWarsContentDataBase.sDisciplesdeRagnosLegends);
		
		EraPeriod lLostTribe = StarWarsApp.ginjector.getEraPeriod();
		lLostTribe.setHardBottom(true);
		lLostTribe.init(StarWarsContentDataBase.sTribuperduedesSithLegends);
		
		EraPeriod lLumiyaSith = StarWarsApp.ginjector.getEraPeriod();
		lLumiyaSith.setHardBottom(true);
		lLumiyaSith.init(StarWarsContentDataBase.sSithdeLumiyaLegends);
		
		EraPeriod lPacteJedi = StarWarsApp.ginjector.getEraPeriod();
		lPacteJedi.setHardTop(true);
		lPacteJedi.init(StarWarsContentDataBase.sPacteJediLegends);
		
		EraPeriod lRevanchism = StarWarsApp.ginjector.getEraPeriod();
		lRevanchism.setHardTop(true);
		lRevanchism.init(StarWarsContentDataBase.sRevanchismeLegends);
		
		EraPeriod lAltisienJedi = StarWarsApp.ginjector.getEraPeriod();
		lAltisienJedi.setApproxBeginDate("?");
		lAltisienJedi.setHardBottom(true);
		lAltisienJedi.init(StarWarsContentDataBase.sJediAltisiensLegends);
		
		EraPeriod lRevanOrdre = StarWarsApp.ginjector.getEraPeriod();
		lRevanOrdre.setApproxBeginDate("?");
		lRevanOrdre.setHardTop(true);
		lRevanOrdre.init(StarWarsContentDataBase.sOrdredeRevanLegends);
		
		/* Ordres */
		
		ReligionPeriod lSithCode = StarWarsApp.ginjector.getReligionPeriod();
		lSithCode.init(StarWarsContentDataBase.sCodeSithCommon);
		
		ReligionPeriod lOneSith = StarWarsApp.ginjector.getReligionPeriod();
		lOneSith.init(StarWarsContentDataBase.sSithUniqueLegends);
		
		ReligionPeriod lRuleOfTwo = StarWarsApp.ginjector.getReligionPeriod();
		lRuleOfTwo.setHardBottom(true);
		lRuleOfTwo.init(StarWarsContentDataBase.sRegledesDeuxLegends);
		
		ChronologyModule lChronology = StarWarsApp.ginjector.getChronology();

//		lChronology.addPeriod(lHumanCore);
		lChronology.addPeriod(lCSI);
		lChronology.addPeriod(lHandEmpire);
		lChronology.addPeriod(lOldSithEmpire);
		lChronology.addPeriod(lOldSithEmpireReBuild);
		lChronology.addPeriod(lPacteJedi);
		lChronology.addPeriod(lRevanchism);
		lChronology.addPeriod(lInfityEmpire);
		lChronology.addPeriod(lOldRepublic);
		lChronology.addPeriod(lAltisienJedi);
		lChronology.addPeriod(lGalacticEmpire);
		lChronology.addPeriod(lDarkEmpire);
		lChronology.addPeriod(lCrimsonEmpire);
		lChronology.addPeriod(lNewRepublic);
		lChronology.addPeriod(lFGAL);
		lChronology.addPeriod(lCoalitionJedi);
		lChronology.addPeriod(lFGALRemain);
		lChronology.addPeriod(lEmpireExil);
		lChronology.addPeriod(lEmpireRemain);
		lChronology.addPeriod(lDarkKraytSithEmpire);
		lChronology.addPeriod(lNewGalacticEmpire);
		lChronology.addPeriod(lRebelAlliance);
		lChronology.addPeriod(lRevanEmpire);
		lChronology.addPeriod(lKrath);
		lChronology.addPeriod(lSithTriumvirat);
		lChronology.addPeriod(lSecondFGAL);
		lChronology.addPeriod(lDarkBrotherhood);
		lChronology.addPeriod(lNewSithEmpire);
		lChronology.addPeriod(lOldSithEmpire);
		lChronology.addPeriod(lEternalEmpire);
		
		lChronology.addPeriod(lSecondSchisme);
		lChronology.addPeriod(lNewSithWar);
		lChronology.addPeriod(lWarSithEmpire);
		lChronology.addPeriod(lFirstCivilWar);
		lChronology.addPeriod(lMandalorianWar);
		lChronology.addPeriod(lColdWar);
		lChronology.addPeriod(lSecondImperialCivilWar);
		lChronology.addPeriod(lGreatGalacticWar);
		lChronology.addPeriod(lCloneWar);
		lChronology.addPeriod(lJediCivilWar);
		
		lChronology.addPeriod(lCriseBlackFleet);
		lChronology.addPeriod(lCriseCaamas);
		
		lChronology.addPeriod(lSwarmWar);
		lChronology.addPeriod(lSecondCivilWar);
		lChronology.addPeriod(lVongWar);
		lChronology.addPeriod(lGreatSithWar);
		lChronology.addPeriod(lHyperespaceWar);
		lChronology.addPeriod(lFirstSchisme);
		lChronology.addPeriod(lDarkWar);
		lChronology.addPeriod(lForceWar);
		lChronology.addPeriod(lDespotWar);
		lChronology.addPeriod(lFirstEmpireCivilWar);
		lChronology.addPeriod(lEternalWar);
		lChronology.addPeriod(lSecondGreatGalacticWar);
		lChronology.addPeriod(lAlsakanConflict);

		lChronology.addPeriod(lJediOrder);
		lChronology.addPeriod(lOneSith);
		lChronology.addPeriod(lSithCode);
		lChronology.addPeriod(lRagnosDisciple);
		lChronology.addPeriod(lLumiyaSith);
		lChronology.addPeriod(lRuleOfTwo);
		lChronology.addPeriod(lNewJediOrder);
		lChronology.addPeriod(lNaddist);
		lChronology.addPeriod(lJedaiiOrder);
		
		lChronology.addPeriod(lSithBrotherhood);
		lChronology.addPeriod(lLostTribe);
		lChronology.addPeriod(lTrueSith);
		
		lChronology.addPeriod(lRevanOrdre);
		lChronology.addPeriod(lStarkkWar);
		lChronology.addPeriod(lContispexCrusade);
		lChronology.addPeriod(lXimEmpire);
		lChronology.addPeriod(lXimWar);
		lChronology.addPeriod(lTionWar);
		
		lChronology.getDisplay().setBlueLegend("Faction dominante");
		lChronology.getDisplay().setPurpleLegend("Faction notable");
		lChronology.getDisplay().setOrangeLegend("Conflict majeur");
		lChronology.getDisplay().setGreenLegend("Structure Jedi ou Sith");
		lChronology.getDisplay().setYellowLegend("Secte Jedi ou Sith");
		
		lChronology.getDisplay().setTopChronology(320);
		
		ElementInfo lElementInfo = AppFactory.createBasicInfo(AppFactory.sChronologyIcon, "Chronologie détaillée", 
				"Cette chronologie met en évidence les différentes factions, guerres et périodes qui constituent l'ensemble de l'univers étendu de Star Wars.");
		lElementInfo.setAComponent(lChronology);
		return lElementInfo;
	}
	
	public static ElementInfo getAllianceSuccession() {
		GouvPeriod lOldRepublic = StarWarsApp.ginjector.getGouvPeriod();
		lOldRepublic.setHardBottom(true);
		lOldRepublic.init(StarWarsContentDataBase.sRepubliqueGalactiqueLegends, "Ancienne République Galactique");
		
		GouvPeriod lRebelAlliance = StarWarsApp.ginjector.getGouvPeriod();
		lRebelAlliance.setHardBottom(true);
		lRebelAlliance.init(StarWarsContentDataBase.sAllianceRebelleLegends);
		
		GouvPeriod lNewRepublic = StarWarsApp.ginjector.getGouvPeriod();
		lNewRepublic.setHardBottom(true);
		lNewRepublic.init(StarWarsContentDataBase.sNouvelleRepubliqueLegends, "Nouvelle République Galactique");
		
		GouvPeriod lFGAL = StarWarsApp.ginjector.getGouvPeriod();
		lFGAL.setHardBottom(true);
		lFGAL.init(StarWarsContentDataBase.sAllianceGalactiqueLegends, "Fédération Galactique des Alliances Libres");
		
		GouvPeriod lFGALRemain = StarWarsApp.ginjector.getGouvPeriod();
		lFGALRemain.setHardBottom(true);
		lFGALRemain.init(StarWarsContentDataBase.sVestigesdelAllianceLegends);
		
		GouvPeriod lSecondFGAL = StarWarsApp.ginjector.getGouvPeriod();
		lSecondFGAL.setHardBottom(true);
		lSecondFGAL.init(StarWarsContentDataBase.sFederationGalactiqueTripartiteLegends);
		
		EraPeriod lJanarus = StarWarsApp.ginjector.getEraPeriod();
		lJanarus.setHardTop(true);
		lJanarus.init(StarWarsContentDataBase.sDorianJanarusLegends, -3653, -3641);
		
		EraPeriod lSaresh = StarWarsApp.ginjector.getEraPeriod();
		lSaresh.setHardTop(true);
		lSaresh.init(StarWarsContentDataBase.sLeontyneSareshLegends, -3641, -3639);
		
		EraPeriod lKalpana = StarWarsApp.ginjector.getEraPeriod();
		lKalpana.setHardTop(true);
		lKalpana.init(StarWarsContentDataBase.sKalpanaLegends, -44, -40);
		
		EraPeriod lValorum = StarWarsApp.ginjector.getEraPeriod();
		lValorum.setHardTop(true);
		lValorum.init(StarWarsContentDataBase.sFinisValorumLegends, -40, -32);
		
		EraPeriod lPalpatine = StarWarsApp.ginjector.getEraPeriod();
		lPalpatine.setHardTop(true);
		lPalpatine.init(StarWarsContentDataBase.sSheevPalpatineLegends, -32, -19);
		
		EraPeriod lMonMothma = StarWarsApp.ginjector.getEraPeriod();
		lMonMothma.setHardTop(true);
		lMonMothma.init(StarWarsContentDataBase.sMonMothmaLegends, -2, 11);
		
		EraPeriod lLeia1 = StarWarsApp.ginjector.getEraPeriod();
		lLeia1.setHardTop(true);
		lLeia1.init(StarWarsContentDataBase.sLeiaOrganaLegends, 11, 19);
		
		EraPeriod lPonc = StarWarsApp.ginjector.getEraPeriod();
		lPonc.setHardTop(true);
		lPonc.init(StarWarsContentDataBase.sPoncGavrisomLegends, 19, 23);
		
		EraPeriod lLeia2 = StarWarsApp.ginjector.getEraPeriod();
		lLeia2.setHardTop(true);
		lLeia2.init(StarWarsContentDataBase.sLeiaOrganaLegends, 23, 24);
		
		EraPeriod lBorsk = StarWarsApp.ginjector.getEraPeriod();
		lBorsk.setHardTop(true);
		lBorsk.init(StarWarsContentDataBase.sBorskFeylyaLegends, 24, 27);
		
		EraPeriod lCalOmas = StarWarsApp.ginjector.getEraPeriod();
		lCalOmas.setHardTop(true);
		lCalOmas.init(StarWarsContentDataBase.sCalOmasLegends, 27, 40);
		
		EraPeriod lJacen = StarWarsApp.ginjector.getEraPeriod();
		lJacen.setHardTop(true);
		lJacen.init(StarWarsContentDataBase.sJacenSoloLegends, 40, 41);
		
		EraPeriod lNathal = StarWarsApp.ginjector.getEraPeriod();
		lNathal.setHardTop(true);
		lNathal.init(StarWarsContentDataBase.sChaNiathalLegends, 40, 41);
		
		EraPeriod lDaala = StarWarsApp.ginjector.getEraPeriod();
		lDaala.setHardTop(true);
		lDaala.init(StarWarsContentDataBase.sNatasiDaalaLegends, 41, 44);
		
		EraPeriod lSebatyne = StarWarsApp.ginjector.getEraPeriod();
		lSebatyne.setHardTop(true);
		lSebatyne.init(StarWarsContentDataBase.sSabaSebatyneLegends, 44, 45);
		
		EraPeriod lTreen = StarWarsApp.ginjector.getEraPeriod();
		lTreen.setHardTop(true);
		lTreen.init(StarWarsContentDataBase.sHaydnarTreenLegends, 44, 45);
		
		EraPeriod lJaxton = StarWarsApp.ginjector.getEraPeriod();
		lJaxton.setHardTop(true);
		lJaxton.init(StarWarsContentDataBase.sMerratJaxtonLegends, 44, 45);
		
		EraPeriod lDorvan = StarWarsApp.ginjector.getEraPeriod();
		lDorvan.setHardTop(true);
		lDorvan.init(StarWarsContentDataBase.sWynnDorvanLegends, 44, 50);
		
		EraPeriod lAntilles = StarWarsApp.ginjector.getEraPeriod();
		lAntilles.setHardTop(true);
		lAntilles.setApproxBeginDate("?");
		lAntilles.init(StarWarsContentDataBase.sBailAntilles2Legends, 125, 130, "Bail Antilles");
		
		EraPeriod lGahan = StarWarsApp.ginjector.getEraPeriod();
		lGahan.setHardTop(true);
		lGahan.setApproxBeginDate("?");
		lGahan.init(StarWarsContentDataBase.sGialGahanLegends, 125, 130);
		
		EraPeriod lToreena = StarWarsApp.ginjector.getEraPeriod();
		lToreena.setHardTop(true);
		lToreena.setApproxBeginDate("?");
		lToreena.init(StarWarsContentDataBase.sNuToreenaLegends, 125, 130);
		
		EraPeriod lStazi = StarWarsApp.ginjector.getEraPeriod();
		lStazi.setHardTop(true);
		lStazi.init(StarWarsContentDataBase.sGarStaziLegends, 130, UNKNOWN_DATE);
		
		EraPeriod lMarasiah = StarWarsApp.ginjector.getEraPeriod();
		lMarasiah.setHardTop(true);
		lMarasiah.init(StarWarsContentDataBase.sMarasiahFelLegends, 138, UNKNOWN_DATE);
		
		EraPeriod lKkruh = StarWarsApp.ginjector.getEraPeriod();
		lKkruh.setHardTop(true);
		lKkruh.init(StarWarsContentDataBase.sKKruhkLegends, 138, UNKNOWN_DATE);
		
		ChronologyModule lChronology = StarWarsApp.ginjector.getChronology();
		lChronology.addPeriod(lOldRepublic);
		lChronology.addPeriod(lRebelAlliance);
		lChronology.addPeriod(lNewRepublic);
		lChronology.addPeriod(lFGAL);
		lChronology.addPeriod(lFGALRemain);
		lChronology.addPeriod(lSecondFGAL);
		
		lChronology.addPeriod(lSaresh);
		lChronology.addPeriod(lJanarus);
		lChronology.addPeriod(lAntilles);
		lChronology.addPeriod(lBorsk);
		lChronology.addPeriod(lCalOmas);
		lChronology.addPeriod(lDaala);
		lChronology.addPeriod(lDorvan);
		lChronology.addPeriod(lGahan);
		lChronology.addPeriod(lJacen);
		lChronology.addPeriod(lNathal);
		lChronology.addPeriod(lJaxton);
		lChronology.addPeriod(lKalpana);
		lChronology.addPeriod(lLeia1);
		lChronology.addPeriod(lLeia2);
		lChronology.addPeriod(lMonMothma);
		lChronology.addPeriod(lPalpatine);
		lChronology.addPeriod(lPonc);
		lChronology.addPeriod(lSebatyne);
		lChronology.addPeriod(lStazi);
		lChronology.addPeriod(lMarasiah);
		lChronology.addPeriod(lKkruh);
		lChronology.addPeriod(lToreena);
		lChronology.addPeriod(lTreen);
		lChronology.addPeriod(lValorum);
		
		lChronology.getDisplay().setBlueLegend("Gouvernement en place");
		lChronology.getDisplay().setYellowLegend("Chef du gouvernement");
		
		lChronology.getDisplay().setTopChronology(290);
		
		ElementInfo lElementInfo = AppFactory.createBasicInfo(AppFactory.sChronologyIcon, "Successions de l'Alliance", 
				"Succession des dirigeants de la République et de l'Alliance.");
		lElementInfo.setAComponent(lChronology);
		return lElementInfo;
	}
	
	public static ElementInfo getEmpireSuccession() {
		GouvPeriod lGalacticEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lGalacticEmpire.setHardBottom(true);
		lGalacticEmpire.init(StarWarsContentDataBase.sEmpireGalactiqueLegends);
		
		GouvPeriod lDarkEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lDarkEmpire.setHardBottom(true);
		lDarkEmpire.init(StarWarsContentDataBase.sEmpiredesTenebresLegends);
		
		GouvPeriod lCrimsonEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lCrimsonEmpire.setHardBottom(true);
		lCrimsonEmpire.init(StarWarsContentDataBase.sEmpireEcarlateLegends);
		
		GouvPeriod lEmpireRemain = StarWarsApp.ginjector.getGouvPeriod();
		lEmpireRemain.setHardBottom(true);
		lEmpireRemain.init(StarWarsContentDataBase.sVestigesdelEmpireLegends);
		
		GouvPeriod lNewGalacticEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lNewGalacticEmpire.setHardBottom(true);
		lNewGalacticEmpire.init(StarWarsContentDataBase.sNouvelEmpireGalactiqueLegends);
		lNewGalacticEmpire.setApproxBeginDate("~44");
		
		GouvPeriod lEmpireExil = StarWarsApp.ginjector.getGouvPeriod();
		lEmpireExil.setHardBottom(true);
		lEmpireExil.init(StarWarsContentDataBase.sEmpireenExilLegends);
		
		GouvPeriod lSecondFGAL = StarWarsApp.ginjector.getGouvPeriod();
		lSecondFGAL.setHardBottom(true);
		lSecondFGAL.init(StarWarsContentDataBase.sFederationGalactiqueTripartiteLegends);
		
		EraPeriod lPalpatine1 = StarWarsApp.ginjector.getEraPeriod();
		lPalpatine1.setHardTop(true);
		lPalpatine1.init(StarWarsContentDataBase.sDarkSidiousLegends, -19, 4);
		
		EraPeriod lPestage = StarWarsApp.ginjector.getEraPeriod();
		lPestage.setHardTop(true);
		lPestage.init(StarWarsContentDataBase.sSatePestageLegends, 4, 5);
		
		EraPeriod lIsard = StarWarsApp.ginjector.getEraPeriod();
		lIsard.setHardTop(true);
		lIsard.init(StarWarsContentDataBase.sYsanneIsardLegends, 5, 7);
		
		EraPeriod lThrawn = StarWarsApp.ginjector.getEraPeriod();
		lThrawn.setHardTop(true);
		lThrawn.init(StarWarsContentDataBase.sThrawnLegends, 7, 9);
		
		EraPeriod lMoff1 = StarWarsApp.ginjector.getEraPeriod();
		lMoff1.setHardTop(true);
		lMoff1.init(StarWarsContentDataBase.sConseildesMoffsLegends, 9, 130);
		
		EraPeriod lPalpatine2 = StarWarsApp.ginjector.getEraPeriod();
		lPalpatine2.setHardTop(true);
		lPalpatine2.init(StarWarsContentDataBase.sDarkSidiousLegends, 10, 11);
		
		EraPeriod lJax = StarWarsApp.ginjector.getEraPeriod();
		lJax.setHardTop(true);
		lJax.init(StarWarsContentDataBase.sCarnorJaxLegends, 11, 12);
		
		EraPeriod lCarivus = StarWarsApp.ginjector.getEraPeriod();
		lCarivus.setHardTop(true);
		lCarivus.init(StarWarsContentDataBase.sXandelCarivusLegends, 11, 12);
		
		EraPeriod lPellaeon = StarWarsApp.ginjector.getEraPeriod();
		lPellaeon.setHardTop(true);
		lPellaeon.init(StarWarsContentDataBase.sGiladPellaeonLegends, 12, 41);
		
		EraPeriod lJagged1 = StarWarsApp.ginjector.getEraPeriod();
		lJagged1.setHardTop(true);
		lJagged1.init(StarWarsContentDataBase.sJaggedFelLegends, 41, 43);
		
		EraPeriod lVitor = StarWarsApp.ginjector.getEraPeriod();
		lVitor.setHardTop(true);
		lVitor.init(StarWarsContentDataBase.sVitorReigeLegends, 43, 44);
		
		EraPeriod lJagged2 = StarWarsApp.ginjector.getEraPeriod();
		lJagged2.setHardTop(true);
		lJagged2.setApproxEndDate("?");
		lJagged2.init(StarWarsContentDataBase.sJaggedFelLegends, 44, 60);
		
		EraPeriod lRoan = StarWarsApp.ginjector.getEraPeriod();
		lRoan.setHardTop(true);
		lRoan.init(StarWarsContentDataBase.sRoanFelLegends, 127, 138);
		
		EraPeriod lStazi = StarWarsApp.ginjector.getEraPeriod();
		lStazi.setHardTop(true);
		lStazi.init(StarWarsContentDataBase.sGarStaziLegends, 138, UNKNOWN_DATE);
		
		EraPeriod lMarasiah = StarWarsApp.ginjector.getEraPeriod();
		lMarasiah.setHardTop(true);
		lMarasiah.init(StarWarsContentDataBase.sMarasiahFelLegends, 138, UNKNOWN_DATE);
		
		EraPeriod lKkruh = StarWarsApp.ginjector.getEraPeriod();
		lKkruh.setHardTop(true);
		lKkruh.init(StarWarsContentDataBase.sKKruhkLegends, 138, UNKNOWN_DATE);

		ChronologyModule lChronology = StarWarsApp.ginjector.getChronology();
		
		lChronology.addPeriod(lGalacticEmpire);
		lChronology.addPeriod(lDarkEmpire);
		lChronology.addPeriod(lCrimsonEmpire);
		lChronology.addPeriod(lEmpireRemain);
		lChronology.addPeriod(lNewGalacticEmpire);
		lChronology.addPeriod(lEmpireExil);
		lChronology.addPeriod(lSecondFGAL);
		
		lChronology.addPeriod(lMoff1);
		lChronology.addPeriod(lCarivus);
		lChronology.addPeriod(lJagged1);
		lChronology.addPeriod(lJagged2);
		lChronology.addPeriod(lJax);
		lChronology.addPeriod(lPellaeon);
		lChronology.addPeriod(lPestage);
		lChronology.addPeriod(lRoan);
		lChronology.addPeriod(lThrawn);
		lChronology.addPeriod(lVitor);
		lChronology.addPeriod(lPalpatine1);
		lChronology.addPeriod(lPalpatine2);
		lChronology.addPeriod(lIsard);
		lChronology.addPeriod(lStazi);
		lChronology.addPeriod(lMarasiah);
		lChronology.addPeriod(lKkruh);
		
		lChronology.getDisplay().setBlueLegend("Gouvernement en place");
		lChronology.getDisplay().setYellowLegend("Chef du gouvernement");
		
		lChronology.getDisplay().setTopChronology(290);
		
		ElementInfo lElementInfo = AppFactory.createBasicInfo(AppFactory.sChronologyIcon, "Successions de l'Empire", 
				"Succession des dirigeants de l'Empire Galactique et des structures impériales qui ont suivi.");
		lElementInfo.setAComponent(lChronology);
		return lElementInfo;
	}
	
	public static ElementInfo getSithSuccession() {
		
		/* Organisations */

		GouvPeriod lOldSithEmpireReBuild = StarWarsApp.ginjector.getGouvPeriod();
		lOldSithEmpireReBuild.setHardBottom(true);
		lOldSithEmpireReBuild.init(StarWarsContentDataBase.sSecondEmpireSithLegends);
		
		GouvPeriod lGalacticEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lGalacticEmpire.setHardBottom(true);
		lGalacticEmpire.init(StarWarsContentDataBase.sEmpireGalactiqueLegends);
		
		GouvPeriod lDarkEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lDarkEmpire.setHardBottom(true);
		lDarkEmpire.init(StarWarsContentDataBase.sEmpiredesTenebresLegends);
		
		GouvPeriod lOldSithEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lOldSithEmpire.setHardBottom(true);
		lOldSithEmpire.init(StarWarsContentDataBase.sAncienEmpireSithLegends);
		
		GouvPeriod lRevanEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lRevanEmpire.setHardBottom(true);
		lRevanEmpire.init(StarWarsContentDataBase.sEmpiredeRevanLegends);
		
		GouvPeriod lNewSithEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lNewSithEmpire.setHardBottom(true);
		lNewSithEmpire.init(StarWarsContentDataBase.sNouvelEmpireSithLegends);
		
		GouvPeriod lDarkBrotherhood = StarWarsApp.ginjector.getGouvPeriod();
		lDarkBrotherhood.setHardBottom(true);
		lDarkBrotherhood.init(StarWarsContentDataBase.sConfreriedesTenebresLegends);
		
		GouvPeriod lDarkKraytSithEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lDarkKraytSithEmpire.setHardBottom(true);
		lDarkKraytSithEmpire.init(StarWarsContentDataBase.sEmpiredeKraytLegends);

		GouvPeriod lEternalEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lEternalEmpire.setApproxBeginDate("?");
		lEternalEmpire.setApproxEndDate("?");
		lEternalEmpire.setHardBottom(true);
		lEternalEmpire.init(StarWarsContentDataBase.sEmpireEternelLegends);

		/* Sectes */
		
		GouvPeriod lLumiyaSith = StarWarsApp.ginjector.getGouvPeriod();
		lLumiyaSith.setHardBottom(true);
		lLumiyaSith.setMajorGouv(false);
		lLumiyaSith.init(StarWarsContentDataBase.sSithdeLumiyaLegends);
		
		GouvPeriod lTrueSith = StarWarsApp.ginjector.getGouvPeriod();
		lTrueSith.setHardBottom(true);
		lTrueSith.setMajorGouv(false);
		lTrueSith.init(StarWarsContentDataBase.sVraisSithLegends);
		
		GouvPeriod lNaddist = StarWarsApp.ginjector.getGouvPeriod();
		lNaddist.setMajorGouv(false);
		lNaddist.setHardBottom(true);
		lNaddist.init(StarWarsContentDataBase.sNaddismeLegends);
		
		GouvPeriod lKrath = StarWarsApp.ginjector.getGouvPeriod();
		lKrath.setMajorGouv(false);
		lKrath.setHardBottom(true);
		lKrath.init(StarWarsContentDataBase.sKrathLegends);
		
		GouvPeriod lSithTriumvirat = StarWarsApp.ginjector.getGouvPeriod();
		lSithTriumvirat.setMajorGouv(false);
		lSithTriumvirat.setHardBottom(true);
		lSithTriumvirat.init(StarWarsContentDataBase.sTriumviratSithLegends);
		
		GouvPeriod lSithBrotherhood = StarWarsApp.ginjector.getGouvPeriod();
		lSithBrotherhood.setMajorGouv(false);
		lSithBrotherhood.setHardBottom(true);
		lSithBrotherhood.init(StarWarsContentDataBase.sConfrerieSithLegends);
		
		GouvPeriod lRagnosDisciple = StarWarsApp.ginjector.getGouvPeriod();
		lRagnosDisciple.setMajorGouv(false);
		lRagnosDisciple.setHardBottom(true);
		lRagnosDisciple.init(StarWarsContentDataBase.sDisciplesdeRagnosLegends);
		
		GouvPeriod lLostTribe = StarWarsApp.ginjector.getGouvPeriod();
		lLostTribe.setHardBottom(true);
		lLostTribe.setMajorGouv(false);
		lLostTribe.setApproxEndDate("?");
		lLostTribe.init(StarWarsContentDataBase.sTribuperduedesSithLegends);
		
		GouvPeriod lRevanOrdre = StarWarsApp.ginjector.getGouvPeriod();
		lRevanOrdre.setApproxBeginDate("?");
		lRevanOrdre.setMajorGouv(false);
		lRevanOrdre.setHardBottom(true);
		lRevanOrdre.init(StarWarsContentDataBase.sOrdredeRevanLegends);
		
		/* Ordres */
		
		ReligionPeriod lSithCode = StarWarsApp.ginjector.getReligionPeriod();
		lSithCode.setHardTop(true);
		lSithCode.init(StarWarsContentDataBase.sCodeSithCommon);
		
		ReligionPeriod lOneSith = StarWarsApp.ginjector.getReligionPeriod();
		lOneSith.setHardTop(true);
		lOneSith.init(StarWarsContentDataBase.sSithUniqueLegends);
		
		ReligionPeriod lRuleOfTwo = StarWarsApp.ginjector.getReligionPeriod();
		lRuleOfTwo.setHardTop(true);
		lRuleOfTwo.init(StarWarsContentDataBase.sRegledesDeuxLegends);
		
		/* Seigneurs Noirs des Sith */
		
		EraPeriod lDarkKrayt = StarWarsApp.ginjector.getEraPeriod();
		lDarkKrayt.setHardTop(true);
		lDarkKrayt.init(StarWarsContentDataBase.sDarkKraytLegends, 30, 138);
		
		EraPeriod lLumiya = StarWarsApp.ginjector.getEraPeriod();
		lLumiya.setHardTop(true);
		lLumiya.init(StarWarsContentDataBase.sLumiyaLegends, 4, 41);

		EraPeriod lAjunta = StarWarsApp.ginjector.getEraPeriod();
		lAjunta.setHardTop(true);
		lAjunta.setApproxEndDate("?");
		lAjunta.init(StarWarsContentDataBase.sAjuntaPallLegends, -6900, -6800);
		
		EraPeriod lSimus = StarWarsApp.ginjector.getEraPeriod();
		lSimus.setHardTop(true);
		lSimus.setApproxBeginDate("?");
		lSimus.init(StarWarsContentDataBase.sSimusLegends, -5200, -5100);
		
		EraPeriod lRagnos = StarWarsApp.ginjector.getEraPeriod();
		lRagnos.setHardTop(true);
		lRagnos.init(StarWarsContentDataBase.sMarkaRagnosLegends, -5100, -5000);
		
		EraPeriod lSadow = StarWarsApp.ginjector.getEraPeriod();
		lSadow.setHardTop(true);
		lSadow.init(StarWarsContentDataBase.sNagaSadowLegends, -5000, -4400);
		
		EraPeriod lVitiate = StarWarsApp.ginjector.getEraPeriod();
		lVitiate.setHardTop(true);
		lVitiate.setApproxEndDate("?");
		lVitiate.init(StarWarsContentDataBase.sVitiateLegends, -4980, -3630);
		
		EraPeriod lNadd = StarWarsApp.ginjector.getEraPeriod();
		lNadd.setHardTop(true);
		lNadd.setApproxEndDate("?");
		lNadd.init(StarWarsContentDataBase.sFreedonNaddLegends, -4400, -4100);
		
		EraPeriod lExarKun = StarWarsApp.ginjector.getEraPeriod();
		lExarKun.setHardTop(true);
		lExarKun.init(StarWarsContentDataBase.sExarKunLegends, -3997, -3996);
		
		EraPeriod lRevan = StarWarsApp.ginjector.getEraPeriod();
		lRevan.setHardTop(true);
		lRevan.init(StarWarsContentDataBase.sDarkRevanLegends, -3961, -3960);
		
		EraPeriod lMalak = StarWarsApp.ginjector.getEraPeriod();
		lMalak.setHardTop(true);
		lMalak.init(StarWarsContentDataBase.sDarkMalakLegends, -3960, -3957);
		
		EraPeriod lRuin = StarWarsApp.ginjector.getEraPeriod();
		lRuin.setHardTop(true);
		lRuin.setApproxEndDate("?");
		lRuin.init(StarWarsContentDataBase.sDarkRuinLegends, -2000, -1900);
		
		EraPeriod lUnderlord = StarWarsApp.ginjector.getEraPeriod();
		lUnderlord.setHardTop(true);
		lUnderlord.setApproxBeginDate("?");
		lUnderlord.init(StarWarsContentDataBase.sDarkUnderlordLegends, -1900, -1750);
		
		EraPeriod lRivan = StarWarsApp.ginjector.getEraPeriod();
		lRivan.setHardTop(true);
		lRivan.init(StarWarsContentDataBase.sDarkRivanLegends, -1466, -1250);
		
		EraPeriod lBeliaDarzu = StarWarsApp.ginjector.getEraPeriod();
		lBeliaDarzu.setHardTop(true);
		lBeliaDarzu.init(StarWarsContentDataBase.sBeliaDarzuLegends, -1250, -1230);
		
		EraPeriod lKaan = StarWarsApp.ginjector.getEraPeriod();
		lKaan.setHardTop(true);
		lKaan.init(StarWarsContentDataBase.sSkereKaanLegends, -1010, -1000);
		
		EraPeriod lBane = StarWarsApp.ginjector.getEraPeriod();
		lBane.setHardTop(true);
		lBane.init(StarWarsContentDataBase.sDarkBaneLegends, -1000, -980);
		
		EraPeriod lZannah = StarWarsApp.ginjector.getEraPeriod();
		lZannah.setHardTop(true);
		lZannah.setApproxEndDate("?");
		lZannah.init(StarWarsContentDataBase.sDarkZannahLegends, -980, -800);
		
		EraPeriod lCognus = StarWarsApp.ginjector.getEraPeriod();
		lCognus.setHardTop(true);
		lCognus.setApproxBeginDate("?");
		lCognus.setApproxEndDate("?");
		lCognus.init(StarWarsContentDataBase.sDarkCognusLegends, -800, -700);
		
		EraPeriod lGravid = StarWarsApp.ginjector.getEraPeriod();
		lGravid.setHardTop(true);
		lGravid.setApproxBeginDate("?");
		lGravid.init(StarWarsContentDataBase.sDarkGravidLegends, -700, -552);
		
		EraPeriod lGean = StarWarsApp.ginjector.getEraPeriod();
		lGean.setHardTop(true);
		lGean.setApproxEndDate("?");
		lGean.init(StarWarsContentDataBase.sDarkGeanLegends, -552, -430);
		
		EraPeriod lRamage = StarWarsApp.ginjector.getEraPeriod();
		lRamage.setHardTop(true);
		lRamage.setApproxBeginDate("?");
		lRamage.setApproxEndDate("?");
		lRamage.init(StarWarsContentDataBase.sDarkRamageLegends, -430, -167);
		
		EraPeriod lTenebrous = StarWarsApp.ginjector.getEraPeriod();
		lTenebrous.setHardTop(true);
		lTenebrous.init(StarWarsContentDataBase.sDarkTenebrousLegends, -167, -67);
		
		EraPeriod lPlagueis = StarWarsApp.ginjector.getEraPeriod();
		lPlagueis.setHardTop(true);
		lPlagueis.init(StarWarsContentDataBase.sDarkPlagueisLegends, -67, -32);
		
		EraPeriod lPalpatine1 = StarWarsApp.ginjector.getEraPeriod();
		lPalpatine1.setHardTop(true);
		lPalpatine1.init(StarWarsContentDataBase.sDarkSidiousLegends, -32, 4);
		
		EraPeriod lPalpatine2 = StarWarsApp.ginjector.getEraPeriod();
		lPalpatine2.setHardTop(true);
		lPalpatine2.init(StarWarsContentDataBase.sDarkSidiousLegends, 10, 11);
		
		ChronologyModule lChronology = StarWarsApp.ginjector.getChronology();
		
		lChronology.addPeriod(lOldSithEmpire);
		lChronology.addPeriod(lOldSithEmpireReBuild);
		lChronology.addPeriod(lGalacticEmpire);
		lChronology.addPeriod(lDarkEmpire);
		lChronology.addPeriod(lDarkKraytSithEmpire);
		lChronology.addPeriod(lRevanEmpire);
		lChronology.addPeriod(lDarkBrotherhood);
		lChronology.addPeriod(lNewSithEmpire);
		lChronology.addPeriod(lLumiyaSith);
		lChronology.addPeriod(lEternalEmpire);
		
		lChronology.addPeriod(lLostTribe);
		lChronology.addPeriod(lTrueSith);
		lChronology.addPeriod(lNaddist);
		lChronology.addPeriod(lSithTriumvirat);
		lChronology.addPeriod(lKrath);
		lChronology.addPeriod(lSithBrotherhood);
		lChronology.addPeriod(lRagnosDisciple);
		lChronology.addPeriod(lRevanOrdre);
		
		lChronology.addPeriod(lOneSith);
		lChronology.addPeriod(lSithCode);
		lChronology.addPeriod(lRuleOfTwo);
		
		lChronology.addPeriod(lAjunta);
		lChronology.addPeriod(lSimus);
		lChronology.addPeriod(lRagnos);
		lChronology.addPeriod(lVitiate);
		lChronology.addPeriod(lSadow);
		lChronology.addPeriod(lNadd);
		lChronology.addPeriod(lExarKun);
		lChronology.addPeriod(lRevan);
		lChronology.addPeriod(lMalak);
		
		lChronology.addPeriod(lRuin);
		lChronology.addPeriod(lUnderlord);
		lChronology.addPeriod(lRivan);
		lChronology.addPeriod(lBeliaDarzu);
		lChronology.addPeriod(lKaan);
		
		lChronology.addPeriod(lBane);
		lChronology.addPeriod(lZannah);
		lChronology.addPeriod(lCognus);
		lChronology.addPeriod(lGravid);
		lChronology.addPeriod(lGean);
		lChronology.addPeriod(lRamage);
		lChronology.addPeriod(lTenebrous);
		lChronology.addPeriod(lPlagueis);
		lChronology.addPeriod(lPalpatine1);
		lChronology.addPeriod(lLumiya);
		lChronology.addPeriod(lPalpatine2);
		lChronology.addPeriod(lDarkKrayt);
		
		lChronology.getDisplay().setBlueLegend("Organisation Sith");
		lChronology.getDisplay().setPurpleLegend("Secte Sith");
		lChronology.getDisplay().setGreenLegend("Idéologie Sith");
		lChronology.getDisplay().setYellowLegend("Seigneur Noir des Sith");
		
		lChronology.getDisplay().setTopChronology(290);
		
		ElementInfo lElementInfo = AppFactory.createBasicInfo(AppFactory.sChronologyIcon, "Successions Sith", 
				"Succession des dirigeants de l'Ordre Sith à travers les différentes idéologies et Empires Sith.");
		lElementInfo.setAComponent(lChronology);
		return lElementInfo;
	}
}
