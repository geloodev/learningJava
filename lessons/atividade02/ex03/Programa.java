import mypack.*;

public class Programa {

  public static void main(String[] args) {

    Carteira carteira1 = new Carteira(2000.00);
    Carteira carteira2 = new Carteira(1000.00);
    double preco = 1500.00;

    System.out.printf("Preço: %.2f\n", preco);

    if (carteira1.podePagar(preco) == true)
      System.out.println("carteira1 pode pagar");
    else
      System.out.println("carteira1 não pode pagar");

    if (carteira2.podePagar(preco) == true)
      System.out.println("carteira2 pode pagar");
    else
      System.out.println("carteira2 não pode pagar");
  }
}
