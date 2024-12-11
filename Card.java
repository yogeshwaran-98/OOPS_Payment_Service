package com.example.oops.Payment_Service;

abstract public class Card implements PaymentMethod {

    protected String cardNo;

    protected String cardHolder;

    public Card(String cardNo , String cardHolder){
        this.cardNo =cardNo;
        this.cardHolder = cardHolder;
    }

    public String getCardNo(){
        return cardNo;
    }

    public String getCardHolder(){
        return cardHolder;
    }


}
