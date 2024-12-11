package com.example.oops.Payment_Service;

public class Creditcard extends Card {

    public Creditcard(String cardNo , String cardHolder){
        super(cardNo , cardHolder); //calling the parent's class constructor using super
        //when ever we create a creditcard object , this will call the constructor of the class
        //here since creditcard extends card class , we call the constructor of the parent class using super
    }



    @Override
    public void pay(){
        System.out.println("Payment using credit card"  +cardNo + cardHolder);
    }
}
