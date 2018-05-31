package com.cg.corejava.inheritance;

public class Fruit {
	private String fruitname;

	public String getFruitname() {
		return fruitname;
	}

	public void setFruitname(String fruitname) {
		this.fruitname = fruitname;
	}

	@Override
	public String toString() {
		return fruitname;
	}
	
}
