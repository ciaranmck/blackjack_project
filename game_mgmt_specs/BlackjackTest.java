import static org.junit.Assert.*;
import org.junit.*;
import game_mgmt.*;
import enums.*;
import java.util.ArrayList;

public class BlackjackTest {

  Blackjack blackjack;

  @Before
  public void before() {
    blackjack = new Blackjack();
  }

  @Test
  public void testDealerAndPlayerHaveCards() {
    blackjack.dealCards();
    assertEquals(2, blackjack.dealerCardCount()); 
    assertEquals(2, blackjack.playerCardCount());
  }

  @Test
  public void testCardValues() {

  }

}
