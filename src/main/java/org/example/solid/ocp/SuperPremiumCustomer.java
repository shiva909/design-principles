package org.example.solid.ocp;

public class SuperPremiumCustomer implements DiscountStrategy{

    @Override
    public double applyDiscount(double amount) {
        return amount*0.4;
    }
}
