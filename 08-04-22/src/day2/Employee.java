package day2;

import java.security.Identity;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicStampedReference;

public class Employee {

	int id;
	String name;
	int sal;
	String skill;
	int exp;
	
	//collect data of 10 employee
	//display the highest payed salary employee
	//print the details of those employees whose skill set is java
	//if the experience is more than 5 years and skill is java full stack give 20% hike in salary and print
	//where the experience is more than 10yrs ask them to change the skill set and print their details
	
	public Employee(int id, String name, int sal, String skill, int exp) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.skill = skill;
		this.exp = exp;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		// TODO Auto-generated method stub
		Employee [] emp=new Employee[2];
		for(int x=0;x<emp.length;x++) {
			System.out.println("Enter Identity" );
			int id=scanner.nextInt();
			System.out.println("");
			System.out.println("Enter name");
			String nameString=scanner.next();
			System.out.println("Enter Salary" );
			int sal=scanner.nextInt();
			System.out.println("Enter skill");
			String skill=scanner.next();
			System.out.println("Enter Exp" );
			int exp=scanner.nextInt();
			Employee employee=new Employee(id, nameString, sal, skill, exp);
			emp[x]=employee;
			highest(emp);
			
		}
		
		
	}
	
	public static void highest(Employee emp[]) {
		int max=0;
		int loc=0; 
		for (int i = 0; i < emp.length; i++) {
			if(emp[i].sal>=max) {
				max=emp[i].sal;
				loc=i;
			}
		}
		System.out.println("THE DETAILS OF EMPLOYEE HAVING HIGHEST SAL IS");
		System.out.println("ID "+emp[loc].id+"\nName "+emp[loc].name+"\nSalary "+emp[loc].sal+"\nSkill "+emp[loc].skill+"\nExperience"+emp[loc].exp);
	}
	
	public static void javaskill(Employee emp[]) {
		System.out.println("PERSON WITH SKILL SET AS JAVA ARE FOLLOWS");
		for (int i = 0; i < emp.length; i++) {
			if(emp[i].skill=="JAVA") {
				System.out.println("ID "+emp[i].id+"\nName "+emp[i].name+"\nSalary "+emp[i].sal+"\nSkill "+emp[i].skill+"\nExperience"+emp[i].exp);

			}
		}
		System.out.println("PERSON WITH SKILL SET AS JAVA ARE FOLLOWS");
		for (int i = 0; i < emp.length; i++) {
			if(emp[i].skill=="JAVA") {
				System.out.println("ID "+emp[i].id+"\nName "+emp[i].name+"\nSalary "+emp[i].sal+"\nSkill "+emp[i].skill+"\nExperience"+emp[i].exp);

			}
		}
	}
	
	


	

}
