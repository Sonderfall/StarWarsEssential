package com.starwars.app.client.pager.presenter.impl;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.abs.presenter.BasePresenter;
import com.starwars.app.client.pager.event.NodePathEvent;
import com.starwars.app.client.pager.event.NodePathHandler;
import com.starwars.app.client.pager.presenter.NodePath;
import com.starwars.app.client.pager.presenter.NodePathItem;
import com.starwars.app.shared.Info;


public class NodePathImpl extends BasePresenter<NodePath.Display> implements
NodePath {

	private final Provider<NodePathItem> mProviderNodePathItem;
	private final List<NodePathItem> mNodePathItems;

	private final NodePathItem mPortal;
	private final NodePathItem mHome;

	@Inject
	public NodePathImpl(final EventBus eventBus,
			final NodePath.Display display,
			Provider<NodePathItem> iProviderNodePathItem) {
		super(eventBus, display);
		mNodePathItems = new ArrayList<NodePathItem>();
		mProviderNodePathItem = iProviderNodePathItem;

		mPortal = mProviderNodePathItem.get();
		mNodePathItems.add(mPortal);
		
		mHome = mProviderNodePathItem.get();
		mNodePathItems.add(mHome);
	}

	@Override
	public void bind() {
		super.bind();

		registerHandler(eventBus.addHandler(NodePathEvent.getType(), new NodePathHandler() {

			@Override
			public void onNodePath(NodePathEvent event) {
				updateNodePath(event);
			}
		}));
	}


	private void updateNodePath(NodePathEvent event) {
		Info lInfo = event.getInfo();
		NodePathItem lNodePathItem = null;
		switch (event.getNodePathType()) {
		case home:
			mHome.initHome(event.getTypePortal());
			mPortal.initPortal();
			mNodePathItems.clear();
			mNodePathItems.add(mPortal);
			mNodePathItems.add(mHome);
			break;
		case replace:
			int lIndex = -1;
			for (int i = 0; i < mNodePathItems.size(); ++i) {
				lNodePathItem = mNodePathItems.get(i);
				if (lNodePathItem.getInfo() == lInfo) {
					lIndex = i;
				}
			}
			if (lIndex == -1) {
				if (!event.isRealChange()) {
					mNodePathItems.remove(mNodePathItems.size() - 1);
				}
				
				lNodePathItem = mProviderNodePathItem.get();
				lNodePathItem.init(lInfo);
				lNodePathItem.bind();
				mNodePathItems.add(lNodePathItem);
				break;
			} else {
				for (; lIndex + 1 < mNodePathItems.size();) {
					mNodePathItems.remove(lIndex + 1);
				}
			}
		default:
			break;
		}

		process();
	}

	private void process() {
		display.clear();
		for (int i = 0; i < mNodePathItems.size(); ++i) {
			NodePathItem lNodePathItem = mNodePathItems.get(i);
			display.addItem(lNodePathItem.getDisplay().asWidget());

			if (i < mNodePathItems.size() - 1) {
				display.addSeparator();
			}
			lNodePathItem.activate(i == mNodePathItems.size() - 1);
		}
	}

}
