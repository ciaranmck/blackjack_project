package game;
import enums.*;
import java.util.Collections;
import java.util.ArrayList;


public class Dealer {

  private ArrayList<Card> hand;

  public Dealer() {
    this.hand = new ArrayList<Card>();
  }

  public int getHand() {
    return this.hand.size();
  }

  public void dealCard() {
    Deck deck = new Deck();
    Card card = deck.getCard();
    hand.add(card);
  }

}