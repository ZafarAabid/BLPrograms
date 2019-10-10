package com.bridgelabz.datast;

public class PrimeNumberTestStack {

	public static void main(String asd[])
	{
		StackInts<Integer> stack=new StackInts<Integer>();
		PrimeNumbers queue =new PrimeNumbers();
		int arr[]=queue.Primes();
		int[] anagrams=queue.printAnagram(1000);
		for (int i = 0; i < anagrams.length; i++) 
		{
			if (anagrams[i]!=0) 
			{
				stack.push(anagrams[i]);
			}
		}
		System.out.println("--------------------");
		for (int i = 0; i < anagrams.length-2; i++) {
			if(!stack.isEmpty())
				System.out.println(stack.pop());
		}
	}
}
