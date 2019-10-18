package com.bridgelabz.model;

import com.bridgelabz.utility.*;

public class Patients
{
	
	Scan scan =new Scan();
	int patientId;
	String pname;
	int age;
	String mobile;

	public int getPatientId() 
	{
		return patientId;
	}
	public void setPatientId(int pid) 
	{
		this.patientId = pid;
	}

	public String getPname() 
	{
		return pname;
	}
	public void setPname(String pname) 
	{
		this.pname = pname;
	}

	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}

	public String getMobile() 
	{
		return mobile;
	}
	public void setMobile(String mobile) 
	{
		this.mobile = mobile;
	}
	/**toString method*/
	public String toString() 
	{
		return "Patients [patientId=" + patientId + ", pname=" + pname + ", age=" + age + ", mobile=" + mobile + "]";
	}

	/**method to add patients information*/
	public void addPatient()
	{

		System.out.println("Enter Patients' Details ...");

		System.out.println("Enter Name: ");
		this.pname=scan.scannerString();
		System.out.println();

		System.out.println("Enter Id: ");
		this.patientId=scan.scannerInt();
		System.out.println();

		System.out.println("Enter Age: ");
		this.age=scan.scannerInt();
		System.out.println();

		System.out.println("Enter Mobile Number: ");
		this.mobile=scan.scannerString();
		System.out.println();
	}
}