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

	
	
  
	
	
	
	
	
	

}
