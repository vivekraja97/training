package com.cg.corejava.inheritance;

public class Employee extends Person  {
	private int id;
	private double salary;
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
	@Override
	public String toString() {
		return getName()+" " + getAge()+" "+getAddr()+" " +id + " "+ salary;
	}
}
