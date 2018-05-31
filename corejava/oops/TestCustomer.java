package com.cg.corejava.oops;

import java.util.Scanner;

public class TestCustomer {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		sc = new Scanner(System.in);
		System.out.println("cid:");
		int cid = sc.nextInt();
		c.setCid(cid);
		System.out.println("name:");
		String name = sc.next();
		c.setName(name);
		System.out.println("Adress:");
		String address = sc.next();
		c.setAddress(address);
		System.out.println(c);
	}
}
