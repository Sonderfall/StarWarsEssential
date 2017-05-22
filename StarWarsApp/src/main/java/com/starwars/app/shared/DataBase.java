package com.starwars.app.shared;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import com.google.gwt.resources.client.ImageResource;
import com.starwars.app.client.StarWarsApp;
import com.starwars.app.client.main.event.PortalClickEvent.TypePortal;

public class DataBase {

	private static DataBase sInstance;
	private final Map<String, ElementInfo> mElementDataBase;
	
	private DataBase() {
		mElementDataBase = new HashMap<String, ElementInfo>();
	}
	
	public static DataBase getInstance() {
		return sInstance == null ? sInstance = new DataBase() : sInstance;
	}
	
	public Map<String, ElementInfo> getElementDataBase() {
		return mElementDataBase;
	}

	public void initRandomElementFromDataBase() {
		int lRandInt = new Random().nextInt(mElementDataBase.size());
		int i = 0;
		for (Entry<String, ElementInfo> lSet : mElementDataBase.entrySet()) {
			if (i == lRandInt) {
				lSet.getValue().loadDatas();
				break;
			}
			++i;
		}
	}
	
	public boolean getExistingElementFromDataBase(ElementInfo iInfo) {
		for (Entry<String, ElementInfo> lSet : mElementDataBase.entrySet()) {
			if (lSet.getValue() == iInfo)
				return true;
		}
		return false;
	}
	
	public ElementInfo getElementFromDataBase(String iName) {
		ElementInfo lData = null;
		for (Entry<String, ElementInfo> lSet : mElementDataBase.entrySet()) {
			for (String lKeyWord : lSet.getValue().getKeyWords()) {
				if (iName.equals(lKeyWord)) {
					lData = lSet.getValue();
					break;
				}
			}
			if (lData != null)
				break;
		}
		return lData;
	}
	
	public String getDescriptionFromElement(String iName) {
		ElementInfo lElement = mElementDataBase.get(iName);
		return lElement != null ? lElement.getDescription() : null;
	}
	
	public ImageResource getImageFromElement(String iName) {
		ElementInfo lElement = mElementDataBase.get(iName);
		return lElement != null ? lElement.getImageResource() : null; 
	}
	
	public void reset() {
		mElementDataBase.clear();
	}
	
	public void printDataBase() {
		for (Entry<String, ElementInfo> lSet : mElementDataBase.entrySet()) {
			StarWarsApp.ginjector.getTools().sendText(lSet.getKey() + " is in the database");
		}
	}

	public List<ElementInfo> fillFinder(String iElementToFind) {
		List<ElementInfo> lElementsFind = new ArrayList<ElementInfo>();
		
		for (String lElementName : mElementDataBase.keySet()) {
			if (iElementToFind.regionMatches(true, 0, lElementName, 0, Math.min(iElementToFind.length(), lElementName.length()))) {
				lElementsFind.add(mElementDataBase.get(lElementName));
			}
		}
		
		String[] lTabElementToFind = iElementToFind.split(" ");
		List<String> lListElementToFind = Arrays.asList(lTabElementToFind);
		
		for (String lWordToFind : lListElementToFind) {
			for (Entry<String, ElementInfo> lElementProspect : mElementDataBase.entrySet()) {
				for (String lKey : lElementProspect.getValue().getKeyWords()) {
					String[] lTabElementProspect = lKey.split(" ");
					List<String> lListElementProspect = Arrays.asList(lTabElementProspect);
	
					for (String lWordProspect : lListElementProspect) {
						if (lWordToFind.regionMatches(true, 0, lWordProspect, 0, Math.min(lWordToFind.length(), lWordProspect.length()))) {
							if (!lElementsFind.contains(mElementDataBase.get(lElementProspect.getKey()))) {
								lElementsFind.add(mElementDataBase.get(lElementProspect.getKey()));
							}
						}
					}
				}
			}
		}
		
		return lElementsFind;
	}
	
	public void fillDataBase(AppInfo iAppInfo, Map<String, Info> iMapTokenInfo, TypePortal iTypePortal) {
		for (SectionInfo lSection : iAppInfo.getSectionInfos()) {
			lSection.resetTag();
			lSection.setTag((iTypePortal == TypePortal.legends ? "!/Legends/" : "!/Classic/") + lSection.getTag());
			iMapTokenInfo.put(lSection.getTag(), lSection);
			recSectionFillDataBase(lSection, iMapTokenInfo, lSection.getTag());
		}
	}
	
	private void recSectionFillDataBase(SectionInfo iSectionInfo, Map<String, Info> iMapTokenInfo, String iPreviousName) {
		if (iSectionInfo.getSectionInfos().size() != 0) {
			for (SectionInfo lSection : iSectionInfo.getSectionInfos()) {
				lSection.resetTag();
				lSection.setTag(iPreviousName + "/" + lSection.getTag());
				iMapTokenInfo.put(lSection.getTag(), lSection);
				recSectionFillDataBase(lSection, iMapTokenInfo, lSection.getTag());
			}
		} else if (iSectionInfo.getElementInfos().size() != 0) {
			for (ElementInfo lElement : iSectionInfo.getElementInfos()) {
				if (lElement != null) {
					lElement.resetTag();
					lElement.setTag(iPreviousName + "/" + lElement.getTag());
					iMapTokenInfo.put(lElement.getTag(), lElement);
					mElementDataBase.put(lElement.getTitle(), lElement);
				}
			}
		}
	}
}