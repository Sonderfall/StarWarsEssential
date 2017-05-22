package com.starwars.app.client.genealogy.visitor;

import com.starwars.app.client.genealogy.presenter.AGeneaNode;
import com.starwars.app.client.genealogy.presenter.BasicGeneaNode;
import com.starwars.app.client.genealogy.presenter.JediGeneaNode;

public class GeneaBindVisitor implements IGenGeneaNodeVisitor {

	@Override
	public AGeneaNode<?> visit(BasicGeneaNode iNode) {
		return processBindNode(iNode);
	}
	
	@Override
	public AGeneaNode<?> visit(JediGeneaNode iNode) {
		return processBindNode(iNode);
	}
	
	@Override
	public AGeneaNode<?> visitGen(AGeneaNode<?> iNode) {
		if (iNode != null) {
			return iNode.accept(this);
		}
		return null;
	}
	
	private AGeneaNode<?> processBindNode(AGeneaNode<?> iNode) {
		if (iNode != null && !iNode.getIsBind()) {
			iNode.bind();
		}
		
		visitGen(iNode.getFather());
		visitGen(iNode.getMother());
		visitGen(iNode.getSpouse());
		visitGen(iNode.getAdoptedFather());
		visitGen(iNode.getAdoptedMother());
		
		return iNode;
	}
}
