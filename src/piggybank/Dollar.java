package piggybank;

public class Dollar implements Coin {
  
  private double value = 1;
  private int amt = 1;

  public Dollar () {}

  public Dollar(int amt) {
    this.amt = amt;
  }

  public double getTotalValue() {
    return amt * value;
  }

  @Override
  public String toString() {
    return "$" + (int)getTotalValue();
  }
}