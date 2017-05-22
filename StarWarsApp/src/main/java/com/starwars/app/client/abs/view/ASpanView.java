package com.starwars.app.client.abs.view;

import com.starwars.app.client.tools.SpanPanel;

public abstract class ASpanView extends AView<SpanPanel> {

	public ASpanView() {
		mRoot = new SpanPanel();
		initWidget(mRoot);
	}
}
