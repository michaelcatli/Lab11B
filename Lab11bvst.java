// Lab11bst.java
// This is the Student starting version of the <Deck> class lab11b assignment.


public class Lab11bvst
{
	public static void main(String[] args)
	{
      Deck deck = new Deck();
      System.out.println(deck);
	}
}


class Deck
{
	private Card[] cards;
	private int size;
	private String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	private int[] values = {1,2,3,4,5,6,7,8,9,10,10,10,10,11};
	private int currentCard = 0;
	private String[] ranks = {"1","2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	public Deck()
   {
    size = 52;
		cards = new Card[size];
		for (int x=0;x<suits.length;x++){
			for (int b=0;b<ranks.length;b++){
				cards[currentCard] = new Card(suits[x], ranks[b],values[b]);
				currentCard++;
				}
			}
		}
		public String toString(){
			String g = "";
			for (int m = 0;m<size;m++){

				g = g + cards[m].toString() + "\n";

			}
			return g;
		}
	 }
