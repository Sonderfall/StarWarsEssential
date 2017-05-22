package com.starwars.app.client.abs.presenter;


public interface Presenter<D extends ADisplay> {

	void bind();

	void unbind();

	D getDisplay();

}