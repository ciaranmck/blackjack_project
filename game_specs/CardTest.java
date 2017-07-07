import static org.junit.Assert.*;
import org.junit.*;
import game.*;
import enums.*;

public class CardTest {

  Card card;

  @Before
  public void before() {
    card = new Card(Rank.KING, Suit.CLUBS);
  }

  @Test
  public void hasRank() {
    assertEquals(Rank.KING, card.getRank());
  }

  @Test
  public void hasSuit() {
    assertEquals(Suit.CLUBS, card.getSuit());
  }



}