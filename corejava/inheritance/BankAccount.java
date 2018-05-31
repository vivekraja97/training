package com.cg.corejava.inheritance;

public class BankAccount {
	private String accounttype,accountholdername;
	private double accountbalance=0;
	
	public void showBalance(){
		
		System.out.println("Available Balance:"+accountbalance);
		}
	
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public String getAccountholdername() {
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}
	public double getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(double accountbalance) {
		this.accountbalance = accountbalance;
	}

}
