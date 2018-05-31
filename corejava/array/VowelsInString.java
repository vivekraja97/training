package com.cg.corejava.array;

import java.util.Scanner;

public class VowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word;
		int count=0;
		System.out.println("enter a word");
		word= sc.next().toLowerCase();
		for(int i=0;i<word.length();i++){
			char letter= word.charAt(i);
			if(letter=='a' || letter=='e' || letter=='i'|| letter=='o'|| letter=='u'){
				System.out.println(letter+" " );
				count = count+1;		
		}
	}System.out.print(count);
}
}