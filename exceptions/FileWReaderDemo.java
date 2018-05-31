package com.cg.corejava.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

	public class FileWReaderDemo {
		public static void main(String[] args) {
			try {
				FileReader fr = new FileReader("vivek.txt");
				int c;
				while ((c = fr.read()) !=-1){
				System.out.print((char)c);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
