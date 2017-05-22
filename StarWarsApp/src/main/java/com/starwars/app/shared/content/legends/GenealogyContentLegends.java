package com.starwars.app.shared.content.legends;

import com.starwars.app.client.StarWarsApp;
import com.starwars.app.client.genealogy.presenter.BasicGeneaNode;
import com.starwars.app.client.genealogy.presenter.GenealogyModule;
import com.starwars.app.client.genealogy.presenter.JediGeneaNode;
import com.starwars.app.client.genealogy.presenter.UnknownGeneration;
import com.starwars.app.shared.AppFactory;
import com.starwars.app.shared.ElementInfo;
import com.starwars.app.shared.ElementInfo.ElementColor;
import com.starwars.app.shared.content.StarWarsContentDataBase;

public class GenealogyContentLegends {

	public static ElementInfo getGeneralGenealogy() {
		BasicGeneaNode lFatherWhitesun = StarWarsApp.ginjector.getBasicGeneaNode();
		lFatherWhitesun.init(StarWarsContentDataBase.sHommeInconnuCommon, ElementColor.darkyellow);
		lFatherWhitesun.setLevel(1);
		
		BasicGeneaNode lMotherWhitesun = StarWarsApp.ginjector.getBasicGeneaNode();
		lMotherWhitesun.init(StarWarsContentDataBase.sFemmeInconnueCommon, ElementColor.darkyellow);
		lMotherWhitesun.setLevel(1);
		
		BasicGeneaNode lHaroWhitesun = StarWarsApp.ginjector.getBasicGeneaNode();
		lHaroWhitesun.init(StarWarsContentDataBase.sHaroWhitesunLegends);
		lHaroWhitesun.setHardCodeLeftAcc(-100);
		
		BasicGeneaNode lDamaWhitesun = StarWarsApp.ginjector.getBasicGeneaNode();
		lDamaWhitesun.init(StarWarsContentDataBase.sDamaWhitesunLegends);
		lDamaWhitesun.setHardCodeLeftAcc(-100);
		
		BasicGeneaNode lBeruWhitesun = StarWarsApp.ginjector.getBasicGeneaNode();
		lBeruWhitesun.init(StarWarsContentDataBase.sBeruWhitesunCommon);
		
		BasicGeneaNode lOwenLars = StarWarsApp.ginjector.getBasicGeneaNode();
		lOwenLars.init(StarWarsContentDataBase.sOwenLarsLegends);
		lOwenLars.setHardCodeLeftAcc(-100);
		
		BasicGeneaNode lClieggLars = StarWarsApp.ginjector.getBasicGeneaNode();
		lClieggLars.init(StarWarsContentDataBase.sClieggLarsCommon);
		
		BasicGeneaNode lAikaLars = StarWarsApp.ginjector.getBasicGeneaNode();
		lAikaLars.init(StarWarsContentDataBase.sAikaLarsCommon);
		
		BasicGeneaNode lEdernLars = StarWarsApp.ginjector.getBasicGeneaNode();
		lEdernLars.init(StarWarsContentDataBase.sEdernLarsLegends);
		
		BasicGeneaNode lLefLars = StarWarsApp.ginjector.getBasicGeneaNode();
		lLefLars.init(StarWarsContentDataBase.sLefLarsLegends);
		
		BasicGeneaNode lGreddaLars = StarWarsApp.ginjector.getBasicGeneaNode();
		lGreddaLars.init(StarWarsContentDataBase.sGreddaLarsLegends);
		
		BasicGeneaNode lMalinzaThanas= StarWarsApp.ginjector.getBasicGeneaNode();
		lMalinzaThanas.init(StarWarsContentDataBase.sMalinzaThanasLegends);
		
		BasicGeneaNode lPterThanas = StarWarsApp.ginjector.getBasicGeneaNode();
		lPterThanas.init(StarWarsContentDataBase.sPterThanasLegends);
		lPterThanas.setHardCodeLeftAcc(700);
		lPterThanas.setLevel(3);
		
		BasicGeneaNode lGaerielCaptison = StarWarsApp.ginjector.getBasicGeneaNode();
		lGaerielCaptison.init(StarWarsContentDataBase.sGaerielCaptisonLegends);
		lGaerielCaptison.setHardCodeLeftAcc(1200);
		lGaerielCaptison.setInverseVisitedParent(true);
		
		BasicGeneaNode lYlandaCaptison = StarWarsApp.ginjector.getBasicGeneaNode();
		lYlandaCaptison.init(StarWarsContentDataBase.sYlandaCaptisonLegends);
		
		BasicGeneaNode lDolCaptison = StarWarsApp.ginjector.getBasicGeneaNode();
		lDolCaptison.init(StarWarsContentDataBase.sDolCaptisonLegends);
		
		BasicGeneaNode lMargaCaptison = StarWarsApp.ginjector.getBasicGeneaNode();
		lMargaCaptison.init(StarWarsContentDataBase.sMargaCaptisonLegends);
		lMargaCaptison.setLevel(2);

		BasicGeneaNode lYeorgCaptison = StarWarsApp.ginjector.getBasicGeneaNode();
		lYeorgCaptison.init(StarWarsContentDataBase.sYeorgCaptisonLegends);
		
		BasicGeneaNode lFatherCaptison = StarWarsApp.ginjector.getBasicGeneaNode();
		lFatherCaptison.init(StarWarsContentDataBase.sHommeInconnuCommon, ElementColor.mediumgreen);
		lFatherCaptison.setLevel(1);
		
		BasicGeneaNode lMotherCaptison = StarWarsApp.ginjector.getBasicGeneaNode();
		lMotherCaptison.init(StarWarsContentDataBase.sFemmeInconnueCommon, ElementColor.mediumgreen);
		lMotherCaptison.setLevel(1);
		
		BasicGeneaNode lWinamanaberrie = StarWarsApp.ginjector.getBasicGeneaNode();
		lWinamanaberrie.init(StarWarsContentDataBase.sWinamaNaberrieLegends);
		
		BasicGeneaNode lWinamanaberrieHousband = StarWarsApp.ginjector.getBasicGeneaNode();
		lWinamanaberrieHousband.init(StarWarsContentDataBase.sHommeInconnuCommon, ElementColor.yellow);
		
		BasicGeneaNode lRyooThule = StarWarsApp.ginjector.getBasicGeneaNode();
		lRyooThule.init(StarWarsContentDataBase.sRyooThuleLegends);
		
		BasicGeneaNode lRyooThuleHousband = StarWarsApp.ginjector.getBasicGeneaNode();
		lRyooThuleHousband.init(StarWarsContentDataBase.sHommeInconnuCommon, ElementColor.yellow);
		
		BasicGeneaNode lRuweenaberrie = StarWarsApp.ginjector.getBasicGeneaNode();
		lRuweenaberrie.init(StarWarsContentDataBase.sRuweeNaberrieCommon);
		
		BasicGeneaNode lJobalnaberrie = StarWarsApp.ginjector.getBasicGeneaNode();
		lJobalnaberrie.init(StarWarsContentDataBase.sJobalNaberrieCommon);
		
		BasicGeneaNode lPadmenaberrie = StarWarsApp.ginjector.getBasicGeneaNode();
		lPadmenaberrie.init(StarWarsContentDataBase.sPadmeNaberrieLegends);
	
		BasicGeneaNode lSolanaberrie = StarWarsApp.ginjector.getBasicGeneaNode();
		lSolanaberrie.init(StarWarsContentDataBase.sSolaNaberrieCommon);
		
		BasicGeneaNode lDarredJanren = StarWarsApp.ginjector.getBasicGeneaNode();
		lDarredJanren.init(StarWarsContentDataBase.sDarredJanrenLegends);
		
		BasicGeneaNode lRyoonaberrie = StarWarsApp.ginjector.getBasicGeneaNode();
		lRyoonaberrie.init(StarWarsContentDataBase.sRyooNaberrieLegends);
		lRyoonaberrie.setHardCodeLeftAcc(-70);
		
		BasicGeneaNode lPoojanaberrie = StarWarsApp.ginjector.getBasicGeneaNode();
		lPoojanaberrie.init(StarWarsContentDataBase.sPoojaNaberrieLegends);
		lPoojanaberrie.setHardCodeLeftAcc(-70);
		
		BasicGeneaNode lAnakinskywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lAnakinskywalker.init(StarWarsContentDataBase.sAnakinSkywalkerLegends);
		
		BasicGeneaNode lShmiskywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lShmiskywalker.init(StarWarsContentDataBase.sShmiSkywalkerCommon);
		lShmiskywalker.setLevel(1);
		
		BasicGeneaNode lLukeskywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lLukeskywalker.init(StarWarsContentDataBase.sLukeSkywalkerLegends);
		lLukeskywalker.setInverseVisitedParent(true);
		lLukeskywalker.setHardCodeLeftAcc(2500);
		
		BasicGeneaNode lMaraJade = StarWarsApp.ginjector.getBasicGeneaNode();
		lMaraJade.init(StarWarsContentDataBase.sMaraJadeLegends);
		lMaraJade.setHardCodeLeftAcc(2400);

		BasicGeneaNode lVestaraKhai = StarWarsApp.ginjector.getBasicGeneaNode();
		lVestaraKhai.init(StarWarsContentDataBase.sVestaraKhaiLegends);
		
		BasicGeneaNode lBenskywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lBenskywalker.init(StarWarsContentDataBase.sBenSkywalkerLegends);
		lBenskywalker.setSpouse(lVestaraKhai);
		
		BasicGeneaNode lLeiaskywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lLeiaskywalker.init(StarWarsContentDataBase.sLeiaOrganaLegends);
		lLeiaskywalker.setHardCodeLeftAcc(2600);
		
		BasicGeneaNode lHanSolo = StarWarsApp.ginjector.getBasicGeneaNode();
		lHanSolo.init(StarWarsContentDataBase.sHanSoloLegends);
		lHanSolo.setHardCodeLeftAcc(2300);
		
		BasicGeneaNode lJainaElder = StarWarsApp.ginjector.getBasicGeneaNode();
		lJainaElder.init(StarWarsContentDataBase.sJainaElderLegends);
		lJainaElder.setLevel(2);
		lJainaElder.setHardCodeLeftAcc(-25);
		
		BasicGeneaNode lJonashSolo = StarWarsApp.ginjector.getBasicGeneaNode();
		lJonashSolo.init(StarWarsContentDataBase.sJonashSoloLegends);
		lJonashSolo.setLevel(2);
		
		BasicGeneaNode lDenSolo = StarWarsApp.ginjector.getBasicGeneaNode();
		lDenSolo.init(StarWarsContentDataBase.sDenSoloLegends);
		lDenSolo.setLevel(1);
		
		BasicGeneaNode lTiraGama = StarWarsApp.ginjector.getBasicGeneaNode();
		lTiraGama.init(StarWarsContentDataBase.sTiraGamaLegends);
		lTiraGama.setLevel(1);
		
		BasicGeneaNode lTiionSolo = StarWarsApp.ginjector.getBasicGeneaNode();
		lTiionSolo.init(StarWarsContentDataBase.sTiionSoloLegends);
		lTiionSolo.setLevel(2);
		
		BasicGeneaNode lRandilSal= StarWarsApp.ginjector.getBasicGeneaNode();
		lRandilSal.init(StarWarsContentDataBase.sRandilSalLegends);
		lRandilSal.setLevel(2);
		
		BasicGeneaNode lTrackanSalSolo= StarWarsApp.ginjector.getBasicGeneaNode();
		lTrackanSalSolo.init(StarWarsContentDataBase.sThrackanSalSoloLegends);
		
		BasicGeneaNode lJainaSolo = StarWarsApp.ginjector.getBasicGeneaNode();
		lJainaSolo.init(StarWarsContentDataBase.sJainaSoloLegends);
		lJainaSolo.setInverseVisitedParent(true);
		lJainaSolo.setHardCodeLeftAcc(5500);
		
		BasicGeneaNode lAnakinSolo = StarWarsApp.ginjector.getBasicGeneaNode();
		lAnakinSolo.init(StarWarsContentDataBase.sAnakinSoloLegends);
		lAnakinSolo.setInverseVisitedParent(true);
		lAnakinSolo.setHardCodeLeftAcc(100);
		
		BasicGeneaNode lJacenSolo = StarWarsApp.ginjector.getBasicGeneaNode();
		lJacenSolo.init(StarWarsContentDataBase.sJacenSoloLegends);
		lJacenSolo.setInverseVisitedParent(true);
		lJacenSolo.setHardCodeLeftAcc(4750);
		
		BasicGeneaNode lAllanaSolo = StarWarsApp.ginjector.getBasicGeneaNode();
		lAllanaSolo.init(StarWarsContentDataBase.sAllanaSoloLegends);
		lAllanaSolo.setInverseVisitedParent(true);
		
		BasicGeneaNode lAniaSolo = StarWarsApp.ginjector.getBasicGeneaNode();
		lAniaSolo.init(StarWarsContentDataBase.sAniaSoloLegends);
		lAniaSolo.setHardCodeLeftAcc(5475);
		lAniaSolo.setLevel(7);
		
		BasicGeneaNode lNialOrgana = StarWarsApp.ginjector.getBasicGeneaNode();
		lNialOrgana.init(StarWarsContentDataBase.sNialOrganaLegends);

		BasicGeneaNode lTiaOrgana = StarWarsApp.ginjector.getBasicGeneaNode();
		lTiaOrgana.init(StarWarsContentDataBase.sTiaOrganaLegends);
		
		BasicGeneaNode lTiaOrganaHousband = StarWarsApp.ginjector.getBasicGeneaNode();
		lTiaOrganaHousband.init(StarWarsContentDataBase.sHalagadVentorLegends);
		lTiaOrganaHousband.setLevel(2);
		
		BasicGeneaNode lRougeOrgana = StarWarsApp.ginjector.getBasicGeneaNode();
		lRougeOrgana.init(StarWarsContentDataBase.sRougeOrganaLegends);
		
		BasicGeneaNode lCellyOrgana = StarWarsApp.ginjector.getBasicGeneaNode();
		lCellyOrgana.init(StarWarsContentDataBase.sCellyOrganaLegends);
		
		BasicGeneaNode lBailOrgana = StarWarsApp.ginjector.getBasicGeneaNode();
		lBailOrgana.init(StarWarsContentDataBase.sBailOrganaLegends);
		
		BasicGeneaNode lMaziciaOrgana = StarWarsApp.ginjector.getBasicGeneaNode();
		lMaziciaOrgana.init(StarWarsContentDataBase.sMaziciaOrganaLegends);
		lMaziciaOrgana.setLevel(1);
		
		BasicGeneaNode lMaziciaOrganaHousband = StarWarsApp.ginjector.getBasicGeneaNode();
		lMaziciaOrganaHousband.init(StarWarsContentDataBase.sHommeInconnuCommon, ElementColor.mediumpurple);
		lMaziciaOrganaHousband.setLevel(1);
		
		BasicGeneaNode lBrehaAntilles = StarWarsApp.ginjector.getBasicGeneaNode();
		lBrehaAntilles.init(StarWarsContentDataBase.sBrehaAntillesCommon);
		
		BasicGeneaNode lRaymusAntilles = StarWarsApp.ginjector.getBasicGeneaNode();
		lRaymusAntilles.init(StarWarsContentDataBase.sRaymusAntillesCommon);
		
		BasicGeneaNode lDearaAntilles = StarWarsApp.ginjector.getBasicGeneaNode();
		lDearaAntilles.init(StarWarsContentDataBase.sDearaAntillesLegends);
		
		BasicGeneaNode lCorlaMetonaeMother = StarWarsApp.ginjector.getBasicGeneaNode();
		lCorlaMetonaeMother.init(StarWarsContentDataBase.sFemmeInconnueCommon, ElementColor.mediumgreen2);
		lCorlaMetonaeMother.setInverseVisitedParent(true);
		
		BasicGeneaNode lCorlaMetonaeFather = StarWarsApp.ginjector.getBasicGeneaNode();
		lCorlaMetonaeFather.init(StarWarsContentDataBase.sHommeInconnuCommon, ElementColor.mediumgreen2);
		lCorlaMetonaeFather.setLevel(2);
		
		BasicGeneaNode lCorlaMetonae = StarWarsApp.ginjector.getBasicGeneaNode();
		lCorlaMetonae.init(StarWarsContentDataBase.sCorlaMetonaeLegends);
		
		BasicGeneaNode lBailAntilles = StarWarsApp.ginjector.getBasicGeneaNode();
		lBailAntilles.init(StarWarsContentDataBase.sBailAntillesCommon);
		lBailAntilles.setLevel(1);
		
		BasicGeneaNode lBailAntillesWife = StarWarsApp.ginjector.getBasicGeneaNode();
		lBailAntillesWife.init(StarWarsContentDataBase.sFemmeInconnueCommon, ElementColor.mediumgreen2);
		lBailAntillesWife.setLevel(1);

		BasicGeneaNode lTychoCelchu = StarWarsApp.ginjector.getBasicGeneaNode();
		lTychoCelchu.init(StarWarsContentDataBase.sTychoCelchuLegends);
		
		BasicGeneaNode lWinterCelchu = StarWarsApp.ginjector.getBasicGeneaNode();
		lWinterCelchu.init(StarWarsContentDataBase.sWinterCelchuLegends);
		lWinterCelchu.setSpouse(lTychoCelchu);
		
		BasicGeneaNode lSheltayRetrac = StarWarsApp.ginjector.getBasicGeneaNode();
		lSheltayRetrac.init(StarWarsContentDataBase.sSheltayRetracLegends);
		lSheltayRetrac.setLevel(2);
		
		BasicGeneaNode lSheltayRetracHousband = StarWarsApp.ginjector.getBasicGeneaNode();
		lSheltayRetracHousband.init(StarWarsContentDataBase.sHommeInconnuCommon, ElementColor.red);
		lSheltayRetracHousband.setLevel(2);
		
		BasicGeneaNode lTenelKaDjo = StarWarsApp.ginjector.getBasicGeneaNode();
		lTenelKaDjo.init(StarWarsContentDataBase.sTenelKaDjoLegends);
		lTenelKaDjo.setHardCodeLeftAcc(5900);
		lTenelKaDjo.setInverseVisitedParent(true);
		
		BasicGeneaNode lTenenielDjo = StarWarsApp.ginjector.getBasicGeneaNode();
		lTenenielDjo.init(StarWarsContentDataBase.sTenenielDjoLegends);
		lTenenielDjo.setHardCodeLeftAcc(2700);
		lTenenielDjo.setLevel(3);
		
		BasicGeneaNode lAllayaDjoHousband = StarWarsApp.ginjector.getBasicGeneaNode();
		lAllayaDjoHousband.init(StarWarsContentDataBase.sHommeInconnuCommon, ElementColor.orange);
		lAllayaDjoHousband.setLevel(2);
		
		BasicGeneaNode lAllayaDjo = StarWarsApp.ginjector.getBasicGeneaNode();
		lAllayaDjo.init(StarWarsContentDataBase.sAllayaDjoLegends);
		
		BasicGeneaNode lBarrukaDjo = StarWarsApp.ginjector.getBasicGeneaNode();
		lBarrukaDjo.init(StarWarsContentDataBase.sBarrukaDjoLegends);
		
		BasicGeneaNode lGethzerionDjo = StarWarsApp.ginjector.getBasicGeneaNode();
		lGethzerionDjo.init(StarWarsContentDataBase.sGethzerionDjoLegends);
		lGethzerionDjo.setHardCodeLeftAcc(-25);
		
		BasicGeneaNode lKaraTeelDjo = StarWarsApp.ginjector.getBasicGeneaNode();
		lKaraTeelDjo.init(StarWarsContentDataBase.sKaraTeelDjoLegends);
		lKaraTeelDjo.setHardCodeLeftAcc(-55);
		
		BasicGeneaNode lAugwynneDjo = StarWarsApp.ginjector.getBasicGeneaNode();
		lAugwynneDjo.init(StarWarsContentDataBase.sAugwynneDjoLegends);
		lAugwynneDjo.setLevel(1);
		
		BasicGeneaNode lAugwynneDjoHousband = StarWarsApp.ginjector.getBasicGeneaNode();
		lAugwynneDjoHousband.init(StarWarsContentDataBase.sHommeInconnuCommon, ElementColor.orange);
		lAugwynneDjoHousband.setLevel(1);
		
		BasicGeneaNode lIsolder = StarWarsApp.ginjector.getBasicGeneaNode();
		lIsolder.init(StarWarsContentDataBase.sIsolderLegends);
		lIsolder.setHardCodeLeftAcc(8200);
		
		BasicGeneaNode lKalen = StarWarsApp.ginjector.getBasicGeneaNode();
		lKalen.init(StarWarsContentDataBase.sKalenLegends);
		lKalen.setHardCodeLeftAcc(-200);
		
		BasicGeneaNode lTaaChumeHousband = StarWarsApp.ginjector.getBasicGeneaNode();
		lTaaChumeHousband.init(StarWarsContentDataBase.sHommeInconnuCommon, ElementColor.darkblue);
		lTaaChumeHousband.setLevel(2);
		
		BasicGeneaNode lTaaChume = StarWarsApp.ginjector.getBasicGeneaNode();
		lTaaChume.init(StarWarsContentDataBase.sTaaChumeLegends);
		lTaaChume.setSpouse(lTaaChumeHousband);
		lTaaChume.setHardCodeLeftAcc(1300);
		lTaaChume.setLevel(2);

		BasicGeneaNode lConsort = StarWarsApp.ginjector.getBasicGeneaNode();
		lConsort.init(StarWarsContentDataBase.sHommeInconnuCommon, ElementColor.darkblue);
		lConsort.setHardCodeLeftAcc(750);
		lConsort.setLevel(2);
		
		BasicGeneaNode lNiKorish = StarWarsApp.ginjector.getBasicGeneaNode();
		lNiKorish.init(StarWarsContentDataBase.sNiKorishLegends);
		lNiKorish.setLevel(1);
		
		BasicGeneaNode lNiKorishHousband = StarWarsApp.ginjector.getBasicGeneaNode();
		lNiKorishHousband.init(StarWarsContentDataBase.sHommeInconnuCommon, ElementColor.darkblue);
		lNiKorishHousband.setLevel(1);
		
		BasicGeneaNode lTristaZel = StarWarsApp.ginjector.getBasicGeneaNode();
		lTristaZel.init(StarWarsContentDataBase.sTristaZelLegends);
		lTristaZel.setHardCodeLeftAcc(9880);
		lTristaZel.setLevel(4);
		
		BasicGeneaNode lTarynZel = StarWarsApp.ginjector.getBasicGeneaNode();
		lTarynZel.init(StarWarsContentDataBase.sTarynZelLegends);
		lTarynZel.setHardCodeLeftAcc(9880);
		lTarynZel.setLevel(4);
		
		BasicGeneaNode lChelik = StarWarsApp.ginjector.getBasicGeneaNode();
		lChelik.init(StarWarsContentDataBase.sChelikLegends);
		
		BasicGeneaNode lAlyssia = StarWarsApp.ginjector.getBasicGeneaNode();
		lAlyssia.init(StarWarsContentDataBase.sAlyssiaLegends);
		
		BasicGeneaNode lAlyssiaChelikFather = StarWarsApp.ginjector.getBasicGeneaNode();
		lAlyssiaChelikFather.init(StarWarsContentDataBase.sHommeInconnuCommon, ElementColor.darkblue);
		lAlyssiaChelikFather.setHardCodeLeftAcc(130);
		lAlyssiaChelikFather.setLevel(2);
		
		BasicGeneaNode lAlyssiaChelikMother = StarWarsApp.ginjector.getBasicGeneaNode();
		lAlyssiaChelikMother.init(StarWarsContentDataBase.sFemmeInconnueCommon, ElementColor.darkblue);
		lAlyssiaChelikMother.setLevel(2);
		
		BasicGeneaNode lDracoAntares = StarWarsApp.ginjector.getBasicGeneaNode();
		lDracoAntares.init(StarWarsContentDataBase.sAntaresDracoLegends);
		
		BasicGeneaNode lMarasiahFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lMarasiahFel.init(StarWarsContentDataBase.sMarasiahFelLegends);
		lMarasiahFel.setSpouse(lDracoAntares);
		
		BasicGeneaNode lRoanFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lRoanFel.init(StarWarsContentDataBase.sRoanFelLegends);
		lRoanFel.setHardCodeLeftAcc(6100);
		
		BasicGeneaNode lElliahChalk = StarWarsApp.ginjector.getBasicGeneaNode();
		lElliahChalk.init(StarWarsContentDataBase.sElliahChalkLegends);
		lElliahChalk.setHardCodeLeftAcc(6700);
		
		BasicGeneaNode lHogrumChalk = StarWarsApp.ginjector.getBasicGeneaNode();
		lHogrumChalk.init(StarWarsContentDataBase.sHogrumChalkLegends);
		
		BasicGeneaNode lFatherChalk = StarWarsApp.ginjector.getBasicGeneaNode();
		lFatherChalk.init(StarWarsContentDataBase.sHommeInconnuCommon, ElementColor.mediumorange);
		lFatherChalk.setLevel(5);
		
		BasicGeneaNode lMotherChalk = StarWarsApp.ginjector.getBasicGeneaNode();
		lMotherChalk.init(StarWarsContentDataBase.sFemmeInconnueCommon, ElementColor.mediumorange);
		lMotherChalk.setLevel(5);

		BasicGeneaNode lFelTwo = StarWarsApp.ginjector.getBasicGeneaNode();
		lFelTwo.init(StarWarsContentDataBase.sFelIILegends);
		lFelTwo.setIsAlignSon(true);
		lFelTwo.setInverseVisitedParent(true);
		
		BasicGeneaNode lFelTwoWife = StarWarsApp.ginjector.getBasicGeneaNode();
		lFelTwoWife.init(StarWarsContentDataBase.sFemmeInconnueCommon, ElementColor.purple);
		
		BasicGeneaNode lMohrganFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lMohrganFel.init(StarWarsContentDataBase.sMohrganFelLegends);
		lMohrganFel.setHardCodeLeftAcc(2700);
		lMohrganFel.setInverseVisitedParent(true);
		
		BasicGeneaNode lMohrganFelFather = StarWarsApp.ginjector.getBasicGeneaNode();
		lMohrganFelFather.init(StarWarsContentDataBase.sHommeInconnuCommon, ElementColor.purple);
		lMohrganFelFather.setIsAlignSon(true);
		lMohrganFelFather.setInverseVisitedParent(true);
		
		BasicGeneaNode lMohrganFelMother = StarWarsApp.ginjector.getBasicGeneaNode();
		lMohrganFelMother.init(StarWarsContentDataBase.sFemmeInconnueCommon, ElementColor.purple);
		lMohrganFelMother.setHardCodeLeftAcc(-2200);
		
		BasicGeneaNode lJaggedFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lJaggedFel.init(StarWarsContentDataBase.sJaggedFelLegends);
		lJaggedFel.setLevel(4);
		lJaggedFel.setHardCodeLeftAcc(6000);
		
		BasicGeneaNode lDavinFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lDavinFel.init(StarWarsContentDataBase.sDavinFelLegends);
		lDavinFel.setIsAlignSon(true);
		lDavinFel.setLevel(4);
		
		BasicGeneaNode lCemFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lCemFel.init(StarWarsContentDataBase.sCemFelLegends);
		lCemFel.setLevel(4);
		lCemFel.setIsAlignSon(true);
		
		BasicGeneaNode lChakFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lChakFel.init(StarWarsContentDataBase.sChakFelLegends);
		lChakFel.setIsAlignSon(true);
		lChakFel.setLevel(4);
		
		BasicGeneaNode lCherithFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lCherithFel.init(StarWarsContentDataBase.sCherithFelLegends);
		lCherithFel.setIsAlignSon(true);
		lCherithFel.setLevel(4);
		
		BasicGeneaNode lWynssaFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lWynssaFel.init(StarWarsContentDataBase.sWynssaFelLegends);
		lWynssaFel.setIsAlignSon(true);
		lWynssaFel.setLevel(4);

		BasicGeneaNode lSoontirFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lSoontirFel.init(StarWarsContentDataBase.sSoontirFelLegends);
		lSoontirFel.setLevel(3);
		lSoontirFel.setIsAlignSon(true);
		
		BasicGeneaNode lSoontirTodrFelFather = StarWarsApp.ginjector.getBasicGeneaNode();
		lSoontirTodrFelFather.init(StarWarsContentDataBase.sFyricFelDadLegends, "Fyric Fel");
		lSoontirTodrFelFather.setLevel(2);
		
		BasicGeneaNode lSoontirTodrFelMother = StarWarsApp.ginjector.getBasicGeneaNode();
		lSoontirTodrFelMother.init(StarWarsContentDataBase.sFemmeInconnueCommon, ElementColor.purple);
		lSoontirTodrFelMother.setLevel(2);
		
		BasicGeneaNode lTodrFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lTodrFel.init(StarWarsContentDataBase.sTodrFelLegends);
		lTodrFel.setIsAlignSon(true);
		
		BasicGeneaNode lAjaiFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lAjaiFel.init(StarWarsContentDataBase.sAjaiFelLegends);
		lAjaiFel.setHardCodeLeftAcc(1200);
		lAjaiFel.setLevel(3);
		
		BasicGeneaNode lFyricFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lFyricFel.init(StarWarsContentDataBase.sFyricFelLegends);
		lFyricFel.setHardCodeLeftAcc(3152);
		
		BasicGeneaNode lSyalAntilles = StarWarsApp.ginjector.getBasicGeneaNode();
		lSyalAntilles.init(StarWarsContentDataBase.sSyalAntillesFelLegends, "Syal Antilles");
		lSyalAntilles.setLevel(3);
		
		BasicGeneaNode lWedgeAntilles = StarWarsApp.ginjector.getBasicGeneaNode();
		lWedgeAntilles.init(StarWarsContentDataBase.sWedgeAntillesLegends);
		lWedgeAntilles.setIsAlignSon(true);
		lWedgeAntilles.setHardCodeLeftAcc(300);

		BasicGeneaNode lDiricWessiri = StarWarsApp.ginjector.getBasicGeneaNode();
		lDiricWessiri.init(StarWarsContentDataBase.sDiricWessiriLegends);
		lDiricWessiri.setLevel(3);
		
		BasicGeneaNode lIellaWessiri = StarWarsApp.ginjector.getBasicGeneaNode();
		lIellaWessiri.init(StarWarsContentDataBase.sIellaWessiriLegends);
		lIellaWessiri.setSpouse(lDiricWessiri);
		lIellaWessiri.setHardCodeLeftAcc(300);
		lIellaWessiri.setLevel(3);
		
		BasicGeneaNode lJaggedAntilles = StarWarsApp.ginjector.getBasicGeneaNode();
		lJaggedAntilles.init(StarWarsContentDataBase.sJaggedAntillesLegends);
		lJaggedAntilles.setLevel(2);
		
		BasicGeneaNode lZenaAntilles = StarWarsApp.ginjector.getBasicGeneaNode();
		lZenaAntilles.init(StarWarsContentDataBase.sZenaAntillesLegends);
		lZenaAntilles.setLevel(2);
		
		BasicGeneaNode lMyriAntilles = StarWarsApp.ginjector.getBasicGeneaNode();
		lMyriAntilles.init(StarWarsContentDataBase.sMyriAntillesLegends);
		lMyriAntilles.setHardCodeLeftAcc(3759);
		
		BasicGeneaNode lSyalAntillesDaughter = StarWarsApp.ginjector.getBasicGeneaNode();
		lSyalAntillesDaughter.init(StarWarsContentDataBase.sSyalAntillesLegends);
		
		BasicGeneaNode lAhnahRawk = StarWarsApp.ginjector.getBasicGeneaNode();
		lAhnahRawk.init(StarWarsContentDataBase.sAhnahRawkLegends);
		lAhnahRawk.setInverseVisitedParent(true);
		
		BasicGeneaNode lSkeetoRawk = StarWarsApp.ginjector.getBasicGeneaNode();
		lSkeetoRawk.init(StarWarsContentDataBase.sSkeetoRawkLegends);
		lSkeetoRawk.setHardCodeLeftAcc(2600);
		lSkeetoRawk.setLevel(7);
		
		BasicGeneaNode lMicahRawk = StarWarsApp.ginjector.getBasicGeneaNode();
		lMicahRawk.init(StarWarsContentDataBase.sMicahRawkLegends);
		lMicahRawk.setHardCodeLeftAcc(2600);
		lMicahRawk.setLevel(7);
		
		BasicGeneaNode lDrooRawk = StarWarsApp.ginjector.getBasicGeneaNode();
		lDrooRawk.init(StarWarsContentDataBase.sDrooRawkLegends);
		lDrooRawk.setHardCodeLeftAcc(2400);
		lDrooRawk.setLevel(6);
		
		BasicGeneaNode lDrooRawkHousband = StarWarsApp.ginjector.getBasicGeneaNode();
		lDrooRawkHousband.init(StarWarsContentDataBase.sHommeInconnuCommon, ElementColor.pink);
		lDrooRawkHousband.setHardCodeLeftAcc(2400);
		lDrooRawkHousband.setLevel(6);
		
		BasicGeneaNode lNatskywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lNatskywalker.init(StarWarsContentDataBase.sNatSkywalkerLegends);
		lNatskywalker.setHardCodeLeftAcc(2400);
		lNatskywalker.setLevel(6);
		
		BasicGeneaNode lKolskywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lKolskywalker.init(StarWarsContentDataBase.sKolSkywalkerLegends);
		lKolskywalker.setHardCodeLeftAcc(2275);
		lKolskywalker.setLevel(6);
		
		BasicGeneaNode lCadeskywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lCadeskywalker.init(StarWarsContentDataBase.sCadeSkywalkerLegends);
		lCadeskywalker.setIsAlignSon(true);
		
		BasicGeneaNode lMorriganCorde = StarWarsApp.ginjector.getBasicGeneaNode();
		lMorriganCorde.init(StarWarsContentDataBase.sNynaCalixteLegends);
		lMorriganCorde.setHardCodeLeftAcc(1800);
		lMorriganCorde.setLevel(6);
		
		BasicGeneaNode lRulfYage = StarWarsApp.ginjector.getBasicGeneaNode();
		lRulfYage.init(StarWarsContentDataBase.sRulfYageLegends);
		lRulfYage.setHardCodeLeftAcc(1900);
		lRulfYage.setLevel(6);
		
		BasicGeneaNode lGunnerYage = StarWarsApp.ginjector.getBasicGeneaNode();
		lGunnerYage.init(StarWarsContentDataBase.sGunnerYageLegends);
		
		lGunnerYage.setFather(lRulfYage);
		lGunnerYage.setMother(lMorriganCorde);
		
		lCadeskywalker.setFather(lKolskywalker);
		lCadeskywalker.setMother(lMorriganCorde);
		
		lMicahRawk.setAdoptedFather(lNatskywalker);
		lMicahRawk.setAdoptedMother(lDrooRawk);
		
		lSkeetoRawk.setAdoptedFather(lNatskywalker);
		lSkeetoRawk.setAdoptedMother(lDrooRawk);
		
		lAhnahRawk.setFather(lDrooRawkHousband);
		lAhnahRawk.setMother(lDrooRawk);
		
		lHaroWhitesun.setFather(lFatherWhitesun);
		lHaroWhitesun.setMother(lMotherWhitesun);
		
		lDamaWhitesun.setFather(lFatherWhitesun);
		lDamaWhitesun.setMother(lMotherWhitesun);
		
		lBeruWhitesun.setFather(lFatherWhitesun);
		lBeruWhitesun.setMother(lMotherWhitesun);
		
		lOwenLars.setFather(lClieggLars);
		lOwenLars.setMother(lAikaLars);
		
		lEdernLars.setFather(lLefLars);
		lEdernLars.setMother(lGreddaLars);
		
		lClieggLars.setFather(lLefLars);
		lClieggLars.setMother(lGreddaLars);
		
		lMalinzaThanas.setFather(lPterThanas);
		lMalinzaThanas.setMother(lGaerielCaptison);
		lMalinzaThanas.setAdoptedFather(lLukeskywalker);
		lMalinzaThanas.setAdoptedMother(lMaraJade);
		
		lGaerielCaptison.setFather(lDolCaptison);
		lGaerielCaptison.setMother(lMargaCaptison);
		
		lYlandaCaptison.setFather(lDolCaptison);
		lYlandaCaptison.setMother(lMargaCaptison);
		
		lDolCaptison.setFather(lFatherCaptison);
		lDolCaptison.setMother(lMotherCaptison);

		lYeorgCaptison.setFather(lFatherCaptison);
		lYeorgCaptison.setMother(lMotherCaptison);
		
		lNialOrgana.setFather(lTiaOrganaHousband);
		lNialOrgana.setMother(lTiaOrgana);
		
		lTiaOrgana.setFather(lMaziciaOrganaHousband);
		lTiaOrgana.setMother(lMaziciaOrgana);
		
		lRougeOrgana.setFather(lMaziciaOrganaHousband);
		lRougeOrgana.setMother(lMaziciaOrgana);
		
		lCellyOrgana.setFather(lMaziciaOrganaHousband);
		lCellyOrgana.setMother(lMaziciaOrgana);
		
		lBailOrgana.setFather(lMaziciaOrganaHousband);
		lBailOrgana.setMother(lMaziciaOrgana);

		lBrehaAntilles.setFather(lBailAntilles);
		lBrehaAntilles.setMother(lBailAntillesWife);
		
		lRaymusAntilles.setFather(lBailAntilles);
		lRaymusAntilles.setMother(lBailAntillesWife);
		
		lDearaAntilles.setFather(lBailAntilles);
		lDearaAntilles.setMother(lBailAntillesWife);
		
		lCorlaMetonaeMother.setFather(lBailAntilles);
		lCorlaMetonaeMother.setMother(lBailAntillesWife);
		
		lCorlaMetonae.setFather(lCorlaMetonaeFather);
		lCorlaMetonae.setMother(lCorlaMetonaeMother);
		
		lWinterCelchu.setFather(lSheltayRetracHousband);
		lWinterCelchu.setMother(lSheltayRetrac);
		lWinterCelchu.setAdoptedFather(lBailOrgana);
		lWinterCelchu.setAdoptedMother(lBrehaAntilles);
		
		lMyriAntilles.setFather(lWedgeAntilles);
		lMyriAntilles.setMother(lIellaWessiri);
		
		lSyalAntillesDaughter.setFather(lWedgeAntilles);
		lSyalAntillesDaughter.setMother(lIellaWessiri);
		
		lSyalAntilles.setFather(lJaggedAntilles);
		lSyalAntilles.setMother(lZenaAntilles);

		lWedgeAntilles.setFather(lJaggedAntilles);
		lWedgeAntilles.setMother(lZenaAntilles);
		
		lJaggedFel.setFather(lSoontirFel);
		lJaggedFel.setMother(lSyalAntilles);
		
		lDavinFel.setFather(lSoontirFel);
		lDavinFel.setMother(lSyalAntilles);
		
		lCemFel.setFather(lSoontirFel);
		lCemFel.setMother(lSyalAntilles);
		
		lChakFel.setFather(lSoontirFel);
		lChakFel.setMother(lSyalAntilles);
		
		lCherithFel.setFather(lSoontirFel);
		lCherithFel.setMother(lSyalAntilles);
		
		lWynssaFel.setFather(lSoontirFel);
		lWynssaFel.setMother(lSyalAntilles);
		
		lTodrFel.setFather(lSoontirTodrFelFather);
		lTodrFel.setMother(lSoontirTodrFelMother);
		
		lSoontirFel.setFather(lSoontirTodrFelFather);
		lSoontirFel.setMother(lSoontirTodrFelMother);
		
		lFyricFel.setFather(lTodrFel);
		lFyricFel.setMother(lAjaiFel);
		
		lMarasiahFel.setFather(lRoanFel);
		lMarasiahFel.setMother(lElliahChalk);
		
		lElliahChalk.setFather(lFatherChalk);
		lElliahChalk.setMother(lMotherChalk);
		
		lHogrumChalk.setFather(lFatherChalk);
		lHogrumChalk.setMother(lMotherChalk);
		
		lRoanFel.setFather(lFelTwo);
		lRoanFel.setMother(lFelTwoWife);
		
		lMohrganFel.setFather(lMohrganFelFather);
		lMohrganFel.setMother(lMohrganFelMother);
		
		lMohrganFelFather.setFather(lJaggedFel);
		lMohrganFelFather.setMother(lJainaSolo);
		
		lFelTwo.setFather(lJaggedFel);
		lFelTwo.setMother(lJainaSolo);
		
		lAllanaSolo.setFather(lJacenSolo);
		lAllanaSolo.setMother(lTenelKaDjo);
		
		lTenelKaDjo.setFather(lIsolder);
		lTenelKaDjo.setMother(lTenenielDjo);		
		
		lTenenielDjo.setFather(lAllayaDjoHousband);
		lTenenielDjo.setMother(lAllayaDjo);
		
		lAllayaDjo.setFather(lAugwynneDjoHousband);
		lAllayaDjo.setMother(lAugwynneDjo);
		
		lBarrukaDjo.setFather(lAugwynneDjoHousband);
		lBarrukaDjo.setMother(lAugwynneDjo);
		
		lGethzerionDjo.setFather(lAugwynneDjoHousband);
		lGethzerionDjo.setMother(lAugwynneDjo);

		lKaraTeelDjo.setFather(lAugwynneDjoHousband);
		lKaraTeelDjo.setMother(lAugwynneDjo);

		lIsolder.setFather(lConsort);
		lIsolder.setMother(lTaaChume);
		
		lKalen.setFather(lConsort);
		lKalen.setMother(lTaaChume);
		
		lTaaChume.setFather(lNiKorishHousband);
		lTaaChume.setMother(lNiKorish);
		
		lAlyssiaChelikFather.setFather(lNiKorishHousband);
		lAlyssiaChelikFather.setMother(lNiKorish);
		
		lChelik.setFather(lAlyssiaChelikFather);
		lChelik.setMother(lAlyssiaChelikMother);
		
		lAlyssia.setFather(lAlyssiaChelikFather);
		lAlyssia.setMother(lAlyssiaChelikMother);
		
		lAnakinSolo.setFather(lHanSolo);
		lAnakinSolo.setMother(lLeiaskywalker);

		lJacenSolo.setFather(lHanSolo);
		lJacenSolo.setMother(lLeiaskywalker);

		lJainaSolo.setFather(lHanSolo);
		lJainaSolo.setMother(lLeiaskywalker);
		
		lHanSolo.setFather(lJainaElder);
		lHanSolo.setMother(lJonashSolo);
	
		lJonashSolo.setFather(lDenSolo);
		lJonashSolo.setMother(lTiraGama);
		
		lTiionSolo.setFather(lDenSolo);
		lTiionSolo.setMother(lTiraGama);
		
		lTrackanSalSolo.setFather(lTiionSolo);
		lTrackanSalSolo.setMother(lRandilSal);
		
		lLukeskywalker.setFather(lAnakinskywalker);
		lLukeskywalker.setMother(lPadmenaberrie);
		lLukeskywalker.setAdoptedFather(lOwenLars);
		lLukeskywalker.setAdoptedMother(lBeruWhitesun);
		
		lLeiaskywalker.setFather(lAnakinskywalker);
		lLeiaskywalker.setMother(lPadmenaberrie);
		lLeiaskywalker.setAdoptedFather(lBailOrgana);
		lLeiaskywalker.setAdoptedMother(lBrehaAntilles);
		
		lBenskywalker.setFather(lLukeskywalker);
		lBenskywalker.setMother(lMaraJade);
		
		lRyoonaberrie.setFather(lDarredJanren);
		lRyoonaberrie.setMother(lSolanaberrie);
		
		lPoojanaberrie.setFather(lDarredJanren);
		lPoojanaberrie.setMother(lSolanaberrie);
		
		lSolanaberrie.setFather(lRuweenaberrie);
		lSolanaberrie.setMother(lJobalnaberrie);
		
		lPadmenaberrie.setFather(lRuweenaberrie);
		lPadmenaberrie.setMother(lJobalnaberrie);
	
		lAnakinskywalker.setMother(lShmiskywalker);
		
		lRuweenaberrie.setFather(lWinamanaberrieHousband);
		lRuweenaberrie.setMother(lWinamanaberrie);
		
		lJobalnaberrie.setFather(lRyooThuleHousband);
		lJobalnaberrie.setMother(lRyooThule);
		
		GenealogyModule lGenealogy = StarWarsApp.ginjector.getGenealogy();
		lGenealogy.getNodes().add(lGunnerYage);
		lGenealogy.getNodes().add(lCadeskywalker);
		lGenealogy.getNodes().add(lNatskywalker);
		lGenealogy.getNodes().add(lMicahRawk);
		lGenealogy.getNodes().add(lSkeetoRawk);
		lGenealogy.getNodes().add(lAhnahRawk);
		lGenealogy.getNodes().add(lHaroWhitesun);
		lGenealogy.getNodes().add(lDamaWhitesun);
		lGenealogy.getNodes().add(lBeruWhitesun);
		lGenealogy.getNodes().add(lEdernLars);
		lGenealogy.getNodes().add(lOwenLars);
		lGenealogy.getNodes().add(lMalinzaThanas);
		lGenealogy.getNodes().add(lYeorgCaptison);
		lGenealogy.getNodes().add(lYlandaCaptison);
		lGenealogy.getNodes().add(lRyoonaberrie);
		lGenealogy.getNodes().add(lPoojanaberrie);
		lGenealogy.getNodes().add(lBenskywalker);
		lGenealogy.getNodes().add(lAnakinSolo);
		lGenealogy.getNodes().add(lTrackanSalSolo);
		lGenealogy.getNodes().add(lNialOrgana);
		lGenealogy.getNodes().add(lRougeOrgana);
		lGenealogy.getNodes().add(lCellyOrgana);
		lGenealogy.getNodes().add(lBailOrgana);
		lGenealogy.getNodes().add(lBrehaAntilles);
		lGenealogy.getNodes().add(lRaymusAntilles);
		lGenealogy.getNodes().add(lDearaAntilles);
		lGenealogy.getNodes().add(lCorlaMetonae);
		lGenealogy.getNodes().add(lWinterCelchu);
		lGenealogy.getNodes().add(lAllanaSolo);
		lGenealogy.getNodes().add(lBarrukaDjo);
		lGenealogy.getNodes().add(lGethzerionDjo);
		lGenealogy.getNodes().add(lKaraTeelDjo);
		lGenealogy.getNodes().add(lKalen);
		lGenealogy.getNodes().add(lTristaZel);
		lGenealogy.getNodes().add(lTarynZel);
		lGenealogy.getNodes().add(lChelik);
		lGenealogy.getNodes().add(lAlyssia);
		lGenealogy.getNodes().add(lFyricFel);
		lGenealogy.getNodes().add(lMohrganFel);
		lGenealogy.getNodes().add(lMarasiahFel);
		lGenealogy.getNodes().add(lDavinFel);
		lGenealogy.getNodes().add(lChakFel);
		lGenealogy.getNodes().add(lCemFel);
		lGenealogy.getNodes().add(lCherithFel);
		lGenealogy.getNodes().add(lWynssaFel);
		lGenealogy.getNodes().add(lHogrumChalk);
		lGenealogy.getNodes().add(lMyriAntilles);
		lGenealogy.getNodes().add(lSyalAntillesDaughter);
		lGenealogy.getNodes().add(lAniaSolo);

		UnknownGeneration lSkywalkerUnknownGeneration = StarWarsApp.ginjector.getUnknownGeneration();
		lSkywalkerUnknownGeneration.getDisplay().setTwoPeople();
		
		UnknownGeneration lHapesUnknownGeneration = StarWarsApp.ginjector.getUnknownGeneration();
		lHapesUnknownGeneration.getDisplay().setTwoPeople();
		
		UnknownGeneration lSoloUnknownGeneration = StarWarsApp.ginjector.getUnknownGeneration();
		lSoloUnknownGeneration.getDisplay().setOnePeople();
		
		lGenealogy.getDisplay().addUnknownGeneration(lSkywalkerUnknownGeneration.getDisplay().asWidget(), 2497, 290);
		lGenealogy.getDisplay().addUnknownGeneration(lHapesUnknownGeneration.getDisplay().asWidget(), 9970, 140);
		lGenealogy.getDisplay().addUnknownGeneration(lSoloUnknownGeneration.getDisplay().asWidget(), 5427, 380);
		lGenealogy.getDisplay().setLeftNodesAndBounds(360);
		
		ElementInfo lElementInfo = AppFactory.createBasicInfo(AppFactory.sGenealogyIcon, "Généalogie étendue", "Les périodes bien renseignées à partir de "
				+ "50 av BY permettent de tracer un arbre généalogique précis qui relit de nombreux protagonistes entre eux. Qui aurait cru que Beru Whitesune "
				+ "la fermière soit de la même famille que le pilote rebelle Wedge Antilles ?");
		lElementInfo.setAComponent(lGenealogy);
		return lElementInfo;
	}
	
	public static ElementInfo getSoloHouse() {
		BasicGeneaNode lLeiaskywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lLeiaskywalker.init(StarWarsContentDataBase.sLeiaOrganaLegends);
		lLeiaskywalker.setLevel(3);
		
		BasicGeneaNode lHanSolo = StarWarsApp.ginjector.getBasicGeneaNode();
		lHanSolo.init(StarWarsContentDataBase.sHanSoloLegends);
		
		BasicGeneaNode lJainaElder = StarWarsApp.ginjector.getBasicGeneaNode();
		lJainaElder.init(StarWarsContentDataBase.sJainaElderLegends);
		lJainaElder.setLevel(2);
		
		BasicGeneaNode lJonashSolo = StarWarsApp.ginjector.getBasicGeneaNode();
		lJonashSolo.init(StarWarsContentDataBase.sJonashSoloLegends);
		lJonashSolo.setLevel(2);
		
		BasicGeneaNode lDenSolo = StarWarsApp.ginjector.getBasicGeneaNode();
		lDenSolo.init(StarWarsContentDataBase.sDenSoloLegends);
		lDenSolo.setLevel(1);
		
		BasicGeneaNode lTiraGama = StarWarsApp.ginjector.getBasicGeneaNode();
		lTiraGama.init(StarWarsContentDataBase.sTiraGamaLegends);
		lTiraGama.setLevel(1);
		
		BasicGeneaNode lTiionSolo = StarWarsApp.ginjector.getBasicGeneaNode();
		lTiionSolo.init(StarWarsContentDataBase.sTiionSoloLegends);
		lTiionSolo.setLevel(2);
		
		BasicGeneaNode lRandilSal= StarWarsApp.ginjector.getBasicGeneaNode();
		lRandilSal.init(StarWarsContentDataBase.sRandilSalLegends);
		lRandilSal.setLevel(2);
		
		BasicGeneaNode lTrackanSalSolo= StarWarsApp.ginjector.getBasicGeneaNode();
		lTrackanSalSolo.init(StarWarsContentDataBase.sThrackanSalSoloLegends);
		
		BasicGeneaNode lAnakinSolo = StarWarsApp.ginjector.getBasicGeneaNode();
		lAnakinSolo.init(StarWarsContentDataBase.sAnakinSoloLegends);
		lAnakinSolo.setInverseVisitedParent(true);
		
		BasicGeneaNode lJacenSolo = StarWarsApp.ginjector.getBasicGeneaNode();
		lJacenSolo.init(StarWarsContentDataBase.sJacenSoloLegends);
		lJacenSolo.setInverseVisitedParent(true);
		
		BasicGeneaNode lAllanaSolo = StarWarsApp.ginjector.getBasicGeneaNode();
		lAllanaSolo.init(StarWarsContentDataBase.sAllanaSoloLegends);
		
		BasicGeneaNode lTenelKaDjo = StarWarsApp.ginjector.getBasicGeneaNode();
		lTenelKaDjo.init(StarWarsContentDataBase.sTenelKaDjoLegends);
		lTenelKaDjo.setLevel(4);
		
		BasicGeneaNode lJaggedFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lJaggedFel.init(StarWarsContentDataBase.sJaggedFelLegends);
		lJaggedFel.setLevel(4);

		BasicGeneaNode lJainaSolo = StarWarsApp.ginjector.getBasicGeneaNode();
		lJainaSolo.init(StarWarsContentDataBase.sJainaSoloLegends);
		lJainaSolo.setInverseVisitedParent(true);
		lJainaSolo.setSpouse(lJaggedFel);
		lJainaSolo.setHardCodeLeftAcc(300);
		
		BasicGeneaNode lAniaSolo = StarWarsApp.ginjector.getBasicGeneaNode();
		lAniaSolo.init(StarWarsContentDataBase.sAniaSoloLegends);
		lAniaSolo.setLevel(7);
		lAniaSolo.setHardCodeLeftAcc(437);
		
		lAnakinSolo.setFather(lHanSolo);
		lAnakinSolo.setMother(lLeiaskywalker);

		lJacenSolo.setFather(lHanSolo);
		lJacenSolo.setMother(lLeiaskywalker);

		lJainaSolo.setFather(lHanSolo);
		lJainaSolo.setMother(lLeiaskywalker);
		
		lHanSolo.setFather(lJainaElder);
		lHanSolo.setMother(lJonashSolo);
	
		lJonashSolo.setFather(lDenSolo);
		lJonashSolo.setMother(lTiraGama);
		
		lTiionSolo.setFather(lDenSolo);
		lTiionSolo.setMother(lTiraGama);
		
		lTrackanSalSolo.setFather(lTiionSolo);
		lTrackanSalSolo.setMother(lRandilSal);
		
		lAllanaSolo.setFather(lJacenSolo);
		lAllanaSolo.setMother(lTenelKaDjo);
		
		GenealogyModule lGenealogy = StarWarsApp.ginjector.getGenealogy();
		
		lGenealogy.getNodes().add(lAnakinSolo);
		lGenealogy.getNodes().add(lTrackanSalSolo);
		lGenealogy.getNodes().add(lAllanaSolo);
		lGenealogy.getNodes().add(lJainaSolo);
		lGenealogy.getNodes().add(lAniaSolo);
		
		UnknownGeneration lSoloUnknownGeneration = StarWarsApp.ginjector.getUnknownGeneration();
		lSoloUnknownGeneration.getDisplay().setOnePeople();
		
		lGenealogy.getDisplay().addUnknownGeneration(lSoloUnknownGeneration.getDisplay().asWidget(), 389, 380);
		lGenealogy.getDisplay().setLeftNodesAndBounds(55);
		
		ElementInfo lElementInfo = AppFactory.createBasicInfo(AppFactory.sGenealogyIcon, "Maison Solo", "La Maison Solo est une famille Corellienne descendante du Prince Amiral"
				+ " Jonash e Solo durant les guerres d'Alsakan. Ils participèrent à de nombreux conflits et plusieurs se issèrent au rang de héros.");
		lElementInfo.setAComponent(lGenealogy);
		return lElementInfo;
	}
	
	public static ElementInfo getFelHouse() {
		BasicGeneaNode lDracoAntares = StarWarsApp.ginjector.getBasicGeneaNode();
		lDracoAntares.init(StarWarsContentDataBase.sAntaresDracoLegends);
		
		BasicGeneaNode lMarasiahFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lMarasiahFel.init(StarWarsContentDataBase.sMarasiahFelLegends);
		lMarasiahFel.setSpouse(lDracoAntares);
		
		BasicGeneaNode lRoanFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lRoanFel.init(StarWarsContentDataBase.sRoanFelLegends);
		lRoanFel.setLevel(6);
		
		BasicGeneaNode lElliahChalk = StarWarsApp.ginjector.getBasicGeneaNode();
		lElliahChalk.init(StarWarsContentDataBase.sElliahChalkLegends);
		lElliahChalk.setLevel(6);

		BasicGeneaNode lFelTwo = StarWarsApp.ginjector.getBasicGeneaNode();
		lFelTwo.init(StarWarsContentDataBase.sFelIILegends);
		lFelTwo.setIsAlignSon(true);
		lFelTwo.setInverseVisitedParent(true);
		
		BasicGeneaNode lFelTwoWife = StarWarsApp.ginjector.getBasicGeneaNode();
		lFelTwoWife.init(StarWarsContentDataBase.sFemmeInconnueCommon, ElementColor.purple);
		lFelTwoWife.setLevel(5);
		
		BasicGeneaNode lMohrganFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lMohrganFel.init(StarWarsContentDataBase.sMohrganFelLegends);
		lMohrganFel.setInverseVisitedParent(true);
		
		BasicGeneaNode lMohrganFelFather = StarWarsApp.ginjector.getBasicGeneaNode();
		lMohrganFelFather.init(StarWarsContentDataBase.sHommeInconnuCommon, ElementColor.purple);
		lMohrganFelFather.setLevel(5);
		lMohrganFelFather.setInverseVisitedParent(true);
		
		BasicGeneaNode lMohrganFelMother = StarWarsApp.ginjector.getBasicGeneaNode();
		lMohrganFelMother.init(StarWarsContentDataBase.sFemmeInconnueCommon, ElementColor.purple);
		lMohrganFelMother.setLevel(5);
		
		BasicGeneaNode lJaggedFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lJaggedFel.init(StarWarsContentDataBase.sJaggedFelLegends);
		lJaggedFel.setLevel(4);
		
		BasicGeneaNode lDavinFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lDavinFel.init(StarWarsContentDataBase.sDavinFelLegends);
		lDavinFel.setLevel(4);
		
		BasicGeneaNode lCemFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lCemFel.init(StarWarsContentDataBase.sCemFelLegends);
		lCemFel.setLevel(4);
		
		BasicGeneaNode lChakFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lChakFel.init(StarWarsContentDataBase.sChakFelLegends);
		lChakFel.setLevel(4);
		
		BasicGeneaNode lCherithFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lCherithFel.init(StarWarsContentDataBase.sCherithFelLegends);
		lCherithFel.setLevel(4);
		
		BasicGeneaNode lWynssaFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lWynssaFel.init(StarWarsContentDataBase.sWynssaFelLegends);
		lWynssaFel.setLevel(4);

		BasicGeneaNode lSoontirFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lSoontirFel.init(StarWarsContentDataBase.sSoontirFelLegends);
		lSoontirFel.setLevel(3);
		
		BasicGeneaNode lSoontirTodrFelFather = StarWarsApp.ginjector.getBasicGeneaNode();
		lSoontirTodrFelFather.init(StarWarsContentDataBase.sFyricFelDadLegends, "Fyric Fel");
		lSoontirTodrFelFather.setLevel(2);
		
		BasicGeneaNode lSoontirTodrFelMother= StarWarsApp.ginjector.getBasicGeneaNode();
		lSoontirTodrFelMother.init(StarWarsContentDataBase.sFemmeInconnueCommon, ElementColor.purple);
		lSoontirTodrFelMother.setLevel(2);
		
		BasicGeneaNode lTodrFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lTodrFel.init(StarWarsContentDataBase.sTodrFelLegends);
		lTodrFel.setIsAlignSon(true);
		
		BasicGeneaNode lAjaiFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lAjaiFel.init(StarWarsContentDataBase.sAjaiFelLegends);
		lAjaiFel.setLevel(3);
		
		BasicGeneaNode lFyricFel = StarWarsApp.ginjector.getBasicGeneaNode();
		lFyricFel.init(StarWarsContentDataBase.sFyricFelLegends);
		
		BasicGeneaNode lSyalAntilles = StarWarsApp.ginjector.getBasicGeneaNode();
		lSyalAntilles.init(StarWarsContentDataBase.sSyalAntillesFelLegends, "Syal Antilles");
		lSyalAntilles.setLevel(3);

		BasicGeneaNode lJainaSolo = StarWarsApp.ginjector.getBasicGeneaNode();
		lJainaSolo.init(StarWarsContentDataBase.sJainaSoloLegends);
		lJainaSolo.setInverseVisitedParent(true);
		lJainaSolo.setLevel(4);

		lFyricFel.setFather(lTodrFel);
		lFyricFel.setMother(lAjaiFel);
		
		lJaggedFel.setFather(lSoontirFel);
		lJaggedFel.setMother(lSyalAntilles);
		
		lDavinFel.setFather(lSoontirFel);
		lDavinFel.setMother(lSyalAntilles);
		
		lCemFel.setFather(lSoontirFel);
		lCemFel.setMother(lSyalAntilles);
		
		lChakFel.setFather(lSoontirFel);
		lChakFel.setMother(lSyalAntilles);
		
		lCherithFel.setFather(lSoontirFel);
		lCherithFel.setMother(lSyalAntilles);
		
		lWynssaFel.setFather(lSoontirFel);
		lWynssaFel.setMother(lSyalAntilles);
		
		lTodrFel.setFather(lSoontirTodrFelFather);
		lTodrFel.setMother(lSoontirTodrFelMother);
		
		lSoontirFel.setFather(lSoontirTodrFelFather);
		lSoontirFel.setMother(lSoontirTodrFelMother);
		
		lMarasiahFel.setFather(lRoanFel);
		lMarasiahFel.setMother(lElliahChalk);
		
		lRoanFel.setFather(lFelTwo);
		lRoanFel.setMother(lFelTwoWife);
		
		lMohrganFel.setFather(lMohrganFelFather);
		lMohrganFel.setMother(lMohrganFelMother);
		
		lMohrganFelFather.setFather(lJaggedFel);
		lMohrganFelFather.setMother(lJainaSolo);
		
		lFelTwo.setFather(lJaggedFel);
		lFelTwo.setMother(lJainaSolo);
		
		GenealogyModule lGenealogy = StarWarsApp.ginjector.getGenealogy();
		
		lGenealogy.getNodes().add(lFyricFel);
		lGenealogy.getNodes().add(lMohrganFel);
		lGenealogy.getNodes().add(lMarasiahFel);
		lGenealogy.getNodes().add(lDavinFel);
		lGenealogy.getNodes().add(lCemFel);
		lGenealogy.getNodes().add(lChakFel);
		lGenealogy.getNodes().add(lCherithFel);
		lGenealogy.getNodes().add(lWynssaFel);
		
//		lGenealogy.bind();
		lGenealogy.getDisplay().setLeftNodesAndBounds(190);
		
		ElementInfo lElementInfo = AppFactory.createBasicInfo(AppFactory.sGenealogyIcon, "Dynastie Fel", "Cette famille Impériale fut à la tête du Nouvel Empire Galactique"
				+ " jusqu'au coup d'état de Dark Krayt en 130 ap BY. Elle s'alliera à plusieurs reprises par des mariages afin de faciliter la paix entre la Nouvelle République puis "
				+ "l'Alliance Galactique.");
		lElementInfo.setAComponent(lGenealogy);
		return lElementInfo;
	}
	
	public static ElementInfo getSkywalkerHouse() {
		BasicGeneaNode lAnakinskywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lAnakinskywalker.init(StarWarsContentDataBase.sAnakinSkywalkerLegends);
		
		BasicGeneaNode lShmiskywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lShmiskywalker.init(StarWarsContentDataBase.sShmiSkywalkerCommon);
		lShmiskywalker.setLevel(1);
		
		BasicGeneaNode lLukeskywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lLukeskywalker.init(StarWarsContentDataBase.sLukeSkywalkerLegends);
		lLukeskywalker.setInverseVisitedParent(true);
		lLukeskywalker.setLevel(3);
		
		BasicGeneaNode lMaraJade = StarWarsApp.ginjector.getBasicGeneaNode();
		lMaraJade.init(StarWarsContentDataBase.sMaraJadeLegends);
		lMaraJade.setLevel(3);

		BasicGeneaNode lVestaraKhai = StarWarsApp.ginjector.getBasicGeneaNode();
		lVestaraKhai.init(StarWarsContentDataBase.sVestaraKhaiLegends);
		
		BasicGeneaNode lBenskywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lBenskywalker.init(StarWarsContentDataBase.sBenSkywalkerLegends);
		lBenskywalker.setSpouse(lVestaraKhai);
		
		BasicGeneaNode lHanSolo = StarWarsApp.ginjector.getBasicGeneaNode();
		lHanSolo.init(StarWarsContentDataBase.sHanSoloLegends);

		BasicGeneaNode lLeiaskywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lLeiaskywalker.init(StarWarsContentDataBase.sLeiaOrganaLegends);
		lLeiaskywalker.setLevel(3);
		lLeiaskywalker.setSpouse(lHanSolo);

		BasicGeneaNode lDrooRawk = StarWarsApp.ginjector.getBasicGeneaNode();
		lDrooRawk.init(StarWarsContentDataBase.sDrooRawkLegends);
		lDrooRawk.setLevel(6);
		
		BasicGeneaNode lNatskywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lNatskywalker.init(StarWarsContentDataBase.sNatSkywalkerLegends);
		lNatskywalker.setIsAlignSon(true);
		lNatskywalker.setHardCodeLeftAcc(180);
		lNatskywalker.setSpouse(lDrooRawk);
		lNatskywalker.setLevel(6);
		
		BasicGeneaNode lKolskywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lKolskywalker.init(StarWarsContentDataBase.sKolSkywalkerLegends);
		lKolskywalker.setHardCodeLeftAcc(650);
		lKolskywalker.setLevel(6);
		
		BasicGeneaNode lCadeskywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lCadeskywalker.init(StarWarsContentDataBase.sCadeSkywalkerLegends);
		
		BasicGeneaNode lMorriganCorde = StarWarsApp.ginjector.getBasicGeneaNode();
		lMorriganCorde.init(StarWarsContentDataBase.sNynaCalixteLegends);
		lMorriganCorde.setHardCodeLeftAcc(650);
		lMorriganCorde.setLevel(6);
		
		BasicGeneaNode lPadmenaberrie = StarWarsApp.ginjector.getBasicGeneaNode();
		lPadmenaberrie.init(StarWarsContentDataBase.sPadmeNaberrieLegends);
		lPadmenaberrie.setLevel(2);
		
		lCadeskywalker.setFather(lKolskywalker);
		lCadeskywalker.setMother(lMorriganCorde);
		
		lLeiaskywalker.setFather(lAnakinskywalker);
		lLeiaskywalker.setMother(lPadmenaberrie);
		
		lLukeskywalker.setFather(lAnakinskywalker);
		lLukeskywalker.setMother(lPadmenaberrie);
		
		lBenskywalker.setFather(lLukeskywalker);
		lBenskywalker.setMother(lMaraJade);
		
		lAnakinskywalker.setMother(lShmiskywalker);
		
		GenealogyModule lGenealogy = StarWarsApp.ginjector.getGenealogy();
		lGenealogy.getNodes().add(lCadeskywalker);
		lGenealogy.getNodes().add(lNatskywalker);
		lGenealogy.getNodes().add(lLeiaskywalker);
		lGenealogy.getNodes().add(lBenskywalker);
		
		lGenealogy.getDisplay().setLeftNodesAndBounds(250);
		
		UnknownGeneration lskywalkerUnknownGeneration = StarWarsApp.ginjector.getUnknownGeneration();
		lskywalkerUnknownGeneration.getDisplay().setTwoPeople();
		
		lGenealogy.getDisplay().addUnknownGeneration(lskywalkerUnknownGeneration.getDisplay().asWidget(), 271, 290);
		
		ElementInfo lElementInfo = AppFactory.createBasicInfo(AppFactory.sGenealogyIcon, "Famille Skywalker", "Lignée d'humains sensibles à la Force. "
				+ "Toutes les générations ont contribué à l'Ancien et au Nouvel Ordre Jedi autant que pour les Seigneurs Sith. Cette famille influença sur des"
				+ " affaires les plus proéminentes de la galaxie sur plus de 160 ans.");
		lElementInfo.setAComponent(lGenealogy);
		return lElementInfo;
	}
	
	public static ElementInfo getHapesHouse() {
		BasicGeneaNode lTenenielDjo = StarWarsApp.ginjector.getBasicGeneaNode();
		lTenenielDjo.init(StarWarsContentDataBase.sTenenielDjoLegends);
		
		BasicGeneaNode lIsolder = StarWarsApp.ginjector.getBasicGeneaNode();
		lIsolder.init(StarWarsContentDataBase.sIsolderLegends);
		lIsolder.setSpouse(lTenenielDjo);
		
		BasicGeneaNode lKalen = StarWarsApp.ginjector.getBasicGeneaNode();
		lKalen.init(StarWarsContentDataBase.sKalenLegends);
		
		BasicGeneaNode lTaaChumeHousband = StarWarsApp.ginjector.getBasicGeneaNode();
		lTaaChumeHousband.init(StarWarsContentDataBase.sHommeInconnuCommon, ElementColor.darkblue);
		
		BasicGeneaNode lTaaChume = StarWarsApp.ginjector.getBasicGeneaNode();
		lTaaChume.init(StarWarsContentDataBase.sTaaChumeLegends);
		lTaaChume.setSpouse(lTaaChumeHousband);
		lTaaChume.setLevel(2);

		BasicGeneaNode lConsort = StarWarsApp.ginjector.getBasicGeneaNode();
		lConsort.init(StarWarsContentDataBase.sHommeInconnuCommon, ElementColor.darkblue);
		lConsort.setHardCodeLeftAcc(-1000);
		lConsort.setLevel(2);
		
		BasicGeneaNode lNiKorish = StarWarsApp.ginjector.getBasicGeneaNode();
		lNiKorish.init(StarWarsContentDataBase.sNiKorishLegends);
		lNiKorish.setLevel(1);
		
		BasicGeneaNode lNiKorishHousband = StarWarsApp.ginjector.getBasicGeneaNode();
		lNiKorishHousband.init(StarWarsContentDataBase.sHommeInconnuCommon, ElementColor.darkblue);
		lNiKorishHousband.setLevel(1);
		
		BasicGeneaNode lTristaZel = StarWarsApp.ginjector.getBasicGeneaNode();
		lTristaZel.init(StarWarsContentDataBase.sTristaZelLegends);
		lTristaZel.setHardCodeLeftAcc(-50);
		lTristaZel.setLevel(4);
		
		BasicGeneaNode lTarynZel = StarWarsApp.ginjector.getBasicGeneaNode();
		lTarynZel.init(StarWarsContentDataBase.sTarynZelLegends);
		lTarynZel.setHardCodeLeftAcc(-50);
		lTarynZel.setLevel(4);
		
		BasicGeneaNode lChelik = StarWarsApp.ginjector.getBasicGeneaNode();
		lChelik.init(StarWarsContentDataBase.sChelikLegends);
		
		BasicGeneaNode lAlyssia = StarWarsApp.ginjector.getBasicGeneaNode();
		lAlyssia.init(StarWarsContentDataBase.sAlyssiaLegends);
		
		BasicGeneaNode lAlyssiaChelikFather = StarWarsApp.ginjector.getBasicGeneaNode();
		lAlyssiaChelikFather.init(StarWarsContentDataBase.sHommeInconnuCommon, ElementColor.darkblue);
		lAlyssiaChelikFather.setLevel(2);
		
		BasicGeneaNode lAlyssiaChelikMother = StarWarsApp.ginjector.getBasicGeneaNode();
		lAlyssiaChelikMother.init(StarWarsContentDataBase.sFemmeInconnueCommon, ElementColor.darkblue);
		lAlyssiaChelikMother.setLevel(2);
		
		lIsolder.setFather(lConsort);
		lIsolder.setMother(lTaaChume);
		
		lKalen.setFather(lConsort);
		lKalen.setMother(lTaaChume);
		
		lTaaChume.setFather(lNiKorishHousband);
		lTaaChume.setMother(lNiKorish);
		
		lAlyssiaChelikFather.setFather(lNiKorishHousband);
		lAlyssiaChelikFather.setMother(lNiKorish);
		
		lChelik.setFather(lAlyssiaChelikFather);
		lChelik.setMother(lAlyssiaChelikMother);
		
		lAlyssia.setFather(lAlyssiaChelikFather);
		lAlyssia.setMother(lAlyssiaChelikMother);
		
		GenealogyModule lGenealogy = StarWarsApp.ginjector.getGenealogy();
		lGenealogy.getNodes().add(lIsolder);
		lGenealogy.getNodes().add(lKalen);
		lGenealogy.getNodes().add(lTristaZel);
		lGenealogy.getNodes().add(lTarynZel);
		lGenealogy.getNodes().add(lChelik);
		lGenealogy.getNodes().add(lAlyssia);

//		lGenealogy.bind();
		lGenealogy.getDisplay().setLeftNodesAndBounds(750);
		
		UnknownGeneration lHapesUnknownGeneration = StarWarsApp.ginjector.getUnknownGeneration();
		lHapesUnknownGeneration.getDisplay().setTwoPeople();
		
		lGenealogy.getDisplay().addUnknownGeneration(lHapesUnknownGeneration.getDisplay().asWidget(), 44, 140);

		ElementInfo lElementInfo = AppFactory.createBasicInfo(AppFactory.sGenealogyIcon, "Maison Royale d'Hapes", "Hapes est dirigée par une Reine Mère dont le titre est transmis "
				+ "de façon héréditaire uniquement aux femmes. La voix de la Reine Mère est intraitable et peut s'appliquer à n'importe quel domaine.");
		lElementInfo.setAComponent(lGenealogy);
		
		return lElementInfo;
	}
	
	public static ElementInfo getSith() {
		JediGeneaNode lDarkTraya = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkTraya.init(StarWarsContentDataBase.sDarkTrayaLegends);
		
		JediGeneaNode lDarkNihilus = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkNihilus.init(StarWarsContentDataBase.sDarkNihilusLegends);
		lDarkNihilus.setHardCodeLeftAcc(-700);
		
		JediGeneaNode lDarkSion = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkSion.setHardCodeLeftAcc(-700);
		lDarkSion.init(StarWarsContentDataBase.sDarkSionLegends);
		
		JediGeneaNode lDarkRevan = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkRevan.init(StarWarsContentDataBase.sDarkRevanLegends);
		
		JediGeneaNode lDarkMalak = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkMalak.init(StarWarsContentDataBase.sDarkMalakLegends);
		
		JediGeneaNode lScourge = StarWarsApp.ginjector.getJediGeneaNode();
		lScourge.init(StarWarsContentDataBase.sScourgeLegends);
		
		JediGeneaNode lVisasMarr = StarWarsApp.ginjector.getJediGeneaNode();
		lVisasMarr.init(StarWarsContentDataBase.sVisasMarrLegends);
		
		JediGeneaNode lDarkBandon = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkBandon.init(StarWarsContentDataBase.sDarkBandonLegends);
		
		JediGeneaNode lVulta = StarWarsApp.ginjector.getJediGeneaNode();
		lVulta.init(StarWarsContentDataBase.sVultaDaanatLegends);
		
		JediGeneaNode lSkereKaan = StarWarsApp.ginjector.getJediGeneaNode();
		lSkereKaan.init(StarWarsContentDataBase.sSkereKaanLegends);
		
		JediGeneaNode lGithany = StarWarsApp.ginjector.getJediGeneaNode();
		lGithany.init(StarWarsContentDataBase.sGithanyLegends);
		
		JediGeneaNode lDarkBane = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkBane.init(StarWarsContentDataBase.sDarkBaneLegends);
		
		JediGeneaNode lDarkZannah = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkZannah.init(StarWarsContentDataBase.sDarkZannahLegends);
		
		JediGeneaNode lDarkCognus = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkCognus.init(StarWarsContentDataBase.sDarkCognusLegends);
		
		JediGeneaNode lDarkMillenial = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkMillenial.init(StarWarsContentDataBase.sDarkMillennialLegends);
		
		JediGeneaNode lDarkGravid = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkGravid.init(StarWarsContentDataBase.sDarkGravidLegends);
		
		JediGeneaNode lDarkGean = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkGean.init(StarWarsContentDataBase.sDarkGeanLegends);
		
		JediGeneaNode lDarkRamage = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkRamage.init(StarWarsContentDataBase.sDarkRamageLegends);
		
		JediGeneaNode lDarkTenebrous = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkTenebrous.init(StarWarsContentDataBase.sDarkTenebrousLegends);
		
		JediGeneaNode lDarkVenamis = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkVenamis.init(StarWarsContentDataBase.sDarkVenamisLegends);
		
		JediGeneaNode lNaatLare = StarWarsApp.ginjector.getJediGeneaNode();
		lNaatLare.init(StarWarsContentDataBase.sNaatLareLegends);
		
		JediGeneaNode lDarkPlagueis = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkPlagueis.init(StarWarsContentDataBase.sDarkPlagueisLegends);
		
		JediGeneaNode lDarkSidious = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkSidious.init(StarWarsContentDataBase.sDarkSidiousLegends);
		
		JediGeneaNode lDarkTyranus = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkTyranus.init(StarWarsContentDataBase.sDookuLegends, "Dark Tyranus");
		
		JediGeneaNode lDarkMaul = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkMaul.init(StarWarsContentDataBase.sDarkMaulLegends);
		lDarkMaul.setHardCodeLeftAcc(300);
		
		JediGeneaNode lDarkVador = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkVador.init(StarWarsContentDataBase.sDarkVadorLegends);
		lDarkVador.setHardCodeLeftAcc(1600);
		
		JediGeneaNode lAsajjVentress = StarWarsApp.ginjector.getJediGeneaNode();
		lAsajjVentress.init(StarWarsContentDataBase.sAsajjVentressLegends);
		
		JediGeneaNode lSevRanceTann = StarWarsApp.ginjector.getJediGeneaNode();
		lSevRanceTann.init(StarWarsContentDataBase.sSevRanceTannLegends);
		
		JediGeneaNode lStarkiller = StarWarsApp.ginjector.getJediGeneaNode();
		lStarkiller.init(StarWarsContentDataBase.sStarkillerLegends);
		lStarkiller.setHardCodeLeftAcc(1000);
		
		JediGeneaNode lLumiya = StarWarsApp.ginjector.getJediGeneaNode();
		lLumiya.init(StarWarsContentDataBase.sLumiyaLegends);
		
		JediGeneaNode lFlint = StarWarsApp.ginjector.getJediGeneaNode();
		lFlint.init(StarWarsContentDataBase.sFlintLegends);
		
		JediGeneaNode lDarkCaedus = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkCaedus.init(StarWarsContentDataBase.sDarkCaedusLegends);
		lDarkCaedus.setHardCodeLeftAcc(-500);
		
		JediGeneaNode lCarnorJax = StarWarsApp.ginjector.getJediGeneaNode();
		lCarnorJax.init(StarWarsContentDataBase.sCarnorJaxLegends);
		lCarnorJax.setHardCodeLeftAcc(1000);
		
		JediGeneaNode lGrievous = StarWarsApp.ginjector.getJediGeneaNode();
		lGrievous.init(StarWarsContentDataBase.sGrievousLegends);
		
		JediGeneaNode lVergere = StarWarsApp.ginjector.getJediGeneaNode();
		lVergere.init(StarWarsContentDataBase.sVergereLegends);
		lVergere.setHardCodeLeftAcc(2000);
		lVergere.setLevel(11);
		
		JediGeneaNode lXoxaan = StarWarsApp.ginjector.getJediGeneaNode();
		lXoxaan.init(StarWarsContentDataBase.sXoxaanLegends);
		lXoxaan.setLevel(11);
		
		JediGeneaNode lDarkKrayt = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkKrayt.init(StarWarsContentDataBase.sDarkKraytLegends);
		lDarkKrayt.setHardCodeLeftAcc(2600);
		
		JediGeneaNode lDarkKruhl = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkKruhl.init(StarWarsContentDataBase.sDarkKruhlLegends);
		lDarkKruhl.setLevel(13);
		
		JediGeneaNode lDarkMaladi = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkMaladi.init(StarWarsContentDataBase.sDarkMaladiLegends);
		
		JediGeneaNode lDarkMaleval = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkMaleval.init(StarWarsContentDataBase.sDarkMalevalLegends);
		
		JediGeneaNode lDarkNihl = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkNihl.init(StarWarsContentDataBase.sDarkNihlLegends);
		
		JediGeneaNode lDarkReave = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkReave.init(StarWarsContentDataBase.sDarkReaveLegends);
		
		JediGeneaNode lDarkRuyn = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkRuyn.init(StarWarsContentDataBase.sDarkRuynLegends);
		
		JediGeneaNode lDarkStryfe = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkStryfe.init(StarWarsContentDataBase.sDarkStryfeLegends);
		
		JediGeneaNode lDarkWyyrlok = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkWyyrlok.init(StarWarsContentDataBase.sDarkWyyrlokLegends);
		
		JediGeneaNode lDarkTalon = StarWarsApp.ginjector.getJediGeneaNode();
		lDarkTalon.init(StarWarsContentDataBase.sDarkTalonLegends);
		lDarkTalon.setLevel(14);
		
		JediGeneaNode lSimus = StarWarsApp.ginjector.getJediGeneaNode();
		lSimus.init(StarWarsContentDataBase.sSimusLegends);
		lSimus.setLevel(3);
		
		JediGeneaNode lMarkaRagnos = StarWarsApp.ginjector.getJediGeneaNode();
		lMarkaRagnos.init(StarWarsContentDataBase.sMarkaRagnosLegends);
		
		JediGeneaNode lNagaSadow = StarWarsApp.ginjector.getJediGeneaNode();
		lNagaSadow.init(StarWarsContentDataBase.sNagaSadowLegends);
		
		JediGeneaNode lVitiate = StarWarsApp.ginjector.getJediGeneaNode();
		lVitiate.init(StarWarsContentDataBase.sVitiateLegends);
		lVitiate.setLevel(5);
		
		JediGeneaNode lFreedonNadd = StarWarsApp.ginjector.getJediGeneaNode();
		lFreedonNadd.init(StarWarsContentDataBase.sFreedonNaddLegends);
		lFreedonNadd.setLevel(5);
		lFreedonNadd.setHardCodeLeftAcc(200);
		
		JediGeneaNode lExalKressh = StarWarsApp.ginjector.getJediGeneaNode();
		lExalKressh.init(StarWarsContentDataBase.sExalKresshLegends);
		
		JediGeneaNode lSatalKeto = StarWarsApp.ginjector.getJediGeneaNode();
		lSatalKeto.init(StarWarsContentDataBase.sSatalKetoLegends);
		
		JediGeneaNode lAleemaKeto = StarWarsApp.ginjector.getJediGeneaNode();
		lAleemaKeto.init(StarWarsContentDataBase.sAleemaKetoLegends);
		
		JediGeneaNode lOmmin = StarWarsApp.ginjector.getJediGeneaNode();
		lOmmin.init(StarWarsContentDataBase.sOmminLegends);
		
		JediGeneaNode lExarKun = StarWarsApp.ginjector.getJediGeneaNode();
		lExarKun.init(StarWarsContentDataBase.sExarKunLegends);
		
		JediGeneaNode lUlicQelDroma = StarWarsApp.ginjector.getJediGeneaNode();
		lUlicQelDroma.init(StarWarsContentDataBase.sUlicQelDromaLegends);
		lUlicQelDroma.setLevel(7);
		lUlicQelDroma.setHardCodeLeftAcc(600);

		JediGeneaNode lShadowSpawn = StarWarsApp.ginjector.getJediGeneaNode();
		lShadowSpawn.init(StarWarsContentDataBase.sShadowspawnLegends);
		
		JediGeneaNode lJerec = StarWarsApp.ginjector.getJediGeneaNode();
		lJerec.init(StarWarsContentDataBase.sJerecLegends);
		
		JediGeneaNode lYun = StarWarsApp.ginjector.getJediGeneaNode();
		lYun.init(StarWarsContentDataBase.sYunLegends);
		
		JediGeneaNode lSariss = StarWarsApp.ginjector.getJediGeneaNode();
		lSariss.init(StarWarsContentDataBase.sSarissLegends);
		
		JediGeneaNode lSoraBulq = StarWarsApp.ginjector.getJediGeneaNode();
		lSoraBulq.init(StarWarsContentDataBase.sSoraBulqLegends);
		
		JediGeneaNode lQuinlanVos = StarWarsApp.ginjector.getJediGeneaNode();
		lQuinlanVos.init(StarWarsContentDataBase.sQuinlanVosLegends);
		
		JediGeneaNode lKadrianSey = StarWarsApp.ginjector.getJediGeneaNode();
		lKadrianSey.init(StarWarsContentDataBase.sKadrianSeyLegends);
		
		JediGeneaNode lTolSkorr = StarWarsApp.ginjector.getJediGeneaNode();
		lTolSkorr.init(StarWarsContentDataBase.sTolSkorrLegends);
		
		JediGeneaNode lBoc = StarWarsApp.ginjector.getJediGeneaNode();
		lBoc.init(StarWarsContentDataBase.sBocAsecaLegends);
		
		JediGeneaNode lMaw = StarWarsApp.ginjector.getJediGeneaNode();
		lMaw.init(StarWarsContentDataBase.sMawLegends);
		
		lYun.setFather(lSariss);
		
		lSariss.setFather(lJerec);
		lBoc.setFather(lJerec);
		lMaw.setFather(lJerec);
		
		lJerec.setFather(lShadowSpawn);
		
		lUlicQelDroma.setFather(lExarKun);

		lSatalKeto.setFather(lFreedonNadd);
		lAleemaKeto.setFather(lFreedonNadd);
		lOmmin.setFather(lFreedonNadd);
		lExarKun.setFather(lFreedonNadd);
		
		lMarkaRagnos.setFather(lSimus);
		lNagaSadow.setFather(lSimus);
		
		lVitiate.setFather(lMarkaRagnos);
		
		lExalKressh.setFather(lVitiate);
		
		lFreedonNadd.setFather(lNagaSadow);
		
		lVulta.setFather(lSkereKaan);
		
		lDarkBane.setFather(lGithany);
//		lDarkBane.setMother(lDarkRevan);
		
		lDarkZannah.setFather(lDarkBane);
		
		lDarkCognus.setFather(lDarkZannah);
		
		lDarkGravid.setFather(lDarkCognus);
		lDarkMillenial.setFather(lDarkCognus);
		
		lDarkGean.setFather(lDarkGravid);
		
		lDarkRamage.setFather(lDarkGean);
		
		lDarkTenebrous.setFather(lDarkRamage);
		
		lDarkPlagueis.setFather(lDarkTenebrous);
		lDarkVenamis.setFather(lDarkTenebrous);
		
		lNaatLare.setFather(lDarkVenamis);
		
		lDarkSidious.setFather(lDarkPlagueis);
		
		lShadowSpawn.setFather(lDarkSidious);
		lDarkTyranus.setFather(lDarkSidious);
		lDarkVador.setFather(lDarkSidious);
		lDarkMaul.setFather(lDarkSidious);
		
		lQuinlanVos.setFather(lDarkTyranus);
		lTolSkorr.setFather(lDarkTyranus);
		lSoraBulq.setFather(lDarkTyranus);
		lKadrianSey.setFather(lDarkTyranus);
		lAsajjVentress.setFather(lDarkTyranus);
		lSevRanceTann.setFather(lDarkTyranus);
		lGrievous.setFather(lDarkTyranus);
		
		lStarkiller.setFather(lDarkVador);
		lLumiya.setFather(lDarkVador);
		lFlint.setFather(lDarkVador);
		
		lCarnorJax.setFather(lLumiya);
		lDarkCaedus.setFather(lLumiya);
		
		lDarkCaedus.setMother(lVergere);
		lDarkKrayt.setFather(lVergere);
		
		lDarkKrayt.setMother(lXoxaan);
		
		lDarkKruhl.setFather(lDarkKrayt);
		lDarkStryfe.setFather(lDarkKrayt);
		lDarkMaladi.setFather(lDarkKrayt);
		lDarkMaleval.setFather(lDarkKrayt);
		lDarkNihl.setFather(lDarkKrayt);
		lDarkReave.setFather(lDarkKrayt);
		lDarkWyyrlok.setFather(lDarkKrayt);
		lDarkRuyn.setFather(lDarkKrayt);
		
		lDarkTalon.setFather(lDarkRuyn);
		
		lDarkBandon.setFather(lDarkMalak);
		
		lDarkMalak.setFather(lDarkRevan);
		lScourge.setFather(lDarkRevan);
		
		lDarkRevan.setFather(lDarkTraya);
		lDarkNihilus.setFather(lDarkTraya);
		lDarkSion.setFather(lDarkTraya);
		
		lVisasMarr.setFather(lDarkNihilus);
		
		GenealogyModule lGenealogy = StarWarsApp.ginjector.getGenealogy();
//		lGenealogy.getNodes().add(lVulta);
		lGenealogy.getNodes().add(lYun);
		lGenealogy.getNodes().add(lBoc);
		lGenealogy.getNodes().add(lMaw);
		lGenealogy.getNodes().add(lQuinlanVos);
		lGenealogy.getNodes().add(lTolSkorr);
		lGenealogy.getNodes().add(lSoraBulq);
		lGenealogy.getNodes().add(lKadrianSey);
		lGenealogy.getNodes().add(lAsajjVentress);
		lGenealogy.getNodes().add(lSevRanceTann);
		lGenealogy.getNodes().add(lGrievous);
		lGenealogy.getNodes().add(lDarkMillenial);
		lGenealogy.getNodes().add(lNaatLare);
		lGenealogy.getNodes().add(lDarkMaul);
		lGenealogy.getNodes().add(lFlint);
		lGenealogy.getNodes().add(lStarkiller);
		lGenealogy.getNodes().add(lDarkCaedus);
		lGenealogy.getNodes().add(lCarnorJax);
		lGenealogy.getNodes().add(lDarkKruhl);
		lGenealogy.getNodes().add(lDarkStryfe);
		lGenealogy.getNodes().add(lDarkMaladi);
		lGenealogy.getNodes().add(lDarkMaleval);
		lGenealogy.getNodes().add(lDarkNihl);
		lGenealogy.getNodes().add(lDarkReave);
		lGenealogy.getNodes().add(lDarkWyyrlok);
		lGenealogy.getNodes().add(lDarkTalon);
		lGenealogy.getNodes().add(lDarkBandon);
		lGenealogy.getNodes().add(lScourge);
		lGenealogy.getNodes().add(lVisasMarr);
		lGenealogy.getNodes().add(lDarkSion);
		lGenealogy.getNodes().add(lExalKressh);
		lGenealogy.getNodes().add(lSatalKeto);
		lGenealogy.getNodes().add(lAleemaKeto);
		lGenealogy.getNodes().add(lOmmin);
		lGenealogy.getNodes().add(lUlicQelDroma);
		lGenealogy.getNodes().add(lVulta);
		
		lGenealogy.getDisplay().setDarkBlueLegend("Vrais Sith");
		lGenealogy.getDisplay().setRedLegend("Règle des Deux");
		lGenealogy.getDisplay().setGreenLegend("Triumvirat Sith");
		lGenealogy.getDisplay().setKakiLegend("Naddisme");
		lGenealogy.getDisplay().setMediumOrangeLegend("Sith Unique");
		lGenealogy.getDisplay().setMediumPurpleLegend("Acolyte / Jedi Noir");
		
		lGenealogy.getDisplay().setLeftNodesAndBounds(30);

		ElementInfo lElementInfo = AppFactory.createBasicInfo(AppFactory.sGenealogyIcon, "Ascendance des Sith", "Le terme Sith est ambigu puisqu'il peut à la fois "
				+ "désigner la race native de Korriban, l'organisation politico-religieuse (souvent sous la forme d'un Empire) ou la pensée philosophique. Dans "
				+ "cette généalogie sont présenter les instigateurs et les prolongateurs de cette pensée philosophique, qui, à bien des reprises, changea d'idéologie.");
		lElementInfo.setAComponent(lGenealogy);
		return lElementInfo;
	}
	
	public static ElementInfo getNaberrieHouse() {
		BasicGeneaNode lWinamanaberrie = StarWarsApp.ginjector.getBasicGeneaNode();
		lWinamanaberrie.init(StarWarsContentDataBase.sWinamaNaberrieLegends);
		
		BasicGeneaNode lWinamanaberrieHousband = StarWarsApp.ginjector.getBasicGeneaNode();
		lWinamanaberrieHousband.init(StarWarsContentDataBase.sHommeInconnuCommon, ElementColor.yellow);
		
		BasicGeneaNode lRyooThule = StarWarsApp.ginjector.getBasicGeneaNode();
		lRyooThule.init(StarWarsContentDataBase.sRyooThuleLegends);
		
		BasicGeneaNode lRyooThuleHousband = StarWarsApp.ginjector.getBasicGeneaNode();
		lRyooThuleHousband.init(StarWarsContentDataBase.sHommeInconnuCommon, ElementColor.yellow);
		
		BasicGeneaNode lRuweenaberrie = StarWarsApp.ginjector.getBasicGeneaNode();
		lRuweenaberrie.init(StarWarsContentDataBase.sRuweeNaberrieCommon);
		
		BasicGeneaNode lJobalnaberrie = StarWarsApp.ginjector.getBasicGeneaNode();
		lJobalnaberrie.init(StarWarsContentDataBase.sJobalNaberrieCommon);
		
		BasicGeneaNode lAnakinskywalker = StarWarsApp.ginjector.getBasicGeneaNode();
		lAnakinskywalker.init(StarWarsContentDataBase.sAnakinSkywalkerLegends);
		
		BasicGeneaNode lPadmenaberrie = StarWarsApp.ginjector.getBasicGeneaNode();
		lPadmenaberrie.init(StarWarsContentDataBase.sPadmeNaberrieLegends);
		lPadmenaberrie.setSpouse(lAnakinskywalker);
		lPadmenaberrie.setHardCodeLeftAcc(150);
		
		BasicGeneaNode lSolanaberrie = StarWarsApp.ginjector.getBasicGeneaNode();
		lSolanaberrie.init(StarWarsContentDataBase.sSolaNaberrieCommon);
		
		BasicGeneaNode lDarredJanren = StarWarsApp.ginjector.getBasicGeneaNode();
		lDarredJanren.setHardCodeLeftAcc(-300);
		lDarredJanren.init(StarWarsContentDataBase.sDarredJanrenLegends);
		
		BasicGeneaNode lRyoonaberrie = StarWarsApp.ginjector.getBasicGeneaNode();
		lRyoonaberrie.init(StarWarsContentDataBase.sRyooNaberrieLegends);
		
		BasicGeneaNode lPoojanaberrie = StarWarsApp.ginjector.getBasicGeneaNode();
		lPoojanaberrie.init(StarWarsContentDataBase.sPoojaNaberrieLegends);

		lRyoonaberrie.setFather(lDarredJanren);
		lRyoonaberrie.setMother(lSolanaberrie);
		
		lPoojanaberrie.setFather(lDarredJanren);
		lPoojanaberrie.setMother(lSolanaberrie);
		
		lSolanaberrie.setFather(lRuweenaberrie);
		lSolanaberrie.setMother(lJobalnaberrie);
		
		lPadmenaberrie.setFather(lRuweenaberrie);
		lPadmenaberrie.setMother(lJobalnaberrie);
	
		lRuweenaberrie.setFather(lWinamanaberrieHousband);
		lRuweenaberrie.setMother(lWinamanaberrie);
		
		lJobalnaberrie.setFather(lRyooThuleHousband);
		lJobalnaberrie.setMother(lRyooThule);
		
		GenealogyModule lGenealogy = StarWarsApp.ginjector.getGenealogy();
		lGenealogy.getNodes().add(lRyoonaberrie);
		lGenealogy.getNodes().add(lPoojanaberrie);
		lGenealogy.getNodes().add(lPadmenaberrie);
		
		lGenealogy.getDisplay().setLeftNodesAndBounds(530);
		
		ElementInfo lElementInfo = AppFactory.createBasicInfo(AppFactory.sGenealogyIcon, "Maison Naberrie", "Famille proéminente originaire de "
				+ "Naboo, beaucoup des membres ont travaillé dans le domaine politique.");
		lElementInfo.setAComponent(lGenealogy);
		
		return lElementInfo;
	}
	
	public static ElementInfo getClanFett() {
		BasicGeneaNode lJangoFettFather = StarWarsApp.ginjector.getBasicGeneaNode();
		lJangoFettFather.init(StarWarsContentDataBase.sHommeInconnuCommon, ElementColor.orange);

		BasicGeneaNode lJangoFettMother = StarWarsApp.ginjector.getBasicGeneaNode();
		lJangoFettMother.init(StarWarsContentDataBase.sFemmeInconnueCommon, ElementColor.orange);
		lJangoFettMother.bind();
		lJangoFettMother.draw();
		
		BasicGeneaNode lArlaFett = StarWarsApp.ginjector.getBasicGeneaNode();
		lArlaFett.init(StarWarsContentDataBase.sArlaFettLegends);
		
		BasicGeneaNode lJangoFett = StarWarsApp.ginjector.getBasicGeneaNode();
		lJangoFett.init(StarWarsContentDataBase.sJangoFettLegends);
		
		BasicGeneaNode lBobaFett = StarWarsApp.ginjector.getBasicGeneaNode();
		lBobaFett.init(StarWarsContentDataBase.sBobaFettLegends);
		
		BasicGeneaNode lSintasVel = StarWarsApp.ginjector.getBasicGeneaNode();
		lSintasVel.init(StarWarsContentDataBase.sSintasVelLegends);
		
		BasicGeneaNode lAilynVel = StarWarsApp.ginjector.getBasicGeneaNode();
		lAilynVel.init(StarWarsContentDataBase.sAilynVelLegends);
		
		BasicGeneaNode lMakinMarec = StarWarsApp.ginjector.getBasicGeneaNode();
		lMakinMarec.init(StarWarsContentDataBase.sMakinMarecLegends);
	
		BasicGeneaNode lGhesOrade = StarWarsApp.ginjector.getBasicGeneaNode();
		lGhesOrade.init(StarWarsContentDataBase.sGhesOradeLegends);
		
		BasicGeneaNode lMirtaGev = StarWarsApp.ginjector.getBasicGeneaNode();
		lMirtaGev.init(StarWarsContentDataBase.sMirtaGevLegends);
		lMirtaGev.setSpouse(lGhesOrade);
		
		lMirtaGev.setMother(lAilynVel);
		lMirtaGev.setFather(lMakinMarec);
		
		lAilynVel.setMother(lSintasVel);
		lAilynVel.setFather(lBobaFett);
		
		lBobaFett.setFather(lJangoFett);
		
		lJangoFett.setFather(lJangoFettFather);
		lJangoFett.setMother(lJangoFettMother);
		
		lArlaFett.setFather(lJangoFettFather);
		lArlaFett.setMother(lJangoFettMother);
		
		GenealogyModule lGenealogy = StarWarsApp.ginjector.getGenealogy();
		lGenealogy.getNodes().add(lMirtaGev);
		lGenealogy.getNodes().add(lArlaFett);
		lGenealogy.getNodes().add(lGhesOrade);
		
		lGenealogy.getDisplay().setLeftNodesAndBounds(530);
		
		ElementInfo lElementInfo = AppFactory.createBasicInfo(AppFactory.sGenealogyIcon, "Clan Fett", "Le Clan Fett représentait certainement la famille "
				+ "la plus célèbre et la plus redoutée de l’histoire mandalorienne. Issus de l’espèce humaine, les Fett n’ont cessé d’apporter leur pierre "
				+ "à l’édifiante histoire de la Galaxie et ont parfois profondément changé le cours des évènements. Le nom de Fett signifie Fermier en Mando’a "
				+ "si on prend en considération le nom originel qui s’écrivait Vhett.");
		lElementInfo.setAComponent(lGenealogy);
		
		return lElementInfo;
	}
	
	public static ElementInfo getJedi() {
		ElementColor lOldOrder = ElementColor.blue;
		ElementColor lNewOrder = ElementColor.green;
		ElementColor lDarkjedi = ElementColor.purple;
		
		JediGeneaNode lYoda = StarWarsApp.ginjector.getJediGeneaNode();
		lYoda.init(StarWarsContentDataBase.sYodaLegends, lOldOrder);
	
		JediGeneaNode lMaceWindu = StarWarsApp.ginjector.getJediGeneaNode();
		lMaceWindu.setHardCodeLeftAcc(-1500);
		lMaceWindu.init(StarWarsContentDataBase.sMaceWinduLegends, lOldOrder);
		
		JediGeneaNode lDooku = StarWarsApp.ginjector.getJediGeneaNode();
		lDooku.setHardCodeLeftAcc(-200);
		lDooku.init(StarWarsContentDataBase.sDookuLegends, lDarkjedi);
		
		JediGeneaNode lQuigon = StarWarsApp.ginjector.getJediGeneaNode();
		lQuigon.setHardCodeLeftAcc(-300);
		lQuigon.init(StarWarsContentDataBase.sQuiGonJinnLegends, lOldOrder);
		
		JediGeneaNode lObiWan = StarWarsApp.ginjector.getJediGeneaNode();
		lObiWan.init(StarWarsContentDataBase.sObiWanKenobiLegends, lOldOrder);
		
		JediGeneaNode lLuke = StarWarsApp.ginjector.getJediGeneaNode();
		lLuke.init(StarWarsContentDataBase.sLukeSkywalkerLegends, lNewOrder);
		
		JediGeneaNode lDepa = StarWarsApp.ginjector.getJediGeneaNode();
		lDepa.setHardCodeLeftAcc(-1600);
		lDepa.init(StarWarsContentDataBase.sDepaBillabaLegends, lOldOrder);
		
		JediGeneaNode lEchuu = StarWarsApp.ginjector.getJediGeneaNode();
		lEchuu.setHardCodeLeftAcc(-1420);
		lEchuu.init(StarWarsContentDataBase.sEchuuShenJonLegends, lOldOrder);
		
		JediGeneaNode lNaat = StarWarsApp.ginjector.getJediGeneaNode();
		lNaat.setHardCodeLeftAcc(-700);
		lNaat.init(StarWarsContentDataBase.sNaatReathLegends, lOldOrder);
		
		JediGeneaNode lStam = StarWarsApp.ginjector.getJediGeneaNode();
		lStam.setHardCodeLeftAcc(-700);
		lStam.init(StarWarsContentDataBase.sStamReathLegends, lOldOrder);
		
		JediGeneaNode lKarVastor = StarWarsApp.ginjector.getJediGeneaNode();
		lKarVastor.setHardCodeLeftAcc(-1600);
		lKarVastor.init(StarWarsContentDataBase.sKarVastorLegends, lOldOrder);
		
		JediGeneaNode lXanatos = StarWarsApp.ginjector.getJediGeneaNode();
		lXanatos.init(StarWarsContentDataBase.sXanatosLegends, lDarkjedi);
		
		JediGeneaNode lBruck = StarWarsApp.ginjector.getJediGeneaNode();
		lBruck.setHardCodeLeftAcc(-300);
		lBruck.init(StarWarsContentDataBase.sBruckChunLegends, lDarkjedi);
		
		JediGeneaNode lAnakin = StarWarsApp.ginjector.getJediGeneaNode();
		lAnakin.setHardCodeLeftAcc(-600);
		lAnakin.init(StarWarsContentDataBase.sAnakinSkywalkerLegends, lDarkjedi);
		
		JediGeneaNode lJacen = StarWarsApp.ginjector.getJediGeneaNode();
		lJacen.init(StarWarsContentDataBase.sJacenSoloLegends, lDarkjedi);
		
		JediGeneaNode lTahiri = StarWarsApp.ginjector.getJediGeneaNode();
		lTahiri.setHardCodeLeftAcc(-100);
		lTahiri.init(StarWarsContentDataBase.sTahiriVeilaLegends, lDarkjedi);
		
		JediGeneaNode lBen = StarWarsApp.ginjector.getJediGeneaNode();
		lBen.setHardCodeLeftAcc(400);
		lBen.init(StarWarsContentDataBase.sBenSkywalkerLegends, lNewOrder);
		
		JediGeneaNode lAnakinSolo = StarWarsApp.ginjector.getJediGeneaNode();
		lAnakinSolo.init(StarWarsContentDataBase.sAnakinSoloLegends, lNewOrder);
		
		JediGeneaNode lJaina = StarWarsApp.ginjector.getJediGeneaNode();
		lJaina.init(StarWarsContentDataBase.sJainaSoloLegends, lNewOrder);
		
		JediGeneaNode lQuRahn = StarWarsApp.ginjector.getJediGeneaNode();
		lQuRahn.init(StarWarsContentDataBase.sQuRahnLegends, lOldOrder);
		
		JediGeneaNode lBrakiss = StarWarsApp.ginjector.getJediGeneaNode();
		lBrakiss.init(StarWarsContentDataBase.sBrakissLegends, lDarkjedi);
		
		JediGeneaNode lLeia = StarWarsApp.ginjector.getJediGeneaNode();
		lLeia.init(StarWarsContentDataBase.sLeiaOrganaLegends, lNewOrder);
		
		JediGeneaNode lDesann = StarWarsApp.ginjector.getJediGeneaNode();
		lDesann.init(StarWarsContentDataBase.sDesannLegends, lDarkjedi);
		
		JediGeneaNode lKamSolusar = StarWarsApp.ginjector.getJediGeneaNode();
		lKamSolusar.init(StarWarsContentDataBase.sKamSolusarLegends, lNewOrder);
		
		JediGeneaNode lTionne = StarWarsApp.ginjector.getJediGeneaNode();
		lTionne.init(StarWarsContentDataBase.sTionneSolusarLegends, lNewOrder);
		
		JediGeneaNode lMaraJade = StarWarsApp.ginjector.getJediGeneaNode();
		lMaraJade.setHardCodeLeftAcc(-200);
		lMaraJade.init(StarWarsContentDataBase.sMaraJadeLegends, lNewOrder);
		
		JediGeneaNode lKyleKatarn = StarWarsApp.ginjector.getJediGeneaNode();
		lKyleKatarn.init(StarWarsContentDataBase.sKyleKatarnLegends, lNewOrder);
		
		JediGeneaNode lKypDuron = StarWarsApp.ginjector.getJediGeneaNode();
		lKypDuron.init(StarWarsContentDataBase.sKypDurronLegends, lNewOrder);
		
		JediGeneaNode lKenthHamner = StarWarsApp.ginjector.getJediGeneaNode();
		lKenthHamner.init(StarWarsContentDataBase.sKenthHamnerLegends, lNewOrder);
		
		JediGeneaNode lKueller = StarWarsApp.ginjector.getJediGeneaNode();
		lKueller.init(StarWarsContentDataBase.sKuellerLegends, lDarkjedi);
		
		JediGeneaNode lDorsk81 = StarWarsApp.ginjector.getJediGeneaNode();
		lDorsk81.init(StarWarsContentDataBase.sDorsk81Legends, lNewOrder);
		
		JediGeneaNode lEelysa = StarWarsApp.ginjector.getJediGeneaNode();
		lEelysa.init(StarWarsContentDataBase.sEelysaLegends, lNewOrder);
		
		JediGeneaNode lKenyan = StarWarsApp.ginjector.getJediGeneaNode();
		lKenyan.init(StarWarsContentDataBase.sKenyanFarlanderLegends, lNewOrder);
		
		JediGeneaNode lLowbacca = StarWarsApp.ginjector.getJediGeneaNode();
		lLowbacca.init(StarWarsContentDataBase.sLowbaccaLegends, lNewOrder);
		
		JediGeneaNode lMikoReglia = StarWarsApp.ginjector.getJediGeneaNode();
		lMikoReglia.init(StarWarsContentDataBase.sMikoRegliaLegends, lNewOrder);
		
		JediGeneaNode lSehaDorvald = StarWarsApp.ginjector.getJediGeneaNode();
		lSehaDorvald.setHardCodeLeftAcc(4500);
		lSehaDorvald.init(StarWarsContentDataBase.sSehaDorvaldLegends, lNewOrder);
		
		JediGeneaNode lOctaRamis = StarWarsApp.ginjector.getJediGeneaNode();
		lOctaRamis.setHardCodeLeftAcc(300);
		lOctaRamis.init(StarWarsContentDataBase.sOctaRamisLegends, lNewOrder);
		
		JediGeneaNode lJaden = StarWarsApp.ginjector.getJediGeneaNode();
		lJaden.init(StarWarsContentDataBase.sJadenKorrLegends, lNewOrder);
		
		JediGeneaNode lRosh = StarWarsApp.ginjector.getJediGeneaNode();
		lRosh.init(StarWarsContentDataBase.sRoshPeninLegends, lNewOrder);
		
		JediGeneaNode lIkrit = StarWarsApp.ginjector.getJediGeneaNode();
		lIkrit.init(StarWarsContentDataBase.sIkritLegends, lNewOrder);
		
		JediGeneaNode lKiranaTi = StarWarsApp.ginjector.getJediGeneaNode();
		lKiranaTi.init(StarWarsContentDataBase.sKiranaTiLegends, lNewOrder);
		
		JediGeneaNode lKosulAyada = StarWarsApp.ginjector.getJediGeneaNode();
		lKosulAyada.init(StarWarsContentDataBase.sKosulAyadaLegends, lOldOrder);
		
		JediGeneaNode lEeth = StarWarsApp.ginjector.getJediGeneaNode();
		lEeth.setHardCodeLeftAcc(3300);
		lEeth.init(StarWarsContentDataBase.sEethKothLegends, lOldOrder);
		
		JediGeneaNode lSharaddHett = StarWarsApp.ginjector.getJediGeneaNode();
		lSharaddHett.init(StarWarsContentDataBase.sSharadHettLegends, lOldOrder);
		
		JediGeneaNode lASharaddHett = StarWarsApp.ginjector.getJediGeneaNode();
		lASharaddHett.setLevel(3);
		lASharaddHett.setHardCodeLeftAcc(3000);
		lASharaddHett.init(StarWarsContentDataBase.sDarkKraytLegends, "A'Sharadd Hett", lDarkjedi);
		
		JediGeneaNode lBhatJul = StarWarsApp.ginjector.getJediGeneaNode();
		lBhatJul.setHardCodeLeftAcc(3150);
		lBhatJul.init(StarWarsContentDataBase.sBhatJulLegends, lOldOrder);
		
		JediGeneaNode lAnyaKuro = StarWarsApp.ginjector.getJediGeneaNode();
		lAnyaKuro.setLevel(1);
		lAnyaKuro.init(StarWarsContentDataBase.sAnyaKuroLegends, lOldOrder);
		
		JediGeneaNode lJonAntilles = StarWarsApp.ginjector.getJediGeneaNode();
//		lJonAntilles.setHardCodeLeftAcc(5000);
		lJonAntilles.init(StarWarsContentDataBase.sJonAntillesLegends, lOldOrder);
		
		JediGeneaNode lAurraSing = StarWarsApp.ginjector.getJediGeneaNode();
		lAurraSing.init(StarWarsContentDataBase.sAurraSingLegends, lDarkjedi);
		
		JediGeneaNode lKiAdiMundi = StarWarsApp.ginjector.getJediGeneaNode();
		lKiAdiMundi.init(StarWarsContentDataBase.sKiAdiMundiLegends, lOldOrder);
		
		JediGeneaNode lDamaMontalvo = StarWarsApp.ginjector.getJediGeneaNode();
		lDamaMontalvo.setLevel(3);
		lDamaMontalvo.setHardCodeLeftAcc(2300);
		lDamaMontalvo.init(StarWarsContentDataBase.sDamaMontalvoLegends, lOldOrder);
		
		JediGeneaNode lKolSkywalker = StarWarsApp.ginjector.getJediGeneaNode();
		lKolSkywalker.init(StarWarsContentDataBase.sKolSkywalkerLegends, lNewOrder);
		
		JediGeneaNode lShadoVao = StarWarsApp.ginjector.getJediGeneaNode();
		lShadoVao.init(StarWarsContentDataBase.sShadoVaoLegends, lNewOrder);
		
		JediGeneaNode lWolfSazen = StarWarsApp.ginjector.getJediGeneaNode();
		lWolfSazen.setHardCodeLeftAcc(300);
		lWolfSazen.init(StarWarsContentDataBase.sWolfSazenLegends, lNewOrder);
		
		JediGeneaNode lKkruhk = StarWarsApp.ginjector.getJediGeneaNode();
		lKkruhk.init(StarWarsContentDataBase.sKKruhkLegends, lOldOrder);
		
		JediGeneaNode lLilit = StarWarsApp.ginjector.getJediGeneaNode();
		lLilit.init(StarWarsContentDataBase.sLilitTwoseasLegends, lOldOrder);
		
		JediGeneaNode lCadeSkywalker = StarWarsApp.ginjector.getJediGeneaNode();
		lCadeSkywalker.setHardCodeLeftAcc(-250);
		lCadeSkywalker.init(StarWarsContentDataBase.sCadeSkywalkerLegends, lNewOrder);
		
		JediGeneaNode lChasePiru = StarWarsApp.ginjector.getJediGeneaNode();
		lChasePiru.init(StarWarsContentDataBase.sChasePiruLegends, lOldOrder);
		
		JediGeneaNode lJiro = StarWarsApp.ginjector.getJediGeneaNode();
		lJiro.init(StarWarsContentDataBase.sJiroLegends, lOldOrder);
		
		JediGeneaNode lSeddwia = StarWarsApp.ginjector.getJediGeneaNode();
		lSeddwia.init(StarWarsContentDataBase.sSeddwiaLegends, lOldOrder);
		
		JediGeneaNode lKennanTaanzer = StarWarsApp.ginjector.getJediGeneaNode();
		lKennanTaanzer.init(StarWarsContentDataBase.sKennanTaanzerLegends, lOldOrder);
		
		JediGeneaNode lGenel = StarWarsApp.ginjector.getJediGeneaNode();
		lGenel.init(StarWarsContentDataBase.sGenelLegends, lOldOrder);
		
		JediGeneaNode lOnkya = StarWarsApp.ginjector.getJediGeneaNode();
		lOnkya.init(StarWarsContentDataBase.sOnkyaLegends, lOldOrder);
		
		JediGeneaNode lAllana = StarWarsApp.ginjector.getJediGeneaNode();
		lAllana.init(StarWarsContentDataBase.sAllanaSoloLegends, lNewOrder);
		
		JediGeneaNode lBariss = StarWarsApp.ginjector.getJediGeneaNode();
		lBariss.setHardCodeLeftAcc(3500);
		lBariss.init(StarWarsContentDataBase.sBarissOffeeLegends, lOldOrder);
		
		JediGeneaNode lLuminara = StarWarsApp.ginjector.getJediGeneaNode();
		lLuminara.init(StarWarsContentDataBase.sLuminaraUnduliLegends, lOldOrder);
		
		JediGeneaNode lZonder = StarWarsApp.ginjector.getJediGeneaNode();
		lZonder.setHardCodeLeftAcc(900);
		lZonder.init(StarWarsContentDataBase.sZonderLegends, lOldOrder);
		
		JediGeneaNode lYarael = StarWarsApp.ginjector.getJediGeneaNode();
//		lYarael.setHardCodeLeftAcc(3800);
		lYarael.init(StarWarsContentDataBase.sYaraelPoofLegends, lOldOrder);
		
		JediGeneaNode lRoron = StarWarsApp.ginjector.getJediGeneaNode();
		lRoron.setHardCodeLeftAcc(3800);
		lRoron.init(StarWarsContentDataBase.sRoronCorobbLegends, lOldOrder);
		
		JediGeneaNode lDrake = StarWarsApp.ginjector.getJediGeneaNode();
		lDrake.init(StarWarsContentDataBase.sDrakeLoGaanLegends, lOldOrder);
		
		JediGeneaNode lSaesee = StarWarsApp.ginjector.getJediGeneaNode();
		lSaesee.init(StarWarsContentDataBase.sSaeseeTiinLegends, lOldOrder);
		
		JediGeneaNode lOmo = StarWarsApp.ginjector.getJediGeneaNode();
		lOmo.init(StarWarsContentDataBase.sOmoBouriLegends, lOldOrder);
		
		JediGeneaNode lEven = StarWarsApp.ginjector.getJediGeneaNode();
		lEven.init(StarWarsContentDataBase.sEvenPiellLegends, lOldOrder);
		
		JediGeneaNode lJax = StarWarsApp.ginjector.getJediGeneaNode();
		lJax.init(StarWarsContentDataBase.sJaxPavanLegends, lOldOrder);
		
		lChasePiru.setFather(lKkruhk);
		lJiro.setFather(lKkruhk);
		lSeddwia.setFather(lKkruhk);
		lKennanTaanzer.setFather(lKkruhk);
		lGenel.setFather(lKkruhk);
		lOnkya.setFather(lKkruhk);
		
		lCadeSkywalker.setFather(lKkruhk);
		lCadeSkywalker.setMother(lWolfSazen);
		
		lShadoVao.setMother(lWolfSazen);
		lWolfSazen.setMother(lKolSkywalker);
		
		lKkruhk.setMother(lLilit);
		
		lBhatJul.setFather(lASharaddHett);
		
		lDamaMontalvo.setFather(lKiAdiMundi);
		lASharaddHett.setFather(lSharaddHett);
		lASharaddHett.setMother(lKiAdiMundi);
		
		lJonAntilles.setFather(lAnyaKuro);
		lAurraSing.setFather(lAnyaKuro);
		lKiAdiMundi.setFather(lAnyaKuro);
		
		lSharaddHett.setFather(lEeth);
		
		lEeth.setFather(lKosulAyada);
		
		lJaden.setFather(lKyleKatarn);
		lRosh.setFather(lKyleKatarn);
		
		lKyleKatarn.setFather(lQuRahn);
		
		lKyleKatarn.setFather(lLuke);
		lBrakiss.setFather(lLuke);
		lDesann.setFather(lLuke);
		lDorsk81.setFather(lLuke);
		lEelysa.setFather(lLuke);
		lKamSolusar.setFather(lLuke);
		lKenthHamner.setFather(lLuke);
		lKenyan.setFather(lLuke);
		lKiranaTi.setFather(lLuke);
		lKueller.setFather(lLuke);
		lKypDuron.setFather(lLuke);
		lLeia.setFather(lLuke);
		lLowbacca.setFather(lLuke);
		lMaraJade.setFather(lLuke);
		lTionne.setFather(lLuke);
		lJacen.setFather(lLuke);
		
		lSehaDorvald.setFather(lOctaRamis);
		
		lOctaRamis.setFather(lTionne);
		
//		lAllana.setFather(lLeia);
		
		lJaina.setFather(lMaraJade);
		lJaina.setMother(lKypDuron);
		lMikoReglia.setFather(lKypDuron);
		lAnakinSolo.setFather(lMaraJade);
		
		lBen.setFather(lJacen);
		lTahiri.setFather(lJacen);
		lTahiri.setMother(lIkrit);
		
		lLuke.setFather(lObiWan);
		lAnakin.setFather(lObiWan);
	
		lBruck.setFather(lXanatos);
		
		lObiWan.setFather(lQuigon);
		lXanatos.setFather(lQuigon);
		
		lQuigon.setFather(lDooku);
		
		lDooku.setFather(lYoda);
		lMaceWindu.setFather(lYoda);
		
		lNaat.setFather(lEchuu);
		lStam.setFather(lEchuu);
		
		lEchuu.setFather(lMaceWindu);
		lDepa.setFather(lMaceWindu);
		
		lKarVastor.setFather(lDepa);
		
		lZonder.setFather(lBariss);
		lBariss.setFather(lLuminara);
		
		lDrake.setFather(lRoron);
		lRoron.setFather(lYarael);
		
		lSaesee.setFather(lOmo);
		
		lJax.setFather(lEven);
		
		GenealogyModule lGenealogy = StarWarsApp.ginjector.getGenealogy();
		lGenealogy.getNodes().add(lChasePiru);
		lGenealogy.getNodes().add(lJiro);
		lGenealogy.getNodes().add(lSeddwia);
		lGenealogy.getNodes().add(lKennanTaanzer);
		lGenealogy.getNodes().add(lGenel);
		lGenealogy.getNodes().add(lOnkya);
		
		lGenealogy.getNodes().add(lCadeSkywalker);
		lGenealogy.getNodes().add(lShadoVao);
		
		lGenealogy.getNodes().add(lJonAntilles);
		lGenealogy.getNodes().add(lAurraSing);
		lGenealogy.getNodes().add(lDamaMontalvo);
		lGenealogy.getNodes().add(lBhatJul);
		
		lGenealogy.getNodes().add(lBrakiss);
		lGenealogy.getNodes().add(lDesann);
		lGenealogy.getNodes().add(lDorsk81);
		lGenealogy.getNodes().add(lEelysa);
		lGenealogy.getNodes().add(lKamSolusar);
		lGenealogy.getNodes().add(lKenthHamner);
		lGenealogy.getNodes().add(lKenyan);
		lGenealogy.getNodes().add(lKiranaTi);
		lGenealogy.getNodes().add(lKueller);
		lGenealogy.getNodes().add(lJaden);
		lGenealogy.getNodes().add(lRosh);
		lGenealogy.getNodes().add(lMikoReglia);
//		lGenealogy.getNodes().add(lAllana);
		lGenealogy.getNodes().add(lLeia);
		lGenealogy.getNodes().add(lLowbacca);
		lGenealogy.getNodes().add(lAnakinSolo);
		lGenealogy.getNodes().add(lJaina);
		lGenealogy.getNodes().add(lSehaDorvald);
		
		lGenealogy.getNodes().add(lBen);
		lGenealogy.getNodes().add(lTahiri);
		
		lGenealogy.getNodes().add(lAnakin);
		
		lGenealogy.getNodes().add(lBruck);
		lGenealogy.getNodes().add(lKarVastor);
		lGenealogy.getNodes().add(lNaat);
		lGenealogy.getNodes().add(lStam);
		
		lGenealogy.getNodes().add(lZonder);
		
		lGenealogy.getNodes().add(lDrake);
		lGenealogy.getNodes().add(lSaesee);
		lGenealogy.getNodes().add(lJax);
		
		lGenealogy.getDisplay().setLeftNodesAndBounds(1030);
		lGenealogy.getDisplay().setBlueLegend("Ordre Jedi");
		lGenealogy.getDisplay().setGreenLegend("Nouvel Ordre Jedi");
		lGenealogy.getDisplay().setPurpleLegend("seigneur Sith / Jedi Noir");
		
		ElementInfo lElementInfo = AppFactory.createBasicInfo(AppFactory.sGenealogyIcon, "Ascendance des Jedi", "Le mot Jedi désigne les membres d'un ordre d'individus ayant le pouvoir de maîtriser "
				+ "la Force et qui s'en servent pour préserver l'ordre dans la galaxie. Cette sagesse est enseigner de Maître à Padawan, de génération en génération. Avec "
				+ "un peu de recherche, nous arrivons à reconstituer une généalogie évoluée.");
		lElementInfo.setAComponent(lGenealogy);
		
		return lElementInfo;
	}
	
	public static ElementInfo getJediSithEvolution() {
		ElementColor lGouvSith = ElementColor.orange;
		ElementColor lGouvJedi = ElementColor.mediumgreen;
		ElementColor lIdSith = ElementColor.red;
		ElementColor lIdJedi = ElementColor.green;
		ElementColor lSecteSith = ElementColor.yellow;
		ElementColor lSecteJedi = ElementColor.mediumgreen2;
		
		// Jedi
		BasicGeneaNode lJediOrder = StarWarsApp.ginjector.getBasicGeneaNode();
		lJediOrder.init(StarWarsContentDataBase.sOrdreJediLegends, lIdJedi);
		
		BasicGeneaNode lJedaiiOrder = StarWarsApp.ginjector.getBasicGeneaNode();
		lJedaiiOrder.init(StarWarsContentDataBase.sOrdreJedaiiLegends, lIdJedi);
		
		BasicGeneaNode lJediNoir = StarWarsApp.ginjector.getBasicGeneaNode();
		lJediNoir.init(StarWarsContentDataBase.sJediNoirsLegends, lSecteJedi);
		
		BasicGeneaNode lPotentium = StarWarsApp.ginjector.getBasicGeneaNode();
		lPotentium.init(StarWarsContentDataBase.sPotentiumLegends, lSecteJedi);
		
		BasicGeneaNode lJediAltisien = StarWarsApp.ginjector.getBasicGeneaNode();
		lJediAltisien.init(StarWarsContentDataBase.sJediAltisiensLegends, lSecteJedi);
		
		BasicGeneaNode lNewJediOrder = StarWarsApp.ginjector.getBasicGeneaNode();
		lNewJediOrder.init(StarWarsContentDataBase.sNouvelOrdreJediLegends, lIdJedi);
		
		BasicGeneaNode lRevanchist = StarWarsApp.ginjector.getBasicGeneaNode();
		lRevanchist.init(StarWarsContentDataBase.sRevanchismeLegends, lSecteJedi);
		
		BasicGeneaNode lPacteJedi = StarWarsApp.ginjector.getBasicGeneaNode();
		lPacteJedi.init(StarWarsContentDataBase.sPacteJediLegends, lSecteJedi);
		
		BasicGeneaNode lCoalitionJedi = StarWarsApp.ginjector.getBasicGeneaNode();
		lCoalitionJedi.init(StarWarsContentDataBase.sCoalitionJediLegends, lGouvJedi);
		
		// Sith
		BasicGeneaNode lCodeSith = StarWarsApp.ginjector.getBasicGeneaNode();
		lCodeSith.init(StarWarsContentDataBase.sCodeSithCommon, lIdSith);
		
		BasicGeneaNode lOldSithEmpire = StarWarsApp.ginjector.getBasicGeneaNode();
		lOldSithEmpire.setHardCodeLeftAcc(300);
		lOldSithEmpire.init(StarWarsContentDataBase.sAncienEmpireSithLegends, lGouvSith);
		
		BasicGeneaNode lNaddism = StarWarsApp.ginjector.getBasicGeneaNode();
		lNaddism.init(StarWarsContentDataBase.sNaddismeLegends, lSecteSith);
		
		BasicGeneaNode lTrueSith = StarWarsApp.ginjector.getBasicGeneaNode();
		lTrueSith.init(StarWarsContentDataBase.sVraisSithLegends, lSecteSith);
		
		BasicGeneaNode lLostTribe = StarWarsApp.ginjector.getBasicGeneaNode();
		lLostTribe.init(StarWarsContentDataBase.sTribuperduedesSithLegends, lSecteSith);
		
		BasicGeneaNode lKrath = StarWarsApp.ginjector.getBasicGeneaNode();
		lKrath.init(StarWarsContentDataBase.sKrathLegends, lSecteSith);
		
		BasicGeneaNode lSithBrother = StarWarsApp.ginjector.getBasicGeneaNode();
		lSithBrother.init(StarWarsContentDataBase.sConfrerieSithLegends, lSecteSith);
		
		BasicGeneaNode lEmpireRebuild = StarWarsApp.ginjector.getBasicGeneaNode();
		lEmpireRebuild.init(StarWarsContentDataBase.sSecondEmpireSithLegends, lGouvSith);
		
		BasicGeneaNode lRevanEmpire = StarWarsApp.ginjector.getBasicGeneaNode();
		lRevanEmpire.init(StarWarsContentDataBase.sEmpiredeRevanLegends, lGouvSith);
		
		BasicGeneaNode lTriumvirat = StarWarsApp.ginjector.getBasicGeneaNode();
		lTriumvirat.setHardCodeLeftAcc(900);
		lTriumvirat.init(StarWarsContentDataBase.sTriumviratSithLegends, lSecteSith);
		
		BasicGeneaNode lNewEmpire = StarWarsApp.ginjector.getBasicGeneaNode();
		lNewEmpire.setHardCodeLeftAcc(600);
		lNewEmpire.init(StarWarsContentDataBase.sNouvelEmpireSithLegends, lGouvSith);
		
		BasicGeneaNode lDarkBrother = StarWarsApp.ginjector.getBasicGeneaNode();
		lDarkBrother.setHardCodeLeftAcc(600);
		lDarkBrother.init(StarWarsContentDataBase.sConfreriedesTenebresLegends, lGouvSith);
		
		BasicGeneaNode lRuleOfTwo = StarWarsApp.ginjector.getBasicGeneaNode();
		lRuleOfTwo.setHardCodeLeftAcc(600);
		lRuleOfTwo.init(StarWarsContentDataBase.sRegledesDeuxLegends, lIdSith);
		
		BasicGeneaNode lGalacticEmpire = StarWarsApp.ginjector.getBasicGeneaNode();
		lGalacticEmpire.setHardCodeLeftAcc(600);
		lGalacticEmpire.init(StarWarsContentDataBase.sEmpireGalactiqueLegends, lGouvSith);
		
		BasicGeneaNode lDarkEmpire = StarWarsApp.ginjector.getBasicGeneaNode();
		lDarkEmpire.setHardCodeLeftAcc(600);
		lDarkEmpire.init(StarWarsContentDataBase.sEmpiredesTenebresLegends, lGouvSith);
		
		BasicGeneaNode lOneSith = StarWarsApp.ginjector.getBasicGeneaNode();
		lOneSith.setHardCodeLeftAcc(600);
		lOneSith.init(StarWarsContentDataBase.sSithUniqueLegends, lIdSith);
		
		BasicGeneaNode lKraytEmpire = StarWarsApp.ginjector.getBasicGeneaNode();
		lKraytEmpire.setHardCodeLeftAcc(600);
		lKraytEmpire.init(StarWarsContentDataBase.sEmpiredeKraytLegends, lGouvSith);
		
		BasicGeneaNode lEternalEmpire = StarWarsApp.ginjector.getBasicGeneaNode();
		lEternalEmpire.init(StarWarsContentDataBase.sEmpireEternelLegends, lGouvSith);
		
		BasicGeneaNode lRevanOrder = StarWarsApp.ginjector.getBasicGeneaNode();
		lRevanOrder.init(StarWarsContentDataBase.sOrdredeRevanLegends, lSecteSith);
		
		GenealogyModule lGenealogy = StarWarsApp.ginjector.getGenealogy();
		
		lDarkEmpire.setFather(lGalacticEmpire);
		lGalacticEmpire.setFather(lRuleOfTwo);
		lKraytEmpire.setFather(lOneSith);
		lOneSith.setFather(lRuleOfTwo);
		lRuleOfTwo.setFather(lDarkBrother);
		lDarkBrother.setFather(lNewEmpire);
		lNewEmpire.setFather(lEmpireRebuild);
		lRevanOrder.setFather(lEmpireRebuild);
		lEmpireRebuild.setFather(lTrueSith);
		lEternalEmpire.setFather(lTrueSith);
		lOldSithEmpire.setFather(lCodeSith);
		lCodeSith.setFather(lJediNoir);
		
		lTriumvirat.setFather(lRevanEmpire);
		lRevanEmpire.setFather(lRevanchist);
		
		lNewJediOrder.setFather(lJediOrder);
		lJediNoir.setFather(lJediOrder);
		lPacteJedi.setFather(lJediOrder);
		lRevanchist.setFather(lJediOrder);
		lPotentium.setFather(lJediOrder);
		lJediAltisien.setFather(lJediOrder);
		lJediOrder.setFather(lJedaiiOrder);
		
		lCoalitionJedi.setFather(lNewJediOrder);
		
		lKrath.setFather(lNaddism);
		lSithBrother.setFather(lNaddism);
		
		lNaddism.setFather(lOldSithEmpire);
		lLostTribe.setFather(lOldSithEmpire);
		lTrueSith.setFather(lOldSithEmpire);
		
		lGenealogy.getNodes().add(lCoalitionJedi);
		lGenealogy.getNodes().add(lKrath);
		lGenealogy.getNodes().add(lSithBrother);
		lGenealogy.getNodes().add(lDarkEmpire);
		lGenealogy.getNodes().add(lKraytEmpire);
		lGenealogy.getNodes().add(lLostTribe);
		lGenealogy.getNodes().add(lPacteJedi);
		lGenealogy.getNodes().add(lTriumvirat);
		lGenealogy.getNodes().add(lPotentium);
		lGenealogy.getNodes().add(lJediAltisien);
		lGenealogy.getNodes().add(lEternalEmpire);
		lGenealogy.getNodes().add(lRevanOrder);
		
		lGenealogy.getDisplay().setLeftNodesAndBounds(30);
		lGenealogy.getDisplay().setYellowLegend("Secte Sith");
		lGenealogy.getDisplay().setOrangeLegend("Gouvernement Sith");
		lGenealogy.getDisplay().setRedLegend("Idéologie Sith");
		lGenealogy.getDisplay().setMediumGreen2Legend("Secte Jedi");
		lGenealogy.getDisplay().setMediumGreenLegend("Gouvernement Jedi");
		lGenealogy.getDisplay().setGreenLegend("Ordre Jedi");
		
		ElementInfo lElementInfo = AppFactory.createBasicInfo(AppFactory.sGenealogyIcon, "Évolution idéologique", "La lutte entre le Côté Clair et le Côté Obscur est"
				+ " à l'origine d'une multitudes de conflits et d'évolutions politiques et idéologiques à travers les âges. Des premiers Je'daii aux acolytes de Dark Krayt,"
				+ " tous prétendent détenir la juste vérité sur la Force.");
		lElementInfo.setAComponent(lGenealogy);
		
		return lElementInfo;
	}

	public static ElementInfo getPoliticEvolution() {
		ElementColor lGouvSithImp = ElementColor.red;
		ElementColor lGouvImp = ElementColor.orange;
		ElementColor lGouvMili = ElementColor.green;
		ElementColor lGouvRep = ElementColor.mediumgreen2;
		
		JediGeneaNode lOldRepublic = StarWarsApp.ginjector.getJediGeneaNode();
		lOldRepublic.init(StarWarsContentDataBase.sRepubliqueGalactiqueLegends, lGouvRep);
		
		JediGeneaNode lGalacticEmpire = StarWarsApp.ginjector.getJediGeneaNode();
		lGalacticEmpire.setHardCodeLeftAcc(-175);
		lGalacticEmpire.init(StarWarsContentDataBase.sEmpireGalactiqueLegends, lGouvSithImp);
		
		JediGeneaNode lVestigeEmpire = StarWarsApp.ginjector.getJediGeneaNode();
		lVestigeEmpire.init(StarWarsContentDataBase.sVestigesdelEmpireLegends, lGouvImp);
		
		JediGeneaNode lNewEmpire = StarWarsApp.ginjector.getJediGeneaNode();
		lNewEmpire.init(StarWarsContentDataBase.sNouvelEmpireGalactiqueLegends, lGouvImp);
		
		JediGeneaNode lExilEmpire = StarWarsApp.ginjector.getJediGeneaNode();
		lExilEmpire.setHardCodeLeftAcc(-600);
		lExilEmpire.init(StarWarsContentDataBase.sEmpireenExilLegends, lGouvImp);
		
		JediGeneaNode lRebel = StarWarsApp.ginjector.getJediGeneaNode();
		lRebel.setHardCodeLeftAcc(-475);
		lRebel.init(StarWarsContentDataBase.sAllianceRebelleLegends, lGouvMili);
		
		JediGeneaNode lNewRep = StarWarsApp.ginjector.getJediGeneaNode();
		lNewRep.init(StarWarsContentDataBase.sNouvelleRepubliqueLegends, lGouvRep);
		
		JediGeneaNode lFGAL = StarWarsApp.ginjector.getJediGeneaNode();
		lFGAL.init(StarWarsContentDataBase.sAllianceGalactiqueLegends, "Fédération Galactique des Alliances Libres", lGouvRep);
		
		JediGeneaNode lVestigeAlliance = StarWarsApp.ginjector.getJediGeneaNode();
		lVestigeAlliance.setHardCodeLeftAcc(300);
		lVestigeAlliance.init(StarWarsContentDataBase.sVestigesdelAllianceLegends, lGouvMili);
		
		JediGeneaNode lKraytEmpire = StarWarsApp.ginjector.getJediGeneaNode();
		lKraytEmpire.setHardCodeLeftAcc(-300);
		lKraytEmpire.init(StarWarsContentDataBase.sEmpiredeKraytLegends, lGouvSithImp);
		
		JediGeneaNode lFGT = StarWarsApp.ginjector.getJediGeneaNode();
		lFGT.init(StarWarsContentDataBase.sFederationGalactiqueTripartiteLegends, lGouvRep);
		
		GenealogyModule lGenealogy = StarWarsApp.ginjector.getGenealogy();
		
		lFGT.setFather(lExilEmpire);
		lFGT.setMother(lVestigeAlliance);
		
		lKraytEmpire.setFather(lNewEmpire);
		lExilEmpire.setFather(lNewEmpire);
		lNewEmpire.setFather(lVestigeEmpire);
		lVestigeEmpire.setFather(lGalacticEmpire);
		lGalacticEmpire.setFather(lOldRepublic);
		
		lVestigeAlliance.setFather(lFGAL);
		lFGAL.setFather(lNewRep);
		lNewRep.setFather(lRebel);
		lRebel.setFather(lOldRepublic);
		
		lGenealogy.getNodes().add(lKraytEmpire);
		lGenealogy.getNodes().add(lFGT);
		
		lGenealogy.getDisplay().setLeftNodesAndBounds(330);
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

	public static ElementInfo getAttichitkutFamily() {
		ElementColor lMainFamily = ElementColor.green;
		ElementColor lOtherFamily = ElementColor.darkyellow;
		
		BasicGeneaNode lPrimalMale = StarWarsApp.ginjector.getBasicGeneaNode();
		lPrimalMale.init(StarWarsContentDataBase.sHommeInconnuCommon, lMainFamily);
		
		BasicGeneaNode lPrimalFemale = StarWarsApp.ginjector.getBasicGeneaNode();
		lPrimalFemale.init(StarWarsContentDataBase.sFemmeInconnueCommon, lMainFamily);
		
		BasicGeneaNode lTarffulFather = StarWarsApp.ginjector.getBasicGeneaNode();
		lTarffulFather.setHardCodeLeftAcc(-300);
		lTarffulFather.init(StarWarsContentDataBase.sHommeInconnuCommon, lMainFamily);
		
		BasicGeneaNode lTarffulMother = StarWarsApp.ginjector.getBasicGeneaNode();
		lTarffulMother.init(StarWarsContentDataBase.sFemmeInconnueCommon, lOtherFamily);
		
		BasicGeneaNode lShoranFather = StarWarsApp.ginjector.getBasicGeneaNode();
		lShoranFather.init(StarWarsContentDataBase.sHommeInconnuCommon, lMainFamily);
		
		BasicGeneaNode lShoranMother = StarWarsApp.ginjector.getBasicGeneaNode();
		lShoranMother.init(StarWarsContentDataBase.sFemmeInconnueCommon, lOtherFamily);

		BasicGeneaNode lMallaFather = StarWarsApp.ginjector.getBasicGeneaNode();
		lMallaFather.setLevel(1);
		lMallaFather.init(StarWarsContentDataBase.sHommeInconnuCommon, lOtherFamily);
		
		BasicGeneaNode lMallaMother = StarWarsApp.ginjector.getBasicGeneaNode();
		lMallaMother.setLevel(1);
		lMallaMother.init(StarWarsContentDataBase.sFemmeInconnueCommon, lOtherFamily);
		
		BasicGeneaNode lChewieMother = StarWarsApp.ginjector.getBasicGeneaNode();
		lChewieMother.init(StarWarsContentDataBase.sFemmeInconnueCommon, lOtherFamily);
		
		BasicGeneaNode lJowdrrl = StarWarsApp.ginjector.getBasicGeneaNode();
		lJowdrrl.init(StarWarsContentDataBase.sJowdrrlLegends, lMainFamily);
		
		BasicGeneaNode lShoran = StarWarsApp.ginjector.getBasicGeneaNode();
		lShoran.init(StarWarsContentDataBase.sShoranLegends, lMainFamily);
		
		BasicGeneaNode lDryanta = StarWarsApp.ginjector.getBasicGeneaNode();
		lDryanta.init(StarWarsContentDataBase.sDryantaLegends, lMainFamily);
		
		BasicGeneaNode lTarfful = StarWarsApp.ginjector.getBasicGeneaNode();
		lTarfful.init(StarWarsContentDataBase.sTarffulCommon, lMainFamily);
		
		BasicGeneaNode lAttichitkut = StarWarsApp.ginjector.getBasicGeneaNode();
		lAttichitkut.init(StarWarsContentDataBase.sAttichitkutLegends, lMainFamily);
		
		BasicGeneaNode lSirrakuk = StarWarsApp.ginjector.getBasicGeneaNode();
		lSirrakuk.init(StarWarsContentDataBase.sSirrakukLegends, lMainFamily);
		
		BasicGeneaNode lLowbacca = StarWarsApp.ginjector.getBasicGeneaNode();
		lLowbacca.init(StarWarsContentDataBase.sLowbaccaLegends, lMainFamily);
		
		BasicGeneaNode lMahraccor = StarWarsApp.ginjector.getBasicGeneaNode();
		lMahraccor.init(StarWarsContentDataBase.sMahraccorLegends, lOtherFamily);
		
		BasicGeneaNode lKallabow = StarWarsApp.ginjector.getBasicGeneaNode();
		lKallabow.init(StarWarsContentDataBase.sKallabowLegends, lMainFamily);
		
		BasicGeneaNode lLumpawaroo = StarWarsApp.ginjector.getBasicGeneaNode();
		lLumpawaroo.init(StarWarsContentDataBase.sLumpawarooLegends, lMainFamily);
		
		BasicGeneaNode lChewbacca = StarWarsApp.ginjector.getBasicGeneaNode();
		lChewbacca.setHardCodeLeftAcc(-300);
		lChewbacca.init(StarWarsContentDataBase.sChewbaccaLegends, lMainFamily);
		
		BasicGeneaNode lMallatobuck = StarWarsApp.ginjector.getBasicGeneaNode();
		lMallatobuck.setHardCodeLeftAcc(300);
		lMallatobuck.init(StarWarsContentDataBase.sMallatobuckLegends, lOtherFamily);
		
		BasicGeneaNode lVargi = StarWarsApp.ginjector.getBasicGeneaNode();
		lVargi.init(StarWarsContentDataBase.sVargiLegends, lOtherFamily);
		
		GenealogyModule lGenealogy = StarWarsApp.ginjector.getGenealogy();
		
		lShoranFather.setFather(lPrimalMale);
		lShoranFather.setMother(lPrimalFemale);
		
		lTarffulFather.setFather(lPrimalMale);
		lTarffulFather.setMother(lPrimalFemale);
				
		lAttichitkut.setFather(lPrimalMale);
		lAttichitkut.setMother(lPrimalFemale);
		
		lJowdrrl.setFather(lShoranFather);
		lJowdrrl.setMother(lShoranMother);

		lShoran.setFather(lShoranFather);
		lShoran.setMother(lShoranMother);
		
		lDryanta.setFather(lShoranFather);
		lDryanta.setMother(lShoranMother);
		
		lTarfful.setFather(lTarffulFather);
		lTarfful.setMother(lTarffulMother);
		
		lLowbacca.setFather(lMahraccor);
		lLowbacca.setMother(lKallabow);
		
		lSirrakuk.setFather(lMahraccor);
		lSirrakuk.setMother(lKallabow);
		
		lLumpawaroo.setFather(lChewbacca);
		lLumpawaroo.setMother(lMallatobuck);
	
		lKallabow.setFather(lAttichitkut);
		lKallabow.setMother(lChewieMother);
		
		lChewbacca.setFather(lAttichitkut);
		lChewbacca.setMother(lChewieMother);
	
		lMallatobuck.setFather(lMallaFather);
		lMallatobuck.setMother(lMallaMother);
		
		lVargi.setFather(lMallaFather);
		lVargi.setMother(lMallaMother);
		
		lGenealogy.getNodes().add(lJowdrrl);
		lGenealogy.getNodes().add(lShoran);
		lGenealogy.getNodes().add(lDryanta);
		lGenealogy.getNodes().add(lTarfful);
		lGenealogy.getNodes().add(lLowbacca);
		lGenealogy.getNodes().add(lSirrakuk);
		lGenealogy.getNodes().add(lLumpawaroo);
		lGenealogy.getNodes().add(lVargi);
		
		lGenealogy.getDisplay().setLeftNodesAndBounds(30);
		lGenealogy.getDisplay().setGreenLegend("Famille héréditaire");
		lGenealogy.getDisplay().setDarkYellowLegend("Famille par alliance");
		
		
		ElementInfo lElementInfo = AppFactory.createBasicInfo(AppFactory.sGenealogyIcon, "Famille d'Attichitkut", "Clan Wookie sans doute originel de Rwookrrorroo."
				+ " Elle apporta à la galaxie plusieurs guerriers d'exception, de grands pilotes ainsi qu'un chevalier Jedi. ");
		lElementInfo.setAComponent(lGenealogy);
		
		return lElementInfo;
	}
}