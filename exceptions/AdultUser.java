package com.cg.corejava.exceptions;

public class AdultUser implements LibraryUser {
	int age1,age2;
	String bookType;
	
public void registerAccount(){
		if(age1>12){
			System.out.println("You have successfully registered under an Adult Account");
		}else{
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
		if(age2>12){
			System.out.println("You have successfully registered under an Adult Account");
		}else{
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
		
	}
	public void requestBook(){
		if(bookType.equals("Kids")){
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}else{
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
		
}
}

