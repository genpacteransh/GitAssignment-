package com.genpact.handson;

public class EmployeeSalaryException extends Exception{

	public EmployeeSalaryException(double d) {
		super();
		System.out.println("Salary is below the amount of investment in the scheme by "+Math.abs(70000.00-d));
	}
	
}
