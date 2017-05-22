package com.starwars.app.client.resources;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.TextResource;
import com.starwars.app.client.mct.ASyncCall;
import com.starwars.app.client.resources.imagefour.StarWarsMethodResourcesImageFour;
import com.starwars.app.client.resources.imageone.StarWarsMethodResourcesImageOne;
import com.starwars.app.client.resources.imagethree.StarWarsMethodResourcesImageThree;
import com.starwars.app.client.resources.imagetwo.StarWarsMethodResourcesImageTwo;
import com.starwars.app.client.resources.textfour.StarWarsMethodResourcesTextFour;
import com.starwars.app.client.resources.textone.StarWarsMethodResourcesTextOne;
import com.starwars.app.client.resources.textthree.StarWarsMethodResourcesTextThree;
import com.starwars.app.client.resources.texttwo.StarWarsMethodResourcesTextTwo;

public class StarWarsMethodResources {
	
	public static void callMethodImage(final ASyncCall<ImageResource> iASyncCall, String iName) {
			if (!StarWarsMethodResourcesImageOne.callMethodImage(iASyncCall, iName))
				if (!StarWarsMethodResourcesImageTwo.callMethodImage(iASyncCall, iName))
					if (!StarWarsMethodResourcesImageThree.callMethodImage(iASyncCall, iName))
						StarWarsMethodResourcesImageFour.callMethodImage(iASyncCall, iName);
	}
	

	public static void callMethodText(final ASyncCall<TextResource> iASyncCall, String iName) {
			if (!StarWarsMethodResourcesTextOne.callMethodText(iASyncCall, iName))
				if (!StarWarsMethodResourcesTextTwo.callMethodText(iASyncCall, iName))
					if (!StarWarsMethodResourcesTextThree.callMethodText(iASyncCall, iName))
						StarWarsMethodResourcesTextFour.callMethodText(iASyncCall, iName);
	}
}