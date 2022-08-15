package main;

import java.util.Scanner;

public class atividade01ex03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    char[] phrase;

    System.out.printf("Digite uma frase: ");
    phrase = input.nextLine().toCharArray();

    for (char i : phrase) {
      if (i == 'a' || i == 'b' || i == 'c') {
        System.out.printf("2");
      } else if (i == 'd' || i == 'e' || i == 'f') {
        System.out.printf("3");
      } else if (i == 'g' || i == 'h' || i == 'i') {
        System.out.printf("4");
      } else if (i == 'j' || i == 'k' || i == 'l') {
        System.out.printf("5");
      } else if (i == 'm' || i == 'n' || i == 'o') {
        System.out.printf("6");
      } else if (i == 'p' || i == 'q' || i == 'r' || i == 's') {
        System.out.printf("7");
      } else if (i == 't' || i == 'u' || i == 'v') {
        System.out.printf("8");
      } else if (i == 'w' || i == 'x' || i == 'y' || i == 'z') {
        System.out.printf("9");
      } else if (i == ' ') {
        System.out.printf("0");
      }
    }
  }
}
