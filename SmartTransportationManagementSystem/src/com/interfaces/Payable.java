package com.interfaces;

public interface Payable {

	void processPayment(double ammount);
	boolean validateTransaction();
}
