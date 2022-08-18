import mypack.*;

public class Programa {

  public static void main(String[] args) {

    Empregado empregado1 = new Empregado("Ângelo", "Holandini", 2000.00);
    Empregado empregado2 = new Empregado("Matheus", "Costa", 2500.00);
    float aumento = 10;

    System.out.printf("Salário anual de %s %s: R$%.2f\n", empregado1.getNome(), empregado1.getSobrenome(),
        empregado1.salarioAnual());
    System.out.printf("Salário anual de %s %s: R$%.2f\n", empregado2.getNome(), empregado2.getSobrenome(),
        empregado2.salarioAnual());

    empregado1.aumentoSalario(aumento);

    System.out.printf("\nCom aumento de %.2f%% para %s %s:\n", aumento, empregado1.getNome(),
        empregado1.getSobrenome());
    System.out.printf("Salário anual de %s %s: R$%.2f\n", empregado1.getNome(), empregado1.getSobrenome(),
        empregado1.salarioAnual());
    System.out.printf("Salário anual de %s %s: R$%.2f\n", empregado2.getNome(), empregado2.getSobrenome(),
        empregado2.salarioAnual());
  }
}
