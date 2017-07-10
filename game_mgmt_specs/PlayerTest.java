import static org.junit.Assert.*;
import org.junit.*;
import game_mgmt.*;
import enums.*;
import java.util.ArrayList;

public class PlayerTest {

  Player player;

  @Before
  public void before() {
    player = new Player();
  }

  @Test
  public void testSetName() {
    player.setName("Ciaran");
    assertEquals("Ciaran", player.getName());
  }

  @Test
  public void testCardCount() {
    assertEquals(0, player.cardCount());
  }

  @Test
  public void testHasHand() {
    Deck deck = new Deck();
    player.takeCard(deck);
    assertEquals(1, player.cardCount());
  }

}
