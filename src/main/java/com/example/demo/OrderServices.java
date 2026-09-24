package com.example.demo;

// import com.example.demo.Notification.EmailServices;

import com.example.demo.Notification.NotificationServices;



 class OrderServices {
    NotificationServices notificationServices ;
    OrderServices orderServices;
    PaymentServices pay;
    // setter
    public void setNotification(NotificationServices notification){
        this.notificationServices =  notification;
    }
    public void setPaymentOrder(PaymentServices pay){
        this.pay = pay;
    }
    // constructor
    public OrderServices(PaymentServices paymentServices){
        this.pay = paymentServices;
    }
    public  OrderServices(NotificationServices notificationServices){
        this.notificationServices = notificationServices;
    }
    // default constructor
//    public OrderServices(){
//
//    }
     public void placedOrder(){
         System.out.println("Order Placed");
         notificationServices.sendNotification();
     }

     public void payOrder(){
        System.out.println("Order Payment Done");
        pay.pay();
     }


    }

