package com.cg.corejava.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		int size =0;
		System.out.println("enter elements size:");
		size = sc.nextInt();
		for(int i=0;i<size;i++){
			a.add(sc.nextInt());
		}
		System.out.println(a);
		ArrayList<Integer> b = new ArrayList<>();
		for(int i=0;i<size;i++){
			if(a.get(i)%2==0){
				b.add(a.get(i));
			}
		}
		System.out.println(b);
	}	
}

