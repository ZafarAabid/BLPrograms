package com.bridgeLabz.functional;

public class FindYourNumber{

	public static void find(int low,int up){
    
    if(low==up){		//Displaying the value
      System.out.println("Your number is : "+low);
      return;
    }
    
    int mid=(low+up)/2;			//Finding middle value between range low and up
    int ch;
    System.out.println("Press 1 : "+low+" - "+mid);
    System.out.println("Press 2 : "+(mid+1)+" - "+up);
    ch=Utility.sc.nextInt();
 
    //checking the condition and switching the limits
    if(ch==1){		//Number is in first half
      find(low,mid);
    }
    
    else{			//Number is in second half
      find(mid+1,up);
    }
	}
	public static void main(String args[]){
		System.out.println("Enter the Range  (N) :");
		int num=new Utility().sc.nextInt();
		find(0,num);
	}
}
