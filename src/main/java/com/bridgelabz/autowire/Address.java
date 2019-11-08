package com.bridgelabz.autowire;

public class Address {
	private String mCity;
	private String mState;
	private String mCountry;
	
	public Address() {};
	public Address(String mCity, String mState, String mCountry) {
		super();
		this.mCity = mCity;
		this.mState = mState;
		this.mCountry = mCountry;
	}
	public String getState() {
		return mState;
	}
	public void setState(String mState) {
		this.mState = mState;
	}
	public String getCountry() {
		return mCountry;
	}
	public void setCountry(String mCountry) {
		this.mCountry = mCountry;
	}

	public String getCity() {
		return mCity;
	}
	public void setCity(String city) {
		this.mCity = city;
	}
	
	@Override
	public String toString() {
		return "[City=" + mCity + ", State=" + mState + ", Country=" + mCountry+"]";
	}

}
