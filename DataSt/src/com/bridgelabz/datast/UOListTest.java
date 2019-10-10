package com.bridgelabz.datast;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*; 
import com.Scan;

//program 1 to read data from file and save it in unOrdered link list
public class UOListTest {
	static String[] outputArray ;
	static String action;
	 private static String filedata="This,is,data,from,'fileso.txt',UnOrdered,LinkedListt";
	
	public static void main(String[] args) throws Exception 
	{ 
//		reading a file and storing it into output array
	
		outputArray= fileCreation(filedata);
		
		for (int i = 0; i < outputArray.length; i++) 
		{
			UnOrderedList.addNode(outputArray[i]);//adding data to list
		}
		
		System.out.println("Enter the word ");
		String data =Scan.ScannerString();
		
		if(UnOrderedList.searchNode(data))  //return true or false
			{
			System.out.println("already exist and will be deleted");
			UnOrderedList.removeNode(data);   //command to remove data
			}
		else
			{
				System.out.println("its new data and should be added");
			UnOrderedList.addNode(data);  //command to add data
			}
					
		UnOrderedList.printList();       // print list
		
		System.out.println("\nisEmpty="+UnOrderedList.isEmpty());
		System.out.println("size="+UnOrderedList.size());//size
			
		
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