package com.cg.corejava.interfaces;

public class TwoWheeler implements Vehicle {
	
	public void printMessage(){
		System.out.println("****great tu tu****");
	}
	public void start(){
		System.out.println("start Bike ");
	}
	public void acceleration(){
		System.out.println("180km");
	}
	public void stop(){
		System.out.println("Bike stopped");
	}
}
