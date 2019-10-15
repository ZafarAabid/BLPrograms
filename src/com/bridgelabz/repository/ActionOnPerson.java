package com.bridgelabz.repository;

import com.bridgelabz.controller.AddressBookMain;
import com.bridgelabz.model.Address;
import com.bridgelabz.services.AddressBookImplementation;
import com.bridgelabz.utility.Scan;

public class ActionOnPerson {
	String firstName,lastName;
	Address address;
	int phoneNumber;
	String state,city;
	int zipCode;
	static Scan scan = new Scan();
	static AddressBookImplementation implement = new AddressBookImplementation();
	public static void actionOnPerson()
	{
		System.out.println("1. addPerson");
		System.out.println("2. deletePerson");
		System.out.println("3. editInfo");
		System.out.println("4. sortByLastName");
		System.out.println("5. sortByZip");
		System.out.println("6. print entries");
		System.out.println("7. back");
		
		
		int actionOnPerson = 0;
		actionOnPerson=scan.scannerInt();
		switch(actionOnPerson)
		{
		case  1:	implement.addPerson();	break;
		case  2:	implement.deletePerson();      break;
		case  3:	implement.editInfo();        break;
		case  4:	implement.sortByLastName(); break;
		case  5:	implement.sortByZip();   break;
		case  6:	implement.print();break;
		case  7:	AddressBookMain.start();
		default:System.out.println("Wrong choice re-enter");
		actionOnPerson();
		
		}
	actionOnPerson();
	}


}
