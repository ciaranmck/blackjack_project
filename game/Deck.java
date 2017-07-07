package game;
import enums.*;


public class Deck {

  private Rank rank;
  private Suit suit;

  public Deck(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public Rank getRank(){
    return this.rank;
  }

  public Suit getSuit(){
    return this.suit;
  }

}