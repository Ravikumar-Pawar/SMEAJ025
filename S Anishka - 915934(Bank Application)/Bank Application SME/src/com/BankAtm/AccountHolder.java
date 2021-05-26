package com.BankAtm;

import java.util.Scanner;

public class AccountHolder implements Runnable {
	private Account account;
	
	public AccountHolder(Account account) {
		this.account = account;
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
			System.out.println("Updated Balance is: " + account.getBalance());
			
		}
		else {
			System.out.println("Sorry! Not Enough Balance for "+ Thread.currentThread().getName()+" to withdraw \nCurrent Balance is: "+ account.getBalance());
		}
	}
	
	private synchronized void makeDeposit(int depositAmount) {
		System.out.println(Thread.currentThread().getName()+" is going to deposit Rs: "+ depositAmount );
		
		try {
			Thread.sleep(3000);	
		}
		catch (InterruptedException e) {				
			
		}
		
		account.setBalance(account.getBalance() + depositAmount);
		System.out.println(Thread.currentThread().getName() +" Completed deposit Of Rs: " + depositAmount);
		System.out.println("Updated balance is: " + account.getBalance());
	}
	
	
	
	public void run()
	{
		
		Scanner sc = new Scanner(System.in);
		boolean forExit = true;
		
		Menu menu =  new Menu(account);
		menu.greet();
		
		if (!menu.validatePin()) {
			return;
		}
		
		while(forExit) {
			
			int operation = menu.enter();
			
			switch(operation) {
			case 1:
				System.out.println("Enter the amount to be withdrawn");
				MakeWithdrawal(sc.nextInt());
				break;
			
			case 2:
				System.out.println("Enter the amount to be deposited");
				makeDeposit(sc.nextInt());
				break;
			
			case 3:
				System.out.println("Your balance is " + account.getBalance());
				break;
				
			case 4:
				forExit = false;
				
			}
		}
		
	}



	

}
