package com.cg.corejava.inheritance;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("name");
		String name= sc.next();
		s.setName(name);
		System.out.println("age");
		int age = sc.nextInt();
		s.setAge(age);
		System.out.println("course");
		String course= sc.next();
		s.setCourse(course);
		System.out.println("coursefee");
		double coursefee= sc.nextDouble();
		s.setCoursefee(coursefee);
		System.out.println(s);
	}

}
