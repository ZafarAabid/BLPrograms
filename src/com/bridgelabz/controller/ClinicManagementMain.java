package com.bridgelabz.controller;
import com.bridgelabz.utility.*;
/**Clinic Management program to save all the addresses on it.   
 * controller--> main(main method always stay in base file)
 * 
 * model     --> objects of person and address
 * repository--> file related task
 * service   --> interfaces and its implementation, 
 * 				 business logic
 * utility   --> for reusable codes
 */public class ClinicManagementMain {
	static Scan scan = new Scan();
	static Utility util = new Utility();
	
	public static void main(String[] args) 
	{
		System.out.println();
		System.out.println("----------W3Lc0m3---------");
		System.out.println("1.add  Doctor");
		System.out.println("2.add Patient");
		System.out.println();
		System.out.println("3.Print  Doctors");
		System.out.println("4.Print Patients");
		System.out.println();
		System.out.println("5.Take Appointment");
		System.out.println("6.PrintAppointments");
		System.out.println();
		System.out.println("7.search  Doctor");
		System.out.println("8.search Patient");
		System.out.println();
		System.out.println("9.most popular Doct");
		System.out.println();
		System.out.println("0.exit");
		
		
		int choice=scan.scannerInt();
		util.hospital(choice);
		
	}
}
