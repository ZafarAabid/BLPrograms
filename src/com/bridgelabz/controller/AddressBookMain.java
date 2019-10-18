package com.bridgelabz.controller;

import com.bridgelabz.repository.ActionOnBook;
import com.bridgelabz.repository.ActionOnPerson;
import com.bridgelabz.utility.Scan;
//import com.bridgelabz.utility.Utility;

/**AddressBook program to save all the addresses on it.   
 * controller--> main(main method always stay in base file)
 * 
 * model     --> objects of person and address
 * repository--> file related task
 * service   --> interfaces and its implementation, 
 * 				 business logic
 * utility   --> for reusable codes
 */

public class AddressBookMain {
	static Scan scan = new Scan();
	public static void main(String asd[])
	{
	start();
		}
	
	public static void start() {
		System.out.println("----------------Address Book Management----------------");
		System.out.println("Main menu\n");
		System.out.println("1. Action On Book");
		System.out.println("2. Action On Person");
		System.out.println("3. Quit");
		
		int actionOnBook = 0;
		actionOnBook=scan.scannerInt();
		switch(actionOnBook)
		{
		case  1:
			{
				ActionOnBook.actionOnBook();  		break;
			}
		case  2:
			{
				ActionOnPerson.actionOnPerson();	break;
			}
		case  3:
		{
				System.exit(0);						break;
		}

		default:System.out.println("Wrong choice re-enter");
				start();
		}

		
	
	}
}
