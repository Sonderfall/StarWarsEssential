package com.starwars.app.client.tools;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class CssAnimation {
	public static native void registerCssCallback(
			Element elem, AsyncCallback<Void> callback) /*-{
    elem.addEventListener("webkitAnimationEnd", function() {
      $entry(@com.starwars.app.client.tools.CssAnimation::cssCallback(Lcom/google/gwt/user/client/rpc/AsyncCallback;)(callback));
    }, false);
  }-*/;


	public static void cssCallback(AsyncCallback<Void> callback) {
		callback.onSuccess(null);
	}
}