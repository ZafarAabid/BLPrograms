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
package com.bridgeLabz.dataSt;

public class QueueTest {
	public static void main(String asd[])
	{
		QueueUtil util = new QueueUtil();
		util.enqueue("15");
		util.enqueue("asdf");
		util.enqueue("45");
		util.print();
	}
}
