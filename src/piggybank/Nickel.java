package piggybank;

public class Nickel implements Coin {
  
  private double value = 0.05;
  private int amt = 1;

  public Nickel () {}

  public Nickel(int amt) {
    this.amt = amt;
  }

  public double getTotalValue() {
    return amt * value;
  }

  @Override
  public String toString() {
    if(amt > 1) {
      return amt + " Nickels";
    } else return "1 Nickel";
  }
}