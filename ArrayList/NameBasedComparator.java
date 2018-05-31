package com.cg.corejava.ArrayList;

import java.util.Comparator;

public class NameBasedComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Product p1 = (Product) o1;
		Product p2 = (Product) o2;
		return p1.getName().compareTo(p2.getName());
	}}
