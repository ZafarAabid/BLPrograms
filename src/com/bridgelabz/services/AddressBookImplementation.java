package com.bridgelabz.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.Address;
import com.bridgelabz.model.Person;
import com.bridgelabz.utility.Scan;
import com.bridgelabz.utility.Utility;

public class AddressBookImplementation implements AddressBook {

	static Scan scan = new Scan();
	static ObjectMapper mapper= new ObjectMapper();
	static String path="/home/user/eclipse-workspace/AddressBook/Books/";
	@Override
	public  void addPerson() {
		System.out.print("firstName:");		String firstName   = scan.scannerString();
		System.out.print("lastName:");      String lastName    = scan.scannerString();
		System.out.print("phoneNumber:");   long phoneNumber = scan.scannerLong();
		System.out.print("State:");		    String state       = scan.scannerString();
		System.out.print("City:");          String city        = scan.scannerString();
		System.out.print("zipCode:");       int zipCode     = scan.scannerInt();
		
		Address address=new Address(city, state, zipCode);
		Person person = new Person(firstName, lastName, phoneNumber, address);
		Utility.convertJavaToJson(person);
		}
	@Override
	public void deletePerson() {
		long number=0;
		String name=null;
		System.out.println("Enter the name of file");
		name=scan.scannerString();
		System.out.println("Enter Phone number as ID");
		number =scan.scannerLong();
		int position=0;
		boolean flag=false;
		String path=AddressBookImplementation.path+name+".json";
		File file=new File(path);
		List<Person> list=(List<Person>) Utility.convertJsonToJava(file,List.class);
		for(Person p:list)
		{	if(p.getMobileNumber()!=number)
			position++;
			if(p.getMobileNumber()==number)
			{flag=true;
			break;}
		
		
		}
		if(flag)
		{
			list.remove(position);
			flag=false;
		}
		
		try {
			mapper.writeValue(file, list);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void editInfo() {
		
	}
	@Override
	public AddressBook sortBook() {
		return null;
	}
	@Override
	public void print() {
		String name=null;
		System.out.println("Enter the name of file");
		name=scan.scannerString();
		String path=AddressBookImplementation.path+name+".json";
		File file=new File(path);
		List<Person> list=(List<Person>) Utility.convertJsonToJava(file,List.class);
		for(Person p:list)
			System.out.println("name is :"+p.getFirstName()+"  "+p.getLastName()+
							   "\tMobileNumber:"+p.getMobileNumber()+
							   ", "+p.getAddress().getState()+
							   "\tAddress is :"+p.getAddress().getCity()+
							   ", "+p.getAddress().getZip());
;
		}
	@Override
	public void sortByLastName() {
		
	}
	@Override
	public void sortByZip() {
		
	}
	@SuppressWarnings("resource")
	@Override
	public File newAddressBook(String path) {
		System.out.println("Enter the name of the book");
		String book=scan.scannerString();
		book=path+book+".json";
		File file =new File(book);
		try {
			new BufferedWriter(new FileWriter(file)).write("");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}
	@Override
	public void deleteBook(String name) 
	{
		String path= AddressBookImplementation.path+name+".json";
		File file = new File(path);
        if(file.delete()){
            System.out.println(" File deleted \n");
        }else System.out.println("File doesn't exist\n");
        
	}
	@Override
	public void close() {
		
	}

	@Override
	public void save() {
		
	}
	@Override
	public void saveAs(String str) {
		
	}

	@Override
	public void quit() {
		System.exit(0);
		
	}
	@Override
	public void openBook(String name) {
		String path="/home/user/eclipse-workspace/AddressBook/Books/";
		path=path+name+".json";

		File file=new File(path);
		Utility.read(file);
		
	}

	
}
