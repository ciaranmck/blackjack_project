package game_mgmt;
import enums.*;
import java.util.Collections;
import java.util.ArrayList;


public class Deck {

  private ArrayList<Card> deck;

  public Deck() {
    this.deck = new ArrayList<Card>();
    setupDeck();
  }

  public void setupDeck() {
    for (Suit suit : Suit.values()) {
     for (Rank rank : Rank.values()) {
      Card card = new Card(rank, suit);
      deck.add(card);
      // Collections.shuffle(deck);
      }
    }
  }

  public void shuffleDeck() {
    Collections.shuffle(deck);
  }

  public int cardCount() {
    return this.deck.size();
  }

  public Card getCard() {
    return this.deck.remove(0);
  }

}