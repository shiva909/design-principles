package org.example.solid.ocp;

public class PremiumCustomerDiscount implements  DiscountStrategy{

    public double applyDiscount(double amount) {
        return amount*0.30;
    }
}
