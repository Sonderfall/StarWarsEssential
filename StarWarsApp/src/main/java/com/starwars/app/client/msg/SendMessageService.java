package com.starwars.app.client.msg;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("sendMessage")
public interface SendMessageService extends RemoteService {

	public void sendMessage(String iName, String iEmail, String iMessage);
}