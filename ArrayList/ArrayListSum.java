package com.cg.corejava.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of element:");
		int size = sc.nextInt();
		System.out.println("enter numbers:");
		for(int i =1; i<=size;i++)
		{
			a1.add(sc.nextInt());
		}
		int sum=0;
		for(int i=0;i<a1.size();i++){
			sum = sum+a1.get(i);
		}
		System.out.println("sum"+sum);
	}

}
