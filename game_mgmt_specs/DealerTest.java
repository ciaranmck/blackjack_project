import static org.junit.Assert.*;
import org.junit.*;
import game_mgmt.*;
import enums.*;
import java.util.ArrayList;

public class DealerTest {

  Deck deck;
  Dealer dealer;


  @Before
  public void before() {
    // deck = new Deck();
    dealer = new Dealer();
  }

  @Test
  public void cardCount() {
    assertEquals(0, dealer.cardCount());
  }

  @Test
  public void hasHand() {
    dealer.takeCard();
    assertEquals(1, dealer.cardCount());
  }

 

}