package War;

public class Card {
	public final static int JACK = 11;
	public final static int QUEEN = 12;
	public final static int KING = 13;
	public final static int ACE = 14;
	
	
	
	private int v;
	private Suit s;
	
		public int getValue() {
			return v;
		}
		
		public void setValue(int v) {
			this.v = v;
			
		}
		
		public Suit getS() {
			return s;
			
		}
		
		public void setS(Suit s) {
			this.s = s;
			
		}
	
	public String describe() {
		StringBuilder output = new StringBuilder();
		
		output.append(getS().getTag().toString());
		switch (v) {
		case JACK:
			output.append("J" + "]");
			break;
		case QUEEN:
			output.append("Q" + "]");
			break;
		case KING:
			output.append("K" + "]");
			break;
		case ACE:
			output.append("A" + "]");
			break;
		default:
			output.append(v + "]");
		}

		return(output.toString());
		
		}
		
	}


