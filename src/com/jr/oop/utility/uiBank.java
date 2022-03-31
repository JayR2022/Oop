package com.jr.oop.utility;

import com.jr.oop.encapsulation.Bank;

public class uiBank {
	
	public uiBank() {
		// default constructor
	}
	
	public void run() {
		Bank newBank = new Bank();
		uiMsg(newBank);
	}
	
	
	public void uiMsg(Bank newBank) {
		
		System.out.println("=======================");
		System.out.println("Account Summary");
		System.out.println("=======================");
		System.out.println("Bank name: "+Bank.bankName);
		System.out.println("Account nuumber: "+newBank.getAccountNumber());
		System.out.println("Sort Code :"+ newBank.getSortCode());
		System.out.println("Balance :"+ newBank.getBalance());
		
	}
	


}
