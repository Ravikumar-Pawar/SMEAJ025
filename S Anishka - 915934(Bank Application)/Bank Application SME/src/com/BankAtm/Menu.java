package com.BankAtm;

import java.util.Scanner;

public class Menu {

	private Account account;

	public Menu(Account account) {
		this.account = account;
	}
	
	public void greet() {
		
		System.out.println("Hi " + Thread.currentThread().getName());
	}

	public synchronized int enter() {

		Scanner sc = new Scanner(System.in);

		System.out.println("MENU\n1.Withdraw\n2.Deposit\n3.CheckBalance\n4.Exit");
		return sc.nextInt();

	}

	public synchronized boolean validatePin() {

		Scanner sc = new Scanner(System.in);
	

		while (true) {
			System.out.println("Enter PIN");
			int pin = sc.nextInt();
			if (pin == account.getAccountPin()) {
				return true;
			}
			
	}

}
}
