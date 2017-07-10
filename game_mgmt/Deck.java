package game_mgmt;
import enums.*;
import java.util.Collections;
import java.util.ArrayList;


public class Deck extends BlackjackRule {

  private ArrayList<Card> deck;

  public Deck() {
    this.deck = new ArrayList<Card>();
    setupDeck();
  }

  public void setupDeck() {
    for (Suit suit : Suit.values()) {
     for (Rank rank : Rank.values()) {
      // Would like to have these lines elsewhere so blackjack values are not hard coded into the deck
      Integer minValue = getMinCardValue(rank);
      Integer maxValue = getMaxCardValue(rank);
      // ------------------------------------------------------
      Card card = new Card(rank, suit);
      deck.add(card);
      Collections.shuffle(deck);
      }
    }
  }

  public int cardCount() {
    return this.deck.size();
  }

  public Card getCard() {
    return this.deck.remove(0);
  }

}