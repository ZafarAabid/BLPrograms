package com.bridgelabz.model;
/**
 * Person class that carries firstName,lastName,mobileNumber
 *  and Address(object)
 * */
public class Person implements Comparable<Person> {
	String firstName;
	String lastName;
	long mobileNumber;
	Address address;
	
	public Person() {};
	public Person(String firstName, String lastName, long mobileNumber, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public int compareTo(Person p) {
		return this.getAddress().getZip() - p.getAddress().getZip();
	}
	
	@Override
	public String toString() {
		return "zip{"+this.getAddress().getZip()+"}";
	}
}

	

