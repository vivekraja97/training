package com.cg.corejava.interfaces;

public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle c = new Car();
		c.start();
		c.acceleration();
		c.stop();   
		Car audi = (Car)c;
		audi.display();
		Vehicle v = new TwoWheeler();
		v.start();
		v.acceleration();
		v.stop();
		TwoWheeler b = (TwoWheeler)v;
		b.printMessage();
	}

}
