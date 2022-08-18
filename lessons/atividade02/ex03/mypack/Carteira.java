package mypack;

public class Carteira {

  private double saldo;

  public Carteira(double saldo) {
    this.saldo = saldo;
  }

  public boolean podePagar(double preco) {
    if (preco <= saldo) {
      return true;
    } else {
      return false;
    }
  }
}
