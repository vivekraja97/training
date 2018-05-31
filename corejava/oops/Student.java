package com.cg.corejava.oops;

import java.util.Scanner;

public class Student {
	int id;
	String course;
	double coursefee;
	Student(int id,String course,double coursefee){
		this.id=id;
		this.course=course;
		this.coursefee=coursefee;
		System.out.println("cool");
	}
	public void display(){
		System.out.println(id+" "+course+ " "+ coursefee);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("id:");
		int id = sc.nextInt();
		System.out.println("course:");
		String course=sc.next();
		System.out.println("coursefee:");
		double coursefee=sc.nextDouble();
		Student s = new Student(id,course,coursefee);
		s.display();
		
		
		
	}

}
