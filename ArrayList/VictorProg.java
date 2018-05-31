package com.cg.corejava.ArrayList;

import java.util.Vector;

public class VictorProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Double> v = new Vector();
		v.add(12.00);
		v.add(5148.002);
		v.add(84590.10);
		System.out.println(v);
		double sum =1;
		for(int i =0;i<v.size();i++){
			sum=sum+v.get(i);
			System.out.println(sum);
	}

}
}