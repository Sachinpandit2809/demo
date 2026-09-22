package com.example.demo;

import com.example.demo.Notification.EmailServices;
import com.example.demo.Notification.NotificationServices;

public class OrderServices {
    NotificationServices notificationServices ;

    public  OrderServices(NotificationServices notificationServices){
        this.notificationServices = notificationServices;
    }
     public void placedOrder(){
         System.out.println("Order Placed");
         notificationServices.sendNotification();
     }


    }

