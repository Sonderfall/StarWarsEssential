package com.starwars.app.client.genealogy.visitor;

import com.starwars.app.client.genealogy.presenter.AGeneaNode;
import com.starwars.app.client.genealogy.presenter.BasicGeneaNode;
import com.starwars.app.client.genealogy.presenter.JediGeneaNode;

public class GeneaAlignSonsVisitor implements IGenGeneaNodeVisitor {

	@Override
	public AGeneaNode<?> visit(BasicGeneaNode iNode) {
		return processGenAlignSons(iNode);
 }

	@Override
	public AGeneaNode<?> visit(JediGeneaNode iNode) {
		return processGenAlignSons(iNode);
	}
	
	@Override
	public AGeneaNode<?> visitGen(AGeneaNode<?> iNode) {
		if (iNode != null) {
			return iNode.accept(this);
		}
		return null;
	}
	
	private AGeneaNode<?> processGenAlignSons(AGeneaNode<?> iNode) {
		if (iNode.getIsVisited()) {
			
			int lLevel = nodeLevel(iNode);;
			int lX1 = 0;
			int lX2 = 0;
			
			if (iNode.getFather() == null && iNode.getMother() == null && iNode.getSons().size() == 0 && iNode.getIsAlignSon() && iNode.getSpouse() != null) {
				if (iNode.getSpouse() != null) {
					iNode.getGenealogy().getDisplay().addNode(iNode.getSpouse().getDisplay().asWidget());
					iNode.getSpouse().getDisplay().setLeft(currentLeft(iNode) - 230);
					iNode.getSpouse().getDisplay().setTop(lLevel * 75);
					iNode.getSpouse().setLevel(lLevel);
					iNode.getSpouse().setIsVisited(false);
				}
			} else if ((iNode.getFather() != null && iNode.getMother() != null && iNode.getSons().size() == 0) || iNode.getIsAlignSon()) {
				int lMinLeftParent = Math.min(currentLeft(iNode.getFather()), currentLeft(iNode.getMother()));
				int lMaxLeftParent = Math.max(currentLeft(iNode.getFather()), currentLeft(iNode.getMother()));
				int lDistanceBetweenParents = lMaxLeftParent - lMinLeftParent + 200;
				
				if (iNode.getFather().getSons().size() != 1) {
					lX1 = lMinLeftParent - iNode.getFather().getSons().size() * 100 + lDistanceBetweenParents / (iNode.getFather().getSons().size()) + 300 * (iNode.getFather().getSons().indexOf(iNode)) - 45;
				} else {
					lX1 = lMinLeftParent + lDistanceBetweenParents / 2 - 100;
				}

				lX1 += iNode.getHardCodeLeftAcc();
				lX2 = lX1 + 200;
				if (iNode.getIsAlignSon()) {
					while (iNode.getGenealogy().existingNodeCoordonates(lLevel, lX1, lX2) != null) {
						lX1 += 150;
						lX2 += 150;
					}
				}
				
				lX1 += iNode.getHardCodeLeftAcc();
				
				if (iNode.getSons().size() != 0) {
					if (Math.max(currentLeft(iNode.getSons().get(0).getFather()), currentLeft(iNode.getSons().get(0).getMother())) == currentLeft(iNode) && iNode.getSons().get(0).getFather() == iNode) {
						iNode.getSons().get(0).getMother().getDisplay().setLeft(lX1 - 350);
						iNode.getGenealogy().removeNodeCoordonates(iNode.getSons().get(0).getMother());
						iNode.getGenealogy().addNodeCoordonates(iNode.getSons().get(0).getMother(), nodeLevel(iNode.getSons().get(0).getMother()), lX1 - 350, lX1 - 350 + 200);
						iNode.getSons().get(0).getMother().setLevel(nodeLevel(iNode.getSons().get(0).getMother()));
						iNode.setLevel(lLevel);
					} else if (Math.max(currentLeft(iNode.getSons().get(0).getFather()), currentLeft(iNode.getSons().get(0).getMother())) == currentLeft(iNode) && iNode.getSons().get(0).getMother() == iNode) {
						iNode.getSons().get(0).getFather().getDisplay().setLeft(lX1 - 350);
						iNode.getGenealogy().removeNodeCoordonates(iNode.getSons().get(0).getFather());
						iNode.getGenealogy().addNodeCoordonates(iNode.getSons().get(0).getFather(), nodeLevel(iNode.getSons().get(0).getFather()), lX1 - 350, lX1 - 350 + 200);
						iNode.getSons().get(0).getFather().setLevel(nodeLevel(iNode.getSons().get(0).getFather()));
						iNode.setLevel(lLevel);
					}  else if (Math.min(currentLeft(iNode.getSons().get(0).getFather()), currentLeft(iNode.getSons().get(0).getMother())) == currentLeft(iNode) && iNode.getSons().get(0).getFather() == iNode) {
						iNode.getSons().get(0).getMother().getDisplay().setLeft(lX1 + 275);
						iNode.getGenealogy().removeNodeCoordonates(iNode.getSons().get(0).getMother());
						iNode.getGenealogy().addNodeCoordonates(iNode.getSons().get(0).getMother(), nodeLevel(iNode.getSons().get(0).getMother()), lX1 + 275, lX1 + 275 + 200);
						iNode.getSons().get(0).getMother().setLevel(nodeLevel(iNode.getSons().get(0).getMother()));
					} else if (Math.min(currentLeft(iNode.getSons().get(0).getFather()), currentLeft(iNode.getSons().get(0).getMother())) == currentLeft(iNode) && iNode.getSons().get(0).getMother() == iNode) {
						iNode.getSons().get(0).getFather().getDisplay().setLeft(lX1 + 275);
						iNode.getGenealogy().removeNodeCoordonates(iNode.getSons().get(0).getFather());
						iNode.getGenealogy().addNodeCoordonates(iNode.getSons().get(0).getFather(), nodeLevel(iNode.getSons().get(0).getFather()), lX1 + 275, lX1 + 275 + 200);
						iNode.getSons().get(0).getFather().setLevel(nodeLevel(iNode.getSons().get(0).getFather()));
					}
					
					if (iNode.getSons().get(0).getMother().getSpouse() != null && iNode.getSons().get(0).getFather() == iNode) {
						iNode.getGenealogy().getDisplay().addNode(iNode.getSons().get(0).getMother().getSpouse().getDisplay().asWidget());
						iNode.getSons().get(0).getMother().getSpouse().getDisplay().setLeft(lX1 + 520);
						iNode.getSons().get(0).getMother().getSpouse().getDisplay().setTop(lLevel * 75);
						iNode.getSons().get(0).getMother().getSpouse().setLevel(lLevel);
						iNode.getSons().get(0).getMother().getSpouse().setIsVisited(false);
						iNode.getGenealogy().removeNodeCoordonates(iNode.getSons().get(0).getMother().getSpouse());
						iNode.getGenealogy().addNodeCoordonates(iNode.getSons().get(0).getMother().getSpouse(), lLevel, lX1 + 240, lX2 + 240);
					}
				}
				iNode.getDisplay().setLeft(lX1);
				iNode.getGenealogy().removeNodeCoordonates(iNode);
				iNode.getGenealogy().addNodeCoordonates(iNode, lLevel, lX1, lX2);
				iNode.setLevel(lLevel);
				
				if (iNode.getSpouse() != null) {
					iNode.getGenealogy().getDisplay().addNode(iNode.getSpouse().getDisplay().asWidget());
					iNode.getSpouse().getDisplay().setLeft(lX1 - 230);
					iNode.getSpouse().getDisplay().setTop(lLevel * 75);
					iNode.getSpouse().setLevel(lLevel);
					iNode.getSpouse().setIsVisited(false);
				}
			}
			iNode.setIsVisited(false);
		}
		visitGen(iNode.getMother());
		visitGen(iNode.getFather());
		return iNode;
	}
	
	private int currentLeft(AGeneaNode<?> iNode) {
		return ((com.starwars.app.client.genealogy.presenter.AGeneaNode.Display) iNode.getDisplay()).getLeft();
	}

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

