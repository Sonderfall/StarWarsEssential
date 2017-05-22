package com.starwars.app.client.tools;
public class Tuple<T1, T2, T3> {

	private T1 mFirst;
	private T2 mSecond;
	private T3 mThird;
	
	public Tuple() {
		mFirst = null;
		mSecond = null;
		mThird = null;
	}
	
	public Tuple(T1 iFirst, T2 iSecond, T3 iThird) {
		mFirst = iFirst;
		mSecond = iSecond;
		mThird = iThird;
	}
	
	public T1 getFirst() {
		return mFirst;
	}
	
	public T2 getSecond() {
		return mSecond;
	}
	
	public T3 getThird() {
		return mThird;
	}
	
	public void setFirst(T1 iFirst) {
		mFirst = iFirst;
	}
	
	public void setSecond(T2 iSecond) {
		mSecond = iSecond;
	}
	
	public void setThird(T3 iThird) {
		mThird = iThird;
	}
	
	@Override
	public boolean equals(Object obj) {
		@SuppressWarnings("unchecked")
		Tuple<T1, T2, T3> lObj = (Tuple<T1, T2, T3>) obj;
		if (lObj == null) {
			return false;
		}
		if (mFirst == null && lObj.getFirst() != null) {
			return false;
		}
		if (mSecond == null && lObj.getSecond() != null) {
			return false;
		}
		
		if (mThird == null && lObj.getThird() != null) {
			return false;
		}
		
		if (mFirst == null && mSecond == null) {
			return true;
		}
		
		return mFirst.equals(lObj.getFirst()) && mSecond.equals(lObj.getSecond()) && mThird.equals(lObj.getThird());
	}

	public String toString() {
		return mFirst.toString() + ", " + mSecond.toString();
	}
}
