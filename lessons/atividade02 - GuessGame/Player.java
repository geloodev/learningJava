package mypack;

import java.lang.Math;

public class Player {

  String name;
  int guessNumber;

  public Player(String name) {
    this.name = name;
  }

  public void setGuessNumber() {
    guessNumber = (int) (Math.random() * 9);
  }

  public int getGuessNumber() {
    return guessNumber;
  }
}
