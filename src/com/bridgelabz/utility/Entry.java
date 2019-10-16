package com.bridgelabz.utility;

import java.util.Date;

public class Entry {
	
	private String name="";
	private String fullName="";
	private long mobileNumber=0;
	private Date date =new Date();

	public Entry() {};

	public Entry(String name, String fullName, long mobileNumber, Date date) {
		super();
		this.name = name;
		this.fullName = fullName;
		this.mobileNumber = mobileNumber;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
