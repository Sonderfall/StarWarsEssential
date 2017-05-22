package com.starwars.app.client.about.view;

import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.starwars.app.client.StarWarsApp;
import com.starwars.app.client.about.presenter.AboutDescription;
import com.starwars.app.client.abs.view.ADivView;
import com.starwars.app.client.resources.StarWarsImageResources;
import com.starwars.app.client.tools.DivPanel;

public class AboutDescriptionView extends ADivView implements AboutDescription.Display {
	
	private final DivPanel mBackground;
	private final DivPanel mMainWrapper;
	private final DivPanel mImageWrapper;
	private final Image mImage;
	private final DivPanel mTitle;
	private final DivPanel mPart1;
	private final DivPanel mText1;
	private final DivPanel mPart3;
	private final DivPanel mText3;
	
	private final DivPanel mSendWrapper;
	
	private final DivPanel mNameWrapper;
	private final Label mNameLabel;
	
	private final DivPanel mEmailWrapper;
	private final Label mEmailLabel;
	
	private final DivPanel mMessageWrapper;
	private final Label mMessageLabel;
	
	public AboutDescriptionView() {
		mBackground = new DivPanel();
		mRoot.add(mBackground);
		initBackground();
		
		mMainWrapper = new DivPanel();
		mRoot.add(mMainWrapper);
		initMainWrapper();

		mImageWrapper = new DivPanel();
		mMainWrapper.add(mImageWrapper);
		initImageWrapper();
		
		mImage = new Image();
		mImageWrapper.add(mImage);
		initImage();
		
		mTitle = new DivPanel();
		mMainWrapper.add(mTitle);
		initTitle();
		
		mPart1 = new DivPanel();
		mMainWrapper.add(mPart1);
		initPart1();
		
		mText1 = new DivPanel();
		mMainWrapper.add(mText1);
		initText1();
		
		addLine();
		
		mPart3 = new DivPanel();
		mMainWrapper.add(mPart3);
		initPart3();
		
		mText3 = new DivPanel();
		mMainWrapper.add(mText3);
		initText3();
		
		addLine();
		
		mSendWrapper = new DivPanel();
		mMainWrapper.add(mSendWrapper);
		initSendWrapper();
		
		mNameWrapper = new DivPanel();
		mSendWrapper.add(mNameWrapper);
		initNameWrapper();
		
		mNameLabel = new Label();
		mNameWrapper.add(mNameLabel);
		initNameLabel();
		
		mEmailWrapper = new DivPanel();
		mSendWrapper.add(mEmailWrapper);
		initEmailWrapper();
		
		mEmailLabel = new Label();
		mEmailWrapper.add(mEmailLabel);
		initEmailLabel();
		
		mMessageWrapper = new DivPanel();
		mSendWrapper.add(mMessageWrapper);
		initMessageWrapper();
		
		mMessageLabel = new Label();
		mMessageWrapper.add(mMessageLabel);
		initMessageLabel();
		
		zoom();
	}

	public void hide() {
		mBackground.removeStyleName(STYLE.fadein1());
		mMainWrapper.removeStyleName(STYLE.fadein1());
		mRoot.getElement().getStyle().setDisplay(Display.NONE);
	}
	
	public void show() {
		mBackground.addStyleName(STYLE.fadein1());
		mMainWrapper.addStyleName(STYLE.fadein1());
		mRoot.getElement().getStyle().clearDisplay();
	}
	
	public HasClickHandlers getHasClickHandlers() {
		return mBackground;
	}
	
	public void clearSend() {
		desactiveName();
		desactiveEmail();
		desactiveMessage();
	}
	
	public void addMessageArea(Widget iWidget) {
		iWidget.addStyleName(STYLE.textArea());
		mMessageWrapper.add(iWidget);
	}

	public void addEmailArea(Widget iWidget) {
		iWidget.addStyleName(STYLE.textArea());
		mEmailWrapper.add(iWidget);
	}
	
	public void addNameArea(Widget iWidget) {
		iWidget.addStyleName(STYLE.textArea());
		mNameWrapper.add(iWidget);
	}
	
	@Override
	public void addButton(Widget iWidget) {
		mSendWrapper.add(iWidget);
	}
	
	public void activeName() {
		mNameLabel.addStyleName(STYLE.labelTxtActive());
		mNameLabel.addStyleName(STYLE.blueFont());
		mNameLabel.removeStyleName(STYLE.whiteFont());
	}
	
	public void desactiveName() {
		mNameLabel.removeStyleName(STYLE.labelTxtActive());
		mNameLabel.removeStyleName(STYLE.blueFont());
		mNameLabel.addStyleName(STYLE.whiteFont());
	}
	
	public void activeEmail() {
		mEmailLabel.addStyleName(STYLE.labelTxtActive());
		mEmailLabel.addStyleName(STYLE.blueFont());
		mEmailLabel.removeStyleName(STYLE.whiteFont());
	}
	
	public void desactiveEmail() {
		mEmailLabel.removeStyleName(STYLE.labelTxtActive());
		mEmailLabel.removeStyleName(STYLE.blueFont());
		mEmailLabel.addStyleName(STYLE.whiteFont());
	}
	
	public void activeMessage() {
		mMessageLabel.addStyleName(STYLE.labelTxtActive());
		mMessageLabel.addStyleName(STYLE.blueFont());
		mMessageLabel.removeStyleName(STYLE.whiteFont());
	}
	
	public void desactiveMessage() {
		mMessageLabel.removeStyleName(STYLE.labelTxtActive());
		mMessageLabel.removeStyleName(STYLE.blueFont());
		mMessageLabel.addStyleName(STYLE.whiteFont());
	}
	
    private void addLine() {
        DivPanel lLine = new DivPanel();
        mMainWrapper.add(lLine);
        lLine.addStyleName(STYLE.detailStatisticsLine());
        lLine.addStyleName(STYLE.clear());
    }
	
	private void initBackground() {
		mBackground.addStyleName(STYLE.descriptionMask());
	}
	
	private void initSendWrapper() {
		mSendWrapper.addStyleName(STYLE.sendWrapper());
	}
	
	private void initNameWrapper() {
		mNameWrapper.getElement().getStyle().setWidth(50, Unit.PCT);
		mNameWrapper.getElement().getStyle().setMarginLeft(0, Unit.PX);
		mNameWrapper.addStyleName(STYLE.left());
		mNameWrapper.getElement().getStyle().setPadding(0.75, Unit.EM);
		mNameWrapper.getElement().getStyle().setPosition(Position.RELATIVE);
	}
	
	private void initEmailWrapper() {
		mEmailWrapper.getElement().getStyle().setWidth(50, Unit.PCT);
		mEmailWrapper.getElement().getStyle().setMarginLeft(0, Unit.PX);
		mEmailWrapper.addStyleName(STYLE.left());
		mEmailWrapper.getElement().getStyle().setPadding(0.75, Unit.EM);
		mEmailWrapper.getElement().getStyle().setPosition(Position.RELATIVE);
	}
	
	private void initMessageWrapper() {
		mMessageWrapper.getElement().getStyle().setWidth(100, Unit.PCT);
		mMessageWrapper.getElement().getStyle().setMarginLeft(0, Unit.PX);
		mMessageWrapper.addStyleName(STYLE.left());
		mMessageWrapper.getElement().getStyle().setPadding(0.75, Unit.EM);
		mMessageWrapper.getElement().getStyle().setPosition(Position.RELATIVE);
	}
	
	private void initMessageLabel() {
		mMessageLabel.setText("Message");
		mMessageLabel.addStyleName(STYLE.labelTxt());
		mMessageLabel.addStyleName(STYLE.whiteFont());
	}
	
	private void initEmailLabel() {
		mEmailLabel.setText("E-mail");
		mEmailLabel.addStyleName(STYLE.labelTxt());
		mEmailLabel.addStyleName(STYLE.whiteFont());
	}
	
	private void initNameLabel() {
		mNameLabel.setText("Prénom");
		mNameLabel.addStyleName(STYLE.labelTxt());
		mNameLabel.addStyleName(STYLE.whiteFont());
	}
	
	private void initMainWrapper() {
		mMainWrapper.addStyleName(STYLE.descriptionWrapper());
		mMainWrapper.addStyleName(STYLE.descriptionBackground());
		mMainWrapper.addStyleName(STYLE.blueBorder());
	}

	private void initImageWrapper() {
		mImageWrapper.addStyleName(STYLE.logoDescriptionWrapper());
	}

	private void initImage() {
		mImage.addStyleName(STYLE.logoDescription());
		mImage.setResource(StarWarsImageResources.INSTANCE.logo());
	}
	
	private void initTitle() {
		mTitle.addStyleName(STYLE.descriptionTitle());
		mTitle.setText("Star Wars Essential v"
				+ StarWarsApp.majorVersion + "."
				+ StarWarsApp.minorVersion + "."
				+ StarWarsApp.revision);
	}
	
	private void initPart1() {
		mPart1.addStyleName(STYLE.descriptionPart());
		mPart1.setText("Qu'est ce que c'est ?");
	}
	
	private void initText1() {
		mText1.addStyleName(STYLE.descriptionDetail());
		mText1.setText("Star Wars Essential est une application web qui met à votre disposition un environnement intuitif et fluide"
				+ " afin d'en apprendre plus sur l'univers de Star Wars.");
	}
	
	private void initPart3() {
		mPart3.addStyleName(STYLE.descriptionPart());
		mPart3.setText("Impressum");
	}
	
	private void initText3() {
		mText3.addStyleName(STYLE.descriptionDetail());
		mText3.setText("StarWars Essential n’est, en aucune façon, affilié ou associé à Lucasfilm ou Disney, et est "
				+ "un site réalisé et géré bénévolement. Toute images relatives à la Saga "
				+ "Star Wars est soumis à copyright auprès de Lucasfilm. "
				+ "Star Wars Essential ne dispose d'aucun partenariat et n'est lié par aucun contrat publicitaire "
				+ " que ce soit. Pour faire simple, c'est une application web à but non lucratif avec pour seul objectif"
				+ " de faire découvrir l'univers Star Wars.");
	}
	
	@Override
	public void zoom() {
		if (Window.getClientWidth() >= 800 && Window.getClientWidth() < 1200) {
			mMainWrapper.addStyleName(STYLE.zoom70());
		} else if (Window.getClientWidth() >= 1200 && Window.getClientWidth() < 1800) {
			mMainWrapper.addStyleName(STYLE.zoom85());
		}
	}
}