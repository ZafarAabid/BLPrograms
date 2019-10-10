/**Add the Prime Numbers that are Anagram in the Range
 *  of 0 - 1000 in a Queue using the Linked List
 *   and Print the Anagrams from the Queue. Note no
 *    Collection Library can be used.

 * */

package com.bridgelabz.datast;

import java.util.Arrays;

public class PrimeNumbers {
	
	
	
	public static int[] Primes()
	{
		int n=1000;
		int[] primeNumbers=new int[n];
		int j=0;
		for(int i =2;i<n;i++)
		{
			 int num = i;
		        boolean flag = false;
		            if(num % 2 == 0)
		            {
		                flag = true;
		            }
		        
		        if (!flag)
		        { 	primeNumbers[j]=num;  j++;}
		}
		return primeNumbers;
	}
	
	
	
	
	
	
	public static int[] printAnagram(int range)
	{
		int[] anagrams = new int[range];
		int position=0;
	  int[] prime = new int [range];
	  for (int i = 2; i < range; i++)
	  {
	 int  count = 0;
	 for (int j = 2; j <= i / 2; j++)
	 {
	   if (i % j == 0)
	   {
	   count++;
	   }
	 }

	 if (count == 0)
	 {
	            prime[i] = i ;
	 }
	 if(prime[i] != 0)
	 for (int j = 1; j <prime.length; j++)
	 {
	  if(prime[i] != prime[j])
	  {
	    if(isPrimeAnagram(prime[i],prime[j]))
	    {
	  System.out.println(prime[i]+ " isAnagram of  " +prime[j]);
	  	anagrams[position]=prime[j];
	  	position++;
	    }
	  }
	 }
	   }
	  return anagrams;
	}
	
	

	 public static boolean isPrimeAnagram(int a1, int a2)
	 {
	 boolean flag = false;
	 String s1 = String.valueOf(a1);
	 String s2 = String.valueOf(a2);

	 char[] c1 = s1.toCharArray();
	 char[] c2 = s2.toCharArray();

	 if(c1.length == c2.length)
	 {
	 Arrays.sort(c1);
	 Arrays.sort(c2);
	 }
	 String s3 = new String(c1);
	 String s4 = new String(c2);
	 if(s3.equals(s4))
	 {
	 return true;
	 }
	 return false;
	 }
	
}
