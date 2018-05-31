package com.cg.corejava.ArrayList;

import java.util.ArrayList;

public class ArryListEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> a = new ArrayList();
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("vivek");
		e1.setSalary(50000.00);
		a.add(e1);
		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("raja");
		e2.setSalary(25000.00);
		a.add(e2);
		System.out.println(a);
	}

}
