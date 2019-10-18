package com.bridgelabz.services;

import java.io.*;
import java.util.Random;
import org.codehaus.jackson.map.*;
import com.bridgelabz.utility.*;
/** piece of code that implement DeckOfCard Interface to provide body to abstract methods*/
public class DeckOfCardImplementation {

		static File file;
		static ObjectMapper mapper= new ObjectMapper();
		/** method to create random cards for 4players, each having 9 cards*/
		public String[][] createCards() {
			String[] suit= {"C","D","H","S"};
			String[] rank= {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
			String[][] playersCard = new String[4][9];
			Random random1=new Random();
			Random random2=new Random();
			UnOrderedList list = new UnOrderedList();
			for (int j = 0; j < 4; j++)
			for (int i = 0; i < 9; i++) 
			{
				String card=rank[random2.nextInt(rank.length)]+"-"+suit[random1.nextInt(suit.length)]+"  ";
				
				for (int k = 0; k < 1; k++) {
					list.addNode(card);
					playersCard[j][i]=card;
				}
				if(!list.contains(card))
					{	playersCard[j][i]=card;
						list.addNode(card);
					}
				else
					i--;
			}
			
			
			return playersCard;
		}
		
		/** method to sort the cards and rank-wise manner*/
		public String[][] sort(String[][] playersCard) {
			
			String[][] cards=playersCard;
			String temp="";
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 9; j++) {
					for (int k = 0; k < 9; k++) {
						if(cards[i][j].charAt(0) >(cards[i][k]).charAt(0))
						{	temp=cards[i][j];
						cards[i][j]=cards[i][k];
						cards[i][k]=temp;
						}
					}
				}
			}
			return cards;
		}

}	