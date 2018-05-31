package com.cg.corejava.ArrayList;

public class Student {
	private int sid;
	private String name;
	private Double mark;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getMark() {
		return mark;
	}
	public void setMark(Double mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return  sid +" "+  name+ " " + mark;
	}
	
}
