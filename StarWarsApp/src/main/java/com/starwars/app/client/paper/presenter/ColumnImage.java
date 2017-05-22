package com.starwars.app.client.paper.presenter;

import com.starwars.app.client.abs.presenter.Presenter;


public interface ColumnImage extends Presenter<ColumnImage.Display> {

	interface Display extends com.starwars.app.client.abs.presenter.ADisplay {
	}

	void setPaper(Paper iPaper);
	void clearImages();
}
