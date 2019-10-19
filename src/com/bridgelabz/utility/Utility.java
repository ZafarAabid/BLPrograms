package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.controller.ClinicManagementMain;
import com.bridgelabz.model.Appointment;
import com.bridgelabz.model.Doctor;
import com.bridgelabz.model.Management;
import com.bridgelabz.model.Patients;

public class Utility {
	
	Scan scan = new Scan();
	
	Patients patient=new Patients();
//	Doctor doctor=new Doctor();
	int index=0;
	HashMap<Appointment,Integer> appoint=new HashMap<Appointment,Integer>();
	static ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
	static ArrayList<Patients> patientList = new ArrayList<Patients>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static File fileDoc=new File("doctor.json");
	static File filePat=new File("patient.json");
	static ObjectMapper mapper =new ObjectMapper();
	static Management manage = new Management();
	static InputStream is;
	TypeReference<List<Doctor>> docRef = new TypeReference<List<Doctor>>() {};
	TypeReference<List<Patients>> patRef = new TypeReference<List<Patients>>() {};
	public void hospital(int choice)
	{
		switch(choice)
		{
		case 1:
			Doctor doctor=new Doctor();
				doctor.addDoctor();

			try {
				is = new FileInputStream(new File("doctor.json"));
//				List<Doctor> doctors= mapper.readValue(is,docRef);
				doctorList= mapper.readValue(is,docRef);
//				doctors.add(doctor);
				doctorList.add(doctor);
				mapper.writeValue(fileDoc, doctorList);

			} catch (JsonGenerationException e1) {
				System.out.println("GE error is: "+e1.getMessage());
			} catch (JsonMappingException e1) {
				System.out.println("ME error is: "+e1.getMessage());
			} catch (IOException e1) {
				System.out.println("IO error is: "+e1.getMessage());
			}
			
		break;
		case 3:
			System.out.println("All Doctors Details..");
			for (int i = 0; i < doctorList.size(); i++) {
				System.out.println(doctorList.get(i));
			}
		break;
		
		case 2:
					patient.addPatient();

					try {
						is = new FileInputStream(new File("patient.json"));
//						List<Doctor> doctors= mapper.readValue(is,docRef);
						patientList= mapper.readValue(is,patRef);
//						doctors.add(doctor);
						patientList.add(patient);
						mapper.writeValue(filePat, patientList);

					} catch (JsonGenerationException e1) {
						System.out.println("GE error is: "+e1.getMessage());
					} catch (JsonMappingException e1) {
						System.out.println("ME error is: "+e1.getMessage());
					} catch (IOException e1) {
						System.out.println("IO error is: "+e1.getMessage());
					}				
		break;

	case 4:
					System.out.println("All Patients Details..");
					System.out.println(patientList);
	break;
	case 5:			
					ArrayList<Doctor> docList = new ArrayList<Doctor>();
			try {
				is = new FileInputStream(new File("doctor.json"));
				docList= mapper.readValue(is,docRef);
			} catch (IOException e) {
				e.printStackTrace();
			}
					appoint=Management.appoint(docList);
	break;
	case 6:
					System.out.println("Printing All Appointments...");
					appoint.putAll(appoint);
					System.out.println(appoint);
	break;
	case 7:
					System.out.println("1.Enter Docotor Id");
					int did1=scan.scannerInt();
					doctorList=Management.FindById(doctorList,did1);
					System.out.println(doctorList);
						
	case 8:
					//Search Patients by Mobile Number
					System.out.println("Enter Patients Mobile Number");
					String avail1=scan.scannerString();
					patientList=manage.FindByava1(patientList,avail1);
					System.out.println(patientList);
	break;
	case 9:
					Management.popularity();
					
	break;
	case 0:
					System.exit(0);
	break;
		
	default :		System.out.println("Wrong choice, choose carefully");
	break;
		}
		String[] args=null;
		ClinicManagementMain.main(args);
	}
	
	
	
	

}
