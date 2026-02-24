package com.abstractionclass;


public abstract class Payment{

	protected String transactionId;
	
	public Payment(String transactionId)
	{
		this.transactionId = transactionId;
	}
	
	public abstract void generateReceipt();
}
