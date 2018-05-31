package com.cg.basics;

import java.util.Scanner;

public class DataTypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int empid = 36594;
		//int age = 34;
	   // String name = "Ramesh";
	   // char gender = 'M';
	   // float salary = 50000f;
	    //long cnct = 9856426118L;
	  //String mailid = "ramesh22@gmail.com";
	    //System.out.println(empid + "\n" + age + "\n" + name + "\n" + gender + "\n" + salary + "\n" + cnct + "\n" + mailid );
	    Scanner sc = new Scanner(System.in);
	    int empid = sc.nextInt();
	    //System.out.println("empid:");
		int age = sc.nextInt();
	    String name = sc.next();
	    char gender = 'M';
	    float salary = sc.nextFloat();
	    long cnct = sc.nextLong();
	    String mailid = "ramesh22@gmail.com";
	    System.out.println(empid + "\n" + age + "\n" + name + "\n" + gender + "\n" + salary + "\n" + cnct + "\n" + mailid );
	}

}
