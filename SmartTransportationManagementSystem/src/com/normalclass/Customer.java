package com.normalclass;

import com.abstractionclass.User;

public class Customer extends User{

	public Customer(String name, String email) {
		super(name, email);
	}

	public void requestBooking(RideBooking booking)
	{
		booking.createBooking();
	}
	@Override
	public void displayRole() {
		
		System.out.println("Role: Customer");
	}

}
