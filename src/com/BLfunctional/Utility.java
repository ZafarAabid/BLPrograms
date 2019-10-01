package com.BridgeLabz.Functional;
import java.util.Arrays;
import java.util.*;

public class Utility 
{
	
	public static void findAnagram(String str1, String str2)
		{
			boolean flag = false;
			if(str1.length()!=str2.length())
			{
				System.out.println("it is Not an anagram");
			}
			else
			{
				char[] ch1=str1.toCharArray();
				char[] ch2=str2.toCharArray();
				Arrays.sort(ch1);
				Arrays.sort(ch2);
				for(int i=0;i<ch1.length;i++)
					if(ch1[i]!=ch2[i])
						flag=true;
				if(flag)
					System.out.println("not anagram");
				else
					System.out.println("this strings are anagram to each other");						
			}
		}

////////////////////////////////////////////////////////////
	
	public static int[] Primes(int n)
	{
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
	
////////////////////////////////////////////////////////////////
	
	public static int[] findpalindrome(int[] arr) 
	{
		boolean flag = false;
		int[] palidromes=new int[arr.length];
		int count=0;
		int num =0 , reverse = 0, remainder, original;
	       
			for(int j=0;j<arr.length;j++)
			{
				reverse = 0;
				num=arr[j];
				 original = num;
		        while( num != 0 )
		        {
		            remainder = num % 10;
		            reverse = reverse * 10 + remainder;
		            num  /= 10;
		        }
		        if(original==reverse)
		        {
		        	palidromes[count]=original;
		        	count++;
		        }
			} 	
			return palidromes;
	}
//////////////////////////////////////////////////////////////////
	
	public static String binarySearchForInt(int decimal)
	{
		 int binary[] = new int[40];    
         int index = 0;
         String str="";
         while(decimal > 0){    
           binary[index++] = decimal%2;    
           decimal = decimal/2;    
         }    
         for(int i = index-1;i >= 0;i--){    
           System.out.print(binary[i]);
           str=str+binary[i];
         }    
    System.out.println();//new line
    return str;
    }
	
/////////////////////////////////////////////////////////////////
	
	static int binarySearchForString(String[] arr, String x) 
	{ 
		int lft = 0, rgt = arr.length - 1; 
		while (lft <= rgt) { 
			int med = lft + (rgt - lft) / 2; 
			int res = x.compareTo(arr[med]); 
			if (res == 0) 
				return med; 
			if (res > 0) 
				lft = med + 1; 
			else
				rgt = med - 1; 
		} 

		return -1; 
	} 
////////////////////////////////////////////////////////////////////
	public static void bubbleSort(int[] arr,int size)
	{
		System.out.println("this is given array");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Array after bubble sorting is");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(arr[i]<arr[j])
				{int temp = arr[i];
					arr[i]=arr[j];
					arr[j]= temp;}
			}
		}for(int i=0;i<size;i++)
		{
		System.out.println(arr[i]);
	}
	}
	
	////////////////////////////////////////////
	
	static void bubbleSortForString(String[] str)
	{
		String temp ="";
		String temp2="";
		for (int k = 0; k < str.length; k++) {
			for (int i = 0; i < str.length-1; i++) 
		{
			if(str[i].length()>str[i+1].length())
			{		temp=str[i];
			str[i]=str[i+1];
			str[i+1]=temp;
			}
			else if(str[i].length()<str[i+1].length())
			{
				continue;
			}
			if(str[i].length()==str[i+1].length())
			{
				for (int j=0;j<str[i].length();j++) 
				{
					int chk=(str[i]).compareTo(str[i+1]);
					if(chk>0)
					{	
					temp2=str[i];
					str[i]=str[i+1];
					str[i+1]=temp2;
					}					
				}			
			}
		}
		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}


		static void vendingMachine()
		{
			int[] availableNotes= {2000,500,200,100,50,10,1};
			int[] withdrawNotes= new int[availableNotes.length];
			String decision="";
			int mainBalance= 1000000,count=0;
			System.out.println("Total Balance in machine is 10,00,000");
			System.out.println("how much do you want to withdraw");
			while(mainBalance!=0 & decision!="quit")
			{
				int withdraw = sc.nextInt();
				int amount=withdraw;
				for (int i = 0; i < availableNotes.length; i++) {
					while(amount>availableNotes[i]-1)
					{
						amount-=availableNotes[i];
						count++;
					}
					withdrawNotes[i]=count;
					count=0;
				}
				for (int i = 0; i < availableNotes.length; i++) {
					System.out.println(availableNotes[i]+" of "+withdrawNotes[i]);
				}
				System.out.println("Rupees in change");
				System.out.println("remaining amount is"+(mainBalance-withdraw));
				
				System.out.println("Do it again or say 'quit'");
				decision=sc.next();
			}		
		}

		
		static void daysOfWeek(int d,int m,int y) {
		String[] days= {"Sunday","Monday","Tuesday","Wedday","Thursday","Firday","Satday"};
		String[] months= {"Jan","Feb","March","April","May"+
				"June","july","Aug","Sept","Oct","Nov","Dec"};
		 
		int y0 = y-(14-m) / 12;
		int	x = y0 + y0/4-y0/100 + y0/400;
		int	m0 = m + 12 *((14-m) / 12)-2;
		int	d0 = (d+x+31*m0/12) % 7;
		
		System.out.print("Its "+days[d0]+" of ");
		System.out.print(months[m-1]);
		}


		static void doConversion()
		{
			String input=sc.next();
			String temp="";
			for (int j = 0; j < input.length(); j++) {
				
			
			if(Character.isDigit(input.charAt(j)))
				temp+=input.charAt(j);
			if(Character.isAlphabetic(input.charAt(j)))
				{
				    if(input.charAt(j)=='F' ||input.charAt(j)=='f')
				    {
				    	System.out.println("its in Ferenhite, Its Celcius conversion is");
				    	int tempp=Integer.parseInt(temp);
				    	int Dc=(tempp*9/5)+32;
				    	System.out.println(Dc);
				    	
				    }
				    if(input.charAt(j)=='C' ||input.charAt(j)=='c')
				    {System.out.println("its in Celcius, Its Farenhite conversion is");
			    	int tempp=Integer.parseInt(temp);
			    	int Dc=(tempp-32)*5/9;
			    	System.out.println(Dc);}
				}
		}






}
	
	
	
	

}
