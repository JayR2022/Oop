package com.jr.oop.encapsulation;

public class Bank {
	
	private float balance = 105.89f;
	private int sortCode = 102312;
	private int accountNumber = 12345678;
	public static final String bankName = "Natwest";
	
	
	public int getSortCode() {
		return sortCode;
	}
	public void setSortCode(int sortCode) {
		this.sortCode = sortCode;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public float getBalance() {
		return balance;
	}
	public static String getBankname() {
		return bankName;
	}
	
	
}
