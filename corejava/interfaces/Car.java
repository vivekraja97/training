package com.cg.corejava.interfaces;

public class Car implements Vehicle {
	public void display(){
		System.out.println("****cool Car****");
	}
	public void start(){
		System.out.println("start");
	}
	public void acceleration(){
		System.out.println("120km");
	}
	public void stop(){
		System.out.println("stop");
	}
}
