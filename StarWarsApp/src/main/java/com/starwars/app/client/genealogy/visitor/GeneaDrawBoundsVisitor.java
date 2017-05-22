package com.starwars.app.client.genealogy.visitor;

import com.starwars.app.client.StarWarsApp;
import com.starwars.app.client.genealogy.presenter.AGeneaNode;
import com.starwars.app.client.genealogy.presenter.BasicGeneaNode;
import com.starwars.app.client.genealogy.presenter.GeneaLine;
import com.starwars.app.client.genealogy.presenter.GenealogyModule;
import com.starwars.app.client.genealogy.presenter.JediGeneaNode;

public class GeneaDrawBoundsVisitor implements IGenGeneaNodeVisitor {

	private GenealogyModule mGenealogy;
	
	public void init(GenealogyModule iGenealogy) {
		mGenealogy = iGenealogy;
	}
	
	@Override
	public AGeneaNode<?> visit(BasicGeneaNode iNode) {
		if (!iNode.getIsVisited()) {
			if (iNode.getAdoptedFather() != null && iNode.getAdoptedMother() != null) {
				GeneaLine lLineFromNode = StarWarsApp.ginjector.getGeneaLine();
				mGenealogy.getDisplay().addBound(lLineFromNode.getDisplay().asWidget());
				lLineFromNode.getDisplay().setVerticaleDashed();
				lLineFromNode.getDisplay().setTop(currentTop(iNode) - 12);
				lLineFromNode.getDisplay().setHeight(12);
				
				int lMinLeftAdoptedParents = Math.min(currentLeft(iNode.getAdoptedFather()), currentLeft(iNode.getAdoptedMother()));
				int lMaxLeftAdoptedParents = Math.max(currentLeft(iNode.getAdoptedFather()), currentLeft(iNode.getAdoptedMother()));
				int lDistanceBetweenParents = lMaxLeftAdoptedParents - lMinLeftAdoptedParents;
				int lX1 = currentLeft(iNode);
				
				GeneaLine lLineHoriToParents = StarWarsApp.ginjector.getGeneaLine();
				mGenealogy.getDisplay().addBound(lLineHoriToParents.getDisplay().asWidget());
				lLineHoriToParents.getDisplay().setHorizontaleDashed();
				lLineHoriToParents.getDisplay().setTop(currentTop(iNode) - 12);
				
				if (currentLeft(iNode) < lMinLeftAdoptedParents + 100) {
					lLineFromNode.getDisplay().setLeft(lX1 + 150);
					lLineHoriToParents.getDisplay().setWidth(Math.max(lMinLeftAdoptedParents + lDistanceBetweenParents / 2, lX1) - Math.min(lMinLeftAdoptedParents + lDistanceBetweenParents / 2, lX1) - 50);
					lLineHoriToParents.getDisplay().setLeft(Math.min(lX1 + 100, lMinLeftAdoptedParents + 100 + lDistanceBetweenParents / 2) + 50);
				} else {
					lLineFromNode.getDisplay().setLeft(lX1 + 50);
					lLineHoriToParents.getDisplay().setWidth(Math.max(lMinLeftAdoptedParents + lDistanceBetweenParents / 2, lX1) - Math.min(lMinLeftAdoptedParents + lDistanceBetweenParents / 2, lX1) - 50);
					lLineHoriToParents.getDisplay().setLeft(Math.min(lX1 + 100, lMinLeftAdoptedParents + 100 + lDistanceBetweenParents / 2));
				}
				
				GeneaLine lLineHoriToPartner = StarWarsApp.ginjector.getGeneaLine();
				mGenealogy.getDisplay().addBound(lLineHoriToPartner.getDisplay().asWidget());
				lLineHoriToPartner.getDisplay().setHorizontaleDashed();
				lLineHoriToPartner.getDisplay().setTop(currentTop(iNode.getAdoptedFather()) + 12);
				lLineHoriToPartner.getDisplay().setWidth(lDistanceBetweenParents - 200);
				lLineHoriToPartner.getDisplay().setLeft(lMinLeftAdoptedParents + 200);
				
				GeneaLine lLineVertiToSon = StarWarsApp.ginjector.getGeneaLine();
				mGenealogy.getDisplay().addBound(lLineVertiToSon.getDisplay().asWidget());
				lLineVertiToSon.getDisplay().setVerticaleDashed();
				lLineVertiToSon.getDisplay().setTop(currentTop(iNode.getAdoptedFather()) + 12);
				lLineVertiToSon.getDisplay().setHeight(52);
				lLineVertiToSon.getDisplay().setLeft(lMinLeftAdoptedParents + lDistanceBetweenParents / 2 + 100);
				
			}
			
			if (iNode.getSons().size() != 0 && iNode.getSons().get(0).getMother() != null && iNode.getSons().get(0).getFather() != null) {
				int lMinLeftParent = Math.min(currentLeft(iNode.getSons().get(0).getFather()), currentLeft(iNode.getSons().get(0).getMother()));
				int lMaxLeftParent = Math.max(currentLeft(iNode.getSons().get(0).getFather()), currentLeft(iNode.getSons().get(0).getMother()));
				int lDistanceBetweenParents = lMaxLeftParent - lMinLeftParent;
				int lOverRidingNodes = 0;
				
				GeneaLine lLineToPartner = StarWarsApp.ginjector.getGeneaLine();
				mGenealogy.getDisplay().addBound(lLineToPartner.getDisplay().asWidget());
				lLineToPartner.getDisplay().setHorizontale();
				lLineToPartner.getDisplay().setTop(currentTop(iNode) + 12);
				lLineToPartner.getDisplay().setWidth(lDistanceBetweenParents - 200);
				lLineToPartner.getDisplay().setLeft(lMinLeftParent + 200);

				for (AGeneaNode<?> lSon : iNode.getSons()) {
					int lSonX1 = currentLeft(lSon);
					AGeneaNode<?> lNode = mGenealogy.existingNodeCoordonates(lSon.getLevel(), Math.min(lMinLeftParent + lDistanceBetweenParents / 2 + 100, lSonX1 + 100), Math.max(lMinLeftParent + lDistanceBetweenParents / 2 + 100, lSonX1 + 100));
						
					if (lNode != null && iNode.getSons().contains(lNode) == false) {
						++lOverRidingNodes;
					}
				}

				GeneaLine lLineToSon = StarWarsApp.ginjector.getGeneaLine();
				mGenealogy.getDisplay().addBound(lLineToSon.getDisplay().asWidget());
				lLineToSon.getDisplay().setVerticale();
				lLineToSon.getDisplay().setLeft(lMinLeftParent + 100 + lDistanceBetweenParents / 2);
				lLineToSon.getDisplay().setTop(currentTop(iNode) + 15);
				
				for (AGeneaNode<?> lSon : iNode.getSons()) {
					
					if ((iNode.getSons().size() > 1 && (((iNode.getSons().get(0).getFather() != iNode.getSons().get(1).getFather()) || (iNode.getSons().get(0).getMother() != iNode.getSons().get(1).getMother())))
							|| (iNode.getSons().size() > 2 && (((iNode.getSons().get(1).getFather() != iNode.getSons().get(2).getFather()) || (iNode.getSons().get(1).getMother() != iNode.getSons().get(2).getMother())))))) {
						// Parent with many patners
					} else {
						GeneaLine lLineToOneSonShift = StarWarsApp.ginjector.getGeneaLine();
						mGenealogy.getDisplay().addBound(lLineToOneSonShift.getDisplay().asWidget());
						lLineToOneSonShift.getDisplay().setHorizontale();
						lLineToOneSonShift.getDisplay().setLeft(Math.min(currentLeft(lSon) + 100, lMinLeftParent + 100 + lDistanceBetweenParents / 2));
						lLineToOneSonShift.getDisplay().setWidth(Math.max(lMinLeftParent + lDistanceBetweenParents / 2, currentLeft(lSon)) - Math.min(lMinLeftParent + lDistanceBetweenParents / 2, currentLeft(lSon)) + 3);
	
						GeneaLine lLineToParents = StarWarsApp.ginjector.getGeneaLine();
						mGenealogy.getDisplay().addBound(lLineToParents.getDisplay().asWidget());
						lLineToParents.getDisplay().setVerticale();
						lLineToParents.getDisplay().setLeft(currentLeft(lSon) + 100);
						
						if (lOverRidingNodes == 1) {
							lLineToOneSonShift.getDisplay().setTop(currentTop(iNode) + 60);
							lLineToSon.getDisplay().setHeight(45);
							lLineToParents.getDisplay().setTop(currentTop(lSon) - 15);
							lLineToParents.getDisplay().setHeight(15);
						} else {
							lLineToOneSonShift.getDisplay().setTop(currentTop(iNode) + 52);
							lLineToSon.getDisplay().setHeight(40);
							lLineToParents.getDisplay().setTop(currentTop(lSon) - 20);
							lLineToParents.getDisplay().setHeight(20);					
						}
					}
				}
			} else if (iNode.getSons().size() != 0 && (iNode.getSons().get(0).getMother() == null || iNode.getSons().get(0).getFather() == null)) {
				int lLeftParent = currentLeft(iNode);
				
				GeneaLine lLineToSon = StarWarsApp.ginjector.getGeneaLine();
				mGenealogy.getDisplay().addBound(lLineToSon.getDisplay().asWidget());
				lLineToSon.getDisplay().setVerticale();
				lLineToSon.getDisplay().setLeft(lLeftParent + 100);
				lLineToSon.getDisplay().setTop(currentTop(iNode) + 27);
				lLineToSon.getDisplay().setHeight(29);
				
				for (AGeneaNode<?> lSon : iNode.getSons()) {
					GeneaLine lLineToParents = StarWarsApp.ginjector.getGeneaLine();
					mGenealogy.getDisplay().addBound(lLineToParents.getDisplay().asWidget());
					lLineToParents.getDisplay().setVerticale();
					lLineToParents.getDisplay().setLeft(currentLeft(lSon) + 100);
					lLineToParents.getDisplay().setTop(currentTop(lSon) - 20);
					lLineToParents.getDisplay().setHeight(20);
					
					GeneaLine lLineToOneSonShift = StarWarsApp.ginjector.getGeneaLine();
					mGenealogy.getDisplay().addBound(lLineToOneSonShift.getDisplay().asWidget());
					lLineToOneSonShift.getDisplay().setHorizontale();
					lLineToOneSonShift.getDisplay().setLeft(Math.min(currentLeft(lSon) + 100, currentLeft(iNode) + 100));
					lLineToOneSonShift.getDisplay().setWidth(Math.max(currentLeft(iNode), currentLeft(lSon)) - Math.min(currentLeft(iNode), currentLeft(lSon)) + 3);
					lLineToOneSonShift.getDisplay().setTop(currentTop(iNode) + 53);
				}
			}
			
			if (iNode.getSpouse() != null) {
				GeneaLine lLineToPartner = StarWarsApp.ginjector.getGeneaLine();
				mGenealogy.getDisplay().addBound(lLineToPartner.getDisplay().asWidget());
				lLineToPartner.getDisplay().setHorizontale();
				lLineToPartner.getDisplay().setTop(currentTop(iNode) + 12);
				lLineToPartner.getDisplay().setWidth(50);
				lLineToPartner.getDisplay().setLeft(Math.min(currentLeft(iNode.getSpouse()), currentLeft(iNode)) + 200);
			}
			
			iNode.setIsVisited(true);
		}
		
		visitGen(iNode.getFather());
		visitGen(iNode.getMother());
		return iNode;
	}
	
	@Override
	public AGeneaNode<?> visit(JediGeneaNode iNode) {
		if (!iNode.getIsVisited()) {
			if (iNode.getSons().size() != 0) {
				int lLeftParent = currentLeft(iNode);
				GeneaLine lLineToSon = StarWarsApp.ginjector.getGeneaLine();
				mGenealogy.getDisplay().addBound(lLineToSon.getDisplay().asWidget());
				lLineToSon.getDisplay().setVerticale();
				lLineToSon.getDisplay().setLeft(lLeftParent + 100);
				lLineToSon.getDisplay().setTop(currentTop(iNode) + 27);
				lLineToSon.getDisplay().setHeight(29);
				
				//
//				int lMinLeftParent = Math.min(currentLeft(iNode.getSons().get(0).getFather() != null ? iNode.getSons().get(0).getFather() : iNode), currentLeft(iNode.getSons().get(0).getMother() != null ? iNode.getSons().get(0).getMother() : iNode));
//				int lMaxLeftParent = Math.max(currentLeft(iNode.getSons().get(0).getFather() != null ? iNode.getSons().get(0).getFather() : iNode), currentLeft(iNode.getSons().get(0).getMother() != null ? iNode.getSons().get(0).getMother() : iNode));
//				int lDistanceBetweenParents = lMaxLeftParent - lMinLeftParent;
				//
				
				for (AGeneaNode<?> lSon : iNode.getSons()) {
//					int lSonX1 = currentLeft(lSon);
					AGeneaNode<?> lNode = mGenealogy.existingNodeCoordonates(lSon.getLevel(), currentLeft(iNode) + 100, currentLeft(lSon) + 100);
					int lOverRidingNodes = 0;
						
					if (lNode != null && iNode.getSons().contains(lNode) == false) {
						++lOverRidingNodes;
					}
					
					GeneaLine lLineToParents = StarWarsApp.ginjector.getGeneaLine();
					mGenealogy.getDisplay().addBound(lLineToParents.getDisplay().asWidget());
					lLineToParents.getDisplay().setVerticale();
//					lLineToParents.getDisplay().setTop(currentTop(lSon) - 20);
//					lLineToParents.getDisplay().setHeight(20);
					
					GeneaLine lLineToOneSonShift = StarWarsApp.ginjector.getGeneaLine();
					mGenealogy.getDisplay().addBound(lLineToOneSonShift.getDisplay().asWidget());
					lLineToOneSonShift.getDisplay().setHorizontale();
//					lLineToOneSonShift.getDisplay().setTop(currentTop(iNode) + 53);
					
					
					//
					if (lOverRidingNodes == 1) {
						lLineToOneSonShift.getDisplay().setTop(currentTop(iNode) + 60);
						lLineToSon.getDisplay().setHeight(33);
						lLineToParents.getDisplay().setTop(currentTop(lSon) - 15);
						lLineToParents.getDisplay().setHeight(15);
					} else {
						lLineToOneSonShift.getDisplay().setTop(currentTop(iNode) + 52);
						lLineToSon.getDisplay().setHeight(25);
						lLineToParents.getDisplay().setTop(currentTop(lSon) - 20);
						lLineToParents.getDisplay().setHeight(20);					
					}
					//
					
					int lLeftSon = currentLeft(lSon);
					
					if (lLeftParent == lLeftSon) {
						lLineToParents.getDisplay().setLeft(lLeftSon + 100);
						lLineToOneSonShift.getDisplay().setLeft(lLeftSon + 100);
						lLineToOneSonShift.getDisplay().setWidth(3);
					} else if (lSon.getFather() != null && lSon.getMother() != null) {
						if (lLeftSon == Math.min(lLeftSon, lLeftParent)) {
							lLineToParents.getDisplay().setLeft(lLeftSon + 150);
							lLineToOneSonShift.getDisplay().setLeft(lLeftSon + 150);
							lLineToOneSonShift.getDisplay().setWidth(lLeftParent - lLeftSon + 3 - 50);
						} else {
							lLineToParents.getDisplay().setLeft(lLeftSon + 50);
							lLineToOneSonShift.getDisplay().setLeft(lLeftParent + 100);
							lLineToOneSonShift.getDisplay().setWidth(lLeftSon - lLeftParent + 3 - 50);
						}
					} else {
						lLineToParents.getDisplay().setLeft(lLeftSon + 100);
						lLineToOneSonShift.getDisplay().setLeft(Math.min(lLeftSon, lLeftParent) + 100);
						lLineToOneSonShift.getDisplay().setWidth(Math.max(lLeftSon, lLeftParent) - Math.min(lLeftSon, lLeftParent) + 3);
					}
				}
			}
			iNode.setIsVisited(true);
		}
		visitGen(iNode.getFather());
		visitGen(iNode.getMother());
		return iNode;
	}
	
	@Override
	public AGeneaNode<?> visitGen(AGeneaNode<?> iNode) {
		if (iNode != null) {
			return iNode.accept(this);
		}
		return null;
	}
	
	private int currentLeft(AGeneaNode<?> iNode) {
		return ((com.starwars.app.client.genealogy.presenter.AGeneaNode.Display) iNode.getDisplay()).getLeft();
	}

	private int currentTop(AGeneaNode<?> iNode) {
		return Integer.valueOf(iNode.getDisplay().getElement().getStyle().getTop().replaceFirst("px", ""));
	}
}