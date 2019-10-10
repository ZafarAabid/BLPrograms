/**
 * a. Desc -> Create a Slot of 10 to store Chain of Numbers that belong to each Slot to
efficiently search a number from a given set of number
b. I/P -> read a set of numbers from a file and take user input to search a number
c. Logic -> Firstly store the numbers in the Slot. Since there are 10 Numbers divide
each number by 11 and the reminder put in the appropriate slot. Create a Chain
for each Slot to avoid Collision. If a number searched is found then pop it or else
push it. Use Map of Slot Numbers and Ordered LinkedList to solve the problem.
In the Figure Below, you can see number 77/11 reminder is 0 hence sits in the 0
slot while 26/11 remainder is 4 hence sits in slot 4
d. O/P -> Save the numbers in a file

 */

package com.bridgelabz.datast;
public class HashUtility
{
   private HashNode[] table = new HashNode[11];
   private int size =11;

   public boolean isEmpty()
   {
       return size == 0;
   }
   /* Function to clear hash table */
   public void makeEmpty()
   {
       int l = table.length;
       table = new HashNode[l];
       size = 0;
   }
   /* Function to get size */
   public int getSize()
   {
       return size;
   }
   /* Function to insert an element */
   public void insert(int val)
   {
       size++;
       int pos = myhash(val);        
       HashNode pointtonode = new HashNode(val);                
       if (table[pos] == null)
           table[pos] = pointtonode;            
       else
       {
           pointtonode.next = table[pos];
           table[pos] = pointtonode;
       }    
   }
   /* Function to remove an element */
   public void remove(int val)
   {
       int pos = myhash(val);    
       HashNode start = table[pos];
       HashNode end = start;
       if (start.data == val)
       {
           size--;
           table[pos] = start.next;
           return;
       }
       while (end.next != null && end.next.data != val)
           end = end.next;
       if (end.next == null)
       {
           System.out.println("\nElement not found\n");
           return;
       }
       size--;
       if (end.next.next == null)
       {
           end.next = null;
           return;
       }
       end.next = end.next.next;
       table[pos] = start;
   }
   /* Function myhash */
   private int myhash(Integer x )
   {
       int hashVal = x.hashCode( );
       hashVal %= 11;
       if (hashVal < 0)
           hashVal += table.length;
       return hashVal;
   }
   public void printHashTable ()
   {
       System.out.println();
       for (int i = 0; i < 11; i++)
       {
           System.out.print ("Bucket " + i + ":  ");            
           HashNode start = table[i];
           while(start != null)
           {
               System.out.print(start.data +" ");
               start = start.next;
           }
           System.out.println();
       }
   }  
   /* Function to generate next prime number >= n */
 
}class HashNode
{
	   HashNode next;
	   int data;
	   public HashNode(int x)               /* Constructor */
	   {
	       data = x;
	       next = null;
	   }
	}