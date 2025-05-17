package org.example.solid.lsp;
//Liskob Substituion principle
public class Bird {
    public void fly() {
        System.out.println("Bird is Flying");
    }
}
class Eagle extends Bird{
    public void fly() {
        System.out.println("Eagle is Flying");
    }
}
class Penguin extends Bird{
    @Override
    public void fly() {
        throw new IllegalArgumentException("Penguin Can't Fly");
    }
}
class Main{
    public static void main(String[] args) {
        Bird e=new Eagle();
        e.fly();
        Bird p=new Penguin();
        p.fly();
    }
}



