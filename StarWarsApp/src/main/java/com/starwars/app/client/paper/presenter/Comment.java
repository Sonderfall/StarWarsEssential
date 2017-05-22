package com.starwars.app.client.paper.presenter;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.HasMouseOutHandlers;
import com.google.gwt.event.dom.client.HasMouseOverHandlers;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.abs.presenter.Presenter;
import com.starwars.app.client.mct.ASyncCall;


public interface Comment extends Presenter<Comment.Display> {

	public static enum CommentType {
		information,
		error,
		suggestion,
		detail,
		warning
	}
	
	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
		HasClickHandlers getHasClickHandlers();
		HasMouseOverHandlers getHasMouseOverHandlers();
		HasMouseOutHandlers getHasMouseOutHandlers();
		void setType(String iType);
		void setIcon(String iIcon);
		void setText(String iText);
		void setOther(Widget iWidget);
		void setGrey();
		void setRed();
		void setBlue();
		void setGreen();
		void setOrange();
		void showContent();
		void hideContent();
		int getOffsetTop();
		int getFullHeight();
		void setFullHeight();
	}
	
	void init(CommentType iCommentType, String iText);
	CommentType getCommentType();
	void setASyncCallClick(ASyncCall<ClickEvent> iASyncCallClick);
	void setASyncCallMouseOver(ASyncCall<MouseOverEvent> iASyncCallMouseOver);
	void setASyncCallMouseOut(ASyncCall<MouseOutEvent> iASyncCallMouseOut);
	
}
