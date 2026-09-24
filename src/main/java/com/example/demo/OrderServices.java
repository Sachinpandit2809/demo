package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// import com.example.demo.Notification.EmailServices;

import com.example.demo.Notification.NotificationServices;


@Component
 class OrderServices {
    NotificationServices notificationServices ;
    OrderServices orderServices;
//    @Autowired
    PaymentServices pay;
    // setter
    public void setNotification(NotificationServices notification){
        this.notificationServices =  notification;
    }
//    @Autowired
//    public void setPaymentOrder(PaymentServices pay){
//        this.pay = pay;
//    }
    // constructor
//    @Autowired
    public OrderServices(PaymentServices paymentServices){
        this.pay = paymentServices;
    }

//    public  OrderServices(NotificationServices notificationServices){
//        this.notificationServices = notificationServices;
//    }
    // default constructor
//    public OrderServices(){
//
//    }
     public void placedOrder(){
         System.out.println("Order Placed");
         pay.pay();
     }

     public void payOrder(){
        System.out.println("Order Payment Done");
        pay.pay();
     }


    }

