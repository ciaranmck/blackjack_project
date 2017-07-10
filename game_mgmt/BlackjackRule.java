package game_mgmt;
import enums.*;
import java.util.Collections;
import java.util.ArrayList;

public abstract class BlackjackRule {

  public static int getMinCardValue(Rank rank) {

    if (rank == Rank.ACE) {
      return 1;
    }

    if (rank == Rank.TWO) {
      return 2;
    }

    if (rank == Rank.THREE) {
      return 3;
    }

    if (rank == Rank.FOUR) {
      return 4;
    }

    if (rank == Rank.FIVE) {
      return 5;
    }

    if (rank == Rank.SIX) {
      return 6;
    }

    if (rank == Rank.SEVEN) {
      return 7;
    }

    if (rank == Rank.EIGHT) {
      return 8;
    }

    if (rank == Rank.NINE) {
      return 9;
    }

    if (rank == Rank.TEN) {
      return 10;
    }

    if (rank == Rank.JACK) {
      return 10;
    }

    if (rank == Rank.QUEEN) {
      return 10;
    }

    if (rank == Rank.KING) {
      return 10;
    }

    return 0;
  }

}