package com.bridgelabz.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bridgelabz.programs.Regex;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

/** class that used to create new Entries,validate entry & conversion of java to json and vice versa,
 * using ObjectMapper class*/
public class Utility {
	static SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
	static ArrayList<Entry> list = new ArrayList<Entry>();
private static ObjectMapper mapper = new ObjectMapper();
static Scan scan = new Scan();
	static
	{
	mapper = new ObjectMapper();
	}
	public static String convertJavaToJson(Object object)
	{String result = "";
		try {
			result=mapper.writeValueAsString(object);
			System.out.println(result);
		} catch (JsonGenerationException e) {
			System.out.println("error is:"+e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println("error is:"+e.getMessage());
		} catch (IOException e) {
			System.out.println("error is:"+e.getMessage());
		}
		return result;
		
	}
	
	
	public static <T> T convertJsonToJava(String json,Class<T> cls)
	{	T result=null;
	try {
		result=mapper.readValue(json, cls);
	} catch (JsonParseException e) {
		e.printStackTrace();
	} catch (JsonMappingException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
		return result;
		
	}


	
	
	
	
	@SuppressWarnings("null")
	public static Entry Validation(Long number) {
		Entry entry= new Entry();
		entry.setName(null);
		try {
			InputStream is = new FileInputStream(new File("Regex.json"));
			TypeReference<List<Entry>> typeRef = new TypeReference<List<Entry>>() {};
			List<Entry> entries= mapper.readValue(is,typeRef);			
			for(Entry e:entries)
			{
				String name;
				String fullname;
				Date date;
				long num;
				if(e.getMobileNumber()==number)
				{
					name=e.getName(); 
					entry.setName(name);
					fullname= e.getFullName();
					entry.setName(fullname);
					SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
					 date=e.getDate();
					sdf.format(date);
					entry.setDate(date);
					num=e.getMobileNumber();
					entry.setMobileNumber(num);;
					break;
				}
			}
		}
		 catch (Exception e) {
			 System.out.println("EXCEPTION:"+e.getMessage());
		}
		return entry;
	}
	
	
	public static void newEntry(Long number)
	{
		String name;
		String fullname;
		Date date;
		Entry newEntry=new Entry();
		
		System.out.println("Its new entry, Please register your data first");
		System.out.println("Enter name");
		name=scan.scannerString();
		newEntry.setName(name);
		System.out.println("Enter Full name");
		fullname=scan.scannerString();
		newEntry.setName(fullname);
		 date=new Date();
		sdf.format(date);
		newEntry.setDate(date);
		newEntry.setMobileNumber(number);

		try {
			InputStream is = new FileInputStream(new File("Regex.json"));
			TypeReference<List<Entry>> typeRef = new TypeReference<List<Entry>>() {};
			List<Entry> list= mapper.readValue(is,typeRef);
			list.add(newEntry);
				mapper.writeValue(new File("Regex.json"),list);
		} catch (Exception e) {	System.out.println("EXCEPTION: "+e.getMessage()); }
		String[] args=null;
		Regex.main(args);
	}





	public static void start() {
		System.out.println("Hello <<name>>, We have your full\n" + 
				"name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.\n" + 
				"Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.");

				
	} 








}

