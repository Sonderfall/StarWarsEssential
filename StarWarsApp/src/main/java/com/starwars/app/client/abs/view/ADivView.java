package com.starwars.app.client.abs.view;

import com.starwars.app.client.tools.DivPanel;

public abstract class ADivView extends AView<DivPanel> {

	public ADivView() {
		mRoot = new DivPanel();
		initWidget(mRoot);
	}
}
