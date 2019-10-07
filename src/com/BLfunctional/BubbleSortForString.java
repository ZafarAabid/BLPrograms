package com.BLfunctional;


public class BubbleSortForString {
	
	public static void main(String asd[])
	{
		String[] str={"asd","asdf","dsa","aaa","abc","zzzz","zz"};
		System.out.println("Given String is");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]+"   ");
		}
		Utility.bubbleSortForString(str);
		
	}
	
}