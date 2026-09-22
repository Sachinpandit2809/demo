package com.example.demo;

// import com.example.demo.Notification.EmailServices;
import com.example.demo.Notification.NotificationServices;

public class OrderServices {
    NotificationServices notificationServices ;
    // setter
    public void setNotification(NotificationServices notification){
        this.notificationServices =  notification;
    }
    // constructor
    public  OrderServices(NotificationServices notificationServices){
        this.notificationServices = notificationServices;
    }
    // default constructor
    public OrderServices(){

    }
     public void placedOrder(){
         System.out.println("Order Placed");
         notificationServices.sendNotification();
     }


    }

