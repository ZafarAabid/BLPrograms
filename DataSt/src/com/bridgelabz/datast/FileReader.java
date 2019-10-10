package com.bridgelabz.datast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileReader {
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
//	Arrays.sort(outputArray);
	return outputArray;
	}
}
