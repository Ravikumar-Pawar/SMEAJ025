package com.BankAtm;

import java.util.Scanner;

public class AccountHolder implements Runnable {
	private Account account;
	
	public AccountHolder(Account account) {
		this.account = account;
	}
	
	public synchronized boolean validPin() {
		Scanner sc = new Scanner(System.in);
		int attempts = 3;
		while (attempts > 0) {
			System.out.println("Enter Pin for "+ Thread.currentThread().getName());
			int pin = sc.nextInt();			
			if (pin == account.getAccountPin()) {
				sc.close();
				return true;
			}
			attempts--;			
			if (attempts > 0)
				System.out.println("Incorrect PIN. You have only " + attempts + " attempt(s) left.");
		}
		sc.close();
		System.out.println("All attempts exhausted. Try after 24 hours!");
		
		return false;
	}

	
	
	private synchronized void  MakeWithdrawal(int with_amount) {
		if(account.getBalance()>=with_amount) {
			System.out.println(Thread.currentThread().getName()+" is going to withdraw Rs: "+with_amount );
			
			try {
				Thread.sleep(3000);	
			}
			catch (InterruptedException e) {				
				
			}
			account.withdraw(with_amount);
			System.out.println(Thread.currentThread().getName() +" Completed withdrawal Of Rs: "+with_amount);
			
		}
		else {
			System.out.println("Sorry! Not Enough Balance for "+ Thread.currentThread().getName()+" to withdraw "+ account.getBalance());
		}
	}
    
	private synchronized void Deposit(int depst_amount) {
			System.out.println(Thread.currentThread().getName()+" is going to deposit Rs: "+depst_amount );
			
			try {
				Thread.sleep(3000);	
			}
			catch (InterruptedException e) {				
				
			}
			account.deposit(depst_amount);
			System.out.println(Thread.currentThread().getName() +" Completed deposition Of Rs: "+depst_amount);
			

	}
 
	private synchronized void CheckBalance() {
			try {
				Thread.sleep(3000);	
			}
			catch (InterruptedException e) {				
				
			}
			int curBalance=account.getBalance();
			System.out.println(Thread.currentThread().getName() +" Current balance is Rs: "+curBalance);
	}

	
	
	public void run()
	{
		
		Scanner sc = new Scanner(System.in);
		boolean forExit = true;		
		
		if (validPin()) {
		
		while(forExit) {
			System.out.println("MENU\n1.Withdraw\n2.Deposit\n3.CheckBalance\n4.Exit");
			int inp=sc.nextInt();
			
			
			switch(inp) {
			case 1:
				System.out.println("Enter the withdraw amount");
				MakeWithdrawal(sc.nextInt());
				break;
			
			case 2:
				System.out.println("Enter the deposit amount");
				Deposit(sc.nextInt());
				break;
			
			case 3:
				CheckBalance();
				break;
				
			case 4:
				forExit = false;
				
			}
		}
		sc.close();
		
	}
		else {	
		sc.close();
		return;
	}

	}
	
	

}
