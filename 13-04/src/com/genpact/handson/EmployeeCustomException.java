package com.genpact.handson;

import java.util.Scanner;

public class EmployeeCustomException {

	public static void  checkeligibility(double d)throws EmployeeSalaryException{
		if(d<70000) {
			System.out.println("YOU ARE NOT YET ALIGIBLE FOR INVESTMENT");
			throw new EmployeeSalaryException(d);
			
		}else {
			System.out.println("Enjoy your investment");
		}
	}
	
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER SALARY");
		try {
			checkeligibility(scanner.nextDouble());
		}catch (EmployeeSalaryException e) {
			// TODO: handle exception
			System.out.println("ERROR");
		}
		
		
	}
}
