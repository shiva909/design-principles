package org.example.solid.lsp;

//Subtypes must be able to replace their parent types without breaking the program's correctness.
//Eg: List<> l=new ArrayLst<>();
//Wherever the parent (Bird2) is expected,
// I should be able to use the child (Penguin2) without surprises or crashes.
public class Bird2 {
   //Only Common Things
    public void sound(){
        System.out.println("Bird is making sound");
    }

}

interface FlyableBird{
    void fly();
}

class Eagle2 extends Bird2 implements FlyableBird{
    public void fly() {
        System.out.println("Eagle is Flying");
    }
}
class Penguin2 extends Bird2{
    //penguin specific things can write here
//    public void swim(){
//        System.out.println("Penguin is swiming");
//    }

}
class Main2{
    public static void main(String[] args) {
        Eagle2 e=new Eagle2();
        e.fly();
        e.sound();
        Bird2 p=new Penguin2();
        p.sound();
    }
}




