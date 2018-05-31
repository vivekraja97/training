package com.cg.corejava.array;

import java.util.Scanner;

public class HalfArray {
	public void doSumProductOfArray(int num[],int size){
		size = size-1;
		size=size/2;
		int sum1=0;
		//System.out.println(size);
		int sum=0;
		for (int i=0;i<size;i++){
			sum=sum+num[i];
		}
		System.out.println("First "+sum);
		for (int i=size+1;i<num.length;i++){
			sum1=sum1+num[i];
		}
		System.out.println("Second"+sum1);
		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int size=0;
		System.out.println("enter array size:");
		size = sc.nextInt();
		int num[] = new int[size];
		if(size%2!=0){
			System.out.println("enter array elements:");
			for(int i=0;i<num.length;i++){
				num[i]= sc.nextInt();
			}
				
		}else {
			System.out.println("enter valid size");
		}
		HalfArray h = new HalfArray();
		h.doSumProductOfArray(num,size);

	}
}
