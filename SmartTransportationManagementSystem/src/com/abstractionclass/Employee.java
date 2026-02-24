package com.abstractionclass;

public abstract class Employee extends User{

	protected double salary;
	
	public Employee(String name, String email, double salary)
	{
		super(name, email);
		this.salary = salary;
	}
	
	public abstract double calculateSalary();
}
