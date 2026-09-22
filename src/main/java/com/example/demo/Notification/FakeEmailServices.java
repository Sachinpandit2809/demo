package com.example.demo.Notification;

public class FakeEmailServices implements NotificationServices {
    @Override
  public  void sendNotification(){
        System.out.println("Dummy Email Send");
    }

}
