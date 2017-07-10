import static org.junit.Assert.*;
import org.junit.*;
import game_mgmt.*;
import enums.*;
import java.util.ArrayList;

public class BlackjackTest {

  Blackjack blackjack;
  Deck deck;

  @Before
  public void before() {
    blackjack = new Blackjack();
  }

  @Test
  public void testDealerAndPlayerHaveCards() {
    blackjack.dealCards();
    assertEquals(2, blackjack.dealerCardCount()); 
    assertEquals(2, blackjack.playerCardCount());
    assertEquals(48, blackjack.cardCount());
  }

  @Test
  public void testHasCardValue() {

  }

}
