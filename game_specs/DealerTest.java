import static org.junit.Assert.*;
import org.junit.*;
import game.*;
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
  public void hasHand() {
    dealer.dealCard();
    assertEquals(1, dealer.getHand());
  }

 

}