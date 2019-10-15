package com.bridgelabz.utility;
import java.io.*;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.model.Person;
import org.codehaus.jackson.map.*;
public class Utility {
	static File file;
	static ObjectMapper mapper= new ObjectMapper();
	public static void convertJavaToJson(Person object)
	{
				Person person =(Person) object;
		String state=person.getAddress().getState();
		String path="/home/user/eclipse-workspace/AddressBook/Books/"+state+".json";
		file=new File(path);
			try {	
				InputStream is = new FileInputStream(new File(path));
				TypeReference<List<Person>> typeRef = new TypeReference<List<Person>>() {};
				List<Person> persons= mapper.readValue(is,typeRef);
				persons.add(object);
				mapper.writeValue(file, persons);
			} catch (JsonGenerationException e) {
				System.out.println("error is: "+e.getMessage());

			} catch (JsonMappingException e) {
				System.out.println("error is: "+e.getMessage());
			} catch (IOException e) {
				System.out.println("error is: "+e.getMessage());
			}
		
		System.out.println("\nContact added\n\n");
	}
	
	
	
	public static <T> List<Person> convertJsonToJava(File obj,Class<T> cls)
	{
		 List<Person> list=null;
		try {
			
			InputStream is = new FileInputStream(obj);
			TypeReference<List<Person>> typeRef = new TypeReference<List<Person>>() {};
			List<Person> persons= mapper.readValue(is,typeRef);
			list =persons;
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	
	
	public static void read(File file2) {

				BufferedReader bufferedReader = null;
				FileReader fileReader = null;
				try {
					fileReader = new FileReader(file2);
					bufferedReader = new BufferedReader(fileReader);
					
					int val = 0;
					while ((val = bufferedReader.read()) != -1) {
						char c = (char) val;
						//prints the character
						System.out.print(c);
					}
				} catch (Exception e) {e.printStackTrace();}
				finally{
						if (fileReader != null) 
							try {fileReader.close();}
						catch (IOException e) {e.printStackTrace();}
						
						if (bufferedReader != null) 
							try {bufferedReader.close();}
						catch (IOException e) {e.printStackTrace();}
						}
		}
	public static void getAllFiles() {
		File folder = new File("/home/user/eclipse-workspace/AddressBook/Books");
		File[] listOfFiles = folder.listFiles();
		System.out.println("\nRoot directory contains these files\n");
		  System.out.println("------------------------------");
		  for (int i = 0; i < listOfFiles.length; i++) {
		  if (listOfFiles[i].isFile()) {
		    System.out.println("File " + listOfFiles[i].getName());
		  } 

//		  else if (listOfFiles[i].isDirectory()) {
//		    System.out.println("Directory " + listOfFiles[i].getName());
//		  }
		}
		  System.out.println("------------------------------");				
	}
	

	
	
	
	
/**	
	
	InputStream is = new FileInputStream(new File("Inventory.json"));
	TypeReference<List<Product>> typeRef = new TypeReference<List<Product>>() {};
	List<Product> persons= mapper.readValue(is,typeRef);			
	for(Product p:persons)
		System.out.println("name is :"+p.getProdName()+" city is :"+
				p.getUnitPrice()+"  first Car is:"+p.getUnitsTotal());

*/

}

