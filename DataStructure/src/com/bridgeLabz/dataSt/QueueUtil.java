package com.bridgeLabz.dataSt;

public class QueueUtil {

	static class Node
	{
		String data;
		Node next;
		static Node front;
		static Node rear;
		
		Node(String data)
		{
			this.data=data;
			next=null;
		}
	
	
	void enqueue(String data)
	{
		Node node = new Node(data);
		node.next=null;
		if(rear==null)
		{
			front = node;
			rear = node;
		}
		else
		{
			rear.next=node;
			rear=node;
		}
	}
	
	Node dequeue()
	{
		Node temp=null;
		if(front==null)
		{
			System.out.println("Empty Queue");
		}
		else
		{
			temp=front;
			front=front.next;
			temp.next=front;
			
		}
		return temp;
	}
	
	
	void print()
	{
		Node temp=null;
				temp=front;
		if(temp==null)
		System.out.println("Queue is Empty");
		else
		{
			while(temp.next!=null)
			{
				System.out.println(temp.data+"  ");
			}
			System.out.println(temp.data+"  ");
		}
	}
}}
