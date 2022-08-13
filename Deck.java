package War;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;



public class Deck {
	
	private List<Card> cards = new ArrayList<Card>();
	
	public Deck() {
	
		String[] value = new String[14];
		
						value[0] = null;
						value[1] = "Two";
						value[2] = "Three";
						value[3] = "Four";
						value[4] = "Five";
						value[5] = "Six";
						value[6] = "Seven";
						value[7] = "Eight";
						value[8] = "Nine";
						value[9] = "Ten";
						value[10] = "J";
						value[11] = "Q";
						value[12] = "K";
						value[13] = "A";
			
	for(int i = 1; i <= 13; i++) {
		Card c = new Card();
		c.setS(Suit.HEART);
		c.setValue(i);
		cards.add(c);
	}
	for(int i = 1; i<= 13; i++) {
		Card c = new Card();
		c.setS(Suit.CLUB);
		c.setValue(i);
		cards.add(c);
		
	}
	for (int i = 1; i <= 13; i++) {
		Card c = new Card();
		c.setS(Suit.DIAMOND);
		c.setValue(i);
		cards.add(c);
	
	}
	for(int i = 1; i <= 13; i++) {
		Card c = new Card();
		c.setS(Suit.SPADE);
		c.setValue(i);
		cards.add(c);
		
	}
	
		
}
		public void shuffle() {
			Collections.shuffle(cards);
		}
		
	public Card draw() {
		return cards.remove(0);
	}
	
}	
	
