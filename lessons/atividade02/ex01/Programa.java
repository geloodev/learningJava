import mypack.Radio;
import java.util.Scanner;

public class Programa {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.printf("Set the volume: ");
    int volume = input.nextInt();

    System.out.printf("Set the frequency: ");
    float frequency = input.nextFloat();

    Radio radio = new Radio(volume, frequency);

    System.out.printf("\n");
    radio.getVolume();
    radio.getFrequency();
  }
}
