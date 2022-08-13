package War;

public enum Suit {
// just to make things fancy
	DIAMOND("["+"\u2666"), CLUB("["+"\u2663"),SPADE("["+"\u2660"),HEART("["+"\u2665");
// my mentor helped me with the suits
	private String tag;
	Suit(String tag){
		this.tag = tag;
	}
	
	public String getTag() {
		return(tag);
	}
}
