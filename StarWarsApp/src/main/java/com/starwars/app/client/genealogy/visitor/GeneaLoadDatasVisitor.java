package com.starwars.app.client.genealogy.visitor;

import com.starwars.app.client.genealogy.presenter.AGeneaNode;
import com.starwars.app.client.genealogy.presenter.BasicGeneaNode;
import com.starwars.app.client.genealogy.presenter.JediGeneaNode;

public class GeneaLoadDatasVisitor implements IGenGeneaNodeVisitor {

	@Override
	public AGeneaNode<?> visit(BasicGeneaNode iNode) {
		return processLoadNode(iNode);
	}
	
	@Override
	public AGeneaNode<?> visit(JediGeneaNode iNode) {
		return processLoadNode(iNode);
	}
	
	@Override
	public AGeneaNode<?> visitGen(AGeneaNode<?> iNode) {
		if (iNode != null) {
			return iNode.accept(this);
		}
		return null;
	}
	
	private AGeneaNode<?> processLoadNode(AGeneaNode<?> iNode) {
		if (iNode != null) {
			iNode.getComponentElement().getInfo().loadDatas();
		}
		
		visitGen(iNode.getFather());
		visitGen(iNode.getMother());
		visitGen(iNode.getSpouse());
		visitGen(iNode.getAdoptedFather());
		visitGen(iNode.getAdoptedMother());
		
		return iNode;
	}
}
