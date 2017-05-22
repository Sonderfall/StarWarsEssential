package com.starwars.app.client.genealogy.presenter.impl;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.genealogy.presenter.AGeneaNode;
import com.starwars.app.client.genealogy.presenter.BasicGeneaNode;
import com.starwars.app.client.genealogy.visitor.IGenGeneaNodeVisitor;


public class BasicGeneaNodeImpl extends AGeneaNodeImpl<BasicGeneaNode.Display> implements
BasicGeneaNode {

	@Inject
	public BasicGeneaNodeImpl(final EventBus eventBus,
			final BasicGeneaNode.Display display) {
		super(eventBus, display);
	}

	@Override
	public void bind() {
		super.bind();
	}
	
	@Override
	public AGeneaNode<?> accept(IGenGeneaNodeVisitor iPNodeVisitor) {
		return iPNodeVisitor.visit(this);
	}
}
