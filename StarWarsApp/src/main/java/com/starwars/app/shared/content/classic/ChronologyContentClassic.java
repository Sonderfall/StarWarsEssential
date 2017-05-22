package com.starwars.app.shared.content.classic;

import com.starwars.app.client.StarWarsApp;
import com.starwars.app.client.chronology.presenter.ChronologyModule;
import com.starwars.app.client.chronology.presenter.GouvPeriod;
import com.starwars.app.client.chronology.presenter.ReligionPeriod;
import com.starwars.app.client.chronology.presenter.WarPeriod;
import com.starwars.app.shared.AppFactory;
import com.starwars.app.shared.ElementInfo;
import com.starwars.app.shared.content.StarWarsContentDataBase;


public class ChronologyContentClassic {

	public static final int UNKNOWN_DATE = Integer.MAX_VALUE;
	
	public static ElementInfo getCompleteChronology() {	
		GouvPeriod lOldRepublic = StarWarsApp.ginjector.getGouvPeriod();
		lOldRepublic.init(StarWarsContentDataBase.sRepubliqueGalactiqueClassic);
		
		GouvPeriod lGalacticEmpire = StarWarsApp.ginjector.getGouvPeriod();
		lGalacticEmpire.setApproxEndDate("?");
		lGalacticEmpire.init(StarWarsContentDataBase.sEmpireGalactiqueClassic);
		
		GouvPeriod lCSI = StarWarsApp.ginjector.getGouvPeriod();
		lCSI.init(StarWarsContentDataBase.sCSIClassic);
		lCSI.setMajorGouv(false);
		
		WarPeriod lFirstCivilWar = StarWarsApp.ginjector.getWarPeriod();
		lFirstCivilWar.init(StarWarsContentDataBase.s1rGuerreCivileGalactiqueClassic, "Guerre civile Galactique");

		ReligionPeriod lJediOrder = StarWarsApp.ginjector.getReligionPeriod();
		lJediOrder.init(StarWarsContentDataBase.sOrdreJediClassic);
		
		ReligionPeriod lRenKnight = StarWarsApp.ginjector.getReligionPeriod();
		lRenKnight.setApproxBeginDate("?");
		lRenKnight.setHardBottom(true);
		lRenKnight.init(StarWarsContentDataBase.sChevaliersdeRenClassic, 9, UNKNOWN_DATE);
		
		GouvPeriod lRebelAlliance = StarWarsApp.ginjector.getGouvPeriod();
		lRebelAlliance.setMajorGouv(false);
		lRebelAlliance.init(StarWarsContentDataBase.sAllianceRebelleClassic);
		
		GouvPeriod lFirstOrder = StarWarsApp.ginjector.getGouvPeriod();
		lFirstOrder.setApproxBeginDate("?");
		lFirstOrder.setMajorGouv(false);
		lFirstOrder.init(StarWarsContentDataBase.sPremierOrdreClassic);
		
		GouvPeriod lResistance = StarWarsApp.ginjector.getGouvPeriod();
		lResistance.setApproxBeginDate("?");
		lResistance.setMajorGouv(false);
		lResistance.init(StarWarsContentDataBase.sResistanceClassic);
		
		GouvPeriod lNewRep = StarWarsApp.ginjector.getGouvPeriod();
		lNewRep.init(StarWarsContentDataBase.sNouvelleRepubliqueClassic);
		
		ReligionPeriod lNewJediOrder = StarWarsApp.ginjector.getReligionPeriod();
		lNewJediOrder.setApproxBeginDate("?");
		lNewJediOrder.setApproxEndDate("?");
		lNewJediOrder.init(StarWarsContentDataBase.sNouvelOrdreJediClassic, 6, 9);
		
		WarPeriod lCloneWar = StarWarsApp.ginjector.getWarPeriod();
		lCloneWar.init(StarWarsContentDataBase.sGuerredesClonesClassic);
				
		ReligionPeriod lRuleOfTwo = StarWarsApp.ginjector.getReligionPeriod();
		lRuleOfTwo.init(StarWarsContentDataBase.sRegledesDeuxClassic);
				
		ChronologyModule lChronology = StarWarsApp.ginjector.getChronology();

		lChronology.addPeriod(lCSI);
		lChronology.addPeriod(lOldRepublic);
		lChronology.addPeriod(lGalacticEmpire);
		lChronology.addPeriod(lFirstOrder);
		lChronology.addPeriod(lResistance);
		lChronology.addPeriod(lRebelAlliance);
		lChronology.addPeriod(lNewRep);
		
		lChronology.addPeriod(lFirstCivilWar);
		lChronology.addPeriod(lCloneWar);
		
		lChronology.addPeriod(lJediOrder);
		lChronology.addPeriod(lRuleOfTwo);
		lChronology.addPeriod(lRenKnight);
		lChronology.addPeriod(lNewJediOrder);
	
		lChronology.addBigFigure(-32, "I");
		lChronology.addBigFigure(-22, "II");
		lChronology.addBigFigure(-19, "III");
		
		lChronology.addBigFigure(0, "IV");
		lChronology.addBigFigure(3, "V");
		lChronology.addBigFigure(4, "VI");
		
		lChronology.addBigFigure(36, "VII");
		
		lChronology.getDisplay().setBlueLegend("Faction dominante");
		lChronology.getDisplay().setPurpleLegend("Faction notable");
		lChronology.getDisplay().setOrangeLegend("Conflict majeur");
		lChronology.getDisplay().setGreenLegend("Structure Jedi ou Sith");
		
		lChronology.getDisplay().setTopChronology(290);
		
		ElementInfo lElementInfo = AppFactory.createBasicInfo(AppFactory.sChronologyIcon, "Chronologie générale", 
				"Cette chronologie met en avant les différentes factions, guerres et périodes qui constituent l'ensemble de l'univers de Star Wars.");
		lElementInfo.setAComponent(lChronology);
		return lElementInfo;
	}
	
	public static ElementInfo getCloneWars() {
		return AppFactory.createBasicInfo(AppFactory.sChronologyIcon, "Guerre des Clones", "Description de la guerre des clones.");
	}
}
