package com.cg.corejava.array;

import java.util.Scanner;

public class OddArraySum {
	public void doOddArraySum(int num[]){
		int sum = 0;
		for (int i=0;i<num.length;i++){
			if(i%2!=0){
				sum= sum+num[i];
			}	
		}System.out.println("sum is :"+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Size:");
		int size;
		size = sc.nextInt();
		int num[] = new int[size];
		System.out.println("enter array elements:");
		for (int i=0;i<num.length;i++){
			num[i]=sc.nextInt();		
		}
		OddArraySum s = new OddArraySum();
		s.doOddArraySum(num);
	}
	}


