/**
a. Desc -> Read .a List of Numbers from a file and arrange
   it ascending Order in a Linked List. Take user input
   for a number, if found then pop the number out of the
   list else insert the number in appropriate position
b. I/P -> Read from file the list of Numbers and take user
   input for a new number
c. Logic -> Create a Ordered Linked List having Numbers
   in ascending order.
d. O/P -> The List of Numbers to a File.
*/

package com.bridgeLabz.dataSt;

public class OrderedList {
	static OrderedList o= new OrderedList();
	 static Node head=null;
	 class Node
	{
		Node(){}
		
		private int data;
		private Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	 
		public static Node Orderedlist()
		{
			return head;
		}


	public static  void addNode(int data)
	{
		if(head==null)
		{
			Node node = o.new Node(data);
			node.next=head;
			head = node;
			
		}
		else
		{
			Node temp=null;
			temp=head;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=o.new Node(data);
		}
	}
	
	public static  void removeNode(int data)
	{
		if(head==null)
		{
			System.out.println("Empty List");
			return;
		}
		else
		{
			Node temp=head;
			Node temp1=head.next;
			while(temp1.data!=data)
			{
				temp=temp.next;
				temp1=temp1.next;
			}
			if(temp1.data==data)
			{
				temp.next=temp1.next;
			}
		}
			
			
	}
	
	
	
	public static  boolean searchNode(int data)
	{
		if(head==null)
		{
			System.out.println("Empty List");
			return false;
		}
		else
		{
			Node temp=head;
			
			while(temp.data!=data)
				temp=temp.next;
			if(temp.data==data)
				return true;
			else 
				return false;
		}	
	}
	
	
	
	
	public static void printList()
	{

		Node tempp=head;
		while(tempp.next!=null)
		{
			System.out.println(tempp.data);
			tempp=tempp.next;
		}
		System.out.println(tempp.data);
	}
	
	
	
	public static boolean isEmpty()
	{
		if(head==null)
			return true;
		else
			return false;
	}
	
	
	public static int size()
	{
		int count=0;
		Node tempp=head;
		while(tempp.next!=null)
		{
			tempp=tempp.next;
			count++;
		}
		
		return count;
	}
}

