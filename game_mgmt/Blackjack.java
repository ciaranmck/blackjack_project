package game_mgmt;
import enums.*;
import java.util.Collections;
import java.util.ArrayList;


public class Blackjack {

  private Player player;
  private Dealer dealer;
  private Deck deck;

  public Blackjack() {
    player = new Player("Ciaran");
    dealer = new Dealer();
    deck = new Deck();
  }

  public void dealCards() {
    for (int i=0; i<2; i++) {
      dealer.takeCard();
      player.takeCard();
    }
  }

  public int dealerCardCount() {
    return dealer.cardCount();
  }

  public int playerCardCount() {
    return dealer.cardCount();
  }

}