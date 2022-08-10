package main;

import java.util.Scanner;

public class atividade01ex02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int userNum, a1 = 0, a2 = 1, aNext = a1 + a2;

    do {
      System.out.printf("Digite um número positivo: ");
      userNum = Integer.parseInt(input.nextLine());

      if (userNum <= 0) {
        System.out.println("Número inválido! Apenas números positivos aceitos!");
      }
    } while (userNum <= 0);

    System.out.printf("\n\n%d %d ", a1, a2);

    while (a2 <= userNum) {
      a1 = a2;
      a2 = aNext;
      aNext = a1 + a2;
      System.out.printf("%d ", a2);
    }
  }
}
