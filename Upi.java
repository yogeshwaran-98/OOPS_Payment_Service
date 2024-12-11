package com.example.oops.Payment_Service;

public class Upi implements PaymentMethod{

    String upiId;

    Upi(String id){
        this.upiId = id;
    }

    @Override
    public void pay(){
        System.out.println("Upi id is" + upiId);
    }
}
