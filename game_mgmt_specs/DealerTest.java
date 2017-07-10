import static org.junit.Assert.*;
import org.junit.*;
import game_mgmt.*;
import enums.*;
import java.util.ArrayList;

public class DealerTest {

  Dealer dealer;

  @Before
  public void before() {
    dealer = new Dealer();
  }

  @Test
  public void testCardCount() {
    assertEquals(0, dealer.cardCount());
  }

  @Test
  public void testHasHand() {
    Deck deck = new Deck();
    dealer.takeCard(deck);
    assertEquals(1, dealer.cardCount());
  } 

}