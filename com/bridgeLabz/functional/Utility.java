package com.bridgeLabz.functional;
import java.util.*;
import java.io.*;

public class Utility {

	static Scanner sc =new Scanner(System.in); 

		static void flipTheCoin(int input)     //program to flip the
		{
			double head=0,tails=0,trials=0;
			for(int i=0;i<input;i++)
			{
				double mr=Math.random();
				if(mr>0.5)
					{head++;trials++;
					System.out.print("head,   ");
					
					}
					else
					{System.out.print ("tails,  ");
					tails++;trials++;
					}
						System.out.println();
			}
			System.out.println( " % of head v/s tail was   "+(head/trials)*100);
			System.out.println( " % of tail v/s head was   "+(tails/trials)*100);
		}
	
		
	//simple program to replace part of the string using String.replace() method
		
	static String replaceString(String uName)   
	{
		String str=new String("Hello <<userName>> , how are you?");
		System.out.println(str);
		System.out.println("Enter your name");

		String strr=str.replace("<<userName>>",uName);
		System.out.println(strr);
		return strr;
	}
	
	// program to find leapYear in java 
	static void findLeapYear(int year)
	{
		if(year>999 & year<9999)
		{
		if(year%400==0 || year%100!=0 && year%4==0)
		{
			System.out.println("***************It is leap year*********");
		}
		else 
			System.out.println("its not a leap year");
	}
		else
			System.out.println("input should be in range");
		}

	//program to find table of power of 2 
	static void powerOf2(String asdf)
	{
		int asd=Integer.parseInt(asdf);          // parsing the value of int as it comes from command line argument 
		System.out.println("power of 2 upto power of  "+asd+"  is");
		for(int i=1;i<=asd;i++)
		{
			int power=(int) Math.pow(2, i);
			System.out.println(power);
		}
	}
	
	static double harmonicNumbers()			//program to write harmonic number within the given range
	{
		double sum = 0;
	while(true)
	{System.out.println("Enter the range of harmonic number");
		double i=sc.nextInt();
	
		System.out.println("its series will be");
		if(i!=0)
		{	for(double j=1;j<=i;j++)
			{	sum+=1.0/j;
			
				
			}
		System.out.println(sum);
		break;
		}
		
		else
			System.out.println("zero is not valid");
	}
	return sum;

	}
	
	
	//program to find best possible prime factors of given number
	static void primeFactors()
	{
		System.out.println("Enter the number");
		double value =sc.nextDouble();
	       for (long factor = 2; factor*factor <= value; factor++)   //validating the range
	       {

	            while (value % factor == 0) {
	                System.out.print(factor + " "); 
	                value = value / factor;
	            }
	        }

        if (value > 1) System.out.println(value);
	        else       System.out.println();
	    }
		
	// program to play Gambler game where gambler puts the valid moves and set goal  and play until he won or loss 
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

// program to generate 10 random coupon numbers using Random class
		static void GenerateCoupen()
		{
//			HashSet <String>hs=new <String>HashSet();
			String[] coupens=new String[10];
			char[] chars = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
			 int count=0,C = 0;
			 	String sb = new String("");
			       Random random = new Random();
			       for(int j=0;j<10;j++)          //generate 10 coupon
			       {
			    	  count++;
			       for (int i = 0; i < 2; i++) {		//generate coupon number
			           char c = chars[random.nextInt(chars.length)];
			           sb=sb+c;
			       }
			       
			       coupens[C]=sb;
			       C++;
			        sb="";
			       }
			       for (int i = 0; i < coupens.length; i++) {
			        System.out.println(coupens[i]);
			       }	
//			       System.out.println("Number of trials"+count);
			
		}
		
		
//		program to get the values and read it from the array
		static int[][] ReadArray(int row, int col)
		{
			int[][] arr=new int[col][row];
			System.out.println("Enter the elements in  "+col+"X"+row+ " array");
			for (int i=0;i<col;i++)
				for(int j=0;j<row;j++)
					arr[i][j]=sc.nextInt();
			return arr;
			}
		
	// program that try to find how many combination of three numbers are present
	// whose sum get equal to zero 
		static void additionOfThreeEqualToZero(int[] ar)
		{
			int arr[]=ar;
			System.out.println("the given array is");
			for(int i=0;i<arr.length;i++)
				System.out.print(arr[i]+"  ");
			System.out.println();
			System.out.println("pair of three Integers equal to zero are");
			for(int i=0;i<arr.length-2;i++)		//	iterating over first element
				for(int j=1;j<arr.length-1;j++)		//	iterating over second element
					for(int k=2;k<arr.length;k++)		//	iterating over third element
						if(arr[i]+arr[j]+arr[k]==0)			//validating output
						System.out.println(arr[i]+"  "+arr[j]+"  "+arr[k]);
		}
		
		
		// A stop watch program that take command line argument as integer value and find its elapsed time duration
		static void stopWatch()
		{			
//			double startTime=0,stopTime=0,pause=0;
			System.out.println("Press 's' to start 'x' to stop and 'q' to quit StopWatch");
			double start=0,stop=0,time=0,pause=0,resume=0;
			String input=sc.next();
				do {switch(input)
				{
				case "s":        // to get the start time
				{
						 start=System.currentTimeMillis();
						System.out.println("start time: "+ start);
						 break;
				}
				case "x":		//to get the stop time
				{
					 stop=System.currentTimeMillis();
					 System.out.println("Stoptime: "+ stop);
					 time=stop-start;
					 System.out.println(time);
					 break;
				}
				case "q":		//quit stop watch
				{
					return;
				}
				
				}input=sc.next();
				}while(input!="q");
			
					
	
		}

		//program to generate and show quadratic equation and also find roots of it
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
		    double delta = (B*B)-(4*A*C);   //finding its roots

					double Root1= (-B + Math.sqrt(-delta))/(2*A);
					double Root2= (-B - Math.sqrt(-delta))/(2*A);
		    
					System.out.println("Its roots will be  "+Root1+" & "+Root2); 
		}
		
		
		// method to find windchill ratio in air
		static double windchill(int temprature,int velocity)
		{
			double windchill=0;
			if(temprature<50 & velocity>3 & velocity<120)   //validating the range
			{
			
			System.out.println("given temprature is "+temprature+"F  and velocity is "
					+ velocity+"miles/hr");
			System.out.println("required windchill will be");
			windchill=35.74+(0.6215*temprature)+((0.4275*temprature)-35.75)*Math.pow(velocity, 0.16);
		}
			else
				System.out.println("invalid range");
				return windchill;
		}


		// TicTacToe Game         user defined input name & position to place the mark
		static void ticTacToe(String[] position, String user1, String user2)
		{ 
			int count=0;
			
			boolean flag1=true,flag2=true,win=false;
			System.out.println(position[6]+"  "+position[7]+"  "+position[8]);
			System.out.println(position[3]+"  "+position[4]+"  "+position[5]);
			System.out.println(position[0]+"  "+position[1]+"  "+position[2]);

			while(win==false)   	// flag to continue game till anyone won or match get draw 
			{
				if(flag1)			// flag which switch the user's turn
				{
					flag2=true;
					while(flag2)	// flag that decide turn is valid or not
					{
						System.out.println("Enter "+user1+" place");
						int place=sc.nextInt();
						
									// checking input place
						if(place<10 & position[place-1]!="X" & position[place-1]!="O")
							{
							position[place-1]="X";
							flag2=false;
							}
					   else {
							System.out.println("wrong position");
							System.out.println("Again ");
							flag2=true;
						 	}
						System.out.println(position[6]+"  "+position[7]+"  "+position[8]);
						System.out.println(position[3]+"  "+position[4]+"  "+position[5]);
						System.out.println(position[0]+"  "+position[1]+"  "+position[2]);
						
						//search whether the user won the game or not
						if((position[0]==position[1] & position[1]==position[2])||
								   (position[0]==position[3] & position[3]==position[6])||
								   (position[2]==position[5] & position[5]==position[8])||
								   (position[1]==position[4] & position[4]==position[7])||
								   (position[6]==position[7] & position[7]==position[8])||
								   (position[3]==position[4] & position[4]==position[5])||
								   (position[0]==position[4] & position[4]==position[8])||
								   (position[2]==position[4] & position[4]==position[6]))
						{System.out.println(user1+" wins");
						win=true;
						return;
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
							System.out.print("COMPUTER took   ");
							int place=(int) (Math.random()*10);
							System.out.println(place);
							if(place>0 & place<10 & position[place-1]!="X" & position[place-1]!="O")
							{
								position[place-1]="O";
								flag2=false;
							}
					   else {
						   		System.out.println("wrong position");
						   		System.out.print("Again ");
						   		flag2=true;
							}
						}
					flag1=true;
					System.out.println(position[6]+"  "+position[7]+"  "+position[8]);
					System.out.println(position[3]+"  "+position[4]+"  "+position[5]);
					System.out.println(position[0]+"  "+position[1]+"  "+position[2]);
					count++;
					if((position[0]==position[1] & position[1]==position[2])||
					   (position[0]==position[3] & position[3]==position[6])||
					   (position[2]==position[5] & position[5]==position[8])||
					   (position[1]==position[4] & position[4]==position[7])||
					   (position[6]==position[7] & position[7]==position[8])||
					   (position[3]==position[4] & position[4]==position[5])||
					   (position[0]==position[4] & position[4]==position[8])||
					   (position[2]==position[4] & position[4]==position[6]))
							{System.out.println(user2+" wins");
							win=true;
							return;
							}
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
	
		


























		static int ScannerInt()
		{
			int input = sc.nextInt();
			return input;
		}
		static double ScannerDouble()
		{
			double input = sc.nextInt();
			return input;
		}
		static String ScannerString()
		{
			String input = sc.nextLine();
			return input;
		}
	
		static float ScannerFloat()
		{
			float input = sc.nextInt();
			return input;
		}

}