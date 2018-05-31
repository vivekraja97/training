package com.cg.corejava.ArrayList;

import java.util.HashSet;

public class SumOFHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(8);
		int sum =0;
		for(Integer i: hs){
			sum =  sum + i;
		}System.out.println(sum);

	}

}
