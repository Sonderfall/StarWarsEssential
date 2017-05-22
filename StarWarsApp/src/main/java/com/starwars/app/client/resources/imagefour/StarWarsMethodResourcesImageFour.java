package com.starwars.app.client.resources.imagefour;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.resources.client.ImageResource;
import com.starwars.app.client.mct.ASyncCall;
import com.starwars.app.client.resources.StarWarsImageResources;

public class StarWarsMethodResourcesImageFour {
	
	public static boolean callMethodImage(final ASyncCall<ImageResource> iASyncCall, final String iName) {
			if (iName.equals("raxusprime1") || iName.equals("logoraymusantilles") || iName.equals("logosyalantilles") || iName.equals("shadowspawn1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("raxusprime1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.raxusprime1());

						} else if (iName.equals("logoraymusantilles")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoraymusantilles());

						} else if (iName.equals("logosyalantilles")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logosyalantilles());

						} else if (iName.equals("shadowspawn1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shadowspawn1());

						}
					}
				});
				return true;
			}
			if (iName.equals("logoberuwhitesun") || iName.equals("rttt2") || iName.equals("leiaold") || iName.equals("corbos2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logoberuwhitesun")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoberuwhitesun());

						} else if (iName.equals("rttt2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rttt2());

						} else if (iName.equals("leiaold")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.leiaold());

						} else if (iName.equals("corbos2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.corbos2());

						}
					}
				});
				return true;
			}
			if (iName.equals("utilities") || iName.equals("saeseetiin2") || iName.equals("heraholo") || iName.equals("mynock2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("utilities")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.utilities());

						} else if (iName.equals("saeseetiin2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.saeseetiin2());

						} else if (iName.equals("heraholo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.heraholo());

						} else if (iName.equals("mynock2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mynock2());

						}
					}
				});
				return true;
			}
			if (iName.equals("inquisitorend") || iName.equals("sevensister3") || iName.equals("rieekan1") || iName.equals("bactawar")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("inquisitorend")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.inquisitorend());

						} else if (iName.equals("sevensister3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sevensister3());

						} else if (iName.equals("rieekan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rieekan1());

						} else if (iName.equals("bactawar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bactawar());

						}
					}
				});
				return true;
			}
			if (iName.equals("logonatskywalker") || iName.equals("bocvskyle") || iName.equals("logodespotwar") || iName.equals("podraceranakin1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logonatskywalker")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logonatskywalker());

						} else if (iName.equals("bocvskyle")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bocvskyle());

						} else if (iName.equals("logodespotwar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodespotwar());

						} else if (iName.equals("podraceranakin1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.podraceranakin1());

						}
					}
				});
				return true;
			}
			if (iName.equals("logonewsithempire") || iName.equals("zaynerun") || iName.equals("bailbattle") || iName.equals("codymanda")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logonewsithempire")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logonewsithempire());

						} else if (iName.equals("zaynerun")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zaynerun());

						} else if (iName.equals("bailbattle")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bailbattle());

						} else if (iName.equals("codymanda")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.codymanda());

						}
					}
				});
				return true;
			}
			if (iName.equals("sando2") || iName.equals("kueller1") || iName.equals("logodracoantares") || iName.equals("energydroid1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("sando2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sando2());

						} else if (iName.equals("kueller1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kueller1());

						} else if (iName.equals("logodracoantares")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodracoantares());

						} else if (iName.equals("energydroid1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.energydroid1());

						}
					}
				});
				return true;
			}
			if (iName.equals("ozzel2") || iName.equals("roanfeldeath") || iName.equals("kee1") || iName.equals("theson2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ozzel2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ozzel2());

						} else if (iName.equals("roanfeldeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.roanfeldeath());

						} else if (iName.equals("kee1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kee1());

						} else if (iName.equals("theson2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.theson2());

						}
					}
				});
				return true;
			}
			if (iName.equals("nomisunrider2") || iName.equals("tendra1") || iName.equals("hondokarrbattle") || iName.equals("seatrooper2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("nomisunrider2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nomisunrider2());

						} else if (iName.equals("tendra1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tendra1());

						} else if (iName.equals("hondokarrbattle")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hondokarrbattle());

						} else if (iName.equals("seatrooper2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.seatrooper2());

						}
					}
				});
				return true;
			}
			if (iName.equals("evirderricote1") || iName.equals("cassiotagge2") || iName.equals("logofgal") || iName.equals("darkazard1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("evirderricote1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.evirderricote1());

						} else if (iName.equals("cassiotagge2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cassiotagge2());

						} else if (iName.equals("logofgal")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logofgal());

						} else if (iName.equals("darkazard1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkazard1());

						}
					}
				});
				return true;
			}
			if (iName.equals("ralltiirbattle") || iName.equals("jaiusyorub2") || iName.equals("kallusvador") || iName.equals("r2d2prestatite")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ralltiirbattle")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ralltiirbattle());

						} else if (iName.equals("jaiusyorub2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jaiusyorub2());

						} else if (iName.equals("kallusvador")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kallusvador());

						} else if (iName.equals("r2d2prestatite")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2d2prestatite());

						}
					}
				});
				return true;
			}
			if (iName.equals("clonecoruscantguard1") || iName.equals("jedicoalition1") || iName.equals("lukecaedus") || iName.equals("darkjadus2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("clonecoruscantguard1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.clonecoruscantguard1());

						} else if (iName.equals("jedicoalition1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jedicoalition1());

						} else if (iName.equals("lukecaedus")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lukecaedus());

						} else if (iName.equals("darkjadus2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkjadus2());

						}
					}
				});
				return true;
			}
			if (iName.equals("exarkun2") || iName.equals("abeloth3") || iName.equals("vandar1") || iName.equals("mazkanata2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("exarkun2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.exarkun2());

						} else if (iName.equals("abeloth3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.abeloth3());

						} else if (iName.equals("vandar1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vandar1());

						} else if (iName.equals("mazkanata2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mazkanata2());

						}
					}
				});
				return true;
			}
			if (iName.equals("kryndadraay1") || iName.equals("ahsokamalachor") || iName.equals("jarael1") || iName.equals("letarkin2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kryndadraay1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kryndadraay1());

						} else if (iName.equals("ahsokamalachor")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ahsokamalachor());

						} else if (iName.equals("jarael1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jarael1());

						} else if (iName.equals("letarkin2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.letarkin2());

						}
					}
				});
				return true;
			}
			if (iName.equals("allianceterritoriescenter9ay") || iName.equals("denebabattle") || iName.equals("biggs2") || iName.equals("logosheltayretrac")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("allianceterritoriescenter9ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.allianceterritoriescenter9ay());

						} else if (iName.equals("denebabattle")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.denebabattle());

						} else if (iName.equals("biggs2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.biggs2());

						} else if (iName.equals("logosheltayretrac")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logosheltayretrac());

						}
					}
				});
				return true;
			}
			if (iName.equals("tarfful1") || iName.equals("voiliersolaire1") || iName.equals("tmt1") || iName.equals("luke2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("tarfful1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tarfful1());

						} else if (iName.equals("voiliersolaire1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.voiliersolaire1());

						} else if (iName.equals("tmt1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tmt1());

						} else if (iName.equals("luke2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.luke2());

						}
					}
				});
				return true;
			}
			if (iName.equals("chasepiru1") || iName.equals("yodasifo") || iName.equals("rodia2") || iName.equals("tiefantome2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("chasepiru1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chasepiru1());

						} else if (iName.equals("yodasifo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.yodasifo());

						} else if (iName.equals("rodia2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rodia2());

						} else if (iName.equals("tiefantome2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tiefantome2());

						}
					}
				});
				return true;
			}
			if (iName.equals("hera2") || iName.equals("koro22") || iName.equals("logodarkbane") || iName.equals("opee2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("hera2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hera2());

						} else if (iName.equals("koro22")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.koro22());

						} else if (iName.equals("logodarkbane")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarkbane());

						} else if (iName.equals("opee2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.opee2());

						}
					}
				});
				return true;
			}
			if (iName.equals("aniasolo1") || iName.equals("lictor1") || iName.equals("snowspeeder1") || iName.equals("chopper3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("aniasolo1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.aniasolo1());

						} else if (iName.equals("lictor1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lictor1());

						} else if (iName.equals("snowspeeder1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.snowspeeder1());

						} else if (iName.equals("chopper3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chopper3());

						}
					}
				});
				return true;
			}
			if (iName.equals("ossus2") || iName.equals("nomanor2") || iName.equals("tatooine3") || iName.equals("laser2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ossus2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ossus2());

						} else if (iName.equals("nomanor2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nomanor2());

						} else if (iName.equals("tatooine3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tatooine3());

						} else if (iName.equals("laser2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.laser2());

						}
					}
				});
				return true;
			}
			if (iName.equals("logoshmiskywalker") || iName.equals("jhorambey1") || iName.equals("siobibble1") || iName.equals("blackfleet1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logoshmiskywalker")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoshmiskywalker());

						} else if (iName.equals("jhorambey1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jhorambey1());

						} else if (iName.equals("siobibble1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.siobibble1());

						} else if (iName.equals("blackfleet1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.blackfleet1());

						}
					}
				});
				return true;
			}
			if (iName.equals("tace1") || iName.equals("rogueshadow1") || iName.equals("alsakanspace17000by") || iName.equals("logotaachume")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("tace1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tace1());

						} else if (iName.equals("rogueshadow1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rogueshadow1());

						} else if (iName.equals("alsakanspace17000by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.alsakanspace17000by());

						} else if (iName.equals("logotaachume")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logotaachume());

						}
					}
				});
				return true;
			}
			if (iName.equals("gundark2") || iName.equals("senatecommando1") || iName.equals("speeder74z1") || iName.equals("daegenlok3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("gundark2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gundark2());

						} else if (iName.equals("senatecommando1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.senatecommando1());

						} else if (iName.equals("speeder74z1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.speeder74z1());

						} else if (iName.equals("daegenlok3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.daegenlok3());

						}
					}
				});
				return true;
			}
			if (iName.equals("sarco1") || iName.equals("atris2") || iName.equals("trasaa1") || iName.equals("sigeldare1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("sarco1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sarco1());

						} else if (iName.equals("atris2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.atris2());

						} else if (iName.equals("trasaa1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.trasaa1());

						} else if (iName.equals("sigeldare1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sigeldare1());

						}
					}
				});
				return true;
			}
			if (iName.equals("roanfel3") || iName.equals("caamasdoc2") || iName.equals("moncal2") || iName.equals("genel1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("roanfel3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.roanfel3());

						} else if (iName.equals("caamasdoc2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.caamasdoc2());

						} else if (iName.equals("moncal2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.moncal2());

						} else if (iName.equals("genel1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.genel1());

						}
					}
				});
				return true;
			}
			if (iName.equals("crabdroid1") || iName.equals("sithpur2") || iName.equals("bozpity1") || iName.equals("homeimagedeathstar")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("crabdroid1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.crabdroid1());

						} else if (iName.equals("sithpur2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sithpur2());

						} else if (iName.equals("bozpity1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bozpity1());

						} else if (iName.equals("homeimagedeathstar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.homeimagedeathstar());

						}
					}
				});
				return true;
			}
			if (iName.equals("galak1") || iName.equals("githanydeath") || iName.equals("venka1") || iName.equals("darkbaras2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("galak1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.galak1());

						} else if (iName.equals("githanydeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.githanydeath());

						} else if (iName.equals("venka1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.venka1());

						} else if (iName.equals("darkbaras2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkbaras2());

						}
					}
				});
				return true;
			}
			if (iName.equals("kuellerbrakiss") || iName.equals("logogaerielcaptison") || iName.equals("carivus1") || iName.equals("wullfyularen1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kuellerbrakiss")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kuellerbrakiss());

						} else if (iName.equals("logogaerielcaptison")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logogaerielcaptison());

						} else if (iName.equals("carivus1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.carivus1());

						} else if (iName.equals("wullfyularen1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.wullfyularen1());

						}
					}
				});
				return true;
			}
			if (iName.equals("canonionique1") || iName.equals("arkanianbattle") || iName.equals("r2d2leia") || iName.equals("blackholetrooper1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("canonionique1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.canonionique1());

						} else if (iName.equals("arkanianbattle")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.arkanianbattle());

						} else if (iName.equals("r2d2leia")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2d2leia());

						} else if (iName.equals("blackholetrooper1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.blackholetrooper1());

						}
					}
				});
				return true;
			}
			if (iName.equals("boil1") || iName.equals("deliahmission") || iName.equals("needa2") || iName.equals("newholtice1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("boil1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.boil1());

						} else if (iName.equals("deliahmission")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.deliahmission());

						} else if (iName.equals("needa2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.needa2());

						} else if (iName.equals("newholtice1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.newholtice1());

						}
					}
				});
				return true;
			}
			if (iName.equals("rexbeast") || iName.equals("shiicho") || iName.equals("ta1752") || iName.equals("batterieptower1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("rexbeast")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rexbeast());

						} else if (iName.equals("shiicho")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shiicho());

						} else if (iName.equals("ta1752")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ta1752());

						} else if (iName.equals("batterieptower1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.batterieptower1());

						}
					}
				});
				return true;
			}
			if (iName.equals("jastermereel1") || iName.equals("mirtagev1") || iName.equals("obiwan15") || iName.equals("scouttrooper2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("jastermereel1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jastermereel1());

						} else if (iName.equals("mirtagev1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mirtagev1());

						} else if (iName.equals("obiwan15")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.obiwan15());

						} else if (iName.equals("scouttrooper2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.scouttrooper2());

						}
					}
				});
				return true;
			}
			if (iName.equals("kama2") || iName.equals("satinekryze1") || iName.equals("nagai1") || iName.equals("zsinj2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kama2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kama2());

						} else if (iName.equals("satinekryze1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.satinekryze1());

						} else if (iName.equals("nagai1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nagai1());

						} else if (iName.equals("zsinj2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zsinj2());

						}
					}
				});
				return true;
			}
			if (iName.equals("tptt2") || iName.equals("logoiellaantilles") || iName.equals("ember1") || iName.equals("obiwan3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("tptt2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tptt2());

						} else if (iName.equals("logoiellaantilles")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoiellaantilles());

						} else if (iName.equals("ember1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ember1());

						} else if (iName.equals("obiwan3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.obiwan3());

						}
					}
				});
				return true;
			}
			if (iName.equals("tbtt2") || iName.equals("caleb2") || iName.equals("kkruhkcade") || iName.equals("hyloviszfame")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("tbtt2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tbtt2());

						} else if (iName.equals("caleb2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.caleb2());

						} else if (iName.equals("kkruhkcade")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kkruhkcade());

						} else if (iName.equals("hyloviszfame")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hyloviszfame());

						}
					}
				});
				return true;
			}
			if (iName.equals("ziost1") || iName.equals("orgusdin1") || iName.equals("alemarar3") || iName.equals("zebmoney")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ziost1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ziost1());

						} else if (iName.equals("orgusdin1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.orgusdin1());

						} else if (iName.equals("alemarar3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.alemarar3());

						} else if (iName.equals("zebmoney")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zebmoney());

						}
					}
				});
				return true;
			}
			if (iName.equals("octuptarradroid2") || iName.equals("csitransports") || iName.equals("ahsokatano1") || iName.equals("kamino1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("octuptarradroid2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.octuptarradroid2());

						} else if (iName.equals("csitransports")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.csitransports());

						} else if (iName.equals("ahsokatano1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ahsokatano1());

						} else if (iName.equals("kamino1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kamino1());

						}
					}
				});
				return true;
			}
			if (iName.equals("logomalinzathanas") || iName.equals("nautolan1") || iName.equals("herasyndulla1") || iName.equals("nrn991")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logomalinzathanas")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logomalinzathanas());

						} else if (iName.equals("nautolan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nautolan1());

						} else if (iName.equals("herasyndulla1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.herasyndulla1());

						} else if (iName.equals("nrn991")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nrn991());

						}
					}
				});
				return true;
			}
			if (iName.equals("arc1701") || iName.equals("coruscantbattle") || iName.equals("ig86") || iName.equals("anakin14")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("arc1701")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.arc1701());

						} else if (iName.equals("coruscantbattle")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.coruscantbattle());

						} else if (iName.equals("ig86")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ig86());

						} else if (iName.equals("anakin14")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anakin14());

						}
					}
				});
				return true;
			}
			if (iName.equals("panaka1") || iName.equals("oversectorouter6ay") || iName.equals("cereen1") || iName.equals("tx202")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("panaka1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.panaka1());

						} else if (iName.equals("oversectorouter6ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.oversectorouter6ay());

						} else if (iName.equals("cereen1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cereen1());

						} else if (iName.equals("tx202")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tx202());

						}
					}
				});
				return true;
			}
			if (iName.equals("shaekodayoung") || iName.equals("feylya3") || iName.equals("darktalon1") || iName.equals("yaddledeath")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("shaekodayoung")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shaekodayoung());

						} else if (iName.equals("feylya3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.feylya3());

						} else if (iName.equals("darktalon1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darktalon1());

						} else if (iName.equals("yaddledeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.yaddledeath());

						}
					}
				});
				return true;
			}
			if (iName.equals("tatooine1") || iName.equals("newjediorder1") || iName.equals("repbattle") || iName.equals("cadesith")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("tatooine1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tatooine1());

						} else if (iName.equals("newjediorder1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.newjediorder1());

						} else if (iName.equals("repbattle")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.repbattle());

						} else if (iName.equals("cadesith")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cadesith());

						}
					}
				});
				return true;
			}
			if (iName.equals("fgaltriumvirat") || iName.equals("shaekoda1") || iName.equals("vurk1") || iName.equals("cassusfett1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("fgaltriumvirat")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.fgaltriumvirat());

						} else if (iName.equals("shaekoda1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shaekoda1());

						} else if (iName.equals("vurk1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vurk1());

						} else if (iName.equals("cassusfett1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cassusfett1());

						}
					}
				});
				return true;
			}
			if (iName.equals("ghost2") || iName.equals("mite1") || iName.equals("krrsantan2") || iName.equals("ladyluck1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ghost2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ghost2());

						} else if (iName.equals("mite1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mite1());

						} else if (iName.equals("krrsantan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.krrsantan2());

						} else if (iName.equals("ladyluck1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ladyluck1());

						}
					}
				});
				return true;
			}
			if (iName.equals("mustafarmassacre") || iName.equals("freedonnadd2") || iName.equals("allianceterritoriescenter8ay") || iName.equals("sdrecusant1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("mustafarmassacre")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mustafarmassacre());

						} else if (iName.equals("freedonnadd2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.freedonnadd2());

						} else if (iName.equals("allianceterritoriescenter8ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.allianceterritoriescenter8ay());

						} else if (iName.equals("sdrecusant1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdrecusant1());

						}
					}
				});
				return true;
			}
			if (iName.equals("polismassa1") || iName.equals("tasharyo2") || iName.equals("harrar1") || iName.equals("cayarm")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("polismassa1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.polismassa1());

						} else if (iName.equals("tasharyo2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tasharyo2());

						} else if (iName.equals("harrar1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.harrar1());

						} else if (iName.equals("cayarm")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cayarm());

						}
					}
				});
				return true;
			}
			if (iName.equals("ewok1") || iName.equals("droidbuzz1") || iName.equals("cayqeldroma1") || iName.equals("devaron2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ewok1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ewok1());

						} else if (iName.equals("droidbuzz1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.droidbuzz1());

						} else if (iName.equals("cayqeldroma1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cayqeldroma1());

						} else if (iName.equals("devaron2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.devaron2());

						}
					}
				});
				return true;
			}
			if (iName.equals("diamond1") || iName.equals("sithspacenorth1000by") || iName.equals("talonkarrde1") || iName.equals("sdvenator1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("diamond1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.diamond1());

						} else if (iName.equals("sithspacenorth1000by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sithspacenorth1000by());

						} else if (iName.equals("talonkarrde1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.talonkarrde1());

						} else if (iName.equals("sdvenator1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdvenator1());

						}
					}
				});
				return true;
			}
			if (iName.equals("logorougeorgana") || iName.equals("iego1") || iName.equals("ezraondo") || iName.equals("marasiahheir")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logorougeorgana")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logorougeorgana());

						} else if (iName.equals("iego1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.iego1());

						} else if (iName.equals("ezraondo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ezraondo());

						} else if (iName.equals("marasiahheir")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.marasiahheir());

						}
					}
				});
				return true;
			}
			if (iName.equals("padme6") || iName.equals("ithorian2") || iName.equals("pilotetie1") || iName.equals("rockettrooper2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("padme6")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.padme6());

						} else if (iName.equals("ithorian2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ithorian2());

						} else if (iName.equals("pilotetie1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.pilotetie1());

						} else if (iName.equals("rockettrooper2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rockettrooper2());

						}
					}
				});
				return true;
			}
			if (iName.equals("bwing2") || iName.equals("r2d2trav") || iName.equals("twilek2") || iName.equals("uhumele1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("bwing2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bwing2());

						} else if (iName.equals("r2d2trav")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2d2trav());

						} else if (iName.equals("twilek2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.twilek2());

						} else if (iName.equals("uhumele1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.uhumele1());

						}
					}
				});
				return true;
			}
			if (iName.equals("sdmc1041") || iName.equals("dunmoch") || iName.equals("clonetrooper1") || iName.equals("anzati2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("sdmc1041")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdmc1041());

						} else if (iName.equals("dunmoch")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dunmoch());

						} else if (iName.equals("clonetrooper1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.clonetrooper1());

						} else if (iName.equals("anzati2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anzati2());

						}
					}
				});
				return true;
			}
			if (iName.equals("lokdurd2") || iName.equals("fregatescythe2") || iName.equals("logoruffyage") || iName.equals("devastator2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("lokdurd2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lokdurd2());

						} else if (iName.equals("fregatescythe2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.fregatescythe2());

						} else if (iName.equals("logoruffyage")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoruffyage());

						} else if (iName.equals("devastator2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.devastator2());

						}
					}
				});
				return true;
			}
			if (iName.equals("grakkus2") || iName.equals("darkzannah2") || iName.equals("cartography") || iName.equals("runehaako1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("grakkus2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.grakkus2());

						} else if (iName.equals("darkzannah2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkzannah2());

						} else if (iName.equals("cartography")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cartography());

						} else if (iName.equals("runehaako1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.runehaako1());

						}
					}
				});
				return true;
			}
			if (iName.equals("neti2") || iName.equals("wildkarrde1") || iName.equals("tionwar1") || iName.equals("r3s6")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("neti2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.neti2());

						} else if (iName.equals("wildkarrde1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.wildkarrde1());

						} else if (iName.equals("tionwar1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tionwar1());

						} else if (iName.equals("r3s6")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r3s6());

						}
					}
				});
				return true;
			}
			if (iName.equals("carthonasi1") || iName.equals("niman") || iName.equals("annihilatorfighter1") || iName.equals("space")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("carthonasi1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.carthonasi1());

						} else if (iName.equals("niman")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.niman());

						} else if (iName.equals("annihilatorfighter1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.annihilatorfighter1());

						} else if (iName.equals("space")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.space());

						}
					}
				});
				return true;
			}
			if (iName.equals("newrepublic2") || iName.equals("logofelfather") || iName.equals("mandalorianships") || iName.equals("nerf1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("newrepublic2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.newrepublic2());

						} else if (iName.equals("logofelfather")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logofelfather());

						} else if (iName.equals("mandalorianships")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mandalorianships());

						} else if (iName.equals("nerf1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nerf1());

						}
					}
				});
				return true;
			}
			if (iName.equals("kolfight") || iName.equals("kraytthrone") || iName.equals("anakin21") || iName.equals("impbattle")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kolfight")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kolfight());

						} else if (iName.equals("kraytthrone")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kraytthrone());

						} else if (iName.equals("anakin21")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anakin21());

						} else if (iName.equals("impbattle")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.impbattle());

						}
					}
				});
				return true;
			}
			if (iName.equals("calixtefamily") || iName.equals("hapes2") || iName.equals("vandar3") || iName.equals("nefroyal2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("calixtefamily")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.calixtefamily());

						} else if (iName.equals("hapes2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hapes2());

						} else if (iName.equals("vandar3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vandar3());

						} else if (iName.equals("nefroyal2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nefroyal2());

						}
					}
				});
				return true;
			}
			if (iName.equals("homeimagetie") || iName.equals("onderon2") || iName.equals("serra1") || iName.equals("finnjakku")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("homeimagetie")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.homeimagetie());

						} else if (iName.equals("onderon2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.onderon2());

						} else if (iName.equals("serra1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.serra1());

						} else if (iName.equals("finnjakku")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.finnjakku());

						}
					}
				});
				return true;
			}
			if (iName.equals("brentaal1") || iName.equals("sando1") || iName.equals("gran1") || iName.equals("deathwatch2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("brentaal1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.brentaal1());

						} else if (iName.equals("sando1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sando1());

						} else if (iName.equals("gran1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gran1());

						} else if (iName.equals("deathwatch2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.deathwatch2());

						}
					}
				});
				return true;
			}
			if (iName.equals("ikrit1") || iName.equals("selonian2") || iName.equals("chalactan2") || iName.equals("voxyn1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ikrit1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ikrit1());

						} else if (iName.equals("selonian2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.selonian2());

						} else if (iName.equals("chalactan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chalactan2());

						} else if (iName.equals("voxyn1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.voxyn1());

						}
					}
				});
				return true;
			}
			if (iName.equals("biggs1") || iName.equals("anakin4") || iName.equals("logodarktraya") || iName.equals("ssdsovereign2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("biggs1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.biggs1());

						} else if (iName.equals("anakin4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anakin4());

						} else if (iName.equals("logodarktraya")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarktraya());

						} else if (iName.equals("ssdsovereign2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ssdsovereign2());

						}
					}
				});
				return true;
			}
			if (iName.equals("logotychocelchu") || iName.equals("yaraelpoof2") || iName.equals("logovilia") || iName.equals("revanmalak")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logotychocelchu")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logotychocelchu());

						} else if (iName.equals("yaraelpoof2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.yaraelpoof2());

						} else if (iName.equals("logovilia")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logovilia());

						} else if (iName.equals("revanmalak")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.revanmalak());

						}
					}
				});
				return true;
			}
			if (iName.equals("toydarian2") || iName.equals("ssdeclipse1") || iName.equals("ahsokavador") || iName.equals("arcsoldier2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("toydarian2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.toydarian2());

						} else if (iName.equals("ssdeclipse1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ssdeclipse1());

						} else if (iName.equals("ahsokavador")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ahsokavador());

						} else if (iName.equals("arcsoldier2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.arcsoldier2());

						}
					}
				});
				return true;
			}
			if (iName.equals("dianoga2") || iName.equals("allianceterritoriessouth8ay") || iName.equals("rebelmilitary") || iName.equals("repssd")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("dianoga2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dianoga2());

						} else if (iName.equals("allianceterritoriessouth8ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.allianceterritoriessouth8ay());

						} else if (iName.equals("rebelmilitary")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rebelmilitary());

						} else if (iName.equals("repssd")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.repssd());

						}
					}
				});
				return true;
			}
			if (iName.equals("volt1") || iName.equals("yodaclones") || iName.equals("darkazard3") || iName.equals("blasterdl441")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("volt1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.volt1());

						} else if (iName.equals("yodaclones")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.yodaclones());

						} else if (iName.equals("darkazard3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkazard3());

						} else if (iName.equals("blasterdl441")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.blasterdl441());

						}
					}
				});
				return true;
			}
			if (iName.equals("tanktx2") || iName.equals("gamorr2") || iName.equals("thoughtbomb") || iName.equals("caamasdoc4")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("tanktx2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tanktx2());

						} else if (iName.equals("gamorr2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gamorr2());

						} else if (iName.equals("thoughtbomb")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.thoughtbomb());

						} else if (iName.equals("caamasdoc4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.caamasdoc4());

						}
					}
				});
				return true;
			}
			if (iName.equals("flametrooper2") || iName.equals("moncalamari2") || iName.equals("sdacclamator2") || iName.equals("sddragon1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("flametrooper2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.flametrooper2());

						} else if (iName.equals("moncalamari2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.moncalamari2());

						} else if (iName.equals("sdacclamator2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdacclamator2());

						} else if (iName.equals("sddragon1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sddragon1());

						}
					}
				});
				return true;
			}
			if (iName.equals("faucon2") || iName.equals("plokoon2") || iName.equals("galak3") || iName.equals("hankillik")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("faucon2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.faucon2());

						} else if (iName.equals("plokoon2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.plokoon2());

						} else if (iName.equals("galak3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.galak3());

						} else if (iName.equals("hankillik")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hankillik());

						}
					}
				});
				return true;
			}
			if (iName.equals("aquilaris2") || iName.equals("tiepredator2") || iName.equals("florrum1") || iName.equals("ruusan1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("aquilaris2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.aquilaris2());

						} else if (iName.equals("tiepredator2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tiepredator2());

						} else if (iName.equals("florrum1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.florrum1());

						} else if (iName.equals("ruusan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ruusan1());

						}
					}
				});
				return true;
			}
			if (iName.equals("sevensister1") || iName.equals("kaminoan1") || iName.equals("luke4") || iName.equals("sabine3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("sevensister1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sevensister1());

						} else if (iName.equals("kaminoan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kaminoan1());

						} else if (iName.equals("luke4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.luke4());

						} else if (iName.equals("sabine3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sabine3());

						}
					}
				});
				return true;
			}
			if (iName.equals("bb82") || iName.equals("tridroidfighter2") || iName.equals("logosatalketo") || iName.equals("logosevrancetann")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("bb82")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bb82());

						} else if (iName.equals("tridroidfighter2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tridroidfighter2());

						} else if (iName.equals("logosatalketo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logosatalketo());

						} else if (iName.equals("logosevrancetann")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logosevrancetann());

						}
					}
				});
				return true;
			}
			if (iName.equals("jedipeople") || iName.equals("roanfel5") || iName.equals("rebelposter") || iName.equals("imperialsd")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("jedipeople")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jedipeople());

						} else if (iName.equals("roanfel5")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.roanfel5());

						} else if (iName.equals("rebelposter")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rebelposter());

						} else if (iName.equals("imperialsd")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.imperialsd());

						}
					}
				});
				return true;
			}
			if (iName.equals("c3po1") || iName.equals("harrontavus1") || iName.equals("obiwan5") || iName.equals("rey1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("c3po1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.c3po1());

						} else if (iName.equals("harrontavus1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.harrontavus1());

						} else if (iName.equals("obiwan5")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.obiwan5());

						} else if (iName.equals("rey1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rey1());

						}
					}
				});
				return true;
			}
			if (iName.equals("trandoshan1") || iName.equals("hardcell2") || iName.equals("shadorescue") || iName.equals("asajjenigma")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("trandoshan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.trandoshan1());

						} else if (iName.equals("hardcell2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hardcell2());

						} else if (iName.equals("shadorescue")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shadorescue());

						} else if (iName.equals("asajjenigma")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.asajjenigma());

						}
					}
				});
				return true;
			}
			if (iName.equals("weequay2") || iName.equals("landoreb") || iName.equals("rebelpolitic") || iName.equals("mirialan1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("weequay2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.weequay2());

						} else if (iName.equals("landoreb")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.landoreb());

						} else if (iName.equals("rebelpolitic")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rebelpolitic());

						} else if (iName.equals("mirialan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mirialan1());

						}
					}
				});
				return true;
			}
			if (iName.equals("vjun2") || iName.equals("ardenlyn1") || iName.equals("zaynejarael") || iName.equals("bossnass1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("vjun2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vjun2());

						} else if (iName.equals("ardenlyn1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ardenlyn1());

						} else if (iName.equals("zaynejarael")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zaynejarael());

						} else if (iName.equals("bossnass1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bossnass1());

						}
					}
				});
				return true;
			}
			if (iName.equals("shumai1") || iName.equals("kraytvong") || iName.equals("alora1") || iName.equals("sdprovidence1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("shumai1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shumai1());

						} else if (iName.equals("kraytvong")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kraytvong());

						} else if (iName.equals("alora1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.alora1());

						} else if (iName.equals("sdprovidence1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdprovidence1());

						}
					}
				});
				return true;
			}
			if (iName.equals("fambaa2") || iName.equals("luminaraunduli5") || iName.equals("outlawships") || iName.equals("korunnai2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("fambaa2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.fambaa2());

						} else if (iName.equals("luminaraunduli5")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.luminaraunduli5());

						} else if (iName.equals("outlawships")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.outlawships());

						} else if (iName.equals("korunnai2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.korunnai2());

						}
					}
				});
				return true;
			}
			if (iName.equals("jainavsvestara") || iName.equals("r7a7") || iName.equals("shaekoda3") || iName.equals("ahsoka1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("jainavsvestara")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jainavsvestara());

						} else if (iName.equals("r7a7")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r7a7());

						} else if (iName.equals("shaekoda3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shaekoda3());

						} else if (iName.equals("ahsoka1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ahsoka1());

						}
					}
				});
				return true;
			}
			if (iName.equals("luciendraaybad") || iName.equals("thrawn1") || iName.equals("nalhutta1") || iName.equals("jainajacenbirth")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("luciendraaybad")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.luciendraaybad());

						} else if (iName.equals("thrawn1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.thrawn1());

						} else if (iName.equals("nalhutta1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nalhutta1());

						} else if (iName.equals("jainajacenbirth")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jainajacenbirth());

						}
					}
				});
				return true;
			}
			if (iName.equals("imperialmilitary") || iName.equals("gulin1") || iName.equals("csifighters") || iName.equals("dackralter2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("imperialmilitary")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.imperialmilitary());

						} else if (iName.equals("gulin1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gulin1());

						} else if (iName.equals("csifighters")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.csifighters());

						} else if (iName.equals("dackralter2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dackralter2());

						}
					}
				});
				return true;
			}
			if (iName.equals("superlaser3") || iName.equals("palpatinecylo") || iName.equals("plokoon4") || iName.equals("tstt2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("superlaser3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.superlaser3());

						} else if (iName.equals("palpatinecylo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.palpatinecylo());

						} else if (iName.equals("plokoon4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.plokoon4());

						} else if (iName.equals("tstt2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tstt2());

						}
					}
				});
				return true;
			}
			if (iName.equals("logokarnessmuur") || iName.equals("chopper1") || iName.equals("chopperblack") || iName.equals("exogorth2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logokarnessmuur")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logokarnessmuur());

						} else if (iName.equals("chopper1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chopper1());

						} else if (iName.equals("chopperblack")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chopperblack());

						} else if (iName.equals("exogorth2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.exogorth2());

						}
					}
				});
				return true;
			}
			if (iName.equals("aleemaketo3") || iName.equals("gannerend") || iName.equals("r2d2saveanakin") || iName.equals("legends")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("aleemaketo3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.aleemaketo3());

						} else if (iName.equals("gannerend")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gannerend());

						} else if (iName.equals("r2d2saveanakin")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2d2saveanakin());

						} else if (iName.equals("legends")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.legends());

						}
					}
				});
				return true;
			}
			if (iName.equals("vulta1") || iName.equals("c3poluke") || iName.equals("muunilinst1") || iName.equals("xesh4")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("vulta1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vulta1());

						} else if (iName.equals("c3poluke")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.c3poluke());

						} else if (iName.equals("muunilinst1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.muunilinst1());

						} else if (iName.equals("xesh4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.xesh4());

						}
					}
				});
				return true;
			}
			if (iName.equals("kanantie") || iName.equals("ginivex1") || iName.equals("chrometrooper2") || iName.equals("r2d2tatooine")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kanantie")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kanantie());

						} else if (iName.equals("ginivex1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ginivex1());

						} else if (iName.equals("chrometrooper2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chrometrooper2());

						} else if (iName.equals("r2d2tatooine")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2d2tatooine());

						}
					}
				});
				return true;
			}
			if (iName.equals("nagasadow2") || iName.equals("species") || iName.equals("moniagahan1") || iName.equals("marasiahvendaxa")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("nagasadow2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nagasadow2());

						} else if (iName.equals("species")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.species());

						} else if (iName.equals("moniagahan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.moniagahan1());

						} else if (iName.equals("marasiahvendaxa")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.marasiahvendaxa());

						}
					}
				});
				return true;
			}
			if (iName.equals("wookie1") || iName.equals("thule2") || iName.equals("duelontython") || iName.equals("deathstar1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("wookie1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.wookie1());

						} else if (iName.equals("thule2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.thule2());

						} else if (iName.equals("duelontython")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.duelontython());

						} else if (iName.equals("deathstar1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.deathstar1());

						}
					}
				});
				return true;
			}
			if (iName.equals("darkbanevszannah") || iName.equals("juggernaut1") || iName.equals("vulisen3") || iName.equals("echuu1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("darkbanevszannah")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkbanevszannah());

						} else if (iName.equals("juggernaut1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.juggernaut1());

						} else if (iName.equals("vulisen3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vulisen3());

						} else if (iName.equals("echuu1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.echuu1());

						}
					}
				});
				return true;
			}
			if (iName.equals("jariahsyn2") || iName.equals("teta2") || iName.equals("imperialstations") || iName.equals("clonetrtt1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("jariahsyn2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jariahsyn2());

						} else if (iName.equals("teta2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.teta2());

						} else if (iName.equals("imperialstations")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.imperialstations());

						} else if (iName.equals("clonetrtt1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.clonetrtt1());

						}
					}
				});
				return true;
			}
			if (iName.equals("c3pochewie") || iName.equals("banshee1") || iName.equals("logocoldwar") || iName.equals("canoniererep2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("c3pochewie")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.c3pochewie());

						} else if (iName.equals("banshee1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.banshee1());

						} else if (iName.equals("logocoldwar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logocoldwar());

						} else if (iName.equals("canoniererep2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.canoniererep2());

						}
					}
				});
				return true;
			}
			if (iName.equals("colemantrebor1") || iName.equals("logoleiaskywalker") || iName.equals("sehadorvald1") || iName.equals("typho1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("colemantrebor1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.colemantrebor1());

						} else if (iName.equals("logoleiaskywalker")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoleiaskywalker());

						} else if (iName.equals("sehadorvald1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sehadorvald1());

						} else if (iName.equals("typho1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.typho1());

						}
					}
				});
				return true;
			}
			if (iName.equals("carnorjax3") || iName.equals("monmothma2") || iName.equals("voss1") || iName.equals("bok2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("carnorjax3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.carnorjax3());

						} else if (iName.equals("monmothma2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.monmothma2());

						} else if (iName.equals("voss1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.voss1());

						} else if (iName.equals("bok2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bok2());

						}
					}
				});
				return true;
			}
			if (iName.equals("ysanneisard1") || iName.equals("r2d2geonosis") || iName.equals("tholmevsdooku") || iName.equals("bastion1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ysanneisard1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ysanneisard1());

						} else if (iName.equals("r2d2geonosis")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2d2geonosis());

						} else if (iName.equals("tholmevsdooku")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tholmevsdooku());

						} else if (iName.equals("bastion1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bastion1());

						}
					}
				});
				return true;
			}
			if (iName.equals("dexter1") || iName.equals("massassi2") || iName.equals("aiwha1") || iName.equals("galacticempire3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("dexter1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dexter1());

						} else if (iName.equals("massassi2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.massassi2());

						} else if (iName.equals("aiwha1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.aiwha1());

						} else if (iName.equals("galacticempire3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.galacticempire3());

						}
					}
				});
				return true;
			}
			if (iName.equals("attonrand1") || iName.equals("treissinde2") || iName.equals("rebelsd") || iName.equals("makashi")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("attonrand1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.attonrand1());

						} else if (iName.equals("treissinde2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.treissinde2());

						} else if (iName.equals("rebelsd")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rebelsd());

						} else if (iName.equals("makashi")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.makashi());

						}
					}
				});
				return true;
			}
			if (iName.equals("anakin2") || iName.equals("vuarapuung2") || iName.equals("kosulayada1") || iName.equals("octaramis1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("anakin2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anakin2());

						} else if (iName.equals("vuarapuung2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vuarapuung2());

						} else if (iName.equals("kosulayada1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kosulayada1());

						} else if (iName.equals("octaramis1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.octaramis1());

						}
					}
				});
				return true;
			}
			if (iName.equals("nexu2") || iName.equals("corvette1") || iName.equals("chevin2") || iName.equals("magnaguard2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("nexu2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nexu2());

						} else if (iName.equals("corvette1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.corvette1());

						} else if (iName.equals("chevin2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chevin2());

						} else if (iName.equals("magnaguard2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.magnaguard2());

						}
					}
				});
				return true;
			}
			if (iName.equals("r4p17") || iName.equals("logoodion") || iName.equals("sithspacenothwest1000by") || iName.equals("materials")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("r4p17")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r4p17());

						} else if (iName.equals("logoodion")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoodion());

						} else if (iName.equals("sithspacenothwest1000by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sithspacenothwest1000by());

						} else if (iName.equals("materials")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.materials());

						}
					}
				});
				return true;
			}
			if (iName.equals("hanchewieold") || iName.equals("ketu1") || iName.equals("obiwancrash1") || iName.equals("sullust1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("hanchewieold")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hanchewieold());

						} else if (iName.equals("ketu1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ketu1());

						} else if (iName.equals("obiwancrash1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.obiwancrash1());

						} else if (iName.equals("sullust1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sullust1());

						}
					}
				});
				return true;
			}
			if (iName.equals("sateleold") || iName.equals("ghostcrew6") || iName.equals("taviondesann") || iName.equals("quigonyoung")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("sateleold")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sateleold());

						} else if (iName.equals("ghostcrew6")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ghostcrew6());

						} else if (iName.equals("taviondesann")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.taviondesann());

						} else if (iName.equals("quigonyoung")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.quigonyoung());

						}
					}
				});
				return true;
			}
			if (iName.equals("beyghor1") || iName.equals("galacticempire8ay") || iName.equals("djemso") || iName.equals("c3porodia")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("beyghor1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.beyghor1());

						} else if (iName.equals("galacticempire8ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.galacticempire8ay());

						} else if (iName.equals("djemso")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.djemso());

						} else if (iName.equals("c3porodia")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.c3porodia());

						}
					}
				});
				return true;
			}
			if (iName.equals("coreship2") || iName.equals("carthonasi3") || iName.equals("poedameron1") || iName.equals("ta175")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("coreship2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.coreship2());

						} else if (iName.equals("carthonasi3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.carthonasi3());

						} else if (iName.equals("poedameron1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.poedameron1());

						} else if (iName.equals("ta175")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ta175());

						}
					}
				});
				return true;
			}
			if (iName.equals("bomo1") || iName.equals("asajjventresshurt") || iName.equals("setharth1") || iName.equals("celestekrayt")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("bomo1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bomo1());

						} else if (iName.equals("asajjventresshurt")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.asajjventresshurt());

						} else if (iName.equals("setharth1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.setharth1());

						} else if (iName.equals("celestekrayt")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.celestekrayt());

						}
					}
				});
				return true;
			}
			if (iName.equals("palpatinechildt") || iName.equals("logodarksion") || iName.equals("bokatanobiwan") || iName.equals("huyang1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("palpatinechildt")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.palpatinechildt());

						} else if (iName.equals("logodarksion")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarksion());

						} else if (iName.equals("bokatanobiwan")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bokatanobiwan());

						} else if (iName.equals("huyang1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.huyang1());

						}
					}
				});
				return true;
			}
			if (iName.equals("acklay1") || iName.equals("joolcade") || iName.equals("miraluka1") || iName.equals("bongo1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("acklay1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.acklay1());

						} else if (iName.equals("joolcade")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.joolcade());

						} else if (iName.equals("miraluka1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.miraluka1());

						} else if (iName.equals("bongo1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bongo1());

						}
					}
				});
				return true;
			}
			if (iName.equals("hanlando2") || iName.equals("xamardeath") || iName.equals("karnessmuur2") || iName.equals("han1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("hanlando2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hanlando2());

						} else if (iName.equals("xamardeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.xamardeath());

						} else if (iName.equals("karnessmuur2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.karnessmuur2());

						} else if (iName.equals("han1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.han1());

						}
					}
				});
				return true;
			}
			if (iName.equals("blasterrifledc151") || iName.equals("xamardream") || iName.equals("protodroid1") || iName.equals("tesvevec1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("blasterrifledc151")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.blasterrifledc151());

						} else if (iName.equals("xamardream")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.xamardream());

						} else if (iName.equals("protodroid1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.protodroid1());

						} else if (iName.equals("tesvevec1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tesvevec1());

						}
					}
				});
				return true;
			}
			if (iName.equals("masamedda1") || iName.equals("logoarkadia") || iName.equals("jainaallana") || iName.equals("ugnaught1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("masamedda1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.masamedda1());

						} else if (iName.equals("logoarkadia")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoarkadia());

						} else if (iName.equals("jainaallana")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jainaallana());

						} else if (iName.equals("ugnaught1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ugnaught1());

						}
					}
				});
				return true;
			}
			if (iName.equals("chewiecymoon") || iName.equals("obiwan11") || iName.equals("sabine1") || iName.equals("snoke1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("chewiecymoon")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chewiecymoon());

						} else if (iName.equals("obiwan11")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.obiwan11());

						} else if (iName.equals("sabine1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sabine1());

						} else if (iName.equals("snoke1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.snoke1());

						}
					}
				});
				return true;
			}
			if (iName.equals("lothal2") || iName.equals("reptransports") || iName.equals("sdpellaeon1") || iName.equals("eethkoth1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("lothal2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lothal2());

						} else if (iName.equals("reptransports")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.reptransports());

						} else if (iName.equals("sdpellaeon1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdpellaeon1());

						} else if (iName.equals("eethkoth1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.eethkoth1());

						}
					}
				});
				return true;
			}
			if (iName.equals("quinlanvosdooku") || iName.equals("galacticempire6ay") || iName.equals("sebulba2") || iName.equals("previzsla2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("quinlanvosdooku")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.quinlanvosdooku());

						} else if (iName.equals("galacticempire6ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.galacticempire6ay());

						} else if (iName.equals("sebulba2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sebulba2());

						} else if (iName.equals("previzsla2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.previzsla2());

						}
					}
				});
				return true;
			}
			if (iName.equals("cody2") || iName.equals("obiwan7") || iName.equals("droidpeople") || iName.equals("savage1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("cody2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cody2());

						} else if (iName.equals("obiwan7")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.obiwan7());

						} else if (iName.equals("droidpeople")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.droidpeople());

						} else if (iName.equals("savage1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.savage1());

						}
					}
				});
				return true;
			}
			if (iName.equals("blackholetrooper2") || iName.equals("hailfire2") || iName.equals("sharabey2") || iName.equals("hyperespace2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("blackholetrooper2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.blackholetrooper2());

						} else if (iName.equals("hailfire2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hailfire2());

						} else if (iName.equals("sharabey2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sharabey2());

						} else if (iName.equals("hyperespace2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hyperespace2());

						}
					}
				});
				return true;
			}
			if (iName.equals("chissspace") || iName.equals("tsavonglah1") || iName.equals("anyakuro2") || iName.equals("malachorv2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("chissspace")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chissspace());

						} else if (iName.equals("tsavonglah1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tsavonglah1());

						} else if (iName.equals("anyakuro2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anyakuro2());

						} else if (iName.equals("malachorv2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.malachorv2());

						}
					}
				});
				return true;
			}
			if (iName.equals("kananblind") || iName.equals("greedodeath") || iName.equals("concordia2") || iName.equals("vitiate3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kananblind")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kananblind());

						} else if (iName.equals("greedodeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.greedodeath());

						} else if (iName.equals("concordia2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.concordia2());

						} else if (iName.equals("vitiate3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vitiate3());

						}
					}
				});
				return true;
			}
			if (iName.equals("darktalonkrayt") || iName.equals("ornfreetaa2") || iName.equals("logosecondgreatschisme") || iName.equals("anakin23")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("darktalonkrayt")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darktalonkrayt());

						} else if (iName.equals("ornfreetaa2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ornfreetaa2());

						} else if (iName.equals("logosecondgreatschisme")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logosecondgreatschisme());

						} else if (iName.equals("anakin23")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anakin23());

						}
					}
				});
				return true;
			}
			if (iName.equals("gamorrean1") || iName.equals("sorabulq2") || iName.equals("rakata3") || iName.equals("droidb12")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("gamorrean1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gamorrean1());

						} else if (iName.equals("sorabulq2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sorabulq2());

						} else if (iName.equals("rakata3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rakata3());

						} else if (iName.equals("droidb12")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.droidb12());

						}
					}
				});
				return true;
			}
			if (iName.equals("darkangral2") || iName.equals("hux1") || iName.equals("nabooinvasion") || iName.equals("chrometrooper1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("darkangral2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkangral2());

						} else if (iName.equals("hux1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hux1());

						} else if (iName.equals("nabooinvasion")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nabooinvasion());

						} else if (iName.equals("chrometrooper1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chrometrooper1());

						}
					}
				});
				return true;
			}
			if (iName.equals("ataimolec1") || iName.equals("ezra3") || iName.equals("valenthynefarfalla1") || iName.equals("kaadu1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ataimolec1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ataimolec1());

						} else if (iName.equals("ezra3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ezra3());

						} else if (iName.equals("valenthynefarfalla1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.valenthynefarfalla1());

						} else if (iName.equals("kaadu1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kaadu1());

						}
					}
				});
				return true;
			}
			if (iName.equals("kiros1") || iName.equals("logoruweenaberrie") || iName.equals("nikto1") || iName.equals("tukata2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kiros1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kiros1());

						} else if (iName.equals("logoruweenaberrie")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoruweenaberrie());

						} else if (iName.equals("nikto1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nikto1());

						} else if (iName.equals("tukata2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tukata2());

						}
					}
				});
				return true;
			}
			if (iName.equals("kryndaold") || iName.equals("naboo3") || iName.equals("hadabbadon1") || iName.equals("tiespecfo1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kryndaold")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kryndaold());

						} else if (iName.equals("naboo3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.naboo3());

						} else if (iName.equals("hadabbadon1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hadabbadon1());

						} else if (iName.equals("tiespecfo1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tiespecfo1());

						}
					}
				});
				return true;
			}
			if (iName.equals("ezravador") || iName.equals("ortolan1") || iName.equals("tiefo1") || iName.equals("keyanfarlander1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ezravador")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ezravador());

						} else if (iName.equals("ortolan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ortolan1());

						} else if (iName.equals("tiefo1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tiefo1());

						} else if (iName.equals("keyanfarlander1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.keyanfarlander1());

						}
					}
				});
				return true;
			}
			if (iName.equals("jabiim2") || iName.equals("dug2") || iName.equals("sheathipede1") || iName.equals("leiaresistance")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("jabiim2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jabiim2());

						} else if (iName.equals("dug2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dug2());

						} else if (iName.equals("sheathipede1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sheathipede1());

						} else if (iName.equals("leiaresistance")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.leiaresistance());

						}
					}
				});
				return true;
			}
			if (iName.equals("aurrahunt") || iName.equals("chadrafan1") || iName.equals("xesh2") || iName.equals("canonsonique1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("aurrahunt")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.aurrahunt());

						} else if (iName.equals("chadrafan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chadrafan1());

						} else if (iName.equals("xesh2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.xesh2());

						} else if (iName.equals("canonsonique1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.canonsonique1());

						}
					}
				});
				return true;
			}
			if (iName.equals("civilvehicles") || iName.equals("riyochuchi3") || iName.equals("calonord1") || iName.equals("deathstar2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("civilvehicles")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.civilvehicles());

						} else if (iName.equals("riyochuchi3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.riyochuchi3());

						} else if (iName.equals("calonord1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.calonord1());

						} else if (iName.equals("deathstar2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.deathstar2());

						}
					}
				});
				return true;
			}
			if (iName.equals("qurahn1") || iName.equals("eternalempire1") || iName.equals("pogglethebrief2") || iName.equals("bt11")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("qurahn1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.qurahn1());

						} else if (iName.equals("eternalempire1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.eternalempire1());

						} else if (iName.equals("pogglethebrief2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.pogglethebrief2());

						} else if (iName.equals("bt11")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bt11());

						}
					}
				});
				return true;
			}
			if (iName.equals("hazardtrooper1") || iName.equals("garstazi1") || iName.equals("johunothone1") || iName.equals("stap2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("hazardtrooper1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hazardtrooper1());

						} else if (iName.equals("garstazi1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.garstazi1());

						} else if (iName.equals("johunothone1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.johunothone1());

						} else if (iName.equals("stap2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.stap2());

						}
					}
				});
				return true;
			}
			if (iName.equals("antaresvendaxa") || iName.equals("kadriansey") || iName.equals("reparmy") || iName.equals("eethkoth3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("antaresvendaxa")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.antaresvendaxa());

						} else if (iName.equals("kadriansey")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kadriansey());

						} else if (iName.equals("reparmy")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.reparmy());

						} else if (iName.equals("eethkoth3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.eethkoth3());

						}
					}
				});
				return true;
			}
			if (iName.equals("rorifenn2") || iName.equals("nutoreena1") || iName.equals("holonet1") || iName.equals("leia3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("rorifenn2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rorifenn2());

						} else if (iName.equals("nutoreena1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nutoreena1());

						} else if (iName.equals("holonet1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.holonet1());

						} else if (iName.equals("leia3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.leia3());

						}
					}
				});
				return true;
			}
			if (iName.equals("r2d2narshaddaa") || iName.equals("cikatro2") || iName.equals("logoimperialcivilwar") || iName.equals("c3potantive")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("r2d2narshaddaa")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2d2narshaddaa());

						} else if (iName.equals("cikatro2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cikatro2());

						} else if (iName.equals("logoimperialcivilwar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoimperialcivilwar());

						} else if (iName.equals("c3potantive")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.c3potantive());

						}
					}
				});
				return true;
			}
			if (iName.equals("sarlacc2") || iName.equals("galacticempire9ay") || iName.equals("thexan1") || iName.equals("holoprojector")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("sarlacc2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sarlacc2());

						} else if (iName.equals("galacticempire9ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.galacticempire9ay());

						} else if (iName.equals("thexan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.thexan1());

						} else if (iName.equals("holoprojector")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.holoprojector());

						}
					}
				});
				return true;
			}
			if (iName.equals("logodarkmaul") || iName.equals("herahospital") || iName.equals("logocarnorjax") || iName.equals("bargetitan2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logodarkmaul")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarkmaul());

						} else if (iName.equals("herahospital")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.herahospital());

						} else if (iName.equals("logocarnorjax")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logocarnorjax());

						} else if (iName.equals("bargetitan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bargetitan2());

						}
					}
				});
				return true;
			}
			if (iName.equals("jaina2") || iName.equals("whormloathsom1") || iName.equals("dorvan1") || iName.equals("mustafar1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("jaina2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jaina2());

						} else if (iName.equals("whormloathsom1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.whormloathsom1());

						} else if (iName.equals("dorvan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dorvan1());

						} else if (iName.equals("mustafar1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mustafar1());

						}
					}
				});
				return true;
			}
			if (iName.equals("tanksismique2") || iName.equals("navettelambda2") || iName.equals("wa71") || iName.equals("c99791")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("tanksismique2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tanksismique2());

						} else if (iName.equals("navettelambda2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.navettelambda2());

						} else if (iName.equals("wa71")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.wa71());

						} else if (iName.equals("c99791")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.c99791());

						}
					}
				});
				return true;
			}
			if (iName.equals("darkmalak2") || iName.equals("wookie2") || iName.equals("stassalliedeath") || iName.equals("torvizsla1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("darkmalak2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkmalak2());

						} else if (iName.equals("wookie2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.wookie2());

						} else if (iName.equals("stassalliedeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.stassalliedeath());

						} else if (iName.equals("torvizsla1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.torvizsla1());

						}
					}
				});
				return true;
			}
			if (iName.equals("tz1") || iName.equals("ssdvengeance2") || iName.equals("hapanconsortium") || iName.equals("naschoka1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("tz1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tz1());

						} else if (iName.equals("ssdvengeance2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ssdvengeance2());

						} else if (iName.equals("hapanconsortium")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hapanconsortium());

						} else if (iName.equals("naschoka1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.naschoka1());

						}
					}
				});
				return true;
			}
			if (iName.equals("vanqor1") || iName.equals("daiman2") || iName.equals("corransabres") || iName.equals("vadoraphra")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("vanqor1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vanqor1());

						} else if (iName.equals("daiman2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.daiman2());

						} else if (iName.equals("corransabres")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.corransabres());

						} else if (iName.equals("vadoraphra")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vadoraphra());

						}
					}
				});
				return true;
			}
			if (iName.equals("vulisen1") || iName.equals("byss1") || iName.equals("praesitlyn2") || iName.equals("mandlegitime1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("vulisen1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vulisen1());

						} else if (iName.equals("byss1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.byss1());

						} else if (iName.equals("praesitlyn2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.praesitlyn2());

						} else if (iName.equals("mandlegitime1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mandlegitime1());

						}
					}
				});
				return true;
			}
			if (iName.equals("logokolskywalker") || iName.equals("dagobah2") || iName.equals("sdinexpugnable1") || iName.equals("obiwanlamasu")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logokolskywalker")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logokolskywalker());

						} else if (iName.equals("dagobah2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dagobah2());

						} else if (iName.equals("sdinexpugnable1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdinexpugnable1());

						} else if (iName.equals("obiwanlamasu")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.obiwanlamasu());

						}
					}
				});
				return true;
			}
			if (iName.equals("imperialtransports") || iName.equals("mezhankwaad1") || iName.equals("patititepattuna2") || iName.equals("logoscourge")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("imperialtransports")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.imperialtransports());

						} else if (iName.equals("mezhankwaad1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mezhankwaad1());

						} else if (iName.equals("patititepattuna2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.patititepattuna2());

						} else if (iName.equals("logoscourge")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoscourge());

						}
					}
				});
				return true;
			}
			if (iName.equals("kananhera") || iName.equals("tavus4") || iName.equals("han5") || iName.equals("alderaan1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kananhera")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kananhera());

						} else if (iName.equals("tavus4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tavus4());

						} else if (iName.equals("han5")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.han5());

						} else if (iName.equals("alderaan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.alderaan1());

						}
					}
				});
				return true;
			}
			if (iName.equals("ibaar1") || iName.equals("bakura1") || iName.equals("antaressith") || iName.equals("ysalamiri2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ibaar1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ibaar1());

						} else if (iName.equals("bakura1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bakura1());

						} else if (iName.equals("antaressith")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.antaressith());

						} else if (iName.equals("ysalamiri2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ysalamiri2());

						}
					}
				});
				return true;
			}
			if (iName.equals("aurasing1") || iName.equals("r2d2naboo1") || iName.equals("logokaan") || iName.equals("wedge2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("aurasing1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.aurasing1());

						} else if (iName.equals("r2d2naboo1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2d2naboo1());

						} else if (iName.equals("logokaan")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logokaan());

						} else if (iName.equals("wedge2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.wedge2());

						}
					}
				});
				return true;
			}
			if (iName.equals("alliancecorpo1") || iName.equals("chopperezra") || iName.equals("appo1") || iName.equals("tiefighter2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("alliancecorpo1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.alliancecorpo1());

						} else if (iName.equals("chopperezra")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chopperezra());

						} else if (iName.equals("appo1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.appo1());

						} else if (iName.equals("tiefighter2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tiefighter2());

						}
					}
				});
				return true;
			}
			if (iName.equals("kiranati1") || iName.equals("tbaa1") || iName.equals("salsolo2") || iName.equals("holocron3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kiranati1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kiranati1());

						} else if (iName.equals("tbaa1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tbaa1());

						} else if (iName.equals("salsolo2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.salsolo2());

						} else if (iName.equals("holocron3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.holocron3());

						}
					}
				});
				return true;
			}
			if (iName.equals("navetteministry1") || iName.equals("jiro1") || iName.equals("marisbrood2") || iName.equals("haazenreborn")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("navetteministry1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.navetteministry1());

						} else if (iName.equals("jiro1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jiro1());

						} else if (iName.equals("marisbrood2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.marisbrood2());

						} else if (iName.equals("haazenreborn")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.haazenreborn());

						}
					}
				});
				return true;
			}
			if (iName.equals("naboon12") || iName.equals("lictor2") || iName.equals("salsoloend") || iName.equals("bokatanplan")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("naboon12")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.naboon12());

						} else if (iName.equals("lictor2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lictor2());

						} else if (iName.equals("salsoloend")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.salsoloend());

						} else if (iName.equals("bokatanplan")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bokatanplan());

						}
					}
				});
				return true;
			}
			if (iName.equals("thisspiasien2") || iName.equals("ezravador2") || iName.equals("upsilon2") || iName.equals("galacticempire19by")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("thisspiasien2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.thisspiasien2());

						} else if (iName.equals("ezravador2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ezravador2());

						} else if (iName.equals("upsilon2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.upsilon2());

						} else if (iName.equals("galacticempire19by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.galacticempire19by());

						}
					}
				});
				return true;
			}
			if (iName.equals("mandlebref2") || iName.equals("shmideath") || iName.equals("rexgeonosis") || iName.equals("tmt3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("mandlebref2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mandlebref2());

						} else if (iName.equals("shmideath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shmideath());

						} else if (iName.equals("rexgeonosis")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rexgeonosis());

						} else if (iName.equals("tmt3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tmt3());

						}
					}
				});
				return true;
			}
			if (iName.equals("moffcouncil1") || iName.equals("taivas1") || iName.equals("speeder1") || iName.equals("blastere112")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("moffcouncil1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.moffcouncil1());

						} else if (iName.equals("taivas1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.taivas1());

						} else if (iName.equals("speeder1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.speeder1());

						} else if (iName.equals("blastere112")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.blastere112());

						}
					}
				});
				return true;
			}
			if (iName.equals("logodarkwar") || iName.equals("cd21") || iName.equals("hapes1") || iName.equals("ralltiir1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logodarkwar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarkwar());

						} else if (iName.equals("cd21")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cd21());

						} else if (iName.equals("hapes1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hapes1());

						} else if (iName.equals("ralltiir1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ralltiir1());

						}
					}
				});
				return true;
			}
			if (iName.equals("serenno2") || iName.equals("obiwan9") || iName.equals("chiss1") || iName.equals("obiwankenobi1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("serenno2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.serenno2());

						} else if (iName.equals("obiwan9")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.obiwan9());

						} else if (iName.equals("chiss1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chiss1());

						} else if (iName.equals("obiwankenobi1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.obiwankenobi1());

						}
					}
				});
				return true;
			}
			if (iName.equals("raydonia1") || iName.equals("sharadhett2") || iName.equals("zaynecarrick1") || iName.equals("rexumbara")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("raydonia1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.raydonia1());

						} else if (iName.equals("sharadhett2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sharadhett2());

						} else if (iName.equals("zaynecarrick1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zaynecarrick1());

						} else if (iName.equals("rexumbara")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rexumbara());

						}
					}
				});
				return true;
			}
			if (iName.equals("kypdurron3") || iName.equals("savage3") || iName.equals("logotrackansalsolo") || iName.equals("coburn2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kypdurron3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kypdurron3());

						} else if (iName.equals("savage3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.savage3());

						} else if (iName.equals("logotrackansalsolo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logotrackansalsolo());

						} else if (iName.equals("coburn2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.coburn2());

						}
					}
				});
				return true;
			}
			if (iName.equals("repulsion1") || iName.equals("logovisasmarr") || iName.equals("finnfight") || iName.equals("corellia2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("repulsion1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.repulsion1());

						} else if (iName.equals("logovisasmarr")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logovisasmarr());

						} else if (iName.equals("finnfight")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.finnfight());

						} else if (iName.equals("corellia2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.corellia2());

						}
					}
				});
				return true;
			}
			if (iName.equals("prentiochdominion4ay") || iName.equals("tarsusvalorum1") || iName.equals("snowtrooper2") || iName.equals("belbullab1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("prentiochdominion4ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.prentiochdominion4ay());

						} else if (iName.equals("tarsusvalorum1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tarsusvalorum1());

						} else if (iName.equals("snowtrooper2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.snowtrooper2());

						} else if (iName.equals("belbullab1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.belbullab1());

						}
					}
				});
				return true;
			}
			if (iName.equals("logodavinfel") || iName.equals("miraj1") || iName.equals("tauntaun2") || iName.equals("jediart2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logodavinfel")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodavinfel());

						} else if (iName.equals("miraj1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.miraj1());

						} else if (iName.equals("tauntaun2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tauntaun2());

						} else if (iName.equals("jediart2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jediart2());

						}
					}
				});
				return true;
			}
			if (iName.equals("dantooine2") || iName.equals("tieoppressor1") || iName.equals("tula1") || iName.equals("quigon1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("dantooine2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dantooine2());

						} else if (iName.equals("tieoppressor1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tieoppressor1());

						} else if (iName.equals("tula1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tula1());

						} else if (iName.equals("quigon1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.quigon1());

						}
					}
				});
				return true;
			}
			if (iName.equals("ezrabridger1") || iName.equals("logomarkaragnos") || iName.equals("logodarknihl") || iName.equals("logonewjediorder")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ezrabridger1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ezrabridger1());

						} else if (iName.equals("logomarkaragnos")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logomarkaragnos());

						} else if (iName.equals("logodarknihl")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarknihl());

						} else if (iName.equals("logonewjediorder")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logonewjediorder());

						}
					}
				});
				return true;
			}
			if (iName.equals("trackerspiderdroid1") || iName.equals("luciendraayadasca") || iName.equals("leia5") || iName.equals("galacticempire1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("trackerspiderdroid1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.trackerspiderdroid1());

						} else if (iName.equals("luciendraayadasca")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.luciendraayadasca());

						} else if (iName.equals("leia5")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.leia5());

						} else if (iName.equals("galacticempire1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.galacticempire1());

						}
					}
				});
				return true;
			}
			if (iName.equals("hoth2") || iName.equals("kitfistogrievous") || iName.equals("fivebrother1") || iName.equals("riyochuchi1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("hoth2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hoth2());

						} else if (iName.equals("kitfistogrievous")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kitfistogrievous());

						} else if (iName.equals("fivebrother1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.fivebrother1());

						} else if (iName.equals("riyochuchi1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.riyochuchi1());

						}
					}
				});
				return true;
			}
			if (iName.equals("logojacensolo") || iName.equals("logoxelian") || iName.equals("rodian1") || iName.equals("chopper5")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logojacensolo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logojacensolo());

						} else if (iName.equals("logoxelian")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoxelian());

						} else if (iName.equals("rodian1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rodian1());

						} else if (iName.equals("chopper5")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chopper5());

						}
					}
				});
				return true;
			}
			if (iName.equals("comlink1") || iName.equals("shaakti3") || iName.equals("sithwar2") || iName.equals("ezrainfiltre")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("comlink1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.comlink1());

						} else if (iName.equals("shaakti3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shaakti3());

						} else if (iName.equals("sithwar2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sithwar2());

						} else if (iName.equals("ezrainfiltre")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ezrainfiltre());

						}
					}
				});
				return true;
			}
			if (iName.equals("porax381") || iName.equals("piett2") || iName.equals("choppermalachor") || iName.equals("quigonobiwan2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("porax381")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.porax381());

						} else if (iName.equals("piett2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.piett2());

						} else if (iName.equals("choppermalachor")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.choppermalachor());

						} else if (iName.equals("quigonobiwan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.quigonobiwan2());

						}
					}
				});
				return true;
			}
			if (iName.equals("daegenlok1") || iName.equals("ghesorade1") || iName.equals("credit1") || iName.equals("jarjar4")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("daegenlok1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.daegenlok1());

						} else if (iName.equals("ghesorade1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ghesorade1());

						} else if (iName.equals("credit1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.credit1());

						} else if (iName.equals("jarjar4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jarjar4());

						}
					}
				});
				return true;
			}
			if (iName.equals("azrakel1") || iName.equals("tott1") || iName.equals("ghostcrew4") || iName.equals("sdcenturion1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("azrakel1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.azrakel1());

						} else if (iName.equals("tott1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tott1());

						} else if (iName.equals("ghostcrew4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ghostcrew4());

						} else if (iName.equals("sdcenturion1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdcenturion1());

						}
					}
				});
				return true;
			}

		return false;
	}
}