package com.starwars.app.client.genealogy.presenter;



public interface JediGeneaNode extends AGeneaNode<JediGeneaNode.Display> {
	
	interface Display extends AGeneaNode.Display {
	}
	boolean isIndirectApprentice();
	void setIndirectApprentice(boolean iIndirectApprentice);
}
