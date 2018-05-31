package com.cg.corejava.array;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
	public void stringDecending(String letter[],int size){
		Arrays.sort(letter);
		for(int i=size-1;i>=0;i--)
		{	
			System.out.println(letter[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int size=0;
		String letter[] = new String[size];
		System.out.println("enter size:");
		size = sc.nextInt();
		System.out.println("Array Elements:");
		for(int i=0;i<size;i++)
		{
			letter[i]= sc.next();	
		}
		StringArray s = new StringArray();
		 s.stringDecending(letter,size);
}
}