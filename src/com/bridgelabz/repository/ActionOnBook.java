package com.bridgelabz.repository;

import com.bridgelabz.controller.AddressBookMain;
import com.bridgelabz.services.AddressBookImplementation;
import com.bridgelabz.utility.Scan;
import com.bridgelabz.utility.Utility;

public class ActionOnBook {
	static String path="/home/user/eclipse-workspace/AddressBook/Books/";
	static Scan scan = new Scan();
	static int actionOnBook = 0;
	static AddressBookImplementation implement = new AddressBookImplementation();
	
	public static void actionOnBook()
	{
		System.out.println("1. add new Book");
		System.out.println("2. Open Book");
		System.out.println("3. show List");
		System.out.println("4. Delete Book");
		System.out.println("5. quit");
		System.out.println("6. Back");
		
		actionOnBook=scan.scannerInt();
		switch(actionOnBook)
		{
		case  1:	implement.newAddressBook(path);	break;
		case  2:	implement.openBook();       break;
		case  3:	Utility.getAllFiles();			break;
				
		case  4:	
					Utility.getAllFiles();
					System.out.println("Which File do you want to delete");
					String name=scan.scannerString();
					implement.deleteBook(name);  
					                                break;
		case  5:	System.exit(0);	                break;
		case  6:	AddressBookMain.start();	                break;
		default:System.out.println("Wrong choice re-enter");
		actionOnBook();

		}
		ActionOnBook.actionOnBook();
	}

}
