package com.cd.corejava.polymorphism;

public class Poly {
	static int add(int x,int y){
		return x+y;
	}
	static double add(float x,float y){
		return x+y;
	}
	String fullname(String firstname,String lastname){
		return firstname+lastname;
	}
	String fullname(String firstname,String middlename,String lastname){
		return firstname+middlename+lastname;
	}
	
	int add(int i,int j,int k){
		return i+j+k;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly p = new Poly();
		System.out.println(add(9,5));
		System.out.println(add(2.0f,5.0f));
		System.out.println(p.fullname("vivek","raja"));
		System.out.println(p.fullname("vivek","raja","ganeshan"));
		
	}

}
