package com.starwars.app.client.chronology.presenter.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.starwars.app.client.StarWarsApp;
import com.starwars.app.client.chronology.event.ChronoDescriptionEvent;
import com.starwars.app.client.chronology.event.ChronoDescriptionHandler;
import com.starwars.app.client.chronology.presenter.APeriod;
import com.starwars.app.client.chronology.presenter.ChronoBigFigure;
import com.starwars.app.client.chronology.presenter.ChronoDate;
import com.starwars.app.client.chronology.presenter.ChronologyModule;
import com.starwars.app.client.paper.presenter.impl.AModuleImpl;


public class ChronologyModuleImpl extends AModuleImpl<ChronologyModule.Display> implements
ChronologyModule {

	private final List<ChronoDate> mDates;
	private final List<APeriod<?>> mPeriods;
	private final List<ChronoBigFigure> mBigFigures;
	private final Map<Integer, List<String>> mEvents;
	private final int COEFFICIENT_LOG = 100;

	@Inject
	public ChronologyModuleImpl(final EventBus eventBus,
			final ChronologyModule.Display display) {
		super(eventBus, display);
		display.add(mDescription.getDisplay().asWidget());
		reset();
		
		mPeriods = new ArrayList<APeriod<?>>();
		mBigFigures = new ArrayList<ChronoBigFigure>();
		mDates = new ArrayList<ChronoDate>();
		mEvents = new HashMap<Integer, List<String>>();
		mDates.add(StarWarsApp.ginjector.getChronoDate());
	}

	@Override
	public void bind() {
		super.bind();
		mDescription.bind();
		
		for (APeriod<?> lPeriod : mPeriods) {
			lPeriod.bind();
		}
		
		registerHandler(eventBus.addHandler(ChronoDescriptionEvent.getType(), new ChronoDescriptionHandler() {

			@Override
			public void onChronoDescription(ChronoDescriptionEvent event) {
				mDescription.init(event.getComponentElement());
				mDescription.draw();
				mDescription.getDisplay().show();
			}
		}));
	}
	
	@Override
	public void process() {
		setPositionDates();
		setPositionPeriods();
		setPositionEvents();
	}
	
	@Override
	public void reset() {
		mDescription.getDisplay().hide();
	}
	
	@Override
	public void loadDatas() {
		for (APeriod<?> lPeriod : mPeriods) {
			lPeriod.getComponentElement().getInfo().loadDatas();
		}
	}
	
	public void addEvent(int iDate, String iText) {
		if (!mEvents.containsKey(iDate)) {
			List<String> lNewEvents = new ArrayList<String>();
			lNewEvents.add(iText);
			mEvents.put(iDate, lNewEvents);
		} else {
			mEvents.get(iDate).add(iText);
		}
		addDate(iDate, "");
	}
	
	public void addBigFigure(int iDate, String iText) {
		ChronoBigFigure lChronoBigFigure = StarWarsApp.ginjector.getChronoBigFigure();
		lChronoBigFigure.init(iText, iDate);
		mBigFigures.add(lChronoBigFigure);
		addDate(iDate, "");
	}
	
	public void addPeriod(APeriod<?> iPeriod) {
		if (iPeriod != null) {
			mPeriods.add(iPeriod);
			int lBeginDate = iPeriod.getBeginDate();
			int lEndDate = iPeriod.getEndDate();
			
			addDate(lBeginDate, iPeriod.getApproxBeginDate());
			addDate(lEndDate, iPeriod.getApproxEndDate());
		}
	}

	private void setPositionDates() {
		Collections.sort(mDates, new Comparator<ChronoDate>() {
			public int compare(ChronoDate iFirstDate, ChronoDate iSecondDate) {
				return ((iFirstDate.getDate() < iSecondDate.getDate()) ? -1 : 1);
			}
		});
		
		display.addFirstInterval();
		for (int i = 0; i < mDates.size() - 1; ++i) {
			int lLowerDate = mDates.get(i).getDate();
			int lHigherDate = mDates.get(i + 1).getDate();
			
			int lInterval = Math.abs(lHigherDate - lLowerDate);
			if (lInterval <= 2) {
				lInterval = 3;
			} else if (lInterval >= 999999) {
				lInterval = 50;
			}
			
			int lLogInterval = (int) Math.log(lInterval) * COEFFICIENT_LOG;
			display.addDate(mDates.get(i).getDisplay().asWidget(), lLogInterval);
			mDates.get(i).draw();
		}
		display.addLastDate(mDates.get(mDates.size() - 1).getDate());
		display.setRightDates();
//		display.addSpire();
	}
	
	private void setPositionPeriods() {
		for (APeriod<?> lPeriod : mPeriods) {
			int lBeginDate = lPeriod.getBeginDate();
			int lEndDate = lPeriod.getEndDate();
			int lLeftToSet = 0;
			for (int i = 0; i < mDates.size() - 1; ++i) {
				int lDate = mDates.get(i).getDate();
				if (lDate == lBeginDate) {
					break;
				} else {
					lLeftToSet += display.getWidthInterval(i);
					lLeftToSet += display.getWidthDate(i);
				}
			}
			
			int lWidthToSet = 0;
			for (int i = 0; i < mDates.size() - 1; ++i) {
				int  lDate = mDates.get(i).getDate();
				if (lDate >= lBeginDate && lDate < lEndDate) {
					lWidthToSet += display.getWidthInterval(i);
					lWidthToSet += display.getWidthDate(i);
				}
			}
			
			int lTopToSet = 80;
			int lOverPeriodTop = 0;
			int lOverPeriodBottom = 0;
			int lMaxOverPeriodTop = 0;
			int lMaxOverPeriodBottom = 0;
			for (APeriod<?> lOtherPeriod : mPeriods) {
				int lOtherBeginDate = lOtherPeriod.getBeginDate();
				int lOtherEndDate = lOtherPeriod.getEndDate();
				if (lPeriod != lOtherPeriod) {
					if ((lBeginDate <= lOtherBeginDate && lEndDate <= lOtherEndDate && lEndDate > lOtherBeginDate) ||
						(lBeginDate <= lOtherBeginDate && lEndDate >= lOtherEndDate) ||
						(lBeginDate >= lOtherBeginDate && lEndDate >= lOtherEndDate && lBeginDate < lOtherEndDate) ||
						(lBeginDate >= lOtherBeginDate && lEndDate <= lOtherEndDate)) {
						if (lOtherPeriod.getSetPositionBottom()) {
							++lOverPeriodBottom;
							lMaxOverPeriodBottom = Math.max(lMaxOverPeriodBottom, lOtherPeriod.getNbOverPeriod());
						}
						
						if (lOtherPeriod.getSetPositionTop()) {
							++lOverPeriodTop;
							lMaxOverPeriodTop = Math.max(lMaxOverPeriodTop, lOtherPeriod.getNbOverPeriod());
						}
						
						if (lOtherPeriod.getIsBig()) {
							lTopToSet += 20;
						}
					}
				}
			}
			
			if ((lOverPeriodBottom < lOverPeriodTop || lPeriod.isHardBottom()) && !lPeriod.isHardTop()) {
				display.addBottomPeriod(lPeriod.getDisplay().asWidget(),
						(lPeriod.getEndDate() - lPeriod.getBeginDate() == 0 ? (int) (Math.log(4) * COEFFICIENT_LOG) : lWidthToSet),
						(lPeriod.getEndDate() - lPeriod.getBeginDate() == 0 ? lLeftToSet - (int) (Math.log(4) * COEFFICIENT_LOG) / 2 : lLeftToSet),
						lTopToSet * lMaxOverPeriodBottom);
				
				lPeriod.setSetPositionTop(false);
				lPeriod.setSetPositionBottom(true);
				lPeriod.setNbOverPeriod(lMaxOverPeriodBottom + 1);
			}
			
			else if (lOverPeriodTop <= lOverPeriodBottom || lPeriod.isHardTop()) {
				display.addTopPeriod(lPeriod.getDisplay().asWidget(),
						(lPeriod.getEndDate() - lPeriod.getBeginDate() == 0 ? (int) (Math.log(4) * COEFFICIENT_LOG) : lWidthToSet),
						(lPeriod.getEndDate() - lPeriod.getBeginDate() == 0 ? lLeftToSet - (int) (Math.log(4) * COEFFICIENT_LOG) / 2 : lLeftToSet),
						lTopToSet * lMaxOverPeriodTop);

				lPeriod.setSetPositionTop(true);
				lPeriod.setSetPositionBottom(false);
				lPeriod.setNbOverPeriod(lMaxOverPeriodTop + 1);
			}
			lPeriod.draw();
		}
	}
	
	private void setPositionEvents() {
		for (ChronoBigFigure lChronoEvent : mBigFigures) {
			int lDateEvent = lChronoEvent.getDate();
			int lLeftToSet = 0;
			for (int i = 0; i < mDates.size() - 1; ++i) {
				int lDate = mDates.get(i).getDate();
				if (lDate == lDateEvent) {
					break;
				} else {
					lLeftToSet += display.getWidthInterval(i);
					lLeftToSet += display.getWidthDate(i);
				}
			}
			display.addEvent(lChronoEvent.getDisplay().asWidget(), lLeftToSet, 6);
			lChronoEvent.getDisplay().setRightText();
		}
	}
	
	private void addDate(int iDate, String iApprox) {
		boolean lFind = false;
		
		for (ChronoDate lDate : mDates) {
			if (lDate.getDate() == iDate) {
				lFind = true;
				break;
			}
		}
		
		if (!lFind) {
			ChronoDate lDate = StarWarsApp.ginjector.getChronoDate();
			lDate.init(iDate, iApprox);
			mDates.add(lDate);
		}
	}
}
