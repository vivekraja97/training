package com.cg.corejava.inheritance;

public class B extends A{
	
	public B(int num1, int num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
		System.out.println(num1+"cool"+num2);
	}

	public void display(){
		super.display();
		System.out.println("Child B : Display");
		
	}
}
