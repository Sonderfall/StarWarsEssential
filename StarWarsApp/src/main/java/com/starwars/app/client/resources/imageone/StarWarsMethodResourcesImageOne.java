package com.starwars.app.client.resources.imageone;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.resources.client.ImageResource;
import com.starwars.app.client.mct.ASyncCall;
import com.starwars.app.client.resources.StarWarsImageResources;

public class StarWarsMethodResourcesImageOne {
	
	public static boolean callMethodImage(final ASyncCall<ImageResource> iASyncCall, final String iName) {
			if (iName.equals("shadotrain") || iName.equals("padme1") || iName.equals("rexold2") || iName.equals("nuna1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("shadotrain")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shadotrain());

						} else if (iName.equals("padme1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.padme1());

						} else if (iName.equals("rexold2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rexold2());

						} else if (iName.equals("nuna1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nuna1());

						}
					}
				});
				return true;
			}
			if (iName.equals("kananjarrus3") || iName.equals("jedaiipeople") || iName.equals("logotiaorgana") || iName.equals("sabinewren1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kananjarrus3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kananjarrus3());

						} else if (iName.equals("jedaiipeople")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jedaiipeople());

						} else if (iName.equals("logotiaorgana")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logotiaorgana());

						} else if (iName.equals("sabinewren1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sabinewren1());

						}
					}
				});
				return true;
			}
			if (iName.equals("tieinterceptor1") || iName.equals("droideka1") || iName.equals("colo1") || iName.equals("galacticempire4ay")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("tieinterceptor1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tieinterceptor1());

						} else if (iName.equals("droideka1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.droideka1());

						} else if (iName.equals("colo1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.colo1());

						} else if (iName.equals("galacticempire4ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.galacticempire4ay());

						}
					}
				});
				return true;
			}
			if (iName.equals("clonescout1") || iName.equals("nelvaan1") || iName.equals("huttspace17000by") || iName.equals("gormanvandraykyoung")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("clonescout1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.clonescout1());

						} else if (iName.equals("nelvaan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nelvaan1());

						} else if (iName.equals("huttspace17000by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.huttspace17000by());

						} else if (iName.equals("gormanvandraykyoung")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gormanvandraykyoung());

						}
					}
				});
				return true;
			}
			if (iName.equals("zeb4") || iName.equals("azlyn3") || iName.equals("ann") || iName.equals("appo2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("zeb4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zeb4());

						} else if (iName.equals("azlyn3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.azlyn3());

						} else if (iName.equals("ann")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ann());

						} else if (iName.equals("appo2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.appo2());

						}
					}
				});
				return true;
			}
			if (iName.equals("valorum3") || iName.equals("pyke2") || iName.equals("tiecimeterre1") || iName.equals("palpatineemperor")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("valorum3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.valorum3());

						} else if (iName.equals("pyke2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.pyke2());

						} else if (iName.equals("tiecimeterre1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tiecimeterre1());

						} else if (iName.equals("palpatineemperor")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.palpatineemperor());

						}
					}
				});
				return true;
			}
			if (iName.equals("calixtekuvrat") || iName.equals("logodarksidious") || iName.equals("tula2") || iName.equals("secondgreatgalacticwar1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("calixtekuvrat")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.calixtekuvrat());

						} else if (iName.equals("logodarksidious")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarksidious());

						} else if (iName.equals("tula2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tula2());

						} else if (iName.equals("secondgreatgalacticwar1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.secondgreatgalacticwar1());

						}
					}
				});
				return true;
			}
			if (iName.equals("meekerdinmaa1") || iName.equals("hondo2") || iName.equals("sdsubjugator2") || iName.equals("hapesconsortium2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("meekerdinmaa1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.meekerdinmaa1());

						} else if (iName.equals("hondo2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hondo2());

						} else if (iName.equals("sdsubjugator2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdsubjugator2());

						} else if (iName.equals("hapesconsortium2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hapesconsortium2());

						}
					}
				});
				return true;
			}
			if (iName.equals("cadeazlyn") || iName.equals("kraytvswyyrlok") || iName.equals("clawdite2") || iName.equals("tholme1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("cadeazlyn")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cadeazlyn());

						} else if (iName.equals("kraytvswyyrlok")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kraytvswyyrlok());

						} else if (iName.equals("clawdite2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.clawdite2());

						} else if (iName.equals("tholme1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tholme1());

						}
					}
				});
				return true;
			}
			if (iName.equals("niennunb2") || iName.equals("chagrian1") || iName.equals("hancyrkon") || iName.equals("passelargente2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("niennunb2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.niennunb2());

						} else if (iName.equals("chagrian1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chagrian1());

						} else if (iName.equals("hancyrkon")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hancyrkon());

						} else if (iName.equals("passelargente2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.passelargente2());

						}
					}
				});
				return true;
			}
			if (iName.equals("jainajagged") || iName.equals("deathstar22") || iName.equals("fantome1") || iName.equals("secondimperialcivilwarend")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("jainajagged")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jainajagged());

						} else if (iName.equals("deathstar22")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.deathstar22());

						} else if (iName.equals("fantome1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.fantome1());

						} else if (iName.equals("secondimperialcivilwarend")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.secondimperialcivilwarend());

						}
					}
				});
				return true;
			}
			if (iName.equals("naboo1") || iName.equals("odanurr2") || iName.equals("cadbane1") || iName.equals("sdinterdictor2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("naboo1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.naboo1());

						} else if (iName.equals("odanurr2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.odanurr2());

						} else if (iName.equals("cadbane1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cadbane1());

						} else if (iName.equals("sdinterdictor2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdinterdictor2());

						}
					}
				});
				return true;
			}
			if (iName.equals("malastare2") || iName.equals("ishinilraz1") || iName.equals("ambria2") || iName.equals("kruhljassar")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("malastare2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.malastare2());

						} else if (iName.equals("ishinilraz1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ishinilraz1());

						} else if (iName.equals("ambria2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ambria2());

						} else if (iName.equals("kruhljassar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kruhljassar());

						}
					}
				});
				return true;
			}
			if (iName.equals("raanatey3") || iName.equals("petitbivoli") || iName.equals("galacticrepublic3650by") || iName.equals("orbalisk1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("raanatey3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.raanatey3());

						} else if (iName.equals("petitbivoli")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.petitbivoli());

						} else if (iName.equals("galacticrepublic3650by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.galacticrepublic3650by());

						} else if (iName.equals("orbalisk1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.orbalisk1());

						}
					}
				});
				return true;
			}
			if (iName.equals("lowbacca1") || iName.equals("carnorjaxsith") || iName.equals("lumiya2") || iName.equals("wheelbike2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("lowbacca1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lowbacca1());

						} else if (iName.equals("carnorjaxsith")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.carnorjaxsith());

						} else if (iName.equals("lumiya2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lumiya2());

						} else if (iName.equals("wheelbike2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.wheelbike2());

						}
					}
				});
				return true;
			}
			if (iName.equals("sateleyoung") || iName.equals("neirin1") || iName.equals("xwing2") || iName.equals("onaantilles1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("sateleyoung")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sateleyoung());

						} else if (iName.equals("neirin1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.neirin1());

						} else if (iName.equals("xwing2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.xwing2());

						} else if (iName.equals("onaantilles1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.onaantilles1());

						}
					}
				});
				return true;
			}
			if (iName.equals("logo") || iName.equals("logooldsithempirerebuild") || iName.equals("jarjarbinks1") || iName.equals("logodarkkrayt")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logo());

						} else if (iName.equals("logooldsithempirerebuild")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logooldsithempirerebuild());

						} else if (iName.equals("jarjarbinks1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jarjarbinks1());

						} else if (iName.equals("logodarkkrayt")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarkkrayt());

						}
					}
				});
				return true;
			}
			if (iName.equals("tenebkel1") || iName.equals("sdbellator1") || iName.equals("revanempire3957by") || iName.equals("r2d2cade")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("tenebkel1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tenebkel1());

						} else if (iName.equals("sdbellator1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdbellator1());

						} else if (iName.equals("revanempire3957by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.revanempire3957by());

						} else if (iName.equals("r2d2cade")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2d2cade());

						}
					}
				});
				return true;
			}
			if (iName.equals("time1") || iName.equals("revansith3") || iName.equals("ghostcrew3") || iName.equals("croiseurrep1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("time1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.time1());

						} else if (iName.equals("revansith3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.revansith3());

						} else if (iName.equals("ghostcrew3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ghostcrew3());

						} else if (iName.equals("croiseurrep1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.croiseurrep1());

						}
					}
				});
				return true;
			}
			if (iName.equals("sintyoru1") || iName.equals("poedameronbattle") || iName.equals("r2d2droides") || iName.equals("renknight1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("sintyoru1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sintyoru1());

						} else if (iName.equals("poedameronbattle")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.poedameronbattle());

						} else if (iName.equals("r2d2droides")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2d2droides());

						} else if (iName.equals("renknight1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.renknight1());

						}
					}
				});
				return true;
			}
			if (iName.equals("c3pohoth") || iName.equals("raynarthul2") || iName.equals("cassustaris") || iName.equals("lobot1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("c3pohoth")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.c3pohoth());

						} else if (iName.equals("raynarthul2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.raynarthul2());

						} else if (iName.equals("cassustaris")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cassustaris());

						} else if (iName.equals("lobot1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lobot1());

						}
					}
				});
				return true;
			}
			if (iName.equals("kiadimundi3") || iName.equals("rebelships") || iName.equals("vadorjabba") || iName.equals("force3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kiadimundi3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kiadimundi3());

						} else if (iName.equals("rebelships")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rebelships());

						} else if (iName.equals("vadorjabba")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vadorjabba());

						} else if (iName.equals("force3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.force3());

						}
					}
				});
				return true;
			}
			if (iName.equals("aaylasecura1") || iName.equals("zym1") || iName.equals("demagol1") || iName.equals("rexblue")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("aaylasecura1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.aaylasecura1());

						} else if (iName.equals("zym1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zym1());

						} else if (iName.equals("demagol1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.demagol1());

						} else if (iName.equals("rexblue")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rexblue());

						}
					}
				});
				return true;
			}
			if (iName.equals("roshpeninbegin") || iName.equals("quadjumper1") || iName.equals("vadorleia") || iName.equals("hutt1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("roshpeninbegin")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.roshpeninbegin());

						} else if (iName.equals("quadjumper1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.quadjumper1());

						} else if (iName.equals("vadorleia")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vadorleia());

						} else if (iName.equals("hutt1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hutt1());

						}
					}
				});
				return true;
			}
			if (iName.equals("nikto2") || iName.equals("logoexarkun") || iName.equals("ahnahjariah") || iName.equals("quigondestroyer")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("nikto2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nikto2());

						} else if (iName.equals("logoexarkun")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoexarkun());

						} else if (iName.equals("ahnahjariah")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ahnahjariah());

						} else if (iName.equals("quigondestroyer")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.quigondestroyer());

						}
					}
				});
				return true;
			}
			if (iName.equals("starkillerreturn") || iName.equals("soresu") || iName.equals("kaleesh1") || iName.equals("logoinfinityempire")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("starkillerreturn")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.starkillerreturn());

						} else if (iName.equals("soresu")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.soresu());

						} else if (iName.equals("kaleesh1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kaleesh1());

						} else if (iName.equals("logoinfinityempire")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoinfinityempire());

						}
					}
				});
				return true;
			}
			if (iName.equals("baccara1") || iName.equals("holoprojection") || iName.equals("shadow") || iName.equals("scourge2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("baccara1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.baccara1());

						} else if (iName.equals("holoprojection")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.holoprojection());

						} else if (iName.equals("shadow")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shadow());

						} else if (iName.equals("scourge2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.scourge2());

						}
					}
				});
				return true;
			}
			if (iName.equals("oom92") || iName.equals("fury1") || iName.equals("sanhill1") || iName.equals("thon2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("oom92")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.oom92());

						} else if (iName.equals("fury1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.fury1());

						} else if (iName.equals("sanhill1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sanhill1());

						} else if (iName.equals("thon2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.thon2());

						}
					}
				});
				return true;
			}
			if (iName.equals("lukekillik") || iName.equals("zabrak1") || iName.equals("felempire137ay") || iName.equals("cimeterre2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("lukekillik")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lukekillik());

						} else if (iName.equals("zabrak1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zabrak1());

						} else if (iName.equals("felempire137ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.felempire137ay());

						} else if (iName.equals("cimeterre2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cimeterre2());

						}
					}
				});
				return true;
			}
			if (iName.equals("separatistcouncil") || iName.equals("moffcouncil3") || iName.equals("hyperespacewar3") || iName.equals("grievous1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("separatistcouncil")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.separatistcouncil());

						} else if (iName.equals("moffcouncil3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.moffcouncil3());

						} else if (iName.equals("hyperespacewar3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hyperespacewar3());

						} else if (iName.equals("grievous1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.grievous1());

						}
					}
				});
				return true;
			}
			if (iName.equals("chandrila1") || iName.equals("shaak1") || iName.equals("tlbtt2") || iName.equals("sdimperialmk21")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("chandrila1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chandrila1());

						} else if (iName.equals("shaak1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shaak1());

						} else if (iName.equals("tlbtt2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tlbtt2());

						} else if (iName.equals("sdimperialmk21")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdimperialmk21());

						}
					}
				});
				return true;
			}
			if (iName.equals("durge2") || iName.equals("kuvrat1") || iName.equals("tavus3") || iName.equals("elan1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("durge2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.durge2());

						} else if (iName.equals("kuvrat1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kuvrat1());

						} else if (iName.equals("tavus3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tavus3());

						} else if (iName.equals("elan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.elan1());

						}
					}
				});
				return true;
			}
			if (iName.equals("personnages") || iName.equals("mandpeople") || iName.equals("kryndadeath") || iName.equals("morlishveed1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("personnages")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.personnages());

						} else if (iName.equals("mandpeople")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mandpeople());

						} else if (iName.equals("kryndadeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kryndadeath());

						} else if (iName.equals("morlishveed1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.morlishveed1());

						}
					}
				});
				return true;
			}
			if (iName.equals("han2") || iName.equals("illum1") || iName.equals("thedaughter2") || iName.equals("dorjanderkace1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("han2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.han2());

						} else if (iName.equals("illum1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.illum1());

						} else if (iName.equals("thedaughter2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.thedaughter2());

						} else if (iName.equals("dorjanderkace1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dorjanderkace1());

						}
					}
				});
				return true;
			}
			if (iName.equals("jedicovenant1") || iName.equals("ahsoka6") || iName.equals("airspeederxj61") || iName.equals("secondimperialcivilwar2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("jedicovenant1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jedicovenant1());

						} else if (iName.equals("ahsoka6")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ahsoka6());

						} else if (iName.equals("airspeederxj61")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.airspeederxj61());

						} else if (iName.equals("secondimperialcivilwar2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.secondimperialcivilwar2());

						}
					}
				});
				return true;
			}
			if (iName.equals("mylesfrint1") || iName.equals("kallus1") || iName.equals("geonosian2") || iName.equals("trett2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("mylesfrint1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mylesfrint1());

						} else if (iName.equals("kallus1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kallus1());

						} else if (iName.equals("geonosian2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.geonosian2());

						} else if (iName.equals("trett2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.trett2());

						}
					}
				});
				return true;
			}
			if (iName.equals("r7d4") || iName.equals("sabinefire") || iName.equals("jarjar2") || iName.equals("tahirivong")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("r7d4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r7d4());

						} else if (iName.equals("sabinefire")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sabinefire());

						} else if (iName.equals("jarjar2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jarjar2());

						} else if (iName.equals("tahirivong")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tahirivong());

						}
					}
				});
				return true;
			}
			if (iName.equals("odion2") || iName.equals("huttspace12000by") || iName.equals("eethkothgrievous") || iName.equals("daala1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("odion2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.odion2());

						} else if (iName.equals("huttspace12000by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.huttspace12000by());

						} else if (iName.equals("eethkothgrievous")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.eethkothgrievous());

						} else if (iName.equals("daala1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.daala1());

						}
					}
				});
				return true;
			}
			if (iName.equals("kashyyyk2") || iName.equals("vanqor2") || iName.equals("nabooyacht2") || iName.equals("rahmkota1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kashyyyk2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kashyyyk2());

						} else if (iName.equals("vanqor2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vanqor2());

						} else if (iName.equals("nabooyacht2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nabooyacht2());

						} else if (iName.equals("rahmkota1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rahmkota1());

						}
					}
				});
				return true;
			}
			if (iName.equals("drall1") || iName.equals("jedialtisien") || iName.equals("mynockship2") || iName.equals("navigation")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("drall1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.drall1());

						} else if (iName.equals("jedialtisien")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jedialtisien());

						} else if (iName.equals("mynockship2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mynockship2());

						} else if (iName.equals("navigation")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.navigation());

						}
					}
				});
				return true;
			}
			if (iName.equals("janusgreejatus1") || iName.equals("elkevetter1") || iName.equals("tython2") || iName.equals("indepships")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("janusgreejatus1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.janusgreejatus1());

						} else if (iName.equals("elkevetter1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.elkevetter1());

						} else if (iName.equals("tython2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tython2());

						} else if (iName.equals("indepships")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.indepships());

						}
					}
				});
				return true;
			}
			if (iName.equals("logowyyrlok") || iName.equals("oodbnar2") || iName.equals("quinlanvos1") || iName.equals("macewindu1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logowyyrlok")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logowyyrlok());

						} else if (iName.equals("oodbnar2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.oodbnar2());

						} else if (iName.equals("quinlanvos1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.quinlanvos1());

						} else if (iName.equals("macewindu1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.macewindu1());

						}
					}
				});
				return true;
			}
			if (iName.equals("slave12") || iName.equals("allianceterritoriessouth6ay") || iName.equals("roroncorobb1") || iName.equals("pauan1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("slave12")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.slave12());

						} else if (iName.equals("allianceterritoriessouth6ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.allianceterritoriessouth6ay());

						} else if (iName.equals("roroncorobb1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.roroncorobb1());

						} else if (iName.equals("pauan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.pauan1());

						}
					}
				});
				return true;
			}
			if (iName.equals("zeltros1") || iName.equals("droiddemo2") || iName.equals("yodazillo") || iName.equals("starkillerstation2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("zeltros1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zeltros1());

						} else if (iName.equals("droiddemo2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.droiddemo2());

						} else if (iName.equals("yodazillo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.yodazillo());

						} else if (iName.equals("starkillerstation2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.starkillerstation2());

						}
					}
				});
				return true;
			}
			if (iName.equals("junsatosd") || iName.equals("tieadvanced1") || iName.equals("marasiahtorture") || iName.equals("sdimperial2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("junsatosd")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.junsatosd());

						} else if (iName.equals("tieadvanced1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tieadvanced1());

						} else if (iName.equals("marasiahtorture")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.marasiahtorture());

						} else if (iName.equals("sdimperial2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdimperial2());

						}
					}
				});
				return true;
			}
			if (iName.equals("blasterdh171") || iName.equals("korriban2") || iName.equals("sithfleet") || iName.equals("mirax2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("blasterdh171")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.blasterdh171());

						} else if (iName.equals("korriban2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.korriban2());

						} else if (iName.equals("sithfleet")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sithfleet());

						} else if (iName.equals("mirax2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mirax2());

						}
					}
				});
				return true;
			}
			if (iName.equals("creatures") || iName.equals("ansion1") || iName.equals("codyrishi") || iName.equals("terex1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("creatures")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.creatures());

						} else if (iName.equals("ansion1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ansion1());

						} else if (iName.equals("codyrishi")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.codyrishi());

						} else if (iName.equals("terex1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.terex1());

						}
					}
				});
				return true;
			}
			if (iName.equals("korrsella1") || iName.equals("mandalorianwar2") || iName.equals("logovitiate") || iName.equals("thefather2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("korrsella1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.korrsella1());

						} else if (iName.equals("mandalorianwar2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mandalorianwar2());

						} else if (iName.equals("logovitiate")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logovitiate());

						} else if (iName.equals("thefather2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.thefather2());

						}
					}
				});
				return true;
			}
			if (iName.equals("blasterdc15s1") || iName.equals("poedameron2") || iName.equals("asajjventressvsanakin") || iName.equals("clonedemineur1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("blasterdc15s1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.blasterdc15s1());

						} else if (iName.equals("poedameron2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.poedameron2());

						} else if (iName.equals("asajjventressvsanakin")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.asajjventressvsanakin());

						} else if (iName.equals("clonedemineur1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.clonedemineur1());

						}
					}
				});
				return true;
			}
			if (iName.equals("tenebkel3") || iName.equals("jakku2") || iName.equals("daultaydofine1") || iName.equals("palpatineorder66")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("tenebkel3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tenebkel3());

						} else if (iName.equals("jakku2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jakku2());

						} else if (iName.equals("daultaydofine1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.daultaydofine1());

						} else if (iName.equals("palpatineorder66")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.palpatineorder66());

						}
					}
				});
				return true;
			}
			if (iName.equals("ghostcrew1") || iName.equals("eweb1") || iName.equals("acklay2") || iName.equals("cadekol")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ghostcrew1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ghostcrew1());

						} else if (iName.equals("eweb1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.eweb1());

						} else if (iName.equals("acklay2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.acklay2());

						} else if (iName.equals("cadekol")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cadekol());

						}
					}
				});
				return true;
			}
			if (iName.equals("logogreatsithwar") || iName.equals("ezra4") || iName.equals("beruold") || iName.equals("joruus3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logogreatsithwar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logogreatsithwar());

						} else if (iName.equals("ezra4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ezra4());

						} else if (iName.equals("beruold")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.beruold());

						} else if (iName.equals("joruus3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.joruus3());

						}
					}
				});
				return true;
			}
			if (iName.equals("astraalvao1") || iName.equals("quinlanvosobiwan") || iName.equals("logoahnahrawk") || iName.equals("kananleia")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("astraalvao1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.astraalvao1());

						} else if (iName.equals("quinlanvosobiwan")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.quinlanvosobiwan());

						} else if (iName.equals("logoahnahrawk")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoahnahrawk());

						} else if (iName.equals("kananleia")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kananleia());

						}
					}
				});
				return true;
			}
			if (iName.equals("clonepilote1") || iName.equals("tiedroid1") || iName.equals("manaan2") || iName.equals("celesteluke")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("clonepilote1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.clonepilote1());

						} else if (iName.equals("tiedroid1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tiedroid1());

						} else if (iName.equals("manaan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.manaan2());

						} else if (iName.equals("celesteluke")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.celesteluke());

						}
					}
				});
				return true;
			}
			if (iName.equals("devaronian2") || iName.equals("logoaugwynnedjo") || iName.equals("huttspace4000by") || iName.equals("zsinjempire8ay")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("devaronian2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.devaronian2());

						} else if (iName.equals("logoaugwynnedjo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoaugwynnedjo());

						} else if (iName.equals("huttspace4000by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.huttspace4000by());

						} else if (iName.equals("zsinjempire8ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zsinjempire8ay());

						}
					}
				});
				return true;
			}
			if (iName.equals("lifeform") || iName.equals("tionnesolusar1") || iName.equals("darkunderlord1") || iName.equals("noghri1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("lifeform")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lifeform());

						} else if (iName.equals("tionnesolusar1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tionnesolusar1());

						} else if (iName.equals("darkunderlord1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkunderlord1());

						} else if (iName.equals("noghri1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.noghri1());

						}
					}
				});
				return true;
			}
			if (iName.equals("wampa1") || iName.equals("juno1") || iName.equals("hadabbadonbattle") || iName.equals("jainacaedus2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("wampa1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.wampa1());

						} else if (iName.equals("juno1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.juno1());

						} else if (iName.equals("hadabbadonbattle")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hadabbadonbattle());

						} else if (iName.equals("jainacaedus2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jainacaedus2());

						}
					}
				});
				return true;
			}
			if (iName.equals("thrawn2") || iName.equals("zevsenesca2") || iName.equals("jadenkorr1") || iName.equals("h22")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("thrawn2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.thrawn2());

						} else if (iName.equals("zevsenesca2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zevsenesca2());

						} else if (iName.equals("jadenkorr1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jadenkorr1());

						} else if (iName.equals("h22")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.h22());

						}
					}
				});
				return true;
			}
			if (iName.equals("balmorra1") || iName.equals("awing1") || iName.equals("airspeeder1") || iName.equals("altostratus1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("balmorra1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.balmorra1());

						} else if (iName.equals("awing1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.awing1());

						} else if (iName.equals("airspeeder1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.airspeeder1());

						} else if (iName.equals("altostratus1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.altostratus1());

						}
					}
				});
				return true;
			}
			if (iName.equals("valenthynefarfalla2") || iName.equals("aiwha2") || iName.equals("logodarkrivan") || iName.equals("logosolanaberrie")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("valenthynefarfalla2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.valenthynefarfalla2());

						} else if (iName.equals("aiwha2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.aiwha2());

						} else if (iName.equals("logodarkrivan")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarkrivan());

						} else if (iName.equals("logosolanaberrie")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logosolanaberrie());

						}
					}
				});
				return true;
			}
			if (iName.equals("r2d21") || iName.equals("logonagasadow") || iName.equals("raanatey1") || iName.equals("enebray1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("r2d21")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2d21());

						} else if (iName.equals("logonagasadow")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logonagasadow());

						} else if (iName.equals("raanatey1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.raanatey1());

						} else if (iName.equals("enebray1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.enebray1());

						}
					}
				});
				return true;
			}
			if (iName.equals("logoempirerising") || iName.equals("eightbrother2") || iName.equals("etainterceptor2") || iName.equals("chardessables2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logoempirerising")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoempirerising());

						} else if (iName.equals("eightbrother2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.eightbrother2());

						} else if (iName.equals("etainterceptor2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.etainterceptor2());

						} else if (iName.equals("chardessables2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chardessables2());

						}
					}
				});
				return true;
			}
			if (iName.equals("logozenaantilles") || iName.equals("luminaraunduli4") || iName.equals("meetr2d2c3po") || iName.equals("pitdroid2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logozenaantilles")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logozenaantilles());

						} else if (iName.equals("luminaraunduli4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.luminaraunduli4());

						} else if (iName.equals("meetr2d2c3po")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.meetr2d2c3po());

						} else if (iName.equals("pitdroid2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.pitdroid2());

						}
					}
				});
				return true;
			}
			if (iName.equals("allianceterritoriescenter6ay") || iName.equals("sebulba1") || iName.equals("pellaeon2") || iName.equals("rancor2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("allianceterritoriescenter6ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.allianceterritoriescenter6ay());

						} else if (iName.equals("sebulba1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sebulba1());

						} else if (iName.equals("pellaeon2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.pellaeon2());

						} else if (iName.equals("rancor2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rancor2());

						}
					}
				});
				return true;
			}
			if (iName.equals("vargi1") || iName.equals("luminaraunduli1") || iName.equals("kassius1") || iName.equals("lolasayu1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("vargi1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vargi1());

						} else if (iName.equals("luminaraunduli1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.luminaraunduli1());

						} else if (iName.equals("kassius1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kassius1());

						} else if (iName.equals("lolasayu1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lolasayu1());

						}
					}
				});
				return true;
			}
			if (iName.equals("logodarkvador") || iName.equals("yavinbattle") || iName.equals("agruss2") || iName.equals("nutegunray2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logodarkvador")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarkvador());

						} else if (iName.equals("yavinbattle")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.yavinbattle());

						} else if (iName.equals("agruss2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.agruss2());

						} else if (iName.equals("nutegunray2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nutegunray2());

						}
					}
				});
				return true;
			}
			if (iName.equals("kananjarrusvador") || iName.equals("rexold") || iName.equals("forgestellaire1") || iName.equals("sokan")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kananjarrusvador")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kananjarrusvador());

						} else if (iName.equals("rexold")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rexold());

						} else if (iName.equals("forgestellaire1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.forgestellaire1());

						} else if (iName.equals("sokan")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sokan());

						}
					}
				});
				return true;
			}
			if (iName.equals("agenkolarquinlan") || iName.equals("ahsoka4") || iName.equals("sifodyas1") || iName.equals("keldor1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("agenkolarquinlan")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.agenkolarquinlan());

						} else if (iName.equals("ahsoka4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ahsoka4());

						} else if (iName.equals("sifodyas1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sifodyas1());

						} else if (iName.equals("keldor1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.keldor1());

						}
					}
				});
				return true;
			}
			if (iName.equals("detona1") || iName.equals("darkangralvstavus") || iName.equals("eternalthrone") || iName.equals("wullfyularenold")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("detona1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.detona1());

						} else if (iName.equals("darkangralvstavus")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkangralvstavus());

						} else if (iName.equals("eternalthrone")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.eternalthrone());

						} else if (iName.equals("wullfyularenold")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.wullfyularenold());

						}
					}
				});
				return true;
			}
			if (iName.equals("wattambor1") || iName.equals("huttspace") || iName.equals("elkevetter2") || iName.equals("darkazarddeath")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("wattambor1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.wattambor1());

						} else if (iName.equals("huttspace")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.huttspace());

						} else if (iName.equals("elkevetter2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.elkevetter2());

						} else if (iName.equals("darkazarddeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkazarddeath());

						}
					}
				});
				return true;
			}
			if (iName.equals("r2d2deathstar") || iName.equals("sithempire3650by") || iName.equals("githany1") || iName.equals("sanasolo1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("r2d2deathstar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2d2deathstar());

						} else if (iName.equals("sithempire3650by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sithempire3650by());

						} else if (iName.equals("githany1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.githany1());

						} else if (iName.equals("sanasolo1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sanasolo1());

						}
					}
				});
				return true;
			}
			if (iName.equals("janors2") || iName.equals("strassallie1") || iName.equals("evenpiell1") || iName.equals("kyloren2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("janors2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.janors2());

						} else if (iName.equals("strassallie1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.strassallie1());

						} else if (iName.equals("evenpiell1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.evenpiell1());

						} else if (iName.equals("kyloren2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kyloren2());

						}
					}
				});
				return true;
			}
			if (iName.equals("kananinquisitor2") || iName.equals("ludokressh1") || iName.equals("duros2") || iName.equals("falleen2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kananinquisitor2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kananinquisitor2());

						} else if (iName.equals("ludokressh1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ludokressh1());

						} else if (iName.equals("duros2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.duros2());

						} else if (iName.equals("falleen2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.falleen2());

						}
					}
				});
				return true;
			}
			if (iName.equals("zonder1") || iName.equals("dxun1") || iName.equals("kubaz2") || iName.equals("hondoohnaka1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("zonder1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zonder1());

						} else if (iName.equals("dxun1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dxun1());

						} else if (iName.equals("kubaz2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kubaz2());

						} else if (iName.equals("hondoohnaka1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hondoohnaka1());

						}
					}
				});
				return true;
			}
			if (iName.equals("vaclentor1") || iName.equals("superlaser2") || iName.equals("r2d2jediyavin") || iName.equals("tolskorr1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("vaclentor1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vaclentor1());

						} else if (iName.equals("superlaser2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.superlaser2());

						} else if (iName.equals("r2d2jediyavin")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2d2jediyavin());

						} else if (iName.equals("tolskorr1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tolskorr1());

						}
					}
				});
				return true;
			}
			if (iName.equals("qanilia1") || iName.equals("bruckchun1") || iName.equals("maradeath") || iName.equals("rakata1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("qanilia1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.qanilia1());

						} else if (iName.equals("bruckchun1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bruckchun1());

						} else if (iName.equals("maradeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.maradeath());

						} else if (iName.equals("rakata1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rakata1());

						}
					}
				});
				return true;
			}
			if (iName.equals("galacticrepublic22by") || iName.equals("aaylasecuradeath") || iName.equals("skullsquadron") || iName.equals("coruscant2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("galacticrepublic22by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.galacticrepublic22by());

						} else if (iName.equals("aaylasecuradeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.aaylasecuradeath());

						} else if (iName.equals("skullsquadron")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.skullsquadron());

						} else if (iName.equals("coruscant2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.coruscant2());

						}
					}
				});
				return true;
			}
			if (iName.equals("endor2") || iName.equals("carnorjax2") || iName.equals("sanhillgrievous") || iName.equals("human2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("endor2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.endor2());

						} else if (iName.equals("carnorjax2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.carnorjax2());

						} else if (iName.equals("sanhillgrievous")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sanhillgrievous());

						} else if (iName.equals("human2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.human2());

						}
					}
				});
				return true;
			}
			if (iName.equals("logodarktalon") || iName.equals("thule1") || iName.equals("kananinquisitor") || iName.equals("dryanta1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logodarktalon")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarktalon());

						} else if (iName.equals("thule1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.thule1());

						} else if (iName.equals("kananinquisitor")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kananinquisitor());

						} else if (iName.equals("dryanta1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dryanta1());

						}
					}
				});
				return true;
			}
			if (iName.equals("daalaluke") || iName.equals("utai1") || iName.equals("echuu2") || iName.equals("vwing1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("daalaluke")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.daalaluke());

						} else if (iName.equals("utai1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.utai1());

						} else if (iName.equals("echuu2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.echuu2());

						} else if (iName.equals("vwing1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vwing1());

						}
					}
				});
				return true;
			}
			if (iName.equals("r2d2vsdroid") || iName.equals("yoda3") || iName.equals("junomalek") || iName.equals("aurracoma")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("r2d2vsdroid")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2d2vsdroid());

						} else if (iName.equals("yoda3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.yoda3());

						} else if (iName.equals("junomalek")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.junomalek());

						} else if (iName.equals("aurracoma")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.aurracoma());

						}
					}
				});
				return true;
			}
			if (iName.equals("yun2") || iName.equals("bobafett2") || iName.equals("braylen1") || iName.equals("skalnas2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("yun2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.yun2());

						} else if (iName.equals("bobafett2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bobafett2());

						} else if (iName.equals("braylen1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.braylen1());

						} else if (iName.equals("skalnas2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.skalnas2());

						}
					}
				});
				return true;
			}
			if (iName.equals("kallusghost") || iName.equals("hawkryo1") || iName.equals("dassjennir4") || iName.equals("darkmarr1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kallusghost")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kallusghost());

						} else if (iName.equals("hawkryo1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hawkryo1());

						} else if (iName.equals("dassjennir4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dassjennir4());

						} else if (iName.equals("darkmarr1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkmarr1());

						}
					}
				});
				return true;
			}
			if (iName.equals("wolfsazen1") || iName.equals("tiedefender1") || iName.equals("imperialcivilwarend") || iName.equals("pongkrell2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("wolfsazen1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.wolfsazen1());

						} else if (iName.equals("tiedefender1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tiedefender1());

						} else if (iName.equals("imperialcivilwarend")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.imperialcivilwarend());

						} else if (iName.equals("pongkrell2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.pongkrell2());

						}
					}
				});
				return true;
			}
			if (iName.equals("energybow1") || iName.equals("neimodiansidious") || iName.equals("yodaship") || iName.equals("palpatinezillo")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("energybow1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.energybow1());

						} else if (iName.equals("neimodiansidious")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.neimodiansidious());

						} else if (iName.equals("yodaship")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.yodaship());

						} else if (iName.equals("palpatinezillo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.palpatinezillo());

						}
					}
				});
				return true;
			}
			if (iName.equals("kitfisto1") || iName.equals("bothan2") || iName.equals("jaxpavan1") || iName.equals("zenocquah1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kitfisto1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kitfisto1());

						} else if (iName.equals("bothan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bothan2());

						} else if (iName.equals("jaxpavan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jaxpavan1());

						} else if (iName.equals("zenocquah1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zenocquah1());

						}
					}
				});
				return true;
			}
			if (iName.equals("chagrian2") || iName.equals("palpatineanakin1") || iName.equals("logopoojanaberrie") || iName.equals("logodarkruyn")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("chagrian2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chagrian2());

						} else if (iName.equals("palpatineanakin1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.palpatineanakin1());

						} else if (iName.equals("logopoojanaberrie")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logopoojanaberrie());

						} else if (iName.equals("logodarkruyn")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarkruyn());

						}
					}
				});
				return true;
			}
			if (iName.equals("celestemorne1") || iName.equals("gannerkrieg1") || iName.equals("nihlmassacre") || iName.equals("illum2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("celestemorne1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.celestemorne1());

						} else if (iName.equals("gannerkrieg1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gannerkrieg1());

						} else if (iName.equals("nihlmassacre")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nihlmassacre());

						} else if (iName.equals("illum2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.illum2());

						}
					}
				});
				return true;
			}
			if (iName.equals("lumpawaroo1") || iName.equals("jabbaluke") || iName.equals("khaleenhentz1") || iName.equals("nantex2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("lumpawaroo1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lumpawaroo1());

						} else if (iName.equals("jabbaluke")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jabbaluke());

						} else if (iName.equals("khaleenhentz1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.khaleenhentz1());

						} else if (iName.equals("nantex2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nantex2());

						}
					}
				});
				return true;
			}
			if (iName.equals("darknihilus2") || iName.equals("hylovisz1") || iName.equals("dathomirian1") || iName.equals("logogreatwar")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("darknihilus2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darknihilus2());

						} else if (iName.equals("hylovisz1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hylovisz1());

						} else if (iName.equals("dathomirian1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dathomirian1());

						} else if (iName.equals("logogreatwar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logogreatwar());

						}
					}
				});
				return true;
			}
			if (iName.equals("nomisunrider5") || iName.equals("orondia2") || iName.equals("reppolitic") || iName.equals("killik2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("nomisunrider5")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nomisunrider5());

						} else if (iName.equals("orondia2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.orondia2());

						} else if (iName.equals("reppolitic")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.reppolitic());

						} else if (iName.equals("killik2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.killik2());

						}
					}
				});
				return true;
			}
			if (iName.equals("mortis2") || iName.equals("ortoplutonia2") || iName.equals("logodarktenebrous") || iName.equals("anakin16")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("mortis2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mortis2());

						} else if (iName.equals("ortoplutonia2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ortoplutonia2());

						} else if (iName.equals("logodarktenebrous")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarktenebrous());

						} else if (iName.equals("anakin16")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anakin16());

						}
					}
				});
				return true;
			}
			if (iName.equals("aphra2") || iName.equals("owen1") || iName.equals("zygerria1") || iName.equals("galacticempireeast4ay")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("aphra2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.aphra2());

						} else if (iName.equals("owen1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.owen1());

						} else if (iName.equals("zygerria1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zygerria1());

						} else if (iName.equals("galacticempireeast4ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.galacticempireeast4ay());

						}
					}
				});
				return true;
			}
			if (iName.equals("brakiss1") || iName.equals("felucia2") || iName.equals("galacticrepublic1000by") || iName.equals("chisswar")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("brakiss1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.brakiss1());

						} else if (iName.equals("felucia2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.felucia2());

						} else if (iName.equals("galacticrepublic1000by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.galacticrepublic1000by());

						} else if (iName.equals("chisswar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chisswar());

						}
					}
				});
				return true;
			}
			if (iName.equals("xamar1") || iName.equals("allianceterritories4ay") || iName.equals("ooroo1") || iName.equals("ordcestus1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("xamar1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.xamar1());

						} else if (iName.equals("allianceterritories4ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.allianceterritories4ay());

						} else if (iName.equals("ooroo1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ooroo1());

						} else if (iName.equals("ordcestus1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ordcestus1());

						}
					}
				});
				return true;
			}
			if (iName.equals("podracer2") || iName.equals("sdpraetor1") || iName.equals("logosecondcivilwar") || iName.equals("txtt1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("podracer2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.podracer2());

						} else if (iName.equals("sdpraetor1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdpraetor1());

						} else if (iName.equals("logosecondcivilwar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logosecondcivilwar());

						} else if (iName.equals("txtt1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.txtt1());

						}
					}
				});
				return true;
			}
			if (iName.equals("leiahan") || iName.equals("darkvador2") || iName.equals("logojediwar") || iName.equals("galacticrepublic3957by")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("leiahan")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.leiahan());

						} else if (iName.equals("darkvador2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkvador2());

						} else if (iName.equals("logojediwar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logojediwar());

						} else if (iName.equals("galacticrepublic3957by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.galacticrepublic3957by());

						}
					}
				});
				return true;
			}
			if (iName.equals("palpatine1") || iName.equals("valkorion1") || iName.equals("tradeguild1") || iName.equals("tarkinleia")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("palpatine1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.palpatine1());

						} else if (iName.equals("valkorion1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.valkorion1());

						} else if (iName.equals("tradeguild1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tradeguild1());

						} else if (iName.equals("tarkinleia")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tarkinleia());

						}
					}
				});
				return true;
			}
			if (iName.equals("darkrivan1") || iName.equals("volt2") || iName.equals("vornskr1") || iName.equals("exalkressh3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("darkrivan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkrivan1());

						} else if (iName.equals("volt2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.volt2());

						} else if (iName.equals("vornskr1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vornskr1());

						} else if (iName.equals("exalkressh3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.exalkressh3());

						}
					}
				});
				return true;
			}
			if (iName.equals("dreed1") || iName.equals("watto1") || iName.equals("lilittwoseas1") || iName.equals("supertank2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("dreed1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dreed1());

						} else if (iName.equals("watto1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.watto1());

						} else if (iName.equals("lilittwoseas1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lilittwoseas1());

						} else if (iName.equals("supertank2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.supertank2());

						}
					}
				});
				return true;
			}
			if (iName.equals("rav1") || iName.equals("opporancisis1") || iName.equals("taris1") || iName.equals("hansoloend")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("rav1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rav1());

						} else if (iName.equals("opporancisis1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.opporancisis1());

						} else if (iName.equals("taris1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.taris1());

						} else if (iName.equals("hansoloend")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hansoloend());

						}
					}
				});
				return true;
			}
			if (iName.equals("nahdarvebb1") || iName.equals("gannerrhysode1") || iName.equals("obiwan2") || iName.equals("arcann2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("nahdarvebb1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nahdarvebb1());

						} else if (iName.equals("gannerrhysode1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gannerrhysode1());

						} else if (iName.equals("obiwan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.obiwan2());

						} else if (iName.equals("arcann2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.arcann2());

						}
					}
				});
				return true;
			}
			if (iName.equals("tavion1") || iName.equals("luke6") || iName.equals("palpatinepolitic") || iName.equals("flametrooper1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("tavion1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tavion1());

						} else if (iName.equals("luke6")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.luke6());

						} else if (iName.equals("palpatinepolitic")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.palpatinepolitic());

						} else if (iName.equals("flametrooper1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.flametrooper1());

						}
					}
				});
				return true;
			}
			if (iName.equals("jetpackz62") || iName.equals("c3pomustafar") || iName.equals("kiadimundi1") || iName.equals("leiaalde")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("jetpackz62")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jetpackz62());

						} else if (iName.equals("c3pomustafar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.c3pomustafar());

						} else if (iName.equals("kiadimundi1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kiadimundi1());

						} else if (iName.equals("leiaalde")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.leiaalde());

						}
					}
				});
				return true;
			}
			if (iName.equals("bantha1") || iName.equals("nebulon1") || iName.equals("logosyalantillesfel") || iName.equals("sanasolo3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("bantha1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bantha1());

						} else if (iName.equals("nebulon1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nebulon1());

						} else if (iName.equals("logosyalantillesfel")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logosyalantillesfel());

						} else if (iName.equals("sanasolo3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sanasolo3());

						}
					}
				});
				return true;
			}
			if (iName.equals("nenyim1") || iName.equals("vongpeople") || iName.equals("sdmunificient1") || iName.equals("sithsphere1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("nenyim1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nenyim1());

						} else if (iName.equals("vongpeople")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vongpeople());

						} else if (iName.equals("sdmunificient1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdmunificient1());

						} else if (iName.equals("sithsphere1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sithsphere1());

						}
					}
				});
				return true;
			}
			if (iName.equals("qaniliayoung") || iName.equals("tradefederation1") || iName.equals("dorja1") || iName.equals("huttspace5000by")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("qaniliayoung")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.qaniliayoung());

						} else if (iName.equals("tradefederation1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tradefederation1());

						} else if (iName.equals("dorja1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dorja1());

						} else if (iName.equals("huttspace5000by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.huttspace5000by());

						}
					}
				});
				return true;
			}
			if (iName.equals("nrn992") || iName.equals("rakatapeople") || iName.equals("vodosioskbaas1") || iName.equals("logojediorder")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("nrn992")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nrn992());

						} else if (iName.equals("rakatapeople")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rakatapeople());

						} else if (iName.equals("vodosioskbaas1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vodosioskbaas1());

						} else if (iName.equals("logojediorder")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logojediorder());

						}
					}
				});
				return true;
			}
			if (iName.equals("royalmandoguard1") || iName.equals("janarus2") || iName.equals("lerrduvat1") || iName.equals("gas1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("royalmandoguard1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.royalmandoguard1());

						} else if (iName.equals("janarus2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.janarus2());

						} else if (iName.equals("lerrduvat1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lerrduvat1());

						} else if (iName.equals("gas1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gas1());

						}
					}
				});
				return true;
			}
			if (iName.equals("bb81") || iName.equals("barrissoffeeahsoka") || iName.equals("jocastanu1") || iName.equals("kerraarrive")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("bb81")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bb81());

						} else if (iName.equals("barrissoffeeahsoka")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.barrissoffeeahsoka());

						} else if (iName.equals("jocastanu1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jocastanu1());

						} else if (iName.equals("kerraarrive")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kerraarrive());

						}
					}
				});
				return true;
			}
			if (iName.equals("robliodarte1") || iName.equals("bobabossk") || iName.equals("kiadimundiyoung") || iName.equals("logorenewsith")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("robliodarte1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.robliodarte1());

						} else if (iName.equals("bobabossk")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bobabossk());

						} else if (iName.equals("kiadimundiyoung")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kiadimundiyoung());

						} else if (iName.equals("logorenewsith")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logorenewsith());

						}
					}
				});
				return true;
			}
			if (iName.equals("krath3") || iName.equals("herabwing") || iName.equals("fehlaaur1") || iName.equals("logogunneryage")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("krath3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.krath3());

						} else if (iName.equals("herabwing")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.herabwing());

						} else if (iName.equals("fehlaaur1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.fehlaaur1());

						} else if (iName.equals("logogunneryage")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logogunneryage());

						}
					}
				});
				return true;
			}
			if (iName.equals("yogarlyste1") || iName.equals("trill1") || iName.equals("losttribe") || iName.equals("tarpals1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("yogarlyste1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.yogarlyste1());

						} else if (iName.equals("trill1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.trill1());

						} else if (iName.equals("losttribe")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.losttribe());

						} else if (iName.equals("tarpals1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tarpals1());

						}
					}
				});
				return true;
			}
			if (iName.equals("zulexiss2") || iName.equals("moncalbattle1") || iName.equals("vhontetervho2") || iName.equals("gungan2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("zulexiss2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zulexiss2());

						} else if (iName.equals("moncalbattle1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.moncalbattle1());

						} else if (iName.equals("vhontetervho2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vhontetervho2());

						} else if (iName.equals("gungan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gungan2());

						}
					}
				});
				return true;
			}
			if (iName.equals("clonedechoc1") || iName.equals("canonnieredroid1") || iName.equals("logodarkmillenial") || iName.equals("shimrra1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("clonedechoc1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.clonedechoc1());

						} else if (iName.equals("canonnieredroid1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.canonnieredroid1());

						} else if (iName.equals("logodarkmillenial")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarkmillenial());

						} else if (iName.equals("shimrra1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shimrra1());

						}
					}
				});
				return true;
			}
			if (iName.equals("mandalore2") || iName.equals("sabineholo") || iName.equals("padme5") || iName.equals("tiebomber1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("mandalore2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mandalore2());

						} else if (iName.equals("sabineholo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sabineholo());

						} else if (iName.equals("padme5")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.padme5());

						} else if (iName.equals("tiebomber1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tiebomber1());

						}
					}
				});
				return true;
			}
			if (iName.equals("valandru1") || iName.equals("zerocommand4ay") || iName.equals("logoelliahchalk") || iName.equals("trench2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("valandru1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.valandru1());

						} else if (iName.equals("zerocommand4ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zerocommand4ay());

						} else if (iName.equals("logoelliahchalk")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoelliahchalk());

						} else if (iName.equals("trench2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.trench2());

						}
					}
				});
				return true;
			}
			if (iName.equals("logodarkplagueis") || iName.equals("croiseurmc301") || iName.equals("r2d2gadgets") || iName.equals("zillo1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logodarkplagueis")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarkplagueis());

						} else if (iName.equals("croiseurmc301")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.croiseurmc301());

						} else if (iName.equals("r2d2gadgets")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2d2gadgets());

						} else if (iName.equals("zillo1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zillo1());

						}
					}
				});
				return true;
			}
			if (iName.equals("midichlorien1") || iName.equals("darktaloncade") || iName.equals("corrancorsec") || iName.equals("skytopstation2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("midichlorien1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.midichlorien1());

						} else if (iName.equals("darktaloncade")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darktaloncade());

						} else if (iName.equals("corrancorsec")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.corrancorsec());

						} else if (iName.equals("skytopstation2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.skytopstation2());

						}
					}
				});
				return true;
			}
			if (iName.equals("agenkolar1") || iName.equals("darkruyndeath") || iName.equals("hantie") || iName.equals("blasterrifledc172")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("agenkolar1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.agenkolar1());

						} else if (iName.equals("darkruyndeath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkruyndeath());

						} else if (iName.equals("hantie")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hantie());

						} else if (iName.equals("blasterrifledc172")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.blasterrifledc172());

						}
					}
				});
				return true;
			}
			if (iName.equals("logohandempire") || iName.equals("atdp1") || iName.equals("kananjarrus1") || iName.equals("kyloren4")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logohandempire")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logohandempire());

						} else if (iName.equals("atdp1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.atdp1());

						} else if (iName.equals("kananjarrus1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kananjarrus1());

						} else if (iName.equals("kyloren4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kyloren4());

						}
					}
				});
				return true;
			}
			if (iName.equals("stark1") || iName.equals("heracell") || iName.equals("tusken1") || iName.equals("dwarfspiderdroid2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("stark1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.stark1());

						} else if (iName.equals("heracell")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.heracell());

						} else if (iName.equals("tusken1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tusken1());

						} else if (iName.equals("dwarfspiderdroid2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dwarfspiderdroid2());

						}
					}
				});
				return true;
			}
			if (iName.equals("zeb2") || iName.equals("aurebesh2") || iName.equals("chewietrando") || iName.equals("bespin2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("zeb2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zeb2());

						} else if (iName.equals("aurebesh2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.aurebesh2());

						} else if (iName.equals("chewietrando")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chewietrando());

						} else if (iName.equals("bespin2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bespin2());

						}
					}
				});
				return true;
			}
			if (iName.equals("roanfelfuneral") || iName.equals("greatgalacticwar4") || iName.equals("sdresurgent2") || iName.equals("haazen1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("roanfelfuneral")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.roanfelfuneral());

						} else if (iName.equals("greatgalacticwar4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.greatgalacticwar4());

						} else if (iName.equals("sdresurgent2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sdresurgent2());

						} else if (iName.equals("haazen1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.haazen1());

						}
					}
				});
				return true;
			}
			if (iName.equals("logolukeskywalker") || iName.equals("marar2d2") || iName.equals("ponudo2") || iName.equals("sarroxaj1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logolukeskywalker")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logolukeskywalker());

						} else if (iName.equals("marar2d2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.marar2d2());

						} else if (iName.equals("ponudo2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ponudo2());

						} else if (iName.equals("sarroxaj1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sarroxaj1());

						}
					}
				});
				return true;
			}
			if (iName.equals("lukeold") || iName.equals("neimodian1") || iName.equals("togruta1") || iName.equals("propulsion1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("lukeold")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lukeold());

						} else if (iName.equals("neimodian1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.neimodian1());

						} else if (iName.equals("togruta1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.togruta1());

						} else if (iName.equals("propulsion1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.propulsion1());

						}
					}
				});
				return true;
			}
			if (iName.equals("bibfortuna1") || iName.equals("planetes") || iName.equals("barissoffee1") || iName.equals("gahan1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("bibfortuna1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bibfortuna1());

						} else if (iName.equals("planetes")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.planetes());

						} else if (iName.equals("barissoffee1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.barissoffee1());

						} else if (iName.equals("gahan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gahan1());

						}
					}
				});
				return true;
			}
			if (iName.equals("logoonesith") || iName.equals("darktenebrous2") || iName.equals("pestage2") || iName.equals("bhatjul1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logoonesith")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoonesith());

						} else if (iName.equals("darktenebrous2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darktenebrous2());

						} else if (iName.equals("pestage2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.pestage2());

						} else if (iName.equals("bhatjul1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bhatjul1());

						}
					}
				});
				return true;
			}
			if (iName.equals("dassjennir2") || iName.equals("droidb21") || iName.equals("sadowkressh") || iName.equals("anaxes2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("dassjennir2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dassjennir2());

						} else if (iName.equals("droidb21")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.droidb21());

						} else if (iName.equals("sadowkressh")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sadowkressh());

						} else if (iName.equals("anaxes2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anaxes2());

						}
					}
				});
				return true;
			}
			if (iName.equals("hosnianprime2") || iName.equals("jetpackjt122") || iName.equals("darkmarr3") || iName.equals("revanjedi")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("hosnianprime2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hosnianprime2());

						} else if (iName.equals("jetpackjt122")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jetpackjt122());

						} else if (iName.equals("darkmarr3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkmarr3());

						} else if (iName.equals("revanjedi")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.revanjedi());

						}
					}
				});
				return true;
			}
			if (iName.equals("calixtelabo") || iName.equals("yaddle1") || iName.equals("derriphan1") || iName.equals("madine1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("calixtelabo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.calixtelabo());

						} else if (iName.equals("yaddle1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.yaddle1());

						} else if (iName.equals("derriphan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.derriphan1());

						} else if (iName.equals("madine1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.madine1());

						}
					}
				});
				return true;
			}
			if (iName.equals("lukevong") || iName.equals("csisd") || iName.equals("calixtesith") || iName.equals("droo2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("lukevong")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lukevong());

						} else if (iName.equals("csisd")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.csisd());

						} else if (iName.equals("calixtesith")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.calixtesith());

						} else if (iName.equals("droo2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.droo2());

						}
					}
				});
				return true;
			}
			if (iName.equals("onkya1") || iName.equals("mawvskyle") || iName.equals("varactyl1") || iName.equals("cab1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("onkya1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.onkya1());

						} else if (iName.equals("mawvskyle")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mawvskyle());

						} else if (iName.equals("varactyl1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.varactyl1());

						} else if (iName.equals("cab1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cab1());

						}
					}
				});
				return true;
			}
			if (iName.equals("rattataki1") || iName.equals("nagi1") || iName.equals("marnhierogryph1") || iName.equals("evaan2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("rattataki1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rattataki1());

						} else if (iName.equals("nagi1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nagi1());

						} else if (iName.equals("marnhierogryph1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.marnhierogryph1());

						} else if (iName.equals("evaan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.evaan2());

						}
					}
				});
				return true;
			}
			if (iName.equals("taivasbattle") || iName.equals("imperialpeople") || iName.equals("r2d2illum") || iName.equals("allianceterritoriesnortheast6ay")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("taivasbattle")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.taivasbattle());

						} else if (iName.equals("imperialpeople")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.imperialpeople());

						} else if (iName.equals("r2d2illum")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2d2illum());

						} else if (iName.equals("allianceterritoriesnortheast6ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.allianceterritoriesnortheast6ay());

						}
					}
				});
				return true;
			}
			if (iName.equals("maladiwayland") || iName.equals("anakin18") || iName.equals("logodarknihilus") || iName.equals("rodia1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("maladiwayland")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.maladiwayland());

						} else if (iName.equals("anakin18")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anakin18());

						} else if (iName.equals("logodarknihilus")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarknihilus());

						} else if (iName.equals("rodia1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rodia1());

						}
					}
				});
				return true;
			}
			if (iName.equals("huttspace3650by") || iName.equals("newjediorder4") || iName.equals("force1") || iName.equals("gormanvandrayk2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("huttspace3650by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.huttspace3650by());

						} else if (iName.equals("newjediorder4")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.newjediorder4());

						} else if (iName.equals("force1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.force1());

						} else if (iName.equals("gormanvandrayk2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gormanvandrayk2());

						}
					}
				});
				return true;
			}
			if (iName.equals("jawa1") || iName.equals("anakin8") || iName.equals("lukesarco1") || iName.equals("cassiotagge1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("jawa1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jawa1());

						} else if (iName.equals("anakin8")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anakin8());

						} else if (iName.equals("lukesarco1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lukesarco1());

						} else if (iName.equals("cassiotagge1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cassiotagge1());

						}
					}
				});
				return true;
			}
			if (iName.equals("taivasarrival") || iName.equals("darkbaras1") || iName.equals("kiadimundideath") || iName.equals("saleucami1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("taivasarrival")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.taivasarrival());

						} else if (iName.equals("darkbaras1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkbaras1());

						} else if (iName.equals("kiadimundideath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kiadimundideath());

						} else if (iName.equals("saleucami1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.saleucami1());

						}
					}
				});
				return true;
			}
			if (iName.equals("oldrepublic1") || iName.equals("logojobalnaberrie") || iName.equals("csipeople") || iName.equals("sabrelaser2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("oldrepublic1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.oldrepublic1());

						} else if (iName.equals("logojobalnaberrie")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logojobalnaberrie());

						} else if (iName.equals("csipeople")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.csipeople());

						} else if (iName.equals("sabrelaser2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sabrelaser2());

						}
					}
				});
				return true;
			}
			if (iName.equals("bg") || iName.equals("mando1") || iName.equals("carida2") || iName.equals("narshaddaa2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("bg")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bg());

						} else if (iName.equals("mando1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mando1());

						} else if (iName.equals("carida2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.carida2());

						} else if (iName.equals("narshaddaa2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.narshaddaa2());

						}
					}
				});
				return true;
			}
			if (iName.equals("macewindujarjar") || iName.equals("shaevizla1") || iName.equals("junsato1") || iName.equals("stormtrooper2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("macewindujarjar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.macewindujarjar());

						} else if (iName.equals("shaevizla1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shaevizla1());

						} else if (iName.equals("junsato1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.junsato1());

						} else if (iName.equals("stormtrooper2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.stormtrooper2());

						}
					}
				});
				return true;
			}
			if (iName.equals("cuvebacta1") || iName.equals("sullustien1") || iName.equals("wayland1") || iName.equals("tieroyal2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("cuvebacta1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cuvebacta1());

						} else if (iName.equals("sullustien1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sullustien1());

						} else if (iName.equals("wayland1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.wayland1());

						} else if (iName.equals("tieroyal2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tieroyal2());

						}
					}
				});
				return true;
			}
			if (iName.equals("seknos2") || iName.equals("canongalactique1") || iName.equals("logoryoonaberrie") || iName.equals("bail2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("seknos2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.seknos2());

						} else if (iName.equals("canongalactique1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.canongalactique1());

						} else if (iName.equals("logoryoonaberrie")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoryoonaberrie());

						} else if (iName.equals("bail2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bail2());

						}
					}
				});
				return true;
			}
			if (iName.equals("kkruhk1") || iName.equals("logomandowar") || iName.equals("jandodonna2") || iName.equals("nihlfail")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kkruhk1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kkruhk1());

						} else if (iName.equals("logomandowar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logomandowar());

						} else if (iName.equals("jandodonna2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jandodonna2());

						} else if (iName.equals("nihlfail")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nihlfail());

						}
					}
				});
				return true;
			}
			if (iName.equals("tieraptor1") || iName.equals("logodroorawk") || iName.equals("reyship") || iName.equals("dromundkaas2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("tieraptor1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tieraptor1());

						} else if (iName.equals("logodroorawk")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodroorawk());

						} else if (iName.equals("reyship")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.reyship());

						} else if (iName.equals("dromundkaas2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dromundkaas2());

						}
					}
				});
				return true;
			}
			if (iName.equals("logohogrumchalk") || iName.equals("arcajeth2") || iName.equals("bantha2") || iName.equals("taris3")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logohogrumchalk")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logohogrumchalk());

						} else if (iName.equals("arcajeth2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.arcajeth2());

						} else if (iName.equals("bantha2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bantha2());

						} else if (iName.equals("taris3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.taris3());

						}
					}
				});
				return true;
			}
			if (iName.equals("anoat1") || iName.equals("r2kt") || iName.equals("logoommin") || iName.equals("rhenvar2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("anoat1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anoat1());

						} else if (iName.equals("r2kt")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.r2kt());

						} else if (iName.equals("logoommin")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoommin());

						} else if (iName.equals("rhenvar2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rhenvar2());

						}
					}
				});
				return true;
			}
			if (iName.equals("revanchism1") || iName.equals("bastilashan1") || iName.equals("rendili2") || iName.equals("quinlanvosyoung")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("revanchism1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.revanchism1());

						} else if (iName.equals("bastilashan1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bastilashan1());

						} else if (iName.equals("rendili2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rendili2());

						} else if (iName.equals("quinlanvosyoung")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.quinlanvosyoung());

						}
					}
				});
				return true;
			}
			if (iName.equals("firstorder36ay") || iName.equals("logotodrfel") || iName.equals("dathomir1") || iName.equals("ackbar1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("firstorder36ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.firstorder36ay());

						} else if (iName.equals("logotodrfel")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logotodrfel());

						} else if (iName.equals("dathomir1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dathomir1());

						} else if (iName.equals("ackbar1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ackbar1());

						}
					}
				});
				return true;
			}
			if (iName.equals("trasaa3") || iName.equals("jerjerrod1") || iName.equals("potentium") || iName.equals("martuuk1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("trasaa3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.trasaa3());

						} else if (iName.equals("jerjerrod1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jerjerrod1());

						} else if (iName.equals("potentium")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.potentium());

						} else if (iName.equals("martuuk1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.martuuk1());

						}
					}
				});
				return true;
			}
			if (iName.equals("depabillaba1") || iName.equals("rahmkota3") || iName.equals("handempire19by") || iName.equals("ryloth1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("depabillaba1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.depabillaba1());

						} else if (iName.equals("rahmkota3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rahmkota3());

						} else if (iName.equals("handempire19by")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.handempire19by());

						} else if (iName.equals("ryloth1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ryloth1());

						}
					}
				});
				return true;
			}
			if (iName.equals("kamsolusar2") || iName.equals("chackfel") || iName.equals("kerraholt1") || iName.equals("corranshedao")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("kamsolusar2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kamsolusar2());

						} else if (iName.equals("chackfel")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chackfel());

						} else if (iName.equals("kerraholt1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kerraholt1());

						} else if (iName.equals("corranshedao")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.corranshedao());

						}
					}
				});
				return true;
			}
			if (iName.equals("aqualish2") || iName.equals("baktoid1") || iName.equals("padme3") || iName.equals("yodayoung")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("aqualish2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.aqualish2());

						} else if (iName.equals("baktoid1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.baktoid1());

						} else if (iName.equals("padme3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.padme3());

						} else if (iName.equals("yodayoung")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.yodayoung());

						}
					}
				});
				return true;
			}
			if (iName.equals("exarkunreturn") || iName.equals("logodarkmalak") || iName.equals("ahsoka8") || iName.equals("tiehunter1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("exarkunreturn")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.exarkunreturn());

						} else if (iName.equals("logodarkmalak")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logodarkmalak());

						} else if (iName.equals("ahsoka8")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ahsoka8());

						} else if (iName.equals("tiehunter1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tiehunter1());

						}
					}
				});
				return true;
			}
			if (iName.equals("logokraytsithempire") || iName.equals("imperialforce") || iName.equals("yinchorri1") || iName.equals("logohyperespacewar")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logokraytsithempire")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logokraytsithempire());

						} else if (iName.equals("imperialforce")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.imperialforce());

						} else if (iName.equals("yinchorri1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.yinchorri1());

						} else if (iName.equals("logohyperespacewar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logohyperespacewar());

						}
					}
				});
				return true;
			}
			if (iName.equals("aurravsaayla") || iName.equals("hyperdrivering2") || iName.equals("besalisk2") || iName.equals("sariss2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("aurravsaayla")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.aurravsaayla());

						} else if (iName.equals("hyperdrivering2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.hyperdrivering2());

						} else if (iName.equals("besalisk2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.besalisk2());

						} else if (iName.equals("sariss2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sariss2());

						}
					}
				});
				return true;
			}
			if (iName.equals("logojainasolo") || iName.equals("geisttaivas") || iName.equals("navettesentinel2") || iName.equals("shaaktideath")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logojainasolo")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logojainasolo());

						} else if (iName.equals("geisttaivas")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.geisttaivas());

						} else if (iName.equals("navettesentinel2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.navettesentinel2());

						} else if (iName.equals("shaaktideath")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.shaaktideath());

						}
					}
				});
				return true;
			}
			if (iName.equals("yaraelpoof1") || iName.equals("jetpackjt121") || iName.equals("anakin20") || iName.equals("lokdurd1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("yaraelpoof1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.yaraelpoof1());

						} else if (iName.equals("jetpackjt121")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.jetpackjt121());

						} else if (iName.equals("anakin20")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.anakin20());

						} else if (iName.equals("lokdurd1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.lokdurd1());

						}
					}
				});
				return true;
			}
			if (iName.equals("logoxoxaan") || iName.equals("taung2") || iName.equals("nomisunrider1") || iName.equals("xanatos1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("logoxoxaan")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.logoxoxaan());

						} else if (iName.equals("taung2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.taung2());

						} else if (iName.equals("nomisunrider1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.nomisunrider1());

						} else if (iName.equals("xanatos1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.xanatos1());

						}
					}
				});
				return true;
			}
			if (iName.equals("obiwansaveluke") || iName.equals("neti1") || iName.equals("abeloth2") || iName.equals("bobadengar")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("obiwansaveluke")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.obiwansaveluke());

						} else if (iName.equals("neti1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.neti1());

						} else if (iName.equals("abeloth2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.abeloth2());

						} else if (iName.equals("bobadengar")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bobadengar());

						}
					}
				});
				return true;
			}
			if (iName.equals("vimaulic") || iName.equals("rieekan2") || iName.equals("ronto1") || iName.equals("endorend")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("vimaulic")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vimaulic());

						} else if (iName.equals("rieekan2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.rieekan2());

						} else if (iName.equals("ronto1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ronto1());

						} else if (iName.equals("endorend")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.endorend());

						}
					}
				});
				return true;
			}
			if (iName.equals("ajuntapall1") || iName.equals("markaragnos2") || iName.equals("vaisseaux") || iName.equals("testjedi1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("ajuntapall1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.ajuntapall1());

						} else if (iName.equals("markaragnos2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.markaragnos2());

						} else if (iName.equals("vaisseaux")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vaisseaux());

						} else if (iName.equals("testjedi1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.testjedi1());

						}
					}
				});
				return true;
			}
			if (iName.equals("devastator1") || iName.equals("caamasdoc1") || iName.equals("bobafett8") || iName.equals("naboon11")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("devastator1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.devastator1());

						} else if (iName.equals("caamasdoc1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.caamasdoc1());

						} else if (iName.equals("bobafett8")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.bobafett8());

						} else if (iName.equals("naboon11")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.naboon11());

						}
					}
				});
				return true;
			}
			if (iName.equals("cronal1") || iName.equals("empty") || iName.equals("chiss2") || iName.equals("vandar2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("cronal1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.cronal1());

						} else if (iName.equals("empty")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.empty());

						} else if (iName.equals("chiss2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.chiss2());

						} else if (iName.equals("vandar2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.vandar2());

						}
					}
				});
				return true;
			}
			if (iName.equals("zaynesith") || iName.equals("tarfful2") || iName.equals("tmt2") || iName.equals("mandressuciteur1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("zaynesith")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.zaynesith());

						} else if (iName.equals("tarfful2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tarfful2());

						} else if (iName.equals("tmt2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.tmt2());

						} else if (iName.equals("mandressuciteur1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mandressuciteur1());

						}
					}
				});
				return true;
			}
			if (iName.equals("darkazard2") || iName.equals("darkbane2") || iName.equals("asajjdatho") || iName.equals("fgaleast137ay")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("darkazard2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkazard2());

						} else if (iName.equals("darkbane2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkbane2());

						} else if (iName.equals("asajjdatho")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.asajjdatho());

						} else if (iName.equals("fgaleast137ay")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.fgaleast137ay());

						}
					}
				});
				return true;
			}
			if (iName.equals("mazkanata1") || iName.equals("sddragon2") || iName.equals("darkbaras3") || iName.equals("endar1")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("mazkanata1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.mazkanata1());

						} else if (iName.equals("sddragon2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.sddragon2());

						} else if (iName.equals("darkbaras3")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkbaras3());

						} else if (iName.equals("endar1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.endar1());

						}
					}
				});
				return true;
			}
			if (iName.equals("crabdroid2") || iName.equals("plokoon1") || iName.equals("darkmalgus1") || iName.equals("kacearrive")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("crabdroid2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.crabdroid2());

						} else if (iName.equals("plokoon1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.plokoon1());

						} else if (iName.equals("darkmalgus1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.darkmalgus1());

						} else if (iName.equals("kacearrive")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.kacearrive());

						}
					}
				});
				return true;
			}
			if (iName.equals("dianoga1") || iName.equals("newmandalore1") || iName.equals("gundark1") || iName.equals("credit2")) {
				GWT.runAsync(new RunAsyncCallback() {
					public void onFailure(Throwable caught) {
					}
					public void onSuccess() {
						if (iName.equals("dianoga1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.dianoga1());

						} else if (iName.equals("newmandalore1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.newmandalore1());

						} else if (iName.equals("gundark1")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.gundark1());

						} else if (iName.equals("credit2")) {
							iASyncCall.onSuccess(StarWarsImageResources.INSTANCE.credit2());

						}
					}
				});
				return true;
			}

		return false;
	}
}