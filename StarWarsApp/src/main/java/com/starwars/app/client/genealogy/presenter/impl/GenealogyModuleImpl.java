package com.starwars.app.client.genealogy.presenter.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.StarWarsApp;
import com.starwars.app.client.genealogy.event.GeneaDescriptionEvent;
import com.starwars.app.client.genealogy.event.GeneaDescriptionHandler;
import com.starwars.app.client.genealogy.presenter.AGeneaNode;
import com.starwars.app.client.genealogy.presenter.GenealogyModule;
import com.starwars.app.client.genealogy.visitor.GeneaAlignSonsVisitor;
import com.starwars.app.client.genealogy.visitor.GeneaBindVisitor;
import com.starwars.app.client.genealogy.visitor.GeneaDrawBoundsVisitor;
import com.starwars.app.client.genealogy.visitor.GeneaDrawNodeVisitor;
import com.starwars.app.client.genealogy.visitor.GeneaLoadDatasVisitor;
import com.starwars.app.client.genealogy.visitor.GeneaPlacementNodeVisitor;
import com.starwars.app.client.genealogy.visitor.GeneaUnBindVisitor;
import com.starwars.app.client.paper.presenter.impl.AModuleImpl;
import com.starwars.app.client.tools.Pair;


public class GenealogyModuleImpl extends AModuleImpl<GenealogyModule.Display> implements
GenealogyModule {

	private final List<AGeneaNode<?>> mNodes;
	private final Map<AGeneaNode<?>, Map<Integer, Pair<Integer, Integer>>> mNodesRepartition;
	
	@Inject
	public GenealogyModuleImpl(final EventBus eventBus,
			final GenealogyModule.Display display) {
		super(eventBus, display);
		mNodes = new ArrayList<AGeneaNode<?>>();
		mNodesRepartition = new HashMap<AGeneaNode<?>, Map<Integer, Pair<Integer, Integer>>>();
		
		reset();
	}

	@Override
	public void bind() {
		super.bind();
		
		GeneaBindVisitor lGeneaBindVisitor = new GeneaBindVisitor();
		for (AGeneaNode<?> lNode : mNodes) {
			lGeneaBindVisitor.visitGen(lNode);
		}
		
		registerHandler(eventBus.addHandler(GeneaDescriptionEvent.getType(), new GeneaDescriptionHandler() {

			@Override
			public void onGeneaDescription(GeneaDescriptionEvent event) {
				mDescription.init(event.getGeneaInfo());
				mDescription.draw();
				mDescription.getDisplay().show();
			}
		}));
	}

	@Override
	public void unbind() {
		super.unbind();
		
		GeneaUnBindVisitor lGeneaUnBindVisitor = new GeneaUnBindVisitor();
		for (AGeneaNode<?> lNode : mNodes) {
			lGeneaUnBindVisitor.visitGen(lNode);
		}
	}
	
	@Override
	public void process() {
		GeneaDrawNodeVisitor lGeneaDrawNodeVisitor = new GeneaDrawNodeVisitor();
		lGeneaDrawNodeVisitor.init(this);
		for (AGeneaNode<?> lNode : mNodes) {
			lGeneaDrawNodeVisitor.visitGen(lNode);
		}
		
		GeneaPlacementNodeVisitor lGeneaPlacementNodeVisitor = new GeneaPlacementNodeVisitor();
		for (AGeneaNode<?> lNode : mNodes) {
			lGeneaPlacementNodeVisitor.visitGen(lNode);
		}
		 
		GeneaAlignSonsVisitor lGeneaAlignSonsVisitor = new GeneaAlignSonsVisitor();
		for (AGeneaNode<?> lNode : mNodes) {
			lGeneaAlignSonsVisitor.visitGen(lNode);
		}
		
		GeneaDrawBoundsVisitor lGeneaDrawBoundsVisitor = new GeneaDrawBoundsVisitor();
		lGeneaDrawBoundsVisitor.init(this);
		for (AGeneaNode<?> lNode : mNodes) {
			lGeneaDrawBoundsVisitor.visitGen(lNode);
		}
		
		display.add(mDescription.getDisplay().asWidget());
	}

	@Override
	public void reset() {
		mDescription.getDisplay().hide();
	}
	
	@Override
	public void loadDatas() {
		GeneaLoadDatasVisitor lGeneaLoadDatasVisitor = new GeneaLoadDatasVisitor();
		for (AGeneaNode<?> lNode : mNodes) {
			lGeneaLoadDatasVisitor.visitGen(lNode);
		}
	}
	
	public void printNodeCoordonates() {
		for (AGeneaNode<?> lNode : mNodesRepartition.keySet()) {
			Map<Integer, Pair<Integer, Integer>> lMapCoordonates = mNodesRepartition.get(lNode);
			Set<Integer> lLevels = lMapCoordonates.keySet();
			Collection<Pair<Integer, Integer>> lCoordonates = lMapCoordonates.values();
			String lX = lCoordonates.toString();
			StarWarsApp.ginjector.getTools().sendText(lNode.getComponentElement().getTitle() + " coordonates ===> Level : " + lLevels.toString() + ", X : " + lX);
		}
	}
	
	public AGeneaNode<?> existingNodeCoordonates(int iLevel, int iX1, int iX2) {
		for (AGeneaNode<?> lNode : mNodesRepartition.keySet()) {
			boolean lSameLevel = mNodesRepartition.get(lNode).containsKey(iLevel);
			if (lSameLevel) {
				int lX1 = mNodesRepartition.get(lNode).get(iLevel).getFirst();
				int lX2 = lX1 + 200;
				if ((iX1 <= lX1 && iX2 >= lX1 && iX2 <= lX2)
					|| (iX1 == lX1 || iX2 == lX2)
					|| (iX1 >= lX1 && iX1 <= lX2 && iX2 >= lX2)
					|| (iX1 == lX2 || iX2 == lX1)
					|| (iX1 < lX1 && iX2 > lX2)) {
					return lNode;
				}
			}
		}
		return null;
	}
	
	public void addNodeCoordonates(AGeneaNode<?> iNode, int iLevel, int iX1, int iX2) {
		Pair<Integer, Integer> lPair = new Pair<Integer, Integer>(iX1, iX2);
		Map<Integer, Pair<Integer, Integer>> lMapCoordonates = new HashMap<Integer, Pair<Integer,Integer>>();
		lMapCoordonates.put(iLevel, lPair);
		mNodesRepartition.put(iNode, lMapCoordonates);
	}
	
	
	public void removeNodeCoordonates(AGeneaNode<?> iNode) {
		mNodesRepartition.remove(iNode);
	}
	
	public List<AGeneaNode<?>> getNodes() {
		return mNodes;
	}

	public Map<AGeneaNode<?>, Map<Integer, Pair<Integer, Integer>>> getNodesRepartition() {
		return mNodesRepartition;
	}
}
