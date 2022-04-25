package com.genpact.collection;


import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



class Employee implements Comparable<Employee>{
		private int id;
		private String name;
		private String deprtment;
		private Date dojDate;
		private int age;
		private int salary;
		
		
		public Employee(int id, String name, String deprtment, Date dojDate, int age, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.deprtment = deprtment;
			this.dojDate = dojDate;
			this.age = age;
			this.salary = salary;
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDeprtment() {
			return deprtment;
		}
		public void setDeprtment(String deprtment) {
			this.deprtment = deprtment;
		}
		public Date getDojDate() {
			
			return dojDate;
		}
		public void setDojDate(Date dojDate) {
			this.dojDate = dojDate;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}

		@Override
		public int compareTo(Employee o) {
			// TODO Auto-generated method stub
			return this.salary-o.salary;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			System.out.printf("%-15s %-30s %-30s %-10s %-10s %-10s\n",getId(),getName(),getDeprtment(),getDojDate(),getAge(),getSalary());
			return super.toString();
		}
	}
class AgeComperator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getAge()==o1.getAge()) {
			if((o1.getDojDate()).compareTo(o2.getDojDate())>0) {
				return 1;
			}else {
				return -1;
			}
		}
		else if(o1.getAge()>o1.getAge()) {
			return 1;
		}else {
			return -1;
		}
	}
}

class EmployeeBO{
	public static void printEmployees(List<Employee> a) {
			Iterator<Employee> iterator=a.iterator();
			while (iterator.hasNext()) {
				Employee employee = (Employee) iterator.next();
				System.out.println(employee);
			}
	}
}


public class Assment1{
	public static void main(String args[]) throws ParseException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER NO OF EMPLOYEES");
		int x=scanner.nextInt();
		List<Employee> list=new ArrayList<Employee>();
		int fid=111;
		for(int y=0;y<x;y++) {
			int id=fid+1;
			fid++;
			System.out.println("Enter name");
			 String name=scanner.next();
			 System.out.println("enter department");
			 String deprtment=scanner.next();
			 System.out.println("Enter date n format xx/xx/xxxx");
			 String dateString=scanner.next();
			 Date dojDate=(Date) new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
			 System.out.println("Enter age");
			 int age=scanner.nextInt();
			 System.out.println("Enter salary");
			 int salary=scanner.nextInt();
			 Employee employee=new Employee(id, name, deprtment, dojDate, age, salary);
			 list.add(employee);
		}
		System.out.println("1- sort list by salary \n2- Sort list by ange and doj\n0 - EXIT");
		int choice;
		
		do {
		choice=scanner.nextInt();
		switch (choice) {
		case 1:
			Collections.sort(list,(a,b)->a.getSalary()-b.getSalary());
			EmployeeBO.printEmployees(list);
			break;

		case 2:
			Collections.sort(list,(a,b)->a.compareTo(b));
			EmployeeBO.printEmployees(list);
			break;
		default:
			break;
		}
		
}while(choice!=0);
		
	
}
}
	
