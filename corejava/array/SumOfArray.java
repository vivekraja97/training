package com.cg.corejava.array;

import java.util.Scanner;

public class SumOfArray {
	public void doSumOfArray(int num[]){
		int sum = 0;
		for (int i=0;i<num.length;i++){
			sum = sum+num[i];
			
		}System.out.println("sum is :"+sum);
	}
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
		SumOfArray s = new SumOfArray();
		s.doSumOfArray(num);
	}

}
