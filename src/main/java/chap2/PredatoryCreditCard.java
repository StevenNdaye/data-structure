package chap2;

import chap1.CreditCard;

/**
 * Created by stevenndaye on 2017/03/21.
 */
public class PredatoryCreditCard extends CreditCard {

    private double apr;

    public PredatoryCreditCard(String customer, String bank, String account, int limit, double balance, double rate) {
        super(customer, bank, account, limit, balance);
        apr = rate;
    }

    public void processMonth() {
        if (balance > 0) {
            double monthlyFactor = Math.pow(1 + apr, 1.0 / 12);
            balance *= monthlyFactor;
        }
    }

    public boolean charge(double price){
        boolean isSuccess = super.charge(price);
        if(!isSuccess){
            balance += 5;
        }

        return isSuccess;
    }
}
