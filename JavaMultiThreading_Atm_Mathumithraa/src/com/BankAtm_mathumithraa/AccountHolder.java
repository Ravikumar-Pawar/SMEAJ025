package com.BankAtm;

import java.util.*;



public class AccountHolder implements Runnable {
	private Account account;
	
	public AccountHolder(Account account) {
		this.account = account;
	}
	
	Scanner sc = new Scanner(System.in);
	
	/**private synchronized void  MakeWithdrawal(int with_amount) {
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
	
	private synchronized void deposit(int bal) {
	    try {
	        int balance = 0;
			if (bal > 0) {
	            System.out.println(Thread.currentThread().getName() + " " + " is try to deposit");
	            try {
	                Thread.sleep(100);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	            balance = balance + bal;
	            System.out.println(Thread.currentThread().getName() + " " + "is complete the deposit");
	        } else {
	            System.out.println(Thread.currentThread().getName() + " " + "doesn't have enough money for deposit");
	        }
	        System.out.println(Thread.currentThread().getName() + " " + " deposit Rs." + balance);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}   
	*/
	
	private synchronized void  Menu() {
		System.out.println("Enter your choice");
		System.out.println("1.Create Account");
		System.out.println("2.Withdraw");
		System.out.println("3.Deposit");
		System.out.println("4.Exit");
		
		int key=sc.nextInt();
		switch(key) {
		case 1:
			account.accountCreate();
			
			break;
		case 2:
			account.pinValidate();
			account.MakeWithdrawal();
			break;
		case 3:
			account.pinValidate();
			account.deposit();
			break;
		case 4:
			System.exit(0);
		}
	}
	
	public void run()
	{
		Menu();
	}
	
	
	

}
