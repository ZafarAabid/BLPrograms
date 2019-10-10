package com.bridgelabz.datast;

public class Anagram2dTest {

	public static void main(String asd[])
		{
			PrimeNumbers queue =new PrimeNumbers();
			int[][] arr2d = new int[10][100];
			int range=100,row=0,col=0,j=0;
			int arr[]=queue.printAnagram(1000);
			for (int i = 0; i < arr.length; i++) 
			{
				if (arr[j]!=0) 
				{
					while(arr[j]<range)
						{
						if (arr[j]!=0) 
						{	
							arr2d[col][row]=arr[j];
							row++;
							j++;
						}
						else
							break;
						}
					range+=100;
					col++;
					row=0;
				}
			}
			
			
			for (int in = 0; in < 10; in++) 
			{
				for (int jj = 0; jj < 100; jj++) 
				{
					if (arr2d[in][jj]!=0) 
						System.out.println(arr2d[in][jj]);
				}
			}
		}
	}

