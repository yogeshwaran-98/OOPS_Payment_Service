package com.example.oops.Payment_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentServiceApplication {

	public static void main(String[] args) {

		PaymentService ps = new PaymentService();

		ps.addPaymentMethod("clientDB" ,  new Debitcard("1234" , "client1"));
		ps.addPaymentMethod("clientCB" ,  new Creditcard("1238" , "client2"));
		ps.addPaymentMethod("clientUPI" ,  new Upi("xyz@oksbi" ));

		ps.makePayment("clientDB");
		ps.makePayment("clientCB");
		ps.makePayment("clientUPI");
	}

}
