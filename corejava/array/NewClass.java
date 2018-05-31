package com.cg.corejava.array;

public class NewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		System.out.println(s);
		s=s.concat("frds");
		StringBuffer sb = new StringBuffer();
		sb.append("cool");
		System.out.println(sb.reverse());
		s =sb.toString();
		System.out.println(s);
	}

}
