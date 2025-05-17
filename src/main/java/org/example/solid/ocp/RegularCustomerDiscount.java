package org.example.solid.ocp;

public class RegularCustomerDiscount implements  DiscountStrategy{

    public double applyDiscount(double amount) {
        return amount*0.10;
    }
}
