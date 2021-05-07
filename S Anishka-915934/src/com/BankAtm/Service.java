package com.BankAtm;

import java.util.Scanner;

public class Service {

	private Account account;

	public Service(Account account) {
		this.account = account;
	}
	
	public void name() {
		
		System.out.println(Thread.currentThread().getName());
	}

	public synchronized int enter() {

		Scanner sc = new Scanner(System.in);

		System.out.println("MENU\n1.Withdraw\n2.Deposit\n3.CheckBalance\n4.Exit");
		return sc.nextInt();

	}

	public synchronized boolean validatePin() {

		Scanner sc = new Scanner(System.in);
		

		while (true) {
			System.out.println("Enter 10 digit pin");
			String p = sc.next();
			String atmpin = account.getAccountPin();
			if((atmpin.equals(p)))
				return  true;
			System.out.println("The pin is incorrect!!! ");
		
			}

}
}
