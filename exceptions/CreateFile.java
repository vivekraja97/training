package com.cg.corejava.exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("vivek.txt",true);
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter Content to the file");
			String v = sc.nextLine();
			byte b[] = v.getBytes();
			fos.write(b);
			System.out.println("file Created or content inserted");
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}

}
