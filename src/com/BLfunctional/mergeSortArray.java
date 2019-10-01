import java.util.*;
import java.io.*;

public class mergeSortArray {
	public static void main(String asd[])
	{
		Scanner sc = new Scanner(System.in);
		int mid,lo,hi;
		System.out.println("Enter the length of array");
		int len=sc.nextInt();
		String str[] = new String[len];
		String finalstr[]= new String[len];;
		System.out.println("Enter the strings to be inserted");
		lo=0;             hi=len;             mid=len/2;
		System.out.println(mid);
		
		for (int i = 0; i < str.length; i++)
			str[i]=sc.next();
		
		System.out.println(mid);
		String[] str1=new String[mid];
		String[] str2=new String[len-mid];
		for (int i = 0; i <mid; i++) 
			str1[i]=str[i];
		for (int i = 0; i <len-mid; i++) 
			str2[i]=str[i+mid];
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		int it=str1.length<str2.length?str.length:str2.length;
		for (int i = 0; i < it; i++) 
			if(str1[i].compareTo(str2[i]) < 0)
				finalstr[i]=str1[i];
			else finalstr[i]=str2[i];
			
			
		for (int i = 0; i < len; i++) {
			System.out.println(finalstr[i]);
		}
		}
	
	}