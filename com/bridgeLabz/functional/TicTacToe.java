/*Cross Game or Tic-Tac-Toe Game
a. Desc -> Write a Program to play a Cross Game or Tic-Tac-Toe Game.
           Player 1 is the Computer and the Player 2 is the user. 
           Player 1 take Random Cell that is the Column and Row.
b. I/P ->  Take User Input for the Cell i.e. Col and Row to Mark
 		   the ‘X’
c. Logic ->The User or the Computer can only take the unoccupied
           cell. The Game is played till either wins or till draw...
d. O/P ->  Print the Col and the Cell after every step.
e. Hint -> The Hints is provided in the Logic. Use Functions
           for the Logic...
*/
package com.bridgeLabz.functional;
import java.util.*;
public class TicTacToe 
{
	public static void main(String asd[])
	{		Scanner sc=new Scanner(System.in);
		String[] postion= {"1","2","3","4","5","6","7","8","9"};
		System.out.println("Enter the players name");
		System.out.print("user1:");
		String user1=sc.next();
		System.out.print("user2:");
		String user2=sc.next();
		Utility.ticTacToe(postion,user1,user2);
	}
}