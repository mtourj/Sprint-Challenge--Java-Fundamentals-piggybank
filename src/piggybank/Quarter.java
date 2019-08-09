package piggybank;

public class Quarter implements Coin {
  
  private double value = 0.25;
  private int amt = 1;

  public Quarter () {}

  public Quarter(int amt) {
    this.amt = amt;
  }

  public double getTotalValue() {
    return amt * value;
  }

  @Override
  public String toString() {
    if(amt > 1) {
      return amt + " Quarters";
    } else return "1 Quarter";
  }
}