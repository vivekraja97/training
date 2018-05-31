package com.cg.corejava.inheritance;

import java.util.Scanner;

public class TestEmployee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		Address a = new Address();
		Scanner sc = new Scanner(System.in);
		System.out.println("street:");
		String street =sc.next();
		a.setStreet(street);
		System.out.println("city:");
		String city =sc.next();
		a.setCity(city);
		System.out.println("state:");
		String state =sc.next();
		a.setState(state);
		System.out.println("name:");
		String name =sc.next();
		e.setName(name);
		System.out.println("age:");
		int age  =sc.nextInt ();
		e.setAge(age);
		System.out.println("id:");
		int id =sc.nextInt ();
		e.setId(id);
		System.out.println("salary:");
		double salary  =sc.nextDouble();
		e.setSalary(salary);
		e.setAddr(a);
		System.out.print(e);
	}

}
