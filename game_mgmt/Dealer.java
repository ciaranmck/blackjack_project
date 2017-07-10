package game_mgmt;
import enums.*;
import java.util.Collections;
import java.util.ArrayList;


public class Dealer {

  private ArrayList<Card> hand;


  public Dealer() {
    this.hand = new ArrayList<Card>();
  }

  public int cardCount() {
    return this.hand.size();
  }

  public void takeCard(Deck deck) {
    Card card = deck.getCard();
    hand.add(card);
  }

  public Rank readCard() {
    Card card = hand.get(0);
    return card.getRank();
    }

}