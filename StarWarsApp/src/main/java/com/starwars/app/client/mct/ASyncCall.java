package com.starwars.app.client.mct;

public abstract class ASyncCall<T> {
	
	protected T mResult = null;
	
	public void onStart() {}
		
	public abstract void onSuccess(T iObj);
	
	public T getResult() {
		return mResult;
	}
}
