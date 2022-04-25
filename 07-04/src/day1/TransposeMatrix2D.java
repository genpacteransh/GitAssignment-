package day1;

import java.util.Scanner;

public class TransposeMatrix2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("ENTER ROWS");
		 int r=sc.nextInt();
		 System.out.println("ENTER COLUMN");
		 int c=sc.nextInt();
		 int arr[][] = new int[r][c];
		 for(int x=0;x<r;x++) {
			 for(int y=0;y<c;y++) {
				 arr[x][y]=sc.nextInt();
			 }
		 }
		 System.out.println("2d Array entered is ****************");
		 
		 for(int x=0;x<r;x++) {
			 for(int y=0;y<c;y++) {
				 System.out.print(arr[x][y]);
			 }
			 System.out.println("");
		 }
		 
		 System.out.println("2D array after TransposeMatrix2D ************");
		 
		 for(int x=0;x<r;x++) {
			 int temp=0;
			 for(int y=0;y<c;y++) {
				 temp=arr[x][y];
				 arr[x][y]=arr[y][x];
				 arr[y][x]=temp;
			 }
			 
		 }
		 for(int x=0;x<r;x++) {
			 for(int y=0;y<c;y++) {
				 System.out.print(arr[x][y]+" ");
			 }
			 System.out.println("");
		 }
		 
		 
		 
		
	}

}
