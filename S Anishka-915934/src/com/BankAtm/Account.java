package com.BankAtm;

public class Account {
	
	private int balance;
	private String accountPin="1234567890";
	
	public int getBalance()
	{
		return balance;
	}
	
	
	public void withdraw(int amount)
	{
		setBalance(balance - amount);
	}


	public String getAccountPin() {
		return accountPin;
	}


	public void setAccountPin(String accountPin) {
		this.accountPin = accountPin;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
		

}
