package com.mainclass;

import java.util.Scanner;

import com.normalclass.Driver;
import com.normalclass.RideBooking;
import com.normalclass.Car;
import com.normalclass.CreditCardPayment;
import com.normalclass.Customer;

public class SmartTransportationManagementMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//Customer Input
        System.out.println("Enter Customer Name:");
        String customerName = scan.nextLine();

        System.out.println("Enter Customer Email:");
        String customerEmail = scan.nextLine();

        Customer customer = new Customer(customerName, customerEmail);
		
		 //Driver Input
        System.out.println("Enter Driver Name:");
        String driverName = scan.nextLine();

        System.out.println("Enter Driver Email:");
        String driverEmail = scan.nextLine();

        System.out.println("Enter Driver Base Salary:");
        double salary = scan.nextDouble();
        scan.nextLine(); // consume newline

        Driver driver = new Driver(driverName, driverEmail, salary);
        
        //Car Input
        System.out.println("Enter Vehicle ID:");
        String vehicleId = scan.nextLine();

        System.out.println("Enter Vehicle Model:");
        String model = scan.nextLine();

        Car car = new Car(vehicleId, model);
        
     //Booking Input
        System.out.println("Enter Booking ID:");
        String bookingId = scan.nextLine();

        System.out.println("Enter Ride Distance (in km):");
        double distance = scan.nextDouble();

        RideBooking booking = new RideBooking(bookingId, distance);
        
        //System Workflow
        System.out.println("\n===== SYSTEM WORKFLOW START =====\n");

        customer.displayRole();
        customer.requestBooking(booking);

        driver.displayRole();
        driver.driveVehicle(car);

        double fare = booking.calculateBookingCost();
        System.out.println("Calculated Fare: " + fare);

        CreditCardPayment payment = new CreditCardPayment("TXN" + bookingId);
        payment.processPayment(fare);

        car.scheduleMaintence("2026-03-01");

        System.out.println("\nDriver Final Salary: " + driver.calculateSalary());

        System.out.println("\n===== SYSTEM WORKFLOW END =====");

        scan.close();
	}

}
