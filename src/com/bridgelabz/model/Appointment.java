package com.bridgelabz.model;


import java.util.Date;

public class Appointment
{ 
	Integer doctorId;
	Date date;
	//constructor
	public Appointment(int id,Date date)
	{ 
		this.doctorId=id;
		this.date=date;
	}
	//getter and setter methods
	public int getDid() 
	{
		return doctorId;
	}
	public void setDid(int did) 
	{
		this.doctorId = did;
	}

	public Date getDate() 
	{
		return date;
	}
	public void setDate(Date date) 
	{
		this.date = date;
	}

	public String toString() 
	{
		return "Appointment [DoctorID=" + doctorId + ", date=" + date +  "]";
	}

	public int hashCode()
	{
    	return this.doctorId.hashCode()+this.date.hashCode();
	}
	//checking for equality
	public boolean equals(Object object)
	{
    	if (object == null) 
			return false;
    	if (object == this) 
			return true;
    	if (!(object instanceof Appointment))
			return false;
    	
    	Appointment dA = (Appointment) object;

		if((this.doctorId==dA.doctorId) && (this.date.equals(dA.date)))
			return true;
		else
			return false;
	}
}