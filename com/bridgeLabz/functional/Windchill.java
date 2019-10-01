/*Write a program WindChill.java that takes two double 
 * 				 command-line arguments t and v 
 * and prints the wind chill.
 *  Use Math.pow(a, b) to compute ab.Given the temperature t 
 *  (in Fahrenheit) and the wind speed v (in miles per hour),
 *  the National Weather Service defines the effective
 *   temperature (the wind chill) to be:
Note : the formula is not valid if t is larger than 50 in
 absolute value or if v is larger than 120 or less than 3
  (you may assume that the values you get are in that range).
*/
package com.bridgeLabz.functional;

public class Windchill {
	public static void main(String asd[])
	{
		System.out.println("using command line args");
		int temp= Integer.parseInt(asd[0]);
		int vel=Integer.parseInt(asd[1]);
		Utility.windchill(temp,vel);
	}
	

}
