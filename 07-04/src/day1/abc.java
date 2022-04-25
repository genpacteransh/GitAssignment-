package day1;

import java.util.Scanner;

public class abc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
		System.out.println("To order South Indian Dish, Enter 1 \nTo order North Indian Dish, Enter 2 \nTo order Rajasthani Dish, Enter 3 \n To order Gujrati Dish, Enter 4 \\n\r\n"
				+ "To order Bengali Dish, Enter 5 \\n\r\n"
				+ "To order Desserts, Enter 6 \\n\r\n"
				+ "To Exit, Enter 9 \\n  ");
		ch=sc.nextInt();
		
			
		switch(ch) {
		case 1:System.out.println("YOULL GET THE FOLLOWING DISHES IN SOUTHINDIAN");
				System.out.println("2 DOSA \n 1 KESARI BHAAT");
				break;
		case 2:System.out.println("YOULL GET THE FOLLOWING DISHES IN NORTH INDIAN");
		System.out.println("2 CHAPATI DAAL \n 1 JALEBI");
		break;
		
		case 3: System.out.println("YOULL GET THE FOLLOWING DISHES IN RAJASTHANI");
		System.out.println("3 BAATI CHOKHA \n 1 DAAL");
		break;
		
		case 4: System.out.println("YOULL GET THE FOLLOWING DISHES IN GUJRATI");
		System.out.println("2 PHAPDHDA \n  4 DHOKLA");
		break;
		
		case 5:System.out.println("YOULL GET THE FOLLOWING DISHES IN BENGAULI");
		System.out.println("2 FISH CURRY \\n 4 ROTI");
		break;
		
		case 6:System.out.println("YOULL GET THE FOLLOWING DISHES IN SWEETDISH");
		System.out.println("1 Butterscoth \n 3 SODAS \n 4pc Jalebi");
		break;
		
		default: System.out.println("WRONG CHOICE ENTERED");
		break;
		}
		
		}while(ch!=9);
		System.out.println("THANK YOU FOR USING US !! ");
		
	}
}
