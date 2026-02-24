package com.normalclass;

import com.abstractionclass.Payment;
import com.interfaces.Payable;

public class CreditCardPayment extends Payment implements Payable {

	public CreditCardPayment(String transactionId) {
		super(transactionId);
	}

	
	@Override
	public void processPayment(double ammount) {
		
		if(validateTransaction())
		{
			System.out.println("Payment of "+ ammount +"processed via Credit Card.");
			generateReceipt();
		}
		
	}

	@Override
	public boolean validateTransaction() {
		return true;
	}
	
	@Override
	public void generateReceipt() {

		System.out.println("Receipt Generated. Transaction Id: " + transactionId);
		
	}


}
