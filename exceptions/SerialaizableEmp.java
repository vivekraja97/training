package com.cg.corejava.exceptions;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerialaizableEmp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("super.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try {
			Employee e = null;
			while((e = (Employee)ois.readObject()) != null){
				System.out.println(e);
			}
		} catch (Exception e) {}	
	}

}
