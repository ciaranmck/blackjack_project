package game_mgmt;
import enums.*;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Blackjack {

  private Player player;
  private Dealer dealer;
  private Deck deck;
  private HashMap<Enum, Integer> cardRules;
  Scanner scanner;

  public Blackjack(Player player) {
    this.player = player;
    dealer = new Dealer();
    deck = new Deck();
    cardRules = new HashMap<Enum, Integer>();
    scanner = new Scanner(System.in);
      
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

  public ArrayList<Card> playerGetHand() {
    return player.getHand();
  }

  public ArrayList<Card> dealerGetHand() {
    return dealer.getHand();
  }

  public int getCardValues(ArrayList<Card> hand) {
    int valueOfCards = 0;

        for (Card card : hand) {
          valueOfCards += cardRules.get(card.getRank());
        }

        return valueOfCards;
  }

  public String compareHands() {

    ArrayList<Card> dealerHand = this.dealer.getHand();
    
    ArrayList<Card> playerHand = this.player.getHand();

    if (getCardValues(playerHand) <= getCardValues(dealerHand)){
      return "House Wins";
    }
    else {
      return player.getName() + " Wins";
    }

  }

  public String playerTwistOrStick(int handValue) {
    if (handValue < 21) {
      return player.getName() + ", you have " + handValue + ", do you want to Stick or Twist?";
    }
    else {
      return player.getName() + " has gone bust!!";
    }
  }

  public void playerInputTwistOrStick(int handValue) {
    if (handValue < 21) {
      System.out.println("What do you want to do? Twist or Stick? ");
      String action = scanner.next();
    }
    else {
      System.out.println(player.getName() + " has gone bust!!");
    }
  }

  public void playerTwist(int handValue) {
    if (handValue < 21) {
      this.player.takeCard(deck);
    } 
  }

  public void playGame() {
    player.setName("Ciaran");
    shuffleDeck();
    dealCards();
    compareHands();
  }


}