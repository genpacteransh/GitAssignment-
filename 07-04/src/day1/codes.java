package day1;

import java.util.Scanner;

public class codes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number , sum = 0.0;
	     Scanner sc = new Scanner(System.in);
	     for(int i=1 ;i<6 ;i++) {
	         System.out.println(" Enter the number "+i+" :");
	         number = sc.nextDouble();
	         if(number <= 0.0) {
	             continue;
	         }
	         
	         sum += number ;
	     }
	     System.out.println("Sum = "+ + sum );
	     sc.close();
	}

}
