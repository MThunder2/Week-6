package War;

import java.util.ArrayList;
import java.util.List;


public class Player {
		
		private List<Card> hand = new ArrayList<>();
		private int score = 0;
		private String name;
		
		public Player() {}
		
		public Player(String name, List<Card> hand, int score) {
			this.name = name;
			this.hand = hand;
			this.score = 0;
			
		}
		
		public void describe(Card card) {
			System.out.println(this.name + " draws: " + card.describe());
		}
		
		public List<Card> getHand() {
			return hand;
		}
		
		public void setHand(List<Card> hand) {	
			this.hand = hand;
		}
		
		public int getScore() {
			return score;
			
		}
		
		public void setScore(int score) {
			this.score = score;
		}
		
		public void incrementScore() {
			this.score++;
		}
		
		public void draw(Deck deck) {
			hand.add(deck.draw());
		}
		
		public Card flip() {
			return hand.remove(0);
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
}


