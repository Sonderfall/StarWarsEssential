package com.starwars.app.client.genealogy.visitor;

import com.starwars.app.client.genealogy.presenter.AGeneaNode;
import com.starwars.app.client.genealogy.presenter.BasicGeneaNode;
import com.starwars.app.client.genealogy.presenter.JediGeneaNode;

public class GeneaSetLevelVisitor implements IGenGeneaNodeVisitor {

	@Override
	public AGeneaNode<?> visit(BasicGeneaNode iNode) {
		return processSetLevel(iNode);
 }

	@Override
	public AGeneaNode<?> visit(JediGeneaNode iNode) {
		return processSetLevel(iNode);
	}
	
	@Override
	public AGeneaNode<?> visitGen(AGeneaNode<?> iNode) {
		if (iNode != null) {
			return iNode.accept(this);
		}
		return null;
	}
	
	private AGeneaNode<?> processSetLevel(AGeneaNode<?> iNode) {
		int lLevel = nodeLevel(iNode);;
		iNode.setLevel(lLevel);

		if (iNode.getSpouse() != null) {
			iNode.getSpouse().setLevel(lLevel);
		}

		if (iNode.getSons().size() != 0) {
			for (AGeneaNode<?> lSon : iNode.getSons()) {
				lSon.setLevel(lLevel + 1);
			}
		}

		visitGen(iNode.getMother());
		visitGen(iNode.getFather());
		return iNode;
	}
	
	/*private int level(AGeneaNode<?> iNode) {
		if (iNode == null) {
			return 0;
		} else {
			if (iNode.getSons().size() != 0) {
				int lMaxHeight = 0;
				for (AGeneaNode<?> lSon : iNode.getSons()) {
					lMaxHeight = Math.max(heightMax(lSon), lMaxHeight);
				}
				return lMaxHeight;
			} else {
				return 1 + Math.max(heightMax(iNode.getFather()), heightMax(iNode.getMother()));
			}
		}
	}*/
	
	private int nodeLevel(AGeneaNode<?> iNode) {
		if (iNode.getLevel() == 0) {
			if (iNode.getFather() != null && iNode.getFather().getLevel() != 0) {
				return iNode.getFather().getLevel() + 1;
			} else if (iNode.getMother() != null && iNode.getMother().getLevel() != 0) {
				return iNode.getMother().getLevel() + 1;
			}
			else if (iNode.getSons().size() != 0) { 
				return heightMax(iNode.getSons().get(0)) - 2;
			} else {
				return heightMax(iNode) - 1;
			}
		} else {
			return iNode.getLevel();
		}
	}
	
	private int heightMax(AGeneaNode<?> iNode) {
		if (iNode == null) {
			return 0;
		} else {	 
			return 1 + Math.max(heightMax(iNode.getFather()), heightMax(iNode.getMother()));
		}
	}
}

