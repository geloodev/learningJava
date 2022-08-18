package mypack;

import java.lang.Math;
import java.util.Random;

public class GuessGame {

  public void startGame() {

    boolean winnerExists = false;
    int number = (int) (Math.random() * 9);
    Player player1 = new Player("player1");
    Player player2 = new Player("player2");
    Player player3 = new Player("player3");

    player1.setGuessNumber();
    player2.setGuessNumber();
    player3.setGuessNumber();

    System.out.printf("RANDOMIZED NUMBER: %d\n", number);
    System.out.printf("Player1 guess: %d\n", player1.getGuessNumber());
    System.out.printf("Player2 guess: %d\n", player2.getGuessNumber());
    System.out.printf("Player3 guess: %d\n", player3.getGuessNumber());

    System.out.println("\nWINNERS:\n");

    if (player1.getGuessNumber() == number) {
      System.out.printf("-> Player1\n");
      winnerExists = true;
    }
    if (player2.getGuessNumber() == number) {
      System.out.printf("-> Player2\n");
      winnerExists = true;
    }
    if (player3.getGuessNumber() == number) {
      System.out.printf("-> Player3\n");
      winnerExists = true;
    }

    if (winnerExists == false) {
      System.out.printf("No one won. :(\n");
    }

  }
}
