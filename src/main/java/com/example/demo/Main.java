package com.example.demo;

import com.example.demo.Notification.EmailServices;
import com.example.demo.Notification.NotificationServices;

public class Main {
    public static void main(String[] args) {
    NotificationServices notification = new EmailServices();
        //OrderServices orderServices = new OrderServices(notification);
        OrderServices orderServices1 = new OrderServices(); 
        orderServices1.setNotification(notification);
               orderServices1.placedOrder();

    }
}
