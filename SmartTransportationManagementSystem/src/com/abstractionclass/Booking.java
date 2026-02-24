package com.abstractionclass;

public abstract class Booking {
	
	protected String bookingId;
	
	public Booking(String bookingId)
	{
		this.bookingId = bookingId;
	}
	
	public abstract double calculateBookingCost();
}
