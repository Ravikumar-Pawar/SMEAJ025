package com.BankAtm;

import java.util.*;

public class AccountHolder implements Runnable {
	private Account account;
	Scanner input=new Scanner(System.in);
	public AccountHolder(Account account) {
		this.account = account;
	}
	
	
	
	private synchronized void  Menu() {
		while(true) {
		System.out.println("Enter your choice");
		System.out.println("1.Create Account");
		System.out.println("2.Withdraw");
		System.out.println("3.Deposit");
		System.out.println("4.Exit");
		int n=input.nextInt();
		switch(n) {
		case 1:
			account.createaccount();
			
			break;
		case 2:
			account.withdraw();
			break;
		case 3:
			account.deposit();
			break;
		case 4:
			System.exit(0);
		}
			
		
	}
	}

	
	
	public void run()
	{
		Menu();
	}
	
	
	

}
