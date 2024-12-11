package com.example.oops.Payment_Service;

import java.util.HashMap;

public class PaymentService {

    HashMap<String , PaymentMethod> paymentMethods;

    PaymentService(){
        paymentMethods = new HashMap<>();
    }

    public void addPaymentMethod(String name , PaymentMethod type){
        paymentMethods.put(name , type);
    }

    public void makePayment(String name){
        PaymentMethod pm = paymentMethods.get(name);
        pm.pay();
    }
}
