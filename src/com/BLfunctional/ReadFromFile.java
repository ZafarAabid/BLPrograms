package com.BLfunctional;

// Java Program to illustrate reading from Text File 
// using Scanner Class 
import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner; 
public class ReadFromFile 
{ 
public static void main(String[] args) throws Exception 
{ 
	// pass the path to the file as a parameter 
	File file = new File("fileso.txt"); 
	String data="Xfr,Mugdha,hide,show,Mukud,Mangesh";
	try {
            Files.write(Paths.get("fileso.txt"), data.getBytes());
        } 
	catch (IOException e) {
            e.printStackTrace();
        }
	Scanner sc = new Scanner(file);
	String outMsg=sc.nextLine();
	String[] splitedwords=outMsg.split(",");

	for (int i = 0; i < splitedwords.length; i++)
		System.out.println(splitedwords[i]);
	
	
	System.out.println("Enter the word you want to search");
	

}
} 
