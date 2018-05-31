package com.cg.inheritanceactivity;

public class Employee {
     long employeeid;
     String employeename;
     String  employeeaddress;
     Long employeephone;
     double basicSalary;
     double specialallowance=250.80;
     double hra=1000.50;
	public Employee(long id, String name,String address, Long phone,double salary) {
		super();
		this.employeeid = id;
		this.employeename = name;
		this.employeeaddress = address;
		this.employeephone = phone;
		this.basicSalary = salary;
	}
	public void calculateSalary (){
		double salary;
		salary =  basicSalary + ( basicSalary * specialallowance/100) + ( basicSalary * hra/100); 
		System.out.println(salary);
	}
}
