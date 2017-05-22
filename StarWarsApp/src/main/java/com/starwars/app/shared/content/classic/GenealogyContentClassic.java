package com.starwars.app.shared.content.classic;

import com.starwars.app.client.StarWarsApp;
import com.starwars.app.client.genealogy.presenter.BasicGeneaNode;
import com.starwars.app.client.genealogy.presenter.GenealogyModule;
import com.starwars.app.client.genealogy.presenter.JediGeneaNode;
import com.starwars.app.shared.AppFactory;
import com.starwars.app.shared.ElementInfo;
import com.starwars.app.shared.ElementInfo.ElementColor;
import com.starwars.app.shared.content.StarWarsContentDataBase;

public class GenealogyContentClassic {

	public static ElementInfo getGeneralGenealogy() {
		BasicGeneaNode lBeruWhitesun = StarWarsApp.ginjector.getBasicGeneaNode();
		lBeruWhitesun.init(StarWarsContentDataBase.sBeruWhitesunCommon);
		lBeruWhitesun.setLevel(1);
		
		BasicGeneaNode lOwenLars = StarWarsApp.ginjector.getBasicGeneaNode();
		lOwenLars.init(StarWarsContentDataBase.sOwenLarsClassic);
		
		BasicGeneaNode lClieggLars = StarWarsApp.ginjector.getBasicGeneaNode();
		lClieggLars.init(StarWarsContentDataBase.sClieggLarsCommon);
		
		BasicGeneaNode lAikaLars = StarWarsApp.ginjector.getBasicGeneaNode();
		lAikaLars.init(StarWarsContentDataBase.sAikaLarsCommon);
		
		BasicGeneaNode lRuweeNaberrie = StarWarsApp.ginjector.getBasicGeneaNode();
		lRuweeNaberrie.init(StarWarsContentDataBase.sRuweeNaberrieCommon);
		
		BasicGeneaNode lJobalNaberrie = StarWarsApp.ginjector.getBasicGeneaNode();
		lJobalNaberrie.init(StarWarsContentDataBase.sJobalNaberrieCommon);
		
		BasicGeneaNode lPadmeNaberrie = StarWarsApp.ginjector.getBasicGeneaNode();
		lPadmeNaberrie.init(StarWarsContentDataBase.sPadmeNaberrieClassic);
		lPadmeNaberrie.setHardCodeLeftAcc(200);
	
		BasicGeneaNode lSolaNaberrie = StarWarsApp.ginjector.getBasicGeneaNode();
		lSolaNaberrie.init(StarWarsContentDataBase.sSolaNaberrieCommon);
		lSolaNaberrie.setHardCodeLeftAcc(-100);
		
		BasicGeneaNode lAnakinSkywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lAnakinSkywalker.init(StarWarsContentDataBase.sAnakinSkywalkerClassic);
		
		BasicGeneaNode lShmiSkywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lShmiSkywalker.init(StarWarsContentDataBase.sShmiSkywalkerCommon);
		
		BasicGeneaNode lLukeSkywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lLukeSkywalker.init(StarWarsContentDataBase.sLukeSkywalkerClassic);
		lLukeSkywalker.setInverseVisitedParent(true);

		BasicGeneaNode lSanaSolo = StarWarsApp.ginjector.getBasicGeneaNode();
		lSanaSolo.init(StarWarsContentDataBase.sSanaSoloClassic);

		BasicGeneaNode lHanSolo = StarWarsApp.ginjector.getBasicGeneaNode();
		lHanSolo.init(StarWarsContentDataBase.sHanSoloClassic);
		lHanSolo.setHardCodeLeftAcc(1300);
		lHanSolo.setSpouse(lSanaSolo);
		
		BasicGeneaNode lBenSolo = StarWarsApp.ginjector.getBasicGeneaNode();
		lBenSolo.init(StarWarsContentDataBase.sBenSoloClassic, "Ben Solo");
		
		BasicGeneaNode lLeiaSkywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lLeiaSkywalker.init(StarWarsContentDataBase.sLeiaOrganaClassic);
		lLeiaSkywalker.setHardCodeLeftAcc(1190);
			
		BasicGeneaNode lBailOrgana = StarWarsApp.ginjector.getBasicGeneaNode();
		lBailOrgana.init(StarWarsContentDataBase.sBailOrganaClassic);
		lBailOrgana.setLevel(1);
		
		BasicGeneaNode lBrehaAntilles = StarWarsApp.ginjector.getBasicGeneaNode();
		lBrehaAntilles.init(StarWarsContentDataBase.sBrehaAntillesCommon);
		
		BasicGeneaNode lRaymusAntilles = StarWarsApp.ginjector.getBasicGeneaNode();
		lRaymusAntilles.init(StarWarsContentDataBase.sRaymusAntillesCommon);
			
		BasicGeneaNode lBailAntilles = StarWarsApp.ginjector.getBasicGeneaNode();
		lBailAntilles.init(StarWarsContentDataBase.sBailAntillesCommon);
		
		BasicGeneaNode lBailAntillesWife = StarWarsApp.ginjector.getBasicGeneaNode();
		lBailAntillesWife.init(StarWarsContentDataBase.sFemmeInconnueCommon, ElementColor.mediumgreen2);
		
		lOwenLars.setFather(lClieggLars);
		lOwenLars.setMother(lAikaLars);
		
		lBrehaAntilles.setFather(lBailAntilles);
		lBrehaAntilles.setMother(lBailAntillesWife);
		
		lRaymusAntilles.setFather(lBailAntilles);
		lRaymusAntilles.setMother(lBailAntillesWife);
		
		lLukeSkywalker.setFather(lAnakinSkywalker);
		lLukeSkywalker.setMother(lPadmeNaberrie);
		lLukeSkywalker.setAdoptedFather(lOwenLars);
		lLukeSkywalker.setAdoptedMother(lBeruWhitesun);
		
		lLeiaSkywalker.setFather(lAnakinSkywalker);
		lLeiaSkywalker.setMother(lPadmeNaberrie);
		lLeiaSkywalker.setAdoptedFather(lBailOrgana);
		lLeiaSkywalker.setAdoptedMother(lBrehaAntilles);
		
		lSolaNaberrie.setFather(lRuweeNaberrie);
		lSolaNaberrie.setMother(lJobalNaberrie);
		
		lPadmeNaberrie.setFather(lRuweeNaberrie);
		lPadmeNaberrie.setMother(lJobalNaberrie);
	
		lAnakinSkywalker.setMother(lShmiSkywalker);
		
		lBenSolo.setMother(lLeiaSkywalker);
		lBenSolo.setFather(lHanSolo);
		
		GenealogyModule lGenealogy = StarWarsApp.ginjector.getGenealogy();
		lGenealogy.getNodes().add(lBeruWhitesun);
		lGenealogy.getNodes().add(lOwenLars);
		lGenealogy.getNodes().add(lSolaNaberrie);
		lGenealogy.getNodes().add(lLukeSkywalker);
		lGenealogy.getNodes().add(lBenSolo);
		lGenealogy.getNodes().add(lBailOrgana);
		lGenealogy.getNodes().add(lBrehaAntilles);
		lGenealogy.getNodes().add(lRaymusAntilles);

		lGenealogy.getDisplay().setLeftNodesAndBounds(30);
		
		ElementInfo lElementInfo = AppFactory.createBasicInfo(AppFactory.sGenealogyIcon, "Généalogie étendue", "Si l'on doit prendre en compte les parentés connues des principaux "
				+ "protagonistes, une généalogie se forme.");
		lElementInfo.setAComponent(lGenealogy);
		return lElementInfo;
	}
	
	public static ElementInfo getSkywalkerHouse() {
		BasicGeneaNode lAnakinSkywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lAnakinSkywalker.init(StarWarsContentDataBase.sAnakinSkywalkerClassic);
		
		BasicGeneaNode lShmiSkywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lShmiSkywalker.init(StarWarsContentDataBase.sShmiSkywalkerCommon);
		lShmiSkywalker.setLevel(1);
		
		BasicGeneaNode lLukeSkywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lLukeSkywalker.init(StarWarsContentDataBase.sLukeSkywalkerClassic);
		lLukeSkywalker.setInverseVisitedParent(true);
		lLukeSkywalker.setLevel(3);
		
		BasicGeneaNode lHanSolo = StarWarsApp.ginjector.getBasicGeneaNode();
		lHanSolo.init(StarWarsContentDataBase.sHanSoloClassic);

		BasicGeneaNode lLeiaSkywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lLeiaSkywalker.init(StarWarsContentDataBase.sLeiaOrganaClassic);
		lLeiaSkywalker.setLevel(3);
		lLeiaSkywalker.setSpouse(lHanSolo);
	
		BasicGeneaNode lPadmeNaberrie = StarWarsApp.ginjector.getBasicGeneaNode();
		lPadmeNaberrie.init(StarWarsContentDataBase.sPadmeNaberrieClassic);
		lPadmeNaberrie.setLevel(2);
		
		lLeiaSkywalker.setFather(lAnakinSkywalker);
		lLeiaSkywalker.setMother(lPadmeNaberrie);
		
		lLukeSkywalker.setFather(lAnakinSkywalker);
		lLukeSkywalker.setMother(lPadmeNaberrie);
		
		lAnakinSkywalker.setMother(lShmiSkywalker);
		
		GenealogyModule lGenealogy = StarWarsApp.ginjector.getGenealogy();
		lGenealogy.getNodes().add(lLeiaSkywalker);
		lGenealogy.getNodes().add(lLukeSkywalker);
		
		lGenealogy.getDisplay().setLeftNodesAndBounds(250);
		
		ElementInfo lElementInfo = AppFactory.createBasicInfo(AppFactory.sGenealogyIcon, "Famille Skywalker", "Famille d'humains très sensibles à la Force. Ils joueront un rôle"
				+ " majeur dans l'Histoire galactique, que ce soit pour le bien ou pour le mal.");
		lElementInfo.setAComponent(lGenealogy);
		return lElementInfo;
	}
	
	public static ElementInfo getJedi() {
		ElementColor lOldOrder = ElementColor.blue;
		ElementColor lDarkjedi = ElementColor.purple;
		
		JediGeneaNode lYoda = StarWarsApp.ginjector.getJediGeneaNode();
		lYoda.init(StarWarsContentDataBase.sYodaClassic, lOldOrder);
	
		JediGeneaNode lMaceWindu = StarWarsApp.ginjector.getJediGeneaNode();
		lMaceWindu.setHardCodeLeftAcc(-200);
		lMaceWindu.init(StarWarsContentDataBase.sMaceWinduClassic, lOldOrder);
		
		JediGeneaNode lDooku = StarWarsApp.ginjector.getJediGeneaNode();
		lDooku.init(StarWarsContentDataBase.sDookuClassic, lDarkjedi);
		
		JediGeneaNode lQuigon = StarWarsApp.ginjector.getJediGeneaNode();
		lQuigon.init(StarWarsContentDataBase.sQuiGonJinnClassic, lOldOrder);
		
		JediGeneaNode lObiWan = StarWarsApp.ginjector.getJediGeneaNode();
		lObiWan.init(StarWarsContentDataBase.sObiWanKenobiClassic, lOldOrder);
		
		JediGeneaNode lLuke = StarWarsApp.ginjector.getJediGeneaNode();
		lLuke.init(StarWarsContentDataBase.sLukeSkywalkerClassic, lOldOrder);
		
		JediGeneaNode lBenSolo = StarWarsApp.ginjector.getJediGeneaNode();
		lBenSolo.init(StarWarsContentDataBase.sBenSoloClassic, lDarkjedi);
		
		JediGeneaNode lDepa = StarWarsApp.ginjector.getJediGeneaNode();
		lDepa.setHardCodeLeftAcc(300);
		lDepa.init(StarWarsContentDataBase.sDepaBillabaClassic, lOldOrder);
		
		JediGeneaNode lAnakin = StarWarsApp.ginjector.getJediGeneaNode();
		lAnakin.init(StarWarsContentDataBase.sAnakinSkywalkerClassic, lDarkjedi);
		
		JediGeneaNode lKanan = StarWarsApp.ginjector.getJediGeneaNode();
		lKanan.setHardCodeLeftAcc(600);
		lKanan.init(StarWarsContentDataBase.sKananJarrusClassic, lOldOrder);
		
		JediGeneaNode lEzra = StarWarsApp.ginjector.getJediGeneaNode();
		lEzra.init(StarWarsContentDataBase.sEzraBridgerClassic, lOldOrder);
		
		JediGeneaNode lAhsoka = StarWarsApp.ginjector.getJediGeneaNode();
		lAhsoka.init(StarWarsContentDataBase.sAhsokaTanoClassic, lOldOrder);
		
		JediGeneaNode lBariss = StarWarsApp.ginjector.getJediGeneaNode();
		lBariss.init(StarWarsContentDataBase.sBarissOffeeClassic, lOldOrder);
		
		JediGeneaNode lLuminara = StarWarsApp.ginjector.getJediGeneaNode();
		lLuminara.init(StarWarsContentDataBase.sLuminaraUnduliClassic, lOldOrder);
		
		GenealogyModule lGenealogy = StarWarsApp.ginjector.getGenealogy();
		
		lBenSolo.setFather(lLuke);
		
		lAhsoka.setFather(lAnakin);
		
		lLuke.setFather(lObiWan);
		lAnakin.setFather(lObiWan);
		
		lObiWan.setFather(lQuigon);
		
		lQuigon.setFather(lDooku);
		
		lDooku.setFather(lYoda);
		lMaceWindu.setFather(lYoda);
		
		lEzra.setFather(lKanan);
		lKanan.setFather(lDepa);
		lDepa.setFather(lMaceWindu);
		
		lBariss.setFather(lLuminara);
		
		lGenealogy.getNodes().add(lBenSolo);
		lGenealogy.getNodes().add(lAhsoka);
		lGenealogy.getNodes().add(lEzra);
		lGenealogy.getNodes().add(lBariss);
		
		lGenealogy.getDisplay().setBlueLegend("Ordre Jedi");
		lGenealogy.getDisplay().setPurpleLegend("Seigneur Sith / Jedi Noir");
		lGenealogy.getDisplay().setLeftNodesAndBounds(30);

		ElementInfo lElementInfo = AppFactory.createBasicInfo(AppFactory.sGenealogyIcon, "Ascendance des Jedi", "Le mot Jedi désigne les membres d'un ordre d'individus ayant le pouvoir de maîtriser "
				+ "la Force et qui s'en servent pour préserver l'ordre dans la galaxie. Cette sagesse est enseigner de Maître à Padawan, de génération en génération. Avec "
				+ "un peu de recherche, nous arrivons à reconstituer une généalogie évoluée.");
		lElementInfo.setAComponent(lGenealogy);
		return lElementInfo;
	}
	
	public static ElementInfo getSith() {
		JediGeneaNode lDarkPlagueis = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkPlagueis.init(StarWarsContentDataBase.sDarkPlagueisClassic);
		
		JediGeneaNode lDarkSidious = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkSidious.init(StarWarsContentDataBase.sDarkSidiousClassic);
		
		JediGeneaNode lDarkTyranus = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkTyranus.init(StarWarsContentDataBase.sDookuClassic, "Dark Tyranus");
		
		JediGeneaNode lDarkMaul = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkMaul.init(StarWarsContentDataBase.sDarkMaulClassic);
		
		JediGeneaNode lDarkVador = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkVador.init(StarWarsContentDataBase.sDarkVadorClassic);
		
		JediGeneaNode lAsajjVentress = StarWarsApp.ginjector.getJediGeneaNode();
		lAsajjVentress.init(StarWarsContentDataBase.sAsajjVentressClassic);
		
		JediGeneaNode lSavageOpress = StarWarsApp.ginjector.getJediGeneaNode();
		lSavageOpress.init(StarWarsContentDataBase.sSavageOpressClassic);
		
		JediGeneaNode lGrievous = StarWarsApp.ginjector.getJediGeneaNode();
		lGrievous.init(StarWarsContentDataBase.sGrievousClassic);
		
		lDarkSidious.setFather(lDarkPlagueis);
		
		lDarkTyranus.setFather(lDarkSidious);
		lDarkVador.setFather(lDarkSidious);
		lDarkMaul.setFather(lDarkSidious);
		
		lAsajjVentress.setFather(lDarkTyranus);
		lGrievous.setFather(lDarkTyranus);
		
		lSavageOpress.setFather(lDarkMaul);
		
		GenealogyModule lGenealogy = StarWarsApp.ginjector.getGenealogy();
		lGenealogy.getNodes().add(lGrievous);
		lGenealogy.getNodes().add(lAsajjVentress);
		lGenealogy.getNodes().add(lDarkVador);
		lGenealogy.getNodes().add(lSavageOpress);		
		
		lGenealogy.getDisplay().setRedLegend("Règle des Deux");
		lGenealogy.getDisplay().setMediumPurpleLegend("Acolyte");
		lGenealogy.getDisplay().setLeftNodesAndBounds(30);

		ElementInfo lElementInfo = AppFactory.createBasicInfo(AppFactory.sGenealogyIcon, "Ascendance des Sith", "Après que Dark Bane ait instigué la Règle des Deux 1000 ans "
				+ "avant la Bataille de Yavin, de nombreux Seigneurs Sith se sont succédés. Parmis eux, un aura réussi à faire renaître un Empire sous la doctrine Sith, Dark Sidious.");
		lElementInfo.setAComponent(lGenealogy);
		return lElementInfo;
	}

	public static ElementInfo getPoliticEvolution() {
		ElementColor lGouvSithImp = ElementColor.red;
		ElementColor lGouvImp = ElementColor.orange;
		ElementColor lGouvMili = ElementColor.green;
		ElementColor lGouvRep = ElementColor.mediumgreen2;
		
		JediGeneaNode lOldRepublic = StarWarsApp.ginjector.getJediGeneaNode();
		lOldRepublic.init(StarWarsContentDataBase.sRepubliqueGalactiqueClassic, lGouvRep);
		
		JediGeneaNode lGalacticEmpire = StarWarsApp.ginjector.getJediGeneaNode();
		lGalacticEmpire.setHardCodeLeftAcc(-175);
		lGalacticEmpire.init(StarWarsContentDataBase.sEmpireGalactiqueClassic, lGouvSithImp);
		
		JediGeneaNode lFirstOrder = StarWarsApp.ginjector.getJediGeneaNode();
		lFirstOrder.init(StarWarsContentDataBase.sPremierOrdreClassic, lGouvImp);
		
		JediGeneaNode lRebel = StarWarsApp.ginjector.getJediGeneaNode();
		lRebel.setHardCodeLeftAcc(-475);
		lRebel.init(StarWarsContentDataBase.sAllianceRebelleClassic, lGouvMili);
		
		JediGeneaNode lResistance = StarWarsApp.ginjector.getJediGeneaNode();
		lResistance.init(StarWarsContentDataBase.sResistanceClassic, lGouvMili);
		
		JediGeneaNode lNewRep = StarWarsApp.ginjector.getJediGeneaNode();
		lNewRep.init(StarWarsContentDataBase.sNouvelleRepubliqueClassic, lGouvRep);
		
		GenealogyModule lGenealogy = StarWarsApp.ginjector.getGenealogy();
		
		lGalacticEmpire.setFather(lOldRepublic);
		lRebel.setFather(lOldRepublic);

		lResistance.setFather(lRebel);
		lNewRep.setFather(lRebel);
		lFirstOrder.setFather(lGalacticEmpire);

		lGenealogy.getNodes().add(lFirstOrder);
		lGenealogy.getNodes().add(lResistance);
		lGenealogy.getNodes().add(lNewRep);
		
		lGenealogy.getDisplay().setLeftNodesAndBounds(30);
		lGenealogy.getDisplay().setRedLegend("Structure sitho-impériale");
		lGenealogy.getDisplay().setOrangeLegend("Structure impériale");
		lGenealogy.getDisplay().setGreenLegend("Structure militaire");
		lGenealogy.getDisplay().setMediumGreen2Legend("Structure républicaine");
		
		ElementInfo lElementInfo = AppFactory.createBasicInfo(AppFactory.sGenealogyIcon, "Évolution politique", "Par-delà les différences idéologiques"
				+ " qui séparent Jedi et Seigneurs Sith, des organisations s'érigent, se battent et s'effrondrent aux gré des guerres et des manipulations"
				+ " politiques de certains de leurs dirigeants.");
		lElementInfo.setAComponent(lGenealogy);
		
		return lElementInfo;
	}
}
