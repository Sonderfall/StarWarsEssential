package com.starwars.app.client.chronology.view;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.chronology.presenter.ChronologyModule;
import com.starwars.app.client.paper.view.AModuleView;
import com.starwars.app.client.tools.DivPanel;
import com.starwars.app.client.tools.LiPanel;
import com.starwars.app.client.tools.SpanPanel;

public class ChronologyModuleView extends AModuleView implements
ChronologyModule.Display {

	private final DivPanel mTopPeriodWrapper;
	private final DivPanel mIntervalWrapper;
	private final DivPanel mBottomPeriodWrapper;

	private final List<Widget> mDates;
	private final List<LiPanel> mIntervals;

	public ChronologyModuleView() {
		mDates = new ArrayList<Widget>();
		mIntervals = new ArrayList<LiPanel>();

		initRoot();

		mTopPeriodWrapper = new DivPanel();
		mRoot.add(mTopPeriodWrapper);
		initTopPeriodWrapper();

		mIntervalWrapper = new DivPanel();
		mRoot.add(mIntervalWrapper);
		initIntervalWrapper();

		mBottomPeriodWrapper = new DivPanel();
		mRoot.add(mBottomPeriodWrapper);
		initBottomPeriodWrapper();

		mRoot.add(mLegend);

		zoom();
	}

	public int getWidthInterval(int iIndex) {
		return mIntervals.get(iIndex).getElement().getOffsetWidth();
	}

	public int getWidthDate(int iIndex) {
		return mDates.get(iIndex).getElement().getOffsetWidth();
	}

	public void addEvent(Widget iWidget, int iLeft, int iBottom) {
		iWidget.getElement().getStyle().setLeft(iLeft, Unit.PX);
		iWidget.getElement().getStyle().setBottom(iBottom, Unit.PX);
		mTopPeriodWrapper.add(iWidget);
	}

	public void addTopPeriod(Widget iWidget, int iWidth, int iLeft, int iBottom) {
		iWidget.getElement().getStyle().setWidth(iWidth, Unit.PX);
		iWidget.getElement().getStyle().setLeft(iLeft, Unit.PX);
		iWidget.getElement().getStyle().setBottom(iBottom, Unit.PX);
		mTopPeriodWrapper.add(iWidget);
	}

	public void addBottomPeriod(Widget iWidget, int iWidth, int iLeft, int iTop) {
		iWidget.getElement().getStyle().setWidth(iWidth, Unit.PX);
		iWidget.getElement().getStyle().setLeft(iLeft, Unit.PX);
		iWidget.getElement().getStyle().setTop(iTop, Unit.PX);
		mBottomPeriodWrapper.add(iWidget);
	}

	public void addFirstInterval() {
		LiPanel lInterval = new LiPanel();
		mIntervalWrapper.add(lInterval);
		lInterval.addStyleName(STYLE_CHRONOLOGY.first());
	}

	public void addDate(Widget iWidget, int iWidth) {
		mIntervalWrapper.add(iWidget);
		mDates.add(iWidget);

		LiPanel lInterval = new LiPanel();
		mIntervalWrapper.add(lInterval);
		lInterval.addStyleName(STYLE_CHRONOLOGY.interval());
		lInterval.getElement().getStyle().setWidth(iWidth, Unit.PX);
		mIntervals.add(lInterval);
	}

	public void addLastDate(int iDate) {
		SpanPanel lDate = new SpanPanel();
		mIntervalWrapper.add(lDate);
		lDate.addStyleName(STYLE_CHRONOLOGY.date());
		if (iDate >= 999999) {
			lDate.setText("∞");
		} else {
			lDate.setText(String.valueOf(iDate));
		}
		mDates.add(lDate);
	}

	public void setRightDates() {
		for (Widget lWidget : mDates) {
			lWidget.getElement()
					.getStyle()
					.setRight(lWidget.getElement().getOffsetWidth() / 2 + 2, Unit.PX);
		}
	}

	public void setTopChronology(int iTop) {
		mRoot.getElement().getStyle().setTop(iTop, Unit.PX);
	}

	public void addSpire() {
		DivPanel lSpire = new DivPanel();
		mIntervalWrapper.add(lSpire);
		lSpire.addStyleName(STYLE_CHRONOLOGY.intervalSpire());
	}

	private void initRoot() {
		mRoot.addStyleName(STYLE_CHRONOLOGY.timeline());
	}

	private void initTopPeriodWrapper() {
		mTopPeriodWrapper.addStyleName(STYLE_CHRONOLOGY.periodWrapper());
		mTopPeriodWrapper.getElement().getStyle().setBottom(25, Unit.PX);
	}

	private void initBottomPeriodWrapper() {
		mBottomPeriodWrapper.addStyleName(STYLE_CHRONOLOGY.periodWrapper());
		mBottomPeriodWrapper.getElement().getStyle().setTop(74, Unit.PX);
	}

	private void initIntervalWrapper() {
		mIntervalWrapper.addStyleName(STYLE_CHRONOLOGY.intervalWrapper());
	}

	@Override
	public void zoom() {
		if (Window.getClientWidth() >= 800 && Window.getClientWidth() < 1200) {
			mLegend.addStyleName(STYLE.zoom70());
			mTopPeriodWrapper.addStyleName(STYLE.zoom70());
			mBottomPeriodWrapper.addStyleName(STYLE.zoom70());
			mIntervalWrapper.addStyleName(STYLE.zoom70());
		} else if (Window.getClientWidth() >= 1200 && Window.getClientWidth() < 1800) {
			mLegend.addStyleName(STYLE.zoom88());
			mTopPeriodWrapper.addStyleName(STYLE.zoom88());
			mBottomPeriodWrapper.addStyleName(STYLE.zoom88());
			mIntervalWrapper.addStyleName(STYLE.zoom88());
		}
	}
}