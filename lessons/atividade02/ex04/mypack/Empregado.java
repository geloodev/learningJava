package mypack;

public class Empregado {

  private String name;
  private String lastname;
  private double salaryMonthly;

  public Empregado(String name, String lastname, double salaryMonthly) {

    this.name = name;
    this.lastname = lastname;

    if (salaryMonthly < 0.00) {
      this.salaryMonthly = 0.00;
    } else {
      this.salaryMonthly = salaryMonthly;
    }
  }

  public String getNome() {
    return name;
  }

  public String getSobrenome() {
    return lastname;
  }

  public double salarioAnual() {
    return salaryMonthly * 12;
  }

  public void aumentoSalario(float aumento) {

    salaryMonthly *= ((100 + aumento) / 100);
  }
}
