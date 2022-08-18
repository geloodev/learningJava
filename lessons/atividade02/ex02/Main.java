import mypack.*;

public class Main {

  public static void main(String[] args) {

    Fatura fatura = new Fatura(1, "Teclado Mecânico Razer", 3, 250);

    System.out.println("ITEM DE EXEMPLO:");
    System.out.println("Numero do item: 1");
    System.out.println("Descrição: Teclado Mecânico Razer");
    System.out.println("Quantidade: 3");
    System.out.println("Preço Unitário: R$250.00");
    System.out.printf("\n-> Fatura: R$%.2f\n", fatura.getValorFatura());

  }
}
