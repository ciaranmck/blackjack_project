import static org.junit.Assert.*;
import org.junit.*;
import game_mgmt.*;
import enums.*;
import java.util.ArrayList;

public class DeckTest {

  Deck deck;

  @Before
  public void before() {
    deck = new Deck();
  }

  @Test
  public void testHasDeck() {
    assertEquals(52, deck.cardCount());
  }

  // @Test
  // public void hasCard() {
  //   assertEquals(1, deck.getCard());
  // }

}
