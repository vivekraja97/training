package com.cg.corejava.inheritance;

import java.util.Scanner;

public class Transacation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Withdraw w =new Withdraw ();
		Scanner sc = new Scanner(System.in);
		System.out.println("Account Type:");
		String accounttype = sc.next();
		w.getAccounttype();
		System.out.println("Accountholdername:");
		String accountholdername = sc.next();
		w.getAccountholdername();
		System.out.println("deposite Amount:");
		double amount= sc.nextDouble();
		w.updateBalance(amount);
		w.showBalance();
		System.out.println("Withdraw Amount:");
		double amount2 =  sc.nextDouble();
		w.updateBalance(amount2);
		w.showBalance();
		}

}
