/**Desc -> Take an Arithmetic Expression such as
(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3) where parentheses are used to order the
performance of operations. Ensure parentheses must appear in a balanced
fashion.
b. I/P -> read in Arithmetic Expression such as
(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)
c. Logic -> Write a Stack Class to push open parenthesis “(“ and pop closed
parenthesis “)”. At the End of the Expression if the Stack is Empty then the
Page 9 of 20
https://docs.google.com/document/d/1pQfJDVwnXuhwCBbDTABoTvYhwtJwVWwOvrVJR3t1cJE/edit
9/2025/06/2019
Programming Problems - Google Docs
Arithmetic Expression is Balanced. Stack Class Methods are Stack(), push(),
pop(), peak(), isEmpty(), size()
d. O/P -> True or False to Show Arithmetic Expression is balanced or not.
*/

package com.bridgelabz.datast;

import com.Scan;

public class StackTest {
	static StackAbs stack = new StackAbs();
	
	public static void main(String[] args)
	{
		
		System.out.println("Enter the equation");
		String paranthesis=Scan.ScannerString();
		
		System.out.println("Given equation is  "+paranthesis);
		char opening='(';
		char closing=')';
		
		for (int i = 0; i < paranthesis.length(); i++) {
			{
				char symbol=paranthesis.charAt(i);
			if(symbol=='('|symbol=='{'|symbol=='[')
				{	
					stack.push(symbol);
				}
			if(symbol==')'|symbol=='}'|symbol==']')
			{	
				stack.pop(symbol);
			}
			}

		}
		if(StackAbs.size()>=0)
			System.out.println("Paranthesis is balanced");
		if(StackAbs.size()<0)
			System.out.println("Paranthesis is Unbalanced");
		
	}

}
