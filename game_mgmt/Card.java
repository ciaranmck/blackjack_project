package game_mgmt;
import enums.*;


public class Card {

  private Rank rank;
  private Suit suit;

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  @Override
  public String toString() {
    return this.rank.toString() + " Of " + this.suit.toString();
  }

  public Rank getRank() {
    return this.rank;
  }

  public Suit getSuit(){
    return this.suit;
  }

}