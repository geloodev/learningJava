// package main;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Digite algo: ");
    String str = input.nextLine();
    System.out.println(str);

    /**
     * TIPOS PRIMITIVOS
     * int, float, double, char, boolean
     * 
     * ESTRUTURAS DE CONTROLE
     * if, if..else, switch..case, for, while, do..while, foreach
     * 
     * OPERADORES MATEMÁTICOS E DE COMPARAÇÃO
     * +, -, *, /, %, ++, --
     * ==, <=, >=, !=
     **/

    char c = 'A';
    char[] charArray = new char[3];
    charArray[0] = 'a';
    charArray[1] = 'b';
    charArray[2] = 'c';

    int intArray[] = { 1, 2, 3 };

    System.out.println(charArray);
    System.out.println(intArray[0] + " "
        + intArray[1] + " "
        + intArray[2]);
    System.out.printf("%d %d %d\n", intArray[0], intArray[1], intArray[2]);

    for (int i = 0; i < intArray.length; i++) {
      System.out.printf("%d ", intArray[i]);
    }
    System.out.println("");

    // foreach in java
    for (int num : intArray) {
      System.out.printf("%d ", num);
    }
  }
}
