package com.cg.corejava.ArrayList;

import java.util.HashSet;
import java.util.Scanner;

public class MaxInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet();
		Scanner sc = new Scanner(System.in);
		int size=0;
		System.out.println("enter element size:");
		size = sc.nextInt();
		for(int i=0;i<size;i++){
			hs.add(sc.nextInt());
		}
		System.out.println(hs);
		int max=0;
		for(Integer i : hs){
			if(max<i){
				max=i;
			}
		}System.out.println(max);
	}

}
