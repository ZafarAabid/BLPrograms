package com.bridgelabz.utility;
import java.io.*;
import java.util.Random;


import org.codehaus.jackson.map.*;
public class Utility {
	static File file;
	static ObjectMapper mapper= new ObjectMapper();
	public String[][] createCards() {
		String[] suit= {"C","D","H","S"};
		String[] rank= {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		String[][] playersCard = new String[4][9];
		Random random1=new Random();
		Random random2=new Random();
		UnOrderedList list = new UnOrderedList();
		for (int j = 0; j < 4; j++)
		for (int i = 0; i < 9; i++) 
		{
			String card=rank[random2.nextInt(rank.length)]+"-"+suit[random1.nextInt(suit.length)]+"  ";
			
			for (int k = 0; k < 1; k++) {
				list.addNode(card);
				playersCard[j][i]=card;
			}
			if(!list.contains(card))
				{	playersCard[j][i]=card;
					list.addNode(card);
				}
			else
				i--;
		}
		
		
		return playersCard;
	}
	
	
	public String[][] sort(String[][] playersCard) {
		
		String[][] cards=playersCard;
		String temp="";
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 9; j++) {
				for (int k = 0; k < 9; k++) {
					if(cards[i][j].charAt(0) >(cards[i][k]).charAt(0))
					{	temp=cards[i][j];
					cards[i][j]=cards[i][k];
					cards[i][k]=temp;
					}
				}
			}
		}
		return cards;
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

