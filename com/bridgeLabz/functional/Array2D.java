/**
 *program to print 2D array of user defined rows and columns
*/

package com.bridgeLabz.functional;
public class Array2D {
	public static void main(String asd[])
	{
		Utility u= new Utility();
		System.out.println("Enter number of rows and columns");
		int rows= u.ScannerInt();
		int cols=u.ScannerInt();
		
		int outputArray[][]=u.ReadArray(rows,cols);
		
		for (int i=0;i<cols;i++)
		{for(int j=0;j<rows;j++)
		{
			int ar= outputArray[i][j];
				System.out.print(ar+" ");
		}
		
	System.out.println();
}
	}
}
