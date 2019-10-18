package com.bridgelabz.services;

import java.io.File;

public interface AddressBook {

	void addPerson();
	
	void deletePerson();
	
	void editInfo();
	 
	AddressBook sortBook();
	
	void print();
	
	void sortByLastName();
	
	void sortByZip();
	
	File newAddressBook(String path);
	
	void openBook();
	
	void deleteBook(String name);
	
	void close();
	
	void save();
	
	void saveAs(String str);
	
	void quit();


}
