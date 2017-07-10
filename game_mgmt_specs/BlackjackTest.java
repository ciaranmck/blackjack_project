import static org.junit.Assert.*;
import org.junit.*;
import game_mgmt.*;
import enums.*;
import java.util.ArrayList;

public class BlackjackTest {

  Blackjack blackjack;
  Deck deck;
  Card card_01;
  Card card_02;

  @Before
  public void before() {
    blackjack = new Blackjack();
    card_01 = new Card(Rank.KING, Suit.CLUBS);
    card_02 = new Card(Rank.TWO, Suit.HEARTS);
  }

  @Test
  public void testDealerAndPlayerHaveCards() {
    blackjack.dealCards();
    assertEquals(2, blackjack.dealerCardCount()); 
    assertEquals(2, blackjack.playerCardCount());
    assertEquals(48, blackjack.deckCardCount());
  }

  @Test
  public void testPlayerCardHasValue() {
    blackjack.dealCards();
    assertEquals(2, blackjack.checkPlayerCardValues());
  }

  @Test
  public void testDealerCardHasValue() {
    blackjack.dealCards();
    assertEquals(1, blackjack.checkDealerCardValues());
  }

  // @Test
  // public void testCanAddCardValues() {
  //   int value_01 = blackjack.checkCardValues(card_01);
  //   int value_02 = blackjack.checkCardValues(card_02);
  //   assertEquals(12, blackjack.addCardValues(value_01, value_02));
  // }


  
  // @Test
  // public void testCanCompareHands() {
  //   blackjack.dealCards();
  //   assertEquals
  // }

}
