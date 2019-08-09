package piggybank;

public class Dime implements Coin {
  
  private double value = 0.1;
  private int amt = 1;

  public Dime () {}

  public Dime(int amt) {
    this.amt = amt;
  }

  public double getTotalValue() {
    return amt * value;
  }

  @Override
  public String toString() {
    if(amt > 1) {
      return amt + " Dimes";
    } else return "1 Dime";
  }
}