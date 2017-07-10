package game_mgmt;
import enums.*;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;


public class Blackjack {

  private Player player;
  private Dealer dealer;
  private Deck deck;
  private HashMap<Enum, Integer> cardRules;

  public Blackjack() {
    player = new Player();
    dealer = new Dealer();
    deck = new Deck();
    cardRules = new HashMap<Enum, Integer>();
      
    cardRules.put(Rank.ACE, 1);
    cardRules.put(Rank.TWO, 2);
    cardRules.put(Rank.THREE, 3);
    cardRules.put(Rank.FOUR, 4);
    cardRules.put(Rank.FIVE, 5);
    cardRules.put(Rank.SIX, 6);
    cardRules.put(Rank.SEVEN, 7);
    cardRules.put(Rank.EIGHT, 8);
    cardRules.put(Rank.NINE, 9);
    cardRules.put(Rank.TEN, 10);
    cardRules.put(Rank.KING, 10);
    cardRules.put(Rank.QUEEN, 10);
    cardRules.put(Rank.JACK, 10);
    }

  public void shuffleDeck() {
    deck.shuffleDeck();
  }  

  public void dealCards() {
    for (int i=0; i<2; i++) {
      dealer.takeCard(deck);
      player.takeCard(deck);
    }
  }

  public int dealerCardCount() {
    return dealer.cardCount();
  }

  public int playerCardCount() {
    return player.cardCount();
  }

  public int deckCardCount() {
    return deck.cardCount();
  }

  public int checkPlayerCardValues() {
    return cardRules.get(player.readCard());
  }

  public int checkDealerCardValues() {
    return cardRules.get(dealer.readCard());
  }

  // public int checkCardValues(Card card) {
  //   return cardRules.get(card.getRank());
  // }

  public int addCardValues(int card_01, int card_02) {
    return card_01 + card_02;
  }

  // public int compareHands() {

  // }




}