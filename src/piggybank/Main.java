package piggybank;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main {

  public static void main(String[] args){
    DecimalFormat fp = new DecimalFormat("$###,###.00");

    ArrayList<Coin> piggyBank = new ArrayList<Coin>();

    piggyBank.add(new Quarter());
    piggyBank.add(new Dime());
    piggyBank.add(new Dollar(5));
    piggyBank.add(new Nickel(3));
    piggyBank.add(new Dime(7));
    piggyBank.add(new Dollar());
    piggyBank.add(new Penny(10));

    double total = 0;

    for(Coin coin : piggyBank) {
      total += coin.getTotalValue();
      System.out.println(coin);
    }

    System.out.println("The piggy bank holds " + fp.format(total));
  }

}