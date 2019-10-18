package com.bridgelabz.main;

import com.bridgelabz.services.DeckOfCardImplementation;
/** Deck-Of-Cards is class that generate the shuffled manner cards and 
 * generate pair of 9cards for 4players   */
public class DeckOfCards {
	static DeckOfCardImplementation impl = new DeckOfCardImplementation();
	
	public static void main(String[] args) {
		
		//create cards
		String[][] playersCard=impl.createCards();
		for (int j = 0; j < 4; j++)
		{	for (int i = 0; i < 9; i++) 
				{
				System.out.print(playersCard[j][i]);
				}
		System.out.println();
		
		}
		//sort cards
		
		System.out.println("\n sorted cards");
		String[][] sortedCards=impl.sort(playersCard);
		
		for (int j = 0; j < 4; j++)
		{	for (int i = 0; i < 9; i++) 
				{
				System.out.print(sortedCards[j][i]);
				}
		System.out.println();
		}
		
		
	}
}
