package piggybank;

public class Penny implements Coin {
  
  private double value = 0.01;
  private int amt = 1;

  public Penny () {}

  public Penny(int amt) {
    this.amt = amt;
  }

  public double getTotalValue() {
    return amt * value;
  }

  @Override
  public String toString() {
    if(amt > 1) {
      return amt + " Pennies";
    } else return "1 Penny";
  }
}