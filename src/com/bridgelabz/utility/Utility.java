package com.bridgelabz.utility;
import java.util.Scanner;

public class Utility {
	static Scanner scanner=new Scanner(System.in);
		
		public int scannerInt()
		{
			int input = scanner.nextInt();
			return input;
		}
		public double scannerDouble()
		{
			double input = scanner.nextInt();
			return input;
		}
		public String scannerString()
		{
			String input = scanner.next();
			return input;
		}
		public String nextStringLine()
		{
			String input1 = scanner.nextLine();
			return input1;
		}

		public float scannerFloat()
		{
			float input1 = scanner.nextInt();
			return input1;
		}
		public long scannerLong()
		{
			long input1 = scanner.nextLong();
			return input1;
		}

	
	
	
	
/**	
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
	
	
	
	
	InputStream is = new FileInputStream(new File("Inventory.json"));
	TypeReference<List<Product>> typeRef = new TypeReference<List<Product>>() {};
	List<Product> persons= mapper.readValue(is,typeRef);			
	for(Product p:persons)
		System.out.println("name is :"+p.getProdName()+" city is :"+
				p.getUnitPrice()+"  first Car is:"+p.getUnitsTotal());

*/

}

