package com.example.demo;

import com.example.demo.Notification.*;

public class Main {
    public static void main(String[] args) {
    NotificationServices notification = new FakeEmailServices();
        OrderServices orderServices = new OrderServices(notification);
        orderServices.placedOrder();

    }
}
