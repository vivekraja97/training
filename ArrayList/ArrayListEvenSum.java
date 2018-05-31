package com.cg.corejava.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int size = 0;
		System.out.println("Enter the element Size");
		size = sc.nextInt();
		System.out.println("enter numbers:");
		for(int i=1;i<=size;i++){
			a.add(sc.nextInt());
		}
		int count=0;
		int sum = 0;
		for(int i=0;i<size-1;i++){//a.size()
			if(a.get(i)%2==0){
				sum=sum+a.get(i);
				count = count+1;
  			}
		}
		System.out.println("Count is:"+count);
		System.out.println("even numbers:"+sum);
	}

}
