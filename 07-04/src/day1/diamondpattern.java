package day1;

import java.util.Scanner;

public class diamondpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("ENTER ROWS");
		 int n=sc.nextInt();
		 for(int x=0;x<n;x++) {
			 for(int i=0;i<n-x-1;i++) {
				 System.out.print(" ");
				 }
			 for(int k=0;k<2*x+1;k++) {
				 System.out.print("*");
			 }
			 System.out.println("");
		 }
		 for(int x=n-1;x>0;x--) {
			 for(int i=n-1;i>=x;i--) {
				 System.out.print(" ");
			 }
			 for(int j=2*x-1;j>0;j--) {
				 System.out.print("*");
			 }
			 System.out.println("");
		 }
	}

}
