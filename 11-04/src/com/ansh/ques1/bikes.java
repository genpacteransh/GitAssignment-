package com.ansh.ques1;

abstract class motorbike{
	String color,model;

	public motorbike(String color, String model) {
		super();
		this.color = color;
		this.model = model;
	}
	abstract void brake(String brake);
	abstract void gear(String gear);
	abstract void clutch(String clutch);
	abstract void speed(String speed);
	
}
 class waterbike extends motorbike{

	public waterbike(String color, String model) {
		super(color, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	void brake(String brake) {
		// TODO Auto-generated method stub
		System.out.println("DRUM BRAKES APPLIED"+brake);
	}

	@Override
	void gear(String gear) {
		// TODO Auto-generated method stub
		System.out.println("4 automatic gear applied"+gear);
		
	}

	@Override
	void clutch(String clutch) {
		// TODO Auto-generated method stub
		System.out.println("HAS NO CLUTCH"+clutch);
	}

	@Override
	void speed(String speed) {
		// TODO Auto-generated method stub
		System.out.println("CUrrent speed is"+speed);
		
	}
	 
 }
 class mountainBike extends motorbike{

	public mountainBike(String color, String model) {
		super(color, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	void brake(String brake) {
		// TODO Auto-generated method stub
		System.out.println("DUAL BRAKES APPLIED"+brake);
	}

	@Override
	void gear(String gear) {
		// TODO Auto-generated method stub
		System.out.println("6 automatic gear applied"+gear);
		
	}

	@Override
	void clutch(String clutch) {
		// TODO Auto-generated method stub
		System.out.println("CLUTCH PRESSED"+clutch);
	}

	@Override
	void speed(String speed) {
		// TODO Auto-generated method stub
		System.out.println("CUrrent speed is"+speed);
		
	}	 
 }
 class sportsBike extends motorbike{

	public sportsBike(String color, String model) {
		super(color, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	void brake(String brake) {
		// TODO Auto-generated method stub
		System.out.println("Disk BRAKES APPLIED"+brake);
	}

	@Override
	void gear(String gear) {
		// TODO Auto-generated method stub
		System.out.println("5 automatic gear applied"+gear);
		
	}

	@Override
	void clutch(String clutch) {
		// TODO Auto-generated method stub
		System.out.println("CLUTCH released"+clutch);
	}

	@Override
	void speed(String speed) {
		// TODO Auto-generated method stub
		System.out.println("CUrrent speed is"+speed);
		
	}	 
 }
 
class main{
	public static void main(String args) {
		waterbike wbWaterbike=new waterbike("red", "HOVER");
		mountainBike mountainBike=new mountainBike("WHITE", "ZEE2");
		sportsBike sportsBike=new sportsBike("BLUE", "R15");
	}
}