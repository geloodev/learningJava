package mypack;

public class Fatura {

  int numItem;
  String description;
  int amountItem;
  float priceItem;

  public Fatura(int numItem, String description, int amountItem, float priceItem) {

    this.numItem = numItem;
    this.description = description;

    if (this.amountItem < 0)
      amountItem = 0;
    else
      this.amountItem = amountItem;

    if (this.priceItem < 0)
      priceItem = 0;
    else
      this.priceItem = priceItem;

  }

  public double getValorFatura() {

    return amountItem * priceItem;
  }
}
