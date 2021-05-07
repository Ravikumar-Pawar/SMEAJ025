package com.BankAtm;

public class Account {
	
	private int balance = 10000;

	
	public int getBalance()
	{
		return balance;
	}
	public void deposit(int amount) {
		balance+=amount;
	}
	public void withdraw(int amount)
	{
		balance = balance - amount;
	}
	public int getAccountPin() {
		return accountPin;
	}
}
