package com.starwars.app.client.resources.imagethree;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.resources.client.ImageResource;
import com.starwars.app.client.mct.ASyncCall;
import com.starwars.app.client.resources.StarWarsImageResources;

public class StarWarsMethodResourcesImageThree {
	
	public static boolean callMethodImage(final ASyncCall<ImageResource> iASyncCall, final String iName) {
			if (iName.equals("petokelsan1") || iName.equals("vongwars3") || iName.equals("andurgo1") || iName.equals("ximwars1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("petokelsan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.petokelsan1());

						} else if (iName.equals("vongwars3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vongwars3());

						} else if (iName.equals("andurgo1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.andurgo1());

						} else if (iName.equals("ximwars1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ximwars1());

						}
					}
				});
				return true;
			}
			if (iName.equals("thon3") || iName.equals("duros1") || iName.equals("asajjyoung") || iName.equals("darkzannahyoung")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("thon3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.thon3());

						} else if (iName.equals("duros1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.duros1());

						} else if (iName.equals("asajjyoung")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.asajjyoung());

						} else if (iName.equals("darkzannahyoung")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkzannahyoung());

						}
					}
				});
				return true;
			}
			if (iName.equals("han3") || iName.equals("daalarun") || iName.equals("ponudo1") || iName.equals("tieadvanced2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("han3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.han3());

						} else if (iName.equals("daalarun")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.daalarun());

						} else if (iName.equals("ponudo1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ponudo1());

						} else if (iName.equals("tieadvanced2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tieadvanced2());

						}
					}
				});
				return true;
			}
			if (iName.equals("logodarkmaladi") || iName.equals("mandoarmor") || iName.equals("opporancisisdeath") || iName.equals("xesh1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logodarkmaladi")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarkmaladi());

						} else if (iName.equals("mandoarmor")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mandoarmor());

						} else if (iName.equals("opporancisisdeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.opporancisisdeath());

						} else if (iName.equals("xesh1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.xesh1());

						}
					}
				});
				return true;
			}
			if (iName.equals("geist1") || iName.equals("sedriss1") || iName.equals("bibfortuna2") || iName.equals("bobafett1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("geist1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.geist1());

						} else if (iName.equals("sedriss1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sedriss1());

						} else if (iName.equals("bibfortuna2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bibfortuna2());

						} else if (iName.equals("bobafett1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bobafett1());

						}
					}
				});
				return true;
			}
			if (iName.equals("logoanakinsolo") || iName.equals("csi1") || iName.equals("luciendraayyoung") || iName.equals("kraytbetrayal")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logoanakinsolo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoanakinsolo());

						} else if (iName.equals("csi1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.csi1());

						} else if (iName.equals("luciendraayyoung")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.luciendraayyoung());

						} else if (iName.equals("kraytbetrayal")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kraytbetrayal());

						}
					}
				});
				return true;
			}
			if (iName.equals("trett1") || iName.equals("desannjerec") || iName.equals("chronology") || iName.equals("bailr2d2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("trett1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.trett1());

						} else if (iName.equals("desannjerec")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.desannjerec());

						} else if (iName.equals("chronology")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chronology());

						} else if (iName.equals("bailr2d2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bailr2d2());

						}
					}
				});
				return true;
			}
			if (iName.equals("deliahvong") || iName.equals("kashyyyk1") || iName.equals("farnay1") || iName.equals("korriban1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("deliahvong")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.deliahvong());

						} else if (iName.equals("kashyyyk1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kashyyyk1());

						} else if (iName.equals("farnay1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.farnay1());

						} else if (iName.equals("korriban1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.korriban1());

						}
					}
				});
				return true;
			}
			if (iName.equals("tieinterceptor2") || iName.equals("colo2") || iName.equals("logoulicdroma") || iName.equals("newrepublic36ay")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("tieinterceptor2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tieinterceptor2());

						} else if (iName.equals("colo2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.colo2());

						} else if (iName.equals("logoulicdroma")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoulicdroma());

						} else if (iName.equals("newrepublic36ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.newrepublic36ay());

						}
					}
				});
				return true;
			}
			if (iName.equals("corranapprenti") || iName.equals("darkmalevaldeath") || iName.equals("awing2") || iName.equals("basilisk1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("corranapprenti")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.corranapprenti());

						} else if (iName.equals("darkmalevaldeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkmalevaldeath());

						} else if (iName.equals("awing2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.awing2());

						} else if (iName.equals("basilisk1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.basilisk1());

						}
					}
				});
				return true;
			}
			if (iName.equals("zeb3") || iName.equals("ambria1") || iName.equals("sdinterdictor1") || iName.equals("logoforcewar")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("zeb3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zeb3());

						} else if (iName.equals("ambria1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ambria1());

						} else if (iName.equals("sdinterdictor1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdinterdictor1());

						} else if (iName.equals("logoforcewar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoforcewar());

						}
					}
				});
				return true;
			}
			if (iName.equals("cuirasse1") || iName.equals("darkmalgusmarch") || iName.equals("coleet1") || iName.equals("shaakti1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("cuirasse1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cuirasse1());

						} else if (iName.equals("darkmalgusmarch")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkmalgusmarch());

						} else if (iName.equals("coleet1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.coleet1());

						} else if (iName.equals("shaakti1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shaakti1());

						}
					}
				});
				return true;
			}
			if (iName.equals("maladidorn") || iName.equals("nuna2") || iName.equals("altostratus2") || iName.equals("iktotchi1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("maladidorn")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.maladidorn());

						} else if (iName.equals("nuna2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nuna2());

						} else if (iName.equals("altostratus2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.altostratus2());

						} else if (iName.equals("iktotchi1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.iktotchi1());

						}
					}
				});
				return true;
			}
			if (iName.equals("logomorigancorde") || iName.equals("logoallanasolo") || iName.equals("appo3") || iName.equals("quarren1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logomorigancorde")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logomorigancorde());

						} else if (iName.equals("logoallanasolo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoallanasolo());

						} else if (iName.equals("appo3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.appo3());

						} else if (iName.equals("quarren1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.quarren1());

						}
					}
				});
				return true;
			}
			if (iName.equals("separatistspaceeast22by") || iName.equals("zorneth1") || iName.equals("odion3") || iName.equals("logotristazel")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("separatistspaceeast22by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.separatistspaceeast22by());

						} else if (iName.equals("zorneth1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zorneth1());

						} else if (iName.equals("odion3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.odion3());

						} else if (iName.equals("logotristazel")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logotristazel());

						}
					}
				});
				return true;
			}
			if (iName.equals("barrissoffeedeath") || iName.equals("ebonhawk1") || iName.equals("odanurr1") || iName.equals("blasterdh172")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("barrissoffeedeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.barrissoffeedeath());

						} else if (iName.equals("ebonhawk1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ebonhawk1());

						} else if (iName.equals("odanurr1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.odanurr1());

						} else if (iName.equals("blasterdh172")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.blasterdh172());

						}
					}
				});
				return true;
			}
			if (iName.equals("malastare1") || iName.equals("logobelia") || iName.equals("logooldrepublic") || iName.equals("veers1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("malastare1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.malastare1());

						} else if (iName.equals("logobelia")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logobelia());

						} else if (iName.equals("logooldrepublic")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logooldrepublic());

						} else if (iName.equals("veers1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.veers1());

						}
					}
				});
				return true;
			}
			if (iName.equals("sdresurgent1") || iName.equals("nagasadowyavin") || iName.equals("logobailantilles") || iName.equals("logoskeetorawk")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("sdresurgent1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdresurgent1());

						} else if (iName.equals("nagasadowyavin")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nagasadowyavin());

						} else if (iName.equals("logobailantilles")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logobailantilles());

						} else if (iName.equals("logoskeetorawk")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoskeetorawk());

						}
					}
				});
				return true;
			}
			if (iName.equals("berumother") || iName.equals("logotenelka") || iName.equals("sdsubjugator1") || iName.equals("sdardent1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("berumother")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.berumother());

						} else if (iName.equals("logotenelka")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logotenelka());

						} else if (iName.equals("sdsubjugator1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdsubjugator1());

						} else if (iName.equals("sdardent1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdardent1());

						}
					}
				});
				return true;
			}
			if (iName.equals("thefather1") || iName.equals("lumiya3") || iName.equals("c3popadme") || iName.equals("kananjarrusyoung")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("thefather1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.thefather1());

						} else if (iName.equals("lumiya3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lumiya3());

						} else if (iName.equals("c3popadme")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.c3popadme());

						} else if (iName.equals("kananjarrusyoung")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kananjarrusyoung());

						}
					}
				});
				return true;
			}
			if (iName.equals("cassuszayne") || iName.equals("c3poreb") || iName.equals("raanatey2") || iName.equals("darkmaulvsjedi")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("cassuszayne")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cassuszayne());

						} else if (iName.equals("c3poreb")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.c3poreb());

						} else if (iName.equals("raanatey2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.raanatey2());

						} else if (iName.equals("darkmaulvsjedi")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkmaulvsjedi());

						}
					}
				});
				return true;
			}
			if (iName.equals("logofirstgreatschisme") || iName.equals("logodarkcaedus") || iName.equals("luciendraayzayne") || iName.equals("ghostcrew2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logofirstgreatschisme")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logofirstgreatschisme());

						} else if (iName.equals("logodarkcaedus")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarkcaedus());

						} else if (iName.equals("luciendraayzayne")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.luciendraayzayne());

						} else if (iName.equals("ghostcrew2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ghostcrew2());

						}
					}
				});
				return true;
			}
			if (iName.equals("sithpeople") || iName.equals("niennunb1") || iName.equals("patititepattuna1") || iName.equals("sdinexpugnable2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("sithpeople")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sithpeople());

						} else if (iName.equals("niennunb1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.niennunb1());

						} else if (iName.equals("patititepattuna1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.patititepattuna1());

						} else if (iName.equals("sdinexpugnable2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdinexpugnable2());

						}
					}
				});
				return true;
			}
			if (iName.equals("galacticrepublicnorth12000by") || iName.equals("logocemfel") || iName.equals("declann1") || iName.equals("wheelbike1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("galacticrepublicnorth12000by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.galacticrepublicnorth12000by());

						} else if (iName.equals("logocemfel")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logocemfel());

						} else if (iName.equals("declann1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.declann1());

						} else if (iName.equals("wheelbike1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.wheelbike1());

						}
					}
				});
				return true;
			}
			if (iName.equals("c99792") || iName.equals("neirin2") || iName.equals("mezhankwaad2") || iName.equals("kylejerec")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("c99792")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.c99792());

						} else if (iName.equals("neirin2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.neirin2());

						} else if (iName.equals("mezhankwaad2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mezhankwaad2());

						} else if (iName.equals("kylejerec")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kylejerec());

						}
					}
				});
				return true;
			}
			if (iName.equals("force2") || iName.equals("narshaddaa1") || iName.equals("vendaxabattle") || iName.equals("bailpolitic")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("force2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.force2());

						} else if (iName.equals("narshaddaa1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.narshaddaa1());

						} else if (iName.equals("vendaxabattle")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vendaxabattle());

						} else if (iName.equals("bailpolitic")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bailpolitic());

						}
					}
				});
				return true;
			}
			if (iName.equals("logosoontirfel") || iName.equals("renknight2") || iName.equals("droideka2") || iName.equals("manaan1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logosoontirfel")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logosoontirfel());

						} else if (iName.equals("renknight2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.renknight2());

						} else if (iName.equals("droideka2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.droideka2());

						} else if (iName.equals("manaan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.manaan1());

						}
					}
				});
				return true;
			}
			if (iName.equals("rebelpeople") || iName.equals("thrawn3") || iName.equals("raynarthul1") || iName.equals("bacara2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("rebelpeople")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rebelpeople());

						} else if (iName.equals("thrawn3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.thrawn3());

						} else if (iName.equals("raynarthul1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.raynarthul1());

						} else if (iName.equals("bacara2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bacara2());

						}
					}
				});
				return true;
			}
			if (iName.equals("logostarkiller") || iName.equals("cliegglars1") || iName.equals("valorum2") || iName.equals("cumberlaynearesko1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logostarkiller")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logostarkiller());

						} else if (iName.equals("cliegglars1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cliegglars1());

						} else if (iName.equals("valorum2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.valorum2());

						} else if (iName.equals("cumberlaynearesko1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cumberlaynearesko1());

						}
					}
				});
				return true;
			}
			if (iName.equals("daultaydofine2") || iName.equals("logoswarmwar") || iName.equals("c3poresistance") || iName.equals("fivebrother3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("daultaydofine2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.daultaydofine2());

						} else if (iName.equals("logoswarmwar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoswarmwar());

						} else if (iName.equals("c3poresistance")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.c3poresistance());

						} else if (iName.equals("fivebrother3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.fivebrother3());

						}
					}
				});
				return true;
			}
			if (iName.equals("nexu3") || iName.equals("aks1") || iName.equals("darklady1") || iName.equals("pitdroid1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("nexu3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nexu3());

						} else if (iName.equals("aks1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.aks1());

						} else if (iName.equals("darklady1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darklady1());

						} else if (iName.equals("pitdroid1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.pitdroid1());

						}
					}
				});
				return true;
			}
			if (iName.equals("csilla2") || iName.equals("maravador") || iName.equals("felfleet1") || iName.equals("agruss1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("csilla2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.csilla2());

						} else if (iName.equals("maravador")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.maravador());

						} else if (iName.equals("felfleet1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.felfleet1());

						} else if (iName.equals("agruss1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.agruss1());

						}
					}
				});
				return true;
			}
			if (iName.equals("grievous4") || iName.equals("zayneend") || iName.equals("tarkin1") || iName.equals("lucrehulk2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("grievous4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.grievous4());

						} else if (iName.equals("zayneend")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zayneend());

						} else if (iName.equals("tarkin1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tarkin1());

						} else if (iName.equals("lucrehulk2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lucrehulk2());

						}
					}
				});
				return true;
			}
			if (iName.equals("whiphid1") || iName.equals("nenyim2") || iName.equals("logodarkbandon") || iName.equals("keldor2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("whiphid1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.whiphid1());

						} else if (iName.equals("nenyim2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nenyim2());

						} else if (iName.equals("logodarkbandon")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarkbandon());

						} else if (iName.equals("keldor2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.keldor2());

						}
					}
				});
				return true;
			}
			if (iName.equals("rancor1") || iName.equals("moniagahan2") || iName.equals("batteriedf91") || iName.equals("qanilia2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("rancor1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rancor1());

						} else if (iName.equals("moniagahan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.moniagahan2());

						} else if (iName.equals("batteriedf91")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.batteriedf91());

						} else if (iName.equals("qanilia2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.qanilia2());

						}
					}
				});
				return true;
			}
			if (iName.equals("plokoonbobafett") || iName.equals("janors1") || iName.equals("kallus2") || iName.equals("reek1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("plokoonbobafett")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.plokoonbobafett());

						} else if (iName.equals("janors1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.janors1());

						} else if (iName.equals("kallus2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kallus2());

						} else if (iName.equals("reek1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.reek1());

						}
					}
				});
				return true;
			}
			if (iName.equals("luminaraunduli3") || iName.equals("karrde2") || iName.equals("weapons") || iName.equals("ahsoka3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("luminaraunduli3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.luminaraunduli3());

						} else if (iName.equals("karrde2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.karrde2());

						} else if (iName.equals("weapons")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.weapons());

						} else if (iName.equals("ahsoka3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ahsoka3());

						}
					}
				});
				return true;
			}
			if (iName.equals("repfighters") || iName.equals("arcajethdeath") || iName.equals("logochakfel") || iName.equals("pellaeon1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("repfighters")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.repfighters());

						} else if (iName.equals("arcajethdeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.arcajethdeath());

						} else if (iName.equals("logochakfel")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logochakfel());

						} else if (iName.equals("pellaeon1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.pellaeon1());

						}
					}
				});
				return true;
			}
			if (iName.equals("rulfyage2") || iName.equals("thon1") || iName.equals("clonecommandant1") || iName.equals("tolskorr2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("rulfyage2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rulfyage2());

						} else if (iName.equals("thon1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.thon1());

						} else if (iName.equals("clonecommandant1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.clonecommandant1());

						} else if (iName.equals("tolskorr2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tolskorr2());

						}
					}
				});
				return true;
			}
			if (iName.equals("zabrak2") || iName.equals("bruckchun2") || iName.equals("superlaser1") || iName.equals("rakata2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("zabrak2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zabrak2());

						} else if (iName.equals("bruckchun2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bruckchun2());

						} else if (iName.equals("superlaser1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.superlaser1());

						} else if (iName.equals("rakata2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rakata2());

						}
					}
				});
				return true;
			}
			if (iName.equals("infiniteempire30000by") || iName.equals("logowintercelchu") || iName.equals("chopperbaby") || iName.equals("coruscant3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("infiniteempire30000by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.infiniteempire30000by());

						} else if (iName.equals("logowintercelchu")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logowintercelchu());

						} else if (iName.equals("chopperbaby")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chopperbaby());

						} else if (iName.equals("coruscant3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.coruscant3());

						}
					}
				});
				return true;
			}
			if (iName.equals("theone1") || iName.equals("navettesigma1") || iName.equals("bobafett3") || iName.equals("logogalacticempire")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("theone1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.theone1());

						} else if (iName.equals("navettesigma1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.navettesigma1());

						} else if (iName.equals("bobafett3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bobafett3());

						} else if (iName.equals("logogalacticempire")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logogalacticempire());

						}
					}
				});
				return true;
			}
			if (iName.equals("tython1") || iName.equals("niathal1") || iName.equals("tlbtt1") || iName.equals("logoruleoftwo")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("tython1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tython1());

						} else if (iName.equals("niathal1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.niathal1());

						} else if (iName.equals("tlbtt1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tlbtt1());

						} else if (iName.equals("logoruleoftwo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoruleoftwo());

						}
					}
				});
				return true;
			}
			if (iName.equals("ailynvel1") || iName.equals("sdtector1") || iName.equals("hapesconsortium1") || iName.equals("dxun2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ailynvel1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ailynvel1());

						} else if (iName.equals("sdtector1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdtector1());

						} else if (iName.equals("hapesconsortium1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hapesconsortium1());

						} else if (iName.equals("dxun2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dxun2());

						}
					}
				});
				return true;
			}
			if (iName.equals("logolumiya") || iName.equals("vannartreece1") || iName.equals("logoexalkressh") || iName.equals("marajedi")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logolumiya")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logolumiya());

						} else if (iName.equals("vannartreece1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vannartreece1());

						} else if (iName.equals("logoexalkressh")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoexalkressh());

						} else if (iName.equals("marajedi")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.marajedi());

						}
					}
				});
				return true;
			}
			if (iName.equals("kruhlroanfel") || iName.equals("mynockship1") || iName.equals("nihlcade") || iName.equals("kerra2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kruhlroanfel")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kruhlroanfel());

						} else if (iName.equals("mynockship1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mynockship1());

						} else if (iName.equals("nihlcade")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nihlcade());

						} else if (iName.equals("kerra2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kerra2());

						}
					}
				});
				return true;
			}
			if (iName.equals("skalnas3") || iName.equals("endor1") || iName.equals("odion1") || iName.equals("zulexiss1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("skalnas3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.skalnas3());

						} else if (iName.equals("endor1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.endor1());

						} else if (iName.equals("odion1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.odion1());

						} else if (iName.equals("zulexiss1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zulexiss1());

						}
					}
				});
				return true;
			}
			if (iName.equals("human1") || iName.equals("kraytclonewars") || iName.equals("utai2") || iName.equals("kananjarrus2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("human1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.human1());

						} else if (iName.equals("kraytclonewars")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kraytclonewars());

						} else if (iName.equals("utai2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.utai2());

						} else if (iName.equals("kananjarrus2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kananjarrus2());

						}
					}
				});
				return true;
			}
			if (iName.equals("starkillerstation1") || iName.equals("pyke1") || iName.equals("search") || iName.equals("pauan2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("starkillerstation1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.starkillerstation1());

						} else if (iName.equals("pyke1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.pyke1());

						} else if (iName.equals("search")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.search());

						} else if (iName.equals("pauan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.pauan2());

						}
					}
				});
				return true;
			}
			if (iName.equals("hardcell1") || iName.equals("lukekongo") || iName.equals("mirax1") || iName.equals("imperialfighters")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("hardcell1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hardcell1());

						} else if (iName.equals("lukekongo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lukekongo());

						} else if (iName.equals("mirax1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mirax1());

						} else if (iName.equals("imperialfighters")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.imperialfighters());

						}
					}
				});
				return true;
			}
			if (iName.equals("tsuichoi1") || iName.equals("logocellyorgana") || iName.equals("barrisoffeeanakin") || iName.equals("ansion2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("tsuichoi1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tsuichoi1());

						} else if (iName.equals("logocellyorgana")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logocellyorgana());

						} else if (iName.equals("barrisoffeeanakin")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.barrisoffeeanakin());

						} else if (iName.equals("ansion2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ansion2());

						}
					}
				});
				return true;
			}
			if (iName.equals("umbara2") || iName.equals("allvscalixte") || iName.equals("oodbnar1") || iName.equals("kananjarrus4")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("umbara2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.umbara2());

						} else if (iName.equals("allvscalixte")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.allvscalixte());

						} else if (iName.equals("oodbnar1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.oodbnar1());

						} else if (iName.equals("kananjarrus4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kananjarrus4());

						}
					}
				});
				return true;
			}
			if (iName.equals("jamillia1") || iName.equals("macewindu2") || iName.equals("yun1") || iName.equals("logodarkcognus")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("jamillia1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jamillia1());

						} else if (iName.equals("macewindu2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.macewindu2());

						} else if (iName.equals("yun1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.yun1());

						} else if (iName.equals("logodarkcognus")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarkcognus());

						}
					}
				});
				return true;
			}
			if (iName.equals("rakghoul2") || iName.equals("darkcaedus2") || iName.equals("csiarmy") || iName.equals("tiedefender2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("rakghoul2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rakghoul2());

						} else if (iName.equals("darkcaedus2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkcaedus2());

						} else if (iName.equals("csiarmy")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.csiarmy());

						} else if (iName.equals("tiedefender2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tiedefender2());

						}
					}
				});
				return true;
			}
			if (iName.equals("jaraelvschantique") || iName.equals("slave13") || iName.equals("chewie1") || iName.equals("logonewgalacticempire")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("jaraelvschantique")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jaraelvschantique());

						} else if (iName.equals("slave13")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.slave13());

						} else if (iName.equals("chewie1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chewie1());

						} else if (iName.equals("logonewgalacticempire")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logonewgalacticempire());

						}
					}
				});
				return true;
			}
			if (iName.equals("shaekodafight") || iName.equals("kraytcome") || iName.equals("logodarkstryfe") || iName.equals("cadbane2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("shaekodafight")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shaekodafight());

						} else if (iName.equals("kraytcome")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kraytcome());

						} else if (iName.equals("logodarkstryfe")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarkstryfe());

						} else if (iName.equals("cadbane2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cadbane2());

						}
					}
				});
				return true;
			}
			if (iName.equals("korriban3") || iName.equals("logoflint") || iName.equals("dorsk811") || iName.equals("deathstarbirth")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("korriban3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.korriban3());

						} else if (iName.equals("logoflint")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoflint());

						} else if (iName.equals("dorsk811")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dorsk811());

						} else if (iName.equals("deathstarbirth")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.deathstarbirth());

						}
					}
				});
				return true;
			}
			if (iName.equals("passelargente1") || iName.equals("tenebkel2") || iName.equals("handempire9ay") || iName.equals("zeb5")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("passelargente1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.passelargente1());

						} else if (iName.equals("tenebkel2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tenebkel2());

						} else if (iName.equals("handempire9ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.handempire9ay());

						} else if (iName.equals("zeb5")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zeb5());

						}
					}
				});
				return true;
			}
			if (iName.equals("revanmandowar") || iName.equals("galacticalliancetrooper") || iName.equals("jonantilles1") || iName.equals("factions")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("revanmandowar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.revanmandowar());

						} else if (iName.equals("galacticalliancetrooper")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.galacticalliancetrooper());

						} else if (iName.equals("jonantilles1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jonantilles1());

						} else if (iName.equals("factions")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.factions());

						}
					}
				});
				return true;
			}
			if (iName.equals("hondo3") || iName.equals("ranharkas1") || iName.equals("luciendraay1") || iName.equals("blasterdc15s2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("hondo3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hondo3());

						} else if (iName.equals("ranharkas1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ranharkas1());

						} else if (iName.equals("luciendraay1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.luciendraay1());

						} else if (iName.equals("blasterdc15s2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.blasterdc15s2());

						}
					}
				});
				return true;
			}
			if (iName.equals("uwa1") || iName.equals("ezramalachor") || iName.equals("clawdite1") || iName.equals("kyloren1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("uwa1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.uwa1());

						} else if (iName.equals("ezramalachor")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ezramalachor());

						} else if (iName.equals("clawdite1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.clawdite1());

						} else if (iName.equals("kyloren1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kyloren1());

						}
					}
				});
				return true;
			}
			if (iName.equals("tenelkaold") || iName.equals("alora2") || iName.equals("mandowedding") || iName.equals("technosyndicat1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("tenelkaold")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tenelkaold());

						} else if (iName.equals("alora2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.alora2());

						} else if (iName.equals("mandowedding")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mandowedding());

						} else if (iName.equals("technosyndicat1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.technosyndicat1());

						}
					}
				});
				return true;
			}
			if (iName.equals("xwing1") || iName.equals("zygerria2") || iName.equals("enebray2") || iName.equals("imperialships")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("xwing1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.xwing1());

						} else if (iName.equals("zygerria2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zygerria2());

						} else if (iName.equals("enebray2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.enebray2());

						} else if (iName.equals("imperialships")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.imperialships());

						}
					}
				});
				return true;
			}
			if (iName.equals("r2d2killik") || iName.equals("vornskr2") || iName.equals("palpatinearrest") || iName.equals("logomyriantilles")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("r2d2killik")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2d2killik());

						} else if (iName.equals("vornskr2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vornskr2());

						} else if (iName.equals("palpatinearrest")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.palpatinearrest());

						} else if (iName.equals("logomyriantilles")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logomyriantilles());

						}
					}
				});
				return true;
			}
			if (iName.equals("janors3") || iName.equals("eweb2") || iName.equals("r2d2citadelle") || iName.equals("ssdeclipse2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("janors3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.janors3());

						} else if (iName.equals("eweb2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.eweb2());

						} else if (iName.equals("r2d2citadelle")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2d2citadelle());

						} else if (iName.equals("ssdeclipse2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ssdeclipse2());

						}
					}
				});
				return true;
			}
			if (iName.equals("mikoreglia1") || iName.equals("nantex1") || iName.equals("ezra5") || iName.equals("jora1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("mikoreglia1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mikoreglia1());

						} else if (iName.equals("nantex1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nantex1());

						} else if (iName.equals("ezra5")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ezra5());

						} else if (iName.equals("jora1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jora1());

						}
					}
				});
				return true;
			}
			if (iName.equals("vimasunrider1") || iName.equals("eightbrother1") || iName.equals("omascal1") || iName.equals("h21")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("vimasunrider1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vimasunrider1());

						} else if (iName.equals("eightbrother1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.eightbrother1());

						} else if (iName.equals("omascal1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.omascal1());

						} else if (iName.equals("h21")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.h21());

						}
					}
				});
				return true;
			}
			if (iName.equals("joruus2") || iName.equals("sithspacesouth1000by") || iName.equals("inquisitorbeg") || iName.equals("karvastor1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("joruus2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.joruus2());

						} else if (iName.equals("sithspacesouth1000by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sithspacesouth1000by());

						} else if (iName.equals("inquisitorbeg")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.inquisitorbeg());

						} else if (iName.equals("karvastor1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.karvastor1());

						}
					}
				});
				return true;
			}
			if (iName.equals("teta1") || iName.equals("revansith2") || iName.equals("astraalvao2") || iName.equals("evenpielldeath")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("teta1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.teta1());

						} else if (iName.equals("revansith2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.revansith2());

						} else if (iName.equals("astraalvao2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.astraalvao2());

						} else if (iName.equals("evenpielldeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.evenpielldeath());

						}
					}
				});
				return true;
			}
			if (iName.equals("obiwan1") || iName.equals("bail3") || iName.equals("jaggedjaina") || iName.equals("tiehunter2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("obiwan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.obiwan1());

						} else if (iName.equals("bail3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bail3());

						} else if (iName.equals("jaggedjaina")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jaggedjaina());

						} else if (iName.equals("tiehunter2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tiehunter2());

						}
					}
				});
				return true;
			}
			if (iName.equals("sdassertor2") || iName.equals("nebulon2") || iName.equals("c3pocymoon") || iName.equals("narshaddaa3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("sdassertor2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdassertor2());

						} else if (iName.equals("nebulon2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nebulon2());

						} else if (iName.equals("c3pocymoon")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.c3pocymoon());

						} else if (iName.equals("narshaddaa3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.narshaddaa3());

						}
					}
				});
				return true;
			}
			if (iName.equals("shadovao1") || iName.equals("tusken2") || iName.equals("vulturefighter1") || iName.equals("zerocommand6ay")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("shadovao1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shadovao1());

						} else if (iName.equals("tusken2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tusken2());

						} else if (iName.equals("vulturefighter1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vulturefighter1());

						} else if (iName.equals("zerocommand6ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zerocommand6ay());

						}
					}
				});
				return true;
			}
			if (iName.equals("sdmunificient2") || iName.equals("sithsphere2") || iName.equals("jarkai") || iName.equals("logoanakinskywalker")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("sdmunificient2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdmunificient2());

						} else if (iName.equals("sithsphere2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sithsphere2());

						} else if (iName.equals("jarkai")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jarkai());

						} else if (iName.equals("logoanakinskywalker")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoanakinskywalker());

						}
					}
				});
				return true;
			}
			if (iName.equals("taris2") || iName.equals("vodosioskbaas2") || iName.equals("vong1") || iName.equals("skywalkerfamily")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("taris2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.taris2());

						} else if (iName.equals("vodosioskbaas2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vodosioskbaas2());

						} else if (iName.equals("vong1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vong1());

						} else if (iName.equals("skywalkerfamily")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.skywalkerfamily());

						}
					}
				});
				return true;
			}
			if (iName.equals("jedicouncil") || iName.equals("ssdexecutor3") || iName.equals("canongalactique2") || iName.equals("logodarkmaleval")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("jedicouncil")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jedicouncil());

						} else if (iName.equals("ssdexecutor3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ssdexecutor3());

						} else if (iName.equals("canongalactique2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.canongalactique2());

						} else if (iName.equals("logodarkmaleval")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarkmaleval());

						}
					}
				});
				return true;
			}
			if (iName.equals("ssdsovereign1") || iName.equals("arcajeth1") || iName.equals("macewinduvssora") || iName.equals("logoresistance")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ssdsovereign1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ssdsovereign1());

						} else if (iName.equals("arcajeth1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.arcajeth1());

						} else if (iName.equals("macewinduvssora")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.macewinduvssora());

						} else if (iName.equals("logoresistance")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoresistance());

						}
					}
				});
				return true;
			}
			if (iName.equals("galacticrepublic17000by") || iName.equals("huttspace22by") || iName.equals("sanasolo2") || iName.equals("r2d2mustafar")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("galacticrepublic17000by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.galacticrepublic17000by());

						} else if (iName.equals("huttspace22by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.huttspace22by());

						} else if (iName.equals("sanasolo2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sanasolo2());

						} else if (iName.equals("r2d2mustafar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2d2mustafar());

						}
					}
				});
				return true;
			}
			if (iName.equals("homeimagesdi") || iName.equals("gavarkhai2") || iName.equals("architect1") || iName.equals("allianceterritoriesnortheast8ay")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("homeimagesdi")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.homeimagesdi());

						} else if (iName.equals("gavarkhai2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gavarkhai2());

						} else if (iName.equals("architect1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.architect1());

						} else if (iName.equals("allianceterritoriesnortheast8ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.allianceterritoriesnortheast8ay());

						}
					}
				});
				return true;
			}
			if (iName.equals("janarus1") || iName.equals("dromundkaas1") || iName.equals("deathwatch3") || iName.equals("darkplagueis1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("janarus1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.janarus1());

						} else if (iName.equals("dromundkaas1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dromundkaas1());

						} else if (iName.equals("deathwatch3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.deathwatch3());

						} else if (iName.equals("darkplagueis1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkplagueis1());

						}
					}
				});
				return true;
			}
			if (iName.equals("darkstryfevssaarai") || iName.equals("nahdarvebb2") || iName.equals("kraytxoxaan") || iName.equals("kerrasith")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("darkstryfevssaarai")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkstryfevssaarai());

						} else if (iName.equals("nahdarvebb2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nahdarvebb2());

						} else if (iName.equals("kraytxoxaan")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kraytxoxaan());

						} else if (iName.equals("kerrasith")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kerrasith());

						}
					}
				});
				return true;
			}
			if (iName.equals("arcann1") || iName.equals("jakku1") || iName.equals("logomarasiahfel") || iName.equals("kesdameron1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("arcann1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.arcann1());

						} else if (iName.equals("jakku1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jakku1());

						} else if (iName.equals("logomarasiahfel")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logomarasiahfel());

						} else if (iName.equals("kesdameron1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kesdameron1());

						}
					}
				});
				return true;
			}
			if (iName.equals("kubaz1") || iName.equals("coldwar2") || iName.equals("alemarar1") || iName.equals("tenebkel4")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kubaz1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kubaz1());

						} else if (iName.equals("coldwar2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.coldwar2());

						} else if (iName.equals("alemarar1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.alemarar1());

						} else if (iName.equals("tenebkel4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tenebkel4());

						}
					}
				});
				return true;
			}
			if (iName.equals("c3pocadbane") || iName.equals("yinchorri2") || iName.equals("tarpals2") || iName.equals("kyloren3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("c3pocadbane")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.c3pocadbane());

						} else if (iName.equals("yinchorri2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.yinchorri2());

						} else if (iName.equals("tarpals2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tarpals2());

						} else if (iName.equals("kyloren3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kyloren3());

						}
					}
				});
				return true;
			}
			if (iName.equals("kennantaanzer1") || iName.equals("logofelmother") || iName.equals("rendili1") || iName.equals("kamino2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kennantaanzer1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kennantaanzer1());

						} else if (iName.equals("logofelmother")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logofelmother());

						} else if (iName.equals("rendili1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rendili1());

						} else if (iName.equals("kamino2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kamino2());

						}
					}
				});
				return true;
			}
			if (iName.equals("droiddemo1") || iName.equals("obiwangrievous") || iName.equals("togruta2") || iName.equals("bespin1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("droiddemo1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.droiddemo1());

						} else if (iName.equals("obiwangrievous")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.obiwangrievous());

						} else if (iName.equals("togruta2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.togruta2());

						} else if (iName.equals("bespin1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bespin1());

						}
					}
				});
				return true;
			}
			if (iName.equals("ahsoka9") || iName.equals("coruscant1") || iName.equals("podracersebulba1") || iName.equals("r4p172")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ahsoka9")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ahsoka9());

						} else if (iName.equals("coruscant1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.coruscant1());

						} else if (iName.equals("podracersebulba1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.podracersebulba1());

						} else if (iName.equals("r4p172")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r4p172());

						}
					}
				});
				return true;
			}
			if (iName.equals("natjedi") || iName.equals("ezrasabre") || iName.equals("shimrra2") || iName.equals("jhared1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("natjedi")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.natjedi());

						} else if (iName.equals("ezrasabre")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ezrasabre());

						} else if (iName.equals("shimrra2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shimrra2());

						} else if (iName.equals("jhared1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jhared1());

						}
					}
				});
				return true;
			}
			if (iName.equals("luke5") || iName.equals("newholtice2") || iName.equals("slave11") || iName.equals("atdp2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("luke5")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.luke5());

						} else if (iName.equals("newholtice2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.newholtice2());

						} else if (iName.equals("slave11")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.slave11());

						} else if (iName.equals("atdp2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.atdp2());

						}
					}
				});
				return true;
			}
			if (iName.equals("wyyrlokforce") || iName.equals("padme4") || iName.equals("logohansolo") || iName.equals("logovongwar")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("wyyrlokforce")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.wyyrlokforce());

						} else if (iName.equals("padme4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.padme4());

						} else if (iName.equals("logohansolo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logohansolo());

						} else if (iName.equals("logovongwar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logovongwar());

						}
					}
				});
				return true;
			}
			if (iName.equals("bb83") || iName.equals("depabillabadeath") || iName.equals("propulsion2") || iName.equals("cadedeliah")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("bb83")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bb83());

						} else if (iName.equals("depabillabadeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.depabillabadeath());

						} else if (iName.equals("propulsion2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.propulsion2());

						} else if (iName.equals("cadedeliah")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cadedeliah());

						}
					}
				});
				return true;
			}
			if (iName.equals("pongkrell3") || iName.equals("nabooyacht1") || iName.equals("kortovos") || iName.equals("kitfisto2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("pongkrell3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.pongkrell3());

						} else if (iName.equals("nabooyacht1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nabooyacht1());

						} else if (iName.equals("kortovos")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kortovos());

						} else if (iName.equals("kitfisto2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kitfisto2());

						}
					}
				});
				return true;
			}
			if (iName.equals("palpatineapprentice") || iName.equals("jessikapava1") || iName.equals("logowynssafel") || iName.equals("palpatinethrawn")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("palpatineapprentice")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.palpatineapprentice());

						} else if (iName.equals("jessikapava1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jessikapava1());

						} else if (iName.equals("logowynssafel")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logowynssafel());

						} else if (iName.equals("palpatinethrawn")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.palpatinethrawn());

						}
					}
				});
				return true;
			}
			if (iName.equals("greatgalacticwar5") || iName.equals("hawkryo2") || iName.equals("skytopstation1") || iName.equals("sdimperial1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("greatgalacticwar5")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.greatgalacticwar5());

						} else if (iName.equals("hawkryo2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hawkryo2());

						} else if (iName.equals("skytopstation1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.skytopstation1());

						} else if (iName.equals("sdimperial1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdimperial1());

						}
					}
				});
				return true;
			}
			if (iName.equals("sebatyne1") || iName.equals("quinlanvosskor") || iName.equals("hosnianprime1") || iName.equals("oversectorouter4ay")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("sebatyne1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sebatyne1());

						} else if (iName.equals("quinlanvosskor")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.quinlanvosskor());

						} else if (iName.equals("hosnianprime1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hosnianprime1());

						} else if (iName.equals("oversectorouter4ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.oversectorouter4ay());

						}
					}
				});
				return true;
			}
			if (iName.equals("logotarynzel") || iName.equals("darkmarr2") || iName.equals("sabine6") || iName.equals("sdarquitens1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logotarynzel")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logotarynzel());

						} else if (iName.equals("darkmarr2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkmarr2());

						} else if (iName.equals("sabine6")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sabine6());

						} else if (iName.equals("sdarquitens1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdarquitens1());

						}
					}
				});
				return true;
			}
			if (iName.equals("thedaughter1") || iName.equals("arc1702") || iName.equals("temminwexley1") || iName.equals("marahand")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("thedaughter1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.thedaughter1());

						} else if (iName.equals("arc1702")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.arc1702());

						} else if (iName.equals("temminwexley1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.temminwexley1());

						} else if (iName.equals("marahand")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.marahand());

						}
					}
				});
				return true;
			}
			if (iName.equals("madine2") || iName.equals("arkanian2") || iName.equals("kaan2") || iName.equals("bothan1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("madine2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.madine2());

						} else if (iName.equals("arkanian2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.arkanian2());

						} else if (iName.equals("kaan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kaan2());

						} else if (iName.equals("bothan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bothan1());

						}
					}
				});
				return true;
			}
			if (iName.equals("dassjennir3") || iName.equals("talz2") || iName.equals("adasca2") || iName.equals("kanantrooper")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("dassjennir3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dassjennir3());

						} else if (iName.equals("talz2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.talz2());

						} else if (iName.equals("adasca2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.adasca2());

						} else if (iName.equals("kanantrooper")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kanantrooper());

						}
					}
				});
				return true;
			}
			if (iName.equals("canonnieredroid2") || iName.equals("logopentastaralign") || iName.equals("mandalore1") || iName.equals("killik1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("canonnieredroid2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.canonnieredroid2());

						} else if (iName.equals("logopentastaralign")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logopentastaralign());

						} else if (iName.equals("mandalore1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mandalore1());

						} else if (iName.equals("killik1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.killik1());

						}
					}
				});
				return true;
			}
			if (iName.equals("vehicules") || iName.equals("kessel1") || iName.equals("quinlanvoskkruhk") || iName.equals("gormanvandrayk1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("vehicules")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vehicules());

						} else if (iName.equals("kessel1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kessel1());

						} else if (iName.equals("quinlanvoskkruhk")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.quinlanvoskkruhk());

						} else if (iName.equals("gormanvandrayk1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gormanvandrayk1());

						}
					}
				});
				return true;
			}
			if (iName.equals("macewinduwattambor") || iName.equals("griffechiss1") || iName.equals("evaan3") || iName.equals("hondokarr1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("macewinduwattambor")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.macewinduwattambor());

						} else if (iName.equals("griffechiss1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.griffechiss1());

						} else if (iName.equals("evaan3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.evaan3());

						} else if (iName.equals("hondokarr1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hondokarr1());

						}
					}
				});
				return true;
			}
			if (iName.equals("oldsithempire5000by") || iName.equals("stormtrooper3") || iName.equals("sdmc401") || iName.equals("derriphan2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("oldsithempire5000by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.oldsithempire5000by());

						} else if (iName.equals("stormtrooper3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.stormtrooper3());

						} else if (iName.equals("sdmc401")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdmc401());

						} else if (iName.equals("derriphan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.derriphan2());

						}
					}
				});
				return true;
			}
			if (iName.equals("exalkressh2") || iName.equals("vestarakhai2") || iName.equals("trill2") || iName.equals("firstimperialcivilwar1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("exalkressh2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.exalkressh2());

						} else if (iName.equals("vestarakhai2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vestarakhai2());

						} else if (iName.equals("trill2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.trill2());

						} else if (iName.equals("firstimperialcivilwar1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.firstimperialcivilwar1());

						}
					}
				});
				return true;
			}
			if (iName.equals("wampa2") || iName.equals("felucia1") || iName.equals("lorsantekka1") || iName.equals("lukeabeloth")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("wampa2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.wampa2());

						} else if (iName.equals("felucia1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.felucia1());

						} else if (iName.equals("lorsantekka1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lorsantekka1());

						} else if (iName.equals("lukeabeloth")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lukeabeloth());

						}
					}
				});
				return true;
			}
			if (iName.equals("revanemperor") || iName.equals("hyenabomber2") || iName.equals("huttspace1000by") || iName.equals("anakin17")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("revanemperor")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.revanemperor());

						} else if (iName.equals("hyenabomber2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hyenabomber2());

						} else if (iName.equals("huttspace1000by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.huttspace1000by());

						} else if (iName.equals("anakin17")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anakin17());

						}
					}
				});
				return true;
			}
			if (iName.equals("revanmalakvitiate") || iName.equals("joruus4") || iName.equals("wileknereus1") || iName.equals("hylovizs2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("revanmalakvitiate")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.revanmalakvitiate());

						} else if (iName.equals("joruus4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.joruus4());

						} else if (iName.equals("wileknereus1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.wileknereus1());

						} else if (iName.equals("hylovizs2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hylovizs2());

						}
					}
				});
				return true;
			}
			if (iName.equals("logoowenlars") || iName.equals("dreed2") || iName.equals("dqar1") || iName.equals("chardessables1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logoowenlars")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoowenlars());

						} else if (iName.equals("dreed2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dreed2());

						} else if (iName.equals("dqar1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dqar1());

						} else if (iName.equals("chardessables1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chardessables1());

						}
					}
				});
				return true;
			}
			if (iName.equals("darkempire2") || iName.equals("noghri2") || iName.equals("tradefederation2") || iName.equals("demetriuszaarin1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("darkempire2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkempire2());

						} else if (iName.equals("noghri2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.noghri2());

						} else if (iName.equals("tradefederation2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tradefederation2());

						} else if (iName.equals("demetriuszaarin1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.demetriuszaarin1());

						}
					}
				});
				return true;
			}
			if (iName.equals("imperialcouncil") || iName.equals("ysanne2") || iName.equals("separatistspacesoutheast222by") || iName.equals("scouttrooper1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("imperialcouncil")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.imperialcouncil());

						} else if (iName.equals("ysanne2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ysanne2());

						} else if (iName.equals("separatistspacesoutheast222by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.separatistspacesoutheast222by());

						} else if (iName.equals("scouttrooper1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.scouttrooper1());

						}
					}
				});
				return true;
			}
			if (iName.equals("yodavssidious") || iName.equals("narglatch1") || iName.equals("sabrelaser1") || iName.equals("lando1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("yodavssidious")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.yodavssidious());

						} else if (iName.equals("narglatch1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.narglatch1());

						} else if (iName.equals("sabrelaser1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sabrelaser1());

						} else if (iName.equals("lando1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lando1());

						}
					}
				});
				return true;
			}
			if (iName.equals("mortis1") || iName.equals("airspeeder2") || iName.equals("aphra1") || iName.equals("logocsi")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("mortis1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mortis1());

						} else if (iName.equals("airspeeder2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.airspeeder2());

						} else if (iName.equals("aphra1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.aphra1());

						} else if (iName.equals("logocsi")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logocsi());

						}
					}
				});
				return true;
			}
			if (iName.equals("luke7") || iName.equals("sithspaceeast1000by") || iName.equals("bespin3") || iName.equals("palpatinestarkiller")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("luke7")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.luke7());

						} else if (iName.equals("sithspaceeast1000by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sithspaceeast1000by());

						} else if (iName.equals("bespin3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bespin3());

						} else if (iName.equals("palpatinestarkiller")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.palpatinestarkiller());

						}
					}
				});
				return true;
			}
			if (iName.equals("jocastanu2") || iName.equals("supertank1") || iName.equals("corranhorn1") || iName.equals("starkillerrahmkota")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("jocastanu2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jocastanu2());

						} else if (iName.equals("supertank1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.supertank1());

						} else if (iName.equals("corranhorn1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.corranhorn1());

						} else if (iName.equals("starkillerrahmkota")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.starkillerrahmkota());

						}
					}
				});
				return true;
			}
			if (iName.equals("deathstar12") || iName.equals("rhenvar1") || iName.equals("satelevsmalgus") || iName.equals("gannerrhysode2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("deathstar12")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.deathstar12());

						} else if (iName.equals("rhenvar1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rhenvar1());

						} else if (iName.equals("satelevsmalgus")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.satelevsmalgus());

						} else if (iName.equals("gannerrhysode2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gannerrhysode2());

						}
					}
				});
				return true;
			}
			if (iName.equals("kamsolusar1") || iName.equals("tieroyal1") || iName.equals("watto2") || iName.equals("ravcade2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kamsolusar1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kamsolusar1());

						} else if (iName.equals("tieroyal1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tieroyal1());

						} else if (iName.equals("watto2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.watto2());

						} else if (iName.equals("ravcade2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ravcade2());

						}
					}
				});
				return true;
			}
			if (iName.equals("roanfel2") || iName.equals("r2d2lukepalpatine") || iName.equals("poedameronjakku") || iName.equals("gahandeath")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("roanfel2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.roanfel2());

						} else if (iName.equals("r2d2lukepalpatine")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2d2lukepalpatine());

						} else if (iName.equals("poedameronjakku")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.poedameronjakku());

						} else if (iName.equals("gahandeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gahandeath());

						}
					}
				});
				return true;
			}
			if (iName.equals("letarkin1") || iName.equals("jetpackz61") || iName.equals("resistance1") || iName.equals("clonemarine1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("letarkin1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.letarkin1());

						} else if (iName.equals("jetpackz61")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jetpackz61());

						} else if (iName.equals("resistance1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.resistance1());

						} else if (iName.equals("clonemarine1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.clonemarine1());

						}
					}
				});
				return true;
			}
			if (iName.equals("cadenakia") || iName.equals("kitfistoquarren") || iName.equals("pulsipher1") || iName.equals("maw1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("cadenakia")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cadenakia());

						} else if (iName.equals("kitfistoquarren")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kitfistoquarren());

						} else if (iName.equals("pulsipher1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.pulsipher1());

						} else if (iName.equals("maw1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.maw1());

						}
					}
				});
				return true;
			}
			if (iName.equals("ywing1") || iName.equals("vhontetervho1") || iName.equals("tahldeath") || iName.equals("ackbar2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ywing1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ywing1());

						} else if (iName.equals("vhontetervho1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vhontetervho1());

						} else if (iName.equals("tahldeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tahldeath());

						} else if (iName.equals("ackbar2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ackbar2());

						}
					}
				});
				return true;
			}
			if (iName.equals("wesjanson1") || iName.equals("dengar1") || iName.equals("sakiyan1") || iName.equals("anoat2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("wesjanson1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.wesjanson1());

						} else if (iName.equals("dengar1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dengar1());

						} else if (iName.equals("sakiyan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sakiyan1());

						} else if (iName.equals("anoat2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anoat2());

						}
					}
				});
				return true;
			}
			if (iName.equals("luminaraundulikashyyyk") || iName.equals("canonioniquekdy1") || iName.equals("ahsokavador2") || iName.equals("ahsoka7")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("luminaraundulikashyyyk")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.luminaraundulikashyyyk());

						} else if (iName.equals("canonioniquekdy1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.canonioniquekdy1());

						} else if (iName.equals("ahsokavador2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ahsokavador2());

						} else if (iName.equals("ahsoka7")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ahsoka7());

						}
					}
				});
				return true;
			}
			if (iName.equals("atrisdarksion") || iName.equals("cimeterre1") || iName.equals("dwarfspiderdroid1") || iName.equals("logonewrepublic")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("atrisdarksion")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.atrisdarksion());

						} else if (iName.equals("cimeterre1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cimeterre1());

						} else if (iName.equals("dwarfspiderdroid1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dwarfspiderdroid1());

						} else if (iName.equals("logonewrepublic")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logonewrepublic());

						}
					}
				});
				return true;
			}
			if (iName.equals("logooldsithempire") || iName.equals("codychristophsis") || iName.equals("dathomir2") || iName.equals("trench1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logooldsithempire")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logooldsithempire());

						} else if (iName.equals("codychristophsis")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.codychristophsis());

						} else if (iName.equals("dathomir2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dathomir2());

						} else if (iName.equals("trench1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.trench1());

						}
					}
				});
				return true;
			}
			if (iName.equals("darkbaneorb") || iName.equals("darkstryfevssazen") || iName.equals("dathomirian2") || iName.equals("siritachi1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("darkbaneorb")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkbaneorb());

						} else if (iName.equals("darkstryfevssazen")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkstryfevssazen());

						} else if (iName.equals("dathomirian2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dathomirian2());

						} else if (iName.equals("siritachi1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.siritachi1());

						}
					}
				});
				return true;
			}
			if (iName.equals("sariss1") || iName.equals("tiebomber2") || iName.equals("shmianakin") || iName.equals("darkbanezannah")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("sariss1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sariss1());

						} else if (iName.equals("tiebomber2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tiebomber2());

						} else if (iName.equals("shmianakin")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shmianakin());

						} else if (iName.equals("darkbanezannah")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkbanezannah());

						}
					}
				});
				return true;
			}
			if (iName.equals("rexescape") || iName.equals("natt1") || iName.equals("stamreath1") || iName.equals("mandoknight")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("rexescape")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rexescape());

						} else if (iName.equals("natt1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.natt1());

						} else if (iName.equals("stamreath1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.stamreath1());

						} else if (iName.equals("mandoknight")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mandoknight());

						}
					}
				});
				return true;
			}
			if (iName.equals("gungan1") || iName.equals("sdimperialmk22") || iName.equals("damamontalvo1") || iName.equals("logopadmenaberrie")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("gungan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gungan1());

						} else if (iName.equals("sdimperialmk22")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdimperialmk22());

						} else if (iName.equals("damamontalvo1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.damamontalvo1());

						} else if (iName.equals("logopadmenaberrie")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logopadmenaberrie());

						}
					}
				});
				return true;
			}
			if (iName.equals("repsd") || iName.equals("logotriumviratsith") || iName.equals("celestemorne2") || iName.equals("jerjerrod2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("repsd")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.repsd());

						} else if (iName.equals("logotriumviratsith")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logotriumviratsith());

						} else if (iName.equals("celestemorne2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.celestemorne2());

						} else if (iName.equals("jerjerrod2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jerjerrod2());

						}
					}
				});
				return true;
			}
			if (iName.equals("logonaddism") || iName.equals("lumiyatrooper1") || iName.equals("besalisk1") || iName.equals("ordmantell2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logonaddism")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logonaddism());

						} else if (iName.equals("lumiyatrooper1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lumiyatrooper1());

						} else if (iName.equals("besalisk1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.besalisk1());

						} else if (iName.equals("ordmantell2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ordmantell2());

						}
					}
				});
				return true;
			}
			if (iName.equals("greedo1") || iName.equals("quanjang1") || iName.equals("dookusifo") || iName.equals("exarkunsith")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("greedo1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.greedo1());

						} else if (iName.equals("quanjang1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.quanjang1());

						} else if (iName.equals("dookusifo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dookusifo());

						} else if (iName.equals("exarkunsith")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.exarkunsith());

						}
					}
				});
				return true;
			}
			if (iName.equals("adigallia1") || iName.equals("logoclonewar") || iName.equals("hansolosana") || iName.equals("durge3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("adigallia1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.adigallia1());

						} else if (iName.equals("logoclonewar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoclonewar());

						} else if (iName.equals("hansolosana")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hansolosana());

						} else if (iName.equals("durge3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.durge3());

						}
					}
				});
				return true;
			}
			if (iName.equals("maraluke") || iName.equals("tavion2") || iName.equals("ossus1") || iName.equals("thrawnjorus")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("maraluke")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.maraluke());

						} else if (iName.equals("tavion2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tavion2());

						} else if (iName.equals("ossus1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ossus1());

						} else if (iName.equals("thrawnjorus")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.thrawnjorus());

						}
					}
				});
				return true;
			}
			if (iName.equals("logocliegglars") || iName.equals("xanatos2") || iName.equals("valorum1") || iName.equals("drakelogaan1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logocliegglars")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logocliegglars());

						} else if (iName.equals("xanatos2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.xanatos2());

						} else if (iName.equals("valorum1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.valorum1());

						} else if (iName.equals("drakelogaan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.drakelogaan1());

						}
					}
				});
				return true;
			}
			if (iName.equals("kiffar1") || iName.equals("neimodian2") || iName.equals("valorum4") || iName.equals("bailantilles1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kiffar1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kiffar1());

						} else if (iName.equals("neimodian2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.neimodian2());

						} else if (iName.equals("valorum4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.valorum4());

						} else if (iName.equals("bailantilles1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bailantilles1());

						}
					}
				});
				return true;
			}
			if (iName.equals("kraytempire137ay") || iName.equals("alemavoxyn") || iName.equals("demagolflashpoint") || iName.equals("carannia1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kraytempire137ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kraytempire137ay());

						} else if (iName.equals("alemavoxyn")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.alemavoxyn());

						} else if (iName.equals("demagolflashpoint")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.demagolflashpoint());

						} else if (iName.equals("carannia1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.carannia1());

						}
					}
				});
				return true;
			}
			if (iName.equals("jainacaedus") || iName.equals("sdharrower1") || iName.equals("caymission") || iName.equals("kenth1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("jainacaedus")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jainacaedus());

						} else if (iName.equals("sdharrower1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdharrower1());

						} else if (iName.equals("caymission")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.caymission());

						} else if (iName.equals("kenth1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kenth1());

						}
					}
				});
				return true;
			}
			if (iName.equals("civilspeople") || iName.equals("padme2") || iName.equals("pongkrell1") || iName.equals("winter2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("civilspeople")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.civilspeople());

						} else if (iName.equals("padme2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.padme2());

						} else if (iName.equals("pongkrell1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.pongkrell1());

						} else if (iName.equals("winter2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.winter2());

						}
					}
				});
				return true;
			}
			if (iName.equals("felucia3") || iName.equals("pestage1") || iName.equals("cab2") || iName.equals("barrissoffee2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("felucia3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.felucia3());

						} else if (iName.equals("pestage1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.pestage1());

						} else if (iName.equals("cab2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cab2());

						} else if (iName.equals("barrissoffee2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.barrissoffee2());

						}
					}
				});
				return true;
			}
			if (iName.equals("zaynemando") || iName.equals("greatgalacticwar3") || iName.equals("jabbadeath") || iName.equals("vongwars1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("zaynemando")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zaynemando());

						} else if (iName.equals("greatgalacticwar3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.greatgalacticwar3());

						} else if (iName.equals("jabbadeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jabbadeath());

						} else if (iName.equals("vongwars1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vongwars1());

						}
					}
				});
				return true;
			}
			if (iName.equals("obadiah2") || iName.equals("ortoplutonia1") || iName.equals("bobafettjabba") || iName.equals("trasaa4")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("obadiah2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.obadiah2());

						} else if (iName.equals("ortoplutonia1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ortoplutonia1());

						} else if (iName.equals("bobafettjabba")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bobafettjabba());

						} else if (iName.equals("trasaa4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.trasaa4());

						}
					}
				});
				return true;
			}
			if (iName.equals("rohlandyre1") || iName.equals("wedgeiella") || iName.equals("sabrelaser3") || iName.equals("asajjanakin")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("rohlandyre1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rohlandyre1());

						} else if (iName.equals("wedgeiella")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.wedgeiella());

						} else if (iName.equals("sabrelaser3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sabrelaser3());

						} else if (iName.equals("asajjanakin")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.asajjanakin());

						}
					}
				});
				return true;
			}
			if (iName.equals("blackfleet3") || iName.equals("jangofett1") || iName.equals("trakata") || iName.equals("zezkai")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("blackfleet3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.blackfleet3());

						} else if (iName.equals("jangofett1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jangofett1());

						} else if (iName.equals("trakata")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.trakata());

						} else if (iName.equals("zezkai")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zezkai());

						}
					}
				});
				return true;
			}
			if (iName.equals("rattataki2") || iName.equals("aphra3") || iName.equals("dassjennir1") || iName.equals("orondia1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("rattataki2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rattataki2());

						} else if (iName.equals("aphra3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.aphra3());

						} else if (iName.equals("dassjennir1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dassjennir1());

						} else if (iName.equals("orondia1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.orondia1());

						}
					}
				});
				return true;
			}
			if (iName.equals("carida1") || iName.equals("owen2") || iName.equals("logojedaiiorder") || iName.equals("nelvaan2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("carida1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.carida1());

						} else if (iName.equals("owen2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.owen2());

						} else if (iName.equals("logojedaiiorder")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logojedaiiorder());

						} else if (iName.equals("nelvaan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nelvaan2());

						}
					}
				});
				return true;
			}
			if (iName.equals("talzin1") || iName.equals("saleucami2") || iName.equals("anakin19") || iName.equals("stormtrooper1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("talzin1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.talzin1());

						} else if (iName.equals("saleucami2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.saleucami2());

						} else if (iName.equals("anakin19")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anakin19());

						} else if (iName.equals("stormtrooper1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.stormtrooper1());

						}
					}
				});
				return true;
			}
			if (iName.equals("celestevador") || iName.equals("ovanis1") || iName.equals("txtt2") || iName.equals("anakin9")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("celestevador")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.celestevador());

						} else if (iName.equals("ovanis1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ovanis1());

						} else if (iName.equals("txtt2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.txtt2());

						} else if (iName.equals("anakin9")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anakin9());

						}
					}
				});
				return true;
			}
			if (iName.equals("croiseurmc901") || iName.equals("gavindarklighter1") || iName.equals("junsato2") || iName.equals("lucrehulk1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("croiseurmc901")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.croiseurmc901());

						} else if (iName.equals("gavindarklighter1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gavindarklighter1());

						} else if (iName.equals("junsato2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.junsato2());

						} else if (iName.equals("lucrehulk1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lucrehulk1());

						}
					}
				});
				return true;
			}
			if (iName.equals("mandindomptable2") || iName.equals("ziro1") || iName.equals("jandodonna1") || iName.equals("kalluszeb")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("mandindomptable2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mandindomptable2());

						} else if (iName.equals("ziro1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ziro1());

						} else if (iName.equals("jandodonna1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jandodonna1());

						} else if (iName.equals("kalluszeb")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kalluszeb());

						}
					}
				});
				return true;
			}
			if (iName.equals("podracer1") || iName.equals("jawa2") || iName.equals("bobafettyoung") || iName.equals("lobot2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("podracer1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.podracer1());

						} else if (iName.equals("jawa2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jawa2());

						} else if (iName.equals("bobafettyoung")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bobafettyoung());

						} else if (iName.equals("lobot2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lobot2());

						}
					}
				});
				return true;
			}
			if (iName.equals("nomisunrider4") || iName.equals("juyo") || iName.equals("krath2") || iName.equals("oldrepublic2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("nomisunrider4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nomisunrider4());

						} else if (iName.equals("juyo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.juyo());

						} else if (iName.equals("krath2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.krath2());

						} else if (iName.equals("oldrepublic2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.oldrepublic2());

						}
					}
				});
				return true;
			}
			if (iName.equals("evaan1") || iName.equals("bt13") || iName.equals("garmbeliblis2") || iName.equals("logodarkramage")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("evaan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.evaan1());

						} else if (iName.equals("bt13")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bt13());

						} else if (iName.equals("garmbeliblis2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.garmbeliblis2());

						} else if (iName.equals("logodarkramage")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarkramage());

						}
					}
				});
				return true;
			}
			if (iName.equals("logosithoimperialwar") || iName.equals("r2d2dagobah") || iName.equals("theta1") || iName.equals("rattatak2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logosithoimperialwar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logosithoimperialwar());

						} else if (iName.equals("r2d2dagobah")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2d2dagobah());

						} else if (iName.equals("theta1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.theta1());

						} else if (iName.equals("rattatak2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rattatak2());

						}
					}
				});
				return true;
			}
			if (iName.equals("orgusdin3") || iName.equals("obadiah1") || iName.equals("geonosis2") || iName.equals("anakin12")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("orgusdin3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.orgusdin3());

						} else if (iName.equals("obadiah1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.obadiah1());

						} else if (iName.equals("geonosis2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.geonosis2());

						} else if (iName.equals("anakin12")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anakin12());

						}
					}
				});
				return true;
			}
			if (iName.equals("lulo1") || iName.equals("logobailorgana") || iName.equals("crimsonempire1") || iName.equals("kraytobiwan")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("lulo1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lulo1());

						} else if (iName.equals("logobailorgana")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logobailorgana());

						} else if (iName.equals("crimsonempire1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.crimsonempire1());

						} else if (iName.equals("kraytobiwan")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kraytobiwan());

						}
					}
				});
				return true;
			}
			if (iName.equals("encyclopedie") || iName.equals("leia1") || iName.equals("feylya1") || iName.equals("tahirianakin")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("encyclopedie")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.encyclopedie());

						} else if (iName.equals("leia1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.leia1());

						} else if (iName.equals("feylya1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.feylya1());

						} else if (iName.equals("tahirianakin")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tahirianakin());

						}
					}
				});
				return true;
			}
			if (iName.equals("iego2") || iName.equals("revanfleet") || iName.equals("infiniteempire2") || iName.equals("nejaa1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("iego2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.iego2());

						} else if (iName.equals("revanfleet")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.revanfleet());

						} else if (iName.equals("infiniteempire2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.infiniteempire2());

						} else if (iName.equals("nejaa1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nejaa1());

						}
					}
				});
				return true;
			}
			if (iName.equals("xizor1") || iName.equals("siritachi3") || iName.equals("technobeast1") || iName.equals("sdmc801")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("xizor1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.xizor1());

						} else if (iName.equals("siritachi3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.siritachi3());

						} else if (iName.equals("technobeast1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.technobeast1());

						} else if (iName.equals("sdmc801")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdmc801());

						}
					}
				});
				return true;
			}
			if (iName.equals("logovestarakhai") || iName.equals("reydepart") || iName.equals("logobenskywalker") || iName.equals("neek1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logovestarakhai")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logovestarakhai());

						} else if (iName.equals("reydepart")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.reydepart());

						} else if (iName.equals("logobenskywalker")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logobenskywalker());

						} else if (iName.equals("neek1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.neek1());

						}
					}
				});
				return true;
			}
			if (iName.equals("logojaggedantilles") || iName.equals("waxer2") || iName.equals("rexchristophsis") || iName.equals("attichitkut1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logojaggedantilles")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logojaggedantilles());

						} else if (iName.equals("waxer2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.waxer2());

						} else if (iName.equals("rexchristophsis")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rexchristophsis());

						} else if (iName.equals("attichitkut1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.attichitkut1());

						}
					}
				});
				return true;
			}
			if (iName.equals("obiwan13") || iName.equals("karekun1") || iName.equals("wayland2") || iName.equals("raanateydeath")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("obiwan13")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.obiwan13());

						} else if (iName.equals("karekun1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.karekun1());

						} else if (iName.equals("wayland2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.wayland2());

						} else if (iName.equals("raanateydeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.raanateydeath());

						}
					}
				});
				return true;
			}
			if (iName.equals("padme8") || iName.equals("navettenune1") || iName.equals("yevetha2") || iName.equals("masamedda3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("padme8")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.padme8());

						} else if (iName.equals("navettenune1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.navettenune1());

						} else if (iName.equals("yevetha2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.yevetha2());

						} else if (iName.equals("masamedda3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.masamedda3());

						}
					}
				});
				return true;
			}
			if (iName.equals("nosaurien1") || iName.equals("allianceterritoriescenter11ay") || iName.equals("anakin6") || iName.equals("pulsipher2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("nosaurien1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nosaurien1());

						} else if (iName.equals("allianceterritoriescenter11ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.allianceterritoriescenter11ay());

						} else if (iName.equals("anakin6")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anakin6());

						} else if (iName.equals("pulsipher2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.pulsipher2());

						}
					}
				});
				return true;
			}
			if (iName.equals("cloudcar1") || iName.equals("elingarza1") || iName.equals("vima2") || iName.equals("crystaanzer1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("cloudcar1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cloudcar1());

						} else if (iName.equals("elingarza1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.elingarza1());

						} else if (iName.equals("vima2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vima2());

						} else if (iName.equals("crystaanzer1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.crystaanzer1());

						}
					}
				});
				return true;
			}
			if (iName.equals("dewback1") || iName.equals("natcade") || iName.equals("benvestara") || iName.equals("teth2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("dewback1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dewback1());

						} else if (iName.equals("natcade")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.natcade());

						} else if (iName.equals("benvestara")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.benvestara());

						} else if (iName.equals("teth2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.teth2());

						}
					}
				});
				return true;
			}
			if (iName.equals("hazardtrooper2") || iName.equals("rebeltransports") || iName.equals("joruus1") || iName.equals("depabillaba2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("hazardtrooper2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hazardtrooper2());

						} else if (iName.equals("rebeltransports")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rebeltransports());

						} else if (iName.equals("joruus1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.joruus1());

						} else if (iName.equals("depabillaba2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.depabillaba2());

						}
					}
				});
				return true;
			}
			if (iName.equals("zekk2") || iName.equals("jool1") || iName.equals("kypdurron1") || iName.equals("poncgavrisom1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("zekk2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zekk2());

						} else if (iName.equals("jool1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jool1());

						} else if (iName.equals("kypdurron1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kypdurron1());

						} else if (iName.equals("poncgavrisom1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.poncgavrisom1());

						}
					}
				});
				return true;
			}
			if (iName.equals("talzin2") || iName.equals("umbaran2") || iName.equals("forndodonna1") || iName.equals("tz3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("talzin2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.talzin2());

						} else if (iName.equals("umbaran2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.umbaran2());

						} else if (iName.equals("forndodonna1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.forndodonna1());

						} else if (iName.equals("tz3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tz3());

						}
					}
				});
				return true;
			}
			if (iName.equals("leviathan2") || iName.equals("sdvictory2") || iName.equals("anakinsolo2") || iName.equals("yodacouncil")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("leviathan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.leviathan2());

						} else if (iName.equals("sdvictory2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdvictory2());

						} else if (iName.equals("anakinsolo2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anakinsolo2());

						} else if (iName.equals("yodacouncil")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.yodacouncil());

						}
					}
				});
				return true;
			}
			if (iName.equals("hondokarrandurgo") || iName.equals("cayspeach") || iName.equals("yavin1") || iName.equals("eopie1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("hondokarrandurgo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hondokarrandurgo());

						} else if (iName.equals("cayspeach")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cayspeach());

						} else if (iName.equals("yavin1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.yavin1());

						} else if (iName.equals("eopie1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.eopie1());

						}
					}
				});
				return true;
			}

		return false;
	}
}