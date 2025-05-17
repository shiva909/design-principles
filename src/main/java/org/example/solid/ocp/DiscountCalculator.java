package org.example.solid.ocp;
//what if new superpremimum types comess in
//you should not modify the method
public class DiscountCalculator {
    public  double applyDiscount(String customerType,int amount){
        if(customerType.equals("REGULAR")){
            return amount*0.1;
        }else if(customerType.equals("PREMIUM")){
            return amount*0.2;
        }else{
            return amount*0.05;
        }
    }

}
