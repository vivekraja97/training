package com.cg.corejava.exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TryFinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		try{
			String s = br.readLine();
			int a = Integer.parseInt(s);
		}finally{
			System.out.println("wow");
		}
		
	}

}
