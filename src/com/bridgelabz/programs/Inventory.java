package com.bridgelabz.programs;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
/**
 * A piece of code that uses the json file format to save and arrange shop 
   like wheat rice pulses and all that
   Further more, it may also be used to manage that things so on and so forth
   it uses another class of name PRODUCT to produce POJOs of products*/
public class Inventory {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		Product product1 = new Product("Rice","10Kg",30);
		Product product2 = new Product("Pulses","2Kg",72);
		Product product3 = new Product("Wheat","5Kg",40);
		ObjectMapper mapper =new ObjectMapper();
		ArrayList<Product> list = new ArrayList<Product>();
		File file = new File("Inventory.json");
		try {
			list.add(product1);
			list.add(product2);
			list.add(product3);
			mapper.writeValue(file,list);
			
			/**object mapper to map json to java data*/
			list=mapper.readValue(file, ArrayList.class);
			System.out.println("\n"+list+"\n");
			
			
			/**Code of MANAGE INVENTORY */
			InputStream is = new FileInputStream(new File("Inventory.json"));
			TypeReference<List<Product>> typeRef = new TypeReference<List<Product>>() {};
			List<Product> product= mapper.readValue(is,typeRef);			
			for(Product p:product)
				System.out.println("NAME :"+p.getProdName()+" PRIZE :"+
						p.getUnitPrice()+"  /KG PKTS :"+p.getUnitsTotal()+"TOTAL");
		
			}
		catch (Exception e) {
			System.out.println("EXCEPTION: "+e.getMessage());
		}
	}

}
