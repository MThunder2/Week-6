package War;

public class App {
	public static void main(String[] args) {
//3.		
		Deck deck = new Deck();
		deck.shuffle();
		Player p1 = new Player();
		p1.setName("P1");
		Player p2 = new Player();
		p2.setName("P2");
		
		
//4.	
		for(int i =0; i <52; i++) {
			if(i % 2 == 0) {
				p1.draw(deck);
			}
			else {
				p2.draw(deck);
			}
		}
		
//5.
		int turn = 1;
		for(int i = 0; i < 26; i++) {
			System.out.println("*******************");
			System.out.println("\t[ Turn:	" + turn + " ]");
			Card c1 = p1.flip();
			p1.describe(c1);
			System.out.println("\t ");
			System.out.println("Against");
			System.out.println("\t ");
			Card c2 = p2.flip();
			p2.describe(c2);
			System.out.println();
			if(c1.getValue() > c2.getValue()) {
				p1.incrementScore();
				System.out.println(" 1 point for " + p1.getName()+"." + p1.getName()+ " has "+ p1.getScore()+ " point(s)");
				System.out.println("*******************");
			}else if(c1.getValue() < c2.getValue()) {
				p2.incrementScore();
				System.out.println(" 1 point for " + p2.getName()+"." + p2.getName()+ " has "+ p2.getScore()+ " point(s)");
				System.out.println("*******************");
			}else {
				System.out.println("Tie game!");			
			}
			turn += 1;
	}
//6 and 7.
		System.out.println("*******************");
		System.out.println("\t {WINNER!!!}");
		System.out.println("*******************");
	if(p1.getScore() > p2.getScore()) {
		System.out.println(p1.getName() + " with the final score of " + p1.getScore() + " and " + p2.getName() + " final score of " + p2.getScore()+"," + p1.getName() + " is the WINNER!!");
	} else if(p1.getScore() < p2.getScore()) {
		System.out.println(p2.getName() + " with the final score of " + p2.getScore() + " and " + p1.getName() + " final score of " + p1.getScore()+"," + p2.getName() + " is the WINNER!!");
	} else {
		System.out.println(p1.getName() + " and " + p2.getName() + " tied with the score of " + p1.getScore());
	}
	System.out.println("******************* GAME OVER *******************");
	
	}
	
	
}
