import static org.junit.Assert.*;
import org.junit.*;
import game_mgmt.*;
import enums.*;
import java.util.ArrayList;

public class BlackjackTest {

  Blackjack blackjack;
  // Deck deck;
  // Card card_01;
  // Card card_02;

  @Before
  public void before() {
    Player player = new Player();
    player.setName("Ciaran");

    blackjack = new Blackjack(player);
    // card_01 = new Card(Rank.KING, Suit.CLUBS);
    // card_02 = new Card(Rank.TWO, Suit.HEARTS);
  }

  @Test
  public void testDealerAndPlayerHaveCards() {
    blackjack.dealCards();
    assertEquals(2, blackjack.dealerCardCount()); 
    assertEquals(2, blackjack.playerCardCount());
    assertEquals(48, blackjack.deckCardCount());
  }

  @Test
  public void testDealerAndPlayerCardsHaveValue() {
   blackjack.dealCards();
   ArrayList<Card> playerHand = blackjack.playerGetHand();
   ArrayList<Card> dealerHand = blackjack.dealerGetHand();
    int dealerResult = blackjack.getCardValues(dealerHand);
    int playerResult = blackjack.getCardValues(playerHand);
   assertEquals(4, dealerResult);
   assertEquals(6, playerResult);
 }
  

  // @Test
  // public void testCanCompareHands() {
  //  blackjack.dealCards();
  //  assertEquals("Ciaran Wins", blackjack.compareHands());
  // }

  // @Test
  // public void testPlayerCanTwist() {
  //   blackjack.dealCards();

  //   ArrayList<Card> playerHand = blackjack.playerGetHand();
  //   int playerResult = blackjack.getCardValues(playerHand);
  //   blackjack.playerTwist(playerResult);

  //   ArrayList<Card> newPlayerHand = blackjack.playerGetHand();
  //   int newPlayerResult = blackjack.getCardValues(newPlayerHand);

  //   assertEquals(47, blackjack.deckCardCount());
  //   assertEquals(3, blackjack.playerCardCount());
  //   assertEquals(11, newPlayerResult);
  // }

  // @Test
  // public void testPlayerCanGoBust() {
  //   assertEquals("Ciaran has gone bust!!", blackjack.playerTwistOrStick(22));
  // }

  // @Test
  // public void testPlayerCanStick() {
  //   assertEquals("Ciaran, you have 6, do you want to Stick or Twist?", blackjack.playerTwistOrStick(6));
  // }

  // @Test
  // public void testChoicePlayerInput() {
  //   assertEquals("What do you want to do? Twist or Stick? ", blackjack.playerInputTwistOrStick(10));
  // }


  
  

}
