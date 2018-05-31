package com.cg.corejava.inheritance;

public class Deposite extends BankAccount{
	public void updateBalance(double amount){
		setAccountbalance(getAccountbalance()+ amount);
		
	}
}
