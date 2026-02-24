package com.normalclass;

import com.abstractionclass.Employee;
import com.abstractionclass.Vehicle;

public class Driver extends Employee{

	public Driver(String name, String email,double salary) {
		super(name,email,salary);
	}
	
	public void driveVehicle(Vehicle vehicle)
	{
		vehicle.start();
		vehicle.accelerate(40);
	}

	@Override
	public double calculateSalary() {

		return salary + 2000; //Bonus example
	}

	@Override
	public void displayRole() {

		System.out.println("Role: Driver");
	}
}
