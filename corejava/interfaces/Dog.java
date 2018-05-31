package com.cg.corejava.interfaces;

public class Dog implements Animal {
	public void bark(){
		System.out.println("bow**bow**");
	}
	public void sleep(){
		System.out.println("ZZZZZZ");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.bark();
		d.sleep();
	}

}
