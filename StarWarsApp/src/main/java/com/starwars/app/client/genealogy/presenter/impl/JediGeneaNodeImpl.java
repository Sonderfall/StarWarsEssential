package com.starwars.app.client.genealogy.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.genealogy.presenter.AGeneaNode;
import com.starwars.app.client.genealogy.presenter.JediGeneaNode;
import com.starwars.app.client.genealogy.visitor.IGenGeneaNodeVisitor;


public class JediGeneaNodeImpl extends AGeneaNodeImpl<JediGeneaNode.Display> implements
JediGeneaNode {

	private boolean mIndirectApprentice;
	
	@Inject
	public JediGeneaNodeImpl(final EventBus eventBus,
			final JediGeneaNode.Display display) {
		super(eventBus, display);
		mIndirectApprentice = false;
	}

	@Override
	public void bind() {
		super.bind();
	}

	public boolean isIndirectApprentice() {
		return mIndirectApprentice;
	}
	
	public void setIndirectApprentice(boolean iIndirectApprentice) {
		mIndirectApprentice = iIndirectApprentice;
	}
	
	@Override
	public AGeneaNode<?> accept(IGenGeneaNodeVisitor iPNodeVisitor) {
		return iPNodeVisitor.visit(this);
	}
}
