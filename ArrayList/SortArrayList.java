package com.cg.corejava.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int size=0;
		System.out.println("enter elements of array:");
		size = sc.nextInt();
		for(int i=0;i<size;i++){
			a.add(sc.nextInt());
		}System.out.println(a);
		TreeSet<Integer> ts = new TreeSet<>();
		ts.addAll(a);
		System.out.println(ts);
			}
	}



