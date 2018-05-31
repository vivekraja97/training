package com.cg.corejava.exceptions;

import java.util.Scanner;

public class Throw {
	public static void doSomthing(int a ,int b){
		if (b!=0){
			System.out.println(a/b);
		}else{
		throw new ArithmeticException("b!=0");
	}
	}
	public static void main(String[] args) {
	doSomthing(5,0);
	}
}

