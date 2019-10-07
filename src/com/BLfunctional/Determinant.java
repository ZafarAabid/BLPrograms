package com.BLfunctional;

import java.util.Scanner;

class Determinant
	{
		private Scanner sc;
		public Determinant()
		{		sc = new Scanner(System.in);
			double[][] mat=new double[3][3];
			System.out.println("Enter the elements of 3x3 matrix");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
			{
				mat[i][j]=sc.nextDouble(); 
			}

			execute(mat);
//			transpose(mat);
		}
		public void transpose(double[][] mat)
		{
			double[][] trans = new double[3][3];
			for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
			{
				trans[i][j]=mat[j][i];
			}			
			for(int i=0;i<3;i++)
			{
			for(int j=0;j<3;j++)
				System.out.print(trans[i][j]);
			System.out.println("");
			}
		}
		public void execute(double[][] mat)
		{

			double determinant;
			double temp1= (mat[0][0]*((mat[1][1]*mat[2][2])-(mat[1][2]*mat[2][1])));
			double temp3=(mat[0][2]*((mat[1][0]*mat[2][1])-(mat[1][1]*mat[2][0])));
			double temp2 = (mat[0][1]*((mat[1][0]*mat[2][2])-(mat[1][2]*mat[2][0])));
			determinant=temp1-temp2+temp3;
			System.out.println("Dtereminant will be "+determinant);
}
		public static void main(String asd[])
		{
			new Determinant();	
		}
		

	}



