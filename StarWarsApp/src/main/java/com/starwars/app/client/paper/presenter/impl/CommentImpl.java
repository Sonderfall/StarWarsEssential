package com.starwars.app.client.paper.presenter.impl;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.mct.ASyncCall;
import com.starwars.app.client.paper.presenter.Comment;


public class CommentImpl extends BasePresenter<Comment.Display> implements
Comment {
	
	private CommentType mCommentType;
	private boolean mForcedShowContent;
	private ASyncCall<ClickEvent> mASyncCallClick;
	private ASyncCall<MouseOverEvent> mASyncCallMouseOver;
	private ASyncCall<MouseOutEvent> mASyncCallMouseOut;

	@Inject
	public CommentImpl(final EventBus eventBus,
			final Comment.Display display) {
		super(eventBus, display);
		init(CommentType.information, "Ceci est un commentaire d'information");
		display.hideContent();
		mForcedShowContent = false;
		mASyncCallClick = null;
		mASyncCallMouseOver = null;
		mASyncCallMouseOut = null;
	}

	@Override
	public void bind() {
		super.bind();
		
		registerHandler(display.getHasClickHandlers().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				doClick(event);
			}
		}));
		
		registerHandler(display.getHasMouseOverHandlers().addMouseOverHandler(new MouseOverHandler() {
			
			@Override
			public void onMouseOver(MouseOverEvent event) {
				doMouseOver(event);
			}
		}));
		
		registerHandler(display.getHasMouseOutHandlers().addMouseOutHandler(new MouseOutHandler() {
			
			@Override
			public void onMouseOut(MouseOutEvent event) {
				doMouseOut(event);
			}
		}));

	}

	@Override
	public void init(CommentType iCommentType, String iText) {
		mCommentType = iCommentType;
		display.setText(iText);
		switch (iCommentType) {
		case information:
			display.setType("Information");
			display.setIcon("A");
			display.setGrey();
			break;
		case error:
			display.setType("Faux");
			display.setIcon("B");
			display.setRed();
			break;
		case suggestion:
			display.setType("Suggestion");
			display.setIcon("C");
			display.setBlue();
			break;
		case detail:
			display.setType("Detail");
			display.setIcon("D");
			display.setGreen();
			break;
		case warning:
			display.setType("Justification insuffisante");
			display.setIcon("E");
			display.setOrange();
			break;

		default:
			break;
		}
		display.setFullHeight();
	}

	private void doClick(ClickEvent iClickEvent) {
		mForcedShowContent = !mForcedShowContent;
		if (mASyncCallClick != null) {
			mASyncCallClick.onSuccess(iClickEvent);
		}
	}
	
	private void doMouseOver(MouseOverEvent iMouseOverEvent) {
		if (mASyncCallMouseOver != null) {
			mASyncCallMouseOver.onSuccess(iMouseOverEvent);
		}
	}

	private void doMouseOut(MouseOutEvent iMouseOutEvent) {
		if (!mForcedShowContent) {
			if (mASyncCallMouseOut != null) {
				mASyncCallMouseOut.onSuccess(iMouseOutEvent);
			}
		}
	}

	public CommentType getCommentType() {
		return mCommentType;
	}

	public void setASyncCallClick(ASyncCall<ClickEvent> iASyncCallClick) {
		this.mASyncCallClick = iASyncCallClick;
	}

	public void setASyncCallMouseOver(ASyncCall<MouseOverEvent> iASyncCallMouseOver) {
		this.mASyncCallMouseOver = iASyncCallMouseOver;
	}

	public void setASyncCallMouseOut(ASyncCall<MouseOutEvent> iASyncCallMouseOut) {
		this.mASyncCallMouseOut = iASyncCallMouseOut;
	}

}
