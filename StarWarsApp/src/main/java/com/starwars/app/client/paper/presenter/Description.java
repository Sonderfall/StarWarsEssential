package com.starwars.app.client.paper.presenter;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.presenter.Presenter;
import com.starwars.app.shared.ComponentElement;

public interface Description extends Presenter<Description.Display> {

	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		void setText(String iText);
		void setTitle(String iTitle);
		void setImage(ImageResource iImage);
		void setHyperLink(Widget iWidget);
		void addItem(Widget iWidget);
		void addLine();
		
		void setGreen();
		void setOrange();
		void setPurple();
		void setBlue();
		void setDarkBlue();
	    void setDarkYellow();
	    void setYellow();
	    void setRed();
	    void setMediumPurple();
	    void setMediumGreen();
	    void setMediumGreen2();
	    void setMediumOrange();
	    void setKaki();
	    void setFlesh();
	    void setPink();
		
		void clearAll();
		
		void hide();
		void show();
	}
	void draw();
	void init(ComponentElement iComponentElement);
}
