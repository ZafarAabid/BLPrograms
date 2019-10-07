package com.BLfunctional;


public class BubbleSort {
	public static void main(String args[])
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the lenth of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Elements of array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
}


}
