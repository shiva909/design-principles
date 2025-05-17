package org.example.solid.dip;

//1)Constructor Injection and 2)Setter Injection
/*
Constructor Injection → Give dependency at object creation time → mandatory dependency.
Setter Injection → Give dependency using setter method after creation → optional dependency.
 */
public class NotificationService {
    EmailNotify emailNotify=new EmailNotify();
    SmsNotify smsNotify=new SmsNotify();
    public void sendEmail(){
        emailNotify.notify2();
    }
    public void sendSms(){
        smsNotify.notify2();
    }
}
class EmailNotify{
    public void notify2(){
        System.out.println("Email Notification sent");
    }
}
class SmsNotify{
    public void notify2(){
        System.out.println("Sms Notification sent");
    }
}
