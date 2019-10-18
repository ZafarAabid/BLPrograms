package com.bridgelabz.services;

/**simple interface class to define required methods*/
public interface DeckOfCard {

	//create cards
	public String[][] createCards();
	//sort created cards
	public String[][] sort(String[][] playersCard);
}
