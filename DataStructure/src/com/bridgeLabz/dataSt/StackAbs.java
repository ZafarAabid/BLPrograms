package com.bridgeLabz.dataSt;



public class StackAbs {
	 private static int length=0;
	 private static Node top=null;
	 
	 class Node
		{
			Node(){}
			
			private char data;
			private Node next;
			public Node(char data)
			{
				this.data=data;
				this.next=null;
			}
		}
	 
	 public static Node stack()
	 {
		 Node top=null;
		return top;
	 }

	 public void push(char opening)
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
	 
	 public char pop(char opening)
	 {
		 char result = 0;
		 if(top!=null)
		 {
			 result=top.data;
			 top=top.next;
			 length--;
		 }
		 return result;
	 }
	 
	 
	 public char peek()
	 {
		 return (top==null)?null:top.data;
	 }
	 
	 
	 public static boolean isEmpty()
	 {
		 if(top==null)
			 return true;
		 else
			 return false;
	 }
	 
	 public static int size()
	 {
		 return length;
	 }

}
