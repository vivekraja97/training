package com.cg.corejava.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			String s = br.readLine();
			int num = Integer.parseInt(s);
			System.out.println(num*num);
		}catch (IOException ie){
			System.out.println(ie);
			
		}finally{
			System.out.println("finally block");
		}
	}

}
