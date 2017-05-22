package com.starwars.app.client.msg;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface SendMessageServiceAsync {

	void sendMessage(String iName, String iEmail, String iMessage, AsyncCallback<Void> callback);

}
