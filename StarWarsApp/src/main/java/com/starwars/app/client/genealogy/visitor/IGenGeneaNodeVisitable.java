package com.starwars.app.client.genealogy.visitor;

import com.starwars.app.client.genealogy.presenter.AGeneaNode;

public interface IGenGeneaNodeVisitable {
	AGeneaNode<?> accept(IGenGeneaNodeVisitor iPNodeVisitor);
}
