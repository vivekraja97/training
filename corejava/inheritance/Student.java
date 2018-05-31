package com.cg.corejava.inheritance;

public class Student extends Person {
	private String course;
	private double coursefee;
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getCoursefee() {
		return coursefee;
	}

	public void setCoursefee(double coursefee) {
		this.coursefee = coursefee;
	}

	
	
	@Override
	public String toString() {
		return getName()+" " + getAge()+" " +course+" " +coursefee;
	}

}
