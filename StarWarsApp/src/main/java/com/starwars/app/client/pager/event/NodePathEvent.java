package com.starwars.app.client.pager.event;

import com.starwars.app.client.abs.presenter.AEvent;
import com.starwars.app.client.main.event.PortalClickEvent.TypePortal;
import com.starwars.app.shared.Info;


public class NodePathEvent extends AEvent<NodePathHandler> {

	public static enum NodePathType {
		home,
		replace
	}
	
	private static Type<NodePathHandler> TYPE;
	private final NodePathType mNodePathType;
	private TypePortal mTypePortal;
	private Info mInfo;
	private boolean mRealChange;

	public static Type<NodePathHandler> getType() {
		return TYPE != null ? TYPE : (TYPE = new Type<NodePathHandler>());
	}

	public NodePathEvent(NodePathType iNodePathType) {
		mNodePathType = iNodePathType;
		mRealChange = true;
	}

	@Override
	public final Type<NodePathHandler> getAssociatedType() {
		return getType();
	}

	@Override
	protected void dispatch(NodePathHandler handler) {
		handler.onNodePath(this);
	}

	public NodePathType getNodePathType() {
		return mNodePathType;
	}

	public void setTypePortal(TypePortal iPortal) {
		mTypePortal = iPortal;
	}
	
	public TypePortal getTypePortal() {
		return mTypePortal;
	}
	
	public Info getInfo() {
		return mInfo;
	}

	public void setInfo(Info iInfo) {
		this.mInfo = iInfo;
	}

	public boolean isRealChange() {
		return mRealChange;
	}
	
	public void setRealChange(boolean iRealChange) {
		mRealChange = iRealChange;
	}

}
