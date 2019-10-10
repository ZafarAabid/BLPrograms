package com.bridgelabz.datast;

public class StackInts<T> {
	 private  int length=0;
	 private  Node top=null;
	 
	 class Node
		{
			Node(){}
			
			private T data;
			private Node next;
			public Node(T data)
			{
				this.data=data;
				this.next=null;
			}
		}
	 
	 public  Node stack()
	 {
		 Node top=null;
		return top;
	 }

	 public void push(T opening)
	 {
		 Node node=new Node(opening);
		 if(top==null)
			 top=node;
		 else
		 {
			 node.next=top;
			 top = node;
		 }
		 length++;
	 
	 }
	 
	 public T pop()
	 {
		 T result = null;
		 if(top!=null)
		 {
			 result=top.data;
			 top=top.next;
			// System.out.println(top.data);
			 length--;
		 }
		 return result;
	 }
	 
	 
	 public T peek()
	 {
		 return (top==null)?null:top.data;
	 }
	 
	 
	 public  boolean isEmpty()
	 {
		 if(top==null)
			 return true;
		 else
			 return false;
	 }
	 
	 public  int size()
	 {
		 return length;
	 }

}
