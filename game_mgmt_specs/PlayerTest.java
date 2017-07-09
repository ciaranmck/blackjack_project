import static org.junit.Assert.*;
import org.junit.*;
import game_mgmt.*;
import enums.*;
import java.util.ArrayList;

public class PlayerTest {

  Player player;

  @Before
  public void before() {
    player = new Player("Ciaran");
  }

  @Test
  public void hasName() {
    assertEquals("Ciaran", player.getName());
  }

  @Test
  public void cardCount() {
    assertEquals(0, player.cardCount());
  }

  @Test
  public void hasHand() {
    player.takeCard();
    assertEquals(1, player.cardCount());
  }

}
