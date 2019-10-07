package com.bridgeLabz.functional;
public class LeapYear {
	
	public static void main(String...strings)
	{
		Utility u=new Utility();
		while(true)
			{
			System.out.println("Enter the year to check");
			int year=u.ScannerInt();
		u.findLeapYear(year);
	}}

}
