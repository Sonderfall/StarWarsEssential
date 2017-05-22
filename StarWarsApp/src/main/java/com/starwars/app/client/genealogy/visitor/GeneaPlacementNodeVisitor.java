package com.starwars.app.client.genealogy.visitor;

import com.starwars.app.client.genealogy.presenter.AGeneaNode;
import com.starwars.app.client.genealogy.presenter.BasicGeneaNode;
import com.starwars.app.client.genealogy.presenter.JediGeneaNode;

public class GeneaPlacementNodeVisitor implements IGenGeneaNodeVisitor {

	@Override
	public AGeneaNode<?> visit(BasicGeneaNode iNode) {
		return processPlacementNode(iNode);
	}

	@Override
	public AGeneaNode<?> visit(JediGeneaNode iNode) {
		return processPlacementNode(iNode);
	}
	
	@Override
	public AGeneaNode<?> visitGen(AGeneaNode<?> iNode) {
		if (iNode != null) {
			return iNode.accept(this);
		}
		return null;
	}
	
	private AGeneaNode<?> processPlacementNode(AGeneaNode<?> iNode) {
		if (!iNode.getIsVisited()) {
			int lWidthSons = 0;
			int lWidthBrothers = 0;
			int lLevelChart = 75;
			int lLevel = 0;
			int lX1 = 0;
			int lX2 = 0;
			AGeneaNode<?> lParent = null;
			
			if (iNode.getFather() != null) {
				lParent = iNode.getFather();
			} else if (iNode.getMother() != null) {
				lParent = iNode.getMother();
			}

			lLevel = nodeLevel(iNode);
			
			for (int i = 0; i < iNode.getSons().size(); ++i) {
				AGeneaNode<?> lNode = iNode.getSons().get(i);
				if (i < iNode.getSons().size() - 1) {
					lWidthSons += lNode.getDisplay().getWidth() + 100;
				} else {
					lWidthSons += lNode.getDisplay().getWidth();
				}
			}

			if (lParent != null && (lParent.getFather() != null || lParent.getMother() != null)) {
				AGeneaNode<?> lGrandParentNode = null;

				if (lParent.getFather() != null) {
					lGrandParentNode = lParent.getFather();
				} else if (lParent.getMother() != null) {
					lGrandParentNode = lParent.getMother();
				}

				if (lGrandParentNode != null) {
					for (AGeneaNode<?> lParentNode : lGrandParentNode.getSons()) {
						for (AGeneaNode<?> lCousinNode : lParentNode.getSons()) {
							if (lCousinNode == iNode) {
								if (iNode.getSons().size() != 0 && iNode.getSons().get(0).getFather() == iNode && iNode.getSons().get(0).getMother() != null) {
									lX1 = (Math.max(lWidthBrothers, lGrandParentNode.getSons().indexOf(lParent)) + 1) * 300;
								} else if (iNode.getSons().size() != 0 && iNode.getSons().get(0).getMother() == iNode && iNode.getSons().get(0).getFather() != null) {
									lX1 = (Math.max(lWidthBrothers, lGrandParentNode.getSons().indexOf(lParent)) - 1) * 300;
								} else {
									lX1 = (Math.max(lWidthBrothers, lGrandParentNode.getSons().indexOf(lParent))) * 300;
								}
								break;
							} else {
								++lWidthBrothers;
							}
							
							if (lCousinNode.getSons().size() != 0 && lCousinNode.getSons().get(0).getFather() != null && lCousinNode.getSons().get(0).getMother() != null) {
								++lWidthBrothers;
							}
						}
					}
				}
			} else if (lParent != null) {
				for (int i = 0; i < lParent.getSons().size(); ++i) {
					AGeneaNode<?> lNode = lParent.getSons().get(i);
					if (lNode == iNode) {
						if (i != 0 && lParent.getSons().get(i - 1).getSons().size() != 0) {
							if (iNode.getSons().size() == 0) {
								lX1 = currentLeft(lParent.getSons().get(i - 1)) + 300;
							} else {
								if (iNode.getSons().get(0).getFather() == iNode) {
									lX1 = lParent.getSons().get(i - 1).getSons().size() * 300 + lWidthSons / 2 + 375;
								} else if (iNode.getSons().get(0).getMother() == iNode) {
									lX1 = lParent.getSons().get(i - 1).getSons().size() * 300 + lWidthSons / 2 - 275;
								}
							}
						} else {
							if (iNode.getSons().size() == 0) {
								lX1 = i * 300;
							} else {
								if (iNode.getSons().get(0).getFather() == iNode) {
									if (iNode.getSons().get(0).getMother() != null && (iNode.getSons().get(0).getMother().getMother() != null || iNode.getSons().get(0).getMother().getFather() != null)) {
										lX1 = lWidthSons / 2 + 175;
									} else {
										lX1 = lWidthSons / 2 + 75;
									}
								} else if (iNode.getSons().get(0).getMother() == iNode) {
									lX1 = currentLeft(iNode.getSons().get(0)) + lWidthSons / 2 - 275;
								}
							}
						}
					}	
				}
			} else if (lParent == null) {
				 
				if (iNode.getSons().size() != 0) {
					
					if (iNode.getSons().get(0).getFather() == iNode) {
						if (iNode.getSons().get(0).getMother() != null && (iNode.getSons().get(0).getMother().getMother() != null || iNode.getSons().get(0).getMother().getFather() != null)) {
							lX1 = currentLeft(iNode.getSons().get(0)) + lWidthSons / 2 + 75;
						} else if (iNode.getSons().get(0).getMother() == null) {
							lX1 = currentLeft(iNode.getSons().get(0));
						}
						else {
							lX1 = currentLeft(iNode.getSons().get(0)) + lWidthSons / 2 - 275;
						}
					} else if (iNode.getSons().get(0).getMother() == iNode) {
						if (iNode.getSons().get(0).getFather() != null && (iNode.getSons().get(0).getFather().getMother() != null || iNode.getSons().get(0).getFather().getFather() != null)) {
							lX1 = currentLeft(iNode.getSons().get(0)) + lWidthSons / 2 - 275;
						} else if (iNode.getSons().get(0).getFather() == null) {
							lX1 = currentLeft(iNode.getSons().get(0));
						} else {
							lX1 = currentLeft(iNode.getSons().get(0)) + lWidthSons / 2 + 75;
						}
					}
				}
			}

			lX1 += iNode.getHardCodeLeftAcc();
			lX2 = lX1 + 200;
			while (iNode.getGenealogy().existingNodeCoordonates(lLevel, lX1, lX2) != null) {
				lX1 += 150;
				lX2 += 150;
			}
			
			iNode.getDisplay().setLeft(lX1);
			iNode.getDisplay().setTop(lLevel * lLevelChart);
			iNode.getGenealogy().addNodeCoordonates(iNode, lLevel, lX1, lX2);
			iNode.setLevel(lLevel);
			iNode.setIsVisited(true);
			
			if (iNode.getSpouse() != null && iNode.getSons().size() != 0)  {
				iNode.getGenealogy().getDisplay().addNode(iNode.getSpouse().getDisplay().asWidget());
				iNode.getSpouse().getDisplay().setLeft(lX1 + 240);
				iNode.getSpouse().getDisplay().setTop(lLevel * 75);
				iNode.getSpouse().setLevel(lLevel);
				iNode.getSpouse().setIsVisited(true);
				iNode.getGenealogy().addNodeCoordonates(iNode.getSpouse(), lLevel, lX1 + 240, lX2 + 240);
			}
		}
		
		if (iNode.getInverseVisitedParent()) {
			visitGen(iNode.getMother());
			visitGen(iNode.getFather());
		} else {
			visitGen(iNode.getFather());
			visitGen(iNode.getMother());
		}
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
