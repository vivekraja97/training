package com.cg.corejava.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Difference{
	static int diff=0;
	static ArrayList<Integer> a = new ArrayList<>();
	public static int getBigDiff()
	{
		int min=0;	
		min=a.get(0);
			for(int i=0;i<a.size();i++){
				if(a.get(i)<=min){
					min=a.get(i);
				}		
		}System.out.println("min value"+ " " +min);
		int max;	
		max=a.get(0);
			for(int i=0;i<a.size();i++){
				if(a.get(i)>min){
					max=a.get(i);
				}		
			}System.out.println("max value:"+" " +max);
			diff= max-min;
			return diff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size=0;
		System.out.println("enter element count:");
		size = sc.nextInt();
		for(int i=0;i<size;i++)
		{
			a.add(sc.nextInt());
		}
		System.out.println(a);
			System.out.println("Different:"+" " +getBigDiff());
	}	
			
}
		 
		
