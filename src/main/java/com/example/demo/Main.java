package com.example.demo;

import com.example.demo.Notification.EmailServices;
import com.example.demo.Notification.NotificationServices;

public class Main {
    public static void main(String[] args) {
    NotificationServices notification = new EmailServices();
    PaymentServices paymentServices = new PaymentServices();
//    OrderServices order = new OrderServices();
    OrderServices order1 = new OrderServices(paymentServices);
        OrderServices orderServices = new OrderServices(notification);


        orderServices.placedOrder();
        order1.payOrder();
//        OrderServices orderServices1 = new OrderServices();
//        orderServices1.setNotification(notification);
//               orderServices1.placedOrder();
//               order.payOrder();
//
  }
}
