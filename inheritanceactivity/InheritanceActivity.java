package com.cg.inheritanceactivity;

import java.util.Scanner;

public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager(126534, "Peter","chennai indai",237844,65000);
		Trainee t = new Trainee(29846,"Jack","Mumbai India",442085,65000);
		m.calculateSalary();
	}

}
