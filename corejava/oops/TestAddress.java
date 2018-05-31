package com.cg.corejava.oops;

import java.util.Scanner;

public class TestAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a =  new Address();
		Scanner sc = new Scanner(System.in);
		System.out.println("street:");
		String street =sc.next();
		a.setStreet(street);
		System.out.println("city:");
		String city =sc.next();
		a.setCity(city);
		System.out.println("state:");
		String state= sc.next(); 
		a.setState(state);
		System.out.println(a);
		
	}

}
