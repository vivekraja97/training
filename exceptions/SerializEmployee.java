package com.cg.corejava.exceptions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializEmployee {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("super.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Employee e1 = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of objects;");
		int noobject=sc.nextInt();
		for(int i=0;i<noobject;i++){
			e1 = new Employee();
			System.out.println("Enter Emo id;");
			e1.setEmpid(sc.nextInt());
			System.out.println("Enter Name:");
			e1.setName(sc.next());
			System.out.println("Enter Salary:");
			e1.setSalary(sc.nextDouble());
			oos.writeObject(e1);
			System.out.println("Enter companyname:");
			e1.setCompanyname(sc.next());
			oos.writeObject(e1);
		}
		System.out.println("added");
		oos.close();
		fos.close();
		
	}

}
