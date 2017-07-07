package game;
import enums.*;


public class Deck {

  private ArrayList<Card> deck;

  public Deck() {
    this.deck = new ArrayList<Card>();
    setupDeck();
  }

  public void setupDeck(){
    for (Suit suit : Suit.values()) {
     for (Rank rank : Rank.values()) {
      Card card = new Card(rank, suit)
      deck.add(card);
    }
  }
}