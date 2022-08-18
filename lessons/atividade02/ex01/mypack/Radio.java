package mypack;

public class Radio {
  private int volume;
  private float frequency;

  public Radio(int volume, float frequency) {
    this.volume = volume;
    this.frequency = frequency;
  }

  public void getVolume() {
    System.out.printf("%d dB\n", volume);
  }

  public void getFrequency() {
    System.out.printf("%.2f Hz\n", frequency);
  }
}
