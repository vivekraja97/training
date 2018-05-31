package com.cg.corejava.array;

import java.util.Scanner;

public class DaysInaMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		System.out.println("enter a date:");
		String date = sc.next();
		String count[]= date.split("-");
		if(count[1].equals("01")){
			System.out.println("jan");
		}else if(count[1].equals("02")){
			System.out.println("feb");
	}
		else if(count[1].equals("02")){
			System.out.println("feb");
	}
		else if(count[1].equals("03")){
			System.out.println("march");
	}
		else if(count[1].equals("04")){
			System.out.println("april");
	}
		else if(count[1].equals("05")){
			System.out.println("may");
	}
		else if(count[1].equals("06")){
			System.out.println("jun");
	}
		else if(count[1].equals("07")){
			System.out.println("jully");
	}
		else if(count[1].equals("08")){
			System.out.println("augest");
	}
		else if(count[1].equals("09")){
			System.out.println("augest");
	}
		else if(count[1].equals("10")){
			System.out.println("sep");
	}
		else if(count[1].equals("11")){
			System.out.println("oct");
	}
		else if(count[1].equals("12")){
			System.out.println("augest");
	}
		
	}
}
