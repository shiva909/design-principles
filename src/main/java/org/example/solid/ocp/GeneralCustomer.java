package org.example.solid.ocp;

public class GeneralCustomer implements  DiscountStrategy{
    public double applyDiscount(double amount) {
        return amount*0.05;
    }
}
