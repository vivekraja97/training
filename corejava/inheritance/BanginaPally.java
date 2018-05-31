package com.cg.corejava.inheritance;

public class BanginaPally extends Mango {
	
	public void calculatePrice(){
		if (getFruitname().equals("banginapally")){
			System.out.println("calculatePrice for banginapally :"+" "+getQuantity()*getPrice());	
	}else{
		super.calculatePrice();
	}
}
}
