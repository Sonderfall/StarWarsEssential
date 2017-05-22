package com.starwars.app.client.mct;

public abstract class ADSyncCall<T, U> {
	
	public abstract void onSuccess(T iT, U iU);
	
}
