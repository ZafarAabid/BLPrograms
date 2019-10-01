package com.bridgeLabz.functional;
import java.util.*;
import java.io.*;

public class Utility {

	static Scanner sc =new Scanner(System.in); 

	static void flipTheCoin()
	{
		for(;;)
		{
			System.out.println("press Enter to flip the coin");
			String str=sc.nextLine();
			double mr=Math.random();
			if(mr>0.5)
				System.out.println("its head,  % of head v/s tail was   "+(mr*100));
			else
				System.out.println("its tails, % of head v/s tail was   "+(100-(mr*100)));
			System.out.println();
			
		}
	}
	
	
	static void replaceString()
	{
		String str=new String("Hello <<userName>> , how are you?");
		System.out.println(str);
		System.out.println("Enter your name");
		String uName= sc.nextLine();
		String strr=str.replace("<<userName>>",uName);
		System.out.println(strr);
	}
	
	static void findLeapYear()
	{
		System.out.println("Enter the year to check");
		int year=sc.nextInt();
		if(year%400==0 && year%100!=0 && year%4==0)
		{
			System.out.println("***************It is leap year*********");
		}
		else 
			System.out.println("its not a leap year");
	}

	static void powerOf2(String asdf)
	{
		int asd=Integer.parseInt(asdf);
		System.out.println("power of 2 upto power of  "+asd+"  is");
		for(int i=1;i<=asd;i++)
		{
			int power=(int) Math.pow(2, i);
			System.out.println(power);
		}
	}
	
	static void harmonicNumbers()
	{
		System.out.println("Enter the range of harmonic number");
		double i=sc.nextInt();
		double sum = 0;
		if(i!=0)
		{	for(double j=1;j<=i;j++)
			{	sum=1.0/j;
				System.out.print(sum+"    ");
			}	
		}
		else
			System.out.println("zero is not valid");
	}
	
	
	static void primeFactors()
	{
		System.out.println("Enter the number");
		double value =sc.nextDouble();
//		for(int factor=2;factor*factor<=value;factor++)
//			while(value%factor!=0)
//			{
//				System.out.print(factor+"   ");
//				value =value/factor;
//			}
//		if(value>1)
//			System.out.println(value);
//		else
//			System.out.println();
	       for (long factor = 2; factor*factor <= value; factor++) {

	            while (value % factor == 0) {
	                System.out.print(factor + " "); 
	                value = value / factor;
	            }
	        }

        if (value > 1) System.out.println(value);
	        else       System.out.println();
	    }
		
	
		static void gamble(int stake,int goal,int trials)
		{
		        int bets = 0;        
		        int wins = 0;        

		        for (int t = 0; t < trials; t++) {

		            int cash = stake;
		            while (cash > 0 && cash < goal) {
		                bets++;
		                if (Math.random() < 0.5) cash++;     
		                else                     cash--;     
		                }
		            if (cash == goal) wins++;
		        }

		        System.out.println(wins + " wins of " + trials);
		        System.out.println("Percent of games won = " + 100.0 * wins / trials);
		        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
		}


		static void GenerateCoupen()
		{
			HashSet <String>hs=new <String>HashSet();
			char[] chars = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
			       String sb = new String("");
			       Random random = new Random();
			       for(int j=0;j<10;j++)
			       {
			       for (int i = 0; i < 10; i++) {
			           char c = chars[random.nextInt(chars.length)];
			           sb=sb+c;
			       }
			       hs.add(sb);
			        sb="";
			       }
			       Iterator it = hs.iterator();
			       while(it.hasNext())
			        System.out.println(it.next());
		
			
		}
		
		
		static void ReadArray()
		{
			System.out.println("Enter number of rows and columns");
			int row= sc.nextInt();
			int col=sc.nextInt();
			int[][] arr=new int[col][row];
			System.out.println("Enter the elements in  "+col+"X"+row+ " array");
			for (int i=0;i<col;i++)
				for(int j=0;j<row;j++)
					arr[i][j]=sc.nextInt();
			PrintWriter pw = new PrintWriter(System.out);
			for (int i=0;i<col;i++)
				for(int j=0;j<row;j++)
				{
					int ar= arr[i][j];
						pw.print(ar);
				}
		}
		
		static void additionOfThreeEqualToZero(int[] ar)
		{
			int arr[]=ar;
			System.out.println("the given array is");
			for(int i=0;i<arr.length;i++)
				System.out.print(arr[i]+"  ");
			System.out.println();
	
			System.out.println("pair of three Integers equal to zero are");
			for(int i=0;i<arr.length-2;i++)
				for(int j=1;j<arr.length-1;j++)
					for(int k=2;k<arr.length;k++)
						if(arr[i]+arr[j]+arr[k]==0)
						System.out.println(arr[i]+"  "+arr[j]+"  "+arr[k]);
		}
		
		
		
		static void stopWatch()
		{			
			double startTime=0,stopTime=0,pause=0;
			System.out.println("Press 'S' to start 'X' to stop and 'P' to pause StopWatch");
			double start=0,stop=0,time=0;
			String input=sc.next();
				do {switch(input)
				{
				case "s":
				{
						 start=System.currentTimeMillis();
						 break;
				}
				case "x":
				{
					 stop=System.currentTimeMillis();
					 break;
				}
				case "T":
				{
					time=stop-start;
					 System.out.println(time);
					 break;
				}
				
				}input=sc.next();
				}while(input!="x");
			
					
	
		}

		static void quadretic()
		{
		    System.out.println("To generate quadratic equation, Enter"
		    		+ " the values of A,B & C in \n"
		    		+ "(Ax*x+B*x+C)");
		    int A=sc.nextInt();
		    int B=sc.nextInt();
		    int C=sc.nextInt();
		    
		    String equation=new String(A+"x*x+"+B+"x+"+C);
		    System.out.println("String becomes :"+equation);
		    
		    double delta = (B*B)-(4*A*C);

					double Root1= (-B + Math.sqrt(-delta))/(2*A);
					double Root2= (-B - Math.sqrt(-delta))/(2*A);
		    
					System.out.println("Its roots will be  "+Root1+" & "+Root2); 
		}
		
		static void windchill(int temp,int velocity)
		{
			double windchill=0;
			System.out.println("given temprature is "+temp+"F  and velocity is "
					+ velocity+"miles/hr");
			System.out.println("required windchill will be");
			windchill=35.47+0.6215*temp+(0.4275*temp-35.75)*Math.pow(velocity, 0.16);
			System.out.println(windchill);
		}


		
		static void ticTacToe(String[] postion, String user1, String user2)
		{ 
			int count=0;
			boolean flag1=true,flag2=true;
			System.out.println(postion[6]+"  "+postion[7]+"  "+postion[8]);
			System.out.println(postion[3]+"  "+postion[4]+"  "+postion[5]);
			System.out.println(postion[0]+"  "+postion[1]+"  "+postion[2]);
			for (int i =1 ; i < postion.length+1; i++) 
			{
				if(flag1)
				{
					flag2=true;
					while(flag2)
					{
						System.out.println("Enter "+user1+" place");
						int place=sc.nextInt();
						if(place<10 & postion[place-1]!="X" & postion[place-1]!="O")
							{
							postion[place-1]="X";
							flag2=false;
							}
					   else {
							System.out.println("wrong position");
							System.out.print("Again ");
							flag2=true;
						 	}
						System.out.println(postion[6]+"  "+postion[7]+"  "+postion[8]);
						System.out.println(postion[3]+"  "+postion[4]+"  "+postion[5]);
						System.out.println(postion[0]+"  "+postion[1]+"  "+postion[2]);
						if((postion[0]==postion[1] & postion[1]==postion[2])||
								   (postion[0]==postion[3] & postion[3]==postion[6])||
								   (postion[2]==postion[5] & postion[5]==postion[8])||
								   (postion[1]==postion[4] & postion[4]==postion[7])||
								   (postion[6]==postion[7] & postion[7]==postion[8])||
								   (postion[3]==postion[4] & postion[4]==postion[5])||
								   (postion[0]==postion[4] & postion[4]==postion[8])||
								   (postion[2]==postion[4] & postion[4]==postion[6]))
							{
									System.out.println(user1+" wins");
							}
					}
				}
					flag1=false;
					count++;
					if(count>=9)
					{
						System.out.println("match draw");	break;    
					}
				if(!flag1)
					{
					flag2=true;
					while(flag2)
						{
							System.out.println("Enter "+user2+" place");
							int place=sc.nextInt();
							if(place<10 & postion[place-1]!="X" & postion[place-1]!="O")
							{
								postion[place-1]="O";
								flag2=false;
							}
					   else {
						   		System.out.println("wrong position");
						   		System.out.print("Again ");
						   		flag2=true;
							}
						}
					flag1=true;
					System.out.println(postion[6]+"  "+postion[7]+"  "+postion[8]);
					System.out.println(postion[3]+"  "+postion[4]+"  "+postion[5]);
					System.out.println(postion[0]+"  "+postion[1]+"  "+postion[2]);
					count++;
					if((postion[0]==postion[1] & postion[1]==postion[2])||
					   (postion[0]==postion[3] & postion[3]==postion[6])||
					   (postion[2]==postion[5] & postion[5]==postion[8])||
					   (postion[1]==postion[4] & postion[4]==postion[7])||
					   (postion[6]==postion[7] & postion[7]==postion[8])||
					   (postion[3]==postion[4] & postion[4]==postion[5])||
					   (postion[0]==postion[4] & postion[4]==postion[8])||
					   (postion[2]==postion[4] & postion[4]==postion[6]))
							System.out.println(user2+" wins");
					
					if(count>=9)
					{
						System.out.println("match draw");	break;    
					}
				}
				if(count>=9)
				{
					System.out.println("match draw");	break;    
				}
			}
		}
	
		




























}