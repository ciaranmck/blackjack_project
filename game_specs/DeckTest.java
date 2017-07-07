import static org.junit.Assert.*;
import org.junit.*;
import game.*;
import enums.*;
import java.util.ArrayList;

public class DeckTest {

  Deck deck;

  @Before
  public void before() {
    deck = new Deck();
  }

  @Test
  public void hasDeck() {
    assertEquals(52, deck.cardCount());
  }

}
