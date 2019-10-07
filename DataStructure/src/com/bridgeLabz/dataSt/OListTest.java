package com.bridgeLabz.dataSt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class OListTest {
	static int[] outputArray ;
	static String action;
	 private static int[] filedata= {1,5,4,15,21,9,2,-5,61,-7};
	
	static Scanner scanner= new Scanner(System.in);
	public static void main(String[] asd) throws FileNotFoundException
	{
		outputArray= fileCreation(filedata);
		
		

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
	
	Scanner sc = new Scanner(file);
	String output=sc.nextLine();
	for (int i = 0; i < outputArray.length; i++) {
		while(Character.isDigit(output.charAt(i)))
			outputArray[i]=output.charAt(i);
	}
	
	for (int i = 0; i < outputArray.length; i++) 
	{
		System.out.println(outputArray[i]);
	}
	return outputArray;
	}
}
