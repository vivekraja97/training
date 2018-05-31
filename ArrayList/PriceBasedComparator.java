package com.cg.corejava.ArrayList;

import java.util.Comparator;

public class PriceBasedComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Product p1 = (Product) o1;
		Product p2 = (Product) o2;
		if(p1.getPid()>p2.getPid()){
			return 1;
		}else if (p1.getPid()<p2.getPid()){
			return -1;
		}else{
			return 0;
		}
	}
	
}
