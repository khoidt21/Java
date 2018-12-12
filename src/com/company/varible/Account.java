package com.company.varible;

public class Account {
	
	private int accountNumber;
	private String customerName;
	private int balance;
	private static int count = 0; 
	
	public Account(int accountNumber, String customerName, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
		count = count + 1;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Account.count = count;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void withdraw(int amount) {
		int temp = this.balance - amount;
		this.balance = temp;
	}
}
