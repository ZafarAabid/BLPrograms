package com.bridgelabz.datast;

public class PrimeNumberTestQ {

	public static void main(String asd[])
	{
		QueueUtil util =new QueueUtil();
		PrimeNumbers queue =new PrimeNumbers();
		int arr[]=queue.Primes();
		int[] anagrams=queue.printAnagram(1000);
		for (int i = 0; i < anagrams.length; i++) 
		{
			if (anagrams[i]!=0) 
			{
				util.enqueue(anagrams[i]);
			}
		}
		util.print();
		}
	}

