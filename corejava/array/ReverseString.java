package com.cg.corejava.array;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String word;
		System.out.print("Enter a word:");
		word=sc.next();
		for(int i=word.length()-1;i>=0;i--){
		char letter= word.charAt(i);
		System.out.print(letter);
	}

}
}
