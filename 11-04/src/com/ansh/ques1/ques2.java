package com.ansh.ques1;

import java.util.Scanner;
import java.util.regex.Pattern;

class userMainCode1 {
	public static int validateNumber(String num) {
		
	 Pattern pattern=Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
	 if(pattern.matcher(num).matches()==true) {
		 return 1;
	 }else {
		 return -1;
	 }
	
	}
}

class Main2{
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER STRING");
		String numString=scanner.next();
		userMainCode1 userMainCode1=new userMainCode1();
		int res=userMainCode1.validateNumber(numString);
		if(res==1) {
			System.out.println("VALID NUMBER FORMAT SAMPLE");
		}else {
			System.out.println("INVALID NUMBER FORMAT SAMPLE");
		}
	}
}
