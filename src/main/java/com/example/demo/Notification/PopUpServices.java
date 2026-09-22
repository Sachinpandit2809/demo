package com.example.demo.Notification;

public class PopUpServices implements  NotificationServices{
    @Override
    public void  sendNotification(){
        System.out.println("PopUp Notification send");
    }
}
