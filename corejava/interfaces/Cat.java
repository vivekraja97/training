package com.cg.corejava.interfaces;

public class Cat implements Animal {
	public void bark(){
		System.out.println("mm eme emem");
	}
	public void sleep(){
		System.out.println("zzzzz");
	}
	public static void main(String[] args) {
		Cat c = new Cat();
		c.bark();
		c.sleep();
	}
}
