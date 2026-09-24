package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Customer customer = context.getBean(Customer.class);
        PaymentServices paymentServices = context.getBean(PaymentServices.class);
        OrderServices orderServices =  context.getBean(OrderServices.class);
        orderServices.placedOrder();
//        paymentServices.pay();
        customer.displayDetails();


    }
}


// public class Main {
//     public static void main(String[] args) {
//     NotificationServices notification = new EmailServices();
//     PaymentServices paymentServices = new PaymentServices();
// //    OrderServices order = new OrderServices();
//     OrderServices order1 = new OrderServices(paymentServices);
//         OrderServices orderServices = new OrderServices(notification);


//         orderServices.placedOrder();
//         order1.payOrder();
// //        OrderServices orderServices1 = new OrderServices();
// //        orderServices1.setNotification(notification);
// //               orderServices1.placedOrder();
// //               order.payOrder();
// //
//   }
// }
