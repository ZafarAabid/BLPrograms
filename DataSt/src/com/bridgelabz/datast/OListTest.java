
// in this program we have to pass a file which contains data
//write a program to read from file, add to the link list and 
// show input data in sorted manner


package com.bridgelabz.datast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class OListTest {
	static int[] outputArray ;
	static String action;
	static OrderedList list=new OrderedList();
	 private static int[] filedata= {1,5,4,15,21,9,2,5,61};
	
	static Scanner scanner= new Scanner(System.in);
	public static void main(String[] asd) throws FileNotFoundException
	{
		//reading a file and storing data in array
		//here data which comes are in sorted manner
		outputArray= fileCreation(filedata);
		
		
		// adding each data or array into a consecutive link list
		for (int i = 0; i < outputArray.length; i++)
		{
			list.addNode(outputArray[i]);    //add elements to list
		}
		list.printList();    //printing a sorted list
		
		
		

	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static int[] fileCreation(int[] data) throws FileNotFoundException 
	{
		int[] outputArray = new int[data.length];
	//	int search=0;
		File file = new File("filesofInts.txt"); 
	
	try {String str = "";
			for (int i = 0; i < data.length; i++) {
				str+=data[i]+" ";
			}
			System.out.println(str);
            Files.write(Paths.get("filesofInts.txt"), str.getBytes());
        } 
	catch (IOException e) {
            e.printStackTrace();
        }
	int j=0;
	Scanner sc = new Scanner(file);
	String output=sc.nextLine();
	for (int i = 0; i <= outputArray.length*2; i++) {
		
		String str="";
		while(Character.isDigit(output.charAt(i)))
			{
				str+=output.charAt(i);
				i++;
			}
		if(str!="") {int value=Integer.parseInt(str);
		outputArray[j]=value;
//		System.out.println(outputArray[j]);
		j++;}
			}
	Arrays.sort(outputArray);
	return outputArray;
	}
}
