package org.example.solid.ocp;

public class DiscountCalculator2 {


    public  double calculateDiscount(DiscountStrategy strategy,int amount){
        return strategy.applyDiscount(amount);
    }

}
//class Main {
//    public static void main(String[] args) {
//        DiscountCalculator calculator = new DiscountCalculator();
//
//        DiscountStrategy superPremium = new SuperPremiumCustomer();
//        double discountedAmount = calculator.calculateDiscount(superPremium, 1000);
//
//        System.out.println("Discounted Amount for Super Premium Customer: " + discountedAmount);
//    }
//}
