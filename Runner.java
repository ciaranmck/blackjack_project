import game_mgmt.*;
import enums.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Runner {

    private static Blackjack blackjack; 
    private static Runner runner;

  public static void main(String[] args) {
    System.out.println("Enter your name: ");
    String name = System.console().readLine();
    System.out.println();

    Card card = new Card(rank, suit);
    Deck deck = new Deck();
    Player player = new Player();
    Dealer dealer = new Dealer();
    Blackjack blackjack = new Blackjack(player);

    player.setName(name);
    blackjack.playGame();
  }
}