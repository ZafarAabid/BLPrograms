package com.bridgelabz.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import com.bridgelabz.utility.*;

public class Management {
static Scan scan = new Scan();
static Utility util = new Utility();
static ArrayList<Doctor> ald = new ArrayList<Doctor>();
ArrayList<Patients> alp = new ArrayList<Patients>();
static HashMap<Appointment,Integer> appoint=new HashMap<Appointment,Integer>();


	public static HashMap<Appointment, Integer> appoint()
	{
		System.out.println("Enter Docotor Id ");
		int did=scan.scannerInt();
		ArrayList<Doctor>doc=Management.FindById(ald, did);
		if(doc!=null)
		{
			if(doc.size()>=1)
			{
				System.out.println("Enter Date of Appointment(eg.10/06/2016): ");
				Date date=printDate(scan.scannerString());
				if(date==null)
				{
					System.out.println("Date format is not correct");
				}
				else
				{
					Appointment newApp=new Appointment(did, date);
					if(appoint.containsKey(newApp))
					{
						//already some appointment is there on that date
						Integer appointment=appoint.get(newApp);
						if(appointment<=5)
						{
							//Appointment on given date is less then 5
							appointment++;
							appoint.put(newApp,appointment);
							System.out.println("Appointment Scheduled on "+date.toString()+" "+" with Doctor Id"+did);
						}
						else
						{
							//On given date appointment is more then 5
							System.out.println("Please Select Another Date"); 
						}
					}
					else
					{
						//No appointment is there on given date
						appoint.put(newApp,1);
					}
				}
			}
			//doctor Id does not exit in the DoctorsList
			else
			{
				System.out.println("Invalid Doctor Id");
			}
		}
		else
		{
			System.out.println("Invalid Doctor Id");
		}
		return appoint;
	}
	
	public static ArrayList<Doctor> FindById ( ArrayList<Doctor> al,int did)  	{  
		ArrayList<Doctor> temp=new ArrayList<Doctor>();
		
		for(Doctor d:al)
		{
			if(d.getDoctorId()==did)
			{
				temp.add(d);
			}
		}
		return temp;	
	}

	/**search patients by Number*/
	public ArrayList<Patients> FindByava1 (ArrayList<Patients> al1, String as1)   
	{	
		ArrayList<Patients> temp=new ArrayList<Patients>();
		
		for(Patients p1:al1)
		{
			if(p1.getMobile()==as1)
			{
				temp.add(p1);
			}
		}
		return temp;
	}
	
	
	public static Date printDate(String date){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		try{
			return sdf.parse(date);
		}
		catch(ParseException pe){
			return null;
		}
	}
}
