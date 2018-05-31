package com.cg.corejava.exceptions;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KidUsers k = new KidUsers();
		k.age1 = 10;
		k.age2 =18;
		k.registerAccount();
		k.bookType="Kids";
		k.requestBook();
		AdultUser a = new AdultUser();
		a.age1=10;
		a.age2=18;
		a.registerAccount();
		a.bookType="Fiction";
		a.requestBook();
	}
}
