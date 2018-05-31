package com.cg.corejava.array;

import java.util.Scanner;

public class MyFirstArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Size:");
		int size;
		size = sc.nextInt();
		int num[] = new int[size];
		System.out.println("enter array elements:");
		for (int i=0;i<num.length;i++){
			num[i]=sc.nextInt();
			
		}
		System.out.println("array elements:");
		for (int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
			
		}
	}

}
