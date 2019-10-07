	// program to play Gambler game where gambler puts the valid moves and set goal  and play until he won or loss 
	// here gambler set the GOal,Stake,and trails. based on this, the game happens
package com.bridgeLabz.functional;
public class Gamblers {
	public static void main(String args[])
	{
		Utility u= new Utility();
		int st=Integer.parseInt(args[0]);
		int goal=Integer.parseInt(args[1]);
		int trial=Integer.parseInt(args[2]);
		u.gamble(st, goal, trial);
	}

}
