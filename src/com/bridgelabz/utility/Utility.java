package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.controller.ClinicManagementMain;
import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Management;
import com.bridgelabz.model.Patients;

public class Utility {
	
	Scan scan = new Scan();
	File file=new File("clinic.json");
	static Management manage = new Management();
	HashMap<Appointment,Integer> appoint=new HashMap<Appointment,Integer>();
	Patients patient=new Patients();
	Doctor doctor=new Doctor();
	ArrayList<Doctor> ald = new ArrayList<Doctor>();
	ArrayList<Patients> alp = new ArrayList<Patients>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static ObjectMapper mapper =new ObjectMapper();
	
	public void hospital(int choice)
	{
		switch(choice)
		{
		case 1:
			doctor.addDoctor();
					ald.add(doctor);
			
		break;
		case 2:
					patient.addPatient();
					alp.add(patient);
		break;
		case 3:
					System.out.println("All Doctors Details..");
					System.out.println(ald);
		break;
	case 4:
					System.out.println("All Patients Details..");
					System.out.println(alp);
	break;
	case 5:
					appoint=Management.appoint();
	break;
	case 6:
					System.out.println("Printing All Appointments...");
					appoint.putAll(appoint);
					System.out.println(appoint);
	break;
	case 7:
					System.out.println("1.Enter Docotor Id");
					int did1=scan.scannerInt();
					ald=Management.FindById(ald,did1);
					System.out.println(ald);
						
	case 8:
					//Search Patients by Mobile Number
					System.out.println("Enter Patients Mobile Number");
					String avail1=scan.scannerString();
					alp=manage.FindByava1(alp,avail1);
					System.out.println(alp);
	break;
	case 9:
					System.exit(0);
	break;
		
	default :		System.out.println("Wrong choice, choose carefully");
	break;
		}
		String[] args=null;
		ClinicManagementMain.main(args);
	}
	
	
	
	

}
