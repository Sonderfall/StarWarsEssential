package com.starwars.app.client.resources.imagetwo;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.resources.client.ImageResource;
import com.starwars.app.client.mct.ASyncCall;
import com.starwars.app.client.resources.StarWarsImageResources;

public class StarWarsMethodResourcesImageTwo {
	
	public static boolean callMethodImage(final ASyncCall<ImageResource> iASyncCall, final String iName) {
			if (iName.equals("moncal1") || iName.equals("tx20") || iName.equals("karath2") || iName.equals("snowspeeder2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("moncal1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.moncal1());

						} else if (iName.equals("tx20")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tx20());

						} else if (iName.equals("karath2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.karath2());

						} else if (iName.equals("snowspeeder2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.snowspeeder2());

						}
					}
				});
				return true;
			}
			if (iName.equals("blackfleet2") || iName.equals("pogglethebrief1") || iName.equals("qurahn2") || iName.equals("corellia1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("blackfleet2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.blackfleet2());

						} else if (iName.equals("pogglethebrief1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.pogglethebrief1());

						} else if (iName.equals("qurahn2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.qurahn2());

						} else if (iName.equals("corellia1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.corellia1());

						}
					}
				});
				return true;
			}
			if (iName.equals("koro21") || iName.equals("shadoyoung") || iName.equals("trasaa2") || iName.equals("laser1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("koro21")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.koro21());

						} else if (iName.equals("shadoyoung")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shadoyoung());

						} else if (iName.equals("trasaa2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.trasaa2());

						} else if (iName.equals("laser1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.laser1());

						}
					}
				});
				return true;
			}
			if (iName.equals("chopper4") || iName.equals("nomanor1") || iName.equals("bozpity2") || iName.equals("roanfel4")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("chopper4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chopper4());

						} else if (iName.equals("nomanor1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nomanor1());

						} else if (iName.equals("bozpity2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bozpity2());

						} else if (iName.equals("roanfel4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.roanfel4());

						}
					}
				});
				return true;
			}
			if (iName.equals("anaxes1") || iName.equals("bobafettvsvador") || iName.equals("obiwan4") || iName.equals("janks1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("anaxes1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anaxes1());

						} else if (iName.equals("bobafettvsvador")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bobafettvsvador());

						} else if (iName.equals("obiwan4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.obiwan4());

						} else if (iName.equals("janks1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.janks1());

						}
					}
				});
				return true;
			}
			if (iName.equals("saarai1") || iName.equals("balancepeople") || iName.equals("logogethzeriondjo") || iName.equals("hoth1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("saarai1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.saarai1());

						} else if (iName.equals("balancepeople")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.balancepeople());

						} else if (iName.equals("logogethzeriondjo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logogethzeriondjo());

						} else if (iName.equals("hoth1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hoth1());

						}
					}
				});
				return true;
			}
			if (iName.equals("ordmantel1") || iName.equals("aqualish1") || iName.equals("christophsis2") || iName.equals("imperialcivilwar2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ordmantel1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ordmantel1());

						} else if (iName.equals("aqualish1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.aqualish1());

						} else if (iName.equals("christophsis2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.christophsis2());

						} else if (iName.equals("imperialcivilwar2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.imperialcivilwar2());

						}
					}
				});
				return true;
			}
			if (iName.equals("hera1") || iName.equals("wildkarrde2") || iName.equals("saulkarath1") || iName.equals("tridroidfighter1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("hera1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hera1());

						} else if (iName.equals("wildkarrde2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.wildkarrde2());

						} else if (iName.equals("saulkarath1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.saulkarath1());

						} else if (iName.equals("tridroidfighter1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tridroidfighter1());

						}
					}
				});
				return true;
			}
			if (iName.equals("darkwyyrlok2") || iName.equals("sabine4") || iName.equals("sithpur1") || iName.equals("deathsquadron")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("darkwyyrlok2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkwyyrlok2());

						} else if (iName.equals("sabine4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sabine4());

						} else if (iName.equals("sithpur1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sithpur1());

						} else if (iName.equals("deathsquadron")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.deathsquadron());

						}
					}
				});
				return true;
			}
			if (iName.equals("luketeneniel") || iName.equals("yavin2") || iName.equals("eriaduauthority4ay") || iName.equals("tulkar1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("luketeneniel")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.luketeneniel());

						} else if (iName.equals("yavin2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.yavin2());

						} else if (iName.equals("eriaduauthority4ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.eriaduauthority4ay());

						} else if (iName.equals("tulkar1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tulkar1());

						}
					}
				});
				return true;
			}
			if (iName.equals("tionne2") || iName.equals("leia2") || iName.equals("rttt1") || iName.equals("maladibegin")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("tionne2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tionne2());

						} else if (iName.equals("leia2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.leia2());

						} else if (iName.equals("rttt1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rttt1());

						} else if (iName.equals("maladibegin")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.maladibegin());

						}
					}
				});
				return true;
			}
			if (iName.equals("logounknown") || iName.equals("panaka2") || iName.equals("infiniteempire3") || iName.equals("snivvian1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logounknown")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logounknown());

						} else if (iName.equals("panaka2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.panaka2());

						} else if (iName.equals("infiniteempire3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.infiniteempire3());

						} else if (iName.equals("snivvian1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.snivvian1());

						}
					}
				});
				return true;
			}
			if (iName.equals("byss2") || iName.equals("landovong") || iName.equals("blasterrifledc171") || iName.equals("ywing2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("byss2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.byss2());

						} else if (iName.equals("landovong")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.landovong());

						} else if (iName.equals("blasterrifledc171")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.blasterrifledc171());

						} else if (iName.equals("ywing2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ywing2());

						}
					}
				});
				return true;
			}
			if (iName.equals("jerec1") || iName.equals("arkanian1") || iName.equals("harch1") || iName.equals("sarco2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("jerec1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jerec1());

						} else if (iName.equals("arkanian1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.arkanian1());

						} else if (iName.equals("harch1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.harch1());

						} else if (iName.equals("sarco2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sarco2());

						}
					}
				});
				return true;
			}
			if (iName.equals("fyrnocksbattle") || iName.equals("anakin13") || iName.equals("jangozam") || iName.equals("newjediorder2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("fyrnocksbattle")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.fyrnocksbattle());

						} else if (iName.equals("anakin13")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anakin13());

						} else if (iName.equals("jangozam")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jangozam());

						} else if (iName.equals("newjediorder2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.newjediorder2());

						}
					}
				});
				return true;
			}
			if (iName.equals("darkstryfe2") || iName.equals("greatgalacticwar1") || iName.equals("tatooine2") || iName.equals("reppeople")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("darkstryfe2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkstryfe2());

						} else if (iName.equals("greatgalacticwar1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.greatgalacticwar1());

						} else if (iName.equals("tatooine2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tatooine2());

						} else if (iName.equals("reppeople")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.reppeople());

						}
					}
				});
				return true;
			}
			if (iName.equals("droidb22") || iName.equals("logodarkempire") || iName.equals("lottdod1") || iName.equals("imperialarmy")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("droidb22")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.droidb22());

						} else if (iName.equals("logodarkempire")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarkempire());

						} else if (iName.equals("lottdod1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lottdod1());

						} else if (iName.equals("imperialarmy")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.imperialarmy());

						}
					}
				});
				return true;
			}
			if (iName.equals("roshpenin1") || iName.equals("eelysa1") || iName.equals("hyperespace1") || iName.equals("xizor2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("roshpenin1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.roshpenin1());

						} else if (iName.equals("eelysa1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.eelysa1());

						} else if (iName.equals("hyperespace1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hyperespace1());

						} else if (iName.equals("xizor2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.xizor2());

						}
					}
				});
				return true;
			}
			if (iName.equals("masamedda2") || iName.equals("eternalwar1") || iName.equals("repsoldier") || iName.equals("luke1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("masamedda2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.masamedda2());

						} else if (iName.equals("eternalwar1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.eternalwar1());

						} else if (iName.equals("repsoldier")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.repsoldier());

						} else if (iName.equals("luke1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.luke1());

						}
					}
				});
				return true;
			}
			if (iName.equals("rattatak1") || iName.equals("christophsis1") || iName.equals("siritachi2") || iName.equals("t62")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("rattatak1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rattatak1());

						} else if (iName.equals("christophsis1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.christophsis1());

						} else if (iName.equals("siritachi2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.siritachi2());

						} else if (iName.equals("t62")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.t62());

						}
					}
				});
				return true;
			}
			if (iName.equals("tenelkajacen") || iName.equals("dengarkage") || iName.equals("logomicahrawk") || iName.equals("opee1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("tenelkajacen")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tenelkajacen());

						} else if (iName.equals("dengarkage")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dengarkage());

						} else if (iName.equals("logomicahrawk")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logomicahrawk());

						} else if (iName.equals("opee1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.opee1());

						}
					}
				});
				return true;
			}
			if (iName.equals("sensitivepeople") || iName.equals("zekk1") || iName.equals("logogoldenage") || iName.equals("rasktalsu1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("sensitivepeople")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sensitivepeople());

						} else if (iName.equals("zekk1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zekk1());

						} else if (iName.equals("logogoldenage")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logogoldenage());

						} else if (iName.equals("rasktalsu1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rasktalsu1());

						}
					}
				});
				return true;
			}
			if (iName.equals("talzin3") || iName.equals("jediorder1") || iName.equals("clonearmy") || iName.equals("turbolaser1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("talzin3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.talzin3());

						} else if (iName.equals("jediorder1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jediorder1());

						} else if (iName.equals("clonearmy")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.clonearmy());

						} else if (iName.equals("turbolaser1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.turbolaser1());

						}
					}
				});
				return true;
			}
			if (iName.equals("fettfamily") || iName.equals("cloudcar2") || iName.equals("bastila2") || iName.equals("galaxy")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("fettfamily")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.fettfamily());

						} else if (iName.equals("cloudcar2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cloudcar2());

						} else if (iName.equals("bastila2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bastila2());

						} else if (iName.equals("galaxy")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.galaxy());

						}
					}
				});
				return true;
			}
			if (iName.equals("dewback2") || iName.equals("daiman1") || iName.equals("tz2") || iName.equals("r2d2cymoon")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("dewback2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dewback2());

						} else if (iName.equals("daiman1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.daiman1());

						} else if (iName.equals("tz2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tz2());

						} else if (iName.equals("r2d2cymoon")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2d2cymoon());

						}
					}
				});
				return true;
			}
			if (iName.equals("deliahblue1") || iName.equals("navettelambda1") || iName.equals("nihlhavok") || iName.equals("grakkus1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("deliahblue1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.deliahblue1());

						} else if (iName.equals("navettelambda1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.navettelambda1());

						} else if (iName.equals("nihlhavok")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nihlhavok());

						} else if (iName.equals("grakkus1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.grakkus1());

						}
					}
				});
				return true;
			}
			if (iName.equals("repships") || iName.equals("raxusprime2") || iName.equals("zsinjempire6ay") || iName.equals("newsithwars2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("repships")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.repships());

						} else if (iName.equals("raxusprime2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.raxusprime2());

						} else if (iName.equals("zsinjempire6ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zsinjempire6ay());

						} else if (iName.equals("newsithwars2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.newsithwars2());

						}
					}
				});
				return true;
			}
			if (iName.equals("saeseetiin3") || iName.equals("conflict") || iName.equals("logodarktyranus") || iName.equals("umbaran1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("saeseetiin3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.saeseetiin3());

						} else if (iName.equals("conflict")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.conflict());

						} else if (iName.equals("logodarktyranus")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarktyranus());

						} else if (iName.equals("umbaran1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.umbaran1());

						}
					}
				});
				return true;
			}
			if (iName.equals("concepts") || iName.equals("ithorian1") || iName.equals("imperialposter") || iName.equals("anakin7")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("concepts")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.concepts());

						} else if (iName.equals("ithorian1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ithorian1());

						} else if (iName.equals("imperialposter")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.imperialposter());

						} else if (iName.equals("anakin7")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anakin7());

						}
					}
				});
				return true;
			}
			if (iName.equals("teshik1") || iName.equals("rockettrooper1") || iName.equals("sdrecusant2") || iName.equals("sigelshado")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("teshik1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.teshik1());

						} else if (iName.equals("rockettrooper1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rockettrooper1());

						} else if (iName.equals("sdrecusant2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdrecusant2());

						} else if (iName.equals("sigelshado")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sigelshado());

						}
					}
				});
				return true;
			}
			if (iName.equals("sheathipede2") || iName.equals("genealogie") || iName.equals("maladivao") || iName.equals("darkbrotherhood2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("sheathipede2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sheathipede2());

						} else if (iName.equals("genealogie")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.genealogie());

						} else if (iName.equals("maladivao")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.maladivao());

						} else if (iName.equals("darkbrotherhood2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkbrotherhood2());

						}
					}
				});
				return true;
			}
			if (iName.equals("evotrooper1") || iName.equals("rebelborn") || iName.equals("newrepublicclassic1") || iName.equals("jediexile")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("evotrooper1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.evotrooper1());

						} else if (iName.equals("rebelborn")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rebelborn());

						} else if (iName.equals("newrepublicclassic1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.newrepublicclassic1());

						} else if (iName.equals("jediexile")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jediexile());

						}
					}
				});
				return true;
			}
			if (iName.equals("ezrapilote") || iName.equals("azlynrae1") || iName.equals("transportfo2") || iName.equals("revanvsmalak")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ezrapilote")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ezrapilote());

						} else if (iName.equals("azlynrae1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.azlynrae1());

						} else if (iName.equals("transportfo2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.transportfo2());

						} else if (iName.equals("revanvsmalak")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.revanvsmalak());

						}
					}
				});
				return true;
			}
			if (iName.equals("bongo2") || iName.equals("mirialan2") || iName.equals("onderon1") || iName.equals("ahsokafight")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("bongo2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bongo2());

						} else if (iName.equals("mirialan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mirialan2());

						} else if (iName.equals("onderon1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.onderon1());

						} else if (iName.equals("ahsokafight")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ahsokafight());

						}
					}
				});
				return true;
			}
			if (iName.equals("vandar4") || iName.equals("darnala1") || iName.equals("oom9") || iName.equals("leiax")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("vandar4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vandar4());

						} else if (iName.equals("darnala1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darnala1());

						} else if (iName.equals("oom9")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.oom9());

						} else if (iName.equals("leiax")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.leiax());

						}
					}
				});
				return true;
			}
			if (iName.equals("gran2") || iName.equals("garazeborrelios1") || iName.equals("logodarkbrotherhood") || iName.equals("treissinde1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("gran2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gran2());

						} else if (iName.equals("garazeborrelios1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.garazeborrelios1());

						} else if (iName.equals("logodarkbrotherhood")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarkbrotherhood());

						} else if (iName.equals("treissinde1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.treissinde1());

						}
					}
				});
				return true;
			}
			if (iName.equals("anakin22") || iName.equals("vuarapuung1") || iName.equals("chalactan1") || iName.equals("r6h5")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("anakin22")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anakin22());

						} else if (iName.equals("vuarapuung1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vuarapuung1());

						} else if (iName.equals("chalactan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chalactan1());

						} else if (iName.equals("r6h5")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r6h5());

						}
					}
				});
				return true;
			}
			if (iName.equals("twilek1") || iName.equals("setharth2") || iName.equals("zekk3") || iName.equals("deathwatch1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("twilek1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.twilek1());

						} else if (iName.equals("setharth2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.setharth2());

						} else if (iName.equals("zekk3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zekk3());

						} else if (iName.equals("deathwatch1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.deathwatch1());

						}
					}
				});
				return true;
			}
			if (iName.equals("concordia1") || iName.equals("grievouscoruscant") || iName.equals("crossfire1") || iName.equals("nefroyal1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("concordia1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.concordia1());

						} else if (iName.equals("grievouscoruscant")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.grievouscoruscant());

						} else if (iName.equals("crossfire1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.crossfire1());

						} else if (iName.equals("nefroyal1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nefroyal1());

						}
					}
				});
				return true;
			}
			if (iName.equals("zillo2") || iName.equals("marahutt") || iName.equals("hanlando1") || iName.equals("stazibetrayal")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("zillo2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zillo2());

						} else if (iName.equals("marahutt")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.marahutt());

						} else if (iName.equals("hanlando1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hanlando1());

						} else if (iName.equals("stazibetrayal")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.stazibetrayal());

						}
					}
				});
				return true;
			}
			if (iName.equals("mynock1") || iName.equals("sdassertor1") || iName.equals("khaleen2") || iName.equals("galacticrepublicsouth12000by")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("mynock1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mynock1());

						} else if (iName.equals("sdassertor1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdassertor1());

						} else if (iName.equals("khaleen2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.khaleen2());

						} else if (iName.equals("galacticrepublicsouth12000by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.galacticrepublicsouth12000by());

						}
					}
				});
				return true;
			}
			if (iName.equals("jokers1") || iName.equals("annihilatorfighter2") || iName.equals("imperialknight1") || iName.equals("obiwan6")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("jokers1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jokers1());

						} else if (iName.equals("annihilatorfighter2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.annihilatorfighter2());

						} else if (iName.equals("imperialknight1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.imperialknight1());

						} else if (iName.equals("obiwan6")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.obiwan6());

						}
					}
				});
				return true;
			}
			if (iName.equals("benskywalker2") || iName.equals("waxer1") || iName.equals("ajuntapall2") || iName.equals("galak2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("benskywalker2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.benskywalker2());

						} else if (iName.equals("waxer1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.waxer1());

						} else if (iName.equals("ajuntapall2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ajuntapall2());

						} else if (iName.equals("galak2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.galak2());

						}
					}
				});
				return true;
			}
			if (iName.equals("oddymuva1") || iName.equals("obiwan12") || iName.equals("testjedi2") || iName.equals("hailfire3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("oddymuva1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.oddymuva1());

						} else if (iName.equals("obiwan12")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.obiwan12());

						} else if (iName.equals("testjedi2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.testjedi2());

						} else if (iName.equals("hailfire3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hailfire3());

						}
					}
				});
				return true;
			}
			if (iName.equals("kylekatarn1") || iName.equals("talz1") || iName.equals("starforgebattle") || iName.equals("bocaseca1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kylekatarn1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kylekatarn1());

						} else if (iName.equals("talz1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.talz1());

						} else if (iName.equals("starforgebattle")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.starforgebattle());

						} else if (iName.equals("bocaseca1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bocaseca1());

						}
					}
				});
				return true;
			}
			if (iName.equals("firstorder2") || iName.equals("sdacclamator1") || iName.equals("jagged2") || iName.equals("tiepredator1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("firstorder2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.firstorder2());

						} else if (iName.equals("sdacclamator1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdacclamator1());

						} else if (iName.equals("jagged2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jagged2());

						} else if (iName.equals("tiepredator1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tiepredator1());

						}
					}
				});
				return true;
			}
			if (iName.equals("aurebesh1") || iName.equals("hyenabomber1") || iName.equals("firstgreatschism2") || iName.equals("luke3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("aurebesh1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.aurebesh1());

						} else if (iName.equals("hyenabomber1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hyenabomber1());

						} else if (iName.equals("firstgreatschism2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.firstgreatschism2());

						} else if (iName.equals("luke3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.luke3());

						}
					}
				});
				return true;
			}
			if (iName.equals("selonian1") || iName.equals("ugnaught2") || iName.equals("blasterdl442") || iName.equals("anyakuro3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("selonian1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.selonian1());

						} else if (iName.equals("ugnaught2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ugnaught2());

						} else if (iName.equals("blasterdl442")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.blasterdl442());

						} else if (iName.equals("anyakuro3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anyakuro3());

						}
					}
				});
				return true;
			}
			if (iName.equals("snoke2") || iName.equals("sabine2") || iName.equals("alat1") || iName.equals("kraytvergere")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("snoke2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.snoke2());

						} else if (iName.equals("sabine2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sabine2());

						} else if (iName.equals("alat1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.alat1());

						} else if (iName.equals("kraytvergere")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kraytvergere());

						}
					}
				});
				return true;
			}
			if (iName.equals("trandoshan2") || iName.equals("ozzel1") || iName.equals("sabinebounty") || iName.equals("tiefantom1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("trandoshan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.trandoshan2());

						} else if (iName.equals("ozzel1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ozzel1());

						} else if (iName.equals("sabinebounty")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sabinebounty());

						} else if (iName.equals("tiefantom1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tiefantom1());

						}
					}
				});
				return true;
			}
			if (iName.equals("previzsla1") || iName.equals("attonrand2") || iName.equals("darkjedi") || iName.equals("azlynbacta")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("previzsla1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.previzsla1());

						} else if (iName.equals("attonrand2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.attonrand2());

						} else if (iName.equals("darkjedi")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkjedi());

						} else if (iName.equals("azlynbacta")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.azlynbacta());

						}
					}
				});
				return true;
			}
			if (iName.equals("droidtransport2") || iName.equals("kaminoan2") || iName.equals("sevensister2") || iName.equals("calixtecaamas")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("droidtransport2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.droidtransport2());

						} else if (iName.equals("kaminoan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kaminoan2());

						} else if (iName.equals("sevensister2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sevensister2());

						} else if (iName.equals("calixtecaamas")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.calixtecaamas());

						}
					}
				});
				return true;
			}
			if (iName.equals("rey2") || iName.equals("soontirfel2") || iName.equals("maraswarmwar") || iName.equals("codygeonosis")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("rey2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rey2());

						} else if (iName.equals("soontirfel2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.soontirfel2());

						} else if (iName.equals("maraswarmwar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.maraswarmwar());

						} else if (iName.equals("codygeonosis")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.codygeonosis());

						}
					}
				});
				return true;
			}
			if (iName.equals("atris1") || iName.equals("krieg2") || iName.equals("jangoarmy") || iName.equals("crimsonempire2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("atris1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.atris1());

						} else if (iName.equals("krieg2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.krieg2());

						} else if (iName.equals("jangoarmy")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jangoarmy());

						} else if (iName.equals("crimsonempire2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.crimsonempire2());

						}
					}
				});
				return true;
			}
			if (iName.equals("ghost1") || iName.equals("skalnas1") || iName.equals("logorevanempire") || iName.equals("siritachi4")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ghost1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ghost1());

						} else if (iName.equals("skalnas1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.skalnas1());

						} else if (iName.equals("logorevanempire")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logorevanempire());

						} else if (iName.equals("siritachi4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.siritachi4());

						}
					}
				});
				return true;
			}
			if (iName.equals("florrum2") || iName.equals("sithempirenortheast1000by") || iName.equals("vulturefighter2") || iName.equals("outlawpeople")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("florrum2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.florrum2());

						} else if (iName.equals("sithempirenortheast1000by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sithempirenortheast1000by());

						} else if (iName.equals("vulturefighter2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vulturefighter2());

						} else if (iName.equals("outlawpeople")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.outlawpeople());

						}
					}
				});
				return true;
			}
			if (iName.equals("needa1") || iName.equals("tptt1") || iName.equals("zamwesell1") || iName.equals("theta2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("needa1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.needa1());

						} else if (iName.equals("tptt1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tptt1());

						} else if (iName.equals("zamwesell1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zamwesell1());

						} else if (iName.equals("theta2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.theta2());

						}
					}
				});
				return true;
			}
			if (iName.equals("katarnjerec") || iName.equals("obiwan14") || iName.equals("feylya2") || iName.equals("antaresfelfight")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("katarnjerec")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.katarnjerec());

						} else if (iName.equals("obiwan14")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.obiwan14());

						} else if (iName.equals("feylya2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.feylya2());

						} else if (iName.equals("antaresfelfight")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.antaresfelfight());

						}
					}
				});
				return true;
			}
			if (iName.equals("yevetha1") || iName.equals("nautolan2") || iName.equals("waxer3") || iName.equals("faucon1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("yevetha1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.yevetha1());

						} else if (iName.equals("nautolan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nautolan2());

						} else if (iName.equals("waxer3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.waxer3());

						} else if (iName.equals("faucon1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.faucon1());

						}
					}
				});
				return true;
			}
			if (iName.equals("plokoon3") || iName.equals("separatistspacesoutheast122by") || iName.equals("sdvenator2") || iName.equals("nakiayoru1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("plokoon3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.plokoon3());

						} else if (iName.equals("separatistspacesoutheast122by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.separatistspacesoutheast122by());

						} else if (iName.equals("sdvenator2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdvenator2());

						} else if (iName.equals("nakiayoru1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nakiayoru1());

						}
					}
				});
				return true;
			}
			if (iName.equals("trtt2") || iName.equals("alemarar2") || iName.equals("treissindemoncal") || iName.equals("arcsoldier1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("trtt2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.trtt2());

						} else if (iName.equals("alemarar2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.alemarar2());

						} else if (iName.equals("treissindemoncal")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.treissindemoncal());

						} else if (iName.equals("arcsoldier1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.arcsoldier1());

						}
					}
				});
				return true;
			}
			if (iName.equals("orgusdin2") || iName.equals("martiobatch1") || iName.equals("cymoon1") || iName.equals("octuptarradroid1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("orgusdin2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.orgusdin2());

						} else if (iName.equals("martiobatch1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.martiobatch1());

						} else if (iName.equals("cymoon1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cymoon1());

						} else if (iName.equals("octuptarradroid1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.octuptarradroid1());

						}
					}
				});
				return true;
			}
			if (iName.equals("logovong") || iName.equals("tanktx1") || iName.equals("mandindomptable1") || iName.equals("anakin15")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logovong")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logovong());

						} else if (iName.equals("tanktx1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tanktx1());

						} else if (iName.equals("mandindomptable1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mandindomptable1());

						} else if (iName.equals("anakin15")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anakin15());

						}
					}
				});
				return true;
			}
			if (iName.equals("jabba1") || iName.equals("macewinduyoda") || iName.equals("tahl1") || iName.equals("ooroodeath")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("jabba1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jabba1());

						} else if (iName.equals("macewinduyoda")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.macewinduyoda());

						} else if (iName.equals("tahl1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tahl1());

						} else if (iName.equals("ooroodeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ooroodeath());

						}
					}
				});
				return true;
			}
			if (iName.equals("cereen2") || iName.equals("moncalamari1") || iName.equals("quinlanvoshurt") || iName.equals("toydarian1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("cereen2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cereen2());

						} else if (iName.equals("moncalamari1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.moncalamari1());

						} else if (iName.equals("quinlanvoshurt")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.quinlanvoshurt());

						} else if (iName.equals("toydarian1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.toydarian1());

						}
					}
				});
				return true;
			}
			if (iName.equals("ewok2") || iName.equals("c3popalpatine") || iName.equals("palpatineend") || iName.equals("logoisolder")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ewok2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ewok2());

						} else if (iName.equals("c3popalpatine")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.c3popalpatine());

						} else if (iName.equals("palpatineend")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.palpatineend());

						} else if (iName.equals("logoisolder")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoisolder());

						}
					}
				});
				return true;
			}
			if (iName.equals("uwa2") || iName.equals("naberriefamily") || iName.equals("ataru") || iName.equals("padme7")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("uwa2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.uwa2());

						} else if (iName.equals("naberriefamily")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.naberriefamily());

						} else if (iName.equals("ataru")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ataru());

						} else if (iName.equals("padme7")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.padme7());

						}
					}
				});
				return true;
			}
			if (iName.equals("muunilinst2") || iName.equals("logobrehaantilles") || iName.equals("logowedgeantilles") || iName.equals("classic")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("muunilinst2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.muunilinst2());

						} else if (iName.equals("logobrehaantilles")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logobrehaantilles());

						} else if (iName.equals("logowedgeantilles")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logowedgeantilles());

						} else if (iName.equals("classic")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.classic());

						}
					}
				});
				return true;
			}
			if (iName.equals("anakin5") || iName.equals("navettesentinel1") || iName.equals("caleb1") || iName.equals("ladyluck2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("anakin5")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anakin5());

						} else if (iName.equals("navettesentinel1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.navettesentinel1());

						} else if (iName.equals("caleb1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.caleb1());

						} else if (iName.equals("ladyluck2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ladyluck2());

						}
					}
				});
				return true;
			}
			if (iName.equals("tahiriold") || iName.equals("sithfighter1") || iName.equals("sigelstazi") || iName.equals("gavarkhai1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("tahiriold")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tahiriold());

						} else if (iName.equals("sithfighter1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sithfighter1());

						} else if (iName.equals("sigelstazi")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sigelstazi());

						} else if (iName.equals("gavarkhai1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gavarkhai1());

						}
					}
				});
				return true;
			}
			if (iName.equals("anzati1") || iName.equals("onimi1") || iName.equals("zsinj1") || iName.equals("devaron1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("anzati1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anzati1());

						} else if (iName.equals("onimi1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.onimi1());

						} else if (iName.equals("zsinj1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zsinj1());

						} else if (iName.equals("devaron1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.devaron1());

						}
					}
				});
				return true;
			}
			if (iName.equals("corbos1") || iName.equals("logofirstcivilwar") || iName.equals("sdvictory1") || iName.equals("teth1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("corbos1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.corbos1());

						} else if (iName.equals("logofirstcivilwar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logofirstcivilwar());

						} else if (iName.equals("sdvictory1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdvictory1());

						} else if (iName.equals("teth1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.teth1());

						}
					}
				});
				return true;
			}
			if (iName.equals("homeimagetantive") || iName.equals("starkilleryoda") || iName.equals("sithempiresouthwest1000by") || iName.equals("polismassa2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("homeimagetantive")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.homeimagetantive());

						} else if (iName.equals("starkilleryoda")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.starkilleryoda());

						} else if (iName.equals("sithempiresouthwest1000by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sithempiresouthwest1000by());

						} else if (iName.equals("polismassa2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.polismassa2());

						}
					}
				});
				return true;
			}
			if (iName.equals("sdmc1042") || iName.equals("nexu1") || iName.equals("magnaguard1") || iName.equals("darkangral1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("sdmc1042")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdmc1042());

						} else if (iName.equals("nexu1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nexu1());

						} else if (iName.equals("magnaguard1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.magnaguard1());

						} else if (iName.equals("darkangral1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkangral1());

						}
					}
				});
				return true;
			}
			if (iName.equals("macewinduanakin") || iName.equals("logogrievous") || iName.equals("clonesoldat1") || iName.equals("droidb11")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("macewinduanakin")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.macewinduanakin());

						} else if (iName.equals("logogrievous")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logogrievous());

						} else if (iName.equals("clonesoldat1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.clonesoldat1());

						} else if (iName.equals("droidb11")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.droidb11());

						}
					}
				});
				return true;
			}
			if (iName.equals("marisbrood1") || iName.equals("mallatobuck1") || iName.equals("coburn1") || iName.equals("ximempire1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("marisbrood1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.marisbrood1());

						} else if (iName.equals("mallatobuck1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mallatobuck1());

						} else if (iName.equals("coburn1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.coburn1());

						} else if (iName.equals("ximempire1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ximempire1());

						}
					}
				});
				return true;
			}
			if (iName.equals("ezrababy") || iName.equals("ghostcrew7") || iName.equals("jumelle1") || iName.equals("logodarkreave")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ezrababy")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ezrababy());

						} else if (iName.equals("ghostcrew7")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ghostcrew7());

						} else if (iName.equals("jumelle1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jumelle1());

						} else if (iName.equals("logodarkreave")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarkreave());

						}
					}
				});
				return true;
			}
			if (iName.equals("droidtransport1") || iName.equals("carthonasi2") || iName.equals("resistance36ay") || iName.equals("ravcade")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("droidtransport1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.droidtransport1());

						} else if (iName.equals("carthonasi2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.carthonasi2());

						} else if (iName.equals("resistance36ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.resistance36ay());

						} else if (iName.equals("ravcade")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ravcade());

						}
					}
				});
				return true;
			}
			if (iName.equals("fregatescythe1") || iName.equals("logovergere") || iName.equals("nerf2") || iName.equals("droidbuzz2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("fregatescythe1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.fregatescythe1());

						} else if (iName.equals("logovergere")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logovergere());

						} else if (iName.equals("nerf2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nerf2());

						} else if (iName.equals("droidbuzz2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.droidbuzz2());

						}
					}
				});
				return true;
			}
			if (iName.equals("wa72") || iName.equals("chevin1") || iName.equals("sullust2") || iName.equals("roanfelsith")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("wa72")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.wa72());

						} else if (iName.equals("chevin1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chevin1());

						} else if (iName.equals("sullust2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sullust2());

						} else if (iName.equals("roanfelsith")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.roanfelsith());

						}
					}
				});
				return true;
			}
			if (iName.equals("obiwan8") || iName.equals("savage2") || iName.equals("krathbook") || iName.equals("cody1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("obiwan8")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.obiwan8());

						} else if (iName.equals("savage2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.savage2());

						} else if (iName.equals("krathbook")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.krathbook());

						} else if (iName.equals("cody1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cody1());

						}
					}
				});
				return true;
			}
			if (iName.equals("logocadeskywalker") || iName.equals("asajjborsk") || iName.equals("mandultime1") || iName.equals("krrsantan1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logocadeskywalker")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logocadeskywalker());

						} else if (iName.equals("asajjborsk")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.asajjborsk());

						} else if (iName.equals("mandultime1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mandultime1());

						} else if (iName.equals("krrsantan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.krrsantan1());

						}
					}
				});
				return true;
			}
			if (iName.equals("taivas2") || iName.equals("raydonia2") || iName.equals("anakin3") || iName.equals("imperialssd")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("taivas2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.taivas2());

						} else if (iName.equals("raydonia2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.raydonia2());

						} else if (iName.equals("anakin3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anakin3());

						} else if (iName.equals("imperialssd")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.imperialssd());

						}
					}
				});
				return true;
			}
			if (iName.equals("umbara1") || iName.equals("jaina3") || iName.equals("bobafettjaina") || iName.equals("jediart1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("umbara1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.umbara1());

						} else if (iName.equals("jaina3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jaina3());

						} else if (iName.equals("bobafettjaina")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bobafettjaina());

						} else if (iName.equals("jediart1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jediart1());

						}
					}
				});
				return true;
			}
			if (iName.equals("sorabulq1") || iName.equals("logodarkkruhl") || iName.equals("leiakillik") || iName.equals("bokatankryze1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("sorabulq1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sorabulq1());

						} else if (iName.equals("logodarkkruhl")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarkkruhl());

						} else if (iName.equals("leiakillik")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.leiakillik());

						} else if (iName.equals("bokatankryze1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bokatankryze1());

						}
					}
				});
				return true;
			}
			if (iName.equals("hyperespace3") || iName.equals("sharabey1") || iName.equals("cassusfett2") || iName.equals("imperialsoldier")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("hyperespace3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hyperespace3());

						} else if (iName.equals("sharabey1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sharabey1());

						} else if (iName.equals("cassusfett2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cassusfett2());

						} else if (iName.equals("imperialsoldier")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.imperialsoldier());

						}
					}
				});
				return true;
			}
			if (iName.equals("azlynrasituum") || iName.equals("asajjventressvsanakin2") || iName.equals("obiwan10") || iName.equals("belbullab2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("azlynrasituum")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.azlynrasituum());

						} else if (iName.equals("asajjventressvsanakin2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.asajjventressvsanakin2());

						} else if (iName.equals("obiwan10")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.obiwan10());

						} else if (iName.equals("belbullab2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.belbullab2());

						}
					}
				});
				return true;
			}
			if (iName.equals("gamorr1") || iName.equals("voxyn2") || iName.equals("c3potatooine") || iName.equals("sdviscount1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("gamorr1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gamorr1());

						} else if (iName.equals("voxyn2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.voxyn2());

						} else if (iName.equals("c3potatooine")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.c3potatooine());

						} else if (iName.equals("sdviscount1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdviscount1());

						}
					}
				});
				return true;
			}
			if (iName.equals("shaakti4") || iName.equals("cadedeliahjaria") || iName.equals("gina1") || iName.equals("ezra2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("shaakti4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shaakti4());

						} else if (iName.equals("cadedeliahjaria")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cadedeliahjaria());

						} else if (iName.equals("gina1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gina1());

						} else if (iName.equals("ezra2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ezra2());

						}
					}
				});
				return true;
			}
			if (iName.equals("hailfire1") || iName.equals("ornfreetaa1") || iName.equals("jamillia2") || iName.equals("vitiate2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("hailfire1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hailfire1());

						} else if (iName.equals("ornfreetaa1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ornfreetaa1());

						} else if (iName.equals("jamillia2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jamillia2());

						} else if (iName.equals("vitiate2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vitiate2());

						}
					}
				});
				return true;
			}
			if (iName.equals("ruusan2") || iName.equals("tsavonglah2") || iName.equals("sdpellaeon2") || iName.equals("weequay1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ruusan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ruusan2());

						} else if (iName.equals("tsavonglah2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tsavonglah2());

						} else if (iName.equals("sdpellaeon2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdpellaeon2());

						} else if (iName.equals("weequay1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.weequay1());

						}
					}
				});
				return true;
			}
			if (iName.equals("logomarajade") || iName.equals("kkruhknature") || iName.equals("c3pobirth") || iName.equals("gamorrean2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logomarajade")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logomarajade());

						} else if (iName.equals("kkruhknature")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kkruhknature());

						} else if (iName.equals("c3pobirth")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.c3pobirth());

						} else if (iName.equals("gamorrean2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gamorrean2());

						}
					}
				});
				return true;
			}
			if (iName.equals("rebelfighters") || iName.equals("finn1") || iName.equals("hadabbadon2") || iName.equals("logopterthanas")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("rebelfighters")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rebelfighters());

						} else if (iName.equals("finn1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.finn1());

						} else if (iName.equals("hadabbadon2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hadabbadon2());

						} else if (iName.equals("logopterthanas")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logopterthanas());

						}
					}
				});
				return true;
			}
			if (iName.equals("c3popatitite") || iName.equals("rex1") || iName.equals("anyakuro1") || iName.equals("rasituum1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("c3popatitite")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.c3popatitite());

						} else if (iName.equals("rex1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rex1());

						} else if (iName.equals("anyakuro1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anyakuro1());

						} else if (iName.equals("rasituum1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rasituum1());

						}
					}
				});
				return true;
			}
			if (iName.equals("kallusdest") || iName.equals("malachorv1") || iName.equals("corvette2") || iName.equals("ahsoka2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kallusdest")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kallusdest());

						} else if (iName.equals("malachorv1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.malachorv1());

						} else if (iName.equals("corvette2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.corvette2());

						} else if (iName.equals("ahsoka2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ahsoka2());

						}
					}
				});
				return true;
			}
			if (iName.equals("canonsonique2") || iName.equals("sdprovidence2") || iName.equals("shumai2") || iName.equals("azlynkrayt")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("canonsonique2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.canonsonique2());

						} else if (iName.equals("sdprovidence2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdprovidence2());

						} else if (iName.equals("shumai2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shumai2());

						} else if (iName.equals("azlynkrayt")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.azlynkrayt());

						}
					}
				});
				return true;
			}
			if (iName.equals("aleemaketo4") || iName.equals("csimilitary") || iName.equals("han6") || iName.equals("kovakier1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("aleemaketo4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.aleemaketo4());

						} else if (iName.equals("csimilitary")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.csimilitary());

						} else if (iName.equals("han6")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.han6());

						} else if (iName.equals("kovakier1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kovakier1());

						}
					}
				});
				return true;
			}
			if (iName.equals("kiros2") || iName.equals("xesh3") || iName.equals("revanorder1") || iName.equals("mandsauveur1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kiros2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kiros2());

						} else if (iName.equals("xesh3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.xesh3());

						} else if (iName.equals("revanorder1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.revanorder1());

						} else if (iName.equals("mandsauveur1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mandsauveur1());

						}
					}
				});
				return true;
			}
			if (iName.equals("wullfyularen2") || iName.equals("thrawnvador") || iName.equals("tsuchoideath") || iName.equals("tbtt1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("wullfyularen2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.wullfyularen2());

						} else if (iName.equals("thrawnvador")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.thrawnvador());

						} else if (iName.equals("tsuchoideath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tsuchoideath());

						} else if (iName.equals("tbtt1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tbtt1());

						}
					}
				});
				return true;
			}
			if (iName.equals("ortolan2") || iName.equals("corellianhegemony17000by") || iName.equals("logodaiman") || iName.equals("fambaa1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ortolan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ortolan2());

						} else if (iName.equals("corellianhegemony17000by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.corellianhegemony17000by());

						} else if (iName.equals("logodaiman")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodaiman());

						} else if (iName.equals("fambaa1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.fambaa1());

						}
					}
				});
				return true;
			}
			if (iName.equals("kama1") || iName.equals("sevrancetann2") || iName.equals("rakghoul1") || iName.equals("yomincarr1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kama1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kama1());

						} else if (iName.equals("sevrancetann2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sevrancetann2());

						} else if (iName.equals("rakghoul1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rakghoul1());

						} else if (iName.equals("yomincarr1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.yomincarr1());

						}
					}
				});
				return true;
			}
			if (iName.equals("huttspace19by") || iName.equals("eethkoth2") || iName.equals("rorifenn3") || iName.equals("vurk2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("huttspace19by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.huttspace19by());

						} else if (iName.equals("eethkoth2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.eethkoth2());

						} else if (iName.equals("rorifenn3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rorifenn3());

						} else if (iName.equals("vurk2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vurk2());

						}
					}
				});
				return true;
			}
			if (iName.equals("geonosisbattle") || iName.equals("tace2") || iName.equals("chantiqueyoung") || iName.equals("hondokarrmand")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("geonosisbattle")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.geonosisbattle());

						} else if (iName.equals("tace2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tace2());

						} else if (iName.equals("chantiqueyoung")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chantiqueyoung());

						} else if (iName.equals("hondokarrmand")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hondokarrmand());

						}
					}
				});
				return true;
			}
			if (iName.equals("galacticrepublic12000by") || iName.equals("dackralter1") || iName.equals("jowdrrl1") || iName.equals("csilla1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("galacticrepublic12000by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.galacticrepublic12000by());

						} else if (iName.equals("dackralter1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dackralter1());

						} else if (iName.equals("jowdrrl1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jowdrrl1());

						} else if (iName.equals("csilla1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.csilla1());

						}
					}
				});
				return true;
			}
			if (iName.equals("tahiriveila1") || iName.equals("malakkarath") || iName.equals("zeltros2") || iName.equals("chopper2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("tahiriveila1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tahiriveila1());

						} else if (iName.equals("malakkarath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.malakkarath());

						} else if (iName.equals("zeltros2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zeltros2());

						} else if (iName.equals("chopper2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chopper2());

						}
					}
				});
				return true;
			}
			if (iName.equals("bok1") || iName.equals("jekporkins1") || iName.equals("haazensith") || iName.equals("hondokarrimp")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("bok1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bok1());

						} else if (iName.equals("jekporkins1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jekporkins1());

						} else if (iName.equals("haazensith")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.haazensith());

						} else if (iName.equals("hondokarrimp")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hondokarrimp());

						}
					}
				});
				return true;
			}
			if (iName.equals("csiindustrial") || iName.equals("etainterceptor1") || iName.equals("chissascendance1") || iName.equals("coreship1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("csiindustrial")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.csiindustrial());

						} else if (iName.equals("etainterceptor1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.etainterceptor1());

						} else if (iName.equals("chissascendance1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chissascendance1());

						} else if (iName.equals("coreship1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.coreship1());

						}
					}
				});
				return true;
			}
			if (iName.equals("rexkamino") || iName.equals("mustafar2") || iName.equals("nos1") || iName.equals("pellaeonpeace")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("rexkamino")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rexkamino());

						} else if (iName.equals("mustafar2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mustafar2());

						} else if (iName.equals("nos1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nos1());

						} else if (iName.equals("pellaeonpeace")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.pellaeonpeace());

						}
					}
				});
				return true;
			}
			if (iName.equals("balmorra2") || iName.equals("repmilitary") || iName.equals("tanksismique1") || iName.equals("voss2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("balmorra2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.balmorra2());

						} else if (iName.equals("repmilitary")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.repmilitary());

						} else if (iName.equals("tanksismique1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tanksismique1());

						} else if (iName.equals("voss2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.voss2());

						}
					}
				});
				return true;
			}
			if (iName.equals("theson1") || iName.equals("devastator3") || iName.equals("bwing1") || iName.equals("palpatinereborn")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("theson1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.theson1());

						} else if (iName.equals("devastator3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.devastator3());

						} else if (iName.equals("bwing1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bwing1());

						} else if (iName.equals("palpatinereborn")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.palpatinereborn());

						}
					}
				});
				return true;
			}
			if (iName.equals("dofine1") || iName.equals("juggernaut2") || iName.equals("oom10") || iName.equals("asajjventressvsdooku")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("dofine1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dofine1());

						} else if (iName.equals("juggernaut2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.juggernaut2());

						} else if (iName.equals("oom10")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.oom10());

						} else if (iName.equals("asajjventressvsdooku")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.asajjventressvsdooku());

						}
					}
				});
				return true;
			}
			if (iName.equals("seatrooper1") || iName.equals("ezrainquisitor") || iName.equals("dexter2") || iName.equals("jariahsyn3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("seatrooper1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.seatrooper1());

						} else if (iName.equals("ezrainquisitor")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ezrainquisitor());

						} else if (iName.equals("dexter2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dexter2());

						} else if (iName.equals("jariahsyn3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jariahsyn3());

						}
					}
				});
				return true;
			}
			if (iName.equals("ginivex2") || iName.equals("clonereco1") || iName.equals("leiaholocron") || iName.equals("tasharyo1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ginivex2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ginivex2());

						} else if (iName.equals("clonereco1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.clonereco1());

						} else if (iName.equals("leiaholocron")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.leiaholocron());

						} else if (iName.equals("tasharyo1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tasharyo1());

						}
					}
				});
				return true;
			}
			if (iName.equals("alat2") || iName.equals("shaakti2") || iName.equals("caydeath") || iName.equals("miraluka2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("alat2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.alat2());

						} else if (iName.equals("shaakti2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shaakti2());

						} else if (iName.equals("caydeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.caydeath());

						} else if (iName.equals("miraluka2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.miraluka2());

						}
					}
				});
				return true;
			}
			if (iName.equals("blasterrifledc152") || iName.equals("mecdroid1") || iName.equals("massassi1") || iName.equals("logofyricfel")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("blasterrifledc152")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.blasterrifledc152());

						} else if (iName.equals("mecdroid1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mecdroid1());

						} else if (iName.equals("massassi1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.massassi1());

						} else if (iName.equals("logofyricfel")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logofyricfel());

						}
					}
				});
				return true;
			}
			if (iName.equals("ghostcrew5") || iName.equals("jaiusyorub1") || iName.equals("logonewsithwar") || iName.equals("naatreath1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ghostcrew5")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ghostcrew5());

						} else if (iName.equals("jaiusyorub1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jaiusyorub1());

						} else if (iName.equals("logonewsithwar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logonewsithwar());

						} else if (iName.equals("naatreath1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.naatreath1());

						}
					}
				});
				return true;
			}
			if (iName.equals("hyloviszblock") || iName.equals("thisspiasien1") || iName.equals("logocherithfel") || iName.equals("chewiedeath")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("hyloviszblock")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hyloviszblock());

						} else if (iName.equals("thisspiasien1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.thisspiasien1());

						} else if (iName.equals("logocherithfel")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logocherithfel());

						} else if (iName.equals("chewiedeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chewiedeath());

						}
					}
				});
				return true;
			}
			if (iName.equals("quarren2") || iName.equals("sithships") || iName.equals("anakin1") || iName.equals("darkmaul2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("quarren2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.quarren2());

						} else if (iName.equals("sithships")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sithships());

						} else if (iName.equals("anakin1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anakin1());

						} else if (iName.equals("darkmaul2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkmaul2());

						}
					}
				});
				return true;
			}
			if (iName.equals("logoajaifel") || iName.equals("kypdurron2") || iName.equals("logodarkzannah") || iName.equals("karnessmuur3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logoajaifel")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoajaifel());

						} else if (iName.equals("kypdurron2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kypdurron2());

						} else if (iName.equals("logodarkzannah")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarkzannah());

						} else if (iName.equals("karnessmuur3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.karnessmuur3());

						}
					}
				});
				return true;
			}
			if (iName.equals("repulsion2") || iName.equals("skakoan1") || iName.equals("golm1") || iName.equals("blastere111")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("repulsion2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.repulsion2());

						} else if (iName.equals("skakoan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.skakoan1());

						} else if (iName.equals("golm1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.golm1());

						} else if (iName.equals("blastere111")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.blastere111());

						}
					}
				});
				return true;
			}
			if (iName.equals("firstorder1") || iName.equals("bouclier1") || iName.equals("holocron2") || iName.equals("tbaa2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("firstorder1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.firstorder1());

						} else if (iName.equals("bouclier1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bouclier1());

						} else if (iName.equals("holocron2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.holocron2());

						} else if (iName.equals("tbaa2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tbaa2());

						}
					}
				});
				return true;
			}
			if (iName.equals("logorebelalliance") || iName.equals("nzoth1") || iName.equals("darkjadus1") || iName.equals("hutt2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logorebelalliance")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logorebelalliance());

						} else if (iName.equals("nzoth1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nzoth1());

						} else if (iName.equals("darkjadus1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkjadus1());

						} else if (iName.equals("hutt2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hutt2());

						}
					}
				});
				return true;
			}
			if (iName.equals("ralltiir2") || iName.equals("piett1") || iName.equals("siobibble2") || iName.equals("tieoppressor2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ralltiir2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ralltiir2());

						} else if (iName.equals("piett1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.piett1());

						} else if (iName.equals("siobibble2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.siobibble2());

						} else if (iName.equals("tieoppressor2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tieoppressor2());

						}
					}
				});
				return true;
			}
			if (iName.equals("lannik1") || iName.equals("jarjar3") || iName.equals("trackerspiderdroid2") || iName.equals("greatermaldrood4ay")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("lannik1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lannik1());

						} else if (iName.equals("jarjar3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jarjar3());

						} else if (iName.equals("trackerspiderdroid2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.trackerspiderdroid2());

						} else if (iName.equals("greatermaldrood4ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.greatermaldrood4ay());

						}
					}
				});
				return true;
			}
			if (iName.equals("tott2") || iName.equals("sharadhett1") || iName.equals("tauntaun1") || iName.equals("abeloth1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("tott2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tott2());

						} else if (iName.equals("sharadhett1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sharadhett1());

						} else if (iName.equals("tauntaun1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tauntaun1());

						} else if (iName.equals("abeloth1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.abeloth1());

						}
					}
				});
				return true;
			}
			if (iName.equals("wyyrlokbetrayal") || iName.equals("seddwia1") || iName.equals("serenno1") || iName.equals("reek2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("wyyrlokbetrayal")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.wyyrlokbetrayal());

						} else if (iName.equals("seddwia1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.seddwia1());

						} else if (iName.equals("serenno1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.serenno1());

						} else if (iName.equals("reek2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.reek2());

						}
					}
				});
				return true;
			}
			if (iName.equals("dookucapture") || iName.equals("dantooine1") || iName.equals("sdardent2") || iName.equals("rodian2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("dookucapture")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dookucapture());

						} else if (iName.equals("dantooine1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dantooine1());

						} else if (iName.equals("sdardent2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdardent2());

						} else if (iName.equals("rodian2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rodian2());

						}
					}
				});
				return true;
			}
			if (iName.equals("lothal1") || iName.equals("lukecade") || iName.equals("laser3") || iName.equals("contispex1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("lothal1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lothal1());

						} else if (iName.equals("lukecade")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lukecade());

						} else if (iName.equals("laser3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.laser3());

						} else if (iName.equals("contispex1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.contispex1());

						}
					}
				});
				return true;
			}
			if (iName.equals("xendor1") || iName.equals("hux2") || iName.equals("owenberu") || iName.equals("sateleshan1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("xendor1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.xendor1());

						} else if (iName.equals("hux2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hux2());

						} else if (iName.equals("owenberu")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.owenberu());

						} else if (iName.equals("sateleshan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sateleshan1());

						}
					}
				});
				return true;
			}
			if (iName.equals("fivebrother2") || iName.equals("shaekodadianoga") || iName.equals("ezrayoda") || iName.equals("daegenlok2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("fivebrother2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.fivebrother2());

						} else if (iName.equals("shaekodadianoga")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shaekodadianoga());

						} else if (iName.equals("ezrayoda")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ezrayoda());

						} else if (iName.equals("daegenlok2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.daegenlok2());

						}
					}
				});
				return true;
			}
			if (iName.equals("transportfo1") || iName.equals("jediart3") || iName.equals("geonosis1") || iName.equals("logodarkrevan")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("transportfo1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.transportfo1());

						} else if (iName.equals("jediart3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jediart3());

						} else if (iName.equals("geonosis1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.geonosis1());

						} else if (iName.equals("logodarkrevan")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarkrevan());

						}
					}
				});
				return true;
			}
			if (iName.equals("anakin11") || iName.equals("comlink2") || iName.equals("maladibomb") || iName.equals("daimanarrive")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("anakin11")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anakin11());

						} else if (iName.equals("comlink2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.comlink2());

						} else if (iName.equals("maladibomb")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.maladibomb());

						} else if (iName.equals("daimanarrive")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.daimanarrive());

						}
					}
				});
				return true;
			}
			if (iName.equals("handempire11ay") || iName.equals("logosimus") || iName.equals("azlyn2") || iName.equals("tukata1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("handempire11ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.handempire11ay());

						} else if (iName.equals("logosimus")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logosimus());

						} else if (iName.equals("azlyn2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.azlyn2());

						} else if (iName.equals("tukata1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tukata1());

						}
					}
				});
				return true;
			}
			if (iName.equals("dug1") || iName.equals("nalhutta2") || iName.equals("aurraboba") || iName.equals("calonord2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("dug1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dug1());

						} else if (iName.equals("nalhutta2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nalhutta2());

						} else if (iName.equals("aurraboba")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.aurraboba());

						} else if (iName.equals("calonord2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.calonord2());

						}
					}
				});
				return true;
			}
			if (iName.equals("riyochuchi2") || iName.equals("tiespecfo2") || iName.equals("forndodonna2") || iName.equals("maravong")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("riyochuchi2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.riyochuchi2());

						} else if (iName.equals("tiespecfo2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tiespecfo2());

						} else if (iName.equals("forndodonna2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.forndodonna2());

						} else if (iName.equals("maravong")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.maravong());

						}
					}
				});
				return true;
			}
			if (iName.equals("finntakodana") || iName.equals("revanbastila") || iName.equals("bt12") || iName.equals("garmbeliblis1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("finntakodana")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.finntakodana());

						} else if (iName.equals("revanbastila")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.revanbastila());

						} else if (iName.equals("bt12")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bt12());

						} else if (iName.equals("garmbeliblis1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.garmbeliblis1());

						}
					}
				});
				return true;
			}
			if (iName.equals("tstt1") || iName.equals("korunnai1") || iName.equals("kaadu2") || iName.equals("dookuyoung")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("tstt1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tstt1());

						} else if (iName.equals("korunnai1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.korunnai1());

						} else if (iName.equals("kaadu2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kaadu2());

						} else if (iName.equals("dookuyoung")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dookuyoung());

						}
					}
				});
				return true;
			}
			if (iName.equals("logoasajjventress") || iName.equals("ezraahsoka") || iName.equals("exogorth1") || iName.equals("kirkanos1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logoasajjventress")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoasajjventress());

						} else if (iName.equals("ezraahsoka")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ezraahsoka());

						} else if (iName.equals("exogorth1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.exogorth1());

						} else if (iName.equals("kirkanos1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kirkanos1());

						}
					}
				});
				return true;
			}
			if (iName.equals("cikatro1") || iName.equals("knightpeople") || iName.equals("logocrimsonempire") || iName.equals("leia4")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("cikatro1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cikatro1());

						} else if (iName.equals("knightpeople")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.knightpeople());

						} else if (iName.equals("logocrimsonempire")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logocrimsonempire());

						} else if (iName.equals("leia4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.leia4());

						}
					}
				});
				return true;
			}
			if (iName.equals("dragonkrayt1") || iName.equals("sdimperious2") || iName.equals("logocorlametonae") || iName.equals("yodamission")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("dragonkrayt1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dragonkrayt1());

						} else if (iName.equals("sdimperious2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdimperious2());

						} else if (iName.equals("logocorlametonae")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logocorlametonae());

						} else if (iName.equals("yodamission")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.yodamission());

						}
					}
				});
				return true;
			}
			if (iName.equals("calixtemorrigan") || iName.equals("naboo2") || iName.equals("garstazi2") || iName.equals("csisoldier")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("calixtemorrigan")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.calixtemorrigan());

						} else if (iName.equals("naboo2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.naboo2());

						} else if (iName.equals("garstazi2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.garstazi2());

						} else if (iName.equals("csisoldier")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.csisoldier());

						}
					}
				});
				return true;
			}
			if (iName.equals("bossnass2") || iName.equals("desann1") || iName.equals("rorifenn1") || iName.equals("rebi1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("bossnass2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bossnass2());

						} else if (iName.equals("desann1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.desann1());

						} else if (iName.equals("rorifenn1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rorifenn1());

						} else if (iName.equals("rebi1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rebi1());

						}
					}
				});
				return true;
			}
			if (iName.equals("asajjrota") || iName.equals("asajjventressambush") || iName.equals("alderaan2") || iName.equals("bargetitan1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("asajjrota")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.asajjrota());

						} else if (iName.equals("asajjventressambush")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.asajjventressambush());

						} else if (iName.equals("alderaan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.alderaan2());

						} else if (iName.equals("bargetitan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bargetitan1());

						}
					}
				});
				return true;
			}
			if (iName.equals("typho2") || iName.equals("ysalamiri1") || iName.equals("ssdexecutor1") || iName.equals("chak1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("typho2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.typho2());

						} else if (iName.equals("ysalamiri1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ysalamiri1());

						} else if (iName.equals("ssdexecutor1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ssdexecutor1());

						} else if (iName.equals("chak1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chak1());

						}
					}
				});
				return true;
			}
			if (iName.equals("swarmwar2") || iName.equals("c3pogeonosis") || iName.equals("ssdvengeance1") || iName.equals("anzat1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("swarmwar2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.swarmwar2());

						} else if (iName.equals("c3pogeonosis")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.c3pogeonosis());

						} else if (iName.equals("ssdvengeance1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ssdvengeance1());

						} else if (iName.equals("anzat1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anzat1());

						}
					}
				});
				return true;
			}
			if (iName.equals("plokoondeath") || iName.equals("saeseetiin1") || iName.equals("wedge1") || iName.equals("vwing2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("plokoondeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.plokoondeath());

						} else if (iName.equals("saeseetiin1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.saeseetiin1());

						} else if (iName.equals("wedge1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.wedge1());

						} else if (iName.equals("vwing2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vwing2());

						}
					}
				});
				return true;
			}
			if (iName.equals("canoniererep1") || iName.equals("vulisen2") || iName.equals("csiships") || iName.equals("vadorlothal")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("canoniererep1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.canoniererep1());

						} else if (iName.equals("vulisen2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vulisen2());

						} else if (iName.equals("csiships")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.csiships());

						} else if (iName.equals("vadorlothal")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vadorlothal());

						}
					}
				});
				return true;
			}
			if (iName.equals("logofreedonnadd") || iName.equals("logomohrganfel") || iName.equals("thexan2") || iName.equals("cd22")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logofreedonnadd")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logofreedonnadd());

						} else if (iName.equals("logomohrganfel")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logomohrganfel());

						} else if (iName.equals("thexan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.thexan2());

						} else if (iName.equals("cd22")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cd22());

						}
					}
				});
				return true;
			}
			if (iName.equals("darkempire11ay") || iName.equals("monmothma1") || iName.equals("eriaduauthority9ay") || iName.equals("antaresfel")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("darkempire11ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkempire11ay());

						} else if (iName.equals("monmothma1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.monmothma1());

						} else if (iName.equals("eriaduauthority9ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.eriaduauthority9ay());

						} else if (iName.equals("antaresfel")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.antaresfel());

						}
					}
				});
				return true;
			}
			if (iName.equals("jariahsyn1") || iName.equals("bith1") || iName.equals("dengarchewie") || iName.equals("stap1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("jariahsyn1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jariahsyn1());

						} else if (iName.equals("bith1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bith1());

						} else if (iName.equals("dengarchewie")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dengarchewie());

						} else if (iName.equals("stap1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.stap1());

						}
					}
				});
				return true;
			}
			if (iName.equals("upsilon1") || iName.equals("bakura2") || iName.equals("logoroanfel") || iName.equals("chadrafan2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("upsilon1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.upsilon1());

						} else if (iName.equals("bakura2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bakura2());

						} else if (iName.equals("logoroanfel")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoroanfel());

						} else if (iName.equals("chadrafan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chadrafan2());

						}
					}
				});
				return true;
			}
			if (iName.equals("whormloathsom2") || iName.equals("aurasing2") || iName.equals("praesitlyn1") || iName.equals("sintasvel1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("whormloathsom2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.whormloathsom2());

						} else if (iName.equals("aurasing2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.aurasing2());

						} else if (iName.equals("praesitlyn1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.praesitlyn1());

						} else if (iName.equals("sintasvel1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sintasvel1());

						}
					}
				});
				return true;
			}
			if (iName.equals("jabiim1") || iName.equals("mezgraf1") || iName.equals("bastion2") || iName.equals("r2d2naboo2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("jabiim1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jabiim1());

						} else if (iName.equals("mezgraf1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mezgraf1());

						} else if (iName.equals("bastion2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bastion2());

						} else if (iName.equals("r2d2naboo2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2d2naboo2());

						}
					}
				});
				return true;
			}
			if (iName.equals("mandlebref1") || iName.equals("tiefo2") || iName.equals("trtt1") || iName.equals("logoaleemaketo")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("mandlebref1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mandlebref1());

						} else if (iName.equals("tiefo2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tiefo2());

						} else if (iName.equals("trtt1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.trtt1());

						} else if (iName.equals("logoaleemaketo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoaleemaketo());

						}
					}
				});
				return true;
			}
			if (iName.equals("sarlacc1") || iName.equals("schurkheren1") || iName.equals("eopie2") || iName.equals("reyandkylo")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("sarlacc1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sarlacc1());

						} else if (iName.equals("schurkheren1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.schurkheren1());

						} else if (iName.equals("eopie2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.eopie2());

						} else if (iName.equals("reyandkylo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.reyandkylo());

						}
					}
				});
				return true;
			}
			if (iName.equals("separatistspacesouth22by") || iName.equals("ahsoka10") || iName.equals("dagobah1") || iName.equals("separatistspacenorth22by")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("separatistspacesouth22by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.separatistspacesouth22by());

						} else if (iName.equals("ahsoka10")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ahsoka10());

						} else if (iName.equals("dagobah1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dagobah1());

						} else if (iName.equals("separatistspacenorth22by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.separatistspacenorth22by());

						}
					}
				});
				return true;
			}
			if (iName.equals("logokrath") || iName.equals("kaleesh2") || iName.equals("tiefighter1") || iName.equals("tenelkaqueen")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logokrath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logokrath());

						} else if (iName.equals("kaleesh2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kaleesh2());

						} else if (iName.equals("tiefighter1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tiefighter1());

						} else if (iName.equals("tenelkaqueen")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tenelkaqueen());

						}
					}
				});
				return true;
			}
			if (iName.equals("hyperdrivering1") || iName.equals("clonefighter1") || iName.equals("kassius2") || iName.equals("nutegunray1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("hyperdrivering1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hyperdrivering1());

						} else if (iName.equals("clonefighter1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.clonefighter1());

						} else if (iName.equals("kassius2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kassius2());

						} else if (iName.equals("nutegunray1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nutegunray1());

						}
					}
				});
				return true;
			}
			if (iName.equals("logojaggedfel") || iName.equals("ghanachkt1") || iName.equals("zevsenesca1") || iName.equals("rexscipio")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logojaggedfel")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logojaggedfel());

						} else if (iName.equals("ghanachkt1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ghanachkt1());

						} else if (iName.equals("zevsenesca1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zevsenesca1());

						} else if (iName.equals("rexscipio")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rexscipio());

						}
					}
				});
				return true;
			}
			if (iName.equals("alsakanconflict1") || iName.equals("seknos1") || iName.equals("scourge3") || iName.equals("hanchewie")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("alsakanconflict1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.alsakanconflict1());

						} else if (iName.equals("seknos1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.seknos1());

						} else if (iName.equals("scourge3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.scourge3());

						} else if (iName.equals("hanchewie")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hanchewie());

						}
					}
				});
				return true;
			}
			if (iName.equals("logotenenieldjo") || iName.equals("sdimperious1") || iName.equals("ahsoka5") || iName.equals("hyperespacewar2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logotenenieldjo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logotenenieldjo());

						} else if (iName.equals("sdimperious1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdimperious1());

						} else if (iName.equals("ahsoka5")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ahsoka5());

						} else if (iName.equals("hyperespacewar2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hyperespacewar2());

						}
					}
				});
				return true;
			}
			if (iName.equals("devaronian1") || iName.equals("chandrila2") || iName.equals("r2d2sun") || iName.equals("logosavageopress")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("devaronian1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.devaronian1());

						} else if (iName.equals("chandrila2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chandrila2());

						} else if (iName.equals("r2d2sun")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2d2sun());

						} else if (iName.equals("logosavageopress")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logosavageopress());

						}
					}
				});
				return true;
			}
			if (iName.equals("shaak2") || iName.equals("moffcouncil2") || iName.equals("lamasu1") || iName.equals("zsinjempire4ay")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("shaak2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shaak2());

						} else if (iName.equals("moffcouncil2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.moffcouncil2());

						} else if (iName.equals("lamasu1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lamasu1());

						} else if (iName.equals("zsinjempire4ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zsinjempire4ay());

						}
					}
				});
				return true;
			}
			if (iName.equals("ziost2") || iName.equals("asajjahsoka") || iName.equals("falleen1") || iName.equals("bensolo1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ziost2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ziost2());

						} else if (iName.equals("asajjahsoka")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.asajjahsoka());

						} else if (iName.equals("falleen1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.falleen1());

						} else if (iName.equals("bensolo1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bensolo1());

						}
					}
				});
				return true;
			}
			if (iName.equals("materiels") || iName.equals("obiwandathomir1") || iName.equals("czerka1") || iName.equals("bossk1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("materiels")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.materiels());

						} else if (iName.equals("obiwandathomir1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.obiwandathomir1());

						} else if (iName.equals("czerka1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.czerka1());

						} else if (iName.equals("bossk1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bossk1());

						}
					}
				});
				return true;
			}
			if (iName.equals("logogithany") || iName.equals("dragonkrayt2") || iName.equals("quinlanvostholme") || iName.equals("ssdexecutor2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logogithany")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logogithany());

						} else if (iName.equals("dragonkrayt2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dragonkrayt2());

						} else if (iName.equals("quinlanvostholme")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.quinlanvostholme());

						} else if (iName.equals("ssdexecutor2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ssdexecutor2());

						}
					}
				});
				return true;
			}
			if (iName.equals("geonosian1") || iName.equals("sdharrower2") || iName.equals("snowtrooper1") || iName.equals("bith2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("geonosian1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.geonosian1());

						} else if (iName.equals("sdharrower2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdharrower2());

						} else if (iName.equals("snowtrooper1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.snowtrooper1());

						} else if (iName.equals("bith2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bith2());

						}
					}
				});
				return true;
			}
			if (iName.equals("rahmkota2") || iName.equals("varactyl2") || iName.equals("vodovsexarkun") || iName.equals("ryloth2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("rahmkota2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rahmkota2());

						} else if (iName.equals("varactyl2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.varactyl2());

						} else if (iName.equals("vodovsexarkun")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vodovsexarkun());

						} else if (iName.equals("ryloth2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ryloth2());

						}
					}
				});
				return true;
			}
			if (iName.equals("durge1") || iName.equals("fury2") || iName.equals("tavus2") || iName.equals("galacticempirenorth4ay")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("durge1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.durge1());

						} else if (iName.equals("fury2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.fury2());

						} else if (iName.equals("tavus2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tavus2());

						} else if (iName.equals("galacticempirenorth4ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.galacticempirenorth4ay());

						}
					}
				});
				return true;
			}

		return false;
	}
}