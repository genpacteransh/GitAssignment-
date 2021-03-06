package com.genpact.quiz;

import java.io.StreamCorruptedException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in).useDelimiter("\n");
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","anshgupta");
			
			while(true) {
				System.out.println("1- TO USE AS ADMIN");
				System.out.println("2- TO USE AS A QUIZ TAKER");
				System.out.println("0- TO QUIT ");
				Statement st=null;
				ResultSet rSet=null;
				PreparedStatement ps=null;
				int ch=sc.nextInt();
			
				if(ch==1) {
					System.out.println("Enter Admin username");
					String unameString=sc.next();
					System.out.println("Enter Admin password");
					String passString=sc.next();
					
					if(unameString.equals("anshgupta")&&passString.equals("jdbc")) {
						System.out.println("1 - view all quiz takers");
						System.out.println("2 - view all questions");
						System.out.println("3 - add questions");
						System.out.println("4 - delete questions");
						int choice=sc.nextInt();
						switch(choice) {
						case 1:
							//write code to access users table
								st=con.createStatement();
								rSet=st.executeQuery("Select * from users");
							while(rSet.next()) {
								System.out.println("Name of user is "+rSet.getString(1)+"\n"+"Score :- "+rSet.getInt(2)+"\n");
							}
							
							break;
						case 2:
							//write code to view all questions
							 	st=con.createStatement();
							 	rSet=st.executeQuery("Select * from questions");
							while(rSet.next()) {
								System.out.println("Question is :- \n"+rSet.getString(1)+"\n"+"Answer 1 "+rSet.getString(2)+"\n"+"Answer 2 "+rSet.getString(3)+"\n"+"Answer 3 "+rSet.getString(4)+"\n"+"Correct answer is :- \n"+rSet.getString(5)+"\n");
							}
							break;
						case 3:
							//write code to add questions
							System.out.println("Enter number of questions to add");
							int no=sc.nextInt();
							for(int x=0;x<no;x++) {
								System.out.println("Enter the question");
								String question =sc.next();
								System.out.println("Enter fake answer 1 2 and 3");
								String a1 =sc.next();
								String a2 =sc.next();
								String a3 =sc.next();
								System.out.println("Enter correct answer");
								String a4=sc.next();
								ps=con.prepareStatement("Insert into questions(question,ans1,ans2,ans3,correctans) values (?,?,?,?,?)");
								ps.setString(1,question);
								ps.setString(2, a1);
								ps.setString(3, a2);
								ps.setString(4, a3);
								ps.setString(5, a4);
								ps.executeUpdate();
							
							}
							
							break;
						case 4:
							System.out.println("Enter question number to delete");
							int val=sc.nextInt();
							st=con.createStatement();
							int res=st.executeUpdate("DELETE FROM questions WHERE id="+val);
							if(res==0) {
								System.out.println("Deletion failed");
							}else {
								System.out.println("Deletion successfull");
							}
							
						default:
							System.out.println("wrong chioce entered");
								
						}
					}else {
					System.out.println("Wrong admin username or password");	
					}
					
					
				}else if (ch==2) {
					System.out.println("welcome to quiz application you have to type answers to each question and each correct answer is \n awarded with 3 points");
					System.out.println("For every wrong choice there is -1 ");
					//write logic to take out each question and check answer from db and create score and update in the user table
					System.out.println("enter name");
					String  name = sc.next();
					st=con.createStatement();
					int score=0;
				 	rSet=st.executeQuery("Select * from questions");
				 	while(rSet.next()) {
				 		System.out.println("Question is :- \n"+rSet.getString(1)+"\n"+"Option 1 "+rSet.getString(2)+"\n"+"Option 2 "+rSet.getString(3)+"\n"+"Option 3 "+rSet.getString(4)+"\n"+"Option 4\n"+rSet.getString(5)+"\n");
				 		System.out.println("Enter your Answer");
				 		String answerString=sc.next();
				 		if(answerString.equals(rSet.getString(5))) {
				 			System.out.println("That was a Correct Answer");
				 			score+=3;
				 			System.out.println("Current Score is "+score);
				 		}else {
				 			System.out.println("Wrong answer entered");
				 			score--;
				 			System.out.println("Current Score is "+score);
				 		}
				 	
				 	}
				 	System.out.println("You have completed your quiz your score is"+score);
				 	
				 	ps=con.prepareStatement("insert into users values(?,?)");
				 	ps.setString(1, name);
				 	ps.setInt(2, score);
				 	ps.executeUpdate();
				}else if(ch==0){
					System.out.println("THANK YOU FOR USING QUIZ APPLICATION");
					break;
				}else {
					System.out.println("WRONG CHOICE ENTERED");
					continue;
				}
			}
		
		con.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
