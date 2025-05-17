package org.example.solid.dip;

public class NotificationService2 {
    Notifier notifier;
    NotificationService2(Notifier n){
        notifier=n;
    }

    public void giveAlert(){
        notifier.notify2();
    }
}
interface Notifier{
    void notify2();
}
class EmailNotify2 implements  Notifier{
    public void notify2(){
        System.out.println("Email Notification sent");
    }
}
class SmsNotify2  implements  Notifier{
    public void notify2(){
        System.out.println("Sms Notification sent");
    }
}
class Main{
    public static void main(String[] args) {
        Notifier e=new EmailNotify2();
        NotificationService2 n=new NotificationService2(e);
        n.giveAlert();

        Notifier S=new EmailNotify2();
        NotificationService2 n2=new NotificationService2(S);
        n2.giveAlert();
    }

}
