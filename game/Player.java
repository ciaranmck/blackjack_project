package game;
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

  public void getHand() {
    Dealer dealer = new Dealer();
    dealer.dealCard();

  }

  public int cardCount() {
    return this.hand.size();
  }

}