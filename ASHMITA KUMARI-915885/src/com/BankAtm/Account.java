package com.BankAtm;

public class Account {

	private int balance;
	private int accountPin = 1234;

	public int getBalance() {
		return balance;
	}

	public void withdraw(int amount) {
		setBalance(balance - amount);
	}

	public int getAccountPin() {
		return accountPin;
	}

	public void setAccountPin(int accountPin) {
		this.accountPin = accountPin;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
