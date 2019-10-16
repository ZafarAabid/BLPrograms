package com.bridgelabz.main;
import com.bridgelabz.utility.*;


public class DeckOfCards {
	static Utility util = new Utility();

	public static void main(String[] args) {
		String[][] playersCard=util.createCards();
		playersCard=util.sort(playersCard);
		for (int j = 0; j < 4; j++)
		{	for (int i = 0; i < 9; i++) 
				{
				System.out.print(playersCard[j][i]);
				}
		System.out.println();
		}
		
		
	}
}
