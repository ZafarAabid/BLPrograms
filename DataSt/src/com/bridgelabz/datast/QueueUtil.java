package com.bridgelabz.datast;

public class QueueUtil {

	static class Node
	{
		int data;
		Node next;
		static Node front;
		static Node rear;
		
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	public void enqueue(int data)
	{
		Node node = new Node(data);
		node.next=null;
		if(Node.rear==null)
		{
			Node.front = node;
			Node.rear = node;
		}
		else
		{
			Node.rear.next=node;
			Node.rear=node;
		}
	}
	
	Node dequeue()
	{
		Node temp=null;
		if(Node.front==null)
		{
			System.out.println("Empty Queue");
		}
		else
		{
			temp=Node.front;
			Node.front=Node.front.next;
			temp.next=Node.front;
			
		}
		return temp;
	}
	
	
	void print()
	{
		Node temp=null;
		temp=Node.front;
		if(temp==null)
		System.out.println("Queue is Empty");
		else
		{
			while(temp.next!=null)
			{
				System.out.println(temp.data+"  ");
				temp=temp.next;
			}
			System.out.println(temp.data+"  ");
		}
	}
}


	
