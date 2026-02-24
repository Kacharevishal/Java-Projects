package com.abstractionclass;

import com.interfaces.Drivable;
import com.interfaces.Trackable;

public abstract class Vehicle implements Drivable, Trackable{

	protected String vehicleId;
	protected String model;
	protected Double speed;
	protected String location;
	
	public Vehicle(String vehicleId, String model)
	{
		this.vehicleId = vehicleId;
		this.model = model;
		this.speed = 0.0;
		this.location= "Unknown";
	}
	
	public abstract double calculateFare(double distance);
	
	public String getVehicleDetails()
	{
		return "Vehicle Id: " + vehicleId + ", Model: "+model;
	}
	
	@Override
     public String getCourrentLocation()
     {
    	 return location;
     }
	
	@Override
	public void updateLocation(String location)
	 {
		this.location = location;
	 }
		
}
