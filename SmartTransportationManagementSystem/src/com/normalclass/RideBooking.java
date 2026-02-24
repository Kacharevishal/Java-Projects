package com.normalclass;

import com.abstractionclass.Booking;
import com.interfaces.Bookable;

public class RideBooking extends Booking implements Bookable{

	private double distance;

	public RideBooking(String bookingId, double distance) {
		super(bookingId);
		this.distance = distance;
	}

	@Override
	public double calculateBookingCost() {
		return distance;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createBooking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancleBooking() {
		// TODO Auto-generated method stub
		
	}

}
