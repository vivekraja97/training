package com.cg.corejava.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo {
	int  doSum(int a,int b){
		return a+b;
	}
	int  doSub(int a,int b){
		return a-b;
	}
	int  doDivision(int a,int b){
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		String name;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			name=br.readLine();
			a = Integer.parseInt(br.readLine());
			b = Integer.parseInt(br.readLine());
			ExceptionDemo ed = new ExceptionDemo();
			System.out.println(ed.doDivision(a,b));
		}catch(IOException ie){
			System.out.println(ie); 
		}	
		}
	}
