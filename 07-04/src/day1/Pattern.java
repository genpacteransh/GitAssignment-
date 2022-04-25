package day1;

import java.util.Iterator;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("ENTER ROWS");
		 int r=sc.nextInt();
		 for(int x=r;x>=1;x--) {
			 for(int y=1;y<=x;y++) {
				 System.out.print(" ");
			 }
			 for(int y=r;y>=x;y--) {
				 System.out.print("*");
			 }
			 System.out.println("");
		 }
		 
	}

}
