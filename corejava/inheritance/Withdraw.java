package com.cg.corejava.inheritance;

public class Withdraw extends Deposite{
		public void updateBalance(double amount){
			if (amount>getAccountbalance()){
			super.updateBalance(amount);
			}else{               
			setAccountbalance(getAccountbalance()-amount);
			}
		}
}
