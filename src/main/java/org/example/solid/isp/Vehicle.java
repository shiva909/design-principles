package org.example.solid.isp;

public interface Vehicle {
    void drive();
    void fly();
    void sail();
}
class Car implements Vehicle{
    public void drive() {
        System.out.println("Car driving");
    }
    public void fly() {
        throw new IllegalArgumentException("Car's can't fly");
    }
    public void sail(){
        throw new IllegalArgumentException("Car's can't sail");
    }
}
class Aeroplane implements Vehicle{
    public void drive() {
        System.out.println("Aeroplane driving");
    }
    public void fly() {
        System.out.println("Aeroplane flying");
    }
    public void sail(){
        throw new IllegalArgumentException("Aeroplane's can't sail");
    }
}

