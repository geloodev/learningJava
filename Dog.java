package mypack;

public class Dog {

  private String size;
  private String breed;
  private String name;

  public Dog(String size, String breed, String name) {
    this.size = size;
    this.breed = breed;
    this.name = name;
  }

  public void bark() {
    System.out.println("AUAU");
  }
}
