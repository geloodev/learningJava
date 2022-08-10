package main;

import java.util.Scanner;
import java.util.Random;

public class atividade01ex01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rnd = new Random(); // Inicia Aleatório
    int x = rnd.nextInt(100); // Gera um número aleatório (0 – 99)
    int num;

    do {
      System.out.printf("Digite um número: ");
      num = Integer.parseInt(input.nextLine());

      if (x > num) {
        System.out.println("MAIOR!");
      } else if (x < num) {
        System.out.println("MENOR!");
      } else {
        System.out.println("ACERTOU!");

      }

    } while (num != x);
  }
}
