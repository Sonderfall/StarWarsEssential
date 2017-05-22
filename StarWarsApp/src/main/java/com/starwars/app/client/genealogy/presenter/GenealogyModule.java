package com.starwars.app.client.genealogy.presenter;

import java.util.List;
import java.util.Map;

import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.paper.presenter.AModule;
import com.starwars.app.client.tools.Pair;

public interface GenealogyModule extends AModule<GenealogyModule.Display> {
	
	interface Display extends AModule.Display {
		void addNode(Widget iWidget);
		void addBound(Widget iWidget);
		void addUnknownGeneration(Widget iWidget, int iLeft, int iTop);
		void setLeftNodesAndBounds(int iLeft);
	}
	AGeneaNode<?> existingNodeCoordonates(int iLevel, int iX1, int iX2);
	void addNodeCoordonates(AGeneaNode<?> iNode, int iLevel, int iX1, int iX2);
	void removeNodeCoordonates(AGeneaNode<?> iNode);
	void printNodeCoordonates();
	List<AGeneaNode<?>> getNodes();
	Map<AGeneaNode<?>, Map<Integer, Pair<Integer, Integer>>> getNodesRepartition();
}
