package com.starwars.app.client.genealogy.visitor;

import com.starwars.app.client.genealogy.presenter.AGeneaNode;
import com.starwars.app.client.genealogy.presenter.BasicGeneaNode;
import com.starwars.app.client.genealogy.presenter.GenealogyModule;
import com.starwars.app.client.genealogy.presenter.JediGeneaNode;

public class GeneaDrawNodeVisitor implements IGenGeneaNodeVisitor {

	private GenealogyModule mGenealogy;
	
	public void init(GenealogyModule iGenealogy) {
		mGenealogy = iGenealogy;
	}
	
	@Override
	public AGeneaNode<?> visit(BasicGeneaNode iNode) {
		return processDrawNode(iNode);
	}
	
	@Override
	public AGeneaNode<?> visit(JediGeneaNode iNode) {
		return processDrawNode(iNode);
	}
	
	@Override
	public AGeneaNode<?> visitGen(AGeneaNode<?> iNode) {
		if (iNode != null) {
			return iNode.accept(this);
		}
		return null;
	}
	
	private AGeneaNode<?> processDrawNode(AGeneaNode<?> iNode) {
		if (iNode != null) {
			iNode.draw();
			mGenealogy.getDisplay().addNode(iNode.getDisplay().asWidget());
			iNode.setGenealogy(mGenealogy);
		}
		
		visitGen(iNode.getFather());
		visitGen(iNode.getMother());
		visitGen(iNode.getSpouse());
		visitGen(iNode.getAdoptedFather());
		visitGen(iNode.getAdoptedMother());
		
		return iNode;
	}
}
