import static org.junit.Assert.*;
import org.junit.*;
import game_mgmt.*;
import enums.*;

public class CardTest {

  Card card;

  @Before
  public void before() {
    card = new Card(Rank.KING, Suit.CLUBS);
  }

  @Test
  public void testHasRank() {
    assertEquals(Rank.KING, card.getRank());
  }

  @Test
  public void testHasSuit() {
    assertEquals(Suit.CLUBS, card.getSuit());
  }

  // @Test void testToString() {
  //   assertEquals()
  // }



}