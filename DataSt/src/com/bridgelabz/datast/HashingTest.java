package com.bridgelabz.datast;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.Scan;

public class HashingTest {

	public static void main(String[] args) throws FileNotFoundException 
	{
		HashUtility utility =new HashUtility();

		File file=new File("/home/admin1/eclipse-workspace/DataSt/hashingNumbers");    
		Scanner fileinput;

		fileinput = new Scanner(file).useDelimiter(",");
 
		int line;
     while(fileinput.hasNextInt())
     {
			line = fileinput.nextInt();
			utility.insert(line);
     }
	utility.printHashTable();
			
	
	System.out.println("Enter the random Element");
	int random=Scan.ScannerInt();
	 
	
	}
			
			
}
