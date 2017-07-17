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
  private Log log;
  private HashMap<Enum, Integer> cardRules;
  Scanner scanner;

  public Blackjack(Player player) {
    this.player = player;
    log = new Log();
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

  // public String compareHands() {

  //   ArrayList<Card> dealerHand = this.dealer.getHand();
    
  //   ArrayList<Card> playerHand = this.player.getHand();

  //   if (getCardValues(playerHand) <= getCardValues(dealerHand)){
  //     return "House Wins";
  //   }
  //   else {
  //     return player.getName() + " Wins";
  //   }

  public void compareHands() {

    ArrayList<Card> dealerHand = this.dealer.getHand();
    
    ArrayList<Card> playerHand = this.player.getHand();

    if (getCardValues(playerHand) <= getCardValues(dealerHand)){
      System.out.println("House Wins");
    }
    else {
      System.out.println(player.getName() + " Wins!!!");
    }

  }

  // public String playerTwistOrStick(int handValue) {
  //   if (handValue < 21) {
  //     return player.getName() + ", you have " + handValue + ", do you want to Stick or Twist?";
  //   }
  //   else {
  //     return player.getName() + " has gone bust!!";
  //   }
  // }

  public void twistOrStick(int handValue) {
    
      System.out.println("What do you want to do? Twist or Stick? ");
      

        while (handValue <= 21) {
          String action = System.console().readLine();
          if (action == "twist") {
          player.takeCard(deck);
          }
           else if (handValue > 21) {
            System.out.println(player.getName() + " has gone bust!!");
          }
        } 
  }

  public void playerTwist(int handValue) {
    if (handValue < 21) {
      this.player.takeCard(deck);
    } 
  }

  public void playGame(String name) {
    System.out.println("Welcome to Blackjack 1.0! \n");

    player.setName(name);
   
    shuffleDeck();
    dealCards();

    ArrayList<Card> playerHand = playerGetHand();
    ArrayList<Card> dealerHand = dealerGetHand();

    int playerResult = getCardValues(playerHand);
    int dealerResult = getCardValues(dealerHand);

    System.out.println(playerHand);
    System.out.println("You have " + playerResult + " \n");
    System.out.println(dealerHand);
    System.out.println("Dealer has " + dealerResult + " \n");

    // twistOrStick(playerResult);

    // System.out.println(playerHand);
    // System.out.println("You have " + playerResult + " \n");
    // System.out.println(dealerHand);
    // System.out.println("Dealer has " + dealerResult + " \n");

    compareHands();
  }


}