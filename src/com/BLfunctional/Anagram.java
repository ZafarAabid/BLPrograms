package com.BLfunctional;


public class Anagram {
	public static void main(String asd[])
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter two strings");
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		Utility.findAnagram(str1, str2);
	}

}
