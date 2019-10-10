/**Desc -> Create a Program which creates Banking Cash Counter
 *   where people come in to deposit Cash and withdraw Cash.
 *   Have an input panel to add people to Queue to either
 *   deposit or withdraw money and dequeue the people.
 *   Maintain the Cash Balance.
b. I/P -> Panel to add People to Queue to Deposit or Withdraw
     Money and dequeue
c. Logic -> Write a Queue Class to enqueue and dequeue people
     to either deposit or withdraw money and maintain the cash balance
d. O/P -> True or False to Show Arithmetic Expression is balanced or not.
*/
package com.bridgelabz.datast;

import com.Scan;

public class QueueTest {
	public static void main(String asd[])
	{
		int balance=100000;
		QueueUtil util1 = new QueueUtil();
		QueueUtil util2 = new QueueUtil();
		
		System.out.println("****************welcome to bank****************");
		System.out.println("Press 1 for withdraw...");
		System.out.println("Press 2 for deposit...");
		int choice1=0;
		while(choice1 !=3)
		{
			 int choice=Scan.ScannerInt();
				
		
			if(choice==1)
			{
				System.out.println("Enter the amount to withdraw");
				int amount=Scan.ScannerInt();
				System.out.println("customer wants to withdraw  "+amount);
				if(amount < balance)
				{
					util1.enqueue(amount);
					
					balance=balance-amount;
					System.out.println("balance deducted to "+balance);
				}
				else
				{	System.out.println("bank is running out of money");
					System.out.println("plz try another day");
			}}
			if(choice==2)
			{
				System.out.println("Enter the amount to diposit");
				int amount=Scan.ScannerInt();
				System.out.println("customer wants to withdraw  "+amount);
				util1.enqueue(amount);
				if(balance < 500000)
				{
					util1.dequeue();
					
					balance=balance+amount;
					System.out.println("amount deposited");
					System.out.println("balance becomes "+balance);
				}
				else
				{	System.out.println("bank is running full");
					System.out.println("plz try another day");
			}}
			System.out.println("Press 1 for withdraw...");
			System.out.println("Press 2 for deposit...");
		
		choice1=choice;
		}
		
		util1.print();
	}
}
