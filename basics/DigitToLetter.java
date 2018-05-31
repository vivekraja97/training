package com.cg.basics;

import java.util.Scanner;

public class DigitToLetter {
	public void convertDigitLetter(int a){
		if (a>=1 && a<=10){
			switch(a){
			case 1 :
				System.out.println("jan 31 days");
				break;
			case 2 :
				System.out.println("Feb 28 days");
				break;
			case 3 :
				System.out.println("March 31 days");
				break;
			case 4 :
				System.out.println("April 30 days");
				break;
			case 5 :
				System.out.println("May 31 days");
				break;
			case 6 :
				System.out.println("Jun 30 days");
				break;
			case 7 :
				System.out.println("July 31 days");
				break;
			case 8 :
				System.out.println("Augest 31 days");
				break;
			case 9 :
				System.out.println("September 30 0days");
				break;
			case 10 :
				System.out.println("October 31  days");
				break;
			case 11 :
				System.out.println("November 30 days");
				break;
			case 12 :
				System.out.println("December 31 days");
				break;
			default:
				System.out.println("Invalid");
			}
			
		}
		else{
			System.out.println("Invalid");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		number = sc.nextInt();
		DigitToLetter d = new DigitToLetter();
		d.convertDigitLetter(number);
		
		
	}

}
