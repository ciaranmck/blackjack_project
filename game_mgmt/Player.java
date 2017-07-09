package game_mgmt;
import enums.*;
import java.util.Collections;
import java.util.ArrayList;


public class Player {

  private String name;
  private ArrayList<Card> hand;

  public Player(String name) {
    this.name = name; 
    this.hand = new ArrayList<Card>();
  }

  public String getName() {
    return this.name;
  }

  public int cardCount() {
    return this.hand.size();
  }

  public void takeCard() {
    Deck deck = new Deck();
    Card card = deck.getCard();
    hand.add(card);
  }

}