package com.cg.corejava.ArrayList;

import java.util.HashMap;
import java.util.Scanner;

public class DaysInMonth {
	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("jan",31);
		hm.put("feb",28);
		hm.put("mar",31);
		hm.put("apr",30);
		hm.put("may",31);
		hm.put("jun",30);  
		hm.put("jul",31);
		hm.put("aug",31); 
		hm.put("sep",30);
		hm.put("oct",31);
		hm.put("nov",30);
		hm.put("dec",31);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter month:");
		String num = sc.next().substring(0,3).toLowerCase();
		System.out.println(hm.get(num));
 		
	}
}
