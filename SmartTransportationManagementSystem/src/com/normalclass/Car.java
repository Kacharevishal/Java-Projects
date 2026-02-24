package com.normalclass;

import com.abstractionclass.Vehicle;
import com.interfaces.Maintainable;

public class Car extends Vehicle implements Maintainable {

    public Car(String vehicleId, String model) {
        super(vehicleId, model);
        
        
    }

	@Override
	public void start() {

		System.out.println("Car Started.");
	}

	@Override
	public void stop() {

		System.out.println("Car Stopped.");
	}

	@Override
	public void accelerate(double speed) {

		this.speed += speed;
		System.out.println("Car accelerated to "+this.speed +" km/h");
	}

	@Override
	public void scheduleMaintence(String date) {

		System.out.println("Maintenance scheduled on: "+date);
	}

	@Override
	public void recordServiceHistory(String record) {
		System.out.println("Service Record: "+record);
		
	}

	@Override
	public double calculateFare(double distance) {
		
		return distance * 10;
	}

}
