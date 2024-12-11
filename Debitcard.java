package com.example.oops.Payment_Service;

public class Debitcard extends Card{

    public Debitcard(String cardNo , String cardHolder){
        super(cardNo , cardHolder); //calling the parent's class constructor using super
        //when ever we create a creditcard object , this will call the constructor of the class
        //here since creditcard extends card class , we call the constructor of the parent class using super
    }



    @Override
    public void pay(){
        System.out.println("Payment using debit card" +cardNo + cardHolder);
    }
}
