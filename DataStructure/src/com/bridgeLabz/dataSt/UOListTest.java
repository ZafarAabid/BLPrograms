package com.bridgeLabz.dataSt;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*; 


public class UOListTest {
	static String[] outputArray ;
	static String action;
	 private static String filedata="This,is,data,from,'fileso.txt',UnOrdered,LinkedListt";
	
	static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) throws Exception 
	{ 
		outputArray= fileCreation(filedata);
		
		for (int i = 0; i < outputArray.length; i++) 
		{
			UnOrderedList.addNode(outputArray[i]);
		}
		
		System.out.println("Enter the word ");
		String input = scanner.next();
		
		if(UnOrderedList.searchNode(input))
			UnOrderedList.addNode("data");
					
		UnOrderedList.printList();
		System.out.println(UnOrderedList.isEmpty());
		System.out.println(UnOrderedList.size());
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static String[] fileCreation(String data) throws FileNotFoundException 
		{
			String[] outputArray;
			String search="";
			File file = new File("fileso.txt"); 
		
		try {
	            Files.write(Paths.get("fileso.txt"), data.getBytes());
	        } 
		catch (IOException e) {
	            e.printStackTrace();
	        }
		
		Scanner sc = new Scanner(file);
		String output=sc.nextLine();
		outputArray=output.split(",");
		for (int i = 0; i < outputArray.length; i++) 
		{
			System.out.println(outputArray[i]);
		}
		return outputArray;
		}
}