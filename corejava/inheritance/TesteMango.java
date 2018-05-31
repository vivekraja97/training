package com.cg.corejava.inheritance;

import java.util.Scanner;

public class TesteMango {

	public static void main(String[] args) {
		BanginaPally b = new BanginaPally();
		Scanner sc = new Scanner(System.in);
		System.out.println("Name:");		
		String fruitname =  sc. next();
		b.setFruitname(fruitname);
		System.out.println("Quantity:");
		int quantity=sc.nextInt();
		b.setQuantity(quantity);
		System.out.println("Price:");
		float price=sc.nextFloat();
		b.setPrice(price);
		System.out.println(b);
		b.calculatePrice();
	}

}
