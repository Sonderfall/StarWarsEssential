package com.starwars.app.client.genealogy.presenter;

import java.util.List;

import com.starwars.app.client.genealogy.visitor.IGenGeneaNodeVisitable;
import com.starwars.app.client.paper.presenter.AComponent;


public interface AGeneaNode<D extends AComponent.Display> extends AComponent<D>, IGenGeneaNodeVisitable {
	
	public interface Display extends com.starwars.app.client.paper.presenter.AComponent.Display {
		int getLeft();
		int getWidth();
		void setName(String iName);
		void setTop(int iTop);
		void setLeft(int iLeft);
		void setRight(int iRight);
		void setBlueNode();
		void setGreenNode();
		void setPurpleNode();
		void setOrangeNode();
		void setYellowNode();
		void setDarkYellowNode();
		void setMediumGreenNode();
		void setMediumGreen2Node();
		void setDarkBlueNode();
		void setMediumPurpleNode();
		void setMediumOrangeNode();
		void setKakiNode();
		void setRedNode();
		void setFleshNode();
		void setPinkNode();
	}
	void draw();
	
	GenealogyModule getGenealogy();
	void setGenealogy(GenealogyModule iGenealogy);
	
	boolean getIsAlignSon();
	void setIsAlignSon(boolean iIsAlignSon);
	
	boolean getIsVisited();
	void setIsVisited(boolean iIsVisited);
	
	boolean getInverseVisitedParent();
	void setInverseVisitedParent(boolean iInverseVisitedParent);

	boolean getIsBind();
	
	int getHardCodeLeftAcc();
	void setHardCodeLeftAcc(int iHardCodeLeftAcc);
	
	int getLevel();
	void setLevel(int iLevel);
	
	AGeneaNode<?> getSpouse();
	void setSpouse(AGeneaNode<?> iSpouse);
	
	AGeneaNode<?> getFather();
	void setFather(AGeneaNode<?> iFather);
	
	AGeneaNode<?> getMother();
	void setMother(AGeneaNode<?> iMother);
	
	AGeneaNode<?> getAdoptedFather();
	void setAdoptedFather(AGeneaNode<?> iAdoptedFather);
	
	AGeneaNode<?> getAdoptedMother();
	void setAdoptedMother(AGeneaNode<?> iAdoptedMother);
	
	List<AGeneaNode<?>> getSons();
}
