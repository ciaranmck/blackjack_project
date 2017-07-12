package game_mgmt;
import enums.*;
import java.util.Collections;
import java.util.ArrayList;


public class Player {

  private String name;
  private ArrayList<Card> hand;
  private Card card;

  public Player() {
    this.hand = new ArrayList<Card>();
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<Card> getHand() {
    return new ArrayList<Card>(hand);
  }

  public int cardCount() {
    return this.hand.size();
  }

  public void takeCard(Deck deck) {
    Card card = deck.getCard();
    hand.add(card);
  }

  // player must be able to read two cards to dealers one card, public Rank may need to be changed to public int once Ranks have value.

  public Rank readCard() {
      Card card = hand.get(0);
      return card.getRank();
      }

}