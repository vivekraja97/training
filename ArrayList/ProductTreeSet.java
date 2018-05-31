package com.cg.corejava.ArrayList;

import java.util.Scanner;
import java.util.TreeSet;

public class ProductTreeSet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size=0;
		size = sc.nextInt();
		TreeSet<Product> ts = new TreeSet(new PriceBasedComparator());
		Product p = null;
		for(int i=0;i<size;i++){
			p = new Product();
			System.out.println("enter Pid:");
			p.setPid(sc.nextInt());
			System.out.println("Enter name");
			p.setName(sc.next());
			System.out.println("Enter price");
			p.setPrice(sc.nextDouble());
			ts.add(p);
		}System.out.println(ts);
		
		
	}

}
