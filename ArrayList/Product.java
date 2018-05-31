package com.cg.corejava.ArrayList;

public class Product implements Comparable {
	private Integer pid;
	private String name;
	private double price;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return  pid + "-" +name +"-"+ price;
		
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 1;
	}
	
}
