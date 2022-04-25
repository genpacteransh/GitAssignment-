package com.ansh.ques1;

import java.util.Scanner;

class UserMainCode{
	public static int checkSum(int x) {
		int d=0;
		int sum=0;
		while(x!=0) {
			d=0;
			d=x%10;
			if(d%2!=0) {
				sum=sum+d;
			}
			x=x/10;
		}
		if(sum%2==0) {
			return -1;
		}else {
			return 1;
		}
	}
}

class Main1{
	public static void main(String args[]) {
		UserMainCode umcCode=new UserMainCode();
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER VALUE");
		int val=scanner.nextInt();
		int c=umcCode.checkSum(val);
		if(c==-1) {
			System.out.println("SUM OF ODD DIGITS IS EVEN");
		}else {
			System.out.println("SUM OF ODD DIGITS IS ODD");
		}
	}
}
