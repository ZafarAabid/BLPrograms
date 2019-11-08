package com.bridgelabz.autowire;

public class Employee {

	private String mName;
	private int mSalary;
	private Address add;

	public Employee() {};
	public Employee(int id, String name, Address address) {  
	    super();  
	    this.mSalary = id;  
	    this.mName = name;  
	    this.add = address;  
	}  
	public String getName() {
		return mName;
	}

	public void setName(String name) {
		this.mName = name;
	}

	public int getSalary() {
		return mSalary;
	}

	public void setSalary(int salary) {
		this.mSalary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + mName + ", salary=" + mSalary + ", address:"+add+ "]";
	}

}
