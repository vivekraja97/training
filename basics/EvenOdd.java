package com.cg.basics;

import java.util.Scanner;

public class EvenOdd {
	public void checkNumber(int a){
	if (a > 0){
		if (a%2==0){
			System.out.println("even number");
		}
		else{
			System.out.println("odd number");
		}
		
	}else
	{
		System.out.println("invalid");	
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		EvenOdd e = new EvenOdd();
		e.checkNumber(num);
		
	}
}