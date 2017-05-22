package com.starwars.app.client.tools;


public class SpanPanel extends APanel {
	
	public SpanPanel() {
		super("span", "");
	}

	private SpanPanel(String iText) {
		super("span", iText);
	}

	private static SpanPanel createSpace() {
		return new SpanPanel("&nbsp");
	}

	public void setText(String iText) {
		if (iText.equals(" ")) {
			SpanPanel lSpanPanel = SpanPanel.createSpace();
			this.add(lSpanPanel);
		} else {
			this.getElement().setInnerText(iText);
		}
	}
	
}
