package day1;

import java.util.Scanner;

public class LetterA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("ENTER ROWS");
		 int n=sc.nextInt();
		 for(int x=0;x<n;x++) {
			 for(int y=0;y<=n/2;y++) {
				 if(x==0&&y!=0&&y!=n/2 || y==0&&x!=0 || y==n/2&&x!=0 || x==n/2) {
					 System.out.print("* ");
				 }else {
					 System.out.print("  ");
				 }
			 }
			 System.out.println("");
		 }
		
	}

}
