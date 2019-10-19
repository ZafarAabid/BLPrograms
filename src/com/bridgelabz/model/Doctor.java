package com.bridgelabz.model;

import com.bridgelabz.utility.*;

public class Doctor 
{
static Scan scan = new Scan();
	int doctorId;
	String doctorname;
	String avail;
	String specialization;
	Utility u1;
	int popularity=0;

	//getter and setter methods
	public int getDoctorId() 
	{
		return doctorId;
	}
	public void setDoctorId(int did) 
	{
		this.doctorId = did;
	}
	public int getPopularity() {
		return popularity;
	}
	public void setPopularity() {
		popularity++;
	}
	public String getDname() 
	{
		return doctorname;
	}
	public void setDname(String dname) 
	{
		this.doctorname = dname;
	}
	public String getAvail() 
	{
		return avail;
	}
	public void setAvail(String avail) 
	{
		this.avail = avail;
	}
	public String getSpec() {
		return specialization;
	}
	public void setSpec(String specialization) 
	{
		this.specialization = specialization;
	}
	//toString method
	public String toString() 
	{
		return "Doctor [DoctorId=" + doctorId + ", name=" + doctorname + ", availability=" + avail + ", specialization=" + specialization + "]";
	}
	//to add doctor details
	public void addDoctor()
	{
		u1=new Utility();
		System.out.println("Enter Doctors' Details ...");

		System.out.println("Enter Name: ");
		this.doctorname=scan.scannerString();
		System.out.println();

		System.out.println("Enter Id: ");
		this.doctorId=scan.scannerInt();
		System.out.println();

		System.out.println("Enter Specialization: ");
		this.specialization=scan.scannerString();
		System.out.println();

		System.out.println("Enter Availability (AM/PM/Both):");
		this.avail=scan.scannerString();
		System.out.println();
		
	}
}