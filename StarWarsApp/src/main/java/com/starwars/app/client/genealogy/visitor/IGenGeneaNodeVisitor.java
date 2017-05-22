package com.starwars.app.client.genealogy.visitor;

import com.starwars.app.client.genealogy.presenter.AGeneaNode;
import com.starwars.app.client.genealogy.presenter.BasicGeneaNode;
import com.starwars.app.client.genealogy.presenter.JediGeneaNode;

public interface IGenGeneaNodeVisitor {
	 AGeneaNode<?> visit(BasicGeneaNode iNode);
	 AGeneaNode<?> visit(JediGeneaNode iNode);
	 AGeneaNode<?> visitGen(AGeneaNode<?> iNode);
}
