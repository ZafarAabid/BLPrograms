package com.bridgeLabz.dataSt;

public class UnOrderedList {
	static UnOrderedList o= new UnOrderedList();
	 static Node head=null;
	 class Node
	{
		Node(){}
		
		private String data;
		private Node next;
		public Node(String data)
		{
			this.data=data;
			this.next=null;
		}
	}
	 
		public static Node list()
		{
			return head;
		}


	public static  void addNode(String data)
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
	
	public static  void removeNode(String data)
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
			while(!temp1.data.equals(data))
			{
				temp=temp.next;
				temp1=temp1.next;
			}
			if(temp1.data.equals(data))
			{
				temp.next=temp1.next;
			}
		}
			
			
	}
	
	
	
	public static  boolean searchNode(String data)
	{
		if(head==null)
		{
			System.out.println("Empty List");
			return false;
		}
		else
		{
			Node temp=head;
			
			while(!temp.data.equals(data))
				temp=temp.next;
			if(temp.data.equals(data))
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
