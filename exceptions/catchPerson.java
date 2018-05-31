package com.cg.corejava.exceptions;

public class catchPerson  {
	public static void getPension(int age,double salary) throws InvalidAgeException{
		if(age>60){
			System.out.println(salary*30/100);
		}else{
			throw new InvalidAgeException("age<60");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			getPension(58,50000);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
