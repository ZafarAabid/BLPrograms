package com.bridgelabz.programs;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.utility.Utility;

public class Inventory {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		JSONObject jObj = new JSONObject();
		Product product1 = new Product("Rice","10Kg",30);
		Product product2 = new Product("Pulses","2Kg",72);
		Product product3 = new Product("Wheat","5Kg",40);
		JSONArray jarray = new JSONArray();
		ObjectMapper mapper =new ObjectMapper();
		ArrayList<Product> list = new ArrayList<Product>();
		File file = new File("Inventory.json");
		try {
			list.add(product1);
			list.add(product2);
			list.add(product3);
			mapper.writeValue(file,list);
			
			list=mapper.readValue(file, ArrayList.class);
			System.out.println("\n"+list+"\n");
			
			InputStream is = new FileInputStream(new File("Inventory.json"));
			TypeReference<List<Product>> typeRef = new TypeReference<List<Product>>() {};
			List<Product> persons= mapper.readValue(is,typeRef);			
			for(Product p:persons)
				System.out.println("name is :"+p.getProdName()+" city is :"+
						p.getUnitPrice()+"  first Car is:"+p.getUnitsTotal());
		
			}
		catch (Exception e) {
			System.out.println("EXCEPTION: "+e.getMessage());
		}
	}

}
