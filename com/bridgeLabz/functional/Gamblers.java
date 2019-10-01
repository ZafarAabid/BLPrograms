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
