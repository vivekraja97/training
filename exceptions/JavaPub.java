package com.cg.corejava.exceptions;

public class JavaPub {
	public static void validateCustomerAge(int age) throws InvalidAgeException{
		if (age>25){
			System.out.println("Welcome");
		}else{
			throw new InvalidAgeException("age>=25");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validateCustomerAge(22);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		
	}

}
