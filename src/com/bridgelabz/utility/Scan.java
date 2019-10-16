package com.bridgelabz.utility;


import java.util.Scanner;
public class Scan {
	static Scanner scanner=new Scanner(System.in);
	
	public int scannerInt()
	{
		int input = scanner.nextInt();
		return input;
	}
	public double scannerDouble()
	{
		double input = scanner.nextInt();
		return input;
	}
	public String scannerString()
	{
		String input = scanner.next();
		return input;
	}
		public String scannerLine()
		{
			String input = scanner.nextLine();
			return input;
		}

	public float scannerFloat()
	{
		float input1 = scanner.nextInt();
		return input1;
	}
	public long scannerLong()
	{
		long input1 = scanner.nextLong();
		return input1;
	}

}

