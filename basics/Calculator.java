package com.cg.basics;

import java.util.Scanner;

public class Calculator {
	public void doSum(int a, int b){
		System.out.println("sum is:"+ (a + b));
	}
	public void doSub(int a,int b){
		if (a>b){
			System.out.println("sub is:"+(a - b));
			}
			else{
				System.out.println(b-a);
			}
		}
	
	public void doMul(int a, int b){
		System.out.println("mul is:"+ (a * b));
	}
	public void doDiv(int a, int b){
		System.out.println("div is:"+ (a / b));
	}
	public void display(){
		System.out.println("good afternoon");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("num1:");
		num1 = sc.nextInt();
		System.out.print("num2:");
		num2 = sc.nextInt();
		//System.out.println("sum is:"+sum);
		Calculator c = new Calculator();
		c.doSum(num1, num2);
		c.doSub(num1, num2);
		c.doMul(num1, num2);
		c.doDiv(num1, num2);
		c.display();
	}

}
