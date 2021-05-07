package com.BankAtm;

import java.util.Scanner;

public class Menu {

	private Account account;

	public Menu(Account account) {
		this.account = account;
	}

	public void greet() {

		System.out.println("Hello " + Thread.currentThread().getName());
	}

	public int enter() {

		Scanner sc = new Scanner(System.in);

		System.out.println("MENU\n1.Withdraw\n2.Deposit\n3.CheckBalance\n4.Exit");

		int operation = Integer.parseInt(sc.nextLine());

		return operation;

	}

	public synchronized boolean validatePin() {

		Scanner sc = new Scanner(System.in);
		int attempts = 3;

		while (attempts > 0) {
			System.out.println("Enter PIN");
			int pin = Integer.parseInt(sc.nextLine());
			if (pin == account.getAccountPin()) {
				return true;
			}
			attempts--;

			if (attempts > 0)
				System.out.println("Incorrect PIN. You have only " + attempts + " attempt(s) left.");
		}

		System.out.println("All attempts exhausted. Try after 24 hours!\n");
		return false;
	}

}
