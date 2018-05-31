package com.cg.corejava.exceptions;

import java.io.Serializable;

public class Employee implements Serializable{
	private Integer empid;
	private String name;
	private transient double salary;
	private static String companyname;
	public static String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return empid +"_"+name+"_"+salary;
				
	}
	

}
