package com.cg.corejava.oops;

import java.util.Scanner;

public class Employee {
	int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	double salary;
	String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		System.out.println("id:");
		int id = sc.nextInt();
		e.setId(id);
		System.out.println("salary:");
		double salary = sc.nextDouble();
		e.setSalary(salary);
		System.out.println("name::");
		String name = sc.next();
		e.setName(name);
		System.out.println(e.getId()+" "+e.getName()+" "+ e.getSalary());
		System.out.println(e);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name
				+ "]";
	}

}
