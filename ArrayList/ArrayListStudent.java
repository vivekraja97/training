package com.cg.corejava.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class ArrayListStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> a = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		int size=0;
		System.out.println("enter number of elements:");
		size = sc.nextInt();
		for (int i=0;i<size;i++){
		Student s = new Student();
		System.out.println("enter Student ID:");
		s.setSid(sc.nextInt());
		System.out.println("enter name:");
		s.setName(sc.next());
		System.out.println("enter mark:");
		s.setMark(sc.nextDouble());
		a.add(s);
		}System.out.println(a);
	}
}

