package com.example.demo.Payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component 
@Qualifier ("card")
public class CardPayment implements  PaymentServices {

    @Override
    public void pay() {
        System.out.println("Card Payment has been done ");
    }
    
}
