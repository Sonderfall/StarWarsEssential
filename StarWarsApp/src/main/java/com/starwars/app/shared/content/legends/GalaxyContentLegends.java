package com.starwars.app.shared.content.legends;

import com.starwars.app.client.StarWarsApp;
import com.starwars.app.client.galaxy.presenter.GalaxyModule;
import com.starwars.app.client.galaxy.presenter.GalaxyPeriod;
import com.starwars.app.client.galaxy.presenter.Planete;
import com.starwars.app.client.galaxy.presenter.Road;
import com.starwars.app.client.galaxy.presenter.Territory;
import com.starwars.app.client.resources.StarWarsImageResources;
import com.starwars.app.client.resources.StarWarsTextResources;
import com.starwars.app.shared.AppFactory;
import com.starwars.app.shared.ElementInfo;
import com.starwars.app.shared.ElementInfo.ElementColor;
import com.starwars.app.shared.content.StarWarsContentDataBase;

public class GalaxyContentLegends {
	
	public static ElementInfo getGlobalGalaxy() {
		GalaxyModule lGalaxy = StarWarsApp.ginjector.getGalaxy();
		processPlanetes(lGalaxy);
		processTerritories(lGalaxy);
		
		ElementInfo lElementInfo = AppFactory.createBasicInfo(AppFactory.sGalaxyIcon, "La Galaxie","Une galaxie c'est grand. "
				+ "Trèèèès grand. Explorer toutes les planètes serait long et fastidieux. Cependant, une carte intéractive comme "
				+ "celle risquerait bien de vous faire gagner du temps. Utilisez la chronologie en bas afin de faire évoluer la carte dans le temps.");
		lElementInfo.setAComponent(lGalaxy);
		return lElementInfo;
	}
	
	@SuppressWarnings("unused")
	private static void processPlanetes(GalaxyModule iGalaxy) {

		/* Center Galaxy : X = 1100px, Y = 830px */
		
		/* Center */
		
		Planete lKoros = createPlanete("Koros", 1102, 775, null, iGalaxy, true);
		Planete lTython = createPlanete("Tython", 1095, 796, StarWarsContentDataBase.sTythonLegends, iGalaxy, true);
		Planete lByss = createPlanete("Byss", 1060, 855, StarWarsContentDataBase.sByssLegends, iGalaxy, false);
		Planete lPratkith = createPlanete("Pratkith", 1060, 810, null, iGalaxy, false);
		Planete lKhomm = createPlanete("Khomm", 1100, 885, null, iGalaxy, false);
		Planete lConstancia = createPlanete("Constancia", 1080, 880, null, iGalaxy, false);
		Planete lKallist = createPlanete("Kallist", 1085, 865, null, iGalaxy, false);
		Planete lOjorn = createPlanete("Ojorn", 1160, 850, null, iGalaxy, false);
		Planete lKattada = createPlanete("Kattada", 1270, 750, null, iGalaxy, false);
		Planete lKuat = createPlanete("Kuat", 1252, 777, null, iGalaxy, false);
		Planete lBalmorra = createPlanete("Balmorra", 1265, 780, StarWarsContentDataBase.sBalmorraLegends, iGalaxy, false);
		Planete lVulpter = createPlanete("Vulpter", 1135, 775, null, iGalaxy, true);
		Planete lNZoth = createPlanete("N'Zoth", 1020, 785, null, iGalaxy, true);
		Planete lCalSeti = createPlanete("Cal-Seti", 1030, 770, null, iGalaxy, false);
		Planete lFedalle = createPlanete("Fedalle", 1195, 775, null, iGalaxy, false);
		Planete lAlderaan = createPlanete("Alderaan", 1199, 730, StarWarsContentDataBase.sAlderaanCommon, iGalaxy, true);
		Planete lIxtlar = createPlanete("Ixtlar", 1125, 730, null, iGalaxy, true);
		Planete lAargau = createPlanete("Aargau", 1130, 750, null, iGalaxy, true);
		Planete lSarapin = createPlanete("Sarapin", 1190, 805, null, iGalaxy, false);
		Planete lRendili = createPlanete("Rendili", 1220, 830, StarWarsContentDataBase.sRendiliLegends, iGalaxy, false);
		Planete lCorellia = createPlanete("Corellia", 1195, 860, StarWarsContentDataBase.sCorelliaLegends, iGalaxy, false);
		Planete lCatoNeimoidia = createPlanete("Cato Neimoidia", 1295, 830, null, iGalaxy, false);
		Planete lHumbarine = createPlanete("Humbarine", 1250, 805, null, iGalaxy, false);
		Planete lColomus = createPlanete("Colomus", 1205, 820, null, iGalaxy, false);
		Planete lBellassa = createPlanete("Bellassa", 1245, 845, null, iGalaxy, false);
		Planete lCommenor = createPlanete("Commenor", 1315, 800, null, iGalaxy, false);
		Planete lBotor = createPlanete("Botor", 1090, 895, null, iGalaxy, false);
		Planete lAbregado = createPlanete("Abregado-Rae", 1095, 910, null, iGalaxy, false);
		Planete lDentaal= createPlanete("Dentaal", 1095, 915, null, iGalaxy, true);
		Planete lBrentaal= createPlanete("Brentaal", 1145, 675, null, iGalaxy, true);
		Planete lSkako = createPlanete("Skako", 1149, 715, null, iGalaxy, true);
		Planete lAlsakan = createPlanete("Alsakan", 1115, 715, null, iGalaxy, true);
		Planete lCoruscant = createPlanete("Coruscant", 1100, 735, StarWarsContentDataBase.sCoruscantLegends, iGalaxy, true);
		Planete lNorkronia = createPlanete("Norkronia", 1075, 745, null, iGalaxy, true);
		Planete lAlland = createPlanete("Alland", 1045, 753, null, iGalaxy, false);
		Planete lCamaas = createPlanete("Caamas", 1175, 715, null, iGalaxy, true);
		Planete lTepasi = createPlanete("Tepasi", 1160, 700, null, iGalaxy, true);
		Planete lAnaxes = createPlanete("Anaxes", 1125, 695, StarWarsContentDataBase.sAnaxesLegends, iGalaxy, true);
		Planete lPanselemin = createPlanete("Panselemin", 1075, 670, null, iGalaxy, true);
		Planete lBalosar = createPlanete("Balosar", 1150, 885, null, iGalaxy, false);
		
		/* West */
		
		Planete lRakata = createPlanete("Rakata Prime", 650, 850, null, iGalaxy, false);
		Planete lZonama = createPlanete("Zonama Sekot", 600, 970, null, iGalaxy, false);
		Planete lLwhekk = createPlanete("Lwhekk", 435, 1155, null, iGalaxy, false);
		Planete lCsilla = createPlanete("Csilla", 605, 615, StarWarsContentDataBase.sCsillaLegends, iGalaxy, false);
		
		/* South - West */
		
		Planete lRattatak = createPlanete("Rattatak", 720, 1140, StarWarsContentDataBase.sRattatakLegends, iGalaxy, false);
		Planete lBunduki = createPlanete("Bunduki", 715, 1150, null, iGalaxy, false);
		Planete lZaddja = createPlanete("Zaddja", 715, 1070, null, iGalaxy, false);
		Planete lGannaria = createPlanete("Gannaria", 720, 1095, null, iGalaxy, false);
		Planete lCodia = createPlanete("Codia", 750, 1075, null, iGalaxy, false);
		Planete lBakura = createPlanete("Bakura", 660, 	1200, StarWarsContentDataBase.sBakuraLegends, iGalaxy, false);
		Planete lFirrerre = createPlanete("Firrerre", 730, 1180, null, iGalaxy, false);
		Planete lEndor = createPlanete("Endor", 750, 1210, StarWarsContentDataBase.sEndorLegends, iGalaxy, false);
		Planete lAnnaj = createPlanete("Annaj", 760, 1220, null, iGalaxy, false);
		Planete lDosuun = createPlanete("Dosuun", 765, 1540, null, iGalaxy, false);
		Planete lTrenwyth = createPlanete("Trenwyth", 805, 1225, null, iGalaxy, false);
		Planete lLipsec = createPlanete("Lipsec", 830, 1370, null, iGalaxy, false);
		Planete lVirgillia = createPlanete("Virgillia", 875, 1375, null, iGalaxy, false);
		Planete lSump = createPlanete("Sump", 920, 1400, null, iGalaxy, false);
		Planete lThakwaa = createPlanete("Thakwaa", 895, 1425, null, iGalaxy, false);
		Planete lBerrols = createPlanete("Berrol's Donn", 1035, 1420, null, iGalaxy, true);
		Planete lMampha = createPlanete("Manpha", 1040, 1480, null, iGalaxy, false);
		Planete lSaijo = createPlanete("Saijo", 1020, 1510, null, iGalaxy, false);
		Planete lMephout = createPlanete("Mephout", 720, 1520, null, iGalaxy, false);
		Planete lSeoul= createPlanete("Seoul", 705, 1530, null, iGalaxy, true);
		Planete lSkye = createPlanete("Skye", 775, 1470, null, iGalaxy, false);
		Planete lRyoone = createPlanete("Ryoone", 885, 1310, null, iGalaxy, false);
		Planete lChalcedon = createPlanete("Chalcedon", 920, 1155, null, iGalaxy, false);
		Planete lJiroch = createPlanete("Jiroch", 1040, 1293, null, iGalaxy, false);
		
		/* South */
		
		Planete lBelsavis = createPlanete("Belsavis", 1145, 1340, null, iGalaxy, true);
		Planete lJavin = createPlanete("Javin", 1040, 1330, null, iGalaxy, false);
		Planete lLorta = createPlanete("Lorta", 1010, 1290, null, iGalaxy, false);
		Planete lRiflor = createPlanete("Riflor", 930, 1220, null, iGalaxy, false);
		Planete lCerea = createPlanete("Cerea", 890, 1180, null, iGalaxy, false);
		Planete lGerrenthum = createPlanete("Gerrenthum", 1030, 1350, null, iGalaxy, false);
		Planete lNothoiin = createPlanete("Nothoiin", 1055, 1350, null, iGalaxy, true);
		Planete lMugaar = createPlanete("Mugaar", 1032, 1320, null, iGalaxy, false);
		Planete lLutrillia = createPlanete("Lutrillia", 995, 1352, null, iGalaxy, false);
		Planete lBespin = createPlanete("Bespin", 1020, 1360, StarWarsContentDataBase.sBespinCommon, iGalaxy, false);
		Planete lHoth = createPlanete("Hoth", 1025, 1370, StarWarsContentDataBase.sHothLegends, iGalaxy, true);
		Planete lIsde = createPlanete("Isde Naha", 1030, 1400, null, iGalaxy, false);
		Planete lYalara = createPlanete("Yalara", 910, 1570, null, iGalaxy, false);
		Planete lAnoth = createPlanete("Anoth", 960, 1540, null, iGalaxy, false);
		Planete lImynusoph = createPlanete("Imynusoph", 1005, 1565, null, iGalaxy, false);
		Planete lZonju = createPlanete("Zonju V", 990, 1580, null, iGalaxy, false);
		Planete lSubterrel= createPlanete("Subterrel", 1115, 1540, null, iGalaxy, false);
		Planete lMustafar = createPlanete("Mustafar", 1120, 1470, StarWarsContentDataBase.sMustafarCommon, iGalaxy, false);
		Planete lShumavar = createPlanete("Shumavar", 1180, 1425, null, iGalaxy, false);
		Planete lAtravis = createPlanete("Atravis", 1165, 1440, null, iGalaxy, false);
		Planete lPolis = createPlanete("Polis Massa", 1100, 1520, StarWarsContentDataBase.sPolisMassaCommon, iGalaxy, false);
		Planete lRutan = createPlanete("Rutan", 1115, 1485, null, iGalaxy, false);
		Planete lElrood = createPlanete("Elrood", 1225, 1480, null, iGalaxy, true);
		Planete lTibrin = createPlanete("Tibrin", 1180, 1330, null, iGalaxy, true);
		Planete lDolla = createPlanete("Dolla", 1140, 1360, null, iGalaxy, true);
		Planete lKelada = createPlanete("Kelada", 1195, 930, null, iGalaxy, false);
		Planete lDevaron = createPlanete("Devaron", 1200, 950, StarWarsContentDataBase.sDevaronLegends, iGalaxy, false);
		Planete lGhorman = createPlanete("Ghorman", 1120, 970, null, iGalaxy, true);
		Planete lKiffex = createPlanete("Kiffex", 1120, 990, null, iGalaxy, true);
		Planete lThyferra = createPlanete("Thyferra", 1150, 1010, null, iGalaxy, false);
		Planete lWroona = createPlanete("Wroona", 1175, 1060, null, iGalaxy, false);
		Planete lTregillis = createPlanete("Tregillis", 1200, 1087, null, iGalaxy, false);
		Planete lMechis = createPlanete("Mechis", 1172, 1020, null, iGalaxy, false);
		Planete lYagDhul= createPlanete("Yag'Dhul", 1160, 1040, null, iGalaxy, false);
		Planete lHarrin = createPlanete("Harrin", 1155, 1050, null, iGalaxy, false);
		Planete lTeyr = createPlanete("Teyr", 1145, 965, null, iGalaxy, false);
		Planete lFondor = createPlanete("Fondor", 1115, 950, null, iGalaxy, true);
		Planete lGiju = createPlanete("Giju", 1095, 935, null, iGalaxy, true);
		Planete lBestine = createPlanete("Bestine", 1190, 975, null, iGalaxy, false);
		Planete lKinyen = createPlanete("Kinyen", 1120, 1135, null, iGalaxy, false);
		Planete lPhu = createPlanete("Phu", 1015, 950, null, iGalaxy, true);
		Planete lPhard = createPlanete("Kitel Phard", 1000, 910, null, iGalaxy, false);
		Planete lWoostri = createPlanete("Woostri", 1230, 1155, null, iGalaxy, false);
		Planete lQat = createPlanete("Qat Chrystac", 1170, 1195, null, iGalaxy, false);
		Planete lVondarc = createPlanete("Vondarc", 1235, 1220, null, iGalaxy, false);
		Planete lCyphar = createPlanete("Cyphar", 1120, 1260, null, iGalaxy, false);
		Planete lEiattu = createPlanete("Eiattu", 1185, 1265, null, iGalaxy, false);
		Planete lOgem = createPlanete("Ogem", 1115, 1285, null, iGalaxy, false);
		Planete lPendari = createPlanete("Pendari", 1100, 1151, null, iGalaxy, true);
		Planete lCalonica = createPlanete("Calonica", 1065, 1195, null, iGalaxy, false);
		Planete lNoehaon = createPlanete("Noe'ha'on", 1035, 1155, null, iGalaxy, false);
		Planete lBomis = createPlanete("Bomis Koori", 1050, 1215, null, iGalaxy, false);
		Planete lKriselist = createPlanete("Kriselist", 1045, 1225, null, iGalaxy, true);
		Planete lKaal= createPlanete("Kaal", 1040, 1250, null, iGalaxy, true);
		Planete lKarfeddion = createPlanete("Karfeddion", 1145, 1330, null, iGalaxy, false);
		Planete lKinooine = createPlanete("Kinooine", 935, 1575, null, iGalaxy, false);
		Planete lDelrakkin = createPlanete("Delrakkin", 1055, 1565, null, iGalaxy, true);
		Planete lTerminus = createPlanete("Terminus", 1040, 1540, null, iGalaxy, false);
		Planete lKalShebbol= createPlanete("Kal'Shebbol", 1210, 1555, null, iGalaxy, false);
		Planete lKarideph = createPlanete("Karideph", 1210, 1520, null, iGalaxy, false);
		Planete lVestar = createPlanete("Vestar", 1330, 1525, null, iGalaxy, false);
		Planete lCotellier = createPlanete("Cotellier", 1340, 1505, null, iGalaxy, false);
		Planete lKirdo = createPlanete("Kirdo", 1337, 1440, null, iGalaxy, false);
		Planete lQueyta = createPlanete("Queyta", 1250, 1430, null, iGalaxy, true);
		Planete lUtapau = createPlanete("Utapau", 1280, 1470, null, iGalaxy, true);
		Planete lDagobah = createPlanete("Dagobah", 1235, 1445, StarWarsContentDataBase.sDagobahCommon, iGalaxy, true);
		Planete lSluis = createPlanete("Sluis Van", 1235, 1420, null, iGalaxy, false);
		Planete lXagobah = createPlanete("Xagobah", 1250, 1385, null, iGalaxy, false);
		Planete lClakdor = createPlanete("Clak'dor", 1229, 1390, null, iGalaxy, false);
		Planete lTriton = createPlanete("Triton", 1232, 1400, null, iGalaxy, false);
		Planete lEriadu = createPlanete("Eriadu", 1230, 1345, null, iGalaxy, false);
		Planete lSullust = createPlanete("Sullust", 1227, 1295, StarWarsContentDataBase.sSullustClassic, iGalaxy, false);
		
		/* South - East */
		
		Planete lRishi = createPlanete("Rishi", 1640, 1065, null, iGalaxy, false);
		Planete lUkio = createPlanete("Ukio", 1650, 1075, null, iGalaxy, false);
		Planete lMolavar = createPlanete("Molavar", 1650, 1100, null, iGalaxy, false);
		Planete lHypori = createPlanete("Hypori", 1645, 1180, null, iGalaxy, false);
		Planete lRoon = createPlanete("Roon", 1637, 1115, null, iGalaxy, false);
		Planete lKowak = createPlanete("Kowak", 1715, 1130, null, iGalaxy, false);
		Planete lFalleen = createPlanete("Falleen", 1510, 1100, null, iGalaxy, false);
		Planete lRodia = createPlanete("Rodia", 1585, 1210, StarWarsContentDataBase.sRodiaLegends, iGalaxy, false);
		Planete lZolan = createPlanete("Zolan", 1500, 1150, null, iGalaxy, true);
		Planete lRintonne = createPlanete("Rintonne", 1487, 1165, null, iGalaxy, true);
		Planete lOmwat = createPlanete("Omwat", 1320, 1330, null, iGalaxy, false);
		Planete lShadda = createPlanete("Shadda-Bi-Boran", 1400, 1330, null, iGalaxy, false);
		Planete lArbra = createPlanete("Arbra", 1360, 1300, null, iGalaxy, false);
		Planete lDarknell= createPlanete("Darkknell", 1250, 1267, null, iGalaxy, false);
		Planete lSanrafnix = createPlanete("Sanrafnix", 1320, 1260, null, iGalaxy, false);
		Planete lSoccoro = createPlanete("Soccoro", 1535, 1300, null, iGalaxy, false);
		Planete lRyloth = createPlanete("Ryloth", 1620, 1300, StarWarsContentDataBase.sRylothLegends, iGalaxy, false);
		Planete lTatooine = createPlanete("Tatooine", 1605, 1235, StarWarsContentDataBase.sTatooineLegends, iGalaxy, false);
		Planete lIskalon = createPlanete("Iskalon", 1610, 1160, null, iGalaxy, false);
		Planete lLashbane = createPlanete("Lashbane", 1605, 1095, null, iGalaxy, false);
		Planete lBlenjeel= createPlanete("Blenjeel", 1570, 1110, null, iGalaxy, false);
		Planete lAndo = createPlanete("Ando", 1535, 1120, null, iGalaxy, false);
		Planete lPardron = createPlanete("Ord Pardron", 1615, 1120, null, iGalaxy, true);
		Planete lGeonosis = createPlanete("Geonosis", 1610, 1240, StarWarsContentDataBase.sGeonosisLegends, iGalaxy, true);
		Planete lSiskeen = createPlanete("Siskeen", 1635, 1240, null, iGalaxy, false);
		Planete lOrvax = createPlanete("Orvax", 1585, 1270, null, iGalaxy, false);
		Planete lLok = createPlanete("Lok", 1550, 1250, null, iGalaxy, true);
		Planete lNaboo = createPlanete("Naboo", 1400, 1240, StarWarsContentDataBase.sNabooLegends, iGalaxy, false);
		Planete lSeltos = createPlanete("Seltos", 1375, 1110, null, iGalaxy, false);
		Planete lRopagi = createPlanete("Ropagi", 1375, 1075, null, iGalaxy, false);
		Planete lRoldana = createPlanete("Roldana", 1385, 1080, null, iGalaxy, true);
		Planete lDruckenwell= createPlanete("Druckenwell", 1490, 1085, null, iGalaxy, false);
		Planete lLeritor = createPlanete("Leritor", 1560, 1080, null, iGalaxy, false);
		Planete lRothana = createPlanete("Rothana", 1750, 1095, null, iGalaxy, false);
		Planete lPzob = createPlanete("Pzob", 1760, 1115, null, iGalaxy, false);
		Planete lExcarga = createPlanete("Excarga", 1745, 1185, null, iGalaxy, false);
		Planete lMalastare = createPlanete("Malastare", 1310, 1220, StarWarsContentDataBase.sMalastareLegends, iGalaxy, true);
		Planete lChristophsis = createPlanete("Christophsis", 1570, 1225, StarWarsContentDataBase.sChristophsisClassic, iGalaxy, false);
		Planete lLlanic = createPlanete("Llanic", 1535, 1232, null, iGalaxy, false);
		Planete lZhar = createPlanete("Zhar", 1515, 1250, null, iGalaxy, false);
		Planete lNelvaan = createPlanete("Nelvaan", 1570, 1240, StarWarsContentDataBase.sNelvaanLegends, iGalaxy, true);
		Planete lZeheth = createPlanete("Zeheth", 1315, 1205, null, iGalaxy, false);
		Planete lKerkoidia = createPlanete("Kerkoidia", 1355, 1135, null, iGalaxy, false);
		Planete lKira = createPlanete("Kira", 1325, 1140, null, iGalaxy, false);
		Planete lPax = createPlanete("Pax", 1317, 1155, null, iGalaxy, false);
		Planete lUmgal= createPlanete("Umgal", 1375, 1210, null, iGalaxy, false);
		Planete lKalinda = createPlanete("Kalinda", 1390, 1145, null, iGalaxy, false);
		Planete lGazza = createPlanete("Mon Gazza", 1530, 1140, null, iGalaxy, false);
		Planete lHerdessa = createPlanete("Herdessa", 1550, 1170, null, iGalaxy, false);
		Planete lRadnor = createPlanete("Radnor", 1560, 1195, null, iGalaxy, false);
		Planete lFarstine = createPlanete("Farstine", 1460, 1245, null, iGalaxy, false);
		Planete lEnarc = createPlanete("Enarc", 1410, 1245, null, iGalaxy, true);
		Planete lTrigalis = createPlanete("Trigalis", 1460, 1270, null, iGalaxy, false);
		Planete lSevarcos = createPlanete("Sevarcos", 1315, 1420, null, iGalaxy, false);
		Planete lKabal= createPlanete("Kabal", 1320, 1360, null, iGalaxy, false);
		Planete lVohai = createPlanete("Vohai", 1410, 1360, null, iGalaxy, true);
		Planete lRugosa = createPlanete("Rugosa", 1410, 1300, null, iGalaxy, false);
		Planete lReuss = createPlanete("Reuss", 1500, 1365, null, iGalaxy, false);
		Planete lMaryx = createPlanete("Maryx Minor", 1415, 1450, null, iGalaxy, true);
		Planete lSkynara = createPlanete("Skynara", 1510, 1430, null, iGalaxy, false);
		Planete lKarazak = createPlanete("Karazak", 1500, 1450, null, iGalaxy, false);
		Planete lDrexel= createPlanete("Drexel", 1535, 1365, null, iGalaxy, false);
		Planete lVergesso = createPlanete("Vergesso", 1485, 1327, null, iGalaxy, false);
		Planete lSuarbi = createPlanete("Suarbi", 1415, 1420, null, iGalaxy, false);
		Planete lSvivren = createPlanete("Svivren", 1405, 1443, null, iGalaxy, false);
		Planete lSpice = createPlanete("Spice Terminus", 1487, 1400, null, iGalaxy, false);
		Planete lBradden = createPlanete("Dom-Bradden", 1550, 1345, null, iGalaxy, false);
		Planete lSharlissia = createPlanete("Sharlissia", 1363, 1340, null, iGalaxy, true);
		Planete lShimia = createPlanete("Shimia", 1610, 1270, null, iGalaxy, true);
		Planete lRhommamool= createPlanete("Rhommamool", 1355, 940, null, iGalaxy, false);
		Planete lDerra = createPlanete("Derra", 1245, 1065, null, iGalaxy, false);
		Planete lMhaeli = createPlanete("M'haeli", 1255, 1125, null, iGalaxy, false);
		Planete lNkllon = createPlanete("Nkllon", 1160, 1150, null, iGalaxy, false);
		Planete lVandelhelm = createPlanete("Vandelhelm", 1225, 1133, null, iGalaxy, false);
		Planete lHaruun = createPlanete("Haruun Kal", 1250, 1240, null, iGalaxy, false);
		Planete lIndupar = createPlanete("Indupar", 1230, 1250, null, iGalaxy, false);
		Planete lAlzoc = createPlanete("Alzoc", 1490, 1440, null, iGalaxy, false);
		Planete lAndara = createPlanete("Andara", 1175, 910, null, iGalaxy, false);
		Planete lNaos = createPlanete("Naos", 1695, 1330, null, iGalaxy, false);
		Planete lWrea = createPlanete("Wrea", 1655, 1315, null, iGalaxy, false);
		Planete lVelabri = createPlanete("Velabri", 1657, 1358, null, iGalaxy, false);
		
		/* East */
		
		Planete lAkriktar = createPlanete("Akrik'tar", 1770, 660, null, iGalaxy, false);
		Planete lKubindi = createPlanete("Kubindi", 1765, 700, null, iGalaxy, false);
		Planete lDelacrix = createPlanete("Delacrix", 1760, 645, null, iGalaxy, false);
		Planete lBoz = createPlanete("Boz Pity", 1635, 675, StarWarsContentDataBase.sBozPityLegends, iGalaxy, false);
		Planete lAduba = createPlanete("Aduba", 1810, 815, null, iGalaxy, false);
		Planete lNarHaaska = createPlanete("Nar Haaska", 1780, 830, null, iGalaxy, false);
		Planete lKessel= createPlanete("Kessel", 1755, 740, StarWarsContentDataBase.sKesselLegends, iGalaxy, false);
		Planete lFormos = createPlanete("Formos", 1795, 740, null, iGalaxy, false);
		Planete lHonoghr = createPlanete("Honoghr", 1765, 750, null, iGalaxy, true);
		Planete lSleheyron = createPlanete("Sleheyron", 1705, 745, null, iGalaxy, false);
		Planete lSaki = createPlanete("Saki", 1705, 820, null, iGalaxy, false);
		Planete lVarl= createPlanete("Varl", 1705, 840, null, iGalaxy, false);
		Planete lToydaria = createPlanete("Toydaria", 1600, 855, null, iGalaxy, false);
		Planete lYlesia = createPlanete("Ylesia", 1745, 870, null, iGalaxy, false);
		Planete lTeth = createPlanete("Teth", 1795, 870, StarWarsContentDataBase.sTethClassic, iGalaxy, false);
		Planete lNarShaddaa = createPlanete("Nar Shaddaa", 1630, 870, StarWarsContentDataBase.sNarShaddaaLegends, iGalaxy, false);
		Planete lRorak = createPlanete("Rorak", 1655, 880, null, iGalaxy, true);
		Planete lKlatooine = createPlanete("Klatooine", 1700, 630, null, iGalaxy, false);
		Planete lVaathkree = createPlanete("Vaathkree", 1707, 620, null, iGalaxy, false);
		Planete lCyborrea = createPlanete("Cyborrea", 1665, 705, null, iGalaxy, false);
		Planete lNimban = createPlanete("Nimban", 1650, 755, null, iGalaxy, false);
		Planete lTaanab = createPlanete("Taanab", 1395, 630, null, iGalaxy, true);
		Planete lTirahnn = createPlanete("Tirahnn", 1325, 625, null, iGalaxy, true);
		Planete lChazwa = createPlanete("Chazwa", 1290, 633, null, iGalaxy, false);
		Planete lKtil= createPlanete("Ktil", 1363, 645, null, iGalaxy, false);
		Planete lColla = createPlanete("Colla", 1305, 640, null, iGalaxy, true);
		Planete lHok = createPlanete("Hok", 1246, 675, null, iGalaxy, true);
		Planete lGizer = createPlanete("Gizer", 1460, 625, null, iGalaxy, true);
		Planete lLantillies = createPlanete("Lantillies", 1486, 621, null, iGalaxy, true);
		Planete lHapes = createPlanete("Hapes", 1395, 675, StarWarsContentDataBase.sHapesLegends, iGalaxy, false);
		Planete lNazzri = createPlanete("Nazzri", 1480, 658, null, iGalaxy, false);
		Planete lVena = createPlanete("Vena", 1455, 738, null, iGalaxy, true);
		Planete lUmbara = createPlanete("Umbara", 1455, 673, null, iGalaxy, false);
		Planete lTogoria = createPlanete("Togoria", 1510, 656, null, iGalaxy, true);
		Planete lBimmisaari = createPlanete("Bimmisaari", 1610, 645, null, iGalaxy, false);
		Planete lCharros = createPlanete("Charros", 1573, 656, null, iGalaxy, false);
		Planete lBalamak = createPlanete("Balamak", 1547, 690, null, iGalaxy, false);
		Planete lKashyyyk = createPlanete("Kashyyyk", 1500, 705, StarWarsContentDataBase.sKashyyykLegends, iGalaxy, false);
		Planete lSneeve = createPlanete("Sneeve", 1548, 725, null, iGalaxy, false);
		Planete lAmbria = createPlanete("Ambria", 1400, 735, StarWarsContentDataBase.sAmbriaLegends, iGalaxy, true);
		Planete lTelti = createPlanete("Telti", 1363, 730, null, iGalaxy, false);
		Planete lOnderon = createPlanete("Onderon", 1420, 692, StarWarsContentDataBase.sOnderonLegends, iGalaxy, false);
		Planete lRandon = createPlanete("Randon", 1535, 745, null, iGalaxy, false);
		Planete lApsolon = createPlanete("New Apsolon", 1500, 750, null, iGalaxy, false);
		Planete lChalacta = createPlanete("Chalacta", 1590, 735, null, iGalaxy, false);
		Planete lKwenn = createPlanete("Kwenn", 1585, 786, null, iGalaxy, false);
		Planete lCelegia = createPlanete("Celegia", 1427, 786, null, iGalaxy, false);
		Planete lZeltros = createPlanete("Zeltros", 1392, 776, StarWarsContentDataBase.sZeltrosLegends, iGalaxy, false);
		Planete lBelasco = createPlanete("Belasco", 1430, 830, null, iGalaxy, false);
		Planete lMimban = createPlanete("Mimban", 1422, 862, null, iGalaxy, false);
		Planete lDeysum = createPlanete("Deysum", 1536, 770, null, iGalaxy, true);
		Planete lUbrikkia = createPlanete("Ubrikkia", 1567, 772, null, iGalaxy, false);
		Planete lUogocor = createPlanete("Uogo'cor", 1541, 800, null, iGalaxy, true);
		Planete lRuusan = createPlanete("Ruusan", 1515, 810, StarWarsContentDataBase.sRuusanLegends, iGalaxy, true);
		Planete lNarkaaga = createPlanete("Nar Kaaga", 1630, 920, null, iGalaxy, false);
		Planete lLannik = createPlanete("Lannik", 1575, 930, null, iGalaxy, false);
		Planete lGamorr = createPlanete("Gamorr", 1745, 1000, StarWarsContentDataBase.sGamorrCommon, iGalaxy, false);
		Planete lBothawui = createPlanete("Bothawui", 1580, 1000, null, iGalaxy, false);
		Planete lKothlis = createPlanete("Kothlis", 1585, 1020, null, iGalaxy, false);
		Planete lManda = createPlanete("Manda", 1626, 1040, null, iGalaxy, false);
		Planete lMoonus = createPlanete("Moonus Mandel", 1580, 980, null, iGalaxy, false);
		Planete lShola = createPlanete("Shola", 1795, 985, null, iGalaxy, false);
		Planete lTammuz = createPlanete("Tammuz-an", 1755, 1010, null, iGalaxy, false);
		Planete lDaluuj = createPlanete("Daluuj", 1805, 910, null, iGalaxy, false);
		Planete lBarab = createPlanete("Barab", 1790, 900, null, iGalaxy, false);
		Planete lDubrava = createPlanete("Dubrava", 1785, 925, null, iGalaxy, true);
		Planete lSyvris = createPlanete("Syvris", 1750, 945, null, iGalaxy, false);
		Planete lDressel= createPlanete("Dressel", 1560, 960, null, iGalaxy, false);
		Planete lManaan = createPlanete("Manaan", 1371, 830, StarWarsContentDataBase.sManaanLegends, iGalaxy, false);
		Planete lCona = createPlanete("Cona", 1380, 815, null, iGalaxy, false);
		Planete lSpirana = createPlanete("Spirana", 1330, 930, null, iGalaxy, false);
		Planete lTynna = createPlanete("Tynna", 1355, 970, null, iGalaxy, false);
		Planete lArami = createPlanete("Arami", 1745, 965, null, iGalaxy, false);
		Planete lMilagro = createPlanete("Milagro", 1410, 1010, null, iGalaxy, false);
		Planete lCularin = createPlanete("Cularin", 1450, 1010, null, iGalaxy, false);
		Planete lBacrana = createPlanete("Bacrana", 1420, 1023, null, iGalaxy, false);
		Planete lVendaxa = createPlanete("Vendaxa", 1387, 1015, null, iGalaxy, true);
		Planete lCov = createPlanete("New Cov", 1450, 1040, null, iGalaxy, false);
		Planete lKalarba = createPlanete("Kalarba", 1452, 1065, null, iGalaxy, true);
		Planete lPaqwepor = createPlanete("Paqwepor", 1487, 1100, null, iGalaxy, true);
		Planete lDarguilli = createPlanete("Darguilli", 1245, 1007, null, iGalaxy, false);
		Planete lAtzerri = createPlanete("Atzerri", 1237, 970, null, iGalaxy, false);
		Planete lKooriva = createPlanete("Kooriva", 1225, 990, null, iGalaxy, false);
		Planete lChardaan = createPlanete("Chardaan", 1320, 973, null, iGalaxy, true);
		Planete lShibric = createPlanete("Shibric", 1325, 1005, null, iGalaxy, true);
		Planete lBaroli = createPlanete("Baroli", 1329, 1025, null, iGalaxy, true);
		Planete lGacerian = createPlanete("Gacerian", 1322, 1055, null, iGalaxy, true);
		Planete lRagith = createPlanete("Ragith", 1320, 1075, null, iGalaxy, true);
		Planete lMajoor = createPlanete("Majoor", 1318, 1085, null, iGalaxy, true);
		Planete lNexus = createPlanete("Nexus Ortai", 1540, 1010, null, iGalaxy, false);
		Planete lMonastery = createPlanete("Monastery", 1530, 1035, null, iGalaxy, true);
		Planete lLorhans = createPlanete("Lorhans", 1495, 985, null, iGalaxy, false);
		Planete lAridus = createPlanete("Aridus", 1415, 985, null, iGalaxy, false);
		Planete lAllanteen = createPlanete("Allanteen", 1387, 970, null, iGalaxy, true);
		Planete lIktotch = createPlanete("Iktotch", 1405, 965, null, iGalaxy, false);
		Planete lDenon = createPlanete("Denon", 1280, 910, null, iGalaxy, false);
		Planete lIseno = createPlanete("Iseno", 1275, 905, null, iGalaxy, true);
		Planete lQuellor = createPlanete("Quellor", 1305, 870, null, iGalaxy, false);
		Planete lExodeen = createPlanete("Exodeen", 1250, 870, null, iGalaxy, false);
		Planete lTinnel= createPlanete("Tinnel", 1225, 870, null, iGalaxy, false);
		Planete lAntar = createPlanete("Antar", 1350, 870, null, iGalaxy, false);
		Planete lNanthri = createPlanete("Nanth'ri", 1540, 870, null, iGalaxy, false);
		Planete lNixor = createPlanete("Nixor", 1540, 890, null, iGalaxy, false);
		Planete lAilon = createPlanete("Ailon", 1340, 890, null, iGalaxy, false);
		Planete lCyrillia = createPlanete("Cyrillia", 1415, 905, null, iGalaxy, false);
		Planete lAttahox = createPlanete("Attahox", 1500, 875, null, iGalaxy, true);
		Planete lGyndine = createPlanete("Gyndine", 1395, 875, null, iGalaxy, false);
		Planete lDaalang = createPlanete("Daalang", 1560, 905, null, iGalaxy, false);
		Planete lHollastin = createPlanete("Hollastin", 1680, 905, null, iGalaxy, false);
		Planete lCircumtore = createPlanete("Circumtore", 1630, 890, null, iGalaxy, true);
		Planete lRiileb = createPlanete("Riileb", 1735, 890, null, iGalaxy, false);
		Planete lByblos = createPlanete("Byblos", 1235, 902, null, iGalaxy, true);
		Planete llLoronar = createPlanete("Loronar", 1230, 892, null, iGalaxy, false);

		/* North - East */
		
		Planete lRuuria = createPlanete("Ruuria", 1565, 290, null, iGalaxy, false);
		Planete lTissSharl= createPlanete("Tiss'Sharl", 1585, 295, null, iGalaxy, true);
		Planete lListehol= createPlanete("Listehol", 1540, 300, null, iGalaxy, false);
		Planete lMirial= createPlanete("Mirial", 1545, 323, null, iGalaxy, true);
		Planete lTrian = createPlanete("Trian", 1620, 270, null, iGalaxy, false);
		Planete lCadomai = createPlanete("Cadomai", 1610, 285, null, iGalaxy, false);
		Planete lBonadan = createPlanete("Bonadan", 1675, 290, null, iGalaxy, false);
		Planete lFarana = createPlanete("Farana", 1680, 272, null, iGalaxy, false);
		Planete lMytus = createPlanete("Mytus", 1655, 230, null, iGalaxy, false);
		Planete lKamar = createPlanete("Kamar", 1690, 305, null, iGalaxy, false);
		Planete lAmmuud = createPlanete("Ammuud", 1675, 320, null, iGalaxy, false);
		Planete lQuermia = createPlanete("Quermia", 1685, 405, null, iGalaxy, false);
		Planete lToola = createPlanete("Toola", 1710, 410, null, iGalaxy, true);
		Planete lMakem = createPlanete("Makem Te", 1675, 425, null, iGalaxy, false);
		Planete lFlorn = createPlanete("Florn", 1745, 430, null, iGalaxy, false);
		Planete lTroiken = createPlanete("Troiken", 1687, 380, null, iGalaxy, false);
		Planete lRaxus = createPlanete("Raxus", 1690, 450, StarWarsContentDataBase.sRaxusPrimeLegends, iGalaxy, false);
		Planete lDesevro = createPlanete("Desevro", 1647, 455, null, iGalaxy, false);
		Planete lJaminere = createPlanete("Jaminere", 1685, 467, null, iGalaxy, false);
		Planete lCadinth = createPlanete("Cadinth", 1655, 475, null, iGalaxy, false);
		Planete lDellalt = createPlanete("Dellalt", 1751, 505, null, iGalaxy, true);
		Planete lAlmania = createPlanete("Almania", 1647, 400, null, iGalaxy, false);
		Planete lDrongar = createPlanete("Drongar", 1780, 435, null, iGalaxy, false);
		Planete lSembla = createPlanete("Sembla", 1645, 432, null, iGalaxy, false);
		Planete lElom = createPlanete("Elom", 1592, 440, null, iGalaxy, false);
		Planete lStenos = createPlanete("Stenos", 1585, 450, null, iGalaxy, false);
		Planete lArda = createPlanete("Arda", 1547, 460, null, iGalaxy, false);
		Planete lPakuuni = createPlanete("Pakuuni", 1765, 455, null, iGalaxy, false);
		Planete lMunto = createPlanete("Munto Codru", 1790, 465, null, iGalaxy, false);
		Planete lTelos = createPlanete("Telos", 1525, 320, null, iGalaxy, false);
		Planete lThila = createPlanete("Thila", 1530, 360, null, iGalaxy, false);
		Planete lZiost = createPlanete("Ziost", 1575, 370, StarWarsContentDataBase.sZiostLegends, iGalaxy, false);
		Planete lKorriban = createPlanete("Korriban", 1575, 400, StarWarsContentDataBase.sKorribanLegends, iGalaxy, false);
		Planete lYavin = createPlanete("Yavin", 1500, 450, null, iGalaxy, false);
		Planete lThalassia = createPlanete("Thalassia", 1475, 360, null, iGalaxy, false);
		Planete lLianna = createPlanete("Lianna", 1637, 472, null, iGalaxy, true);
		Planete lMurkhana = createPlanete("Murkhana", 1650, 500, null, iGalaxy, true);
		Planete lCalamari = createPlanete("Mon Calamari", 1795, 500, StarWarsContentDataBase.sMonCalamariLegends, iGalaxy, false);
		Planete lCaluula = createPlanete("Caluula", 1745, 500, null, iGalaxy, false);
		Planete lHandooine = createPlanete("Handooine", 1650, 550, null, iGalaxy, true);
		Planete lIego = createPlanete("Iego", 1750, 550, StarWarsContentDataBase.sIegoLegends, iGalaxy, false);
		Planete lBaros = createPlanete("Baros", 1810, 550, null, iGalaxy, false);
		Planete lToongl= createPlanete("Toong'l", 1780, 565, null, iGalaxy, false);
		Planete lJabiim = createPlanete("Jabiim", 1700, 565, StarWarsContentDataBase.sJabiimLegends, iGalaxy, false);
		Planete lTaskeed = createPlanete("Taskeed", 1705, 575, null, iGalaxy, false);
		Planete lDennogra = createPlanete("Dennogra", 1712, 585, null, iGalaxy, false);
		Planete lTargonn = createPlanete("Targonn", 1810, 575, null, iGalaxy, false);
		Planete lGand = createPlanete("Gand", 1770, 595, null, iGalaxy, false);
		Planete lMalagarr = createPlanete("Malagarr", 1835, 595, null, iGalaxy, false);
		Planete lTund = createPlanete("Tund", 1808, 605, null, iGalaxy, false);
		Planete lOseon = createPlanete("Oseon", 1765, 605, null, iGalaxy, false);
		Planete lRenatasia = createPlanete("Renatasia", 1785, 615, null, iGalaxy, false);
		Planete lZygeria = createPlanete("Zygeria", 1642, 350, null, iGalaxy, false);
		Planete lVaynai = createPlanete("Vaynai", 1680, 360, null, iGalaxy, false);
		Planete lFelucia = createPlanete("Felucia", 1617, 470, StarWarsContentDataBase.sFeluciaLegends, iGalaxy, false);
		Planete lGalidraan = createPlanete("Galidraan", 1613, 478, null, iGalaxy, false);
		Planete lRhenVar = createPlanete("Rhen Var", 1603, 485, StarWarsContentDataBase.sRhenVarLegends, iGalaxy, false);
		Planete lColumex = createPlanete("Columex", 1613, 500, null, iGalaxy, false);
//		Planete llKorus = createPlanete("Trogan", 1603, 515, null, iGalaxy, true);
		Planete lNam = createPlanete("Nam", 1586, 512, null, iGalaxy, false);
		Planete lVjun = createPlanete("Vjun", 1540, 507, StarWarsContentDataBase.sVjunLegends, iGalaxy, true);
		Planete lLucazec = createPlanete("Lucazec", 1547, 500, null, iGalaxy, false);
		Planete lMaridun = createPlanete("Maridun", 1521, 483, null, iGalaxy, false);
		Planete lSaleucami = createPlanete("Saleucami", 1645, 600, StarWarsContentDataBase.sSaleucamiLegends, iGalaxy, false);
		Planete lOssus = createPlanete("Ossus", 1635, 505, StarWarsContentDataBase.sOssusLegends, iGalaxy, false);
		Planete lAnzat = createPlanete("Anzat", 1610, 575, StarWarsContentDataBase.sAnzatLegends, iGalaxy, false);
		Planete lRadama = createPlanete("Ord Radama", 1520, 400, null, iGalaxy, false);
		Planete lAnteevy = createPlanete("Anteevy", 1500, 528, null, iGalaxy, false);
		Planete lJomark = createPlanete("Jomark", 1613, 527, null, iGalaxy, false);
		Planete lCentares = createPlanete("Centares", 1585, 528, null, iGalaxy, false);
		Planete lLaRoue = createPlanete("La Roue", 1577, 539, null, iGalaxy, false);
		Planete lGromas = createPlanete("Gromas", 1540, 525, null, iGalaxy, true);
		Planete lAbhean = createPlanete("Abhean", 1559, 550, null, iGalaxy, true);
		Planete lGaros = createPlanete("Garos", 1495, 550, null, iGalaxy, false);
		Planete lVelmor = createPlanete("Velmor", 1507, 575, null, iGalaxy, false);
		Planete lMyrth = createPlanete("Sy Myrth", 1635, 539, null, iGalaxy, false);
		Planete lMetalorn = createPlanete("Metalorn", 1573, 587, null, iGalaxy, true);
		Planete lRoche = createPlanete("Roche", 1535, 610, null, iGalaxy, false);
		Planete lSarka = createPlanete("Sarka", 1565, 611, null, iGalaxy, true);
		Planete lUltaar = createPlanete("Ultaar", 1595, 611, null, iGalaxy, true);
		Planete lBoonta = createPlanete("Boonta", 1660, 614, null, iGalaxy, false);
		
		/* North */
		
		Planete lDromundKass = createPlanete("Dromund Kaas", 1611, 375, StarWarsContentDataBase.sDromundKaasLegends, iGalaxy, true);
		Planete lBotajef = createPlanete("Botajef", 1405, 485, null, iGalaxy, true);
		Planete lDantooine = createPlanete("Dantooine", 1100, 330, StarWarsContentDataBase.sDantooineCommon, iGalaxy, false);
		Planete lAgamar= createPlanete("Agamar", 1220, 425, null, iGalaxy, false);
		Planete lCanfre = createPlanete("Ord Canfre", 1085, 425, null, iGalaxy, false);
		Planete lDestrillion = createPlanete("Destrillion", 1080, 280, null, iGalaxy, true);
		Planete lDubrillion = createPlanete("Dubrillion", 1075, 275, null, iGalaxy, false);
		Planete lBastion = createPlanete("Bastion", 1038, 260, StarWarsContentDataBase.sBastionLegends, iGalaxy, false);
		Planete lPlooma = createPlanete("Plooma", 1135, 260, null, iGalaxy, false);
		Planete lBirgis = createPlanete("Birgis", 1240, 265, null, iGalaxy, false);
		Planete lSerpidal= createPlanete("Sernpidal", 1160, 215, null, iGalaxy, false);
		Planete lHelska = createPlanete("Helska", 1130, 185, null, iGalaxy, false);
		Planete lGree = createPlanete("Gree", 1105, 200, null, iGalaxy, false);
		Planete lBelkadan = createPlanete("Belkadan", 1135, 125, null, iGalaxy, false);
		Planete lVentooine = createPlanete("Ventooine", 1500, 280, null, iGalaxy, false);
		Planete lBimmiel= createPlanete("Bimmiel", 1285, 330, null, iGalaxy, false);
		Planete lArgazda = createPlanete("Argazda", 1302, 375, null, iGalaxy, false);
		Planete lLorrd = createPlanete("Lorrd", 1355, 350, null, iGalaxy, false);
		Planete lGravlex = createPlanete("Gravlex Med", 1160, 330, null, iGalaxy, false);
		Planete lTangrene = createPlanete("Tangrene", 1410, 380, null, iGalaxy, false);
		Planete lEdusa = createPlanete("Edusa", 1425, 400, null, iGalaxy, false);
		Planete lAkuria = createPlanete("Akuria", 1216, 393, null, iGalaxy, false);
		Planete lPheach = createPlanete("Pho Ph'eah", 1485, 407, null, iGalaxy, false);
		Planete lSerenno = createPlanete("Serenno", 1460, 422, StarWarsContentDataBase.sSerennoClassic, iGalaxy, false);
		Planete lToprawa = createPlanete("Toprawa", 1458, 432, null, iGalaxy, false);
		Planete lVandyne = createPlanete("Vandyne", 1410, 430, null, iGalaxy, false);
		Planete lClutric = createPlanete("Clutric", 1305, 410, null, iGalaxy, false);
		Planete lShaum = createPlanete("Shaum Hii", 1280, 420, null, iGalaxy, false);
		Planete lAxxila = createPlanete("Axxila", 1380, 443, null, iGalaxy, false);
		Planete lVinsoth = createPlanete("Vinsoth", 1355, 450, null, iGalaxy, false);
		Planete lJunction = createPlanete("Junction", 1430, 450, null, iGalaxy, false);
		Planete lNezPeron = createPlanete("Nez Peron", 1404, 443, null, iGalaxy, false);
		Planete lCelanon = createPlanete("Celanon", 1425, 460, null, iGalaxy, true);
		Planete lCestus = createPlanete("Ord Cestus", 1393, 455, null, iGalaxy, true);
		Planete lDathomir = createPlanete("Dathomir", 1380, 480, StarWarsContentDataBase.sDathomirLegends, iGalaxy, true);
		Planete lMalta= createPlanete("Malta Obex", 1405, 290, null, iGalaxy, false);
		Planete lJazbina = createPlanete("Jazbina", 1225, 580, null, iGalaxy, false);
		Planete lShili = createPlanete("Shili", 1165, 585, null, iGalaxy, false);
		Planete lIthor = createPlanete("Ithor", 1185, 500, null, iGalaxy, false);
		Planete lUrce = createPlanete("Urce", 1160, 510, null, iGalaxy, false);
		Planete lKeitum = createPlanete("Keitum", 980, 500, null, iGalaxy, false);
		Planete lGlee = createPlanete("Glee Anselm", 965, 550, null, iGalaxy, false);
		Planete lCorsin = createPlanete("Corsin", 1240, 555, null, iGalaxy, false);
		Planete lMantell= createPlanete("Ord Mantell", 1095, 540, StarWarsContentDataBase.sOrdMantellLegends, iGalaxy, false);
		Planete lYinchorr = createPlanete("Yinchorr", 1130, 585, null, iGalaxy, false);
		Planete lDatar = createPlanete("Datar", 1145, 600, null, iGalaxy, false);
		Planete lBilbringi = createPlanete("Bilbringi", 1015, 590, null, iGalaxy, false);
		Planete lCarida = createPlanete("Carida", 1225, 660, StarWarsContentDataBase.sCaridaLegends, iGalaxy, true);
		Planete lBelnar = createPlanete("Belnar", 1202, 655, null, iGalaxy, true);
		Planete lYabol= createPlanete("YabolOpa", 1175, 648, null, iGalaxy, true);
		Planete lCastell= createPlanete("Castell", 1225, 644, null, iGalaxy, true);
		Planete lVurdon = createPlanete("Vurdon Ka", 1246, 640, null, iGalaxy, false);
		Planete lArkania = createPlanete("Arkania", 1175, 630, null, iGalaxy, true);
		Planete lBorleias = createPlanete("Borleias", 1070, 655, null, iGalaxy, true);
		Planete lMriist = createPlanete("Mriist", 1060, 645, null, iGalaxy, false);
		Planete lPalianhi = createPlanete("Palianhi", 1045, 625, null, iGalaxy, false);
		Planete lVakkar = createPlanete("Vakkar", 1020, 630, null, iGalaxy, false);
		Planete lReecee = createPlanete("Reecee", 995, 620, null, iGalaxy, false);
		Planete lValc = createPlanete("Valc", 975, 375, null, iGalaxy, false);
		Planete lEntralla = createPlanete("Entralla", 1035, 363, null, iGalaxy, false);
		Planete lMuunilist = createPlanete("Muunilist", 1040, 340, StarWarsContentDataBase.sMuunilinstLegends, iGalaxy, false);
		Planete lTrasi = createPlanete("Ord Trasi", 1100, 375, null, iGalaxy, false);
		Planete lMygeeto = createPlanete("Mygeeto", 1055, 383, null, iGalaxy, false);
		Planete lCantrell= createPlanete("Ord Cantrell", 1085, 465, null, iGalaxy, false);
		Planete lBorgo = createPlanete("Borgo Prime", 1235, 465, null, iGalaxy, false);
		Planete lErKit = createPlanete("Er'Kit", 1236, 493, null, iGalaxy, true);
		Planete lGwenee = createPlanete("G'wenee", 1300, 492, null, iGalaxy, false);
		Planete lHalmad = createPlanete("Halmad", 1360, 491, null, iGalaxy, false);
		Planete lPhaeda = createPlanete("Phaeda", 1155, 470, null, iGalaxy, false);
		Planete lKetaris = createPlanete("Ketaris", 1180, 435, null, iGalaxy, false);
		Planete lGeneris = createPlanete("Generis", 1170, 410, null, iGalaxy, false);
		Planete lGarqi = createPlanete("Garqi", 1065, 410, null, iGalaxy, false);
		Planete lFornax = createPlanete("Fornax", 1030, 535, null, iGalaxy, false);
		Planete lVortex = createPlanete("Vortex", 1040, 565, null, iGalaxy, false);
		Planete lViscondor = createPlanete("Vicondor", 1015, 575, null, iGalaxy, false);
		Planete lDorin = createPlanete("Dorin", 990, 585, null, iGalaxy, false);
		Planete lIridonia = createPlanete("Iridonia", 1020, 515, null, iGalaxy, false);
		Planete lGenassa = createPlanete("Genassa", 1185, 515, null, iGalaxy, false);
		Planete lTaris = createPlanete("Taris", 1330, 515, StarWarsContentDataBase.sTarisLegends, iGalaxy, false);
		Planete lAnsion = createPlanete("Ansion", 940, 510, StarWarsContentDataBase.sAnsionLegends, iGalaxy, true);
		Planete lNamadil= createPlanete("Namadil", 940, 502, null, iGalaxy, false);
		Planete lKrilDor = createPlanete("Kril'Dor", 890, 543, null, iGalaxy, true);
		Planete lRago = createPlanete("Rago", 875, 537, null, iGalaxy, false);
		Planete lRoxuli = createPlanete("Roxuli", 895, 590, null, iGalaxy, false);
		Planete lIllum = createPlanete("Illum", 730, 540, StarWarsContentDataBase.sIllumLegends, iGalaxy, false);
		Planete lZakuul = createPlanete("Zakuul", 580, 489, null, iGalaxy, false);
		Planete lAdumar = createPlanete("Adumar", 950, 480, null, iGalaxy, false);
		Planete lOrinda = createPlanete("Orinda", 1077, 485, null, iGalaxy, false);
		Planete lComra = createPlanete("Comra", 995, 435, null, iGalaxy, false);
		Planete lNirauan = createPlanete("Nirauan", 935, 440, null, iGalaxy, false);
		Planete lUviury = createPlanete("Uviury Exen", 1145, 635, null, iGalaxy, true);
		Planete lAeten = createPlanete("Aeten", 965, 455, null, iGalaxy, false);
		Planete lUba = createPlanete("Uba", 1035, 490, null, iGalaxy, false);
		Planete lEsfandia = createPlanete("Esfandia", 862, 480, null, iGalaxy, false);
		Planete lBorosk = createPlanete("Borosk", 1032, 405, null, iGalaxy, true);
		Planete lYaga = createPlanete("Yaga Minor", 1030, 390, null, iGalaxy, false);
		Planete lKalee = createPlanete("Kalee", 973, 330, null, iGalaxy, false);
		Planete lJaemus = createPlanete("Jaemus", 1036, 315, null, iGalaxy, false);
		Planete lBescane = createPlanete("Bescane", 1035, 300, null, iGalaxy, false);
		Planete lNull= createPlanete("Null", 1280, 522, null, iGalaxy, false);
		Planete lAnkus = createPlanete("Ankus", 868, 522, null, iGalaxy, false);
		Planete lMandalore = createPlanete("Mandalore", 1413, 522, StarWarsContentDataBase.sMandaloreLegends, iGalaxy, true);
		Planete lBandomeer = createPlanete("Bandomeer", 1381, 502, null, iGalaxy, true);
		Planete lPhindar = createPlanete("Phindar", 1480, 510, null, iGalaxy, false);
		Planete lWayland = createPlanete("Wayland", 1355, 550, StarWarsContentDataBase.sWaylandLegends, iGalaxy, false);
		Planete lMyrkr = createPlanete("Myrkr", 1350, 560, null, iGalaxy, false);
		Planete lThustra = createPlanete("Thustra", 1372, 564, null, iGalaxy, false);
		Planete lThisspias = createPlanete("Thisspias", 1398, 592, null, iGalaxy, true);
		Planete lPloo = createPlanete("Ploo", 1288, 560, null, iGalaxy, false);
		Planete lNouane = createPlanete("Nouane", 1275, 580, null, iGalaxy, false);
		Planete lAlpheridies = createPlanete("Alpheridies", 1410, 582, null, iGalaxy, false);
		Planete lAquaris = createPlanete("Aquaris", 1367, 570, null, iGalaxy, true);
		Planete lAzure = createPlanete("Azure", 1492, 587, null, iGalaxy, false);
		Planete lBogden = createPlanete("Bogden", 1185, 592, null, iGalaxy, false);
		Planete lPaqualis = createPlanete("Paqualis", 1177, 600, null, iGalaxy, false);
		Planete lDrearia = createPlanete("Drearia", 1165, 615, null, iGalaxy, false);
		Planete lChampala = createPlanete("Champala", 1157, 620, null, iGalaxy, true);
		Planete lFilordis = createPlanete("Filordis", 1287, 609, null, iGalaxy, false);
		Planete lBerchest = createPlanete("Berchest", 1275, 620, null, iGalaxy, false);
		Planete lMindor = createPlanete("Mindor", 1210, 610, null, iGalaxy, false);
		Planete lPengalan = createPlanete("Pengalan", 1385, 620, null, iGalaxy, true);
		Planete lObroa = createPlanete("Obroa-skai", 1363, 592, null, iGalaxy, true);
		Planete lCartao = createPlanete("Cartao", 1420, 615, null, iGalaxy, true);
		Planete lContruum = createPlanete("Contruum", 1455, 614, null, iGalaxy, false);
		
		/* Hyperspatial Roads */
		
		Road lPerlemianTradeRoute = StarWarsApp.ginjector.getRoad();
		Road lRimmaTradeRoute = StarWarsApp.ginjector.getRoad();
		Road lHydianWay = StarWarsApp.ginjector.getRoad();
		Road lCorellianRun = StarWarsApp.ginjector.getRoad();
		Road lCorellianTradeSpire = StarWarsApp.ginjector.getRoad();
		
		Road lMinorRoadCenter1 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadCenter2 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadCenter3 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadCenter4 = StarWarsApp.ginjector.getRoad();
		
		Road lMinorRoadNW1 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadNW2 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadNW3 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadNW4 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadNW5 = StarWarsApp.ginjector.getRoad();
		
		Road lMinorRoadN1 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadN2 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadN3 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadN4 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadN5 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadN6 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadN7 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadN8 = StarWarsApp.ginjector.getRoad();
		
		Road lMinorRoadNE1 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadNE2 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadNE3 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadNE4 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadNE5 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadNE6 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadNE7 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadNE8 = StarWarsApp.ginjector.getRoad();
		
		Road lMinorRoadE1 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadE2 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadE3 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadE4 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadE5 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadE6 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadE7 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadE8 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadE9 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadE10 = StarWarsApp.ginjector.getRoad();
		
		Road lMinorRoadSE1 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadSE2 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadSE3 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadSE4 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadSE5 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadSE6 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadSE7 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadSE8 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadSE9 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadSE10 = StarWarsApp.ginjector.getRoad();
		
		Road lMinorRoadS1 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadS2 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadS3 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadS4 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadS5 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadS6 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadS7 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadS8 = StarWarsApp.ginjector.getRoad();
		
		Road lMinorRoadSW1 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadSW2 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadSW3 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadSW4 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadSW5 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadSW6 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadSW7 = StarWarsApp.ginjector.getRoad();
		Road lMinorRoadSW8 = StarWarsApp.ginjector.getRoad();
		
		/* Center Roads */ 
		
		lMinorRoadCenter1.getPlanetes().add(lCoruscant);
		lMinorRoadCenter1.getPlanetes().add(lKoros);
		lMinorRoadCenter1.getPlanetes().add(lPratkith);
		lMinorRoadCenter1.getPlanetes().add(lByss);
		
		lMinorRoadCenter2.getPlanetes().add(lBrentaal);
		lMinorRoadCenter2.getPlanetes().add(lTepasi);
		lMinorRoadCenter2.getPlanetes().add(lCamaas);
		lMinorRoadCenter2.getPlanetes().add(lAlderaan);
		lMinorRoadCenter2.getPlanetes().add(lKattada);
		lMinorRoadCenter2.getPlanetes().add(lCommenor);
		
		lMinorRoadCenter3.getPlanetes().add(lCommenor);
		lMinorRoadCenter3.getPlanetes().add(lBalmorra);
		lMinorRoadCenter3.getPlanetes().add(lKuat);
		lMinorRoadCenter3.getPlanetes().add(lFedalle);
		
		lMinorRoadCenter4.getPlanetes().add(lCommenor);
		lMinorRoadCenter4.getPlanetes().add(lHumbarine);
		
		/* North West Roads */
		
		lMinorRoadNW1.getPlanetes().add(lCoruscant);
		lMinorRoadNW1.getPlanetes().add(lPanselemin);
		lMinorRoadNW1.getPlanetes().add(lBorleias);
		lMinorRoadNW1.getPlanetes().add(lPalianhi);
		lMinorRoadNW1.getPlanetes().add(lBilbringi);
		lMinorRoadNW1.getPlanetes().add(lBilbringi);
		lMinorRoadNW1.getPlanetes().add(lDorin);
		lMinorRoadNW1.getPlanetes().add(lGlee);
		lMinorRoadNW1.getPlanetes().add(lAnsion);
		lMinorRoadNW1.getPlanetes().add(lNamadil);
		
		lMinorRoadNW2.getPlanetes().add(lKeitum);
		lMinorRoadNW2.getPlanetes().add(lAnsion);
		lMinorRoadNW2.getPlanetes().add(lRago);
		
		lMinorRoadNW3.getPlanetes().add(lDubrillion);
		lMinorRoadNW3.getPlanetes().add(lBescane);
		
		lMinorRoadNW4.getPlanetes().add(lMuunilist);
		lMinorRoadNW4.getPlanetes().add(lTrasi);
		
		lMinorRoadNW5.getPlanetes().add(lBorosk);
		lMinorRoadNW5.getPlanetes().add(lGarqi);
		
		/* North Roads */
		
		lMinorRoadN1.getPlanetes().add(lSerpidal);
		lMinorRoadN1.getPlanetes().add(lBirgis);
		lMinorRoadN1.getPlanetes().add(lBimmiel);
		lMinorRoadN1.getPlanetes().add(lArgazda);
		lMinorRoadN1.getPlanetes().add(lClutric);
		lMinorRoadN1.getPlanetes().add(lVinsoth);
		lMinorRoadN1.getPlanetes().add(lBotajef);
		lMinorRoadN1.getPlanetes().add(lPhindar);
		lMinorRoadN1.getPlanetes().add(lVjun);
		lMinorRoadN1.getPlanetes().add(lLucazec);
		lMinorRoadN1.getPlanetes().add(lColumex);
		lMinorRoadN1.getPlanetes().add(lMyrth);
		lMinorRoadN1.getPlanetes().add(lBoonta);
		lMinorRoadN1.getPlanetes().add(lVaathkree);
		lMinorRoadN1.getPlanetes().add(lKlatooine);
		lMinorRoadN1.getPlanetes().add(lSleheyron);
		lMinorRoadN1.getPlanetes().add(lSaki);
		lMinorRoadN1.getPlanetes().add(lVarl);
		lMinorRoadN1.getPlanetes().add(lNarShaddaa);
		
		lMinorRoadN2.getPlanetes().add(lSerpidal);
		lMinorRoadN2.getPlanetes().add(lDubrillion);
		
		lMinorRoadN3.getPlanetes().add(lDubrillion);
		lMinorRoadN3.getPlanetes().add(lDantooine);
		lMinorRoadN3.getPlanetes().add(lTrasi);
		lMinorRoadN3.getPlanetes().add(lMygeeto);
		lMinorRoadN3.getPlanetes().add(lGarqi);
		lMinorRoadN3.getPlanetes().add(lKetaris);
		lMinorRoadN3.getPlanetes().add(lAgamar);
		lMinorRoadN3.getPlanetes().add(lBorgo);
		lMinorRoadN3.getPlanetes().add(lErKit);
		lMinorRoadN3.getPlanetes().add(lGwenee);
		lMinorRoadN3.getPlanetes().add(lHalmad);
		lMinorRoadN3.getPlanetes().add(lBandomeer);
		
		lMinorRoadN4.getPlanetes().add(lBastion);
		lMinorRoadN4.getPlanetes().add(lBescane);
		lMinorRoadN4.getPlanetes().add(lJaemus);
		lMinorRoadN4.getPlanetes().add(lMuunilist);
		lMinorRoadN4.getPlanetes().add(lEntralla);
		lMinorRoadN4.getPlanetes().add(lYaga);
		lMinorRoadN4.getPlanetes().add(lBorosk);
		lMinorRoadN4.getPlanetes().add(lOrinda);
		lMinorRoadN4.getPlanetes().add(lMantell);
		
		lMinorRoadN5.getPlanetes().add(lShaum);
		lMinorRoadN5.getPlanetes().add(lAgamar);
		lMinorRoadN5.getPlanetes().add(lIthor);
		lMinorRoadN5.getPlanetes().add(lGenassa);
		lMinorRoadN5.getPlanetes().add(lMantell);
		lMinorRoadN5.getPlanetes().add(lVortex);
		lMinorRoadN5.getPlanetes().add(lViscondor);
		lMinorRoadN5.getPlanetes().add(lDorin);
		
		lMinorRoadN6.getPlanetes().add(lShaum);
		lMinorRoadN6.getPlanetes().add(lVinsoth);
		
		lMinorRoadN7.getPlanetes().add(lVinsoth);
		lMinorRoadN7.getPlanetes().add(lAxxila);
		lMinorRoadN7.getPlanetes().add(lVandyne);
		lMinorRoadN7.getPlanetes().add(lEdusa);
		lMinorRoadN7.getPlanetes().add(lTangrene);
		
		lMinorRoadN8.getPlanetes().add(lAxxila);
		lMinorRoadN8.getPlanetes().add(lCestus);
		lMinorRoadN8.getPlanetes().add(lCelanon);
		
		/* North East Roads */
		
		lMinorRoadNE1.getPlanetes().add(lListehol);
		lMinorRoadNE1.getPlanetes().add(lMirial);
		lMinorRoadNE1.getPlanetes().add(lZygeria);
		
		lMinorRoadNE2.getPlanetes().add(lBonadan);
		lMinorRoadNE2.getPlanetes().add(lZygeria);
		lMinorRoadNE2.getPlanetes().add(lLianna);
		
		lMinorRoadNE3.getPlanetes().add(lQuermia);
		lMinorRoadNE3.getPlanetes().add(lToola);
		lMinorRoadNE3.getPlanetes().add(lFlorn);
		lMinorRoadNE3.getPlanetes().add(lPakuuni);
		lMinorRoadNE3.getPlanetes().add(lMunto);
		lMinorRoadNE3.getPlanetes().add(lCalamari);
		
		lMinorRoadNE4.getPlanetes().add(lCorsin);
		lMinorRoadNE4.getPlanetes().add(lObroa);
		lMinorRoadNE4.getPlanetes().add(lContruum);
		lMinorRoadNE4.getPlanetes().add(lGizer);
		
		lMinorRoadNE5.getPlanetes().add(lLianna);
		lMinorRoadNE5.getPlanetes().add(lCadinth);
		lMinorRoadNE5.getPlanetes().add(lJaminere);
		
		/* East Roads */
		
		lMinorRoadE1.getPlanetes().add(lCentares);
		lMinorRoadE1.getPlanetes().add(lMyrth);
		lMinorRoadE1.getPlanetes().add(lJabiim);
		lMinorRoadE1.getPlanetes().add(lTaskeed);
		lMinorRoadE1.getPlanetes().add(lDennogra);
		lMinorRoadE1.getPlanetes().add(lDelacrix);
		lMinorRoadE1.getPlanetes().add(lKubindi);
		lMinorRoadE1.getPlanetes().add(lFormos);
		lMinorRoadE1.getPlanetes().add(lAduba);
		lMinorRoadE1.getPlanetes().add(lTeth);
		lMinorRoadE1.getPlanetes().add(lBarab);
		lMinorRoadE1.getPlanetes().add(lDubrava);
		lMinorRoadE1.getPlanetes().add(lSyvris);
		lMinorRoadE1.getPlanetes().add(lArami);
		lMinorRoadE1.getPlanetes().add(lGamorr);
		lMinorRoadE1.getPlanetes().add(lMolavar);
		lMinorRoadE1.getPlanetes().add(lTatooine);
		lMinorRoadE1.getPlanetes().add(lGeonosis);
		lMinorRoadE1.getPlanetes().add(lNelvaan);
		lMinorRoadE1.getPlanetes().add(lLlanic);
		lMinorRoadE1.getPlanetes().add(lZhar);
		lMinorRoadE1.getPlanetes().add(lFarstine);
		lMinorRoadE1.getPlanetes().add(lEnarc);
		lMinorRoadE1.getPlanetes().add(lSanrafnix);
		lMinorRoadE1.getPlanetes().add(lDarknell);
		
		lMinorRoadE2.getPlanetes().add(lLantillies);
		lMinorRoadE2.getPlanetes().add(lKashyyyk);
		lMinorRoadE2.getPlanetes().add(lRandon);
		
		lMinorRoadE3.getPlanetes().add(lRandon);
		lMinorRoadE3.getPlanetes().add(lDeysum);
		lMinorRoadE3.getPlanetes().add(lUogocor);
		lMinorRoadE3.getPlanetes().add(lNanthri);
		lMinorRoadE3.getPlanetes().add(lNixor);
		lMinorRoadE3.getPlanetes().add(lDaalang);
		lMinorRoadE3.getPlanetes().add(lCircumtore);
		lMinorRoadE3.getPlanetes().add(lRorak);
		lMinorRoadE3.getPlanetes().add(lYlesia);
		lMinorRoadE3.getPlanetes().add(lTeth);
		
		lMinorRoadE4.getPlanetes().add(lOseon);
		lMinorRoadE4.getPlanetes().add(lBoonta);
		lMinorRoadE4.getPlanetes().add(lBimmisaari);
		lMinorRoadE4.getPlanetes().add(lCharros);
		
		lMinorRoadE5.getPlanetes().add(lCharros);
		lMinorRoadE5.getPlanetes().add(lTogoria);
		lMinorRoadE5.getPlanetes().add(lNazzri);
		lMinorRoadE5.getPlanetes().add(lVena);
		lMinorRoadE5.getPlanetes().add(lOnderon);
		lMinorRoadE5.getPlanetes().add(lAmbria);
		lMinorRoadE5.getPlanetes().add(lZeltros);
		
		lMinorRoadE6.getPlanetes().add(lBalamak);
		lMinorRoadE6.getPlanetes().add(lKashyyyk);
		lMinorRoadE6.getPlanetes().add(lUmbara);
		lMinorRoadE6.getPlanetes().add(lZeltros);
		lMinorRoadE6.getPlanetes().add(lCommenor);
		lMinorRoadE6.getPlanetes().add(lCatoNeimoidia);
		lMinorRoadE6.getPlanetes().add(lQuellor);
		
		lMinorRoadE7.getPlanetes().add(lNanthri);
		lMinorRoadE7.getPlanetes().add(lAttahox);
		lMinorRoadE7.getPlanetes().add(lMimban);
		lMinorRoadE7.getPlanetes().add(lGyndine);
		lMinorRoadE7.getPlanetes().add(lAntar);
		lMinorRoadE7.getPlanetes().add(lQuellor);
		lMinorRoadE7.getPlanetes().add(lExodeen);
		
		lMinorRoadE8.getPlanetes().add(lFormos);
		lMinorRoadE8.getPlanetes().add(lKessel);
		lMinorRoadE8.getPlanetes().add(lSleheyron);
		lMinorRoadE8.getPlanetes().add(lNimban);
		lMinorRoadE8.getPlanetes().add(lChalacta);
		lMinorRoadE8.getPlanetes().add(lRandon);
		lMinorRoadE8.getPlanetes().add(lApsolon);
		lMinorRoadE8.getPlanetes().add(lBelasco);
		lMinorRoadE8.getPlanetes().add(lGyndine);
		
		lMinorRoadE9.getPlanetes().add(lSyvris);
		lMinorRoadE9.getPlanetes().add(lHollastin);
		lMinorRoadE9.getPlanetes().add(lCircumtore);
		
		lMinorRoadE10.getPlanetes().add(lRandon);
		lMinorRoadE10.getPlanetes().add(lUbrikkia);
		lMinorRoadE10.getPlanetes().add(lKwenn);
		lMinorRoadE10.getPlanetes().add(lNarShaddaa);
		lMinorRoadE10.getPlanetes().add(lRorak);
		
		/* South East Roads */
		
		lMinorRoadSE1.getPlanetes().add(lDaalang);
		lMinorRoadSE1.getPlanetes().add(lLannik);
		lMinorRoadSE1.getPlanetes().add(lMoonus);
		lMinorRoadSE1.getPlanetes().add(lBothawui);
		lMinorRoadSE1.getPlanetes().add(lKothlis);
		lMinorRoadSE1.getPlanetes().add(lManda);
		lMinorRoadSE1.getPlanetes().add(lRishi);
		lMinorRoadSE1.getPlanetes().add(lUkio);
		lMinorRoadSE1.getPlanetes().add(lMolavar);
				
		lMinorRoadSE2.getPlanetes().add(lDaalang);
		lMinorRoadSE2.getPlanetes().add(lAridus);
		lMinorRoadSE2.getPlanetes().add(lMilagro);
		lMinorRoadSE2.getPlanetes().add(lKira);
		lMinorRoadSE2.getPlanetes().add(lPax);
		lMinorRoadSE2.getPlanetes().add(lVondarc);
		
		lMinorRoadSE3.getPlanetes().add(lCircumtore);
		lMinorRoadSE3.getPlanetes().add(lNarkaaga);
		lMinorRoadSE3.getPlanetes().add(lBothawui);
		lMinorRoadSE3.getPlanetes().add(lNexus);
		lMinorRoadSE3.getPlanetes().add(lMonastery);
		lMinorRoadSE3.getPlanetes().add(lDruckenwell);
		
		lMinorRoadSE4.getPlanetes().add(lLannik);
		lMinorRoadSE4.getPlanetes().add(lDressel);
		lMinorRoadSE4.getPlanetes().add(lNexus);
		lMinorRoadSE4.getPlanetes().add(lLeritor);
		lMinorRoadSE4.getPlanetes().add(lAndo);
		lMinorRoadSE4.getPlanetes().add(lGazza);
		lMinorRoadSE4.getPlanetes().add(lLlanic);
		lMinorRoadSE4.getPlanetes().add(lSoccoro);
		lMinorRoadSE4.getPlanetes().add(lReuss);
		lMinorRoadSE4.getPlanetes().add(lSpice);
		
		lMinorRoadSE5.getPlanetes().add(lSkynara);
		lMinorRoadSE5.getPlanetes().add(lVohai);
		lMinorRoadSE5.getPlanetes().add(lVergesso);
		lMinorRoadSE5.getPlanetes().add(lTrigalis);
		lMinorRoadSE5.getPlanetes().add(lFarstine);
		
		lMinorRoadSE6.getPlanetes().add(lVohai);
		lMinorRoadSE6.getPlanetes().add(lSuarbi);
		lMinorRoadSE6.getPlanetes().add(lSvivren);
		
		lMinorRoadSE7.getPlanetes().add(lCotellier);
		lMinorRoadSE7.getPlanetes().add(lKirdo);
		lMinorRoadSE7.getPlanetes().add(lSevarcos);
		lMinorRoadSE7.getPlanetes().add(lKabal);
		lMinorRoadSE7.getPlanetes().add(lOmwat);
		lMinorRoadSE7.getPlanetes().add(lSanrafnix);
		
		lMinorRoadSE8.getPlanetes().add(lSharlissia);
		lMinorRoadSE8.getPlanetes().add(lKabal);
		lMinorRoadSE8.getPlanetes().add(lXagobah);
		lMinorRoadSE8.getPlanetes().add(lClakdor);
		
		lMinorRoadSE9.getPlanetes().add(lCov);
		lMinorRoadSE9.getPlanetes().add(lKalarba);
		lMinorRoadSE9.getPlanetes().add(lEnarc);
		
		lMinorRoadSE10.getPlanetes().add(lWroona);
		lMinorRoadSE10.getPlanetes().add(lKira);
		lMinorRoadSE10.getPlanetes().add(lKalinda);
		lMinorRoadSE10.getPlanetes().add(lNaboo);
		
		/* South Roads */
		
		lMinorRoadS1.getPlanetes().add(lEriadu);
		lMinorRoadS1.getPlanetes().add(lEiattu);
		lMinorRoadS1.getPlanetes().add(lIndupar);
		
		lMinorRoadS2.getPlanetes().add(lEriadu);
		lMinorRoadS2.getPlanetes().add(lKarfeddion);
		lMinorRoadS2.getPlanetes().add(lOgem);
		lMinorRoadS2.getPlanetes().add(lCyphar);
		lMinorRoadS2.getPlanetes().add(lKriselist);
		
		/* South West Roads */
		
		lMinorRoadSW1.getPlanetes().add(lBakura);
		lMinorRoadSW1.getPlanetes().add(lEndor);
		lMinorRoadSW1.getPlanetes().add(lCerea);
		
		lMinorRoadSW2.getPlanetes().add(lCerea);
		lMinorRoadSW2.getPlanetes().add(lChalcedon);
		lMinorRoadSW2.getPlanetes().add(lKinyen);
		
		lMinorRoadSW3.getPlanetes().add(lCerea);
		lMinorRoadSW3.getPlanetes().add(lRiflor);
		lMinorRoadSW3.getPlanetes().add(lLorta);
		lMinorRoadSW3.getPlanetes().add(lLutrillia);
		
		lMinorRoadSW4.getPlanetes().add(lRyoone);
		lMinorRoadSW4.getPlanetes().add(lLutrillia);
		lMinorRoadSW4.getPlanetes().add(lGerrenthum);
		
		lMinorRoadSW5.getPlanetes().add(lLipsec);
		lMinorRoadSW5.getPlanetes().add(lVirgillia);
		lMinorRoadSW5.getPlanetes().add(lSump);
		lMinorRoadSW5.getPlanetes().add(lIsde);
		
		lMinorRoadSW6.getPlanetes().add(lGerrenthum);
		lMinorRoadSW6.getPlanetes().add(lNothoiin);
		lMinorRoadSW6.getPlanetes().add(lEriadu);
		
		/* Main Roads */
		
		lPerlemianTradeRoute.getPlanetes().add(lNZoth);
		lPerlemianTradeRoute.getPlanetes().add(lCalSeti);
		lPerlemianTradeRoute.getPlanetes().add(lAlland);
		lPerlemianTradeRoute.getPlanetes().add(lNorkronia);
		lPerlemianTradeRoute.getPlanetes().add(lCoruscant);
		lPerlemianTradeRoute.getPlanetes().add(lAlsakan);
		lPerlemianTradeRoute.getPlanetes().add(lAnaxes);
		lPerlemianTradeRoute.getPlanetes().add(lBrentaal);
		lPerlemianTradeRoute.getPlanetes().add(lYabol);
		lPerlemianTradeRoute.getPlanetes().add(lCastell);
		lPerlemianTradeRoute.getPlanetes().add(lVurdon);
		lPerlemianTradeRoute.getPlanetes().add(lChazwa);
		lPerlemianTradeRoute.getPlanetes().add(lTirahnn);
		lPerlemianTradeRoute.getPlanetes().add(lTaanab);
		lPerlemianTradeRoute.getPlanetes().add(lGizer);
		lPerlemianTradeRoute.getPlanetes().add(lLantillies);
		lPerlemianTradeRoute.getPlanetes().add(lRoche);
		lPerlemianTradeRoute.getPlanetes().add(lAbhean);
		lPerlemianTradeRoute.getPlanetes().add(lLaRoue);
		lPerlemianTradeRoute.getPlanetes().add(lCentares);
		lPerlemianTradeRoute.getPlanetes().add(lColumex);
		lPerlemianTradeRoute.getPlanetes().add(lLianna);
		lPerlemianTradeRoute.getPlanetes().add(lDesevro);
		lPerlemianTradeRoute.getPlanetes().add(lMakem);
		lPerlemianTradeRoute.getPlanetes().add(lQuermia);
		
		lRimmaTradeRoute.getPlanetes().add(lAbregado);
		lRimmaTradeRoute.getPlanetes().add(lDentaal);
		lRimmaTradeRoute.getPlanetes().add(lGiju);
		lRimmaTradeRoute.getPlanetes().add(lGhorman);
		lRimmaTradeRoute.getPlanetes().add(lThyferra);
		lRimmaTradeRoute.getPlanetes().add(lYagDhul);
		lRimmaTradeRoute.getPlanetes().add(lWroona);
		lRimmaTradeRoute.getPlanetes().add(lTregillis);
		lRimmaTradeRoute.getPlanetes().add(lVandelhelm);
		lRimmaTradeRoute.getPlanetes().add(lWoostri);
		lRimmaTradeRoute.getPlanetes().add(lVondarc);
		lRimmaTradeRoute.getPlanetes().add(lSullust);
		lRimmaTradeRoute.getPlanetes().add(lEriadu);
		lRimmaTradeRoute.getPlanetes().add(lClakdor);
		lRimmaTradeRoute.getPlanetes().add(lTriton);
		lRimmaTradeRoute.getPlanetes().add(lSluis);
		lRimmaTradeRoute.getPlanetes().add(lDagobah);
		lRimmaTradeRoute.getPlanetes().add(lElrood);
		lRimmaTradeRoute.getPlanetes().add(lKarideph);
		lRimmaTradeRoute.getPlanetes().add(lKalShebbol);
		
		lHydianWay.getPlanetes().add(lImynusoph);
		lHydianWay.getPlanetes().add(lTerminus);
		lHydianWay.getPlanetes().add(lRutan);
		lHydianWay.getPlanetes().add(lAtravis);
		lHydianWay.getPlanetes().add(lShumavar);
		lHydianWay.getPlanetes().add(lEriadu);
		lHydianWay.getPlanetes().add(lDarknell);
		lHydianWay.getPlanetes().add(lMalastare);
		lHydianWay.getPlanetes().add(lZeheth);
		lHydianWay.getPlanetes().add(lPax);
		lHydianWay.getPlanetes().add(lMajoor);
		lHydianWay.getPlanetes().add(lRagith);
		lHydianWay.getPlanetes().add(lGacerian);
		lHydianWay.getPlanetes().add(lBaroli);
		lHydianWay.getPlanetes().add(lShibric);
		lHydianWay.getPlanetes().add(lChardaan);
		lHydianWay.getPlanetes().add(lDenon);
		lHydianWay.getPlanetes().add(lExodeen);
		lHydianWay.getPlanetes().add(lBellassa);
		lHydianWay.getPlanetes().add(lFedalle);
		lHydianWay.getPlanetes().add(lSkako);
		lHydianWay.getPlanetes().add(lBrentaal);
		lHydianWay.getPlanetes().add(lUviury);
		lHydianWay.getPlanetes().add(lChampala);
		lHydianWay.getPlanetes().add(lDrearia);
		lHydianWay.getPlanetes().add(lPaqualis);
		lHydianWay.getPlanetes().add(lBogden);
		lHydianWay.getPlanetes().add(lCorsin);
		lHydianWay.getPlanetes().add(lBandomeer);
		lHydianWay.getPlanetes().add(lBotajef);
		lHydianWay.getPlanetes().add(lCelanon);
		lHydianWay.getPlanetes().add(lJunction);
		lHydianWay.getPlanetes().add(lToprawa);
		lHydianWay.getPlanetes().add(lPheach);
		lHydianWay.getPlanetes().add(lTelos);
		lHydianWay.getPlanetes().add(lListehol);
		lHydianWay.getPlanetes().add(lRuuria);
		lHydianWay.getPlanetes().add(lCadomai);
		lHydianWay.getPlanetes().add(lBonadan);
		
		lCorellianRun.getPlanetes().add(lNaos);
		lCorellianRun.getPlanetes().add(lWrea);
		lCorellianRun.getPlanetes().add(lRyloth);
		lCorellianRun.getPlanetes().add(lChristophsis);
		lCorellianRun.getPlanetes().add(lRadnor);
		lCorellianRun.getPlanetes().add(lHerdessa);
		lCorellianRun.getPlanetes().add(lGazza);
		lCorellianRun.getPlanetes().add(lDruckenwell);
		lCorellianRun.getPlanetes().add(lCov);
		lCorellianRun.getPlanetes().add(lMilagro);
		lCorellianRun.getPlanetes().add(lAllanteen);
		lCorellianRun.getPlanetes().add(lRhommamool);
		lCorellianRun.getPlanetes().add(lDenon);
		lCorellianRun.getPlanetes().add(lIseno);
		lCorellianRun.getPlanetes().add(lByblos);
		lCorellianRun.getPlanetes().add(llLoronar);
		lCorellianRun.getPlanetes().add(lTinnel);
		lCorellianRun.getPlanetes().add(lCorellia);
		lCorellianRun.getPlanetes().add(lColomus);
		lCorellianRun.getPlanetes().add(lIxtlar);
		lCorellianRun.getPlanetes().add(lCoruscant);
		
		lCorellianTradeSpire.getPlanetes().add(lCorellia);
		lCorellianTradeSpire.getPlanetes().add(lKelada);
		lCorellianTradeSpire.getPlanetes().add(lBestine);
		lCorellianTradeSpire.getPlanetes().add(lMechis);
		lCorellianTradeSpire.getPlanetes().add(lYagDhul);
		lCorellianTradeSpire.getPlanetes().add(lHarrin);
		lCorellianTradeSpire.getPlanetes().add(lKinyen);
		lCorellianTradeSpire.getPlanetes().add(lPendari);
		lCorellianTradeSpire.getPlanetes().add(lCalonica);
		lCorellianTradeSpire.getPlanetes().add(lBomis);
		lCorellianTradeSpire.getPlanetes().add(lKriselist);
		lCorellianTradeSpire.getPlanetes().add(lKaal);
		lCorellianTradeSpire.getPlanetes().add(lJiroch);
		lCorellianTradeSpire.getPlanetes().add(lMugaar);
		lCorellianTradeSpire.getPlanetes().add(lGerrenthum);
		lCorellianTradeSpire.getPlanetes().add(lBespin);
		lCorellianTradeSpire.getPlanetes().add(lHoth);
		lCorellianTradeSpire.getPlanetes().add(lIsde);
		lCorellianTradeSpire.getPlanetes().add(lBerrols);
		lCorellianTradeSpire.getPlanetes().add(lMampha);
		lCorellianTradeSpire.getPlanetes().add(lTerminus);
		
		lPerlemianTradeRoute.setIsMajorRoad(true);
		lRimmaTradeRoute.setIsMajorRoad(true);
		lHydianWay.setIsMajorRoad(true);
		lCorellianRun.setIsMajorRoad(true);
		lCorellianTradeSpire.setIsMajorRoad(true);
		
		iGalaxy.getRoads().add(lPerlemianTradeRoute);
		iGalaxy.getRoads().add(lRimmaTradeRoute);
		iGalaxy.getRoads().add(lHydianWay);
		iGalaxy.getRoads().add(lCorellianRun);
		iGalaxy.getRoads().add(lCorellianTradeSpire);
		
		iGalaxy.getRoads().add(lMinorRoadCenter1);
		iGalaxy.getRoads().add(lMinorRoadCenter2);
		iGalaxy.getRoads().add(lMinorRoadCenter3);
		iGalaxy.getRoads().add(lMinorRoadCenter4);
		
		iGalaxy.getRoads().add(lMinorRoadNW1);
		iGalaxy.getRoads().add(lMinorRoadNW2);
		iGalaxy.getRoads().add(lMinorRoadNW3);
		iGalaxy.getRoads().add(lMinorRoadNW4);
		iGalaxy.getRoads().add(lMinorRoadNW5);
		
		iGalaxy.getRoads().add(lMinorRoadN1);
		iGalaxy.getRoads().add(lMinorRoadN2);
		iGalaxy.getRoads().add(lMinorRoadN3);
		iGalaxy.getRoads().add(lMinorRoadN4);
		iGalaxy.getRoads().add(lMinorRoadN5);
		iGalaxy.getRoads().add(lMinorRoadN6);
		iGalaxy.getRoads().add(lMinorRoadN7);
		iGalaxy.getRoads().add(lMinorRoadN8);
		
		iGalaxy.getRoads().add(lMinorRoadNE1);
		iGalaxy.getRoads().add(lMinorRoadNE2);
		iGalaxy.getRoads().add(lMinorRoadNE3);
		iGalaxy.getRoads().add(lMinorRoadNE4);
		iGalaxy.getRoads().add(lMinorRoadNE5);
		iGalaxy.getRoads().add(lMinorRoadNE6);
		iGalaxy.getRoads().add(lMinorRoadNE7);
		iGalaxy.getRoads().add(lMinorRoadNE8);
		
		iGalaxy.getRoads().add(lMinorRoadE1);
		iGalaxy.getRoads().add(lMinorRoadE2);
		iGalaxy.getRoads().add(lMinorRoadE3);
		iGalaxy.getRoads().add(lMinorRoadE4);
		iGalaxy.getRoads().add(lMinorRoadE5);
		iGalaxy.getRoads().add(lMinorRoadE6);
		iGalaxy.getRoads().add(lMinorRoadE7);
		iGalaxy.getRoads().add(lMinorRoadE8);
		iGalaxy.getRoads().add(lMinorRoadE9);
		iGalaxy.getRoads().add(lMinorRoadE10);
		
		iGalaxy.getRoads().add(lMinorRoadSE1);
		iGalaxy.getRoads().add(lMinorRoadSE2);
		iGalaxy.getRoads().add(lMinorRoadSE3);
		iGalaxy.getRoads().add(lMinorRoadSE4);
		iGalaxy.getRoads().add(lMinorRoadSE5);
		iGalaxy.getRoads().add(lMinorRoadSE6);
		iGalaxy.getRoads().add(lMinorRoadSE7);
		iGalaxy.getRoads().add(lMinorRoadSE8);
		iGalaxy.getRoads().add(lMinorRoadSE9);
		iGalaxy.getRoads().add(lMinorRoadSE10);
		
		iGalaxy.getRoads().add(lMinorRoadS1);
		iGalaxy.getRoads().add(lMinorRoadS2);
		iGalaxy.getRoads().add(lMinorRoadS3);
		iGalaxy.getRoads().add(lMinorRoadS4);
		iGalaxy.getRoads().add(lMinorRoadS5);
		iGalaxy.getRoads().add(lMinorRoadS6);
		iGalaxy.getRoads().add(lMinorRoadS7);
		iGalaxy.getRoads().add(lMinorRoadS8);
		
		iGalaxy.getRoads().add(lMinorRoadSW1);
		iGalaxy.getRoads().add(lMinorRoadSW2);
		iGalaxy.getRoads().add(lMinorRoadSW3);
		iGalaxy.getRoads().add(lMinorRoadSW4);
		iGalaxy.getRoads().add(lMinorRoadSW5);
		iGalaxy.getRoads().add(lMinorRoadSW6);
		iGalaxy.getRoads().add(lMinorRoadSW7);
		iGalaxy.getRoads().add(lMinorRoadSW8);
	}
	

	
	private static void processTerritories(GalaxyModule iGalaxy) {
		
		// 30000 BBY
		
		Territory lInfiniteEmpire30000BY = StarWarsApp.ginjector.getTerritory();
		lInfiniteEmpire30000BY.init(StarWarsContentDataBase.sEmpireInfiniLegends, 460, 90, 136, "infiniteempire30000by", "Empire Infini", 240, 650, ElementColor.blue);
		
		// 17000 BBY
		
		Territory lHuttSpace17000BY = StarWarsApp.ginjector.getTerritory();
		lHuttSpace17000BY.init(StarWarsContentDataBase.sEspaceHuttCommon, 1280, 555, 130, "huttspace17000by", "Espace Hutt", 33, 20, ElementColor.green);
		
		Territory lCorellianHegemony17000BY = StarWarsApp.ginjector.getTerritory();
		lCorellianHegemony17000BY.init(StarWarsContentDataBase.sHegemonieCorellienneLegends, 875, 660, 130, "corellianhegemony17000by", "Hégémonie Corellienne", 64, 100, ElementColor.orange);
		
		Territory lGalacticRepublic17000BY = StarWarsApp.ginjector.getTerritory();
		lGalacticRepublic17000BY.init(StarWarsContentDataBase.sRepubliqueGalactiqueLegends, 800, 550, 130, "galacticrepublic17000by", "République Galactique", 195, -4, ElementColor.red);
		
		Territory lAlsakanSpace17000BY = StarWarsApp.ginjector.getTerritory();
		lAlsakanSpace17000BY.init(StarWarsContentDataBase.sEspaceAlsakanLegends, 734, 390, 130, "alsakanspace17000by", "Espace Alsakan", 254, 92, ElementColor.blue);
		
		// 12000 BBY
		
		Territory lHuttSpace12000BY = StarWarsApp.ginjector.getTerritory();
		lHuttSpace12000BY.init(StarWarsContentDataBase.sEspaceHuttCommon, 1255, 555, 130, "huttspace12000by", "Espace Hutt", 75, 20, ElementColor.green);
		
		Territory lGalacticRepublic12000BY = StarWarsApp.ginjector.getTerritory();
		lGalacticRepublic12000BY.init(StarWarsContentDataBase.sRepubliqueGalactiqueLegends, 773, 323, 130, "galacticrepublic12000by", "République Galactique", 185, 190, ElementColor.red);
		
		Territory lGalacticRepublicNorth12000BY = StarWarsApp.ginjector.getTerritory();
		lGalacticRepublicNorth12000BY.init(StarWarsContentDataBase.sRepubliqueGalactiqueLegends, 825, 315, 130, "galacticrepublicnorth12000by", " ", 0, 0, ElementColor.red);
		
		Territory lGalacticRepublicSouth12000BY = StarWarsApp.ginjector.getTerritory();
		lGalacticRepublicSouth12000BY.init(StarWarsContentDataBase.sRepubliqueGalactiqueLegends, 955, 950, 130, "galacticrepublicsouth12000by", " ", 0, 0, ElementColor.red);
		
		// 5000 BBY
		
		Territory lHuttSpace5000BY = StarWarsApp.ginjector.getTerritory();
		lHuttSpace5000BY.init(StarWarsContentDataBase.sEspaceHuttCommon, 1135, 404, 135, "huttspace5000by", "Espace Hutt", 65, 158, ElementColor.green);
		
		Territory lChissSpace = StarWarsApp.ginjector.getTerritory();
		lChissSpace.init(StarWarsContentDataBase.sEspaceChissLegends, 435, 450, 130, "chissspace", "Ascendance Chiss", -8, 11, ElementColor.orange);
		
		Territory lSithEmpire5000BY = StarWarsApp.ginjector.getTerritory();
		lSithEmpire5000BY.init(StarWarsContentDataBase.sAncienEmpireSithLegends, 1198, 268, 130, "oldsithempire5000by", "Empire Sith", 28, -14, ElementColor.blue);
		
		// 3957 BBY
		
		Territory lHuttSpace4000BY = StarWarsApp.ginjector.getTerritory();
		lHuttSpace4000BY.init(StarWarsContentDataBase.sEspaceHuttCommon, 1164, 408, 136, "huttspace4000by", "Espace Hutt", 105, 140, ElementColor.green);

		Territory lHapanConsortium = StarWarsApp.ginjector.getTerritory();
		lHapanConsortium.init(StarWarsContentDataBase.sConsortiumdeHapesLegends, 1084, 522, 127, "hapanconsortium", "Consortium d'Hapes", -18, -3, ElementColor.green);
		
		Territory lRevanEmpire = StarWarsApp.ginjector.getTerritory();
		lRevanEmpire.init(StarWarsContentDataBase.sEmpiredeRevanLegends, 1065, 221, 130, "revanempire3957by", "Empire de Dark Revan", 0, -16, ElementColor.blue);
		
		Territory lGalacticRepublic3957BY = StarWarsApp.ginjector.getTerritory();
		lGalacticRepublic3957BY.init(StarWarsContentDataBase.sRepubliqueGalactiqueLegends, 778, 335, 127, "galacticrepublic3957by", "République Galactique", 177, 188, ElementColor.red);
		
		// 3650 BVY
		
		Territory lHuttSpace3650BY = StarWarsApp.ginjector.getTerritory();
		lHuttSpace3650BY.init(StarWarsContentDataBase.sEspaceHuttCommon, (int)(1615 / 1.3f), (int)(719 / 1.3f), 130, "huttspace3650by", "Espace Hutt", 34, 159, ElementColor.green);

		Territory lSithEmpireNorth3650BY = StarWarsApp.ginjector.getTerritory();
		lSithEmpireNorth3650BY.init(StarWarsContentDataBase.sSecondEmpireSithLegends, (int)(507 / 1.3f), (int)(120 / 1.3f), 130, "sithempire3650by", "Ancien Empire Sith Reconstitué", 179, 87, ElementColor.blue);
		
		Territory lSithEmpireSouthWest3650BY = StarWarsApp.ginjector.getTerritory();
		lSithEmpireSouthWest3650BY.init(StarWarsContentDataBase.sSecondEmpireSithLegends, (int)(1210 / 1.3f), (int)(1251 / 1.3f), 130, "sithempiresouthwest1000by", "", 0, -16, ElementColor.blue);
		
		Territory lSithEmpireSouthEast3650BY = StarWarsApp.ginjector.getTerritory();
		lSithEmpireSouthEast3650BY.init(StarWarsContentDataBase.sSecondEmpireSithLegends, (int)(1480 / 1.3f), (int)(1095 / 1.3f), 130, "separatistspacesoutheast222by", "", 0, -16, ElementColor.blue);
		
		Territory lGalacticRepublic3650BY = StarWarsApp.ginjector.getTerritory();
		lGalacticRepublic3650BY.init(StarWarsContentDataBase.sRepubliqueGalactiqueLegends, (int)(975 / 1.3f), (int)(490 / 1.3f), 130, "galacticrepublic3650by", "République Galactique", 181, 134, ElementColor.red);
		
		// 1000 BBY
		
		Territory lHuttSpace1000BY = StarWarsApp.ginjector.getTerritory();
		lHuttSpace1000BY.init(StarWarsContentDataBase.sEspaceHuttCommon, 1151, 433, 130, "huttspace1000by", "Espace Hutt", 100, 160, ElementColor.green);
		
		Territory lGalacticRepublic1000BY = StarWarsApp.ginjector.getTerritory();
		lGalacticRepublic1000BY.init(StarWarsContentDataBase.sRepubliqueGalactiqueLegends, 775, 406, 130, "galacticrepublic1000by", "République Galactique", -37, 103, ElementColor.red);
		
		Territory lSithSpaceEast1000BY = StarWarsApp.ginjector.getTerritory();
		lSithSpaceEast1000BY.init(StarWarsContentDataBase.sNouvelEmpireSithLegends, 1146, 433, 130, "sithspaceeast1000by", "", 0, 0, ElementColor.blue);
		
		Territory lSithSpaceNorthEast1000BY = StarWarsApp.ginjector.getTerritory();
		lSithSpaceNorthEast1000BY.init(StarWarsContentDataBase.sNouvelEmpireSithLegends, 1151, 273, 130, "sithempirenortheast1000by", "", 0, 0, ElementColor.blue);
		
		Territory lSithSpaceNorth1000BY = StarWarsApp.ginjector.getTerritory();
		lSithSpaceNorth1000BY.init(StarWarsContentDataBase.sNouvelEmpireSithLegends, 989, 305, 130, "sithspacenorth1000by", "Espace Sith", 0, 8, ElementColor.blue);
		
		Territory lSithSpaceNorthWest1000BY = StarWarsApp.ginjector.getTerritory();
		lSithSpaceNorthWest1000BY.init(StarWarsContentDataBase.sNouvelEmpireSithLegends, 741, 360, 130, "sithspacenothwest1000by", "", 0, 0, ElementColor.blue);
		
		Territory lSithSpaceSouth1000BY = StarWarsApp.ginjector.getTerritory();
		lSithSpaceSouth1000BY.init(StarWarsContentDataBase.sNouvelEmpireSithLegends, 933, 923, 130, "sithspacesouth1000by", "Espace Sith", 51, 40, ElementColor.blue);
		
		Territory lSithSpaceSouthWest1000BY = StarWarsApp.ginjector.getTerritory();
		lSithSpaceSouthWest1000BY.init(StarWarsContentDataBase.sNouvelEmpireSithLegends, 776, 939, 130, "sithempiresouthwest1000by", "", 0, 0, ElementColor.blue);
		
		// 22 BBY
		
		Territory lHuttSpace22BY = StarWarsApp.ginjector.getTerritory();
		lHuttSpace22BY.init(StarWarsContentDataBase.sEspaceHuttCommon, 1075, 402, 130, "huttspace22by", "Espace Hutt", 180, 190, ElementColor.green);
		
		Territory lGalacticRepublic22BY = StarWarsApp.ginjector.getTerritory();
		lGalacticRepublic22BY.init(StarWarsContentDataBase.sRepubliqueGalactiqueLegends, 685, 192, 130, "galacticrepublic22by", "République Galactique", 272, 320, ElementColor.red);
		
		Territory lSeparatistSpaceNorth22BY = StarWarsApp.ginjector.getTerritory();
		lSeparatistSpaceNorth22BY.init(StarWarsContentDataBase.sCSILegends, 744, 192, 130, "separatistspacenorth22by", "Espace Séparatiste", 276, 85, ElementColor.blue);
		
		Territory lSeparatistSpaceSouth22BY = StarWarsApp.ginjector.getTerritory();
		lSeparatistSpaceSouth22BY.init(StarWarsContentDataBase.sCSILegends, 855, 748, 130, "separatistspacesouth22by", "Espace Séparatiste", 112, 217, ElementColor.blue);
		
		Territory lSeparatistSpaceSouthEast122BY = StarWarsApp.ginjector.getTerritory();
		lSeparatistSpaceSouthEast122BY.init(StarWarsContentDataBase.sCSILegends, 1069, 742, 130, "separatistspacesoutheast122by", "Espace Séparatiste", 65, 48, ElementColor.blue);
		
		Territory lSeparatistSpaceSouthEast222BY = StarWarsApp.ginjector.getTerritory();
		lSeparatistSpaceSouthEast222BY.init(StarWarsContentDataBase.sCSILegends, 1251, 812, 130, "separatistspacesoutheast222by", " ", 0, 0, ElementColor.blue);
		
		Territory lSeparatistSpaceEast22BY = StarWarsApp.ginjector.getTerritory();
		lSeparatistSpaceEast22BY.init(StarWarsContentDataBase.sCSILegends, 1068, 317, 130, "separatistspaceeast22by", "Espace Séparatiste", 211, 41, ElementColor.blue);
		
		// 19 BBY
		
		Territory lHuttSpace19BY = StarWarsApp.ginjector.getTerritory();
		lHuttSpace19BY.init(StarWarsContentDataBase.sEspaceHuttCommon, 1217, 483, 130, "huttspace19by", "Espace Hutt", 33, 110, ElementColor.green);
		
		Territory lGalacticEmpire19BY = StarWarsApp.ginjector.getTerritory();
		lGalacticEmpire19BY.init(StarWarsContentDataBase.sEmpireGalactiqueLegends, 670, 209, 130, "galacticempire19by", "Empire Galactique", 303, 300, ElementColor.blue);

		Territory lHandEmpire19BY = StarWarsApp.ginjector.getTerritory();
		lHandEmpire19BY.init(StarWarsContentDataBase.sEmpiredelaMainLegends, 371, 177, 130, "handempire19by", "Empire de la Main", 209, 80, ElementColor.blue);
		
		// 4 ABY
		
		Territory lGalacticEmpire4AY = StarWarsApp.ginjector.getTerritory();
		lGalacticEmpire4AY.init(StarWarsContentDataBase.sEmpireGalactiqueLegends, 762, 419, 132, "galacticempire4ay", "Empire Galactique", 187, 88, ElementColor.blue);

		Territory lGalacticEmpireNorth4AY = StarWarsApp.ginjector.getTerritory();
		lGalacticEmpireNorth4AY.init(StarWarsContentDataBase.sEmpireGalactiqueLegends, 1258, 217, 130, "galacticempirenorth4ay", "Empire Galactique", 51, 19, ElementColor.blue);

		Territory lGalacticEmpireEast4AY = StarWarsApp.ginjector.getTerritory();
		lGalacticEmpireEast4AY.init(StarWarsContentDataBase.sEmpireGalactiqueLegends, 1328, 821, 130, "galacticempireeast4ay", "Empire Galactique", 37, -19, ElementColor.blue);
		
		Territory lOversectorOuter4AY = StarWarsApp.ginjector.getTerritory();
		lOversectorOuter4AY.init(StarWarsContentDataBase.sEmpireGalactiqueLegends, 940, 145, 100, "oversectorouter4ay", "Grand Secteur Extérieur", 365, 67, ElementColor.purple);
		
		Territory lZsinjEmpire4AY = StarWarsApp.ginjector.getTerritory();
		lZsinjEmpire4AY.init(StarWarsContentDataBase.sEmpiredeZsinjLegends, 1003, 229, 130, "zsinjempire4ay", "Empire de Zsinj", 107, 97, ElementColor.blue);
		
		Territory lGreaterMaldrood4AY = StarWarsApp.ginjector.getTerritory();
		lGreaterMaldrood4AY.init(StarWarsContentDataBase.sGrandMaldroodLegends, 1160, 380, 130, "greatermaldrood4ay", "Secteur Maldrood", 6, 74, ElementColor.yellow);
		
		Territory lEriaduAuthority4AY = StarWarsApp.ginjector.getTerritory();
		lEriaduAuthority4AY.init(StarWarsContentDataBase.sAuthoritedEriaduLegends, 876, 800, 130, "eriaduauthority4ay", "Authorité d'Eriadu", 87, 172, ElementColor.purple);
		
		Territory lPrentiochDominion4AY = StarWarsApp.ginjector.getTerritory();
		lPrentiochDominion4AY.init(StarWarsContentDataBase.sDominiondePrentiochLegends, 777, 926, 130, "prentiochdominion4ay", "Dominion de Prentioch", -42, -35, ElementColor.green);

		Territory lZeroCommand4AY = StarWarsApp.ginjector.getTerritory();
		lZeroCommand4AY.init(StarWarsContentDataBase.sEmpiredHarrskLegends, 833, 665, 130, "zerocommand4ay", "Empire d'Harrsk", -58, 15, ElementColor.orange);

		Territory lAllianceTerritories4AY = StarWarsApp.ginjector.getTerritory();
		lAllianceTerritories4AY.init(StarWarsContentDataBase.sAllianceRebelleLegends, 494, 917, 130, "allianceterritories4ay", "Espace de l'Alliance", 0, 0, ElementColor.red);
		
		// 6 ABY

		Territory lAllianceTerritoriesCenter6AY = StarWarsApp.ginjector.getTerritory();
		lAllianceTerritoriesCenter6AY.init(StarWarsContentDataBase.sNouvelleRepubliqueLegends, 909, 448, 130, "allianceterritoriescenter6ay", "Nouvelle République", 212, 231, ElementColor.red);

		Territory lAllianceTerritoriesNorthEast6AY = StarWarsApp.ginjector.getTerritory();
		lAllianceTerritoriesNorthEast6AY.init(StarWarsContentDataBase.sNouvelleRepubliqueLegends, 1312, 303, 130, "allianceterritoriesnortheast6ay", "Nouvelle République", 33, -40, ElementColor.red);

		Territory lAllianceTerritoriesSouth6AY = StarWarsApp.ginjector.getTerritory();
		lAllianceTerritoriesSouth6AY.init(StarWarsContentDataBase.sNouvelleRepubliqueLegends, 779, 724, 130, "allianceterritoriessouth6ay", "Nouvelle République", 44, 322, ElementColor.red);

		Territory lZsinjEmpire6AY = StarWarsApp.ginjector.getTerritory();
		lZsinjEmpire6AY.init(StarWarsContentDataBase.sEmpiredeZsinjLegends, 951, 224, 130, "zsinjempire6ay", "Empire de Zsinj", 79, 44, ElementColor.blue);

		Territory lGalacticEmpire6AY = StarWarsApp.ginjector.getTerritory();
		lGalacticEmpire6AY.init(StarWarsContentDataBase.sEmpireGalactiqueLegends, 775, 456, 130, "galacticempire6ay", "Empire Galactique", 0, 44, ElementColor.blue);

		Territory lOverSectorOuter6AY = StarWarsApp.ginjector.getTerritory();
		lOverSectorOuter6AY.init(StarWarsContentDataBase.sGrandSecteurExterieurLegends, 729, 188, 130, "oversectorouter6ay", "Grand Secteur Extérieur", 143, 54, ElementColor.purple);

		Territory lZeroCommand6AY = StarWarsApp.ginjector.getTerritory();
		lZeroCommand6AY.init(StarWarsContentDataBase.sEmpiredHarrskLegends, 833, 665, 130, "zerocommand6ay", "Empire d'Harrsk", -58, 15, ElementColor.orange);
		
		// 8 ABY

		Territory lAllianceTerritoriesCenter8AY = StarWarsApp.ginjector.getTerritory();
		lAllianceTerritoriesCenter8AY.init(StarWarsContentDataBase.sNouvelleRepubliqueLegends, 796, 448, 130, "allianceterritoriescenter8ay", "Nouvelle République", 323, 231, ElementColor.red);

		Territory lAllianceTerritoriesNorthEast8AY = StarWarsApp.ginjector.getTerritory();
		lAllianceTerritoriesNorthEast8AY.init(StarWarsContentDataBase.sNouvelleRepubliqueLegends, 1362, 349, 130, "allianceterritoriesnortheast8ay", "Nouvelle République", 55, -23, ElementColor.red);

		Territory lAllianceTerritoriesSouth8AY = StarWarsApp.ginjector.getTerritory();
		lAllianceTerritoriesSouth8AY.init(StarWarsContentDataBase.sNouvelleRepubliqueLegends, 781, 688, 130, "allianceterritoriessouth8ay", "Nouvelle République", 44, 377, ElementColor.red);

		Territory lZsinjEmpire8AY = StarWarsApp.ginjector.getTerritory();
		lZsinjEmpire8AY.init(StarWarsContentDataBase.sEmpiredeZsinjLegends, 911, 228, 130, "zsinjempire8ay", "Empire de Zsinj", 119, 40, ElementColor.blue);

		Territory lGalacticEmpire8AY = StarWarsApp.ginjector.getTerritory();
		lGalacticEmpire8AY.init(StarWarsContentDataBase.sEmpireGalactiqueLegends, 782, 565, 130, "galacticempire8ay", "Empire Galactique", -39, 64, ElementColor.blue);

		Territory lPentastarAlignment8AY = StarWarsApp.ginjector.getTerritory();
		lPentastarAlignment8AY.init(StarWarsContentDataBase.sAlignementdePentastarLegends, 729, 188, 130, "oversectorouter6ay", "Alignement de Pentastar", 131, 54, ElementColor.purple);
		
		// 9 ABY
		
		Territory lAllianceTerritoriesCenter9AY = StarWarsApp.ginjector.getTerritory();
		lAllianceTerritoriesCenter9AY.init(StarWarsContentDataBase.sNouvelleRepubliqueLegends, 779, 444, 130, "allianceterritoriescenter9ay", "Nouvelle République", 342, 236, ElementColor.red);

		Territory lGalacticEmpire9AY = StarWarsApp.ginjector.getTerritory();
		lGalacticEmpire9AY.init(StarWarsContentDataBase.sEmpireGalactiqueLegends, 797, 594, 130, "galacticempire9ay", "Empire Galactique", -70, 24, ElementColor.blue);

		Territory lHandEmpire9AY = StarWarsApp.ginjector.getTerritory();
		lHandEmpire9AY.init(StarWarsContentDataBase.sEmpiredelaMainLegends, 373, 169, 130, "handempire9ay", "Empire de la Main", 209, 115, ElementColor.blue);
		
		Territory lEriaduAuthority9AY = StarWarsApp.ginjector.getTerritory();
		lEriaduAuthority9AY.init(StarWarsContentDataBase.sAuthoritedEriaduLegends, 917, 1017, 130, "eriaduauthority9ay", "Authorité d'Eriadu", 0, 0, ElementColor.purple);
		
		// 11 ABY

		Territory lAllianceTerritoriesCenter11AY = StarWarsApp.ginjector.getTerritory();
		lAllianceTerritoriesCenter11AY.init(StarWarsContentDataBase.sNouvelleRepubliqueLegends, 779, 444, 130, "allianceterritoriescenter11ay", "Nouvelle République", 342, 236, ElementColor.red);
		
		Territory lDarkEmpire11AY = StarWarsApp.ginjector.getTerritory();
		lDarkEmpire11AY.init(StarWarsContentDataBase.sEmpiredesTenebresLegends, 709, 161, 130, "darkempire11ay", "Empire des Ténèbres", 50, 334, ElementColor.blue);

		Territory lHandEmpire11AY = StarWarsApp.ginjector.getTerritory();
		lHandEmpire11AY.init(StarWarsContentDataBase.sEmpiredelaMainLegends, 373, 169, 130, "handempire11ay", "Empire de la Main", 209, 115, ElementColor.blue);
		
		// 137 ABY
		
		Territory lKraytEmpire137AY = StarWarsApp.ginjector.getTerritory();
		lKraytEmpire137AY.init(StarWarsContentDataBase.sEmpiredeKraytLegends, 676, 183, 130, "kraytempire137ay", "Empire de Dark Krayt", 34, 392, ElementColor.blue);
		
		Territory lFelEmpire137AY = StarWarsApp.ginjector.getTerritory();
		lFelEmpire137AY.init(StarWarsContentDataBase.sEmpireenExilLegends, 780, 135, 130, "felempire137ay", "Empire en Exil", 106, 50, ElementColor.purple);
		
		Territory lFGALEast137AY = StarWarsApp.ginjector.getTerritory();
		lFGALEast137AY.init(StarWarsContentDataBase.sVestigesdelAllianceLegends, 1323, 359, 130, "fgaleast137ay", "Alliance Galactique", 86, -33, ElementColor.red);
		
		Territory lFGALSouthEast137AY = StarWarsApp.ginjector.getTerritory();
		lFGALSouthEast137AY.init(StarWarsContentDataBase.sVestigesdelAllianceLegends, 1229, 979, 130, "galacticrepublicnorth12000by", "", 0, 0, ElementColor.red);
		
		Territory lFGALSouth137AY = StarWarsApp.ginjector.getTerritory();
		lFGALSouth137AY.init(StarWarsContentDataBase.sVestigesdelAllianceLegends, 937, 1069, 130, "galacticrepublicsouth12000by", "Alliance Galactique", 63, 19, ElementColor.red);
		
		Territory lFGALSouthWest137AY = StarWarsApp.ginjector.getTerritory();
		lFGALSouthWest137AY.init(StarWarsContentDataBase.sVestigesdelAllianceLegends, 658, 885, 130, "allianceterritoriesnortheast8ay", "", 0, 0, ElementColor.red);
		
		// Periods
		
		GalaxyPeriod lPeriod30000BY = new GalaxyPeriod("Le règne de l'Empire Infini");
		lPeriod30000BY.setText("L'Empire Infini était une organisation impériale suprême créée par les Rakata qui régna sur "
				+ "plus de cinq cents mondes différents à son apogée. Largement en avance sur son temps aussi bien au niveau "
				+ "technologique que cognitif, l’Empire Infini réduisit en esclavage nombre d’espèces à travers la galaxie "
				+ "durant des milliers d’années. L'Empire fini par s'éteindre suite à une peste galactique ravageuse");
		lPeriod30000BY.getTerritorys().add(lInfiniteEmpire30000BY);
		
		GalaxyPeriod lPeriod17000BY = new GalaxyPeriod("Guerres d'Alsakan");
		lPeriod17000BY.setText("Pendant 14000 ans, les conflits contre Alsakan opposèrent cette planète à la République Galactique. Bien qu'à l'origine démarrés "
				+ "pour le contrôle des mouvements de colons vers la Bordure Intérieure et la Zone d'Expansion, ces conflits "
				+ "tournèrent rapidement à l'affrontement idéologique et économique : d'un côté, une aristocratie marchande "
				+ "- l'Archaiad - se souciant peu de la bureaucratie, de l'autre, un gouvernement qui se voulait galactique "
				+ "et aux douze mille années d'existence... ");
		lPeriod17000BY.getTerritorys().add(lHuttSpace17000BY);
		lPeriod17000BY.getTerritorys().add(lCorellianHegemony17000BY);
		lPeriod17000BY.getTerritorys().add(lGalacticRepublic17000BY);
		lPeriod17000BY.getTerritorys().add(lAlsakanSpace17000BY);
		
		GalaxyPeriod lPeriod12000BY = new GalaxyPeriod("Expansion de la République");
		lPeriod12000BY.setText("Les voies hyperspatiales se développement de plus en plus et une promesse de prospérité au sein de la "
				+ "République font grandir les rangs du Sénat Galactique.");
		lPeriod12000BY.getTerritorys().add(lGalacticRepublic12000BY);
		lPeriod12000BY.getTerritorys().add(lGalacticRepublicNorth12000BY);
		lPeriod12000BY.getTerritorys().add(lGalacticRepublicSouth12000BY);
		lPeriod12000BY.getTerritorys().add(lHuttSpace12000BY);
		
		GalaxyPeriod lPeriod5000BY = new GalaxyPeriod("Guerre de l'Hyperespace");
		lPeriod5000BY.setText("Des explorateurs inconscients arrivent sur Korriban et tombent nez à nez avec les Seigneurs Sith, descendant "
				+ "des Jedi Noirs. De cette rencontre impromptue naitra des tensions internes entre Naga Sadow et Ludo Kressh qui prétendent tout deux "
				+ "au pouvoir. Les manigances de Sadow provoqueront une guerre contre la République. Battu et trahit par Ludo Kressh, il se réfugia sur"
				+ " Yavin IV avec ses serviteurs, les Massassis.");

		lPeriod5000BY.getTerritorys().add(lGalacticRepublic12000BY);
		lPeriod5000BY.getTerritorys().add(lGalacticRepublicNorth12000BY);
		lPeriod5000BY.getTerritorys().add(lGalacticRepublicSouth12000BY);
		lPeriod5000BY.getTerritorys().add(lHuttSpace5000BY);
		lPeriod5000BY.getTerritorys().add(lSithEmpire5000BY);
		lPeriod5000BY.getTerritorys().add(lChissSpace);
		
		GalaxyPeriod lPeriod3957BY = new GalaxyPeriod("Guerre civile des Jedi");
		lPeriod3957BY.setText("La guerre civile des Jedi, appelée également la seconde guerre des Sith en référence à la Grande Guerre "
				+ "des Sith, opposa l'armée sith de Dark Revan  créée par la  Forge Stellaire à la République et à l'Ordre Jedi. Elle commença "
				+ "peu après la débâcle finale des Guerres Mandaloriennes sur  Malachor V  en -3959, et finit en -3956 par la Bataille de la Forge "
				+ "Stellaire.");

		lPeriod3957BY.getTerritorys().add(lGalacticRepublic3957BY);
		lPeriod3957BY.getTerritorys().add(lRevanEmpire);
		lPeriod3957BY.getTerritorys().add(lHuttSpace4000BY);
		lPeriod3957BY.getTerritorys().add(lChissSpace);
		lPeriod3957BY.getTerritorys().add(lHapanConsortium);
		
		GalaxyPeriod lPeriod3650BY = new GalaxyPeriod("Guerre Froide Galactique");
		lPeriod3650BY.setText("Cette période, qui succeda la Grande Guerre Galactique, correspond à une période de tension qu'il y a eu entre "
				+ "la République Galactique et l'Ancien Empire Sith reconstitué de l'Empereur Vitiate suite au traité de Coruscant. Ce traité, qui fut signé "
				+ "suite au sac de la capitale Galactique, ratifiait que la quasi-moitié de la galaxie serait"
				+ "désormais sous domination de l'Empire Sith. Cette période dura 11 ans et usa profondément les deux camps à cause des nombreuses escarmouches.");

		lPeriod3650BY.getTerritorys().add(lSithEmpireNorth3650BY);
		lPeriod3650BY.getTerritorys().add(lGalacticRepublic3650BY);
		lPeriod3650BY.getTerritorys().add(lSithEmpireSouthEast3650BY);
		lPeriod3650BY.getTerritorys().add(lSithEmpireSouthWest3650BY);
		lPeriod3650BY.getTerritorys().add(lHuttSpace3650BY);
		lPeriod3650BY.getTerritorys().add(lChissSpace);
		lPeriod3650BY.getTerritorys().add(lHapanConsortium);
		
		GalaxyPeriod lPeriod1000BY = new GalaxyPeriod("Les nouvelles guerres Sith");
		lPeriod1000BY.setText("Connues également comme la Guerre de la Lumière et de l'Obscurité, la Période Draggulch, la Guerre du Plus "
				+ "Fort, la Trahison ou la Malédiction de Qalydon, les Nouvelles Guerres des Sith furent le plus long conflit de l'Histoire "
				+ "galactique ainsi que le dernier grand conflit intergalactique que connut l'Ancienne République avant la Guerre des Clones."
				+ " Elle opposa la République et le Jedi face aux armées Sith du Nouvel Empire Sith et de la Confrérie des Ténèbres.");
		lPeriod1000BY.getTerritorys().add(lGalacticRepublic1000BY);
		lPeriod1000BY.getTerritorys().add(lSithSpaceEast1000BY);
		lPeriod1000BY.getTerritorys().add(lSithSpaceNorth1000BY);
		lPeriod1000BY.getTerritorys().add(lSithSpaceNorthEast1000BY);
		lPeriod1000BY.getTerritorys().add(lSithSpaceNorthWest1000BY);
		lPeriod1000BY.getTerritorys().add(lSithSpaceSouth1000BY);
		lPeriod1000BY.getTerritorys().add(lSithSpaceSouthWest1000BY);
		lPeriod1000BY.getTerritorys().add(lHuttSpace1000BY);
		lPeriod1000BY.getTerritorys().add(lChissSpace);
		lPeriod1000BY.getTerritorys().add(lHapanConsortium);
		
		GalaxyPeriod lPeriod22BY = new GalaxyPeriod("La guerre des clones");
		lPeriod22BY.setText("La  Guerre des Clones était le nom donné au conflit galactique entre "
				+ "la  République Galactique et la Confédération des Systèmes Indépendants. La Guerre vit s'affronter deux des plus grandes armées"
				+ " dans l'histoire de la galaxie, tout d'abord sur leurs planètes respectives, puis le conflit s'écarta rapidement à chaque monde habité."
				+ "La guerre fut commencée, maintenue et finalement terminée par le Seigneur Sith Dark Sidious, dont le but final était la transformation "
				+ "de la République en Empire Galactique avec lui comme Empereur et l'extermination totale de l'Ordre Jedi.");
		lPeriod22BY.getTerritorys().add(lGalacticRepublic22BY);
		lPeriod22BY.getTerritorys().add(lSeparatistSpaceEast22BY);
		lPeriod22BY.getTerritorys().add(lHuttSpace22BY);
		lPeriod22BY.getTerritorys().add(lSeparatistSpaceSouthEast122BY);
		lPeriod22BY.getTerritorys().add(lSeparatistSpaceSouthEast222BY);
		lPeriod22BY.getTerritorys().add(lSeparatistSpaceSouth22BY);
		lPeriod22BY.getTerritorys().add(lSeparatistSpaceNorth22BY);
		lPeriod22BY.getTerritorys().add(lChissSpace);
		lPeriod22BY.getTerritorys().add(lHapanConsortium);
		
		GalaxyPeriod lPeriod19BY = new GalaxyPeriod("Avènement d'un ordre nouveau");
		lPeriod19BY.setText("La guerre n'est plus et l'ordre règne partout ou flotte le sigle impérial. L'Ordre Nouveau de l'Empire Palpatine"
				+ " est un régime autoritaire et militariste fondé sur les cendres de la "
				+ "République Galactique et de l'Ordre Jedi. Il restera à travers les âges comme l'une des plus grandes puissances ayant jamais existées.");
		lPeriod19BY.getTerritorys().add(lGalacticEmpire19BY);
		lPeriod19BY.getTerritorys().add(lHandEmpire19BY);
		lPeriod19BY.getTerritorys().add(lHuttSpace19BY);
		lPeriod19BY.getTerritorys().add(lChissSpace);
		lPeriod19BY.getTerritorys().add(lHapanConsortium);

		GalaxyPeriod lPeriod4AY = new GalaxyPeriod("Dislocation de l'Empire");
		lPeriod4AY.setText("La bataille d'Endor fut le coup fatal qui disloca l'Empire Galactique. Suite à la mort de l'Empereur, certains dignitaires"
				+ " de l'Empire restèrent fidèles à l'ordre établi. "
				+ "D'autres devinrent des Seigneurs de Guerre indépendantistes et tournés vers eux-mêmes et leurs intérêts. Suite à cette débacle, le nombreux systèmes se soulevèrent"
				+ " contre les forces impériales afin de retrouver leur indépendance ou joindre l'Alliance Rebelle.");
		lPeriod4AY.getTerritorys().add(lGalacticEmpire4AY);
		lPeriod4AY.getTerritorys().add(lGalacticEmpireEast4AY);
		lPeriod4AY.getTerritorys().add(lGalacticEmpireNorth4AY);
		lPeriod4AY.getTerritorys().add(lHandEmpire19BY);
		lPeriod4AY.getTerritorys().add(lOversectorOuter4AY);
		lPeriod4AY.getTerritorys().add(lZsinjEmpire4AY);
		lPeriod4AY.getTerritorys().add(lGreaterMaldrood4AY);
		lPeriod4AY.getTerritorys().add(lPrentiochDominion4AY);
		lPeriod4AY.getTerritorys().add(lEriaduAuthority4AY);
		lPeriod4AY.getTerritorys().add(lZeroCommand4AY);
		lPeriod4AY.getTerritorys().add(lAllianceTerritories4AY);
		lPeriod4AY.getTerritorys().add(lHapanConsortium);
		lPeriod4AY.getTerritorys().add(lHuttSpace19BY);
		lPeriod4AY.getTerritorys().add(lChissSpace);
		
		GalaxyPeriod lPeriod6AY = new GalaxyPeriod("Avancée de la Nouvelle République");
		lPeriod6AY.setText("La Nouvelle République a été déclarée peu après la bataille d'Endor. Avec la guerre civile entre les dignitaires impériaux, les forces "
				+ "républicaines avancent doucement mais surement sur la capitale galactique et le symbole du pouvoir : Coruscant.");
		lPeriod6AY.getTerritorys().add(lHuttSpace19BY);
		lPeriod6AY.getTerritorys().add(lGalacticEmpire6AY);
		lPeriod6AY.getTerritorys().add(lHandEmpire19BY);
		lPeriod6AY.getTerritorys().add(lChissSpace);
		lPeriod6AY.getTerritorys().add(lOverSectorOuter6AY);
		lPeriod6AY.getTerritorys().add(lZsinjEmpire6AY);
		lPeriod6AY.getTerritorys().add(lEriaduAuthority4AY);
		lPeriod6AY.getTerritorys().add(lAllianceTerritoriesCenter6AY);
		lPeriod6AY.getTerritorys().add(lAllianceTerritoriesNorthEast6AY);
		lPeriod6AY.getTerritorys().add(lAllianceTerritoriesSouth6AY);
		lPeriod6AY.getTerritorys().add(lZeroCommand6AY);
		lPeriod6AY.getTerritorys().add(lGreaterMaldrood4AY);
		lPeriod6AY.getTerritorys().add(lHapanConsortium);
		
		GalaxyPeriod lPeriod8AY = new GalaxyPeriod("La chasse de Zsinj");
		lPeriod8AY.setText("Devenu Seigneur de Guerre et Grand Amiral autoproclamé après la bataille d'Endor, Zsinj s'enliguera contre la jeune République et "
				+ "d'autres dignitaires impériaux. Suite aux efforts combinés des républicains et des impériaux, Zsinj fut frappé de toutes parts et nombreux de"
				+ " ses mondes subirent d’importants dégâts. La chasse prit fin après la destruction de son Super Star Destroyer par Han Solo.");
		lPeriod8AY.getTerritorys().add(lHuttSpace19BY);
		lPeriod8AY.getTerritorys().add(lGalacticEmpire8AY);
		lPeriod8AY.getTerritorys().add(lHandEmpire19BY);
		lPeriod8AY.getTerritorys().add(lChissSpace);
		lPeriod8AY.getTerritorys().add(lPentastarAlignment8AY);
		lPeriod8AY.getTerritorys().add(lZsinjEmpire8AY);
		lPeriod8AY.getTerritorys().add(lEriaduAuthority4AY);
		lPeriod8AY.getTerritorys().add(lAllianceTerritoriesCenter8AY);
		lPeriod8AY.getTerritorys().add(lAllianceTerritoriesNorthEast8AY);
		lPeriod8AY.getTerritorys().add(lAllianceTerritoriesSouth8AY);
		lPeriod8AY.getTerritorys().add(lGreaterMaldrood4AY);
		lPeriod8AY.getTerritorys().add(lHapanConsortium);

		GalaxyPeriod lPeriod9AY = new GalaxyPeriod("Campagnes de Thrawn");
		lPeriod9AY.setText("Stratège de génie, le Grand Amiral Trawn dirige d'une poigne de fer l'Empire de la Main et fut suer la Nouvelle République à plus"
				+ " d'une reprise. De retour des régions inconnues après avoir protéger l'Espace Chiss, il s'allia avec Joruus C'Baoth, le clone d'un puissant "
				+ "Jedi, captura une immense flotte de croiseurs et récupéra des centres de clonage pour créer une grande armée. Il fut finalement trahit par "
				+ "son garde du corps Noghri.");
		lPeriod9AY.getTerritorys().add(lHuttSpace19BY);
		lPeriod9AY.getTerritorys().add(lHandEmpire9AY);
		lPeriod9AY.getTerritorys().add(lChissSpace);
		lPeriod9AY.getTerritorys().add(lPentastarAlignment8AY);
		lPeriod9AY.getTerritorys().add(lAllianceTerritoriesCenter9AY);
		lPeriod9AY.getTerritorys().add(lAllianceTerritoriesNorthEast8AY);
		lPeriod9AY.getTerritorys().add(lGalacticEmpire9AY);
		lPeriod9AY.getTerritorys().add(lHapanConsortium);
		lPeriod9AY.getTerritorys().add(lEriaduAuthority9AY);

		GalaxyPeriod lPeriod11AY = new GalaxyPeriod("Le retour de l'Empereur");
		lPeriod11AY.setText("Après sa mort dans l’Etoile de la Mort, l’esprit de Palpatine erra avant de prendre "
				+ "possession du corps d’une de ses Mains, Jeng Droga. Puis, dans le corps de Droga, il alla jusqu’à Byss où il se réfugia dans le corps "
				+ "d’un de ses clones. Là, en secret, il refonda son empire, remplaçant son Empire Galactique par un Empire des Ténèbres, uniquement "
				+ "gouverné par les séides du Coté Obscur.");
		lPeriod11AY.getTerritorys().add(lHuttSpace19BY);
		lPeriod11AY.getTerritorys().add(lHandEmpire11AY);
		lPeriod11AY.getTerritorys().add(lChissSpace);
		lPeriod11AY.getTerritorys().add(lAllianceTerritoriesCenter11AY);
		lPeriod11AY.getTerritorys().add(lAllianceTerritoriesNorthEast8AY);
		lPeriod11AY.getTerritorys().add(lDarkEmpire11AY);
		lPeriod11AY.getTerritorys().add(lHapanConsortium);
		lPeriod11AY.getTerritorys().add(lEriaduAuthority9AY);
		lPeriod11AY.getTerritorys().add(lPentastarAlignment8AY);
		
		GalaxyPeriod lPeriod137AY = new GalaxyPeriod("Un Nouvel Empire");
		lPeriod137AY.setText("L'Alliance Galactique, les Jedi et l'Empereur Roan Fel furent trahis par les Moffs du Nouvel Empire Galactique, pervertis par "
				+ "le Seigneur Sith Dark Krayt. Ce dernier prit le pouvoir absolu sur l'ensemble de la galaxie et instaura rapidement une dictature Sith. "
				+ "Les divers poches de résistance s'allieront sous une seule banière pour mettre fin aux agissement de du Seigneur Sith.");
		lPeriod137AY.getTerritorys().add(lKraytEmpire137AY);
		lPeriod137AY.getTerritorys().add(lHuttSpace19BY);
		lPeriod137AY.getTerritorys().add(lChissSpace);
		lPeriod137AY.getTerritorys().add(lHapanConsortium);
		lPeriod137AY.getTerritorys().add(lFelEmpire137AY);
		lPeriod137AY.getTerritorys().add(lFGALEast137AY);
		lPeriod137AY.getTerritorys().add(lFGALSouth137AY);
		lPeriod137AY.getTerritorys().add(lFGALSouthEast137AY);
		lPeriod137AY.getTerritorys().add(lFGALSouthWest137AY);
		
		iGalaxy.getGalaxyPeriodInfos().put(-30000, lPeriod30000BY);
		iGalaxy.getGalaxyPeriodInfos().put(-17000, lPeriod17000BY);
		iGalaxy.getGalaxyPeriodInfos().put(-12000, lPeriod12000BY);
		iGalaxy.getGalaxyPeriodInfos().put(-5000, lPeriod5000BY);
		iGalaxy.getGalaxyPeriodInfos().put(-3957, lPeriod3957BY);
		iGalaxy.getGalaxyPeriodInfos().put(-3650, lPeriod3650BY);
		iGalaxy.getGalaxyPeriodInfos().put(-1000, lPeriod1000BY);
		iGalaxy.getGalaxyPeriodInfos().put(-22, lPeriod22BY);
		iGalaxy.getGalaxyPeriodInfos().put(-19, lPeriod19BY);
		iGalaxy.getGalaxyPeriodInfos().put(4, lPeriod4AY);
		iGalaxy.getGalaxyPeriodInfos().put(6, lPeriod6AY);
		iGalaxy.getGalaxyPeriodInfos().put(8, lPeriod8AY);
		iGalaxy.getGalaxyPeriodInfos().put(9, lPeriod9AY);
		iGalaxy.getGalaxyPeriodInfos().put(11, lPeriod11AY);
		iGalaxy.getGalaxyPeriodInfos().put(137, lPeriod137AY);
	}
	
	private static Planete createPlanete(String iName, int iX, int iY, ElementInfo iInfo, GalaxyModule iGalaxy, boolean iIsDown) {
		Planete lPlanete = StarWarsApp.ginjector.getPlanete();
		boolean lInBase = true;
		if (iInfo == null) {
			lInBase = false;
			iInfo = new ElementInfo();
			iInfo.setTitle(iName);
			iInfo.setImageResource(StarWarsImageResources.INSTANCE.logounknown());
			iInfo.setDescription(StarWarsTextResources.INSTANCE.notfind().getText());
			iInfo.setSumup(StarWarsTextResources.INSTANCE.notfind().getText());
		}
		
		lPlanete.init(iInfo, iX, iY, iIsDown, lInBase);
		iGalaxy.getPlanetes().add(lPlanete);
		return lPlanete;
	}
}
