package com.cg.corejava.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
	public void arrayInAccending(int num[],int size){
		Arrays.sort(num);
		for (int i=0;i<num.length;i++){
			System.out.println(num[i]);
		}	
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
		}ArraySort a = new ArraySort();
		 a.arrayInAccending(num,size);		
	}
}
