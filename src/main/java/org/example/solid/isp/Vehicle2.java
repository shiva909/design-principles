package org.example.solid.isp;

interface Drivable{
    void drive();
}
interface Flyable{
    void fly();
}
interface Sailable{
    void sail();
}
class Car2 implements Drivable{
    public void drive() {
        System.out.println("Car driving");
    }
}
class Aeroplane2 implements Drivable,Flyable{
    public void drive() {
        System.out.println("Aeroplane driving");
    }

    public void fly() {
        System.out.println("Aeroplace flying");
    }
}


