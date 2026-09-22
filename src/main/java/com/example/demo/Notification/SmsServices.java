package com.example.demo.Notification;

public class SmsServices implements  NotificationServices{
    @Override
    public void sendNotification(){
        System.out.println("Sms Notification send");
    }
}
