package com.BLfunctional;


public class PrimeNumbers {
	public static void main(String asd[])
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter the range of Prime numbers");
		int range =sc.nextInt();
		
	int[] primes=Utility.Primes(range);
		System.out.println("Prime numbers from 0 to upto"+range+" are");
		for(int j=0;j<primes.length;j++)
			if(primes[j]!=0)
				System.out.println(primes[j]);
		
		
	int[] pal=Utility.findpalindrome(primes);
		System.out.println("\n Palindrome numbers present within "
				+ "this prime array in the given range are...");
		for(int j=0;j<pal.length;j++)
			if(pal[j]!=0)
			System.out.println(pal[j]);
	}

}
