package com.cg.corejava.inheritance;

public class Mango extends Fruit {
	private int quantity;
	private float price;
	public void calculatePrice(){
		System.out.println("Total is  Price:"+" "+quantity*price);
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return getFruitname() +" "+ quantity +" " +  price ;
	}
	
}
